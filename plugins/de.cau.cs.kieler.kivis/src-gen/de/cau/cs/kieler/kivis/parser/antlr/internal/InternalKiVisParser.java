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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SCRIPT", "RULE_ID", "RULE_BOOL", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'image'", "'load'", "'init'", "'bind'", "'to'", "'with'", "'handle'", "'in'", "'event'", "'on'", "'do'", "'deferred'", "'set'", "'simulation'", "'script'", "'('", "','", "')'", "'=>'", "'#'", "'.'", "'-'", "'nothing'", "'step'", "'stop'", "'pause'", "'play'"
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

                if ( (LA3_0==17||LA3_0==20||LA3_0==22||LA3_0==28) ) {
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
            case 22:
                {
                alt4=3;
                }
                break;
            case 28:
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
    // InternalKiVis.g:389:1: ruleHandler returns [EObject current=null] : (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) ) ;
    public final EObject ruleHandler() throws RecognitionException {
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
            // InternalKiVis.g:395:2: ( (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) ) )
            // InternalKiVis.g:396:2: (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )
            {
            // InternalKiVis.g:396:2: (otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )
            // InternalKiVis.g:397:3: otherlv_0= 'handle' ( (lv_variable_1_0= ruleKey ) ) ( (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
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

            // InternalKiVis.g:420:3: ( (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKiVis.g:421:4: (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:421:4: (otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:422:5: otherlv_2= 'in' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleHandlerInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getHandlerAccess().getInKeyword_2_0_0());
                    				
                    // InternalKiVis.g:426:5: ( (lv_domElement_3_0= RULE_STRING ) )
                    // InternalKiVis.g:427:6: (lv_domElement_3_0= RULE_STRING )
                    {
                    // InternalKiVis.g:427:6: (lv_domElement_3_0= RULE_STRING )
                    // InternalKiVis.g:428:7: lv_domElement_3_0= RULE_STRING
                    {
                    lv_domElement_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_9); 

                    							newLeafNode(lv_domElement_3_0, grammarAccess.getHandlerAccess().getDomElementSTRINGTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHandlerRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"domElement",
                    								lv_domElement_3_0,
                    								"de.cau.cs.kieler.kivis.KiVis.STRING");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getHandlerAccess().getWithKeyword_2_0_2());
                    				
                    // InternalKiVis.g:448:5: ( (lv_interface_5_0= ruleHandlerInterface1 ) )
                    // InternalKiVis.g:449:6: (lv_interface_5_0= ruleHandlerInterface1 )
                    {
                    // InternalKiVis.g:449:6: (lv_interface_5_0= ruleHandlerInterface1 )
                    // InternalKiVis.g:450:7: lv_interface_5_0= ruleHandlerInterface1
                    {

                    							newCompositeNode(grammarAccess.getHandlerAccess().getInterfaceHandlerInterface1ParserRuleCall_2_0_3_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_interface_5_0=ruleHandlerInterface1();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHandlerRule());
                    							}
                    							set(
                    								current,
                    								"interface",
                    								lv_interface_5_0,
                    								"de.cau.cs.kieler.kivis.KiVis.HandlerInterface1");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKiVis.g:467:5: ( (lv_script_6_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:468:6: (lv_script_6_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:468:6: (lv_script_6_0= RULE_SCRIPT )
                    // InternalKiVis.g:469:7: lv_script_6_0= RULE_SCRIPT
                    {
                    lv_script_6_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_script_6_0, grammarAccess.getHandlerAccess().getScriptSCRIPTTerminalRuleCall_2_0_4_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHandlerRule());
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
                    // InternalKiVis.g:487:4: (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:487:4: (otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:488:5: otherlv_7= 'with' ( (lv_interface_8_0= ruleHandlerInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getHandlerAccess().getWithKeyword_2_1_0());
                    				
                    // InternalKiVis.g:492:5: ( (lv_interface_8_0= ruleHandlerInterface2 ) )
                    // InternalKiVis.g:493:6: (lv_interface_8_0= ruleHandlerInterface2 )
                    {
                    // InternalKiVis.g:493:6: (lv_interface_8_0= ruleHandlerInterface2 )
                    // InternalKiVis.g:494:7: lv_interface_8_0= ruleHandlerInterface2
                    {

                    							newCompositeNode(grammarAccess.getHandlerAccess().getInterfaceHandlerInterface2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_interface_8_0=ruleHandlerInterface2();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHandlerRule());
                    							}
                    							set(
                    								current,
                    								"interface",
                    								lv_interface_8_0,
                    								"de.cau.cs.kieler.kivis.KiVis.HandlerInterface2");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKiVis.g:511:5: ( (lv_script_9_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:512:6: (lv_script_9_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:512:6: (lv_script_9_0= RULE_SCRIPT )
                    // InternalKiVis.g:513:7: lv_script_9_0= RULE_SCRIPT
                    {
                    lv_script_9_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

                    							newLeafNode(lv_script_9_0, grammarAccess.getHandlerAccess().getScriptSCRIPTTerminalRuleCall_2_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHandlerRule());
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
    // $ANTLR end "ruleHandler"


    // $ANTLR start "entryRuleAction"
    // InternalKiVis.g:535:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalKiVis.g:535:47: (iv_ruleAction= ruleAction EOF )
            // InternalKiVis.g:536:2: iv_ruleAction= ruleAction EOF
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
    // InternalKiVis.g:542:1: ruleAction returns [EObject current=null] : (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_domElement_3_0= RULE_STRING ) ) (otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )? (otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) ) )? (otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_domEvent_1_0=null;
        Token otherlv_2=null;
        Token lv_domElement_3_0=null;
        Token otherlv_4=null;
        Token lv_deferred_5_0=null;
        Token lv_script_7_0=null;
        Token lv_script_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_interface_6_0 = null;

        EObject lv_interface_8_0 = null;

        AntlrDatatypeRuleToken lv_variable_11_0 = null;

        Enumerator lv_control_13_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:548:2: ( (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_domElement_3_0= RULE_STRING ) ) (otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )? (otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) ) )? (otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) ) )? ) )
            // InternalKiVis.g:549:2: (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_domElement_3_0= RULE_STRING ) ) (otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )? (otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) ) )? (otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) ) )? )
            {
            // InternalKiVis.g:549:2: (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_domElement_3_0= RULE_STRING ) ) (otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )? (otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) ) )? (otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) ) )? )
            // InternalKiVis.g:550:3: otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_domElement_3_0= RULE_STRING ) ) (otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )? (otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) ) )? (otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) ) )?
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getEventKeyword_0());
            		
            // InternalKiVis.g:554:3: ( (lv_domEvent_1_0= RULE_STRING ) )
            // InternalKiVis.g:555:4: (lv_domEvent_1_0= RULE_STRING )
            {
            // InternalKiVis.g:555:4: (lv_domEvent_1_0= RULE_STRING )
            // InternalKiVis.g:556:5: lv_domEvent_1_0= RULE_STRING
            {
            lv_domEvent_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

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

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getOnKeyword_2());
            		
            // InternalKiVis.g:576:3: ( (lv_domElement_3_0= RULE_STRING ) )
            // InternalKiVis.g:577:4: (lv_domElement_3_0= RULE_STRING )
            {
            // InternalKiVis.g:577:4: (lv_domElement_3_0= RULE_STRING )
            // InternalKiVis.g:578:5: lv_domElement_3_0= RULE_STRING
            {
            lv_domElement_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_13); 

            					newLeafNode(lv_domElement_3_0, grammarAccess.getActionAccess().getDomElementSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"domElement",
            						lv_domElement_3_0,
            						"de.cau.cs.kieler.kivis.KiVis.STRING");
            				

            }


            }

            // InternalKiVis.g:594:3: (otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiVis.g:595:4: otherlv_4= 'do' ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getDoKeyword_4_0());
                    			
                    // InternalKiVis.g:599:4: ( ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==EOF||LA7_0==RULE_SCRIPT||LA7_0==29) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalKiVis.g:600:5: ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )
                            {
                            // InternalKiVis.g:600:5: ( ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )
                            // InternalKiVis.g:601:6: ( (lv_deferred_5_0= 'deferred' ) ) ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) )
                            {
                            // InternalKiVis.g:601:6: ( (lv_deferred_5_0= 'deferred' ) )
                            // InternalKiVis.g:602:7: (lv_deferred_5_0= 'deferred' )
                            {
                            // InternalKiVis.g:602:7: (lv_deferred_5_0= 'deferred' )
                            // InternalKiVis.g:603:8: lv_deferred_5_0= 'deferred'
                            {
                            lv_deferred_5_0=(Token)match(input,25,FollowSets000.FOLLOW_15); 

                            								newLeafNode(lv_deferred_5_0, grammarAccess.getActionAccess().getDeferredDeferredKeyword_4_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getActionRule());
                            								}
                            								setWithLastConsumed(current, "deferred", true, "deferred");
                            							

                            }


                            }

                            // InternalKiVis.g:615:6: ( (lv_interface_6_0= ruleActionInterface1 ) )
                            // InternalKiVis.g:616:7: (lv_interface_6_0= ruleActionInterface1 )
                            {
                            // InternalKiVis.g:616:7: (lv_interface_6_0= ruleActionInterface1 )
                            // InternalKiVis.g:617:8: lv_interface_6_0= ruleActionInterface1
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getInterfaceActionInterface1ParserRuleCall_4_1_0_1_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_interface_6_0=ruleActionInterface1();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getActionRule());
                            								}
                            								set(
                            									current,
                            									"interface",
                            									lv_interface_6_0,
                            									"de.cau.cs.kieler.kivis.KiVis.ActionInterface1");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalKiVis.g:634:6: ( (lv_script_7_0= RULE_SCRIPT ) )
                            // InternalKiVis.g:635:7: (lv_script_7_0= RULE_SCRIPT )
                            {
                            // InternalKiVis.g:635:7: (lv_script_7_0= RULE_SCRIPT )
                            // InternalKiVis.g:636:8: lv_script_7_0= RULE_SCRIPT
                            {
                            lv_script_7_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_16); 

                            								newLeafNode(lv_script_7_0, grammarAccess.getActionAccess().getScriptSCRIPTTerminalRuleCall_4_1_0_2_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getActionRule());
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
                            // InternalKiVis.g:654:5: ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) )
                            {
                            // InternalKiVis.g:654:5: ( ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) )
                            // InternalKiVis.g:655:6: ( (lv_interface_8_0= ruleActionInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) )
                            {
                            // InternalKiVis.g:655:6: ( (lv_interface_8_0= ruleActionInterface2 ) )
                            // InternalKiVis.g:656:7: (lv_interface_8_0= ruleActionInterface2 )
                            {
                            // InternalKiVis.g:656:7: (lv_interface_8_0= ruleActionInterface2 )
                            // InternalKiVis.g:657:8: lv_interface_8_0= ruleActionInterface2
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getInterfaceActionInterface2ParserRuleCall_4_1_1_0_0());
                            							
                            pushFollow(FollowSets000.FOLLOW_5);
                            lv_interface_8_0=ruleActionInterface2();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getActionRule());
                            								}
                            								set(
                            									current,
                            									"interface",
                            									lv_interface_8_0,
                            									"de.cau.cs.kieler.kivis.KiVis.ActionInterface2");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalKiVis.g:674:6: ( (lv_script_9_0= RULE_SCRIPT ) )
                            // InternalKiVis.g:675:7: (lv_script_9_0= RULE_SCRIPT )
                            {
                            // InternalKiVis.g:675:7: (lv_script_9_0= RULE_SCRIPT )
                            // InternalKiVis.g:676:8: lv_script_9_0= RULE_SCRIPT
                            {
                            lv_script_9_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_16); 

                            								newLeafNode(lv_script_9_0, grammarAccess.getActionAccess().getScriptSCRIPTTerminalRuleCall_4_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getActionRule());
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
                    break;

            }

            // InternalKiVis.g:695:3: (otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKiVis.g:696:4: otherlv_10= 'set' ( (lv_variable_11_0= ruleKey ) )
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getActionAccess().getSetKeyword_5_0());
                    			
                    // InternalKiVis.g:700:4: ( (lv_variable_11_0= ruleKey ) )
                    // InternalKiVis.g:701:5: (lv_variable_11_0= ruleKey )
                    {
                    // InternalKiVis.g:701:5: (lv_variable_11_0= ruleKey )
                    // InternalKiVis.g:702:6: lv_variable_11_0= ruleKey
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getVariableKeyParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_variable_11_0=ruleKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_11_0,
                    							"de.cau.cs.kieler.kivis.KiVis.Key");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiVis.g:720:3: (otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiVis.g:721:4: otherlv_12= 'simulation' ( (lv_control_13_0= ruleSimulationCorntrol ) )
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getActionAccess().getSimulationKeyword_6_0());
                    			
                    // InternalKiVis.g:725:4: ( (lv_control_13_0= ruleSimulationCorntrol ) )
                    // InternalKiVis.g:726:5: (lv_control_13_0= ruleSimulationCorntrol )
                    {
                    // InternalKiVis.g:726:5: (lv_control_13_0= ruleSimulationCorntrol )
                    // InternalKiVis.g:727:6: lv_control_13_0= ruleSimulationCorntrol
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getControlSimulationCorntrolEnumRuleCall_6_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_control_13_0=ruleSimulationCorntrol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"control",
                    							lv_control_13_0,
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
    // InternalKiVis.g:749:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalKiVis.g:749:45: (iv_ruleCode= ruleCode EOF )
            // InternalKiVis.g:750:2: iv_ruleCode= ruleCode EOF
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
    // InternalKiVis.g:756:1: ruleCode returns [EObject current=null] : (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_script_2_0=null;
        EObject lv_interface_1_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:762:2: ( (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) )
            // InternalKiVis.g:763:2: (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            {
            // InternalKiVis.g:763:2: (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            // InternalKiVis.g:764:3: otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeAccess().getScriptKeyword_0());
            		
            // InternalKiVis.g:768:3: ( (lv_interface_1_0= ruleCodeInterface ) )
            // InternalKiVis.g:769:4: (lv_interface_1_0= ruleCodeInterface )
            {
            // InternalKiVis.g:769:4: (lv_interface_1_0= ruleCodeInterface )
            // InternalKiVis.g:770:5: lv_interface_1_0= ruleCodeInterface
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

            // InternalKiVis.g:787:3: ( (lv_script_2_0= RULE_SCRIPT ) )
            // InternalKiVis.g:788:4: (lv_script_2_0= RULE_SCRIPT )
            {
            // InternalKiVis.g:788:4: (lv_script_2_0= RULE_SCRIPT )
            // InternalKiVis.g:789:5: lv_script_2_0= RULE_SCRIPT
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
    // InternalKiVis.g:809:1: entryRuleBindingInterface1 returns [EObject current=null] : iv_ruleBindingInterface1= ruleBindingInterface1 EOF ;
    public final EObject entryRuleBindingInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingInterface1 = null;


        try {
            // InternalKiVis.g:809:58: (iv_ruleBindingInterface1= ruleBindingInterface1 EOF )
            // InternalKiVis.g:810:2: iv_ruleBindingInterface1= ruleBindingInterface1 EOF
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
    // InternalKiVis.g:816:1: ruleBindingInterface1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? ) ;
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
            // InternalKiVis.g:822:2: ( ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? ) )
            // InternalKiVis.g:823:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? )
            {
            // InternalKiVis.g:823:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? )
            // InternalKiVis.g:824:3: () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )?
            {
            // InternalKiVis.g:824:3: ()
            // InternalKiVis.g:825:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingInterface1Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:835:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:836:4: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:836:4: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:837:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

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

            // InternalKiVis.g:853:3: ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID) ) {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==30) ) {
                        alt11=2;
                    }
                    else if ( (LA11_3==31) ) {
                        alt11=1;
                    }
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalKiVis.g:854:4: (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) )
                    {
                    // InternalKiVis.g:854:4: (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) )
                    // InternalKiVis.g:855:5: otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                    					newLeafNode(otherlv_3, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_0_0());
                    				
                    // InternalKiVis.g:859:5: ( (lv_variable_4_0= RULE_ID ) )
                    // InternalKiVis.g:860:6: (lv_variable_4_0= RULE_ID )
                    {
                    // InternalKiVis.g:860:6: (lv_variable_4_0= RULE_ID )
                    // InternalKiVis.g:861:7: lv_variable_4_0= RULE_ID
                    {
                    lv_variable_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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
                    // InternalKiVis.g:879:4: (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) )
                    {
                    // InternalKiVis.g:879:4: (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) )
                    // InternalKiVis.g:880:5: otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                    					newLeafNode(otherlv_5, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_1_0());
                    				
                    // InternalKiVis.g:884:5: ( (lv_variable_6_0= RULE_ID ) )
                    // InternalKiVis.g:885:6: (lv_variable_6_0= RULE_ID )
                    {
                    // InternalKiVis.g:885:6: (lv_variable_6_0= RULE_ID )
                    // InternalKiVis.g:886:7: lv_variable_6_0= RULE_ID
                    {
                    lv_variable_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                    					newLeafNode(otherlv_7, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_1_2());
                    				
                    // InternalKiVis.g:906:5: ( (lv_pool_8_0= RULE_ID ) )
                    // InternalKiVis.g:907:6: (lv_pool_8_0= RULE_ID )
                    {
                    // InternalKiVis.g:907:6: (lv_pool_8_0= RULE_ID )
                    // InternalKiVis.g:908:7: lv_pool_8_0= RULE_ID
                    {
                    lv_pool_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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

            otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getBindingInterface1Access().getRightParenthesisKeyword_4());
            		
            // InternalKiVis.g:930:3: (otherlv_10= '=>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKiVis.g:931:4: otherlv_10= '=>'
                    {
                    otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:940:1: entryRuleBindingInterface2 returns [EObject current=null] : iv_ruleBindingInterface2= ruleBindingInterface2 EOF ;
    public final EObject entryRuleBindingInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingInterface2 = null;


        try {
            // InternalKiVis.g:940:58: (iv_ruleBindingInterface2= ruleBindingInterface2 EOF )
            // InternalKiVis.g:941:2: iv_ruleBindingInterface2= ruleBindingInterface2 EOF
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
    // InternalKiVis.g:947:1: ruleBindingInterface2 returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? ) ;
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
            // InternalKiVis.g:953:2: ( ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? ) )
            // InternalKiVis.g:954:2: ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? )
            {
            // InternalKiVis.g:954:2: ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? )
            // InternalKiVis.g:955:3: () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )?
            {
            // InternalKiVis.g:955:3: ()
            // InternalKiVis.g:956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingInterface2Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:966:3: ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiVis.g:967:4: ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
                    {
                    // InternalKiVis.g:967:4: ( (lv_variable_2_0= RULE_ID ) )
                    // InternalKiVis.g:968:5: (lv_variable_2_0= RULE_ID )
                    {
                    // InternalKiVis.g:968:5: (lv_variable_2_0= RULE_ID )
                    // InternalKiVis.g:969:6: lv_variable_2_0= RULE_ID
                    {
                    lv_variable_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

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

                    // InternalKiVis.g:985:4: (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalKiVis.g:986:5: otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                            					newLeafNode(otherlv_3, grammarAccess.getBindingInterface2Access().getCommaKeyword_2_1_0());
                            				
                            // InternalKiVis.g:990:5: ( (lv_pool_4_0= RULE_ID ) )
                            // InternalKiVis.g:991:6: (lv_pool_4_0= RULE_ID )
                            {
                            // InternalKiVis.g:991:6: (lv_pool_4_0= RULE_ID )
                            // InternalKiVis.g:992:7: lv_pool_4_0= RULE_ID
                            {
                            lv_pool_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getBindingInterface2Access().getRightParenthesisKeyword_3());
            		
            // InternalKiVis.g:1014:3: (otherlv_6= '=>' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalKiVis.g:1015:4: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1024:1: entryRuleHandlerInterface1 returns [EObject current=null] : iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF ;
    public final EObject entryRuleHandlerInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerInterface1 = null;


        try {
            // InternalKiVis.g:1024:58: (iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF )
            // InternalKiVis.g:1025:2: iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF
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
    // InternalKiVis.g:1031:1: ruleHandlerInterface1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? ) ;
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
            // InternalKiVis.g:1037:2: ( ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? ) )
            // InternalKiVis.g:1038:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? )
            {
            // InternalKiVis.g:1038:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? )
            // InternalKiVis.g:1039:3: () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )?
            {
            // InternalKiVis.g:1039:3: ()
            // InternalKiVis.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerInterface1Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1050:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:1051:4: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:1051:4: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:1052:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getHandlerInterface1Access().getCommaKeyword_3());
            		
            // InternalKiVis.g:1072:3: ( (lv_variable_4_0= RULE_ID ) )
            // InternalKiVis.g:1073:4: (lv_variable_4_0= RULE_ID )
            {
            // InternalKiVis.g:1073:4: (lv_variable_4_0= RULE_ID )
            // InternalKiVis.g:1074:5: lv_variable_4_0= RULE_ID
            {
            lv_variable_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

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

            // InternalKiVis.g:1090:3: (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKiVis.g:1091:4: otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getHandlerInterface1Access().getCommaKeyword_5_0());
                    			
                    // InternalKiVis.g:1095:4: ( (lv_pool_6_0= RULE_ID ) )
                    // InternalKiVis.g:1096:5: (lv_pool_6_0= RULE_ID )
                    {
                    // InternalKiVis.g:1096:5: (lv_pool_6_0= RULE_ID )
                    // InternalKiVis.g:1097:6: lv_pool_6_0= RULE_ID
                    {
                    lv_pool_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getHandlerInterface1Access().getRightParenthesisKeyword_6());
            		
            // InternalKiVis.g:1118:3: (otherlv_8= '=>' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalKiVis.g:1119:4: otherlv_8= '=>'
                    {
                    otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1128:1: entryRuleHandlerInterface2 returns [EObject current=null] : iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF ;
    public final EObject entryRuleHandlerInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerInterface2 = null;


        try {
            // InternalKiVis.g:1128:58: (iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF )
            // InternalKiVis.g:1129:2: iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF
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
    // InternalKiVis.g:1135:1: ruleHandlerInterface2 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? ) ;
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
            // InternalKiVis.g:1141:2: ( ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? ) )
            // InternalKiVis.g:1142:2: ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? )
            {
            // InternalKiVis.g:1142:2: ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? )
            // InternalKiVis.g:1143:3: () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )?
            {
            // InternalKiVis.g:1143:3: ()
            // InternalKiVis.g:1144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerInterface2Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1154:3: ( (lv_variable_2_0= RULE_ID ) )
            // InternalKiVis.g:1155:4: (lv_variable_2_0= RULE_ID )
            {
            // InternalKiVis.g:1155:4: (lv_variable_2_0= RULE_ID )
            // InternalKiVis.g:1156:5: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); 

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

            // InternalKiVis.g:1172:3: (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKiVis.g:1173:4: otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getHandlerInterface2Access().getCommaKeyword_3_0());
                    			
                    // InternalKiVis.g:1177:4: ( (lv_pool_4_0= RULE_ID ) )
                    // InternalKiVis.g:1178:5: (lv_pool_4_0= RULE_ID )
                    {
                    // InternalKiVis.g:1178:5: (lv_pool_4_0= RULE_ID )
                    // InternalKiVis.g:1179:6: lv_pool_4_0= RULE_ID
                    {
                    lv_pool_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getHandlerInterface2Access().getRightParenthesisKeyword_4());
            		
            // InternalKiVis.g:1200:3: (otherlv_6= '=>' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiVis.g:1201:4: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1210:1: entryRuleActionInterface1 returns [EObject current=null] : iv_ruleActionInterface1= ruleActionInterface1 EOF ;
    public final EObject entryRuleActionInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInterface1 = null;


        try {
            // InternalKiVis.g:1210:57: (iv_ruleActionInterface1= ruleActionInterface1 EOF )
            // InternalKiVis.g:1211:2: iv_ruleActionInterface1= ruleActionInterface1 EOF
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
    // InternalKiVis.g:1217:1: ruleActionInterface1 returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) ;
    public final EObject ruleActionInterface1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1223:2: ( ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) )
            // InternalKiVis.g:1224:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            {
            // InternalKiVis.g:1224:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            // InternalKiVis.g:1225:3: () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            {
            // InternalKiVis.g:1225:3: ()
            // InternalKiVis.g:1226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1232:3: (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKiVis.g:1233:4: otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )?
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionInterface1Access().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalKiVis.g:1237:4: ( (lv_pool_2_0= RULE_ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalKiVis.g:1238:5: (lv_pool_2_0= RULE_ID )
                            {
                            // InternalKiVis.g:1238:5: (lv_pool_2_0= RULE_ID )
                            // InternalKiVis.g:1239:6: lv_pool_2_0= RULE_ID
                            {
                            lv_pool_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionInterface1Access().getRightParenthesisKeyword_1_2());
                    			
                    // InternalKiVis.g:1259:4: (otherlv_4= '=>' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==32) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalKiVis.g:1260:5: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1270:1: entryRuleActionInterface2 returns [EObject current=null] : iv_ruleActionInterface2= ruleActionInterface2 EOF ;
    public final EObject entryRuleActionInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInterface2 = null;


        try {
            // InternalKiVis.g:1270:57: (iv_ruleActionInterface2= ruleActionInterface2 EOF )
            // InternalKiVis.g:1271:2: iv_ruleActionInterface2= ruleActionInterface2 EOF
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
    // InternalKiVis.g:1277:1: ruleActionInterface2 returns [EObject current=null] : ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) ;
    public final EObject ruleActionInterface2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKiVis.g:1283:2: ( ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) )
            // InternalKiVis.g:1284:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            {
            // InternalKiVis.g:1284:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            // InternalKiVis.g:1285:3: () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            {
            // InternalKiVis.g:1285:3: ()
            // InternalKiVis.g:1286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1292:3: (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalKiVis.g:1293:4: otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )?
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionInterface2Access().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionInterface2Access().getRightParenthesisKeyword_1_1());
                    			
                    // InternalKiVis.g:1301:4: (otherlv_3= '=>' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalKiVis.g:1302:5: otherlv_3= '=>'
                            {
                            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1312:1: entryRuleCodeInterface returns [EObject current=null] : iv_ruleCodeInterface= ruleCodeInterface EOF ;
    public final EObject entryRuleCodeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeInterface = null;


        try {
            // InternalKiVis.g:1312:54: (iv_ruleCodeInterface= ruleCodeInterface EOF )
            // InternalKiVis.g:1313:2: iv_ruleCodeInterface= ruleCodeInterface EOF
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
    // InternalKiVis.g:1319:1: ruleCodeInterface returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) ;
    public final EObject ruleCodeInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1325:2: ( ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) )
            // InternalKiVis.g:1326:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            {
            // InternalKiVis.g:1326:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            // InternalKiVis.g:1327:3: () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            {
            // InternalKiVis.g:1327:3: ()
            // InternalKiVis.g:1328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1334:3: (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalKiVis.g:1335:4: otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )?
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getCodeInterfaceAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalKiVis.g:1339:4: ( (lv_pool_2_0= RULE_ID ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalKiVis.g:1340:5: (lv_pool_2_0= RULE_ID )
                            {
                            // InternalKiVis.g:1340:5: (lv_pool_2_0= RULE_ID )
                            // InternalKiVis.g:1341:6: lv_pool_2_0= RULE_ID
                            {
                            lv_pool_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_21); 

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

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getCodeInterfaceAccess().getRightParenthesisKeyword_1_2());
                    			
                    // InternalKiVis.g:1361:4: (otherlv_4= '=>' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalKiVis.g:1362:5: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1372:1: entryRuleKey returns [String current=null] : iv_ruleKey= ruleKey EOF ;
    public final String entryRuleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKey = null;


        try {
            // InternalKiVis.g:1372:43: (iv_ruleKey= ruleKey EOF )
            // InternalKiVis.g:1373:2: iv_ruleKey= ruleKey EOF
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
    // InternalKiVis.g:1379:1: ruleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_5=null;


        	enterRule();

        try {
            // InternalKiVis.g:1385:2: ( ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* ) )
            // InternalKiVis.g:1386:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* )
            {
            // InternalKiVis.g:1386:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )* )
            // InternalKiVis.g:1387:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )*
            {
            // InternalKiVis.g:1387:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiVis.g:1388:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getKeyAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1396:4: (kw= '#' this_ID_2= RULE_ID )
                    {
                    // InternalKiVis.g:1396:4: (kw= '#' this_ID_2= RULE_ID )
                    // InternalKiVis.g:1397:5: kw= '#' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_19); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getKeyAccess().getNumberSignKeyword_0_1_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getKeyAccess().getIDTerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalKiVis.g:1411:3: ( (kw= '.' | kw= '-' )? this_ID_5= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=34 && LA30_0<=35)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalKiVis.g:1412:4: (kw= '.' | kw= '-' )? this_ID_5= RULE_ID
            	    {
            	    // InternalKiVis.g:1412:4: (kw= '.' | kw= '-' )?
            	    int alt29=3;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==34) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==35) ) {
            	        alt29=2;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalKiVis.g:1413:5: kw= '.'
            	            {
            	            kw=(Token)match(input,34,FollowSets000.FOLLOW_19); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getKeyAccess().getFullStopKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiVis.g:1419:5: kw= '-'
            	            {
            	            kw=(Token)match(input,35,FollowSets000.FOLLOW_19); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getKeyAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getKeyAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalKiVis.g:1437:1: ruleSimulationCorntrol returns [Enumerator current=null] : ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) ) ;
    public final Enumerator ruleSimulationCorntrol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1443:2: ( ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) ) )
            // InternalKiVis.g:1444:2: ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) )
            {
            // InternalKiVis.g:1444:2: ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt31=1;
                }
                break;
            case 37:
                {
                alt31=2;
                }
                break;
            case 38:
                {
                alt31=3;
                }
                break;
            case 39:
                {
                alt31=4;
                }
                break;
            case 40:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalKiVis.g:1445:3: (enumLiteral_0= 'nothing' )
                    {
                    // InternalKiVis.g:1445:3: (enumLiteral_0= 'nothing' )
                    // InternalKiVis.g:1446:4: enumLiteral_0= 'nothing'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimulationCorntrolAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1453:3: (enumLiteral_1= 'step' )
                    {
                    // InternalKiVis.g:1453:3: (enumLiteral_1= 'step' )
                    // InternalKiVis.g:1454:4: enumLiteral_1= 'step'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getSTEPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimulationCorntrolAccess().getSTEPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:1461:3: (enumLiteral_2= 'stop' )
                    {
                    // InternalKiVis.g:1461:3: (enumLiteral_2= 'stop' )
                    // InternalKiVis.g:1462:4: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getSTOPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimulationCorntrolAccess().getSTOPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:1469:3: (enumLiteral_3= 'pause' )
                    {
                    // InternalKiVis.g:1469:3: (enumLiteral_3= 'pause' )
                    // InternalKiVis.g:1470:4: enumLiteral_3= 'pause'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getPAUSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimulationCorntrolAccess().getPAUSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKiVis.g:1477:3: (enumLiteral_4= 'play' )
                    {
                    // InternalKiVis.g:1477:3: (enumLiteral_4= 'play' )
                    // InternalKiVis.g:1478:4: enumLiteral_4= 'play'
                    {
                    enumLiteral_4=(Token)match(input,40,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010538002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010520002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000D000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000022000020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001F000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C00000042L});
    }


}