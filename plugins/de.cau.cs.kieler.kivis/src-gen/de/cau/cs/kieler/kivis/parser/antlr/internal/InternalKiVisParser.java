package de.cau.cs.kieler.kivis.parser.antlr.internal; 

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
import de.cau.cs.kieler.kivis.services.KiVisGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKiVisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_HOSTCODE", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'image'", "':'", "'animate'", "'{'", "'}'", "'perform'", "'on'", "'if'", "'from'", "'='", "'simulation'", "'('", "','", "')'", "'()'", "'apply'", "'using'", "'value'", "'is'", "'&&'", "'others'", "'.'", "'-'", "'model'", "'compiler'", "'process'", "'template'", "'wrapper'", "'['", "']'", "'schedule'", "'||'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'*'", "'/'", "'%'", "'\\''", "'extern'", "'!'", "'_'", "'@'", "'#'", "'click'", "'mousedown'", "'mouseup'", "'mousemove'", "'step'", "'stop'", "'pause'", "'play'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'val'", "'?'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
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
    public static final int RULE_HOSTCODE=8;
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
    public static final int RULE_STRING=4;
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


        public InternalKiVisParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKiVisParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKiVisParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKiVis.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KiVisGrammarAccess grammarAccess;
     	
        public InternalKiVisParser(TokenStream input, KiVisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VisualizationConfiguration";	
       	}
       	
       	@Override
       	protected KiVisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVisualizationConfiguration"
    // InternalKiVis.g:74:1: entryRuleVisualizationConfiguration returns [EObject current=null] : iv_ruleVisualizationConfiguration= ruleVisualizationConfiguration EOF ;
    public final EObject entryRuleVisualizationConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualizationConfiguration = null;


        try {
            // InternalKiVis.g:75:2: (iv_ruleVisualizationConfiguration= ruleVisualizationConfiguration EOF )
            // InternalKiVis.g:76:2: iv_ruleVisualizationConfiguration= ruleVisualizationConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualizationConfigurationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVisualizationConfiguration=ruleVisualizationConfiguration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualizationConfiguration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisualizationConfiguration"


    // $ANTLR start "ruleVisualizationConfiguration"
    // InternalKiVis.g:83:1: ruleVisualizationConfiguration returns [EObject current=null] : ( (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) )? ( ( (lv_elements_3_0= ruleElement ) ) | ( (lv_interactions_4_0= ruleInteraction ) ) )* ) ;
    public final EObject ruleVisualizationConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_image_2_0=null;
        EObject lv_elements_3_0 = null;

        EObject lv_interactions_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:86:28: ( ( (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) )? ( ( (lv_elements_3_0= ruleElement ) ) | ( (lv_interactions_4_0= ruleInteraction ) ) )* ) )
            // InternalKiVis.g:87:1: ( (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) )? ( ( (lv_elements_3_0= ruleElement ) ) | ( (lv_interactions_4_0= ruleInteraction ) ) )* )
            {
            // InternalKiVis.g:87:1: ( (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) )? ( ( (lv_elements_3_0= ruleElement ) ) | ( (lv_interactions_4_0= ruleInteraction ) ) )* )
            // InternalKiVis.g:87:2: (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) )? ( ( (lv_elements_3_0= ruleElement ) ) | ( (lv_interactions_4_0= ruleInteraction ) ) )*
            {
            // InternalKiVis.g:87:2: (otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKiVis.g:87:4: otherlv_0= 'image' otherlv_1= ':' ( (lv_image_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVisualizationConfigurationAccess().getImageKeyword_0_0());
                          
                    }
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getVisualizationConfigurationAccess().getColonKeyword_0_1());
                          
                    }
                    // InternalKiVis.g:95:1: ( (lv_image_2_0= RULE_STRING ) )
                    // InternalKiVis.g:96:1: (lv_image_2_0= RULE_STRING )
                    {
                    // InternalKiVis.g:96:1: (lv_image_2_0= RULE_STRING )
                    // InternalKiVis.g:97:3: lv_image_2_0= RULE_STRING
                    {
                    lv_image_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_image_2_0, grammarAccess.getVisualizationConfigurationAccess().getImageSTRINGTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualizationConfigurationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"image",
                              		lv_image_2_0, 
                              		"de.cau.cs.kieler.annotations.Annotations.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKiVis.g:113:4: ( ( (lv_elements_3_0= ruleElement ) ) | ( (lv_interactions_4_0= ruleInteraction ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }
                else if ( (LA2_0==22) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKiVis.g:113:5: ( (lv_elements_3_0= ruleElement ) )
            	    {
            	    // InternalKiVis.g:113:5: ( (lv_elements_3_0= ruleElement ) )
            	    // InternalKiVis.g:114:1: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalKiVis.g:114:1: (lv_elements_3_0= ruleElement )
            	    // InternalKiVis.g:115:3: lv_elements_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisualizationConfigurationAccess().getElementsElementParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisualizationConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKiVis.g:132:6: ( (lv_interactions_4_0= ruleInteraction ) )
            	    {
            	    // InternalKiVis.g:132:6: ( (lv_interactions_4_0= ruleInteraction ) )
            	    // InternalKiVis.g:133:1: (lv_interactions_4_0= ruleInteraction )
            	    {
            	    // InternalKiVis.g:133:1: (lv_interactions_4_0= ruleInteraction )
            	    // InternalKiVis.g:134:3: lv_interactions_4_0= ruleInteraction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisualizationConfigurationAccess().getInteractionsInteractionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_interactions_4_0=ruleInteraction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisualizationConfigurationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"interactions",
            	              		lv_interactions_4_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.Interaction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleVisualizationConfiguration"


    // $ANTLR start "entryRuleElement"
    // InternalKiVis.g:158:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalKiVis.g:159:2: (iv_ruleElement= ruleElement EOF )
            // InternalKiVis.g:160:2: iv_ruleElement= ruleElement EOF
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
    // InternalKiVis.g:167:1: ruleElement returns [EObject current=null] : (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_animations_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:170:28: ( (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' ) )
            // InternalKiVis.g:171:1: (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' )
            {
            // InternalKiVis.g:171:1: (otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}' )
            // InternalKiVis.g:171:3: otherlv_0= 'animate' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_animations_3_0= ruleAnimation ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementAccess().getAnimateKeyword_0());
                  
            }
            // InternalKiVis.g:175:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalKiVis.g:176:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKiVis.g:176:1: (lv_name_1_0= RULE_ID )
            // InternalKiVis.g:177:3: lv_name_1_0= RULE_ID
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
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getElementAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKiVis.g:197:1: ( (lv_animations_3_0= ruleAnimation ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKiVis.g:198:1: (lv_animations_3_0= ruleAnimation )
            	    {
            	    // InternalKiVis.g:198:1: (lv_animations_3_0= ruleAnimation )
            	    // InternalKiVis.g:199:3: lv_animations_3_0= ruleAnimation
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
            	              		"de.cau.cs.kieler.kivis.KiVis.Animation");
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInteraction"
    // InternalKiVis.g:227:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalKiVis.g:228:2: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalKiVis.g:229:2: iv_ruleInteraction= ruleInteraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteraction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalKiVis.g:236:1: ruleInteraction returns [EObject current=null] : ( () otherlv_1= 'perform' (otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_event_3_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:239:28: ( ( () otherlv_1= 'perform' (otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? ) )
            // InternalKiVis.g:240:1: ( () otherlv_1= 'perform' (otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? )
            {
            // InternalKiVis.g:240:1: ( () otherlv_1= 'perform' (otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? )
            // InternalKiVis.g:240:2: () otherlv_1= 'perform' (otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) ) )? otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )?
            {
            // InternalKiVis.g:240:2: ()
            // InternalKiVis.g:241:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInteractionAccess().getInteractionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getPerformKeyword_1());
                  
            }
            // InternalKiVis.g:253:1: (otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKiVis.g:253:3: otherlv_2= 'on' ( (lv_event_3_0= ruleEvent ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getOnKeyword_2_0());
                          
                    }
                    // InternalKiVis.g:257:1: ( (lv_event_3_0= ruleEvent ) )
                    // InternalKiVis.g:258:1: (lv_event_3_0= ruleEvent )
                    {
                    // InternalKiVis.g:258:1: (lv_event_3_0= ruleEvent )
                    // InternalKiVis.g:259:3: lv_event_3_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractionAccess().getEventEventParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_event_3_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_3_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.Event");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiVis.g:279:1: ( (lv_actions_5_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=69 && LA5_0<=72)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalKiVis.g:280:1: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalKiVis.g:280:1: (lv_actions_5_0= ruleAction )
            	    // InternalKiVis.g:281:3: lv_actions_5_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInteractionAccess().getActionsActionParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"actions",
            	              		lv_actions_5_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.Action");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5());
                  
            }
            // InternalKiVis.g:301:1: (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiVis.g:301:3: otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) )
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInteractionAccess().getIfKeyword_6_0());
                          
                    }
                    // InternalKiVis.g:305:1: ( (lv_condition_8_0= ruleAndExpression ) )
                    // InternalKiVis.g:306:1: (lv_condition_8_0= ruleAndExpression )
                    {
                    // InternalKiVis.g:306:1: (lv_condition_8_0= ruleAndExpression )
                    // InternalKiVis.g:307:3: lv_condition_8_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractionAccess().getConditionAndExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_condition_8_0=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_8_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.AndExpression");
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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleEvent"
    // InternalKiVis.g:331:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalKiVis.g:332:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalKiVis.g:333:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalKiVis.g:340:1: ruleEvent returns [EObject current=null] : ( ( (lv_event_0_0= ruleDOMEvent ) ) otherlv_1= 'from' ( (lv_element_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Enumerator lv_event_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:343:28: ( ( ( (lv_event_0_0= ruleDOMEvent ) ) otherlv_1= 'from' ( (lv_element_2_0= RULE_ID ) ) ) )
            // InternalKiVis.g:344:1: ( ( (lv_event_0_0= ruleDOMEvent ) ) otherlv_1= 'from' ( (lv_element_2_0= RULE_ID ) ) )
            {
            // InternalKiVis.g:344:1: ( ( (lv_event_0_0= ruleDOMEvent ) ) otherlv_1= 'from' ( (lv_element_2_0= RULE_ID ) ) )
            // InternalKiVis.g:344:2: ( (lv_event_0_0= ruleDOMEvent ) ) otherlv_1= 'from' ( (lv_element_2_0= RULE_ID ) )
            {
            // InternalKiVis.g:344:2: ( (lv_event_0_0= ruleDOMEvent ) )
            // InternalKiVis.g:345:1: (lv_event_0_0= ruleDOMEvent )
            {
            // InternalKiVis.g:345:1: (lv_event_0_0= ruleDOMEvent )
            // InternalKiVis.g:346:3: lv_event_0_0= ruleDOMEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventAccess().getEventDOMEventEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_event_0_0=ruleDOMEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"de.cau.cs.kieler.kivis.KiVis.DOMEvent");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getFromKeyword_1());
                  
            }
            // InternalKiVis.g:366:1: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:367:1: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:367:1: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:368:3: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_element_2_0, grammarAccess.getEventAccess().getElementIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"element",
                      		lv_element_2_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAction"
    // InternalKiVis.g:392:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalKiVis.g:393:2: (iv_ruleAction= ruleAction EOF )
            // InternalKiVis.g:394:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalKiVis.g:401:1: ruleAction returns [EObject current=null] : (this_VariableAssignment_0= ruleVariableAssignment | this_SimulationAction_1= ruleSimulationAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_VariableAssignment_0 = null;

        EObject this_SimulationAction_1 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:404:28: ( (this_VariableAssignment_0= ruleVariableAssignment | this_SimulationAction_1= ruleSimulationAction ) )
            // InternalKiVis.g:405:1: (this_VariableAssignment_0= ruleVariableAssignment | this_SimulationAction_1= ruleSimulationAction )
            {
            // InternalKiVis.g:405:1: (this_VariableAssignment_0= ruleVariableAssignment | this_SimulationAction_1= ruleSimulationAction )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=69 && LA7_0<=72)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiVis.g:406:2: this_VariableAssignment_0= ruleVariableAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getVariableAssignmentParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VariableAssignment_0=ruleVariableAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableAssignment_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:419:2: this_SimulationAction_1= ruleSimulationAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getActionAccess().getSimulationActionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimulationAction_1=ruleSimulationAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimulationAction_1; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalKiVis.g:438:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalKiVis.g:439:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalKiVis.g:440:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalKiVis.g:447:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleLiteral ) ) | ( (lv_function_3_0= ruleFunction ) ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_function_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:450:28: ( ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleLiteral ) ) | ( (lv_function_3_0= ruleFunction ) ) ) ) )
            // InternalKiVis.g:451:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleLiteral ) ) | ( (lv_function_3_0= ruleFunction ) ) ) )
            {
            // InternalKiVis.g:451:1: ( ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleLiteral ) ) | ( (lv_function_3_0= ruleFunction ) ) ) )
            // InternalKiVis.g:451:2: ( (lv_variable_0_0= ruleVariableReference ) ) otherlv_1= '=' ( ( (lv_value_2_0= ruleLiteral ) ) | ( (lv_function_3_0= ruleFunction ) ) )
            {
            // InternalKiVis.g:451:2: ( (lv_variable_0_0= ruleVariableReference ) )
            // InternalKiVis.g:452:1: (lv_variable_0_0= ruleVariableReference )
            {
            // InternalKiVis.g:452:1: (lv_variable_0_0= ruleVariableReference )
            // InternalKiVis.g:453:3: lv_variable_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getVariableVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_variable_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_0_0, 
                      		"de.cau.cs.kieler.kivis.KiVis.VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalKiVis.g:473:1: ( ( (lv_value_2_0= ruleLiteral ) ) | ( (lv_function_3_0= ruleFunction ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==28||LA8_1==31) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==21||LA8_1==45||(LA8_1>=69 && LA8_1<=72)) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING||(LA8_0>=RULE_INT && LA8_0<=RULE_FLOAT)||LA8_0==RULE_BOOLEAN||LA8_0==39||LA8_0==55) ) {
                alt8=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiVis.g:473:2: ( (lv_value_2_0= ruleLiteral ) )
                    {
                    // InternalKiVis.g:473:2: ( (lv_value_2_0= ruleLiteral ) )
                    // InternalKiVis.g:474:1: (lv_value_2_0= ruleLiteral )
                    {
                    // InternalKiVis.g:474:1: (lv_value_2_0= ruleLiteral )
                    // InternalKiVis.g:475:3: lv_value_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getValueLiteralParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:492:6: ( (lv_function_3_0= ruleFunction ) )
                    {
                    // InternalKiVis.g:492:6: ( (lv_function_3_0= ruleFunction ) )
                    // InternalKiVis.g:493:1: (lv_function_3_0= ruleFunction )
                    {
                    // InternalKiVis.g:493:1: (lv_function_3_0= ruleFunction )
                    // InternalKiVis.g:494:3: lv_function_3_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getFunctionFunctionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_function_3_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"function",
                              		lv_function_3_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.Function");
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
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleSimulationAction"
    // InternalKiVis.g:518:1: entryRuleSimulationAction returns [EObject current=null] : iv_ruleSimulationAction= ruleSimulationAction EOF ;
    public final EObject entryRuleSimulationAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationAction = null;


        try {
            // InternalKiVis.g:519:2: (iv_ruleSimulationAction= ruleSimulationAction EOF )
            // InternalKiVis.g:520:2: iv_ruleSimulationAction= ruleSimulationAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimulationActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimulationAction=ruleSimulationAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimulationAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulationAction"


    // $ANTLR start "ruleSimulationAction"
    // InternalKiVis.g:527:1: ruleSimulationAction returns [EObject current=null] : ( ( (lv_operation_0_0= ruleSimulationOperation ) ) otherlv_1= 'simulation' ) ;
    public final EObject ruleSimulationAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_operation_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:530:28: ( ( ( (lv_operation_0_0= ruleSimulationOperation ) ) otherlv_1= 'simulation' ) )
            // InternalKiVis.g:531:1: ( ( (lv_operation_0_0= ruleSimulationOperation ) ) otherlv_1= 'simulation' )
            {
            // InternalKiVis.g:531:1: ( ( (lv_operation_0_0= ruleSimulationOperation ) ) otherlv_1= 'simulation' )
            // InternalKiVis.g:531:2: ( (lv_operation_0_0= ruleSimulationOperation ) ) otherlv_1= 'simulation'
            {
            // InternalKiVis.g:531:2: ( (lv_operation_0_0= ruleSimulationOperation ) )
            // InternalKiVis.g:532:1: (lv_operation_0_0= ruleSimulationOperation )
            {
            // InternalKiVis.g:532:1: (lv_operation_0_0= ruleSimulationOperation )
            // InternalKiVis.g:533:3: lv_operation_0_0= ruleSimulationOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimulationActionAccess().getOperationSimulationOperationEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_operation_0_0=ruleSimulationOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimulationActionRule());
              	        }
                     		set(
                     			current, 
                     			"operation",
                      		lv_operation_0_0, 
                      		"de.cau.cs.kieler.kivis.KiVis.SimulationOperation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimulationActionAccess().getSimulationKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulationAction"


    // $ANTLR start "entryRuleFunction"
    // InternalKiVis.g:561:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalKiVis.g:562:2: (iv_ruleFunction= ruleFunction EOF )
            // InternalKiVis.g:563:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalKiVis.g:570:1: ruleFunction returns [EObject current=null] : ( ( (lv_functionName_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_functionName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:573:28: ( ( ( (lv_functionName_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKiVis.g:574:1: ( ( (lv_functionName_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKiVis.g:574:1: ( ( (lv_functionName_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKiVis.g:574:2: ( (lv_functionName_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKiVis.g:574:2: ( (lv_functionName_0_0= RULE_ID ) )
            // InternalKiVis.g:575:1: (lv_functionName_0_0= RULE_ID )
            {
            // InternalKiVis.g:575:1: (lv_functionName_0_0= RULE_ID )
            // InternalKiVis.g:576:3: lv_functionName_0_0= RULE_ID
            {
            lv_functionName_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_0_0, grammarAccess.getFunctionAccess().getFunctionNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_0_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiVis.g:592:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==31) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiVis.g:592:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKiVis.g:592:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')' )
                    // InternalKiVis.g:592:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalKiVis.g:596:1: ( (lv_parameters_2_0= ruleFunctionParameter ) )
                    // InternalKiVis.g:597:1: (lv_parameters_2_0= ruleFunctionParameter )
                    {
                    // InternalKiVis.g:597:1: (lv_parameters_2_0= ruleFunctionParameter )
                    // InternalKiVis.g:598:3: lv_parameters_2_0= ruleFunctionParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersFunctionParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_parameters_2_0=ruleFunctionParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_2_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.FunctionParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiVis.g:614:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==29) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalKiVis.g:614:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleFunctionParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:618:1: ( (lv_parameters_4_0= ruleFunctionParameter ) )
                    	    // InternalKiVis.g:619:1: (lv_parameters_4_0= ruleFunctionParameter )
                    	    {
                    	    // InternalKiVis.g:619:1: (lv_parameters_4_0= ruleFunctionParameter )
                    	    // InternalKiVis.g:620:3: lv_parameters_4_0= ruleFunctionParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersFunctionParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_parameters_4_0=ruleFunctionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_4_0, 
                    	              		"de.cau.cs.kieler.kivis.KiVis.FunctionParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:641:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                          
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleAnimation"
    // InternalKiVis.g:653:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalKiVis.g:654:2: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalKiVis.g:655:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalKiVis.g:662:1: ruleAnimation returns [EObject current=null] : (otherlv_0= 'apply' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_attributeMappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_variable_3_0 = null;

        EObject lv_attributeMappings_5_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:665:28: ( (otherlv_0= 'apply' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_attributeMappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? ) )
            // InternalKiVis.g:666:1: (otherlv_0= 'apply' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_attributeMappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? )
            {
            // InternalKiVis.g:666:1: (otherlv_0= 'apply' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_attributeMappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )? )
            // InternalKiVis.g:666:3: otherlv_0= 'apply' ( (lv_type_1_0= RULE_ID ) ) (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )? otherlv_4= '{' ( (lv_attributeMappings_5_0= ruleAttributeMapping ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getApplyKeyword_0());
                  
            }
            // InternalKiVis.g:670:1: ( (lv_type_1_0= RULE_ID ) )
            // InternalKiVis.g:671:1: (lv_type_1_0= RULE_ID )
            {
            // InternalKiVis.g:671:1: (lv_type_1_0= RULE_ID )
            // InternalKiVis.g:672:3: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_type_1_0, grammarAccess.getAnimationAccess().getTypeIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnimationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiVis.g:688:2: (otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiVis.g:688:4: otherlv_2= 'using' ( (lv_variable_3_0= ruleVariableReference ) )
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getUsingKeyword_2_0());
                          
                    }
                    // InternalKiVis.g:692:1: ( (lv_variable_3_0= ruleVariableReference ) )
                    // InternalKiVis.g:693:1: (lv_variable_3_0= ruleVariableReference )
                    {
                    // InternalKiVis.g:693:1: (lv_variable_3_0= ruleVariableReference )
                    // InternalKiVis.g:694:3: lv_variable_3_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnimationAccess().getVariableVariableReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_variable_3_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnimationRule());
                      	        }
                             		set(
                             			current, 
                             			"variable",
                              		lv_variable_3_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.VariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiVis.g:714:1: ( (lv_attributeMappings_5_0= ruleAttributeMapping ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKiVis.g:715:1: (lv_attributeMappings_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiVis.g:715:1: (lv_attributeMappings_5_0= ruleAttributeMapping )
            	    // InternalKiVis.g:716:3: lv_attributeMappings_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnimationAccess().getAttributeMappingsAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributeMappings_5_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnimationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributeMappings",
            	              		lv_attributeMappings_5_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_5());
                  
            }
            // InternalKiVis.g:736:1: (otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKiVis.g:736:3: otherlv_7= 'if' ( (lv_condition_8_0= ruleAndExpression ) )
                    {
                    otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAnimationAccess().getIfKeyword_6_0());
                          
                    }
                    // InternalKiVis.g:740:1: ( (lv_condition_8_0= ruleAndExpression ) )
                    // InternalKiVis.g:741:1: (lv_condition_8_0= ruleAndExpression )
                    {
                    // InternalKiVis.g:741:1: (lv_condition_8_0= ruleAndExpression )
                    // InternalKiVis.g:742:3: lv_condition_8_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnimationAccess().getConditionAndExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_condition_8_0=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnimationRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_8_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.AndExpression");
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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleAttributeMapping"
    // InternalKiVis.g:766:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // InternalKiVis.g:767:2: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // InternalKiVis.g:768:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
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
    // InternalKiVis.g:775:1: ruleAttributeMapping returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) ) ) ;
    public final EObject ruleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        Token lv_currentValue_2_0=null;
        Token otherlv_5=null;
        EObject lv_literal_3_0 = null;

        EObject lv_mappings_4_0 = null;

        EObject lv_mappings_6_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:778:28: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) ) ) )
            // InternalKiVis.g:779:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) ) )
            {
            // InternalKiVis.g:779:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) ) )
            // InternalKiVis.g:779:2: ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) )
            {
            // InternalKiVis.g:779:2: ( (lv_attribute_0_0= RULE_ID ) )
            // InternalKiVis.g:780:1: (lv_attribute_0_0= RULE_ID )
            {
            // InternalKiVis.g:780:1: (lv_attribute_0_0= RULE_ID )
            // InternalKiVis.g:781:3: lv_attribute_0_0= RULE_ID
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
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeMappingAccess().getColonKeyword_1());
                  
            }
            // InternalKiVis.g:801:1: ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalKiVis.g:801:2: ( (lv_currentValue_2_0= 'value' ) )
                    {
                    // InternalKiVis.g:801:2: ( (lv_currentValue_2_0= 'value' ) )
                    // InternalKiVis.g:802:1: (lv_currentValue_2_0= 'value' )
                    {
                    // InternalKiVis.g:802:1: (lv_currentValue_2_0= 'value' )
                    // InternalKiVis.g:803:3: lv_currentValue_2_0= 'value'
                    {
                    lv_currentValue_2_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_currentValue_2_0, grammarAccess.getAttributeMappingAccess().getCurrentValueValueKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeMappingRule());
                      	        }
                             		setWithLastConsumed(current, "currentValue", true, "value");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:817:6: ( (lv_literal_3_0= ruleLiteral ) )
                    {
                    // InternalKiVis.g:817:6: ( (lv_literal_3_0= ruleLiteral ) )
                    // InternalKiVis.g:818:1: (lv_literal_3_0= ruleLiteral )
                    {
                    // InternalKiVis.g:818:1: (lv_literal_3_0= ruleLiteral )
                    // InternalKiVis.g:819:3: lv_literal_3_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getLiteralLiteralParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_literal_3_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_3_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:836:6: ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* )
                    {
                    // InternalKiVis.g:836:6: ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* )
                    // InternalKiVis.g:836:7: ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )*
                    {
                    // InternalKiVis.g:836:7: ( (lv_mappings_4_0= ruleMapping ) )
                    // InternalKiVis.g:837:1: (lv_mappings_4_0= ruleMapping )
                    {
                    // InternalKiVis.g:837:1: (lv_mappings_4_0= ruleMapping )
                    // InternalKiVis.g:838:3: lv_mappings_4_0= ruleMapping
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_mappings_4_0=ruleMapping();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                      	        }
                             		add(
                             			current, 
                             			"mappings",
                              		lv_mappings_4_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.Mapping");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiVis.g:854:2: (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==29) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalKiVis.g:854:4: otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) )
                    	    {
                    	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getAttributeMappingAccess().getCommaKeyword_2_2_1_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:858:1: ( (lv_mappings_6_0= ruleMapping ) )
                    	    // InternalKiVis.g:859:1: (lv_mappings_6_0= ruleMapping )
                    	    {
                    	    // InternalKiVis.g:859:1: (lv_mappings_6_0= ruleMapping )
                    	    // InternalKiVis.g:860:3: lv_mappings_6_0= ruleMapping
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getMappingsMappingParserRuleCall_2_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_mappings_6_0=ruleMapping();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeMappingRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"mappings",
                    	              		lv_mappings_6_0, 
                    	              		"de.cau.cs.kieler.kivis.KiVis.Mapping");
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
    // InternalKiVis.g:884:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalKiVis.g:885:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalKiVis.g:886:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalKiVis.g:893:1: ruleMapping returns [EObject current=null] : ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variableDomain_0_0 = null;

        EObject lv_attributeDomain_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:896:28: ( ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) ) )
            // InternalKiVis.g:897:1: ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) )
            {
            // InternalKiVis.g:897:1: ( ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) ) )
            // InternalKiVis.g:897:2: ( (lv_variableDomain_0_0= ruleVariableDomain ) ) otherlv_1= 'is' ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )
            {
            // InternalKiVis.g:897:2: ( (lv_variableDomain_0_0= ruleVariableDomain ) )
            // InternalKiVis.g:898:1: (lv_variableDomain_0_0= ruleVariableDomain )
            {
            // InternalKiVis.g:898:1: (lv_variableDomain_0_0= ruleVariableDomain )
            // InternalKiVis.g:899:3: lv_variableDomain_0_0= ruleVariableDomain
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMappingAccess().getVariableDomainVariableDomainParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_24);
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
                      		"de.cau.cs.kieler.kivis.KiVis.VariableDomain");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getIsKeyword_1());
                  
            }
            // InternalKiVis.g:919:1: ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )
            // InternalKiVis.g:920:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
            {
            // InternalKiVis.g:920:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
            // InternalKiVis.g:921:3: lv_attributeDomain_2_0= ruleAttributeDomain
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
                      		"de.cau.cs.kieler.kivis.KiVis.AttributeDomain");
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


    // $ANTLR start "entryRuleAndExpression"
    // InternalKiVis.g:945:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalKiVis.g:946:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalKiVis.g:947:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalKiVis.g:954:1: ruleAndExpression returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:957:28: ( (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalKiVis.g:958:1: (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalKiVis.g:958:1: (this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalKiVis.g:959:2: this_Comparison_0= ruleComparison ( ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:970:1: ( ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalKiVis.g:970:2: ( () ( (lv_operator_2_0= '&&' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalKiVis.g:970:2: ( () ( (lv_operator_2_0= '&&' ) ) )
            	    // InternalKiVis.g:970:3: () ( (lv_operator_2_0= '&&' ) )
            	    {
            	    // InternalKiVis.g:970:3: ()
            	    // InternalKiVis.g:971:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalKiVis.g:979:2: ( (lv_operator_2_0= '&&' ) )
            	    // InternalKiVis.g:980:1: (lv_operator_2_0= '&&' )
            	    {
            	    // InternalKiVis.g:980:1: (lv_operator_2_0= '&&' )
            	    // InternalKiVis.g:981:3: lv_operator_2_0= '&&'
            	    {
            	    lv_operator_2_0=(Token)match(input,36,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_operator_2_0, grammarAccess.getAndExpressionAccess().getOperatorAmpersandAmpersandKeyword_1_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		setWithLastConsumed(current, "operator", lv_operator_2_0, "&&");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    // InternalKiVis.g:994:3: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalKiVis.g:995:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalKiVis.g:995:1: (lv_right_3_0= ruleComparison )
            	    // InternalKiVis.g:996:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.Comparison");
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalKiVis.g:1020:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalKiVis.g:1021:2: (iv_ruleComparison= ruleComparison EOF )
            // InternalKiVis.g:1022:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalKiVis.g:1029:1: ruleComparison returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( ( (lv_right_2_0= ruleLiteral ) ) | ( (lv_right_3_0= ruleVariableReference ) ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_relation_1_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1032:28: ( ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( ( (lv_right_2_0= ruleLiteral ) ) | ( (lv_right_3_0= ruleVariableReference ) ) ) ) )
            // InternalKiVis.g:1033:1: ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( ( (lv_right_2_0= ruleLiteral ) ) | ( (lv_right_3_0= ruleVariableReference ) ) ) )
            {
            // InternalKiVis.g:1033:1: ( ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( ( (lv_right_2_0= ruleLiteral ) ) | ( (lv_right_3_0= ruleVariableReference ) ) ) )
            // InternalKiVis.g:1033:2: ( (lv_left_0_0= ruleVariableReference ) ) ( (lv_relation_1_0= ruleCompareOperator ) ) ( ( (lv_right_2_0= ruleLiteral ) ) | ( (lv_right_3_0= ruleVariableReference ) ) )
            {
            // InternalKiVis.g:1033:2: ( (lv_left_0_0= ruleVariableReference ) )
            // InternalKiVis.g:1034:1: (lv_left_0_0= ruleVariableReference )
            {
            // InternalKiVis.g:1034:1: (lv_left_0_0= ruleVariableReference )
            // InternalKiVis.g:1035:3: lv_left_0_0= ruleVariableReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getLeftVariableReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_left_0_0=ruleVariableReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.cau.cs.kieler.kivis.KiVis.VariableReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiVis.g:1051:2: ( (lv_relation_1_0= ruleCompareOperator ) )
            // InternalKiVis.g:1052:1: (lv_relation_1_0= ruleCompareOperator )
            {
            // InternalKiVis.g:1052:1: (lv_relation_1_0= ruleCompareOperator )
            // InternalKiVis.g:1053:3: lv_relation_1_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonAccess().getRelationCompareOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_16);
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
                      		"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiVis.g:1069:2: ( ( (lv_right_2_0= ruleLiteral ) ) | ( (lv_right_3_0= ruleVariableReference ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred19_InternalKiVis()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_STRING||(LA17_0>=RULE_INT && LA17_0<=RULE_FLOAT)||LA17_0==RULE_BOOLEAN||LA17_0==39||LA17_0==55) ) {
                alt17=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiVis.g:1069:3: ( (lv_right_2_0= ruleLiteral ) )
                    {
                    // InternalKiVis.g:1069:3: ( (lv_right_2_0= ruleLiteral ) )
                    // InternalKiVis.g:1070:1: (lv_right_2_0= ruleLiteral )
                    {
                    // InternalKiVis.g:1070:1: (lv_right_2_0= ruleLiteral )
                    // InternalKiVis.g:1071:3: lv_right_2_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightLiteralParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_2_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1088:6: ( (lv_right_3_0= ruleVariableReference ) )
                    {
                    // InternalKiVis.g:1088:6: ( (lv_right_3_0= ruleVariableReference ) )
                    // InternalKiVis.g:1089:1: (lv_right_3_0= ruleVariableReference )
                    {
                    // InternalKiVis.g:1089:1: (lv_right_3_0= ruleVariableReference )
                    // InternalKiVis.g:1090:3: lv_right_3_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightVariableReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.VariableReference");
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleVariableDomain"
    // InternalKiVis.g:1114:1: entryRuleVariableDomain returns [EObject current=null] : iv_ruleVariableDomain= ruleVariableDomain EOF ;
    public final EObject entryRuleVariableDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDomain = null;


        try {
            // InternalKiVis.g:1115:2: (iv_ruleVariableDomain= ruleVariableDomain EOF )
            // InternalKiVis.g:1116:2: iv_ruleVariableDomain= ruleVariableDomain EOF
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
    // InternalKiVis.g:1123:1: ruleVariableDomain returns [EObject current=null] : ( ( (lv_otherValues_0_0= 'others' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) ) ;
    public final EObject ruleVariableDomain() throws RecognitionException {
        EObject current = null;

        Token lv_otherValues_0_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1126:28: ( ( ( (lv_otherValues_0_0= 'others' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) ) )
            // InternalKiVis.g:1127:1: ( ( (lv_otherValues_0_0= 'others' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) )
            {
            // InternalKiVis.g:1127:1: ( ( (lv_otherValues_0_0= 'others' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalKiVis.g:1127:2: ( (lv_otherValues_0_0= 'others' ) )
                    {
                    // InternalKiVis.g:1127:2: ( (lv_otherValues_0_0= 'others' ) )
                    // InternalKiVis.g:1128:1: (lv_otherValues_0_0= 'others' )
                    {
                    // InternalKiVis.g:1128:1: (lv_otherValues_0_0= 'others' )
                    // InternalKiVis.g:1129:3: lv_otherValues_0_0= 'others'
                    {
                    lv_otherValues_0_0=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_otherValues_0_0, grammarAccess.getVariableDomainAccess().getOtherValuesOthersKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDomainRule());
                      	        }
                             		setWithLastConsumed(current, "otherValues", true, "others");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1143:6: ( (lv_value_1_0= ruleLiteral ) )
                    {
                    // InternalKiVis.g:1143:6: ( (lv_value_1_0= ruleLiteral ) )
                    // InternalKiVis.g:1144:1: (lv_value_1_0= ruleLiteral )
                    {
                    // InternalKiVis.g:1144:1: (lv_value_1_0= ruleLiteral )
                    // InternalKiVis.g:1145:3: lv_value_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDomainAccess().getValueLiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDomainRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:1162:6: ( (lv_range_2_0= ruleInterval ) )
                    {
                    // InternalKiVis.g:1162:6: ( (lv_range_2_0= ruleInterval ) )
                    // InternalKiVis.g:1163:1: (lv_range_2_0= ruleInterval )
                    {
                    // InternalKiVis.g:1163:1: (lv_range_2_0= ruleInterval )
                    // InternalKiVis.g:1164:3: lv_range_2_0= ruleInterval
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDomainAccess().getRangeIntervalParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_range_2_0=ruleInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDomainRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_2_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.Interval");
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
    // InternalKiVis.g:1188:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalKiVis.g:1189:2: (iv_ruleInterval= ruleInterval EOF )
            // InternalKiVis.g:1190:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalKiVis.g:1197:1: ruleInterval returns [EObject current=null] : ( ( ( (lv_from_0_0= ruleSignedInt ) ) | ( (lv_from_1_0= ruleSignedFloat ) ) ) ruleRange ( ( (lv_to_3_0= ruleSignedInt ) ) | ( (lv_to_4_0= ruleSignedFloat ) ) ) ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        EObject lv_from_0_0 = null;

        EObject lv_from_1_0 = null;

        EObject lv_to_3_0 = null;

        EObject lv_to_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1200:28: ( ( ( ( (lv_from_0_0= ruleSignedInt ) ) | ( (lv_from_1_0= ruleSignedFloat ) ) ) ruleRange ( ( (lv_to_3_0= ruleSignedInt ) ) | ( (lv_to_4_0= ruleSignedFloat ) ) ) ) )
            // InternalKiVis.g:1201:1: ( ( ( (lv_from_0_0= ruleSignedInt ) ) | ( (lv_from_1_0= ruleSignedFloat ) ) ) ruleRange ( ( (lv_to_3_0= ruleSignedInt ) ) | ( (lv_to_4_0= ruleSignedFloat ) ) ) )
            {
            // InternalKiVis.g:1201:1: ( ( ( (lv_from_0_0= ruleSignedInt ) ) | ( (lv_from_1_0= ruleSignedFloat ) ) ) ruleRange ( ( (lv_to_3_0= ruleSignedInt ) ) | ( (lv_to_4_0= ruleSignedFloat ) ) ) )
            // InternalKiVis.g:1201:2: ( ( (lv_from_0_0= ruleSignedInt ) ) | ( (lv_from_1_0= ruleSignedFloat ) ) ) ruleRange ( ( (lv_to_3_0= ruleSignedInt ) ) | ( (lv_to_4_0= ruleSignedFloat ) ) )
            {
            // InternalKiVis.g:1201:2: ( ( (lv_from_0_0= ruleSignedInt ) ) | ( (lv_from_1_0= ruleSignedFloat ) ) )
            int alt19=2;
            switch ( input.LA(1) ) {
            case 55:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_INT) ) {
                    alt19=1;
                }
                else if ( (LA19_1==RULE_FLOAT) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_INT) ) {
                    alt19=1;
                }
                else if ( (LA19_2==RULE_FLOAT) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt19=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalKiVis.g:1201:3: ( (lv_from_0_0= ruleSignedInt ) )
                    {
                    // InternalKiVis.g:1201:3: ( (lv_from_0_0= ruleSignedInt ) )
                    // InternalKiVis.g:1202:1: (lv_from_0_0= ruleSignedInt )
                    {
                    // InternalKiVis.g:1202:1: (lv_from_0_0= ruleSignedInt )
                    // InternalKiVis.g:1203:3: lv_from_0_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntervalAccess().getFromSignedIntParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_from_0_0=ruleSignedInt();

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
                              		"de.cau.cs.kieler.prom.KiBuild.SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1220:6: ( (lv_from_1_0= ruleSignedFloat ) )
                    {
                    // InternalKiVis.g:1220:6: ( (lv_from_1_0= ruleSignedFloat ) )
                    // InternalKiVis.g:1221:1: (lv_from_1_0= ruleSignedFloat )
                    {
                    // InternalKiVis.g:1221:1: (lv_from_1_0= ruleSignedFloat )
                    // InternalKiVis.g:1222:3: lv_from_1_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntervalAccess().getFromSignedFloatParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_from_1_0=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                      	        }
                             		set(
                             			current, 
                             			"from",
                              		lv_from_1_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getIntervalAccess().getRangeParserRuleCall_1()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_28);
            ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:1249:1: ( ( (lv_to_3_0= ruleSignedInt ) ) | ( (lv_to_4_0= ruleSignedFloat ) ) )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 55:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_FLOAT) ) {
                    alt20=2;
                }
                else if ( (LA20_1==RULE_INT) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==RULE_INT) ) {
                    alt20=1;
                }
                else if ( (LA20_2==RULE_FLOAT) ) {
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
            case RULE_INT:
                {
                alt20=1;
                }
                break;
            case RULE_FLOAT:
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
                    // InternalKiVis.g:1249:2: ( (lv_to_3_0= ruleSignedInt ) )
                    {
                    // InternalKiVis.g:1249:2: ( (lv_to_3_0= ruleSignedInt ) )
                    // InternalKiVis.g:1250:1: (lv_to_3_0= ruleSignedInt )
                    {
                    // InternalKiVis.g:1250:1: (lv_to_3_0= ruleSignedInt )
                    // InternalKiVis.g:1251:3: lv_to_3_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntervalAccess().getToSignedIntParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_to_3_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                      	        }
                             		set(
                             			current, 
                             			"to",
                              		lv_to_3_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1268:6: ( (lv_to_4_0= ruleSignedFloat ) )
                    {
                    // InternalKiVis.g:1268:6: ( (lv_to_4_0= ruleSignedFloat ) )
                    // InternalKiVis.g:1269:1: (lv_to_4_0= ruleSignedFloat )
                    {
                    // InternalKiVis.g:1269:1: (lv_to_4_0= ruleSignedFloat )
                    // InternalKiVis.g:1270:3: lv_to_4_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntervalAccess().getToSignedFloatParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_to_4_0=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntervalRule());
                      	        }
                             		set(
                             			current, 
                             			"to",
                              		lv_to_4_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedFloat");
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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalKiVis.g:1294:1: entryRuleAttributeDomain returns [EObject current=null] : iv_ruleAttributeDomain= ruleAttributeDomain EOF ;
    public final EObject entryRuleAttributeDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDomain = null;


        try {
            // InternalKiVis.g:1295:2: (iv_ruleAttributeDomain= ruleAttributeDomain EOF )
            // InternalKiVis.g:1296:2: iv_ruleAttributeDomain= ruleAttributeDomain EOF
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
    // InternalKiVis.g:1303:1: ruleAttributeDomain returns [EObject current=null] : ( ( (lv_currentValue_0_0= 'value' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) ) ;
    public final EObject ruleAttributeDomain() throws RecognitionException {
        EObject current = null;

        Token lv_currentValue_0_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_range_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1306:28: ( ( ( (lv_currentValue_0_0= 'value' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) ) )
            // InternalKiVis.g:1307:1: ( ( (lv_currentValue_0_0= 'value' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) )
            {
            // InternalKiVis.g:1307:1: ( ( (lv_currentValue_0_0= 'value' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalKiVis.g:1307:2: ( (lv_currentValue_0_0= 'value' ) )
                    {
                    // InternalKiVis.g:1307:2: ( (lv_currentValue_0_0= 'value' ) )
                    // InternalKiVis.g:1308:1: (lv_currentValue_0_0= 'value' )
                    {
                    // InternalKiVis.g:1308:1: (lv_currentValue_0_0= 'value' )
                    // InternalKiVis.g:1309:3: lv_currentValue_0_0= 'value'
                    {
                    lv_currentValue_0_0=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_currentValue_0_0, grammarAccess.getAttributeDomainAccess().getCurrentValueValueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDomainRule());
                      	        }
                             		setWithLastConsumed(current, "currentValue", true, "value");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1323:6: ( (lv_value_1_0= ruleLiteral ) )
                    {
                    // InternalKiVis.g:1323:6: ( (lv_value_1_0= ruleLiteral ) )
                    // InternalKiVis.g:1324:1: (lv_value_1_0= ruleLiteral )
                    {
                    // InternalKiVis.g:1324:1: (lv_value_1_0= ruleLiteral )
                    // InternalKiVis.g:1325:3: lv_value_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDomainAccess().getValueLiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDomainRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:1342:6: ( (lv_range_2_0= ruleInterval ) )
                    {
                    // InternalKiVis.g:1342:6: ( (lv_range_2_0= ruleInterval ) )
                    // InternalKiVis.g:1343:1: (lv_range_2_0= ruleInterval )
                    {
                    // InternalKiVis.g:1343:1: (lv_range_2_0= ruleInterval )
                    // InternalKiVis.g:1344:3: lv_range_2_0= ruleInterval
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDomainAccess().getRangeIntervalParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_range_2_0=ruleInterval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDomainRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_2_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.Interval");
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
    // $ANTLR end "ruleAttributeDomain"


    // $ANTLR start "entryRuleVariableReference"
    // InternalKiVis.g:1368:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalKiVis.g:1369:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalKiVis.g:1370:2: iv_ruleVariableReference= ruleVariableReference EOF
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
    // InternalKiVis.g:1377:1: ruleVariableReference returns [EObject current=null] : ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_arrayIndex_2_0= ruleArrayIndex ) )? ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_model_0_0 = null;

        EObject lv_arrayIndex_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1380:28: ( ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_arrayIndex_2_0= ruleArrayIndex ) )? ) )
            // InternalKiVis.g:1381:1: ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_arrayIndex_2_0= ruleArrayIndex ) )? )
            {
            // InternalKiVis.g:1381:1: ( ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_arrayIndex_2_0= ruleArrayIndex ) )? )
            // InternalKiVis.g:1381:2: ( (lv_model_0_0= ruleModelReference ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_arrayIndex_2_0= ruleArrayIndex ) )?
            {
            // InternalKiVis.g:1381:2: ( (lv_model_0_0= ruleModelReference ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==38) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalKiVis.g:1382:1: (lv_model_0_0= ruleModelReference )
                    {
                    // InternalKiVis.g:1382:1: (lv_model_0_0= ruleModelReference )
                    // InternalKiVis.g:1383:3: lv_model_0_0= ruleModelReference
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
                              		"de.cau.cs.kieler.kivis.KiVis.ModelReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiVis.g:1399:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalKiVis.g:1400:1: (lv_name_1_0= RULE_ID )
            {
            // InternalKiVis.g:1400:1: (lv_name_1_0= RULE_ID )
            // InternalKiVis.g:1401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_29); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiVis.g:1417:2: ( (lv_arrayIndex_2_0= ruleArrayIndex ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKiVis.g:1418:1: (lv_arrayIndex_2_0= ruleArrayIndex )
                    {
                    // InternalKiVis.g:1418:1: (lv_arrayIndex_2_0= ruleArrayIndex )
                    // InternalKiVis.g:1419:3: lv_arrayIndex_2_0= ruleArrayIndex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableReferenceAccess().getArrayIndexArrayIndexParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_arrayIndex_2_0=ruleArrayIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableReferenceRule());
                      	        }
                             		set(
                             			current, 
                             			"arrayIndex",
                              		lv_arrayIndex_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.ArrayIndex");
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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleModelReference"
    // InternalKiVis.g:1443:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // InternalKiVis.g:1444:2: (iv_ruleModelReference= ruleModelReference EOF )
            // InternalKiVis.g:1445:2: iv_ruleModelReference= ruleModelReference EOF
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
    // InternalKiVis.g:1452:1: ruleModelReference returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:1455:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ) )
            // InternalKiVis.g:1456:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' )
            {
            // InternalKiVis.g:1456:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' )
            // InternalKiVis.g:1456:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.'
            {
            // InternalKiVis.g:1456:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalKiVis.g:1457:1: (lv_name_0_0= RULE_ID )
            {
            // InternalKiVis.g:1457:1: (lv_name_0_0= RULE_ID )
            // InternalKiVis.g:1458:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFunctionParameter"
    // InternalKiVis.g:1486:1: entryRuleFunctionParameter returns [EObject current=null] : iv_ruleFunctionParameter= ruleFunctionParameter EOF ;
    public final EObject entryRuleFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameter = null;


        try {
            // InternalKiVis.g:1487:2: (iv_ruleFunctionParameter= ruleFunctionParameter EOF )
            // InternalKiVis.g:1488:2: iv_ruleFunctionParameter= ruleFunctionParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionParameter=ruleFunctionParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParameter"


    // $ANTLR start "ruleFunctionParameter"
    // InternalKiVis.g:1495:1: ruleFunctionParameter returns [EObject current=null] : ( ( (lv_variableReference_0_0= ruleVariableReference ) ) | ( (lv_value_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_variableReference_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1498:28: ( ( ( (lv_variableReference_0_0= ruleVariableReference ) ) | ( (lv_value_1_0= ruleLiteral ) ) ) )
            // InternalKiVis.g:1499:1: ( ( (lv_variableReference_0_0= ruleVariableReference ) ) | ( (lv_value_1_0= ruleLiteral ) ) )
            {
            // InternalKiVis.g:1499:1: ( ( (lv_variableReference_0_0= ruleVariableReference ) ) | ( (lv_value_1_0= ruleLiteral ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred28_InternalKiVis()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_STRING||(LA24_0>=RULE_INT && LA24_0<=RULE_FLOAT)||LA24_0==RULE_BOOLEAN||LA24_0==39||LA24_0==55) ) {
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
                    // InternalKiVis.g:1499:2: ( (lv_variableReference_0_0= ruleVariableReference ) )
                    {
                    // InternalKiVis.g:1499:2: ( (lv_variableReference_0_0= ruleVariableReference ) )
                    // InternalKiVis.g:1500:1: (lv_variableReference_0_0= ruleVariableReference )
                    {
                    // InternalKiVis.g:1500:1: (lv_variableReference_0_0= ruleVariableReference )
                    // InternalKiVis.g:1501:3: lv_variableReference_0_0= ruleVariableReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getVariableReferenceVariableReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_variableReference_0_0=ruleVariableReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"variableReference",
                              		lv_variableReference_0_0, 
                              		"de.cau.cs.kieler.kivis.KiVis.VariableReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1518:6: ( (lv_value_1_0= ruleLiteral ) )
                    {
                    // InternalKiVis.g:1518:6: ( (lv_value_1_0= ruleLiteral ) )
                    // InternalKiVis.g:1519:1: (lv_value_1_0= ruleLiteral )
                    {
                    // InternalKiVis.g:1519:1: (lv_value_1_0= ruleLiteral )
                    // InternalKiVis.g:1520:3: lv_value_1_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getValueLiteralParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Literal");
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
    // $ANTLR end "ruleFunctionParameter"


    // $ANTLR start "entryRuleRange"
    // InternalKiVis.g:1544:1: entryRuleRange returns [String current=null] : iv_ruleRange= ruleRange EOF ;
    public final String entryRuleRange() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRange = null;


        try {
            // InternalKiVis.g:1545:2: (iv_ruleRange= ruleRange EOF )
            // InternalKiVis.g:1546:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalKiVis.g:1553:1: ruleRange returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleRange() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:1556:28: (kw= '-' )
            // InternalKiVis.g:1558:2: kw= '-'
            {
            kw=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRangeAccess().getHyphenMinusKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleModelCompiler"
    // InternalKiVis.g:1573:1: entryRuleModelCompiler returns [EObject current=null] : iv_ruleModelCompiler= ruleModelCompiler EOF ;
    public final EObject entryRuleModelCompiler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelCompiler = null;


        try {
            // InternalKiVis.g:1574:2: (iv_ruleModelCompiler= ruleModelCompiler EOF )
            // InternalKiVis.g:1575:2: iv_ruleModelCompiler= ruleModelCompiler EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelCompilerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModelCompiler=ruleModelCompiler();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelCompiler; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelCompiler"


    // $ANTLR start "ruleModelCompiler"
    // InternalKiVis.g:1582:1: ruleModelCompiler returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' ) ;
    public final EObject ruleModelCompiler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_simulationProcessor_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1585:28: ( (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' ) )
            // InternalKiVis.g:1586:1: (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' )
            {
            // InternalKiVis.g:1586:1: (otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}' )
            // InternalKiVis.g:1586:3: otherlv_0= 'model' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelCompilerAccess().getModelKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModelCompilerAccess().getCompilerKeyword_1());
                  
            }
            // InternalKiVis.g:1594:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalKiVis.g:1595:1: (lv_name_2_0= RULE_ID )
            {
            // InternalKiVis.g:1595:1: (lv_name_2_0= RULE_ID )
            // InternalKiVis.g:1596:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getModelCompilerAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModelCompilerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModelCompilerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiVis.g:1616:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalKiVis.g:1617:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiVis.g:1617:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiVis.g:1618:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelCompilerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // InternalKiVis.g:1634:3: ( (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKiVis.g:1635:1: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    {
                    // InternalKiVis.g:1635:1: (lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor )
                    // InternalKiVis.g:1636:3: lv_simulationProcessor_5_0= ruleSimulationTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelCompilerAccess().getSimulationProcessorSimulationTemplateProcessorParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_simulationProcessor_5_0=ruleSimulationTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelCompilerRule());
                      	        }
                             		set(
                             			current, 
                             			"simulationProcessor",
                              		lv_simulationProcessor_5_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SimulationTemplateProcessor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getModelCompilerAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelCompiler"


    // $ANTLR start "entryRuleSimulationCompiler"
    // InternalKiVis.g:1664:1: entryRuleSimulationCompiler returns [EObject current=null] : iv_ruleSimulationCompiler= ruleSimulationCompiler EOF ;
    public final EObject entryRuleSimulationCompiler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationCompiler = null;


        try {
            // InternalKiVis.g:1665:2: (iv_ruleSimulationCompiler= ruleSimulationCompiler EOF )
            // InternalKiVis.g:1666:2: iv_ruleSimulationCompiler= ruleSimulationCompiler EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimulationCompilerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimulationCompiler=ruleSimulationCompiler();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimulationCompiler; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulationCompiler"


    // $ANTLR start "ruleSimulationCompiler"
    // InternalKiVis.g:1673:1: ruleSimulationCompiler returns [EObject current=null] : (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleSimulationCompiler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1676:28: ( (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiVis.g:1677:1: (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiVis.g:1677:1: (otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiVis.g:1677:3: otherlv_0= 'simulation' otherlv_1= 'compiler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimulationCompilerAccess().getSimulationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimulationCompilerAccess().getCompilerKeyword_1());
                  
            }
            // InternalKiVis.g:1685:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalKiVis.g:1686:1: (lv_name_2_0= RULE_ID )
            {
            // InternalKiVis.g:1686:1: (lv_name_2_0= RULE_ID )
            // InternalKiVis.g:1687:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSimulationCompilerAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSimulationCompilerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimulationCompilerAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiVis.g:1707:1: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalKiVis.g:1708:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiVis.g:1708:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiVis.g:1709:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimulationCompilerAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimulationCompilerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSimulationCompilerAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulationCompiler"


    // $ANTLR start "entryRuleTemplateProcessor"
    // InternalKiVis.g:1737:1: entryRuleTemplateProcessor returns [EObject current=null] : iv_ruleTemplateProcessor= ruleTemplateProcessor EOF ;
    public final EObject entryRuleTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateProcessor = null;


        try {
            // InternalKiVis.g:1738:2: (iv_ruleTemplateProcessor= ruleTemplateProcessor EOF )
            // InternalKiVis.g:1739:2: iv_ruleTemplateProcessor= ruleTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTemplateProcessor=ruleTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateProcessor"


    // $ANTLR start "ruleTemplateProcessor"
    // InternalKiVis.g:1746:1: ruleTemplateProcessor returns [EObject current=null] : (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor ) ;
    public final EObject ruleTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject this_NormalTemplateProcessor_0 = null;

        EObject this_SimulationTemplateProcessor_1 = null;

        EObject this_WrapperCodeTemplateProcessor_2 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1749:28: ( (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor ) )
            // InternalKiVis.g:1750:1: (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor )
            {
            // InternalKiVis.g:1750:1: (this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor | this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor | this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    alt28=2;
                    }
                    break;
                case 43:
                    {
                    alt28=1;
                    }
                    break;
                case 44:
                    {
                    alt28=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiVis.g:1751:2: this_NormalTemplateProcessor_0= ruleNormalTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateProcessorAccess().getNormalTemplateProcessorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NormalTemplateProcessor_0=ruleNormalTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NormalTemplateProcessor_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1764:2: this_SimulationTemplateProcessor_1= ruleSimulationTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateProcessorAccess().getSimulationTemplateProcessorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimulationTemplateProcessor_1=ruleSimulationTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimulationTemplateProcessor_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalKiVis.g:1777:2: this_WrapperCodeTemplateProcessor_2= ruleWrapperCodeTemplateProcessor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateProcessorAccess().getWrapperCodeTemplateProcessorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_WrapperCodeTemplateProcessor_2=ruleWrapperCodeTemplateProcessor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_WrapperCodeTemplateProcessor_2; 
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
    // $ANTLR end "ruleTemplateProcessor"


    // $ANTLR start "entryRuleNormalTemplateProcessor"
    // InternalKiVis.g:1796:1: entryRuleNormalTemplateProcessor returns [EObject current=null] : iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF ;
    public final EObject entryRuleNormalTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalTemplateProcessor = null;


        try {
            // InternalKiVis.g:1797:2: (iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF )
            // InternalKiVis.g:1798:2: iv_ruleNormalTemplateProcessor= ruleNormalTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNormalTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNormalTemplateProcessor=ruleNormalTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNormalTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormalTemplateProcessor"


    // $ANTLR start "ruleNormalTemplateProcessor"
    // InternalKiVis.g:1805:1: ruleNormalTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) ;
    public final EObject ruleNormalTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1808:28: ( (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' ) )
            // InternalKiVis.g:1809:1: (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            {
            // InternalKiVis.g:1809:1: (otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}' )
            // InternalKiVis.g:1809:3: otherlv_0= 'process' otherlv_1= 'template' otherlv_2= '{' () ( (lv_attributes_4_0= ruleAttributeMapping ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNormalTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNormalTemplateProcessorAccess().getTemplateKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNormalTemplateProcessorAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalKiVis.g:1821:1: ()
            // InternalKiVis.g:1822:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNormalTemplateProcessorAccess().getNormalTemplateProcessorAction_3(),
                          current);
                  
            }

            }

            // InternalKiVis.g:1830:2: ( (lv_attributes_4_0= ruleAttributeMapping ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalKiVis.g:1831:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    {
            	    // InternalKiVis.g:1831:1: (lv_attributes_4_0= ruleAttributeMapping )
            	    // InternalKiVis.g:1832:3: lv_attributes_4_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNormalTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributes_4_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNormalTemplateProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_4_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNormalTemplateProcessorAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormalTemplateProcessor"


    // $ANTLR start "entryRuleSimulationTemplateProcessor"
    // InternalKiVis.g:1860:1: entryRuleSimulationTemplateProcessor returns [EObject current=null] : iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF ;
    public final EObject entryRuleSimulationTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulationTemplateProcessor = null;


        try {
            // InternalKiVis.g:1861:2: (iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF )
            // InternalKiVis.g:1862:2: iv_ruleSimulationTemplateProcessor= ruleSimulationTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimulationTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimulationTemplateProcessor=ruleSimulationTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimulationTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulationTemplateProcessor"


    // $ANTLR start "ruleSimulationTemplateProcessor"
    // InternalKiVis.g:1869:1: ruleSimulationTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) ;
    public final EObject ruleSimulationTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1872:28: ( (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) )
            // InternalKiVis.g:1873:1: (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            {
            // InternalKiVis.g:1873:1: (otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            // InternalKiVis.g:1873:3: otherlv_0= 'process' otherlv_1= 'simulation' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimulationTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSimulationTemplateProcessorAccess().getSimulationKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSimulationTemplateProcessorAccess().getTemplateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSimulationTemplateProcessorAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiVis.g:1889:1: ()
            // InternalKiVis.g:1890:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSimulationTemplateProcessorAccess().getSimulationTemplateProcessorAction_4(),
                          current);
                  
            }

            }

            // InternalKiVis.g:1898:2: ( (lv_attributes_5_0= ruleAttributeMapping ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKiVis.g:1899:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiVis.g:1899:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    // InternalKiVis.g:1900:3: lv_attributes_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimulationTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributes_5_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimulationTemplateProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_5_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSimulationTemplateProcessorAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulationTemplateProcessor"


    // $ANTLR start "entryRuleWrapperCodeTemplateProcessor"
    // InternalKiVis.g:1928:1: entryRuleWrapperCodeTemplateProcessor returns [EObject current=null] : iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF ;
    public final EObject entryRuleWrapperCodeTemplateProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapperCodeTemplateProcessor = null;


        try {
            // InternalKiVis.g:1929:2: (iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF )
            // InternalKiVis.g:1930:2: iv_ruleWrapperCodeTemplateProcessor= ruleWrapperCodeTemplateProcessor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWrapperCodeTemplateProcessorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrapperCodeTemplateProcessor=ruleWrapperCodeTemplateProcessor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWrapperCodeTemplateProcessor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrapperCodeTemplateProcessor"


    // $ANTLR start "ruleWrapperCodeTemplateProcessor"
    // InternalKiVis.g:1937:1: ruleWrapperCodeTemplateProcessor returns [EObject current=null] : (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) ;
    public final EObject ruleWrapperCodeTemplateProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:1940:28: ( (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' ) )
            // InternalKiVis.g:1941:1: (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            {
            // InternalKiVis.g:1941:1: (otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}' )
            // InternalKiVis.g:1941:3: otherlv_0= 'process' otherlv_1= 'wrapper' otherlv_2= 'template' otherlv_3= '{' () ( (lv_attributes_5_0= ruleAttributeMapping ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWrapperCodeTemplateProcessorAccess().getProcessKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWrapperCodeTemplateProcessorAccess().getWrapperKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWrapperCodeTemplateProcessorAccess().getTemplateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWrapperCodeTemplateProcessorAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalKiVis.g:1957:1: ()
            // InternalKiVis.g:1958:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getWrapperCodeTemplateProcessorAccess().getWrapperCodeTemplateProcessorAction_4(),
                          current);
                  
            }

            }

            // InternalKiVis.g:1966:2: ( (lv_attributes_5_0= ruleAttributeMapping ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalKiVis.g:1967:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    {
            	    // InternalKiVis.g:1967:1: (lv_attributes_5_0= ruleAttributeMapping )
            	    // InternalKiVis.g:1968:3: lv_attributes_5_0= ruleAttributeMapping
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getWrapperCodeTemplateProcessorAccess().getAttributesAttributeMappingParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_attributes_5_0=ruleAttributeMapping();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getWrapperCodeTemplateProcessorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_5_0, 
            	              		"de.cau.cs.kieler.kivis.KiVis.AttributeMapping");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getWrapperCodeTemplateProcessorAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrapperCodeTemplateProcessor"


    // $ANTLR start "entryRuleLiteral"
    // InternalKiVis.g:1996:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalKiVis.g:1997:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalKiVis.g:1998:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

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
    // InternalKiVis.g:2005:1: ruleLiteral returns [EObject current=null] : ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_arrayIndex_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2008:28: ( ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) ) )
            // InternalKiVis.g:2009:1: ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) )
            {
            // InternalKiVis.g:2009:1: ( ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? ) | ( (lv_value_2_0= ruleSignedInt ) ) | ( (lv_value_3_0= ruleSignedFloat ) ) | ( (lv_value_4_0= ruleAnyValue ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt33=1;
                }
                break;
            case 55:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==RULE_FLOAT) ) {
                    alt33=3;
                }
                else if ( (LA33_2==RULE_INT) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA33_3 = input.LA(2);

                if ( (LA33_3==RULE_FLOAT) ) {
                    alt33=3;
                }
                else if ( (LA33_3==RULE_INT) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA33_4 = input.LA(2);

                if ( (synpred39_InternalKiVis()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA33_5 = input.LA(2);

                if ( (synpred40_InternalKiVis()) ) {
                    alt33=3;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_BOOLEAN:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalKiVis.g:2009:2: ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? )
                    {
                    // InternalKiVis.g:2009:2: ( ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )? )
                    // InternalKiVis.g:2009:3: ( (lv_value_0_0= ruleTextValue ) ) ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
                    {
                    // InternalKiVis.g:2009:3: ( (lv_value_0_0= ruleTextValue ) )
                    // InternalKiVis.g:2010:1: (lv_value_0_0= ruleTextValue )
                    {
                    // InternalKiVis.g:2010:1: (lv_value_0_0= ruleTextValue )
                    // InternalKiVis.g:2011:3: lv_value_0_0= ruleTextValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueTextValueParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_value_0_0=ruleTextValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.TextValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalKiVis.g:2027:2: ( (lv_arrayIndex_1_0= ruleArrayIndex ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==45) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalKiVis.g:2028:1: (lv_arrayIndex_1_0= ruleArrayIndex )
                            {
                            // InternalKiVis.g:2028:1: (lv_arrayIndex_1_0= ruleArrayIndex )
                            // InternalKiVis.g:2029:3: lv_arrayIndex_1_0= ruleArrayIndex
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLiteralAccess().getArrayIndexArrayIndexParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_arrayIndex_1_0=ruleArrayIndex();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"arrayIndex",
                                      		lv_arrayIndex_1_0, 
                                      		"de.cau.cs.kieler.prom.KiBuild.ArrayIndex");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:2046:6: ( (lv_value_2_0= ruleSignedInt ) )
                    {
                    // InternalKiVis.g:2046:6: ( (lv_value_2_0= ruleSignedInt ) )
                    // InternalKiVis.g:2047:1: (lv_value_2_0= ruleSignedInt )
                    {
                    // InternalKiVis.g:2047:1: (lv_value_2_0= ruleSignedInt )
                    // InternalKiVis.g:2048:3: lv_value_2_0= ruleSignedInt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedIntParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_2_0=ruleSignedInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedInt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:2065:6: ( (lv_value_3_0= ruleSignedFloat ) )
                    {
                    // InternalKiVis.g:2065:6: ( (lv_value_3_0= ruleSignedFloat ) )
                    // InternalKiVis.g:2066:1: (lv_value_3_0= ruleSignedFloat )
                    {
                    // InternalKiVis.g:2066:1: (lv_value_3_0= ruleSignedFloat )
                    // InternalKiVis.g:2067:3: lv_value_3_0= ruleSignedFloat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedFloatParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_3_0=ruleSignedFloat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.SignedFloat");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:2084:6: ( (lv_value_4_0= ruleAnyValue ) )
                    {
                    // InternalKiVis.g:2084:6: ( (lv_value_4_0= ruleAnyValue ) )
                    // InternalKiVis.g:2085:1: (lv_value_4_0= ruleAnyValue )
                    {
                    // InternalKiVis.g:2085:1: (lv_value_4_0= ruleAnyValue )
                    // InternalKiVis.g:2086:3: lv_value_4_0= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueAnyValueParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_4_0=ruleAnyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_4_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AnyValue");
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayIndex"
    // InternalKiVis.g:2110:1: entryRuleArrayIndex returns [EObject current=null] : iv_ruleArrayIndex= ruleArrayIndex EOF ;
    public final EObject entryRuleArrayIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayIndex = null;


        try {
            // InternalKiVis.g:2111:2: (iv_ruleArrayIndex= ruleArrayIndex EOF )
            // InternalKiVis.g:2112:2: iv_ruleArrayIndex= ruleArrayIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayIndexRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayIndex=ruleArrayIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayIndex; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayIndex"


    // $ANTLR start "ruleArrayIndex"
    // InternalKiVis.g:2119:1: ruleArrayIndex returns [EObject current=null] : (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+ ;
    public final EObject ruleArrayIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_indices_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:2122:28: ( (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+ )
            // InternalKiVis.g:2123:1: (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+
            {
            // InternalKiVis.g:2123:1: (otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==45) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalKiVis.g:2123:3: otherlv_0= '[' ( (lv_indices_1_0= RULE_INT ) ) otherlv_2= ']'
            	    {
            	    otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_0, grammarAccess.getArrayIndexAccess().getLeftSquareBracketKeyword_0());
            	          
            	    }
            	    // InternalKiVis.g:2127:1: ( (lv_indices_1_0= RULE_INT ) )
            	    // InternalKiVis.g:2128:1: (lv_indices_1_0= RULE_INT )
            	    {
            	    // InternalKiVis.g:2128:1: (lv_indices_1_0= RULE_INT )
            	    // InternalKiVis.g:2129:3: lv_indices_1_0= RULE_INT
            	    {
            	    lv_indices_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_indices_1_0, grammarAccess.getArrayIndexAccess().getIndicesINTTerminalRuleCall_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getArrayIndexRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"indices",
            	              		lv_indices_1_0, 
            	              		"de.cau.cs.kieler.annotations.Annotations.INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayIndexAccess().getRightSquareBracketKeyword_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // $ANTLR end "ruleArrayIndex"


    // $ANTLR start "entryRuleSignedFloat"
    // InternalKiVis.g:2157:1: entryRuleSignedFloat returns [EObject current=null] : iv_ruleSignedFloat= ruleSignedFloat EOF ;
    public final EObject entryRuleSignedFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedFloat = null;


        try {
            // InternalKiVis.g:2158:2: (iv_ruleSignedFloat= ruleSignedFloat EOF )
            // InternalKiVis.g:2159:2: iv_ruleSignedFloat= ruleSignedFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedFloatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedFloat=ruleSignedFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedFloat; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedFloat"


    // $ANTLR start "ruleSignedFloat"
    // InternalKiVis.g:2166:1: ruleSignedFloat returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) ;
    public final EObject ruleSignedFloat() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2169:28: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) ) )
            // InternalKiVis.g:2170:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            {
            // InternalKiVis.g:2170:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) ) )
            // InternalKiVis.g:2170:2: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_FLOAT ) )
            {
            // InternalKiVis.g:2170:2: ( (lv_sign_0_0= ruleSign ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39||LA35_0==55) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKiVis.g:2171:1: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiVis.g:2171:1: (lv_sign_0_0= ruleSign )
                    // InternalKiVis.g:2172:3: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignedFloatAccess().getSignSignEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignedFloatRule());
                      	        }
                             		set(
                             			current, 
                             			"sign",
                              		lv_sign_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Sign");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiVis.g:2188:3: ( (lv_value_1_0= RULE_FLOAT ) )
            // InternalKiVis.g:2189:1: (lv_value_1_0= RULE_FLOAT )
            {
            // InternalKiVis.g:2189:1: (lv_value_1_0= RULE_FLOAT )
            // InternalKiVis.g:2190:3: lv_value_1_0= RULE_FLOAT
            {
            lv_value_1_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getSignedFloatAccess().getValueFLOATTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignedFloatRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              	    
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
    // $ANTLR end "ruleSignedFloat"


    // $ANTLR start "entryRuleSignedInt"
    // InternalKiVis.g:2214:1: entryRuleSignedInt returns [EObject current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final EObject entryRuleSignedInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInt = null;


        try {
            // InternalKiVis.g:2215:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalKiVis.g:2216:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalKiVis.g:2223:1: ruleSignedInt returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSignedInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2226:28: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalKiVis.g:2227:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalKiVis.g:2227:1: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) ) )
            // InternalKiVis.g:2227:2: ( (lv_sign_0_0= ruleSign ) )? ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalKiVis.g:2227:2: ( (lv_sign_0_0= ruleSign ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39||LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalKiVis.g:2228:1: (lv_sign_0_0= ruleSign )
                    {
                    // InternalKiVis.g:2228:1: (lv_sign_0_0= ruleSign )
                    // InternalKiVis.g:2229:3: lv_sign_0_0= ruleSign
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignedIntAccess().getSignSignEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignedIntRule());
                      	        }
                             		set(
                             			current, 
                             			"sign",
                              		lv_sign_0_0, 
                              		"de.cau.cs.kieler.prom.KiBuild.Sign");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalKiVis.g:2245:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalKiVis.g:2246:1: (lv_value_1_0= RULE_INT )
            {
            // InternalKiVis.g:2246:1: (lv_value_1_0= RULE_INT )
            // InternalKiVis.g:2247:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getSignedIntAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSignedIntRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleTextValue"
    // InternalKiVis.g:2271:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // InternalKiVis.g:2272:2: (iv_ruleTextValue= ruleTextValue EOF )
            // InternalKiVis.g:2273:2: iv_ruleTextValue= ruleTextValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextValue"


    // $ANTLR start "ruleTextValue"
    // InternalKiVis.g:2280:1: ruleTextValue returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:2283:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalKiVis.g:2284:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalKiVis.g:2284:1: ( (lv_value_0_0= RULE_ID ) )
            // InternalKiVis.g:2285:1: (lv_value_0_0= RULE_ID )
            {
            // InternalKiVis.g:2285:1: (lv_value_0_0= RULE_ID )
            // InternalKiVis.g:2286:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getTextValueAccess().getValueIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
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
    // $ANTLR end "ruleTextValue"


    // $ANTLR start "entryRuleExpression"
    // InternalKiVis.g:2312:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKiVis.g:2313:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalKiVis.g:2314:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalKiVis.g:2321:1: ruleExpression returns [EObject current=null] : ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject lv_schedule_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2324:28: ( ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? ) )
            // InternalKiVis.g:2325:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            {
            // InternalKiVis.g:2325:1: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )? )
            // InternalKiVis.g:2325:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            {
            // InternalKiVis.g:2325:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalKiVis.g:2326:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
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
                    // InternalKiVis.g:2339:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
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

            // InternalKiVis.g:2350:2: (otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+ )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKiVis.g:2350:4: otherlv_2= 'schedule' ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    {
                    otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getScheduleKeyword_1_0());
                          
                    }
                    // InternalKiVis.g:2354:1: ( (lv_schedule_3_0= ruleScheduleObjectReference ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalKiVis.g:2355:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    {
                    	    // InternalKiVis.g:2355:1: (lv_schedule_3_0= ruleScheduleObjectReference )
                    	    // InternalKiVis.g:2356:3: lv_schedule_3_0= ruleScheduleObjectReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpressionAccess().getScheduleScheduleObjectReferenceParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
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
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
    // InternalKiVis.g:2380:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKiVis.g:2381:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKiVis.g:2382:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalKiVis.g:2389:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2392:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKiVis.g:2394:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
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
    // InternalKiVis.g:2413:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKiVis.g:2414:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKiVis.g:2415:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
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
    // InternalKiVis.g:2422:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2425:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKiVis.g:2426:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKiVis.g:2426:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKiVis.g:2427:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_41);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:2438:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalKiVis.g:2438:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKiVis.g:2438:2: ()
                    // InternalKiVis.g:2439:2: 
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

                    // InternalKiVis.g:2447:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKiVis.g:2447:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKiVis.g:2447:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKiVis.g:2448:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKiVis.g:2448:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKiVis.g:2449:3: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:2465:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKiVis.g:2466:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKiVis.g:2466:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKiVis.g:2467:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_41);
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

                    // InternalKiVis.g:2483:3: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==48) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalKiVis.g:2483:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:2487:1: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKiVis.g:2488:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKiVis.g:2488:1: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKiVis.g:2489:3: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
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
                    	    break loop40;
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
    // InternalKiVis.g:2513:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKiVis.g:2514:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKiVis.g:2515:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
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
    // InternalKiVis.g:2522:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2525:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKiVis.g:2526:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKiVis.g:2526:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKiVis.g:2527:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:2538:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalKiVis.g:2538:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKiVis.g:2538:2: ()
                    // InternalKiVis.g:2539:2: 
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

                    // InternalKiVis.g:2547:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKiVis.g:2547:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKiVis.g:2547:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKiVis.g:2548:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKiVis.g:2548:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKiVis.g:2549:3: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:2565:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKiVis.g:2566:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKiVis.g:2566:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKiVis.g:2567:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKiVis.g:2583:3: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==36) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalKiVis.g:2583:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:2587:1: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKiVis.g:2588:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKiVis.g:2588:1: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKiVis.g:2589:3: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
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
                    	    break loop42;
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
    // InternalKiVis.g:2613:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKiVis.g:2614:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKiVis.g:2615:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
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
    // InternalKiVis.g:2622:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2625:28: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKiVis.g:2626:1: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKiVis.g:2626:1: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKiVis.g:2627:2: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_43);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseXOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:2638:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalKiVis.g:2638:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKiVis.g:2638:2: ()
                    // InternalKiVis.g:2639:2: 
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

                    // InternalKiVis.g:2647:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKiVis.g:2647:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKiVis.g:2647:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKiVis.g:2648:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKiVis.g:2648:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKiVis.g:2649:3: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:2665:2: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKiVis.g:2666:1: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKiVis.g:2666:1: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKiVis.g:2667:3: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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

                    // InternalKiVis.g:2683:3: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==49) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalKiVis.g:2683:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,49,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:2687:1: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKiVis.g:2688:1: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKiVis.g:2688:1: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKiVis.g:2689:3: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_43);
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
                    	    break loop44;
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
    // InternalKiVis.g:2713:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKiVis.g:2714:2: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKiVis.g:2715:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
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
    // InternalKiVis.g:2722:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2725:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKiVis.g:2726:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKiVis.g:2726:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKiVis.g:2727:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_44);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:2738:1: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalKiVis.g:2738:2: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKiVis.g:2738:2: ()
                    // InternalKiVis.g:2739:2: 
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

                    // InternalKiVis.g:2747:2: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKiVis.g:2747:3: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKiVis.g:2747:3: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKiVis.g:2748:1: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKiVis.g:2748:1: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKiVis.g:2749:3: lv_operator_2_0= ruleBitwiseXOrOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getOperatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:2765:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKiVis.g:2766:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKiVis.g:2766:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKiVis.g:2767:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_44);
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

                    // InternalKiVis.g:2783:3: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==50) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalKiVis.g:2783:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:2787:1: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKiVis.g:2788:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKiVis.g:2788:1: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKiVis.g:2789:3: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_44);
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
                    	    break loop46;
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
    // InternalKiVis.g:2813:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKiVis.g:2814:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKiVis.g:2815:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
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
    // InternalKiVis.g:2822:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2825:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKiVis.g:2826:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKiVis.g:2826:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKiVis.g:2827:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_45);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:2838:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalKiVis.g:2838:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKiVis.g:2838:2: ()
                    // InternalKiVis.g:2839:2: 
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

                    // InternalKiVis.g:2847:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKiVis.g:2847:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKiVis.g:2847:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKiVis.g:2848:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKiVis.g:2848:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKiVis.g:2849:3: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:2865:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKiVis.g:2866:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKiVis.g:2866:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKiVis.g:2867:3: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_45);
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

                    // InternalKiVis.g:2883:3: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==51) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalKiVis.g:2883:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,51,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:2887:1: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKiVis.g:2888:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKiVis.g:2888:1: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKiVis.g:2889:3: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
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
                    	    break loop48;
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
    // InternalKiVis.g:2913:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKiVis.g:2914:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKiVis.g:2915:2: iv_ruleCompareOperation= ruleCompareOperation EOF
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
    // InternalKiVis.g:2922:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:2925:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKiVis.g:2926:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKiVis.g:2926:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKiVis.g:2927:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_46);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:2938:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=73 && LA50_0<=78)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKiVis.g:2938:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKiVis.g:2938:2: ()
                    // InternalKiVis.g:2939:2: 
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

                    // InternalKiVis.g:2947:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKiVis.g:2948:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKiVis.g:2948:1: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKiVis.g:2949:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:2965:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKiVis.g:2966:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKiVis.g:2966:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKiVis.g:2967:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
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
    // InternalKiVis.g:2991:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKiVis.g:2992:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKiVis.g:2993:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
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
    // InternalKiVis.g:3000:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3003:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKiVis.g:3004:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKiVis.g:3004:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalKiVis.g:3005:2: this_ValuedExpression_0= ruleValuedExpression
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
                    // InternalKiVis.g:3018:2: this_NotExpression_1= ruleNotExpression
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
    // InternalKiVis.g:3037:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKiVis.g:3038:2: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKiVis.g:3039:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
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
    // InternalKiVis.g:3046:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3049:28: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKiVis.g:3050:1: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKiVis.g:3050:1: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==80) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID||(LA52_0>=RULE_HOSTCODE && LA52_0<=RULE_BOOLEAN)||LA52_0==28||LA52_0==60||LA52_0==79||LA52_0==81) ) {
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
                    // InternalKiVis.g:3050:2: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKiVis.g:3050:2: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKiVis.g:3050:3: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKiVis.g:3050:3: ()
                    // InternalKiVis.g:3051:2: 
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

                    // InternalKiVis.g:3059:2: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKiVis.g:3060:1: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKiVis.g:3060:1: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKiVis.g:3061:3: lv_operator_1_0= ruleBitwiseNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getOperatorBitwiseNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:3077:2: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKiVis.g:3078:1: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKiVis.g:3078:1: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKiVis.g:3079:3: lv_subExpressions_2_0= ruleBitwiseNotExpression
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
                    // InternalKiVis.g:3097:2: this_AtomicExpression_3= ruleAtomicExpression
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
    // InternalKiVis.g:3116:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKiVis.g:3117:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKiVis.g:3118:2: iv_ruleNotExpression= ruleNotExpression EOF
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
    // InternalKiVis.g:3125:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3128:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKiVis.g:3129:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKiVis.g:3129:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==61) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ID||(LA53_0>=RULE_HOSTCODE && LA53_0<=RULE_BOOLEAN)||LA53_0==28||LA53_0==60||(LA53_0>=79 && LA53_0<=81)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalKiVis.g:3129:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKiVis.g:3129:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKiVis.g:3129:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKiVis.g:3129:3: ()
                    // InternalKiVis.g:3130:2: 
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

                    // InternalKiVis.g:3138:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKiVis.g:3139:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKiVis.g:3139:1: (lv_operator_1_0= ruleNotOperator )
                    // InternalKiVis.g:3140:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_42);
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

                    // InternalKiVis.g:3156:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKiVis.g:3157:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKiVis.g:3157:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKiVis.g:3158:3: lv_subExpressions_2_0= ruleNotExpression
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
                    // InternalKiVis.g:3176:2: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
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
    // InternalKiVis.g:3195:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKiVis.g:3196:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKiVis.g:3197:2: iv_ruleValuedExpression= ruleValuedExpression EOF
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
    // InternalKiVis.g:3204:1: ruleValuedExpression returns [EObject current=null] : this_ShiftLeftExpression_0= ruleShiftLeftExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftLeftExpression_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3207:28: (this_ShiftLeftExpression_0= ruleShiftLeftExpression )
            // InternalKiVis.g:3209:2: this_ShiftLeftExpression_0= ruleShiftLeftExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getShiftLeftExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ShiftLeftExpression_0=ruleShiftLeftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftLeftExpression_0; 
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


    // $ANTLR start "entryRuleShiftLeftExpression"
    // InternalKiVis.g:3228:1: entryRuleShiftLeftExpression returns [EObject current=null] : iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF ;
    public final EObject entryRuleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftLeftExpression = null;


        try {
            // InternalKiVis.g:3229:2: (iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF )
            // InternalKiVis.g:3230:2: iv_ruleShiftLeftExpression= ruleShiftLeftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftLeftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftLeftExpression=ruleShiftLeftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftLeftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftLeftExpression"


    // $ANTLR start "ruleShiftLeftExpression"
    // InternalKiVis.g:3237:1: ruleShiftLeftExpression returns [EObject current=null] : (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) ;
    public final EObject ruleShiftLeftExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3240:28: ( (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? ) )
            // InternalKiVis.g:3241:1: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            {
            // InternalKiVis.g:3241:1: (this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )? )
            // InternalKiVis.g:3242:2: this_ShiftRightExpression_0= ruleShiftRightExpression ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getShiftRightExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_47);
            this_ShiftRightExpression_0=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftRightExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3253:1: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalKiVis.g:3253:2: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    {
                    // InternalKiVis.g:3253:2: ()
                    // InternalKiVis.g:3254:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getShiftLeftExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalKiVis.g:3262:2: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) ) )
                    // InternalKiVis.g:3262:3: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    {
                    // InternalKiVis.g:3262:3: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKiVis.g:3263:1: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKiVis.g:3263:1: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKiVis.g:3264:3: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
                    lv_operator_2_0=ruleShiftLeftOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
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

                    // InternalKiVis.g:3280:2: ( (lv_subExpressions_3_0= ruleShiftRightExpression ) )
                    // InternalKiVis.g:3281:1: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    {
                    // InternalKiVis.g:3281:1: (lv_subExpressions_3_0= ruleShiftRightExpression )
                    // InternalKiVis.g:3282:3: lv_subExpressions_3_0= ruleShiftRightExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
                    lv_subExpressions_3_0=ruleShiftRightExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiVis.g:3298:3: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==52) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalKiVis.g:3298:5: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,52,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftLeftExpressionAccess().getLessThanSignLessThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3302:1: ( (lv_subExpressions_5_0= ruleShiftRightExpression ) )
                    	    // InternalKiVis.g:3303:1: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    {
                    	    // InternalKiVis.g:3303:1: (lv_subExpressions_5_0= ruleShiftRightExpression )
                    	    // InternalKiVis.g:3304:3: lv_subExpressions_5_0= ruleShiftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftLeftExpressionAccess().getSubExpressionsShiftRightExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
                    	    lv_subExpressions_5_0=ruleShiftRightExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getShiftLeftExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_5_0, 
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightExpression");
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
    // $ANTLR end "ruleShiftLeftExpression"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKiVis.g:3328:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKiVis.g:3329:2: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKiVis.g:3330:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
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
    // InternalKiVis.g:3337:1: ruleShiftRightExpression returns [EObject current=null] : (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ShiftRightUnsignedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3340:28: ( (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKiVis.g:3341:1: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKiVis.g:3341:1: (this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKiVis.g:3342:2: this_ShiftRightUnsignedExpression_0= ruleShiftRightUnsignedExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getShiftRightUnsignedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_49);
            this_ShiftRightUnsignedExpression_0=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftRightUnsignedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3353:1: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalKiVis.g:3353:2: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKiVis.g:3353:2: ()
                    // InternalKiVis.g:3354:2: 
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

                    // InternalKiVis.g:3362:2: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKiVis.g:3362:3: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKiVis.g:3362:3: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKiVis.g:3363:1: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKiVis.g:3363:1: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKiVis.g:3364:3: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3380:2: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKiVis.g:3381:1: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKiVis.g:3381:1: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKiVis.g:3382:3: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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

                    // InternalKiVis.g:3398:3: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==53) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalKiVis.g:3398:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3402:1: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKiVis.g:3403:1: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKiVis.g:3403:1: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKiVis.g:3404:3: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_49);
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
                    	    break loop56;
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
    // InternalKiVis.g:3428:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKiVis.g:3429:2: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKiVis.g:3430:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
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
    // InternalKiVis.g:3437:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3440:28: ( (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? ) )
            // InternalKiVis.g:3441:1: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            {
            // InternalKiVis.g:3441:1: (this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )? )
            // InternalKiVis.g:3442:2: this_AddExpression_0= ruleAddExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getAddExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_50);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3453:1: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalKiVis.g:3453:2: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    {
                    // InternalKiVis.g:3453:2: ()
                    // InternalKiVis.g:3454:2: 
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

                    // InternalKiVis.g:3462:2: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) ) )
                    // InternalKiVis.g:3462:3: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    {
                    // InternalKiVis.g:3462:3: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKiVis.g:3463:1: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKiVis.g:3463:1: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKiVis.g:3464:3: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3480:2: ( (lv_subExpressions_3_0= ruleAddExpression ) )
                    // InternalKiVis.g:3481:1: (lv_subExpressions_3_0= ruleAddExpression )
                    {
                    // InternalKiVis.g:3481:1: (lv_subExpressions_3_0= ruleAddExpression )
                    // InternalKiVis.g:3482:3: lv_subExpressions_3_0= ruleAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_50);
                    lv_subExpressions_3_0=ruleAddExpression();

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
                              		"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }

                    // InternalKiVis.g:3498:3: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==54) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalKiVis.g:3498:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3502:1: ( (lv_subExpressions_5_0= ruleAddExpression ) )
                    	    // InternalKiVis.g:3503:1: (lv_subExpressions_5_0= ruleAddExpression )
                    	    {
                    	    // InternalKiVis.g:3503:1: (lv_subExpressions_5_0= ruleAddExpression )
                    	    // InternalKiVis.g:3504:3: lv_subExpressions_5_0= ruleAddExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_50);
                    	    lv_subExpressions_5_0=ruleAddExpression();

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
                    	              		"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
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


    // $ANTLR start "entryRuleAddExpression"
    // InternalKiVis.g:3528:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKiVis.g:3529:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKiVis.g:3530:2: iv_ruleAddExpression= ruleAddExpression EOF
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
    // InternalKiVis.g:3537:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3540:28: ( (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? ) )
            // InternalKiVis.g:3541:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            {
            // InternalKiVis.g:3541:1: (this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )? )
            // InternalKiVis.g:3542:2: this_SubExpression_0= ruleSubExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_51);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3553:1: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==55) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalKiVis.g:3553:2: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKiVis.g:3553:2: ()
                    // InternalKiVis.g:3554:2: 
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

                    // InternalKiVis.g:3562:2: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKiVis.g:3562:3: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKiVis.g:3562:3: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKiVis.g:3563:1: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKiVis.g:3563:1: (lv_operator_2_0= ruleAddOperator )
                    // InternalKiVis.g:3564:3: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3580:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKiVis.g:3581:1: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKiVis.g:3581:1: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKiVis.g:3582:3: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
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

                    // InternalKiVis.g:3598:3: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==55) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalKiVis.g:3598:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3602:1: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKiVis.g:3603:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKiVis.g:3603:1: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKiVis.g:3604:3: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_51);
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
                    	    break loop60;
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
    // InternalKiVis.g:3628:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKiVis.g:3629:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKiVis.g:3630:2: iv_ruleSubExpression= ruleSubExpression EOF
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
    // InternalKiVis.g:3637:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3640:28: ( (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? ) )
            // InternalKiVis.g:3641:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            {
            // InternalKiVis.g:3641:1: (this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )? )
            // InternalKiVis.g:3642:2: this_MultExpression_0= ruleMultExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_52);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3653:1: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==39) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKiVis.g:3653:2: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    {
                    // InternalKiVis.g:3653:2: ()
                    // InternalKiVis.g:3654:2: 
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

                    // InternalKiVis.g:3662:2: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )
                    // InternalKiVis.g:3662:3: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    {
                    // InternalKiVis.g:3662:3: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKiVis.g:3663:1: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKiVis.g:3663:1: (lv_operator_2_0= ruleSubOperator )
                    // InternalKiVis.g:3664:3: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3680:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
                    // InternalKiVis.g:3681:1: (lv_subExpressions_3_0= ruleMultExpression )
                    {
                    // InternalKiVis.g:3681:1: (lv_subExpressions_3_0= ruleMultExpression )
                    // InternalKiVis.g:3682:3: lv_subExpressions_3_0= ruleMultExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_52);
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

                    // InternalKiVis.g:3698:3: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==39) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalKiVis.g:3698:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3702:1: ( (lv_subExpressions_5_0= ruleMultExpression ) )
                    	    // InternalKiVis.g:3703:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    {
                    	    // InternalKiVis.g:3703:1: (lv_subExpressions_5_0= ruleMultExpression )
                    	    // InternalKiVis.g:3704:3: lv_subExpressions_5_0= ruleMultExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_52);
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
                    	    break loop62;
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
    // InternalKiVis.g:3728:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // InternalKiVis.g:3729:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // InternalKiVis.g:3730:2: iv_ruleMultExpression= ruleMultExpression EOF
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
    // InternalKiVis.g:3737:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3740:28: ( (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? ) )
            // InternalKiVis.g:3741:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            {
            // InternalKiVis.g:3741:1: (this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )? )
            // InternalKiVis.g:3742:2: this_DivExpression_0= ruleDivExpression ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_53);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3753:1: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKiVis.g:3753:2: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    {
                    // InternalKiVis.g:3753:2: ()
                    // InternalKiVis.g:3754:2: 
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

                    // InternalKiVis.g:3762:2: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )
                    // InternalKiVis.g:3762:3: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    {
                    // InternalKiVis.g:3762:3: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKiVis.g:3763:1: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKiVis.g:3763:1: (lv_operator_2_0= ruleMultOperator )
                    // InternalKiVis.g:3764:3: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3780:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
                    // InternalKiVis.g:3781:1: (lv_subExpressions_3_0= ruleDivExpression )
                    {
                    // InternalKiVis.g:3781:1: (lv_subExpressions_3_0= ruleDivExpression )
                    // InternalKiVis.g:3782:3: lv_subExpressions_3_0= ruleDivExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
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

                    // InternalKiVis.g:3798:3: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==56) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalKiVis.g:3798:5: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,56,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3802:1: ( (lv_subExpressions_5_0= ruleDivExpression ) )
                    	    // InternalKiVis.g:3803:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    {
                    	    // InternalKiVis.g:3803:1: (lv_subExpressions_5_0= ruleDivExpression )
                    	    // InternalKiVis.g:3804:3: lv_subExpressions_5_0= ruleDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_53);
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
                    	    break loop64;
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
    // InternalKiVis.g:3828:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // InternalKiVis.g:3829:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // InternalKiVis.g:3830:2: iv_ruleDivExpression= ruleDivExpression EOF
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
    // InternalKiVis.g:3837:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3840:28: ( (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? ) )
            // InternalKiVis.g:3841:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            {
            // InternalKiVis.g:3841:1: (this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )? )
            // InternalKiVis.g:3842:2: this_ModExpression_0= ruleModExpression ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_54);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3853:1: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==57) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKiVis.g:3853:2: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    {
                    // InternalKiVis.g:3853:2: ()
                    // InternalKiVis.g:3854:2: 
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

                    // InternalKiVis.g:3862:2: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )
                    // InternalKiVis.g:3862:3: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // InternalKiVis.g:3862:3: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKiVis.g:3863:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKiVis.g:3863:1: (lv_operator_2_0= ruleDivOperator )
                    // InternalKiVis.g:3864:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3880:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // InternalKiVis.g:3881:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // InternalKiVis.g:3881:1: (lv_subExpressions_3_0= ruleModExpression )
                    // InternalKiVis.g:3882:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_54);
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

                    // InternalKiVis.g:3898:3: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==57) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalKiVis.g:3898:5: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,57,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDivExpressionAccess().getSolidusKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:3902:1: ( (lv_subExpressions_5_0= ruleModExpression ) )
                    	    // InternalKiVis.g:3903:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    {
                    	    // InternalKiVis.g:3903:1: (lv_subExpressions_5_0= ruleModExpression )
                    	    // InternalKiVis.g:3904:3: lv_subExpressions_5_0= ruleModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_54);
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
                    	    break loop66;
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
    // InternalKiVis.g:3928:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // InternalKiVis.g:3929:2: (iv_ruleModExpression= ruleModExpression EOF )
            // InternalKiVis.g:3930:2: iv_ruleModExpression= ruleModExpression EOF
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
    // InternalKiVis.g:3937:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:3940:28: ( (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKiVis.g:3941:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKiVis.g:3941:1: (this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKiVis.g:3942:2: this_NegExpression_0= ruleNegExpression ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_55);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalKiVis.g:3953:1: ( () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==58) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalKiVis.g:3953:2: () ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKiVis.g:3953:2: ()
                    // InternalKiVis.g:3954:2: 
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

                    // InternalKiVis.g:3962:2: ( ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiVis.g:3962:3: ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiVis.g:3962:3: ( (lv_operator_2_0= ruleModOperator ) )
                    // InternalKiVis.g:3963:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // InternalKiVis.g:3963:1: (lv_operator_2_0= ruleModOperator )
                    // InternalKiVis.g:3964:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:3980:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiVis.g:3981:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiVis.g:3981:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiVis.g:3982:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_55);
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

                    // InternalKiVis.g:3998:3: (otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==58) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalKiVis.g:3998:5: otherlv_4= '%' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,58,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getModExpressionAccess().getPercentSignKeyword_1_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:4002:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKiVis.g:4003:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKiVis.g:4003:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKiVis.g:4004:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_55);
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
                    	    break loop68;
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
    // InternalKiVis.g:4028:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKiVis.g:4029:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKiVis.g:4030:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKiVis.g:4037:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:4040:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKiVis.g:4041:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKiVis.g:4041:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==39) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_BOOLEAN)||LA70_0==20||LA70_0==28||LA70_0==60||LA70_0==79||LA70_0==81) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalKiVis.g:4041:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKiVis.g:4041:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKiVis.g:4041:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKiVis.g:4041:3: ()
                    // InternalKiVis.g:4042:2: 
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

                    // InternalKiVis.g:4050:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKiVis.g:4051:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKiVis.g:4051:1: (lv_operator_1_0= ruleSubOperator )
                    // InternalKiVis.g:4052:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:4068:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKiVis.g:4069:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKiVis.g:4069:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKiVis.g:4070:3: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalKiVis.g:4088:2: this_TernaryOperation_3= ruleTernaryOperation
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
    // InternalKiVis.g:4107:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKiVis.g:4108:2: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKiVis.g:4109:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
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
    // InternalKiVis.g:4116:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_AtomicValuedExpression_6 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:4119:28: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression ) )
            // InternalKiVis.g:4120:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )
            {
            // InternalKiVis.g:4120:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalKiVis.g:4120:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKiVis.g:4120:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    // InternalKiVis.g:4120:3: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKiVis.g:4120:3: ()
                    // InternalKiVis.g:4121:2: 
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

                    // InternalKiVis.g:4129:2: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKiVis.g:4130:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiVis.g:4130:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKiVis.g:4131:3: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_56);
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

                    // InternalKiVis.g:4147:2: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKiVis.g:4148:1: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKiVis.g:4148:1: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKiVis.g:4149:3: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
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

                    // InternalKiVis.g:4165:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKiVis.g:4166:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiVis.g:4166:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKiVis.g:4167:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
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

                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4());
                          
                    }
                    // InternalKiVis.g:4187:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    // InternalKiVis.g:4188:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    {
                    // InternalKiVis.g:4188:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    // InternalKiVis.g:4189:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0()); 
                      	    
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


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:4207:2: this_AtomicValuedExpression_6= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTernaryOperationAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_6=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_6; 
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


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKiVis.g:4226:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKiVis.g:4227:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKiVis.g:4228:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKiVis.g:4235:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) ;
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
            // InternalKiVis.g:4238:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression ) )
            // InternalKiVis.g:4239:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            {
            // InternalKiVis.g:4239:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )
            int alt72=6;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalKiVis.g:4240:2: this_BoolValue_0= ruleBoolValue
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
                    // InternalKiVis.g:4253:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
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
                    // InternalKiVis.g:4265:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKiVis.g:4265:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKiVis.g:4265:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:4287:2: this_ReferenceCall_5= ruleReferenceCall
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
                    // InternalKiVis.g:4300:2: this_FunctionCall_6= ruleFunctionCall
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
                    // InternalKiVis.g:4313:2: this_TextExpression_7= ruleTextExpression
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
    // InternalKiVis.g:4332:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKiVis.g:4333:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKiVis.g:4334:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKiVis.g:4341:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
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
            // InternalKiVis.g:4344:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKiVis.g:4345:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKiVis.g:4345:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt73=6;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalKiVis.g:4346:2: this_IntValue_0= ruleIntValue
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
                    // InternalKiVis.g:4359:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalKiVis.g:4372:2: this_StringValue_2= ruleStringValue
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
                    // InternalKiVis.g:4385:2: this_VectorValue_3= ruleVectorValue
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
                    // InternalKiVis.g:4397:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKiVis.g:4397:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKiVis.g:4397:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiVis.g:4419:2: this_AtomicExpression_7= ruleAtomicExpression
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
    // InternalKiVis.g:4438:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKiVis.g:4439:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKiVis.g:4440:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKiVis.g:4447:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // InternalKiVis.g:4450:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // InternalKiVis.g:4451:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // InternalKiVis.g:4451:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==79||LA75_0==81) ) {
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
                    // InternalKiVis.g:4451:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // InternalKiVis.g:4451:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // InternalKiVis.g:4451:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // InternalKiVis.g:4451:3: ()
                    // InternalKiVis.g:4452:2: 
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

                    // InternalKiVis.g:4460:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKiVis.g:4461:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKiVis.g:4461:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKiVis.g:4462:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKiVis.g:4462:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==79) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==81) ) {
                        alt74=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalKiVis.g:4463:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_58);
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
                            // InternalKiVis.g:4478:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_58);
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

                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // InternalKiVis.g:4500:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKiVis.g:4501:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKiVis.g:4501:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKiVis.g:4502:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_57);
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

                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:4524:2: this_ValuedObjectReference_5= ruleValuedObjectReference
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
    // InternalKiVis.g:4543:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKiVis.g:4544:2: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKiVis.g:4545:2: iv_rulePrimeID= rulePrimeID EOF
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
    // InternalKiVis.g:4552:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:4555:28: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKiVis.g:4556:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKiVis.g:4556:1: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKiVis.g:4556:6: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiVis.g:4563:1: (kw= '\\'' )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==59) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalKiVis.g:4564:2: kw= '\\''
            	    {
            	    kw=(Token)match(input,59,FollowSets000.FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // InternalKiVis.g:4577:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKiVis.g:4578:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKiVis.g:4579:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKiVis.g:4586:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:4589:28: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKiVis.g:4590:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKiVis.g:4590:1: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKiVis.g:4590:2: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKiVis.g:4590:2: ( ( rulePrimeID ) )
            // InternalKiVis.g:4591:1: ( rulePrimeID )
            {
            // InternalKiVis.g:4591:1: ( rulePrimeID )
            // InternalKiVis.g:4592:3: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_61);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiVis.g:4608:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==45) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalKiVis.g:4608:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // InternalKiVis.g:4612:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKiVis.g:4613:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKiVis.g:4613:1: (lv_indices_2_0= ruleExpression )
            	    // InternalKiVis.g:4614:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
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

            	    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            // InternalKiVis.g:4634:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==38) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalKiVis.g:4634:5: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                          
                    }
                    // InternalKiVis.g:4638:1: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKiVis.g:4639:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKiVis.g:4639:1: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKiVis.g:4640:3: lv_subReference_5_0= ruleValuedObjectReference
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
    // InternalKiVis.g:4664:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKiVis.g:4665:2: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKiVis.g:4666:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
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
    // InternalKiVis.g:4673:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:4676:28: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKiVis.g:4677:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKiVis.g:4677:1: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKiVis.g:4677:2: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKiVis.g:4677:2: ( ( rulePrimeID ) )
            // InternalKiVis.g:4678:1: ( rulePrimeID )
            {
            // InternalKiVis.g:4678:1: ( rulePrimeID )
            // InternalKiVis.g:4679:3: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_36);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiVis.g:4695:2: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKiVis.g:4696:1: (lv_priority_1_0= RULE_INT )
            {
            // InternalKiVis.g:4696:1: (lv_priority_1_0= RULE_INT )
            // InternalKiVis.g:4697:3: lv_priority_1_0= RULE_INT
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
    // InternalKiVis.g:4721:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKiVis.g:4722:2: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKiVis.g:4723:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
    // InternalKiVis.g:4730:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
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
            // InternalKiVis.g:4733:28: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKiVis.g:4734:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKiVis.g:4734:1: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKiVis.g:4734:2: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKiVis.g:4734:2: ( ( rulePrimeID ) )
            // InternalKiVis.g:4735:1: ( rulePrimeID )
            {
            // InternalKiVis.g:4735:1: ( rulePrimeID )
            // InternalKiVis.g:4736:3: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_18);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalKiVis.g:4752:2: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==28) ) {
                alt80=1;
            }
            else if ( (LA80_0==31) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalKiVis.g:4752:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKiVis.g:4752:3: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKiVis.g:4752:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // InternalKiVis.g:4756:1: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKiVis.g:4757:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKiVis.g:4757:1: (lv_parameters_2_0= ruleParameter )
                    // InternalKiVis.g:4758:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
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

                    // InternalKiVis.g:4774:2: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==29) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalKiVis.g:4774:4: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:4778:1: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKiVis.g:4779:1: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKiVis.g:4779:1: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKiVis.g:4780:3: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
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
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:4801:7: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:4813:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKiVis.g:4814:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKiVis.g:4815:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKiVis.g:4822:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
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
            // InternalKiVis.g:4825:28: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKiVis.g:4826:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKiVis.g:4826:1: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKiVis.g:4826:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
                  
            }
            // InternalKiVis.g:4830:1: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKiVis.g:4831:1: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKiVis.g:4831:1: (lv_functionName_1_0= RULE_ID )
            // InternalKiVis.g:4832:3: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_18); if (state.failed) return current;
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
                      		"de.cau.cs.kieler.prom.KiBuild.ID");
              	    
            }

            }


            }

            // InternalKiVis.g:4848:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==28) ) {
                alt82=1;
            }
            else if ( (LA82_0==31) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalKiVis.g:4848:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKiVis.g:4848:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKiVis.g:4848:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // InternalKiVis.g:4852:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKiVis.g:4853:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKiVis.g:4853:1: (lv_parameters_3_0= ruleParameter )
                    // InternalKiVis.g:4854:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
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

                    // InternalKiVis.g:4870:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==29) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalKiVis.g:4870:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // InternalKiVis.g:4874:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKiVis.g:4875:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKiVis.g:4875:1: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKiVis.g:4876:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
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
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:4897:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:4909:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKiVis.g:4910:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalKiVis.g:4911:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKiVis.g:4918:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:4921:28: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKiVis.g:4922:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKiVis.g:4922:1: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKiVis.g:4922:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKiVis.g:4922:2: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==61) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==51) ) {
                    alt84=1;
                }
            }
            else if ( (LA84_0==51) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalKiVis.g:4922:3: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKiVis.g:4922:3: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==61) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalKiVis.g:4923:1: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKiVis.g:4923:1: (lv_pureOutput_0_0= '!' )
                            // InternalKiVis.g:4924:3: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,61,FollowSets000.FOLLOW_63); if (state.failed) return current;
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

                    // InternalKiVis.g:4937:3: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKiVis.g:4938:1: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKiVis.g:4938:1: (lv_callByReference_1_0= '&' )
                    // InternalKiVis.g:4939:3: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,51,FollowSets000.FOLLOW_42); if (state.failed) return current;
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

            // InternalKiVis.g:4952:4: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKiVis.g:4953:1: (lv_expression_2_0= ruleExpression )
            {
            // InternalKiVis.g:4953:1: (lv_expression_2_0= ruleExpression )
            // InternalKiVis.g:4954:3: lv_expression_2_0= ruleExpression
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
    // InternalKiVis.g:4978:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKiVis.g:4979:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKiVis.g:4980:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKiVis.g:4987:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:4990:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // InternalKiVis.g:4991:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // InternalKiVis.g:4991:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // InternalKiVis.g:4992:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // InternalKiVis.g:4992:1: (lv_text_0_0= RULE_HOSTCODE )
            // InternalKiVis.g:4993:3: lv_text_0_0= RULE_HOSTCODE
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
    // InternalKiVis.g:5017:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKiVis.g:5018:2: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKiVis.g:5019:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKiVis.g:5026:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:5029:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKiVis.g:5030:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKiVis.g:5030:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalKiVis.g:5031:1: (lv_value_0_0= RULE_INT )
            {
            // InternalKiVis.g:5031:1: (lv_value_0_0= RULE_INT )
            // InternalKiVis.g:5032:3: lv_value_0_0= RULE_INT
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
    // InternalKiVis.g:5056:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKiVis.g:5057:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKiVis.g:5058:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKiVis.g:5065:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:5068:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKiVis.g:5069:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKiVis.g:5069:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKiVis.g:5070:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKiVis.g:5070:1: (lv_value_0_0= RULE_FLOAT )
            // InternalKiVis.g:5071:3: lv_value_0_0= RULE_FLOAT
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
    // InternalKiVis.g:5095:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKiVis.g:5096:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKiVis.g:5097:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKiVis.g:5104:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:5107:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKiVis.g:5108:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKiVis.g:5108:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKiVis.g:5109:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKiVis.g:5109:1: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKiVis.g:5110:3: lv_value_0_0= RULE_BOOLEAN
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
                      		"de.cau.cs.kieler.prom.KiBuild.BOOLEAN");
              	    
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
    // InternalKiVis.g:5134:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKiVis.g:5135:2: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKiVis.g:5136:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKiVis.g:5143:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:5146:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKiVis.g:5147:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKiVis.g:5147:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKiVis.g:5148:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalKiVis.g:5148:1: (lv_value_0_0= RULE_STRING )
            // InternalKiVis.g:5149:3: lv_value_0_0= RULE_STRING
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
    // InternalKiVis.g:5173:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKiVis.g:5174:2: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKiVis.g:5175:2: iv_ruleVectorValue= ruleVectorValue EOF
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
    // InternalKiVis.g:5182:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5185:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKiVis.g:5186:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKiVis.g:5186:1: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKiVis.g:5186:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // InternalKiVis.g:5190:1: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKiVis.g:5191:1: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKiVis.g:5191:1: (lv_values_1_0= ruleVectorValueMember )
            // InternalKiVis.g:5192:3: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_65);
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

            // InternalKiVis.g:5208:2: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==29) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalKiVis.g:5208:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_64); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalKiVis.g:5212:1: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKiVis.g:5213:1: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKiVis.g:5213:1: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKiVis.g:5214:3: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_65);
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
            	    break loop85;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:5242:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKiVis.g:5243:2: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKiVis.g:5244:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
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
    // InternalKiVis.g:5251:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5254:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKiVis.g:5255:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKiVis.g:5255:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt86=3;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalKiVis.g:5256:2: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKiVis.g:5269:2: this_ValuedExpression_1= ruleValuedExpression
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
                    // InternalKiVis.g:5282:2: this_IgnoreValue_2= ruleIgnoreValue
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
    // InternalKiVis.g:5301:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKiVis.g:5302:2: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKiVis.g:5303:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
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
    // InternalKiVis.g:5310:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:5313:28: ( ( () otherlv_1= '_' ) )
            // InternalKiVis.g:5314:1: ( () otherlv_1= '_' )
            {
            // InternalKiVis.g:5314:1: ( () otherlv_1= '_' )
            // InternalKiVis.g:5314:2: () otherlv_1= '_'
            {
            // InternalKiVis.g:5314:2: ()
            // InternalKiVis.g:5315:2: 
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

            otherlv_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:5337:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKiVis.g:5338:2: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKiVis.g:5339:2: iv_ruleAnyValue= ruleAnyValue EOF
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
    // InternalKiVis.g:5346:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5349:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKiVis.g:5350:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKiVis.g:5350:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt87=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt87=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt87=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt87=3;
                }
                break;
            case RULE_STRING:
                {
                alt87=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalKiVis.g:5351:2: this_IntValue_0= ruleIntValue
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
                    // InternalKiVis.g:5364:2: this_FloatValue_1= ruleFloatValue
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
                    // InternalKiVis.g:5377:2: this_BoolValue_2= ruleBoolValue
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
                    // InternalKiVis.g:5390:2: this_StringValue_3= ruleStringValue
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKiVis.g:5419:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKiVis.g:5420:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKiVis.g:5421:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKiVis.g:5428:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:5431:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKiVis.g:5432:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKiVis.g:5432:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKiVis.g:5433:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKiVis.g:5433:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKiVis.g:5434:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalKiVis.g:5460:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKiVis.g:5461:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKiVis.g:5462:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKiVis.g:5469:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5472:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiVis.g:5473:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiVis.g:5473:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiVis.g:5473:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:5477:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5478:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5478:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5479:3: lv_name_1_0= ruleExtendedID
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
    // InternalKiVis.g:5503:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKiVis.g:5504:2: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKiVis.g:5505:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKiVis.g:5512:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5515:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKiVis.g:5516:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKiVis.g:5516:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKiVis.g:5516:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiVis.g:5520:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5521:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5521:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5522:3: lv_name_1_0= ruleExtendedID
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
    // InternalKiVis.g:5546:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKiVis.g:5547:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKiVis.g:5548:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKiVis.g:5555:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5558:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiVis.g:5559:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiVis.g:5559:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiVis.g:5559:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:5563:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5564:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5564:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5565:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_66);
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

            // InternalKiVis.g:5581:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiVis.g:5582:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiVis.g:5582:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiVis.g:5583:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiVis.g:5599:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==29) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalKiVis.g:5599:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiVis.g:5603:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiVis.g:5604:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiVis.g:5604:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiVis.g:5605:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	    break loop88;
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
    // InternalKiVis.g:5629:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKiVis.g:5630:2: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKiVis.g:5631:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKiVis.g:5638:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5641:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiVis.g:5642:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiVis.g:5642:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKiVis.g:5642:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:5646:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5647:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5647:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5648:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_67);
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

            // InternalKiVis.g:5664:2: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKiVis.g:5665:1: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKiVis.g:5665:1: (lv_values_2_0= ruleEStringBoolean )
            // InternalKiVis.g:5666:3: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiVis.g:5682:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==29) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalKiVis.g:5682:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiVis.g:5686:1: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKiVis.g:5687:1: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKiVis.g:5687:1: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKiVis.g:5688:3: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	    break loop89;
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
    // InternalKiVis.g:5712:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKiVis.g:5713:2: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKiVis.g:5714:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKiVis.g:5721:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:5724:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiVis.g:5725:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiVis.g:5725:1: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKiVis.g:5725:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
                  
            }
            // InternalKiVis.g:5729:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5730:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5730:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5731:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_66);
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

            // InternalKiVis.g:5747:2: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKiVis.g:5748:1: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKiVis.g:5748:1: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKiVis.g:5749:3: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiVis.g:5765:2: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==29) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalKiVis.g:5765:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiVis.g:5769:1: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKiVis.g:5770:1: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiVis.g:5770:1: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKiVis.g:5771:3: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
            	    break loop90;
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
    // InternalKiVis.g:5795:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiVis.g:5796:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKiVis.g:5797:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKiVis.g:5804:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKiVis.g:5807:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKiVis.g:5808:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKiVis.g:5808:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKiVis.g:5808:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:5812:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5813:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5813:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5814:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_68);
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

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiVis.g:5834:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiVis.g:5835:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiVis.g:5835:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiVis.g:5836:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiVis.g:5856:1: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKiVis.g:5857:1: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKiVis.g:5857:1: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKiVis.g:5858:3: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiVis.g:5874:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==29) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalKiVis.g:5874:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_66); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiVis.g:5878:1: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKiVis.g:5879:1: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKiVis.g:5879:1: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKiVis.g:5880:3: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKiVis.g:5904:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiVis.g:5905:2: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKiVis.g:5906:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKiVis.g:5913:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKiVis.g:5916:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKiVis.g:5917:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKiVis.g:5917:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKiVis.g:5917:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:5921:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:5922:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:5922:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:5923:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_68);
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

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiVis.g:5943:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiVis.g:5944:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiVis.g:5944:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiVis.g:5945:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiVis.g:5965:1: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKiVis.g:5966:1: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKiVis.g:5966:1: (lv_values_5_0= ruleEStringBoolean )
            // InternalKiVis.g:5967:3: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalKiVis.g:5983:2: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==29) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalKiVis.g:5983:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiVis.g:5987:1: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKiVis.g:5988:1: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKiVis.g:5988:1: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKiVis.g:5989:3: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKiVis.g:6013:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKiVis.g:6014:2: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKiVis.g:6015:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKiVis.g:6022:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:6025:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKiVis.g:6026:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKiVis.g:6026:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKiVis.g:6026:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:6030:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:6031:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:6031:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:6032:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalKiVis.g:6048:2: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKiVis.g:6049:1: (lv_values_2_0= RULE_STRING )
            {
            // InternalKiVis.g:6049:1: (lv_values_2_0= RULE_STRING )
            // InternalKiVis.g:6050:3: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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

            // InternalKiVis.g:6066:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==29) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalKiVis.g:6066:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalKiVis.g:6070:1: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKiVis.g:6071:1: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKiVis.g:6071:1: (lv_values_4_0= RULE_STRING )
            	    // InternalKiVis.g:6072:3: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKiVis.g:6096:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKiVis.g:6097:2: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKiVis.g:6098:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKiVis.g:6105:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKiVis.g:6108:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKiVis.g:6109:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKiVis.g:6109:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKiVis.g:6109:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalKiVis.g:6113:1: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKiVis.g:6114:1: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKiVis.g:6114:1: (lv_name_1_0= ruleExtendedID )
            // InternalKiVis.g:6115:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_68);
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

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // InternalKiVis.g:6135:1: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKiVis.g:6136:1: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKiVis.g:6136:1: (lv_type_3_0= ruleExtendedID )
            // InternalKiVis.g:6137:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // InternalKiVis.g:6157:1: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKiVis.g:6158:1: (lv_values_5_0= RULE_STRING )
            {
            // InternalKiVis.g:6158:1: (lv_values_5_0= RULE_STRING )
            // InternalKiVis.g:6159:3: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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

            // InternalKiVis.g:6175:2: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==29) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalKiVis.g:6175:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // InternalKiVis.g:6179:1: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKiVis.g:6180:1: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKiVis.g:6180:1: (lv_values_7_0= RULE_STRING )
            	    // InternalKiVis.g:6181:3: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKiVis.g:6207:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKiVis.g:6208:2: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKiVis.g:6209:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKiVis.g:6216:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:6219:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKiVis.g:6220:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKiVis.g:6220:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt95=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt95=1;
                }
                break;
            case RULE_ID:
                {
                alt95=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalKiVis.g:6220:6: this_STRING_0= RULE_STRING
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
                    // InternalKiVis.g:6229:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiVis.g:6240:10: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKiVis.g:6255:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKiVis.g:6256:2: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKiVis.g:6257:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKiVis.g:6264:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;


         enterRule(); 
            
        try {
            // InternalKiVis.g:6267:28: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKiVis.g:6268:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKiVis.g:6268:1: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt96=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt96=1;
                }
                break;
            case RULE_ID:
                {
                alt96=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt96=3;
                }
                break;
            case 39:
                {
                int LA96_4 = input.LA(2);

                if ( (LA96_4==RULE_INT) ) {
                    alt96=4;
                }
                else if ( (LA96_4==RULE_FLOAT) ) {
                    alt96=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt96=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt96=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalKiVis.g:6268:6: this_STRING_0= RULE_STRING
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
                    // InternalKiVis.g:6277:5: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKiVis.g:6288:10: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKiVis.g:6297:5: this_Integer_3= ruleInteger
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
                    // InternalKiVis.g:6309:5: this_Floateger_4= ruleFloateger
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
    // InternalKiVis.g:6327:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKiVis.g:6328:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKiVis.g:6329:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKiVis.g:6336:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:6339:28: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKiVis.g:6340:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKiVis.g:6340:1: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKiVis.g:6340:6: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalKiVis.g:6347:1: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==39) ) {
                    int LA98_2 = input.LA(2);

                    if ( (LA98_2==RULE_ID) ) {
                        alt98=1;
                    }


                }
                else if ( (LA98_0==38) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalKiVis.g:6347:2: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKiVis.g:6347:2: (kw= '.' | kw= '-' )
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==38) ) {
            	        alt97=1;
            	    }
            	    else if ( (LA97_0==39) ) {
            	        alt97=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 97, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // InternalKiVis.g:6348:2: kw= '.'
            	            {
            	            kw=(Token)match(input,38,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0()); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiVis.g:6355:2: kw= '-'
            	            {
            	            kw=(Token)match(input,39,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            // InternalKiVis.g:6367:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==64) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalKiVis.g:6368:2: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
    // InternalKiVis.g:6390:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKiVis.g:6391:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalKiVis.g:6392:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKiVis.g:6399:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:6402:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKiVis.g:6403:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKiVis.g:6403:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKiVis.g:6403:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKiVis.g:6403:2: (kw= '-' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==39) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalKiVis.g:6404:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
    // InternalKiVis.g:6424:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKiVis.g:6425:2: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKiVis.g:6426:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKiVis.g:6433:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // InternalKiVis.g:6436:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKiVis.g:6437:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKiVis.g:6437:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKiVis.g:6437:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKiVis.g:6437:2: (kw= '-' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==39) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalKiVis.g:6438:2: kw= '-'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_38); if (state.failed) return current;
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


    // $ANTLR start "ruleDOMEvent"
    // InternalKiVis.g:6458:1: ruleDOMEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'click' ) | (enumLiteral_1= 'mousedown' ) | (enumLiteral_2= 'mouseup' ) | (enumLiteral_3= 'mousemove' ) ) ;
    public final Enumerator ruleDOMEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6460:28: ( ( (enumLiteral_0= 'click' ) | (enumLiteral_1= 'mousedown' ) | (enumLiteral_2= 'mouseup' ) | (enumLiteral_3= 'mousemove' ) ) )
            // InternalKiVis.g:6461:1: ( (enumLiteral_0= 'click' ) | (enumLiteral_1= 'mousedown' ) | (enumLiteral_2= 'mouseup' ) | (enumLiteral_3= 'mousemove' ) )
            {
            // InternalKiVis.g:6461:1: ( (enumLiteral_0= 'click' ) | (enumLiteral_1= 'mousedown' ) | (enumLiteral_2= 'mouseup' ) | (enumLiteral_3= 'mousemove' ) )
            int alt102=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt102=1;
                }
                break;
            case 66:
                {
                alt102=2;
                }
                break;
            case 67:
                {
                alt102=3;
                }
                break;
            case 68:
                {
                alt102=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalKiVis.g:6461:2: (enumLiteral_0= 'click' )
                    {
                    // InternalKiVis.g:6461:2: (enumLiteral_0= 'click' )
                    // InternalKiVis.g:6461:4: enumLiteral_0= 'click'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDOMEventAccess().getCLICKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getDOMEventAccess().getCLICKEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:6467:6: (enumLiteral_1= 'mousedown' )
                    {
                    // InternalKiVis.g:6467:6: (enumLiteral_1= 'mousedown' )
                    // InternalKiVis.g:6467:8: enumLiteral_1= 'mousedown'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDOMEventAccess().getMOUSEDOWNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getDOMEventAccess().getMOUSEDOWNEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:6473:6: (enumLiteral_2= 'mouseup' )
                    {
                    // InternalKiVis.g:6473:6: (enumLiteral_2= 'mouseup' )
                    // InternalKiVis.g:6473:8: enumLiteral_2= 'mouseup'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDOMEventAccess().getMOUSEUPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getDOMEventAccess().getMOUSEUPEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:6479:6: (enumLiteral_3= 'mousemove' )
                    {
                    // InternalKiVis.g:6479:6: (enumLiteral_3= 'mousemove' )
                    // InternalKiVis.g:6479:8: enumLiteral_3= 'mousemove'
                    {
                    enumLiteral_3=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getDOMEventAccess().getMOUSEMOVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getDOMEventAccess().getMOUSEMOVEEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleDOMEvent"


    // $ANTLR start "ruleSimulationOperation"
    // InternalKiVis.g:6489:1: ruleSimulationOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'stop' ) | (enumLiteral_2= 'pause' ) | (enumLiteral_3= 'play' ) ) ;
    public final Enumerator ruleSimulationOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6491:28: ( ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'stop' ) | (enumLiteral_2= 'pause' ) | (enumLiteral_3= 'play' ) ) )
            // InternalKiVis.g:6492:1: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'stop' ) | (enumLiteral_2= 'pause' ) | (enumLiteral_3= 'play' ) )
            {
            // InternalKiVis.g:6492:1: ( (enumLiteral_0= 'step' ) | (enumLiteral_1= 'stop' ) | (enumLiteral_2= 'pause' ) | (enumLiteral_3= 'play' ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt103=1;
                }
                break;
            case 70:
                {
                alt103=2;
                }
                break;
            case 71:
                {
                alt103=3;
                }
                break;
            case 72:
                {
                alt103=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalKiVis.g:6492:2: (enumLiteral_0= 'step' )
                    {
                    // InternalKiVis.g:6492:2: (enumLiteral_0= 'step' )
                    // InternalKiVis.g:6492:4: enumLiteral_0= 'step'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSimulationOperationAccess().getSTEPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSimulationOperationAccess().getSTEPEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:6498:6: (enumLiteral_1= 'stop' )
                    {
                    // InternalKiVis.g:6498:6: (enumLiteral_1= 'stop' )
                    // InternalKiVis.g:6498:8: enumLiteral_1= 'stop'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSimulationOperationAccess().getSTOPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSimulationOperationAccess().getSTOPEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:6504:6: (enumLiteral_2= 'pause' )
                    {
                    // InternalKiVis.g:6504:6: (enumLiteral_2= 'pause' )
                    // InternalKiVis.g:6504:8: enumLiteral_2= 'pause'
                    {
                    enumLiteral_2=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSimulationOperationAccess().getPAUSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSimulationOperationAccess().getPAUSEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:6510:6: (enumLiteral_3= 'play' )
                    {
                    // InternalKiVis.g:6510:6: (enumLiteral_3= 'play' )
                    // InternalKiVis.g:6510:8: enumLiteral_3= 'play'
                    {
                    enumLiteral_3=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSimulationOperationAccess().getPLAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getSimulationOperationAccess().getPLAYEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleSimulationOperation"


    // $ANTLR start "ruleSign"
    // InternalKiVis.g:6520:1: ruleSign returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6522:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalKiVis.g:6523:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalKiVis.g:6523:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==55) ) {
                alt104=1;
            }
            else if ( (LA104_0==39) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalKiVis.g:6523:2: (enumLiteral_0= '+' )
                    {
                    // InternalKiVis.g:6523:2: (enumLiteral_0= '+' )
                    // InternalKiVis.g:6523:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSignAccess().getPOSITIVEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:6529:6: (enumLiteral_1= '-' )
                    {
                    // InternalKiVis.g:6529:6: (enumLiteral_1= '-' )
                    // InternalKiVis.g:6529:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSignAccess().getNEGATIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSignAccess().getNEGATIVEEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleSign"


    // $ANTLR start "ruleCompareOperator"
    // InternalKiVis.g:6539:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKiVis.g:6541:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKiVis.g:6542:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKiVis.g:6542:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt105=6;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt105=1;
                }
                break;
            case 74:
                {
                alt105=2;
                }
                break;
            case 75:
                {
                alt105=3;
                }
                break;
            case 76:
                {
                alt105=4;
                }
                break;
            case 77:
                {
                alt105=5;
                }
                break;
            case 78:
                {
                alt105=6;
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
                    // InternalKiVis.g:6542:2: (enumLiteral_0= '==' )
                    {
                    // InternalKiVis.g:6542:2: (enumLiteral_0= '==' )
                    // InternalKiVis.g:6542:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:6548:6: (enumLiteral_1= '<' )
                    {
                    // InternalKiVis.g:6548:6: (enumLiteral_1= '<' )
                    // InternalKiVis.g:6548:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,74,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:6554:6: (enumLiteral_2= '<=' )
                    {
                    // InternalKiVis.g:6554:6: (enumLiteral_2= '<=' )
                    // InternalKiVis.g:6554:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:6560:6: (enumLiteral_3= '>' )
                    {
                    // InternalKiVis.g:6560:6: (enumLiteral_3= '>' )
                    // InternalKiVis.g:6560:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,76,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKiVis.g:6566:6: (enumLiteral_4= '>=' )
                    {
                    // InternalKiVis.g:6566:6: (enumLiteral_4= '>=' )
                    // InternalKiVis.g:6566:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,77,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKiVis.g:6572:6: (enumLiteral_5= '!=' )
                    {
                    // InternalKiVis.g:6572:6: (enumLiteral_5= '!=' )
                    // InternalKiVis.g:6572:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,78,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6582:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6584:28: ( (enumLiteral_0= 'pre' ) )
            // InternalKiVis.g:6585:1: (enumLiteral_0= 'pre' )
            {
            // InternalKiVis.g:6585:1: (enumLiteral_0= 'pre' )
            // InternalKiVis.g:6585:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6595:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6597:28: ( (enumLiteral_0= '~' ) )
            // InternalKiVis.g:6598:1: (enumLiteral_0= '~' )
            {
            // InternalKiVis.g:6598:1: (enumLiteral_0= '~' )
            // InternalKiVis.g:6598:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6608:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6610:28: ( (enumLiteral_0= '^' ) )
            // InternalKiVis.g:6611:1: (enumLiteral_0= '^' )
            {
            // InternalKiVis.g:6611:1: (enumLiteral_0= '^' )
            // InternalKiVis.g:6611:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6621:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6623:28: ( (enumLiteral_0= '|' ) )
            // InternalKiVis.g:6624:1: (enumLiteral_0= '|' )
            {
            // InternalKiVis.g:6624:1: (enumLiteral_0= '|' )
            // InternalKiVis.g:6624:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6634:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6636:28: ( (enumLiteral_0= '&' ) )
            // InternalKiVis.g:6637:1: (enumLiteral_0= '&' )
            {
            // InternalKiVis.g:6637:1: (enumLiteral_0= '&' )
            // InternalKiVis.g:6637:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6647:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6649:28: ( (enumLiteral_0= '!' ) )
            // InternalKiVis.g:6650:1: (enumLiteral_0= '!' )
            {
            // InternalKiVis.g:6650:1: (enumLiteral_0= '!' )
            // InternalKiVis.g:6650:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6660:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6662:28: ( (enumLiteral_0= '+' ) )
            // InternalKiVis.g:6663:1: (enumLiteral_0= '+' )
            {
            // InternalKiVis.g:6663:1: (enumLiteral_0= '+' )
            // InternalKiVis.g:6663:3: enumLiteral_0= '+'
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
    // InternalKiVis.g:6673:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6675:28: ( (enumLiteral_0= '-' ) )
            // InternalKiVis.g:6676:1: (enumLiteral_0= '-' )
            {
            // InternalKiVis.g:6676:1: (enumLiteral_0= '-' )
            // InternalKiVis.g:6676:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6686:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6688:28: ( (enumLiteral_0= '*' ) )
            // InternalKiVis.g:6689:1: (enumLiteral_0= '*' )
            {
            // InternalKiVis.g:6689:1: (enumLiteral_0= '*' )
            // InternalKiVis.g:6689:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6699:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6701:28: ( (enumLiteral_0= '%' ) )
            // InternalKiVis.g:6702:1: (enumLiteral_0= '%' )
            {
            // InternalKiVis.g:6702:1: (enumLiteral_0= '%' )
            // InternalKiVis.g:6702:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6712:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6714:28: ( (enumLiteral_0= '/' ) )
            // InternalKiVis.g:6715:1: (enumLiteral_0= '/' )
            {
            // InternalKiVis.g:6715:1: (enumLiteral_0= '/' )
            // InternalKiVis.g:6715:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6725:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6727:28: ( (enumLiteral_0= 'val' ) )
            // InternalKiVis.g:6728:1: (enumLiteral_0= 'val' )
            {
            // InternalKiVis.g:6728:1: (enumLiteral_0= 'val' )
            // InternalKiVis.g:6728:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6738:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6740:28: ( (enumLiteral_0= '||' ) )
            // InternalKiVis.g:6741:1: (enumLiteral_0= '||' )
            {
            // InternalKiVis.g:6741:1: (enumLiteral_0= '||' )
            // InternalKiVis.g:6741:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6751:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6753:28: ( (enumLiteral_0= '&&' ) )
            // InternalKiVis.g:6754:1: (enumLiteral_0= '&&' )
            {
            // InternalKiVis.g:6754:1: (enumLiteral_0= '&&' )
            // InternalKiVis.g:6754:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6764:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6766:28: ( (enumLiteral_0= '<<' ) )
            // InternalKiVis.g:6767:1: (enumLiteral_0= '<<' )
            {
            // InternalKiVis.g:6767:1: (enumLiteral_0= '<<' )
            // InternalKiVis.g:6767:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6777:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6779:28: ( (enumLiteral_0= '>>' ) )
            // InternalKiVis.g:6780:1: (enumLiteral_0= '>>' )
            {
            // InternalKiVis.g:6780:1: (enumLiteral_0= '>>' )
            // InternalKiVis.g:6780:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6790:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6792:28: ( (enumLiteral_0= '>>>' ) )
            // InternalKiVis.g:6793:1: (enumLiteral_0= '>>>' )
            {
            // InternalKiVis.g:6793:1: (enumLiteral_0= '>>>' )
            // InternalKiVis.g:6793:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKiVis.g:6807:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // InternalKiVis.g:6809:28: ( (enumLiteral_0= '?' ) )
            // InternalKiVis.g:6810:1: (enumLiteral_0= '?' )
            {
            // InternalKiVis.g:6810:1: (enumLiteral_0= '?' )
            // InternalKiVis.g:6810:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred19_InternalKiVis
    public final void synpred19_InternalKiVis_fragment() throws RecognitionException {   
        EObject lv_right_2_0 = null;


        // InternalKiVis.g:1069:3: ( ( (lv_right_2_0= ruleLiteral ) ) )
        // InternalKiVis.g:1069:3: ( (lv_right_2_0= ruleLiteral ) )
        {
        // InternalKiVis.g:1069:3: ( (lv_right_2_0= ruleLiteral ) )
        // InternalKiVis.g:1070:1: (lv_right_2_0= ruleLiteral )
        {
        // InternalKiVis.g:1070:1: (lv_right_2_0= ruleLiteral )
        // InternalKiVis.g:1071:3: lv_right_2_0= ruleLiteral
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getComparisonAccess().getRightLiteralParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_2_0=ruleLiteral();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalKiVis

    // $ANTLR start synpred28_InternalKiVis
    public final void synpred28_InternalKiVis_fragment() throws RecognitionException {   
        EObject lv_variableReference_0_0 = null;


        // InternalKiVis.g:1499:2: ( ( (lv_variableReference_0_0= ruleVariableReference ) ) )
        // InternalKiVis.g:1499:2: ( (lv_variableReference_0_0= ruleVariableReference ) )
        {
        // InternalKiVis.g:1499:2: ( (lv_variableReference_0_0= ruleVariableReference ) )
        // InternalKiVis.g:1500:1: (lv_variableReference_0_0= ruleVariableReference )
        {
        // InternalKiVis.g:1500:1: (lv_variableReference_0_0= ruleVariableReference )
        // InternalKiVis.g:1501:3: lv_variableReference_0_0= ruleVariableReference
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getVariableReferenceVariableReferenceParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_variableReference_0_0=ruleVariableReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalKiVis

    // $ANTLR start synpred39_InternalKiVis
    public final void synpred39_InternalKiVis_fragment() throws RecognitionException {   
        EObject lv_value_2_0 = null;


        // InternalKiVis.g:2046:6: ( ( (lv_value_2_0= ruleSignedInt ) ) )
        // InternalKiVis.g:2046:6: ( (lv_value_2_0= ruleSignedInt ) )
        {
        // InternalKiVis.g:2046:6: ( (lv_value_2_0= ruleSignedInt ) )
        // InternalKiVis.g:2047:1: (lv_value_2_0= ruleSignedInt )
        {
        // InternalKiVis.g:2047:1: (lv_value_2_0= ruleSignedInt )
        // InternalKiVis.g:2048:3: lv_value_2_0= ruleSignedInt
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedIntParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_value_2_0=ruleSignedInt();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred39_InternalKiVis

    // $ANTLR start synpred40_InternalKiVis
    public final void synpred40_InternalKiVis_fragment() throws RecognitionException {   
        EObject lv_value_3_0 = null;


        // InternalKiVis.g:2065:6: ( ( (lv_value_3_0= ruleSignedFloat ) ) )
        // InternalKiVis.g:2065:6: ( (lv_value_3_0= ruleSignedFloat ) )
        {
        // InternalKiVis.g:2065:6: ( (lv_value_3_0= ruleSignedFloat ) )
        // InternalKiVis.g:2066:1: (lv_value_3_0= ruleSignedFloat )
        {
        // InternalKiVis.g:2066:1: (lv_value_3_0= ruleSignedFloat )
        // InternalKiVis.g:2067:3: lv_value_3_0= ruleSignedFloat
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLiteralAccess().getValueSignedFloatParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_value_3_0=ruleSignedFloat();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40_InternalKiVis

    // $ANTLR start synpred44_InternalKiVis
    public final void synpred44_InternalKiVis_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiVis.g:2326:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiVis.g:2326:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred44_InternalKiVis

    // $ANTLR start synpred58_InternalKiVis
    public final void synpred58_InternalKiVis_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKiVis.g:3005:2: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKiVis.g:3005:2: this_ValuedExpression_0= ruleValuedExpression
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
    // $ANTLR end synpred58_InternalKiVis

    // $ANTLR start synpred78_InternalKiVis
    public final void synpred78_InternalKiVis_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKiVis.g:4120:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKiVis.g:4120:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKiVis.g:4120:2: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        // InternalKiVis.g:4120:3: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        {
        // InternalKiVis.g:4120:3: ()
        // InternalKiVis.g:4121:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // InternalKiVis.g:4129:2: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKiVis.g:4130:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKiVis.g:4130:1: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKiVis.g:4131:3: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_56);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiVis.g:4147:2: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKiVis.g:4148:1: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKiVis.g:4148:1: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKiVis.g:4149:3: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_48);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKiVis.g:4165:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKiVis.g:4166:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKiVis.g:4166:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKiVis.g:4167:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_3);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_48); if (state.failed) return ;
        // InternalKiVis.g:4187:1: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        // InternalKiVis.g:4188:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        {
        // InternalKiVis.g:4188:1: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        // InternalKiVis.g:4189:3: lv_subExpressions_5_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred78_InternalKiVis

    // $ANTLR start synpred88_InternalKiVis
    public final void synpred88_InternalKiVis_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKiVis.g:4397:6: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKiVis.g:4397:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKiVis.g:4397:6: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKiVis.g:4397:8: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_48); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_57);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred88_InternalKiVis

    // $ANTLR start synpred101_InternalKiVis
    public final void synpred101_InternalKiVis_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKiVis.g:5256:2: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKiVis.g:5256:2: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred101_InternalKiVis

    // $ANTLR start synpred102_InternalKiVis
    public final void synpred102_InternalKiVis_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKiVis.g:5269:2: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKiVis.g:5269:2: this_ValuedExpression_1= ruleValuedExpression
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
    // $ANTLR end synpred102_InternalKiVis

    // Delegated rules

    public final boolean synpred39_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalKiVis() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalKiVis_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\2\uffff\1\13\2\uffff\4\13\3\uffff\2\13\1\uffff\1\13";
    static final String dfa_3s = "\1\4\1\uffff\1\5\2\6\4\5\1\uffff\1\6\1\uffff\2\5\1\56\1\5";
    static final String dfa_4s = "\1\67\1\uffff\1\55\2\7\4\52\1\uffff\1\6\1\uffff\2\52\1\56\1\55";
    static final String dfa_5s = "\1\uffff\1\1\7\uffff\1\3\1\uffff\1\2\4\uffff";
    static final String dfa_6s = "\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\1\2\1\5\1\6\1\uffff\1\7\30\uffff\1\1\2\uffff\1\11\1\uffff\1\4\17\uffff\1\3",
            "",
            "\1\13\17\uffff\1\13\15\uffff\1\11\6\uffff\1\13\2\uffff\1\12",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\13\17\uffff\1\13\15\uffff\1\11\3\uffff\1\11\2\uffff\1\13",
            "\1\13\17\uffff\1\13\15\uffff\1\11\3\uffff\1\11\2\uffff\1\13",
            "\1\13\17\uffff\1\13\15\uffff\1\11\6\uffff\1\13",
            "\1\13\17\uffff\1\13\15\uffff\1\11\6\uffff\1\13",
            "",
            "\1\16",
            "",
            "\1\13\17\uffff\1\13\15\uffff\1\11\3\uffff\1\11\2\uffff\1\13",
            "\1\13\17\uffff\1\13\15\uffff\1\11\3\uffff\1\11\2\uffff\1\13",
            "\1\17",
            "\1\13\17\uffff\1\13\15\uffff\1\11\6\uffff\1\13\2\uffff\1\12"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "801:1: ( ( (lv_currentValue_2_0= 'value' ) ) | ( (lv_literal_3_0= ruleLiteral ) ) | ( ( (lv_mappings_4_0= ruleMapping ) ) (otherlv_5= ',' ( (lv_mappings_6_0= ruleMapping ) ) )* ) )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\5\uffff\4\2\1\uffff";
    static final String dfa_10s = "\1\4\2\uffff\2\6\4\43\1\uffff";
    static final String dfa_11s = "\1\67\2\uffff\2\7\4\47\1\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\6\uffff\1\3";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\2\2\1\5\1\6\1\uffff\1\2\33\uffff\1\1\1\uffff\1\4\17\uffff\1\3",
            "",
            "",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\2\3\uffff\1\11",
            "\1\2\3\uffff\1\11",
            "\1\2\3\uffff\1\11",
            "\1\2\3\uffff\1\11",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1127:1: ( ( (lv_otherValues_0_0= 'others' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) )";
        }
    }
    static final String dfa_15s = "\1\4\2\uffff\2\6\4\5\1\uffff";
    static final String dfa_16s = "\1\67\2\uffff\2\7\4\52\1\uffff";
    static final String[] dfa_17s = {
            "\2\2\1\5\1\6\1\uffff\1\2\30\uffff\1\1\4\uffff\1\4\17\uffff\1\3",
            "",
            "",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\2\17\uffff\1\2\7\uffff\1\2\11\uffff\1\11\2\uffff\1\2",
            "\1\2\17\uffff\1\2\7\uffff\1\2\11\uffff\1\11\2\uffff\1\2",
            "\1\2\17\uffff\1\2\7\uffff\1\2\11\uffff\1\11\2\uffff\1\2",
            "\1\2\17\uffff\1\2\7\uffff\1\2\11\uffff\1\11\2\uffff\1\2",
            ""
    };
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[][] dfa_17 = unpackEncodedStringArray(dfa_17s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_17;
        }
        public String getDescription() {
            return "1307:1: ( ( (lv_currentValue_0_0= 'value' ) ) | ( (lv_value_1_0= ruleLiteral ) ) | ( (lv_range_2_0= ruleInterval ) ) )";
        }
    }
    static final String dfa_18s = "\1\4\14\0\3\uffff";
    static final String dfa_19s = "\1\121\14\0\3\uffff";
    static final String dfa_20s = "\15\uffff\1\1\1\uffff\1\2";
    static final String dfa_21s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\uffff}>";
    static final String[] dfa_22s = {
            "\1\4\1\12\1\2\1\3\1\14\1\7\12\uffff\1\5\7\uffff\1\6\12\uffff\1\1\24\uffff\1\13\1\15\21\uffff\1\10\1\15\1\11",
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
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "2325:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_10 = input.LA(1);

                         
                        int index37_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA37_11 = input.LA(1);

                         
                        int index37_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalKiVis()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index37_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_23s = "\17\uffff";
    static final String dfa_24s = "\1\4\5\uffff\7\0\2\uffff";
    static final String dfa_25s = "\1\121\5\uffff\7\0\2\uffff";
    static final String dfa_26s = "\1\uffff\1\1\13\uffff\1\2\1\uffff";
    static final String dfa_27s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\1\12\2\1\1\14\1\7\12\uffff\1\1\7\uffff\1\6\12\uffff\1\1\24\uffff\1\13\1\15\21\uffff\1\10\1\15\1\11",
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
            "",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_23;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "3004:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_9 = input.LA(1);

                         
                        int index51_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_10 = input.LA(1);

                         
                        int index51_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_11 = input.LA(1);

                         
                        int index51_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalKiVis()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\16\uffff";
    static final String dfa_30s = "\1\4\13\0\2\uffff";
    static final String dfa_31s = "\1\121\13\0\2\uffff";
    static final String dfa_32s = "\14\uffff\1\1\1\2";
    static final String dfa_33s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_34s = {
            "\1\3\1\11\1\1\1\2\1\13\1\6\12\uffff\1\4\7\uffff\1\5\37\uffff\1\12\22\uffff\1\7\1\uffff\1\10",
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

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[][] dfa_34 = unpackEncodedStringArray(dfa_34s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_29;
            this.eof = dfa_29;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_32;
            this.special = dfa_33;
            this.transition = dfa_34;
        }
        public String getDescription() {
            return "4120:1: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_6= ruleAtomicValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_1 = input.LA(1);

                         
                        int index71_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_7 = input.LA(1);

                         
                        int index71_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA71_8 = input.LA(1);

                         
                        int index71_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA71_9 = input.LA(1);

                         
                        int index71_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index71_11);
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
    static final String dfa_35s = "\11\uffff";
    static final String dfa_36s = "\3\uffff\1\2\3\uffff\1\2\1\uffff";
    static final String dfa_37s = "\1\5\2\uffff\1\22\3\uffff\1\22\1\uffff";
    static final String dfa_38s = "\1\121\2\uffff\1\122\3\uffff\1\122\1\uffff";
    static final String dfa_39s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\uffff\1\4";
    static final String dfa_40s = "\11\uffff}>";
    static final String[] dfa_41s = {
            "\1\3\2\uffff\1\6\1\1\22\uffff\1\4\37\uffff\1\5\22\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "\1\2\2\uffff\1\2\6\uffff\1\10\2\2\1\10\4\uffff\1\2\1\uffff\2\2\5\uffff\16\2\1\7\15\uffff\6\2\3\uffff\1\2",
            "",
            "",
            "",
            "\1\2\2\uffff\1\2\6\uffff\1\10\2\2\1\10\4\uffff\1\2\1\uffff\2\2\5\uffff\16\2\1\7\15\uffff\6\2\3\uffff\1\2",
            ""
    };

    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[][] dfa_41 = unpackEncodedStringArray(dfa_41s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_35;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_40;
            this.transition = dfa_41;
        }
        public String getDescription() {
            return "4239:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_TextExpression_7= ruleTextExpression )";
        }
    }
    static final String dfa_42s = "\15\uffff";
    static final String dfa_43s = "\1\4\4\uffff\1\0\7\uffff";
    static final String dfa_44s = "\1\121\4\uffff\1\0\7\uffff";
    static final String dfa_45s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\5\uffff\1\5";
    static final String dfa_46s = "\5\uffff\1\0\7\uffff}>";
    static final String[] dfa_47s = {
            "\1\3\1\6\1\1\1\2\2\6\12\uffff\1\4\7\uffff\1\5\37\uffff\1\6\22\uffff\1\6\1\uffff\1\6",
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

    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_42;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "4345:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalKiVis()) ) {s = 12;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index73_5);
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
    static final String dfa_48s = "\21\uffff";
    static final String dfa_49s = "\1\4\14\0\4\uffff";
    static final String dfa_50s = "\1\121\14\0\4\uffff";
    static final String dfa_51s = "\15\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_52s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff}>";
    static final String[] dfa_53s = {
            "\1\4\1\12\1\2\1\3\1\14\1\7\12\uffff\1\5\7\uffff\1\6\12\uffff\1\1\24\uffff\1\13\1\15\1\17\20\uffff\1\10\1\15\1\11",
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

    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_48;
            this.eof = dfa_48;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_51;
            this.special = dfa_52;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "5255:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA86_2 = input.LA(1);

                         
                        int index86_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA86_3 = input.LA(1);

                         
                        int index86_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA86_4 = input.LA(1);

                         
                        int index86_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA86_5 = input.LA(1);

                         
                        int index86_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA86_6 = input.LA(1);

                         
                        int index86_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA86_7 = input.LA(1);

                         
                        int index86_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA86_8 = input.LA(1);

                         
                        int index86_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA86_9 = input.LA(1);

                         
                        int index86_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA86_10 = input.LA(1);

                         
                        int index86_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA86_11 = input.LA(1);

                         
                        int index86_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA86_12 = input.LA(1);

                         
                        int index86_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalKiVis()) ) {s = 13;}

                        else if ( (synpred102_InternalKiVis()) ) {s = 16;}

                         
                        input.seek(index86_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000480002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100200000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000900000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L,0x00000000000001E0L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00800080000002F0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000090000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200020L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x008000A4000002F0L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007E00L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00800080000000C0L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000200020L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x30800080101003F0L,0x0000000000038000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000007E00L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x10800080101003F0L,0x0000000000028000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000002L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000020L,0x0000000000028000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000204000000002L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x30880080101003F0L,0x0000000000038000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x70800080101003F0L,0x0000000000038000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000020200000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000080000002F0L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000230L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x000000C000000002L,0x0000000000000001L});
    }


}