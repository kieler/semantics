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

@SuppressWarnings("all")
public class InternalKiVisParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SCRIPT", "RULE_ID", "RULE_BOOL", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'image'", "'load'", "'init'", "'bind'", "'to'", "'with'", "'handle'", "'in'", "'all'", "'event'", "'on'", "'do'", "'deferred'", "'set'", "'simulation'", "'script'", "'('", "','", "')'", "'=>'", "'#'", "'.'", "'-'", "'nothing'", "'step'", "'stop'", "'pause'", "'play'"
    };
    public static final int RULE_ESCAPED_CHAR=8;
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
    public static final int RULE_SCRIPT=5;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_BOOL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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



     	private KiVisGrammarAccess grammarAccess;

        public InternalKiVisParser(TokenStream input, KiVisGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Visualization";
       	}

       	@Override
       	protected KiVisGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVisualization"
    // InternalKiVis.g:65:1: entryRuleVisualization returns [EObject current=null] : iv_ruleVisualization= ruleVisualization EOF ;
    public final EObject entryRuleVisualization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualization = null;


        try {
            // InternalKiVis.g:65:54: (iv_ruleVisualization= ruleVisualization EOF )
            // InternalKiVis.g:66:2: iv_ruleVisualization= ruleVisualization EOF
            {
             newCompositeNode(grammarAccess.getVisualizationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVisualization=ruleVisualization();

            state._fsp--;

             current =iv_ruleVisualization; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalKiVis.g:72:1: ruleVisualization returns [EObject current=null] : ( (otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) ) ) (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* ) ;
    public final EObject ruleVisualization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_image_1_0=null;
        Token otherlv_2=null;
        Token lv_loads_3_0=null;
        Token otherlv_4=null;
        Token lv_init_5_0=null;
        EObject lv_content_6_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:78:2: ( ( (otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) ) ) (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* ) )
            // InternalKiVis.g:79:2: ( (otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) ) ) (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* )
            {
            // InternalKiVis.g:79:2: ( (otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) ) ) (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* )
            // InternalKiVis.g:80:3: (otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) ) ) (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )*
            {
            // InternalKiVis.g:80:3: (otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) ) )
            // InternalKiVis.g:81:4: otherlv_0= 'image' ( (lv_image_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getVisualizationAccess().getImageKeyword_0_0());
            			
            // InternalKiVis.g:85:4: ( (lv_image_1_0= RULE_STRING ) )
            // InternalKiVis.g:86:5: (lv_image_1_0= RULE_STRING )
            {
            // InternalKiVis.g:86:5: (lv_image_1_0= RULE_STRING )
            // InternalKiVis.g:87:6: lv_image_1_0= RULE_STRING
            {
            lv_image_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

            						newLeafNode(lv_image_1_0, grammarAccess.getVisualizationAccess().getImageSTRINGTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getVisualizationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"image",
            							lv_image_1_0,
            							"de.cau.cs.kieler.kivis.KiVis.STRING");
            					

            }


            }


            }

            // InternalKiVis.g:104:3: (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKiVis.g:105:4: otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVisualizationAccess().getLoadKeyword_1_0());
            	    			
            	    // InternalKiVis.g:109:4: ( (lv_loads_3_0= RULE_STRING ) )
            	    // InternalKiVis.g:110:5: (lv_loads_3_0= RULE_STRING )
            	    {
            	    // InternalKiVis.g:110:5: (lv_loads_3_0= RULE_STRING )
            	    // InternalKiVis.g:111:6: lv_loads_3_0= RULE_STRING
            	    {
            	    lv_loads_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

            	    						newLeafNode(lv_loads_3_0, grammarAccess.getVisualizationAccess().getLoadsSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualizationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"loads",
            	    							lv_loads_3_0,
            	    							"de.cau.cs.kieler.kivis.KiVis.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKiVis.g:128:3: (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKiVis.g:129:4: otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) )
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getVisualizationAccess().getInitKeyword_2_0());
                    			
                    // InternalKiVis.g:133:4: ( (lv_init_5_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:134:5: (lv_init_5_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:134:5: (lv_init_5_0= RULE_SCRIPT )
                    // InternalKiVis.g:135:6: lv_init_5_0= RULE_SCRIPT
                    {
                    lv_init_5_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_6); 

                    						newLeafNode(lv_init_5_0, grammarAccess.getVisualizationAccess().getInitSCRIPTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisualizationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"init",
                    							lv_init_5_0,
                    							"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiVis.g:152:3: ( (lv_content_6_0= ruleContent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==20||LA3_0==23||LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalKiVis.g:153:4: (lv_content_6_0= ruleContent )
            	    {
            	    // InternalKiVis.g:153:4: (lv_content_6_0= ruleContent )
            	    // InternalKiVis.g:154:5: lv_content_6_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getVisualizationAccess().getContentContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_content_6_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVisualizationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_6_0,
            	    						"de.cau.cs.kieler.kivis.KiVis.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleContent"
    // InternalKiVis.g:175:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalKiVis.g:175:48: (iv_ruleContent= ruleContent EOF )
            // InternalKiVis.g:176:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalKiVis.g:182:1: ruleContent returns [EObject current=null] : (this_Binding_0= ruleBinding | this_Handler_1= ruleHandler | this_Action_2= ruleAction | this_Code_3= ruleCode ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Binding_0 = null;

        EObject this_Handler_1 = null;

        EObject this_Action_2 = null;

        EObject this_Code_3 = null;



        	enterRule();

        try {
            // InternalKiVis.g:188:2: ( (this_Binding_0= ruleBinding | this_Handler_1= ruleHandler | this_Action_2= ruleAction | this_Code_3= ruleCode ) )
            // InternalKiVis.g:189:2: (this_Binding_0= ruleBinding | this_Handler_1= ruleHandler | this_Action_2= ruleAction | this_Code_3= ruleCode )
            {
            // InternalKiVis.g:189:2: (this_Binding_0= ruleBinding | this_Handler_1= ruleHandler | this_Action_2= ruleAction | this_Code_3= ruleCode )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKiVis.g:190:3: this_Binding_0= ruleBinding
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getBindingParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Binding_0=ruleBinding();

                    state._fsp--;


                    			current = this_Binding_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:199:3: this_Handler_1= ruleHandler
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getHandlerParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Handler_1=ruleHandler();

                    state._fsp--;


                    			current = this_Handler_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalKiVis.g:208:3: this_Action_2= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getActionParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Action_2=ruleAction();

                    state._fsp--;


                    			current = this_Action_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalKiVis.g:217:3: this_Code_3= ruleCode
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getCodeParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Code_3=ruleCode();

                    state._fsp--;


                    			current = this_Code_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleBinding"
    // InternalKiVis.g:229:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalKiVis.g:229:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalKiVis.g:230:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalKiVis.g:236:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_domElement_3_0=null;
        Token otherlv_4=null;
        Token lv_script_6_0=null;
        Token otherlv_7=null;
        Token lv_script_9_0=null;
        AntlrDatatypeRuleToken lv_variable_1_0 = null;

        EObject lv_interface_5_0 = null;

        EObject lv_interface_8_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:242:2: ( (otherlv_0= 'bind' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) ) )
            // InternalKiVis.g:243:2: (otherlv_0= 'bind' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )
            {
            // InternalKiVis.g:243:2: (otherlv_0= 'bind' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )
            // InternalKiVis.g:244:3: otherlv_0= 'bind' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindKeyword_0());
            		
            // InternalKiVis.g:248:3: ( (lv_variable_1_0= ruleKey ) )
            // InternalKiVis.g:249:4: (lv_variable_1_0= ruleKey )
            {
            // InternalKiVis.g:249:4: (lv_variable_1_0= ruleKey )
            // InternalKiVis.g:250:5: lv_variable_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getVariableKeyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_8);
            lv_variable_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:267:3: ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKiVis.g:268:4: (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:268:4: (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:269:5: otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) )
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getToKeyword_2_0_0());
                    				
                    // InternalKiVis.g:273:5: ( (lv_domElement_3_0= RULE_STRING ) )
                    // InternalKiVis.g:274:6: (lv_domElement_3_0= RULE_STRING )
                    {
                    // InternalKiVis.g:274:6: (lv_domElement_3_0= RULE_STRING )
                    // InternalKiVis.g:275:7: lv_domElement_3_0= RULE_STRING
                    {
                    lv_domElement_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_9); 

                    							newLeafNode(lv_domElement_3_0, grammarAccess.getBindingAccess().getDomElementSTRINGTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBindingRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"domElement",
                    								lv_domElement_3_0,
                    								"de.cau.cs.kieler.kivis.KiVis.STRING");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getWithKeyword_2_0_2());
                    				
                    // InternalKiVis.g:295:5: ( (lv_interface_5_0= ruleBindingInterface1 ) )
                    // InternalKiVis.g:296:6: (lv_interface_5_0= ruleBindingInterface1 )
                    {
                    // InternalKiVis.g:296:6: (lv_interface_5_0= ruleBindingInterface1 )
                    // InternalKiVis.g:297:7: lv_interface_5_0= ruleBindingInterface1
                    {

                    							newCompositeNode(grammarAccess.getBindingAccess().getInterfaceBindingInterface1ParserRuleCall_2_0_3_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_interface_5_0=ruleBindingInterface1();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBindingRule());
                    							}
                    							set(
                    								current,
                    								"interface",
                    								lv_interface_5_0,
                    								"de.cau.cs.kieler.kivis.KiVis.BindingInterface1");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKiVis.g:314:5: ( (lv_script_6_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:315:6: (lv_script_6_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:315:6: (lv_script_6_0= RULE_SCRIPT )
                    // InternalKiVis.g:316:7: lv_script_6_0= RULE_SCRIPT
                    {
                    lv_script_6_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_script_6_0, grammarAccess.getBindingAccess().getScriptSCRIPTTerminalRuleCall_2_0_4_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBindingRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"script",
                    								lv_script_6_0,
                    								"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:334:4: (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:334:4: (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:335:5: otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getBindingAccess().getWithKeyword_2_1_0());
                    				
                    // InternalKiVis.g:339:5: ( (lv_interface_8_0= ruleBindingInterface2 ) )
                    // InternalKiVis.g:340:6: (lv_interface_8_0= ruleBindingInterface2 )
                    {
                    // InternalKiVis.g:340:6: (lv_interface_8_0= ruleBindingInterface2 )
                    // InternalKiVis.g:341:7: lv_interface_8_0= ruleBindingInterface2
                    {

                    							newCompositeNode(grammarAccess.getBindingAccess().getInterfaceBindingInterface2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_interface_8_0=ruleBindingInterface2();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getBindingRule());
                    							}
                    							set(
                    								current,
                    								"interface",
                    								lv_interface_8_0,
                    								"de.cau.cs.kieler.kivis.KiVis.BindingInterface2");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKiVis.g:358:5: ( (lv_script_9_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:359:6: (lv_script_9_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:359:6: (lv_script_9_0= RULE_SCRIPT )
                    // InternalKiVis.g:360:7: lv_script_9_0= RULE_SCRIPT
                    {
                    lv_script_9_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_script_9_0, grammarAccess.getBindingAccess().getScriptSCRIPTTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBindingRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"script",
                    								lv_script_9_0,
                    								"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleHandler"
    // InternalKiVis.g:382:1: entryRuleHandler returns [EObject current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final EObject entryRuleHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandler = null;


        try {
            // InternalKiVis.g:382:48: (iv_ruleHandler= ruleHandler EOF )
            // InternalKiVis.g:383:2: iv_ruleHandler= ruleHandler EOF
            {
             newCompositeNode(grammarAccess.getHandlerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHandler=ruleHandler();

            state._fsp--;

             current =iv_ruleHandler; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandler"


    // $ANTLR start "ruleHandler"
    // InternalKiVis.g:389:1: ruleHandler returns [EObject current=null] : (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) ) ;
    public final EObject ruleHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_multimatch_3_0=null;
        Token lv_domElement_4_0=null;
        Token otherlv_5=null;
        Token lv_script_7_0=null;
        Token otherlv_8=null;
        Token lv_script_10_0=null;
        AntlrDatatypeRuleToken lv_variable_1_0 = null;

        EObject lv_interface_6_0 = null;

        EObject lv_interface_9_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:395:2: ( (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) ) )
            // InternalKiVis.g:396:2: (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )
            {
            // InternalKiVis.g:396:2: (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )
            // InternalKiVis.g:397:3: otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getHandlerAccess().getHandleKeyword_0());
            		
            // InternalKiVis.g:401:3: ( (lv_variable_1_0= ruleKey ) )
            // InternalKiVis.g:402:4: (lv_variable_1_0= ruleKey )
            {
            // InternalKiVis.g:402:4: (lv_variable_1_0= ruleKey )
            // InternalKiVis.g:403:5: lv_variable_1_0= ruleKey
            {

            					newCompositeNode(grammarAccess.getHandlerAccess().getVariableKeyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_11);
            lv_variable_1_0=ruleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHandlerRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.Key");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:420:3: ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKiVis.g:421:4: (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:421:4: (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:422:5: otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_12); 

                    					newLeafNode(otherlv_2, grammarAccess.getHandlerAccess().getInKeyword_2_0_0());
                    				
                    // InternalKiVis.g:426:5: ( (lv_multimatch_3_0= 'all' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==22) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalKiVis.g:427:6: (lv_multimatch_3_0= 'all' )
                            {
                            // InternalKiVis.g:427:6: (lv_multimatch_3_0= 'all' )
                            // InternalKiVis.g:428:7: lv_multimatch_3_0= 'all'
                            {
                            lv_multimatch_3_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                            							newLeafNode(lv_multimatch_3_0, grammarAccess.getHandlerAccess().getMultimatchAllKeyword_2_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getHandlerRule());
                            							}
                            							setWithLastConsumed(current, "multimatch", true, "all");
                            						

                            }


                            }
                            break;

                    }

                    // InternalKiVis.g:440:5: ( (lv_domElement_4_0= RULE_STRING ) )
                    // InternalKiVis.g:441:6: (lv_domElement_4_0= RULE_STRING )
                    {
                    // InternalKiVis.g:441:6: (lv_domElement_4_0= RULE_STRING )
                    // InternalKiVis.g:442:7: lv_domElement_4_0= RULE_STRING
                    {
                    lv_domElement_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_9); 

                    							newLeafNode(lv_domElement_4_0, grammarAccess.getHandlerAccess().getDomElementSTRINGTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHandlerRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"domElement",
                    								lv_domElement_4_0,
                    								"de.cau.cs.kieler.kivis.KiVis.STRING");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getHandlerAccess().getWithKeyword_2_0_3());
                    				
                    // InternalKiVis.g:462:5: ( (lv_interface_6_0= ruleHandlerInterface1 ) )
                    // InternalKiVis.g:463:6: (lv_interface_6_0= ruleHandlerInterface1 )
                    {
                    // InternalKiVis.g:463:6: (lv_interface_6_0= ruleHandlerInterface1 )
                    // InternalKiVis.g:464:7: lv_interface_6_0= ruleHandlerInterface1
                    {

                    							newCompositeNode(grammarAccess.getHandlerAccess().getInterfaceHandlerInterface1ParserRuleCall_2_0_4_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_interface_6_0=ruleHandlerInterface1();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHandlerRule());
                    							}
                    							set(
                    								current,
                    								"interface",
                    								lv_interface_6_0,
                    								"de.cau.cs.kieler.kivis.KiVis.HandlerInterface1");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKiVis.g:481:5: ( (lv_script_7_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:482:6: (lv_script_7_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:482:6: (lv_script_7_0= RULE_SCRIPT )
                    // InternalKiVis.g:483:7: lv_script_7_0= RULE_SCRIPT
                    {
                    lv_script_7_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_script_7_0, grammarAccess.getHandlerAccess().getScriptSCRIPTTerminalRuleCall_2_0_5_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHandlerRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"script",
                    								lv_script_7_0,
                    								"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:501:4: (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:501:4: (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:502:5: otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getHandlerAccess().getWithKeyword_2_1_0());
                    				
                    // InternalKiVis.g:506:5: ( (lv_interface_9_0= ruleHandlerInterface2 ) )
                    // InternalKiVis.g:507:6: (lv_interface_9_0= ruleHandlerInterface2 )
                    {
                    // InternalKiVis.g:507:6: (lv_interface_9_0= ruleHandlerInterface2 )
                    // InternalKiVis.g:508:7: lv_interface_9_0= ruleHandlerInterface2
                    {

                    							newCompositeNode(grammarAccess.getHandlerAccess().getInterfaceHandlerInterface2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_interface_9_0=ruleHandlerInterface2();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHandlerRule());
                    							}
                    							set(
                    								current,
                    								"interface",
                    								lv_interface_9_0,
                    								"de.cau.cs.kieler.kivis.KiVis.HandlerInterface2");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKiVis.g:525:5: ( (lv_script_10_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:526:6: (lv_script_10_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:526:6: (lv_script_10_0= RULE_SCRIPT )
                    // InternalKiVis.g:527:7: lv_script_10_0= RULE_SCRIPT
                    {
                    lv_script_10_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_script_10_0, grammarAccess.getHandlerAccess().getScriptSCRIPTTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHandlerRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"script",
                    								lv_script_10_0,
                    								"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandler"


    // $ANTLR start "entryRuleAction"
    // InternalKiVis.g:549:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalKiVis.g:549:47: (iv_ruleAction= ruleAction EOF )
            // InternalKiVis.g:550:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

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
    // InternalKiVis.g:556:1: ruleAction returns [EObject current=null] : (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )? (otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) ) )? (otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_domEvent_1_0=null;
        Token otherlv_2=null;
        Token lv_multimatch_3_0=null;
        Token lv_domElement_4_0=null;
        Token otherlv_5=null;
        Token lv_deferred_6_0=null;
        Token lv_script_8_0=null;
        Token lv_script_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_interface_7_0 = null;

        EObject lv_interface_9_0 = null;

        AntlrDatatypeRuleToken lv_variable_12_0 = null;

        Enumerator lv_control_14_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:562:2: ( (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )? (otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) ) )? (otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) ) )? ) )
            // InternalKiVis.g:563:2: (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )? (otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) ) )? (otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) ) )? )
            {
            // InternalKiVis.g:563:2: (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )? (otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) ) )? (otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) ) )? )
            // InternalKiVis.g:564:3: otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )? (otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) ) )? (otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getEventKeyword_0());
            		
            // InternalKiVis.g:568:3: ( (lv_domEvent_1_0= RULE_STRING ) )
            // InternalKiVis.g:569:4: (lv_domEvent_1_0= RULE_STRING )
            {
            // InternalKiVis.g:569:4: (lv_domEvent_1_0= RULE_STRING )
            // InternalKiVis.g:570:5: lv_domEvent_1_0= RULE_STRING
            {
            lv_domEvent_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); 

            					newLeafNode(lv_domEvent_1_0, grammarAccess.getActionAccess().getDomEventSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"domEvent",
            						lv_domEvent_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getOnKeyword_2());
            		
            // InternalKiVis.g:590:3: ( (lv_multimatch_3_0= 'all' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiVis.g:591:4: (lv_multimatch_3_0= 'all' )
                    {
                    // InternalKiVis.g:591:4: (lv_multimatch_3_0= 'all' )
                    // InternalKiVis.g:592:5: lv_multimatch_3_0= 'all'
                    {
                    lv_multimatch_3_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                    					newLeafNode(lv_multimatch_3_0, grammarAccess.getActionAccess().getMultimatchAllKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionRule());
                    					}
                    					setWithLastConsumed(current, "multimatch", true, "all");
                    				

                    }


                    }
                    break;

            }

            // InternalKiVis.g:604:3: ( (lv_domElement_4_0= RULE_STRING ) )
            // InternalKiVis.g:605:4: (lv_domElement_4_0= RULE_STRING )
            {
            // InternalKiVis.g:605:4: (lv_domElement_4_0= RULE_STRING )
            // InternalKiVis.g:606:5: lv_domElement_4_0= RULE_STRING
            {
            lv_domElement_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); 

            					newLeafNode(lv_domElement_4_0, grammarAccess.getActionAccess().getDomElementSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"domElement",
            						lv_domElement_4_0,
            						"de.cau.cs.kieler.kivis.KiVis.STRING");
            				

            }


            }

            // InternalKiVis.g:622:3: (otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiVis.g:623:4: otherlv_5= 'do' ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDoKeyword_5_0());
                    			
                    // InternalKiVis.g:627:4: ( ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==26) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==EOF||LA9_0==RULE_SCRIPT||LA9_0==30) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalKiVis.g:628:5: ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) )
                            {
                            // InternalKiVis.g:628:5: ( ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) ) )
                            // InternalKiVis.g:629:6: ( (lv_deferred_6_0= 'deferred' ) ) ( (lv_interface_7_0= ruleActionInterface1 ) ) ( (lv_script_8_0= RULE_SCRIPT ) )
                            {
                            // InternalKiVis.g:629:6: ( (lv_deferred_6_0= 'deferred' ) )
                            // InternalKiVis.g:630:7: (lv_deferred_6_0= 'deferred' )
                            {
                            // InternalKiVis.g:630:7: (lv_deferred_6_0= 'deferred' )
                            // InternalKiVis.g:631:8: lv_deferred_6_0= 'deferred'
                            {
                            lv_deferred_6_0=(Token)match(input,26,FollowSets000.FOLLOW_16); 

                            								newLeafNode(lv_deferred_6_0, grammarAccess.getActionAccess().getDeferredDeferredKeyword_5_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getActionRule());
                            								}
                            								setWithLastConsumed(current, "deferred", true, "deferred");
                            							

                            }


                            }

                            // InternalKiVis.g:643:6: ( (lv_interface_7_0= ruleActionInterface1 ) )
                            // InternalKiVis.g:644:7: (lv_interface_7_0= ruleActionInterface1 )
                            {
                            // InternalKiVis.g:644:7: (lv_interface_7_0= ruleActionInterface1 )
                            // InternalKiVis.g:645:8: lv_interface_7_0= ruleActionInterface1
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getInterfaceActionInterface1ParserRuleCall_5_1_0_1_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_interface_7_0=ruleActionInterface1();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getActionRule());
                            								}
                            								set(
                            									current,
                            									"interface",
                            									lv_interface_7_0,
                            									"de.cau.cs.kieler.kivis.KiVis.ActionInterface1");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalKiVis.g:662:6: ( (lv_script_8_0= RULE_SCRIPT ) )
                            // InternalKiVis.g:663:7: (lv_script_8_0= RULE_SCRIPT )
                            {
                            // InternalKiVis.g:663:7: (lv_script_8_0= RULE_SCRIPT )
                            // InternalKiVis.g:664:8: lv_script_8_0= RULE_SCRIPT
                            {
                            lv_script_8_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_17); 

                            								newLeafNode(lv_script_8_0, grammarAccess.getActionAccess().getScriptSCRIPTTerminalRuleCall_5_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getActionRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"script",
                            									lv_script_8_0,
                            									"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalKiVis.g:682:5: ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) )
                            {
                            // InternalKiVis.g:682:5: ( ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) )
                            // InternalKiVis.g:683:6: ( (lv_interface_9_0= ruleActionInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) )
                            {
                            // InternalKiVis.g:683:6: ( (lv_interface_9_0= ruleActionInterface2 ) )
                            // InternalKiVis.g:684:7: (lv_interface_9_0= ruleActionInterface2 )
                            {
                            // InternalKiVis.g:684:7: (lv_interface_9_0= ruleActionInterface2 )
                            // InternalKiVis.g:685:8: lv_interface_9_0= ruleActionInterface2
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getInterfaceActionInterface2ParserRuleCall_5_1_1_0_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_interface_9_0=ruleActionInterface2();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getActionRule());
                            								}
                            								set(
                            									current,
                            									"interface",
                            									lv_interface_9_0,
                            									"de.cau.cs.kieler.kivis.KiVis.ActionInterface2");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalKiVis.g:702:6: ( (lv_script_10_0= RULE_SCRIPT ) )
                            // InternalKiVis.g:703:7: (lv_script_10_0= RULE_SCRIPT )
                            {
                            // InternalKiVis.g:703:7: (lv_script_10_0= RULE_SCRIPT )
                            // InternalKiVis.g:704:8: lv_script_10_0= RULE_SCRIPT
                            {
                            lv_script_10_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_17); 

                            								newLeafNode(lv_script_10_0, grammarAccess.getActionAccess().getScriptSCRIPTTerminalRuleCall_5_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getActionRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"script",
                            									lv_script_10_0,
                            									"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalKiVis.g:723:3: (otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiVis.g:724:4: otherlv_11= 'set' ( (lv_variable_12_0= ruleKey ) )
                    {
                    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getSetKeyword_6_0());
                    			
                    // InternalKiVis.g:728:4: ( (lv_variable_12_0= ruleKey ) )
                    // InternalKiVis.g:729:5: (lv_variable_12_0= ruleKey )
                    {
                    // InternalKiVis.g:729:5: (lv_variable_12_0= ruleKey )
                    // InternalKiVis.g:730:6: lv_variable_12_0= ruleKey
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getVariableKeyParserRuleCall_6_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_variable_12_0=ruleKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_12_0,
                    							"de.cau.cs.kieler.kivis.KiVis.Key");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiVis.g:748:3: (otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiVis.g:749:4: otherlv_13= 'simulation' ( (lv_control_14_0= ruleSimulationCorntrol ) )
                    {
                    otherlv_13=(Token)match(input,28,FollowSets000.FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getSimulationKeyword_7_0());
                    			
                    // InternalKiVis.g:753:4: ( (lv_control_14_0= ruleSimulationCorntrol ) )
                    // InternalKiVis.g:754:5: (lv_control_14_0= ruleSimulationCorntrol )
                    {
                    // InternalKiVis.g:754:5: (lv_control_14_0= ruleSimulationCorntrol )
                    // InternalKiVis.g:755:6: lv_control_14_0= ruleSimulationCorntrol
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getControlSimulationCorntrolEnumRuleCall_7_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_control_14_0=ruleSimulationCorntrol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"control",
                    							lv_control_14_0,
                    							"de.cau.cs.kieler.kivis.KiVis.SimulationCorntrol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleCode"
    // InternalKiVis.g:777:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalKiVis.g:777:45: (iv_ruleCode= ruleCode EOF )
            // InternalKiVis.g:778:2: iv_ruleCode= ruleCode EOF
            {
             newCompositeNode(grammarAccess.getCodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCode=ruleCode();

            state._fsp--;

             current =iv_ruleCode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCode"


    // $ANTLR start "ruleCode"
    // InternalKiVis.g:784:1: ruleCode returns [EObject current=null] : (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_script_2_0=null;
        EObject lv_interface_1_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:790:2: ( (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) )
            // InternalKiVis.g:791:2: (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            {
            // InternalKiVis.g:791:2: (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            // InternalKiVis.g:792:3: otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeAccess().getScriptKeyword_0());
            		
            // InternalKiVis.g:796:3: ( (lv_interface_1_0= ruleCodeInterface ) )
            // InternalKiVis.g:797:4: (lv_interface_1_0= ruleCodeInterface )
            {
            // InternalKiVis.g:797:4: (lv_interface_1_0= ruleCodeInterface )
            // InternalKiVis.g:798:5: lv_interface_1_0= ruleCodeInterface
            {

            					newCompositeNode(grammarAccess.getCodeAccess().getInterfaceCodeInterfaceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
            lv_interface_1_0=ruleCodeInterface();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.CodeInterface");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:815:3: ( (lv_script_2_0= RULE_SCRIPT ) )
            // InternalKiVis.g:816:4: (lv_script_2_0= RULE_SCRIPT )
            {
            // InternalKiVis.g:816:4: (lv_script_2_0= RULE_SCRIPT )
            // InternalKiVis.g:817:5: lv_script_2_0= RULE_SCRIPT
            {
            lv_script_2_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_script_2_0, grammarAccess.getCodeAccess().getScriptSCRIPTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"script",
            						lv_script_2_0,
            						"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCode"


    // $ANTLR start "entryRuleBindingInterface1"
    // InternalKiVis.g:837:1: entryRuleBindingInterface1 returns [EObject current=null] : iv_ruleBindingInterface1= ruleBindingInterface1 EOF ;
    public final EObject entryRuleBindingInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingInterface1 = null;


        try {
            // InternalKiVis.g:837:58: (iv_ruleBindingInterface1= ruleBindingInterface1 EOF )
            // InternalKiVis.g:838:2: iv_ruleBindingInterface1= ruleBindingInterface1 EOF
            {
             newCompositeNode(grammarAccess.getBindingInterface1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBindingInterface1=ruleBindingInterface1();

            state._fsp--;

             current =iv_ruleBindingInterface1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingInterface1"


    // $ANTLR start "ruleBindingInterface1"
    // InternalKiVis.g:844:1: ruleBindingInterface1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? ) ;
    public final EObject ruleBindingInterface1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Token otherlv_3=null;
        Token lv_variable_4_0=null;
        Token otherlv_5=null;
        Token lv_variable_6_0=null;
        Token otherlv_7=null;
        Token lv_pool_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalKiVis.g:850:2: ( ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? ) )
            // InternalKiVis.g:851:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? )
            {
            // InternalKiVis.g:851:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? )
            // InternalKiVis.g:852:3: () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )?
            {
            // InternalKiVis.g:852:3: ()
            // InternalKiVis.g:853:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingInterface1Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:863:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:864:4: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:864:4: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:865:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

            					newLeafNode(lv_element_2_0, grammarAccess.getBindingInterface1Access().getElementIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingInterface1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKiVis.g:881:3: ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==32) ) {
                        alt13=1;
                    }
                    else if ( (LA13_3==31) ) {
                        alt13=2;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalKiVis.g:882:4: (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) )
                    {
                    // InternalKiVis.g:882:4: (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) )
                    // InternalKiVis.g:883:5: otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_0_0());
                    				
                    // InternalKiVis.g:887:5: ( (lv_variable_4_0= RULE_ID ) )
                    // InternalKiVis.g:888:6: (lv_variable_4_0= RULE_ID )
                    {
                    // InternalKiVis.g:888:6: (lv_variable_4_0= RULE_ID )
                    // InternalKiVis.g:889:7: lv_variable_4_0= RULE_ID
                    {
                    lv_variable_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                    							newLeafNode(lv_variable_4_0, grammarAccess.getBindingInterface1Access().getVariableIDTerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBindingInterface1Rule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"variable",
                    								lv_variable_4_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:907:4: (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) )
                    {
                    // InternalKiVis.g:907:4: (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) )
                    // InternalKiVis.g:908:5: otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_20); 

                    					newLeafNode(otherlv_5, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_1_0());
                    				
                    // InternalKiVis.g:912:5: ( (lv_variable_6_0= RULE_ID ) )
                    // InternalKiVis.g:913:6: (lv_variable_6_0= RULE_ID )
                    {
                    // InternalKiVis.g:913:6: (lv_variable_6_0= RULE_ID )
                    // InternalKiVis.g:914:7: lv_variable_6_0= RULE_ID
                    {
                    lv_variable_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

                    							newLeafNode(lv_variable_6_0, grammarAccess.getBindingInterface1Access().getVariableIDTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBindingInterface1Rule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"variable",
                    								lv_variable_6_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_20); 

                    					newLeafNode(otherlv_7, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_1_2());
                    				
                    // InternalKiVis.g:934:5: ( (lv_pool_8_0= RULE_ID ) )
                    // InternalKiVis.g:935:6: (lv_pool_8_0= RULE_ID )
                    {
                    // InternalKiVis.g:935:6: (lv_pool_8_0= RULE_ID )
                    // InternalKiVis.g:936:7: lv_pool_8_0= RULE_ID
                    {
                    lv_pool_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                    							newLeafNode(lv_pool_8_0, grammarAccess.getBindingInterface1Access().getPoolIDTerminalRuleCall_3_1_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getBindingInterface1Rule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"pool",
                    								lv_pool_8_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getBindingInterface1Access().getRightParenthesisKeyword_4());
            		
            // InternalKiVis.g:958:3: (otherlv_10= '=>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiVis.g:959:4: otherlv_10= '=>'
                    {
                    otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getBindingInterface1Access().getEqualsSignGreaterThanSignKeyword_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingInterface1"


    // $ANTLR start "entryRuleBindingInterface2"
    // InternalKiVis.g:968:1: entryRuleBindingInterface2 returns [EObject current=null] : iv_ruleBindingInterface2= ruleBindingInterface2 EOF ;
    public final EObject entryRuleBindingInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingInterface2 = null;


        try {
            // InternalKiVis.g:968:58: (iv_ruleBindingInterface2= ruleBindingInterface2 EOF )
            // InternalKiVis.g:969:2: iv_ruleBindingInterface2= ruleBindingInterface2 EOF
            {
             newCompositeNode(grammarAccess.getBindingInterface2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBindingInterface2=ruleBindingInterface2();

            state._fsp--;

             current =iv_ruleBindingInterface2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingInterface2"


    // $ANTLR start "ruleBindingInterface2"
    // InternalKiVis.g:975:1: ruleBindingInterface2 returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? ) ;
    public final EObject ruleBindingInterface2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;
        Token lv_pool_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalKiVis.g:981:2: ( ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? ) )
            // InternalKiVis.g:982:2: ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? )
            {
            // InternalKiVis.g:982:2: ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? )
            // InternalKiVis.g:983:3: () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )?
            {
            // InternalKiVis.g:983:3: ()
            // InternalKiVis.g:984:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingInterface2Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:994:3: ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKiVis.g:995:4: ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
                    {
                    // InternalKiVis.g:995:4: ( (lv_variable_2_0= RULE_ID ) )
                    // InternalKiVis.g:996:5: (lv_variable_2_0= RULE_ID )
                    {
                    // InternalKiVis.g:996:5: (lv_variable_2_0= RULE_ID )
                    // InternalKiVis.g:997:6: lv_variable_2_0= RULE_ID
                    {
                    lv_variable_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

                    						newLeafNode(lv_variable_2_0, grammarAccess.getBindingInterface2Access().getVariableIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBindingInterface2Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variable",
                    							lv_variable_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalKiVis.g:1013:4: (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalKiVis.g:1014:5: otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_20); 

                            					newLeafNode(otherlv_3, grammarAccess.getBindingInterface2Access().getCommaKeyword_2_1_0());
                            				
                            // InternalKiVis.g:1018:5: ( (lv_pool_4_0= RULE_ID ) )
                            // InternalKiVis.g:1019:6: (lv_pool_4_0= RULE_ID )
                            {
                            // InternalKiVis.g:1019:6: (lv_pool_4_0= RULE_ID )
                            // InternalKiVis.g:1020:7: lv_pool_4_0= RULE_ID
                            {
                            lv_pool_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                            							newLeafNode(lv_pool_4_0, grammarAccess.getBindingInterface2Access().getPoolIDTerminalRuleCall_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBindingInterface2Rule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"pool",
                            								lv_pool_4_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getBindingInterface2Access().getRightParenthesisKeyword_3());
            		
            // InternalKiVis.g:1042:3: (otherlv_6= '=>' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiVis.g:1043:4: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBindingInterface2Access().getEqualsSignGreaterThanSignKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingInterface2"


    // $ANTLR start "entryRuleHandlerInterface1"
    // InternalKiVis.g:1052:1: entryRuleHandlerInterface1 returns [EObject current=null] : iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF ;
    public final EObject entryRuleHandlerInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerInterface1 = null;


        try {
            // InternalKiVis.g:1052:58: (iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF )
            // InternalKiVis.g:1053:2: iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF
            {
             newCompositeNode(grammarAccess.getHandlerInterface1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHandlerInterface1=ruleHandlerInterface1();

            state._fsp--;

             current =iv_ruleHandlerInterface1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandlerInterface1"


    // $ANTLR start "ruleHandlerInterface1"
    // InternalKiVis.g:1059:1: ruleHandlerInterface1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? ) ;
    public final EObject ruleHandlerInterface1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_element_2_0=null;
        Token otherlv_3=null;
        Token lv_variable_4_0=null;
        Token otherlv_5=null;
        Token lv_pool_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalKiVis.g:1065:2: ( ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? ) )
            // InternalKiVis.g:1066:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? )
            {
            // InternalKiVis.g:1066:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? )
            // InternalKiVis.g:1067:3: () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )?
            {
            // InternalKiVis.g:1067:3: ()
            // InternalKiVis.g:1068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerInterface1Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1078:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:1079:4: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:1079:4: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:1080:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

            					newLeafNode(lv_element_2_0, grammarAccess.getHandlerInterface1Access().getElementIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandlerInterface1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getHandlerInterface1Access().getCommaKeyword_3());
            		
            // InternalKiVis.g:1100:3: ( (lv_variable_4_0= RULE_ID ) )
            // InternalKiVis.g:1101:4: (lv_variable_4_0= RULE_ID )
            {
            // InternalKiVis.g:1101:4: (lv_variable_4_0= RULE_ID )
            // InternalKiVis.g:1102:5: lv_variable_4_0= RULE_ID
            {
            lv_variable_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

            					newLeafNode(lv_variable_4_0, grammarAccess.getHandlerInterface1Access().getVariableIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandlerInterface1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKiVis.g:1118:3: (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKiVis.g:1119:4: otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getHandlerInterface1Access().getCommaKeyword_5_0());
                    			
                    // InternalKiVis.g:1123:4: ( (lv_pool_6_0= RULE_ID ) )
                    // InternalKiVis.g:1124:5: (lv_pool_6_0= RULE_ID )
                    {
                    // InternalKiVis.g:1124:5: (lv_pool_6_0= RULE_ID )
                    // InternalKiVis.g:1125:6: lv_pool_6_0= RULE_ID
                    {
                    lv_pool_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                    						newLeafNode(lv_pool_6_0, grammarAccess.getHandlerInterface1Access().getPoolIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHandlerInterface1Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pool",
                    							lv_pool_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getHandlerInterface1Access().getRightParenthesisKeyword_6());
            		
            // InternalKiVis.g:1146:3: (otherlv_8= '=>' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiVis.g:1147:4: otherlv_8= '=>'
                    {
                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getHandlerInterface1Access().getEqualsSignGreaterThanSignKeyword_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandlerInterface1"


    // $ANTLR start "entryRuleHandlerInterface2"
    // InternalKiVis.g:1156:1: entryRuleHandlerInterface2 returns [EObject current=null] : iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF ;
    public final EObject entryRuleHandlerInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerInterface2 = null;


        try {
            // InternalKiVis.g:1156:58: (iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF )
            // InternalKiVis.g:1157:2: iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF
            {
             newCompositeNode(grammarAccess.getHandlerInterface2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHandlerInterface2=ruleHandlerInterface2();

            state._fsp--;

             current =iv_ruleHandlerInterface2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandlerInterface2"


    // $ANTLR start "ruleHandlerInterface2"
    // InternalKiVis.g:1163:1: ruleHandlerInterface2 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? ) ;
    public final EObject ruleHandlerInterface2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;
        Token lv_pool_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalKiVis.g:1169:2: ( ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? ) )
            // InternalKiVis.g:1170:2: ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? )
            {
            // InternalKiVis.g:1170:2: ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? )
            // InternalKiVis.g:1171:3: () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )?
            {
            // InternalKiVis.g:1171:3: ()
            // InternalKiVis.g:1172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerInterface2Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1182:3: ( (lv_variable_2_0= RULE_ID ) )
            // InternalKiVis.g:1183:4: (lv_variable_2_0= RULE_ID )
            {
            // InternalKiVis.g:1183:4: (lv_variable_2_0= RULE_ID )
            // InternalKiVis.g:1184:5: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

            					newLeafNode(lv_variable_2_0, grammarAccess.getHandlerInterface2Access().getVariableIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHandlerInterface2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalKiVis.g:1200:3: (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiVis.g:1201:4: otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getHandlerInterface2Access().getCommaKeyword_3_0());
                    			
                    // InternalKiVis.g:1205:4: ( (lv_pool_4_0= RULE_ID ) )
                    // InternalKiVis.g:1206:5: (lv_pool_4_0= RULE_ID )
                    {
                    // InternalKiVis.g:1206:5: (lv_pool_4_0= RULE_ID )
                    // InternalKiVis.g:1207:6: lv_pool_4_0= RULE_ID
                    {
                    lv_pool_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                    						newLeafNode(lv_pool_4_0, grammarAccess.getHandlerInterface2Access().getPoolIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHandlerInterface2Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pool",
                    							lv_pool_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getHandlerInterface2Access().getRightParenthesisKeyword_4());
            		
            // InternalKiVis.g:1228:3: (otherlv_6= '=>' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiVis.g:1229:4: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getHandlerInterface2Access().getEqualsSignGreaterThanSignKeyword_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandlerInterface2"


    // $ANTLR start "entryRuleActionInterface1"
    // InternalKiVis.g:1238:1: entryRuleActionInterface1 returns [EObject current=null] : iv_ruleActionInterface1= ruleActionInterface1 EOF ;
    public final EObject entryRuleActionInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInterface1 = null;


        try {
            // InternalKiVis.g:1238:57: (iv_ruleActionInterface1= ruleActionInterface1 EOF )
            // InternalKiVis.g:1239:2: iv_ruleActionInterface1= ruleActionInterface1 EOF
            {
             newCompositeNode(grammarAccess.getActionInterface1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActionInterface1=ruleActionInterface1();

            state._fsp--;

             current =iv_ruleActionInterface1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionInterface1"


    // $ANTLR start "ruleActionInterface1"
    // InternalKiVis.g:1245:1: ruleActionInterface1 returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) ;
    public final EObject ruleActionInterface1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1251:2: ( ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) )
            // InternalKiVis.g:1252:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            {
            // InternalKiVis.g:1252:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            // InternalKiVis.g:1253:3: () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            {
            // InternalKiVis.g:1253:3: ()
            // InternalKiVis.g:1254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1260:3: (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKiVis.g:1261:4: otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )?
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionInterface1Access().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalKiVis.g:1265:4: ( (lv_pool_2_0= RULE_ID ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalKiVis.g:1266:5: (lv_pool_2_0= RULE_ID )
                            {
                            // InternalKiVis.g:1266:5: (lv_pool_2_0= RULE_ID )
                            // InternalKiVis.g:1267:6: lv_pool_2_0= RULE_ID
                            {
                            lv_pool_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                            						newLeafNode(lv_pool_2_0, grammarAccess.getActionInterface1Access().getPoolIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionInterface1Rule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"pool",
                            							lv_pool_2_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionInterface1Access().getRightParenthesisKeyword_1_2());
                    			
                    // InternalKiVis.g:1287:4: (otherlv_4= '=>' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==33) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalKiVis.g:1288:5: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getActionInterface1Access().getEqualsSignGreaterThanSignKeyword_1_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionInterface1"


    // $ANTLR start "entryRuleActionInterface2"
    // InternalKiVis.g:1298:1: entryRuleActionInterface2 returns [EObject current=null] : iv_ruleActionInterface2= ruleActionInterface2 EOF ;
    public final EObject entryRuleActionInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInterface2 = null;


        try {
            // InternalKiVis.g:1298:57: (iv_ruleActionInterface2= ruleActionInterface2 EOF )
            // InternalKiVis.g:1299:2: iv_ruleActionInterface2= ruleActionInterface2 EOF
            {
             newCompositeNode(grammarAccess.getActionInterface2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActionInterface2=ruleActionInterface2();

            state._fsp--;

             current =iv_ruleActionInterface2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionInterface2"


    // $ANTLR start "ruleActionInterface2"
    // InternalKiVis.g:1305:1: ruleActionInterface2 returns [EObject current=null] : ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) ;
    public final EObject ruleActionInterface2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKiVis.g:1311:2: ( ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) )
            // InternalKiVis.g:1312:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            {
            // InternalKiVis.g:1312:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            // InternalKiVis.g:1313:3: () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            {
            // InternalKiVis.g:1313:3: ()
            // InternalKiVis.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1320:3: (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalKiVis.g:1321:4: otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )?
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionInterface2Access().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionInterface2Access().getRightParenthesisKeyword_1_1());
                    			
                    // InternalKiVis.g:1329:4: (otherlv_3= '=>' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==33) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalKiVis.g:1330:5: otherlv_3= '=>'
                            {
                            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getActionInterface2Access().getEqualsSignGreaterThanSignKeyword_1_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionInterface2"


    // $ANTLR start "entryRuleCodeInterface"
    // InternalKiVis.g:1340:1: entryRuleCodeInterface returns [EObject current=null] : iv_ruleCodeInterface= ruleCodeInterface EOF ;
    public final EObject entryRuleCodeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeInterface = null;


        try {
            // InternalKiVis.g:1340:54: (iv_ruleCodeInterface= ruleCodeInterface EOF )
            // InternalKiVis.g:1341:2: iv_ruleCodeInterface= ruleCodeInterface EOF
            {
             newCompositeNode(grammarAccess.getCodeInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCodeInterface=ruleCodeInterface();

            state._fsp--;

             current =iv_ruleCodeInterface; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeInterface"


    // $ANTLR start "ruleCodeInterface"
    // InternalKiVis.g:1347:1: ruleCodeInterface returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) ;
    public final EObject ruleCodeInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1353:2: ( ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) )
            // InternalKiVis.g:1354:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            {
            // InternalKiVis.g:1354:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            // InternalKiVis.g:1355:3: () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            {
            // InternalKiVis.g:1355:3: ()
            // InternalKiVis.g:1356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1362:3: (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalKiVis.g:1363:4: otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )?
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getCodeInterfaceAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalKiVis.g:1367:4: ( (lv_pool_2_0= RULE_ID ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalKiVis.g:1368:5: (lv_pool_2_0= RULE_ID )
                            {
                            // InternalKiVis.g:1368:5: (lv_pool_2_0= RULE_ID )
                            // InternalKiVis.g:1369:6: lv_pool_2_0= RULE_ID
                            {
                            lv_pool_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                            						newLeafNode(lv_pool_2_0, grammarAccess.getCodeInterfaceAccess().getPoolIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCodeInterfaceRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"pool",
                            							lv_pool_2_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getCodeInterfaceAccess().getRightParenthesisKeyword_1_2());
                    			
                    // InternalKiVis.g:1389:4: (otherlv_4= '=>' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==33) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalKiVis.g:1390:5: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getCodeInterfaceAccess().getEqualsSignGreaterThanSignKeyword_1_3());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeInterface"


    // $ANTLR start "entryRuleKey"
    // InternalKiVis.g:1400:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalKiVis.g:1400:43: (iv_ruleKey= ruleKey EOF )
            // InternalKiVis.g:1401:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalKiVis.g:1407:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_5=null;


        	enterRule();

        try {
            // InternalKiVis.g:1413:2: ( ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* ) )
            // InternalKiVis.g:1414:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* )
            {
            // InternalKiVis.g:1414:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* )
            // InternalKiVis.g:1415:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )*
            {
            // InternalKiVis.g:1415:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalKiVis.g:1416:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getKeyAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1424:4: (kw= '#' this_ID_2= RULE_ID )
                    {
                    // InternalKiVis.g:1424:4: (kw= '#' this_ID_2= RULE_ID )
                    // InternalKiVis.g:1425:5: kw= '#' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_20); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getKeyAccess().getNumberSignKeyword_0_1_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getKeyAccess().getIDTerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalKiVis.g:1439:3: ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||(LA32_0>=35 && LA32_0<=36)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalKiVis.g:1440:4: (kw= '.' | kw= '-' )? this_ID_5= RULE_ID
            	    {
            	    // InternalKiVis.g:1440:4: (kw= '.' | kw= '-' )?
            	    int alt31=3;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==35) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==36) ) {
            	        alt31=2;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalKiVis.g:1441:5: kw= '.'
            	            {
            	            kw=(Token)match(input,35,FollowSets000.FOLLOW_20); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getKeyAccess().getFullStopKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiVis.g:1447:5: kw= '-'
            	            {
            	            kw=(Token)match(input,36,FollowSets000.FOLLOW_20); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getKeyAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getKeyAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "ruleSimulationCorntrol"
    // InternalKiVis.g:1465:1: ruleSimulationCorntrol returns [Enumerator current=null] : ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) ) ;
    public final Enumerator ruleSimulationCorntrol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1471:2: ( ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) ) )
            // InternalKiVis.g:1472:2: ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) )
            {
            // InternalKiVis.g:1472:2: ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt33=1;
                }
                break;
            case 38:
                {
                alt33=2;
                }
                break;
            case 39:
                {
                alt33=3;
                }
                break;
            case 40:
                {
                alt33=4;
                }
                break;
            case 41:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalKiVis.g:1473:3: (enumLiteral_0= 'nothing' )
                    {
                    // InternalKiVis.g:1473:3: (enumLiteral_0= 'nothing' )
                    // InternalKiVis.g:1474:4: enumLiteral_0= 'nothing'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimulationCorntrolAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1481:3: (enumLiteral_1= 'step' )
                    {
                    // InternalKiVis.g:1481:3: (enumLiteral_1= 'step' )
                    // InternalKiVis.g:1482:4: enumLiteral_1= 'step'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getSTEPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimulationCorntrolAccess().getSTEPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:1489:3: (enumLiteral_2= 'stop' )
                    {
                    // InternalKiVis.g:1489:3: (enumLiteral_2= 'stop' )
                    // InternalKiVis.g:1490:4: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getSTOPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimulationCorntrolAccess().getSTOPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:1497:3: (enumLiteral_3= 'pause' )
                    {
                    // InternalKiVis.g:1497:3: (enumLiteral_3= 'pause' )
                    // InternalKiVis.g:1498:4: enumLiteral_3= 'pause'
                    {
                    enumLiteral_3=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getPAUSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimulationCorntrolAccess().getPAUSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKiVis.g:1505:3: (enumLiteral_4= 'play' )
                    {
                    // InternalKiVis.g:1505:3: (enumLiteral_4= 'play' )
                    // InternalKiVis.g:1506:4: enumLiteral_4= 'play'
                    {
                    enumLiteral_4=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getPLAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSimulationCorntrolAccess().getPLAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulationCorntrol"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020938002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020920002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001A000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000044000020L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003E000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000042L});
    }


}