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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SCRIPT", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_ESCAPED_CHAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'image'", "'load'", "'init'", "'bind'", "'to'", "'with'", "'handle'", "'in'", "'all'", "'event'", "'on'", "'do'", "'deferred'", "'set'", "'signal'", "'simulation'", "'script'", "'('", "','", "')'", "'=>'", "'#'", "'-'", "'.'", "'nothing'", "'step'", "'stop'", "'pause'", "'play'"
    };
    public static final int RULE_ESCAPED_CHAR=9;
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
    public static final int RULE_BOOL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalKiVis.g:72:1: ruleVisualization returns [EObject current=null] : ( (otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) ) )* (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* ) ;
    public final EObject ruleVisualization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_images_1_0=null;
        Token otherlv_2=null;
        Token lv_loads_3_0=null;
        Token otherlv_4=null;
        Token lv_init_5_0=null;
        EObject lv_content_6_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:78:2: ( ( (otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) ) )* (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* ) )
            // InternalKiVis.g:79:2: ( (otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) ) )* (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* )
            {
            // InternalKiVis.g:79:2: ( (otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) ) )* (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )* )
            // InternalKiVis.g:80:3: (otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) ) )* (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )* (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )? ( (lv_content_6_0= ruleContent ) )*
            {
            // InternalKiVis.g:80:3: (otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKiVis.g:81:4: otherlv_0= 'image' ( (lv_images_1_0= RULE_STRING ) )
            	    {
            	    otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_3); 

            	    				newLeafNode(otherlv_0, grammarAccess.getVisualizationAccess().getImageKeyword_0_0());
            	    			
            	    // InternalKiVis.g:85:4: ( (lv_images_1_0= RULE_STRING ) )
            	    // InternalKiVis.g:86:5: (lv_images_1_0= RULE_STRING )
            	    {
            	    // InternalKiVis.g:86:5: (lv_images_1_0= RULE_STRING )
            	    // InternalKiVis.g:87:6: lv_images_1_0= RULE_STRING
            	    {
            	    lv_images_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

            	    						newLeafNode(lv_images_1_0, grammarAccess.getVisualizationAccess().getImagesSTRINGTerminalRuleCall_0_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVisualizationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"images",
            	    							lv_images_1_0,
            	    							"de.cau.cs.kieler.kivis.KiVis.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalKiVis.g:104:3: (otherlv_2= 'load' ( (lv_loads_3_0= RULE_STRING ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    lv_loads_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); 

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
            	    break loop2;
                }
            } while (true);

            // InternalKiVis.g:128:3: (otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKiVis.g:129:4: otherlv_4= 'init' ( (lv_init_5_0= RULE_SCRIPT ) )
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getVisualizationAccess().getInitKeyword_2_0());
                    			
                    // InternalKiVis.g:133:4: ( (lv_init_5_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:134:5: (lv_init_5_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:134:5: (lv_init_5_0= RULE_SCRIPT )
                    // InternalKiVis.g:135:6: lv_init_5_0= RULE_SCRIPT
                    {
                    lv_init_5_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_7); 

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
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==20||LA4_0==23||LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKiVis.g:153:4: (lv_content_6_0= ruleContent )
            	    {
            	    // InternalKiVis.g:153:4: (lv_content_6_0= ruleContent )
            	    // InternalKiVis.g:154:5: lv_content_6_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getVisualizationAccess().getContentContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_7);
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
            	    break loop4;
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
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 30:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
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
    // InternalKiVis.g:236:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'bind' ( (lv_variable_1_0= ruleComplexKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) ) ;
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
            // InternalKiVis.g:242:2: ( (otherlv_0= 'bind' ( (lv_variable_1_0= ruleComplexKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) ) )
            // InternalKiVis.g:243:2: (otherlv_0= 'bind' ( (lv_variable_1_0= ruleComplexKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )
            {
            // InternalKiVis.g:243:2: (otherlv_0= 'bind' ( (lv_variable_1_0= ruleComplexKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) ) )
            // InternalKiVis.g:244:3: otherlv_0= 'bind' ( (lv_variable_1_0= ruleComplexKey ) ) ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getBindKeyword_0());
            		
            // InternalKiVis.g:248:3: ( (lv_variable_1_0= ruleComplexKey ) )
            // InternalKiVis.g:249:4: (lv_variable_1_0= ruleComplexKey )
            {
            // InternalKiVis.g:249:4: (lv_variable_1_0= ruleComplexKey )
            // InternalKiVis.g:250:5: lv_variable_1_0= ruleComplexKey
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getVariableComplexKeyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_variable_1_0=ruleComplexKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.ComplexKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:267:3: ( (otherlv_2= 'to' ( (lv_domElement_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_interface_5_0= ruleBindingInterface1 ) ) ( (lv_script_6_0= RULE_SCRIPT ) ) ) | (otherlv_7= 'with' ( (lv_interface_8_0= ruleBindingInterface2 ) ) ( (lv_script_9_0= RULE_SCRIPT ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
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
                    lv_domElement_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); 

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

                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getBindingAccess().getWithKeyword_2_0_2());
                    				
                    // InternalKiVis.g:295:5: ( (lv_interface_5_0= ruleBindingInterface1 ) )
                    // InternalKiVis.g:296:6: (lv_interface_5_0= ruleBindingInterface1 )
                    {
                    // InternalKiVis.g:296:6: (lv_interface_5_0= ruleBindingInterface1 )
                    // InternalKiVis.g:297:7: lv_interface_5_0= ruleBindingInterface1
                    {

                    							newCompositeNode(grammarAccess.getBindingAccess().getInterfaceBindingInterface1ParserRuleCall_2_0_3_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_6);
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
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_11); 

                    					newLeafNode(otherlv_7, grammarAccess.getBindingAccess().getWithKeyword_2_1_0());
                    				
                    // InternalKiVis.g:339:5: ( (lv_interface_8_0= ruleBindingInterface2 ) )
                    // InternalKiVis.g:340:6: (lv_interface_8_0= ruleBindingInterface2 )
                    {
                    // InternalKiVis.g:340:6: (lv_interface_8_0= ruleBindingInterface2 )
                    // InternalKiVis.g:341:7: lv_interface_8_0= ruleBindingInterface2
                    {

                    							newCompositeNode(grammarAccess.getBindingAccess().getInterfaceBindingInterface2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKiVis.g:389:1: ruleHandler returns [EObject current=null] : (otherlv_0= 'handle' ( (lv_variable_1_0= ruleSimpleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) ) ;
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
            // InternalKiVis.g:395:2: ( (otherlv_0= 'handle' ( (lv_variable_1_0= ruleSimpleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) ) )
            // InternalKiVis.g:396:2: (otherlv_0= 'handle' ( (lv_variable_1_0= ruleSimpleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )
            {
            // InternalKiVis.g:396:2: (otherlv_0= 'handle' ( (lv_variable_1_0= ruleSimpleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) ) )
            // InternalKiVis.g:397:3: otherlv_0= 'handle' ( (lv_variable_1_0= ruleSimpleKey ) ) ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHandlerAccess().getHandleKeyword_0());
            		
            // InternalKiVis.g:401:3: ( (lv_variable_1_0= ruleSimpleKey ) )
            // InternalKiVis.g:402:4: (lv_variable_1_0= ruleSimpleKey )
            {
            // InternalKiVis.g:402:4: (lv_variable_1_0= ruleSimpleKey )
            // InternalKiVis.g:403:5: lv_variable_1_0= ruleSimpleKey
            {

            					newCompositeNode(grammarAccess.getHandlerAccess().getVariableSimpleKeyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_12);
            lv_variable_1_0=ruleSimpleKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHandlerRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.SimpleKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:420:3: ( (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) ) | (otherlv_8= 'with' ( (lv_interface_9_0= ruleHandlerInterface2 ) ) ( (lv_script_10_0= RULE_SCRIPT ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKiVis.g:421:4: (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )
                    {
                    // InternalKiVis.g:421:4: (otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )
                    // InternalKiVis.g:422:5: otherlv_2= 'in' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) otherlv_5= 'with' ( (lv_interface_6_0= ruleHandlerInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) )
                    {
                    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_13); 

                    					newLeafNode(otherlv_2, grammarAccess.getHandlerAccess().getInKeyword_2_0_0());
                    				
                    // InternalKiVis.g:426:5: ( (lv_multimatch_3_0= 'all' ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==22) ) {
                        alt7=1;
                    }
                    switch (alt7) {
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
                    lv_domElement_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_10); 

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

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getHandlerAccess().getWithKeyword_2_0_3());
                    				
                    // InternalKiVis.g:462:5: ( (lv_interface_6_0= ruleHandlerInterface1 ) )
                    // InternalKiVis.g:463:6: (lv_interface_6_0= ruleHandlerInterface1 )
                    {
                    // InternalKiVis.g:463:6: (lv_interface_6_0= ruleHandlerInterface1 )
                    // InternalKiVis.g:464:7: lv_interface_6_0= ruleHandlerInterface1
                    {

                    							newCompositeNode(grammarAccess.getHandlerAccess().getInterfaceHandlerInterface1ParserRuleCall_2_0_4_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_6);
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
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_11); 

                    					newLeafNode(otherlv_8, grammarAccess.getHandlerAccess().getWithKeyword_2_1_0());
                    				
                    // InternalKiVis.g:506:5: ( (lv_interface_9_0= ruleHandlerInterface2 ) )
                    // InternalKiVis.g:507:6: (lv_interface_9_0= ruleHandlerInterface2 )
                    {
                    // InternalKiVis.g:507:6: (lv_interface_9_0= ruleHandlerInterface2 )
                    // InternalKiVis.g:508:7: lv_interface_9_0= ruleHandlerInterface2
                    {

                    							newCompositeNode(grammarAccess.getHandlerAccess().getInterfaceHandlerInterface2ParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalKiVis.g:556:1: ruleAction returns [EObject current=null] : (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )? (otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) ) )? (otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) ) )* (otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) ) )? (otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_domEvent_1_0=null;
        Token otherlv_2=null;
        Token lv_multimatch_3_0=null;
        Token lv_domElement_4_0=null;
        Token otherlv_5=null;
        Token lv_script_7_0=null;
        Token otherlv_8=null;
        Token lv_deferredScript_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_interface_6_0 = null;

        EObject lv_deferredInterface_9_0 = null;

        EObject lv_setter_12_0 = null;

        AntlrDatatypeRuleToken lv_signal_14_0 = null;

        Enumerator lv_control_16_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:562:2: ( (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )? (otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) ) )? (otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) ) )* (otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) ) )? (otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) ) )? ) )
            // InternalKiVis.g:563:2: (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )? (otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) ) )? (otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) ) )* (otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) ) )? (otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) ) )? )
            {
            // InternalKiVis.g:563:2: (otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )? (otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) ) )? (otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) ) )* (otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) ) )? (otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) ) )? )
            // InternalKiVis.g:564:3: otherlv_0= 'event' ( (lv_domEvent_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_multimatch_3_0= 'all' ) )? ( (lv_domElement_4_0= RULE_STRING ) ) (otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )? (otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) ) )? (otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) ) )* (otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) ) )? (otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) ) )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getEventKeyword_0());
            		
            // InternalKiVis.g:568:3: ( (lv_domEvent_1_0= RULE_STRING ) )
            // InternalKiVis.g:569:4: (lv_domEvent_1_0= RULE_STRING )
            {
            // InternalKiVis.g:569:4: (lv_domEvent_1_0= RULE_STRING )
            // InternalKiVis.g:570:5: lv_domEvent_1_0= RULE_STRING
            {
            lv_domEvent_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); 

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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getOnKeyword_2());
            		
            // InternalKiVis.g:590:3: ( (lv_multimatch_3_0= 'all' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
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
            lv_domElement_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_15); 

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

            // InternalKiVis.g:622:3: (otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalKiVis.g:623:4: otherlv_5= 'do' ( (lv_interface_6_0= ruleActionInterface1 ) ) ( (lv_script_7_0= RULE_SCRIPT ) )
                    {
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getDoKeyword_5_0());
                    			
                    // InternalKiVis.g:627:4: ( (lv_interface_6_0= ruleActionInterface1 ) )
                    // InternalKiVis.g:628:5: (lv_interface_6_0= ruleActionInterface1 )
                    {
                    // InternalKiVis.g:628:5: (lv_interface_6_0= ruleActionInterface1 )
                    // InternalKiVis.g:629:6: lv_interface_6_0= ruleActionInterface1
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getInterfaceActionInterface1ParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_6);
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

                    // InternalKiVis.g:646:4: ( (lv_script_7_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:647:5: (lv_script_7_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:647:5: (lv_script_7_0= RULE_SCRIPT )
                    // InternalKiVis.g:648:6: lv_script_7_0= RULE_SCRIPT
                    {
                    lv_script_7_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_17); 

                    						newLeafNode(lv_script_7_0, grammarAccess.getActionAccess().getScriptSCRIPTTerminalRuleCall_5_2_0());
                    					

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
                    break;

            }

            // InternalKiVis.g:665:3: (otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKiVis.g:666:4: otherlv_8= 'deferred' ( (lv_deferredInterface_9_0= ruleActionInterface2 ) ) ( (lv_deferredScript_10_0= RULE_SCRIPT ) )
                    {
                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionAccess().getDeferredKeyword_6_0());
                    			
                    // InternalKiVis.g:670:4: ( (lv_deferredInterface_9_0= ruleActionInterface2 ) )
                    // InternalKiVis.g:671:5: (lv_deferredInterface_9_0= ruleActionInterface2 )
                    {
                    // InternalKiVis.g:671:5: (lv_deferredInterface_9_0= ruleActionInterface2 )
                    // InternalKiVis.g:672:6: lv_deferredInterface_9_0= ruleActionInterface2
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getDeferredInterfaceActionInterface2ParserRuleCall_6_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_deferredInterface_9_0=ruleActionInterface2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"deferredInterface",
                    							lv_deferredInterface_9_0,
                    							"de.cau.cs.kieler.kivis.KiVis.ActionInterface2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKiVis.g:689:4: ( (lv_deferredScript_10_0= RULE_SCRIPT ) )
                    // InternalKiVis.g:690:5: (lv_deferredScript_10_0= RULE_SCRIPT )
                    {
                    // InternalKiVis.g:690:5: (lv_deferredScript_10_0= RULE_SCRIPT )
                    // InternalKiVis.g:691:6: lv_deferredScript_10_0= RULE_SCRIPT
                    {
                    lv_deferredScript_10_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_18); 

                    						newLeafNode(lv_deferredScript_10_0, grammarAccess.getActionAccess().getDeferredScriptSCRIPTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"deferredScript",
                    							lv_deferredScript_10_0,
                    							"de.cau.cs.kieler.kivis.KiVis.SCRIPT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiVis.g:708:3: (otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalKiVis.g:709:4: otherlv_11= 'set' ( (lv_setter_12_0= ruleSetter ) )
            	    {
            	    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getActionAccess().getSetKeyword_7_0());
            	    			
            	    // InternalKiVis.g:713:4: ( (lv_setter_12_0= ruleSetter ) )
            	    // InternalKiVis.g:714:5: (lv_setter_12_0= ruleSetter )
            	    {
            	    // InternalKiVis.g:714:5: (lv_setter_12_0= ruleSetter )
            	    // InternalKiVis.g:715:6: lv_setter_12_0= ruleSetter
            	    {

            	    						newCompositeNode(grammarAccess.getActionAccess().getSetterSetterParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_setter_12_0=ruleSetter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"setter",
            	    							lv_setter_12_0,
            	    							"de.cau.cs.kieler.kivis.KiVis.Setter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalKiVis.g:733:3: (otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalKiVis.g:734:4: otherlv_13= 'signal' ( (lv_signal_14_0= ruleComplexKey ) )
                    {
                    otherlv_13=(Token)match(input,28,FollowSets000.FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionAccess().getSignalKeyword_8_0());
                    			
                    // InternalKiVis.g:738:4: ( (lv_signal_14_0= ruleComplexKey ) )
                    // InternalKiVis.g:739:5: (lv_signal_14_0= ruleComplexKey )
                    {
                    // InternalKiVis.g:739:5: (lv_signal_14_0= ruleComplexKey )
                    // InternalKiVis.g:740:6: lv_signal_14_0= ruleComplexKey
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getSignalComplexKeyParserRuleCall_8_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_signal_14_0=ruleComplexKey();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"signal",
                    							lv_signal_14_0,
                    							"de.cau.cs.kieler.kivis.KiVis.ComplexKey");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKiVis.g:758:3: (otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalKiVis.g:759:4: otherlv_15= 'simulation' ( (lv_control_16_0= ruleSimulationCorntrol ) )
                    {
                    otherlv_15=(Token)match(input,29,FollowSets000.FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getActionAccess().getSimulationKeyword_9_0());
                    			
                    // InternalKiVis.g:763:4: ( (lv_control_16_0= ruleSimulationCorntrol ) )
                    // InternalKiVis.g:764:5: (lv_control_16_0= ruleSimulationCorntrol )
                    {
                    // InternalKiVis.g:764:5: (lv_control_16_0= ruleSimulationCorntrol )
                    // InternalKiVis.g:765:6: lv_control_16_0= ruleSimulationCorntrol
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getControlSimulationCorntrolEnumRuleCall_9_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_control_16_0=ruleSimulationCorntrol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"control",
                    							lv_control_16_0,
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
    // InternalKiVis.g:787:1: entryRuleCode returns [EObject current=null] : iv_ruleCode= ruleCode EOF ;
    public final EObject entryRuleCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCode = null;


        try {
            // InternalKiVis.g:787:45: (iv_ruleCode= ruleCode EOF )
            // InternalKiVis.g:788:2: iv_ruleCode= ruleCode EOF
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
    // InternalKiVis.g:794:1: ruleCode returns [EObject current=null] : (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) ;
    public final EObject ruleCode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_script_2_0=null;
        EObject lv_interface_1_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:800:2: ( (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) )
            // InternalKiVis.g:801:2: (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            {
            // InternalKiVis.g:801:2: (otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            // InternalKiVis.g:802:3: otherlv_0= 'script' ( (lv_interface_1_0= ruleCodeInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeAccess().getScriptKeyword_0());
            		
            // InternalKiVis.g:806:3: ( (lv_interface_1_0= ruleCodeInterface ) )
            // InternalKiVis.g:807:4: (lv_interface_1_0= ruleCodeInterface )
            {
            // InternalKiVis.g:807:4: (lv_interface_1_0= ruleCodeInterface )
            // InternalKiVis.g:808:5: lv_interface_1_0= ruleCodeInterface
            {

            					newCompositeNode(grammarAccess.getCodeAccess().getInterfaceCodeInterfaceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
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

            // InternalKiVis.g:825:3: ( (lv_script_2_0= RULE_SCRIPT ) )
            // InternalKiVis.g:826:4: (lv_script_2_0= RULE_SCRIPT )
            {
            // InternalKiVis.g:826:4: (lv_script_2_0= RULE_SCRIPT )
            // InternalKiVis.g:827:5: lv_script_2_0= RULE_SCRIPT
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


    // $ANTLR start "entryRuleSetter"
    // InternalKiVis.g:847:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // InternalKiVis.g:847:47: (iv_ruleSetter= ruleSetter EOF )
            // InternalKiVis.g:848:2: iv_ruleSetter= ruleSetter EOF
            {
             newCompositeNode(grammarAccess.getSetterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSetter=ruleSetter();

            state._fsp--;

             current =iv_ruleSetter; 
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
    // $ANTLR end "entryRuleSetter"


    // $ANTLR start "ruleSetter"
    // InternalKiVis.g:854:1: ruleSetter returns [EObject current=null] : ( ( (lv_variable_0_0= ruleComplexKey ) ) ( (lv_interface_1_0= ruleSetterInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) ;
    public final EObject ruleSetter() throws RecognitionException {
        EObject current = null;

        Token lv_script_2_0=null;
        AntlrDatatypeRuleToken lv_variable_0_0 = null;

        EObject lv_interface_1_0 = null;



        	enterRule();

        try {
            // InternalKiVis.g:860:2: ( ( ( (lv_variable_0_0= ruleComplexKey ) ) ( (lv_interface_1_0= ruleSetterInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) ) )
            // InternalKiVis.g:861:2: ( ( (lv_variable_0_0= ruleComplexKey ) ) ( (lv_interface_1_0= ruleSetterInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            {
            // InternalKiVis.g:861:2: ( ( (lv_variable_0_0= ruleComplexKey ) ) ( (lv_interface_1_0= ruleSetterInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) ) )
            // InternalKiVis.g:862:3: ( (lv_variable_0_0= ruleComplexKey ) ) ( (lv_interface_1_0= ruleSetterInterface ) ) ( (lv_script_2_0= RULE_SCRIPT ) )
            {
            // InternalKiVis.g:862:3: ( (lv_variable_0_0= ruleComplexKey ) )
            // InternalKiVis.g:863:4: (lv_variable_0_0= ruleComplexKey )
            {
            // InternalKiVis.g:863:4: (lv_variable_0_0= ruleComplexKey )
            // InternalKiVis.g:864:5: lv_variable_0_0= ruleComplexKey
            {

            					newCompositeNode(grammarAccess.getSetterAccess().getVariableComplexKeyParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_16);
            lv_variable_0_0=ruleComplexKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetterRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"de.cau.cs.kieler.kivis.KiVis.ComplexKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:881:3: ( (lv_interface_1_0= ruleSetterInterface ) )
            // InternalKiVis.g:882:4: (lv_interface_1_0= ruleSetterInterface )
            {
            // InternalKiVis.g:882:4: (lv_interface_1_0= ruleSetterInterface )
            // InternalKiVis.g:883:5: lv_interface_1_0= ruleSetterInterface
            {

            					newCompositeNode(grammarAccess.getSetterAccess().getInterfaceSetterInterfaceParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interface_1_0=ruleSetterInterface();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetterRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_1_0,
            						"de.cau.cs.kieler.kivis.KiVis.SetterInterface");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKiVis.g:900:3: ( (lv_script_2_0= RULE_SCRIPT ) )
            // InternalKiVis.g:901:4: (lv_script_2_0= RULE_SCRIPT )
            {
            // InternalKiVis.g:901:4: (lv_script_2_0= RULE_SCRIPT )
            // InternalKiVis.g:902:5: lv_script_2_0= RULE_SCRIPT
            {
            lv_script_2_0=(Token)match(input,RULE_SCRIPT,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_script_2_0, grammarAccess.getSetterAccess().getScriptSCRIPTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetterRule());
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
    // $ANTLR end "ruleSetter"


    // $ANTLR start "entryRuleBindingInterface1"
    // InternalKiVis.g:922:1: entryRuleBindingInterface1 returns [EObject current=null] : iv_ruleBindingInterface1= ruleBindingInterface1 EOF ;
    public final EObject entryRuleBindingInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingInterface1 = null;


        try {
            // InternalKiVis.g:922:58: (iv_ruleBindingInterface1= ruleBindingInterface1 EOF )
            // InternalKiVis.g:923:2: iv_ruleBindingInterface1= ruleBindingInterface1 EOF
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
    // InternalKiVis.g:929:1: ruleBindingInterface1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? ) ;
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
            // InternalKiVis.g:935:2: ( ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? ) )
            // InternalKiVis.g:936:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? )
            {
            // InternalKiVis.g:936:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )? )
            // InternalKiVis.g:937:3: () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )? otherlv_9= ')' (otherlv_10= '=>' )?
            {
            // InternalKiVis.g:937:3: ()
            // InternalKiVis.g:938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingInterface1Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:948:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:949:4: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:949:4: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:950:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

            // InternalKiVis.g:966:3: ( (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) ) | (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3==32) ) {
                        alt15=2;
                    }
                    else if ( (LA15_3==33) ) {
                        alt15=1;
                    }
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalKiVis.g:967:4: (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) )
                    {
                    // InternalKiVis.g:967:4: (otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) )
                    // InternalKiVis.g:968:5: otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_21); 

                    					newLeafNode(otherlv_3, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_0_0());
                    				
                    // InternalKiVis.g:972:5: ( (lv_variable_4_0= RULE_ID ) )
                    // InternalKiVis.g:973:6: (lv_variable_4_0= RULE_ID )
                    {
                    // InternalKiVis.g:973:6: (lv_variable_4_0= RULE_ID )
                    // InternalKiVis.g:974:7: lv_variable_4_0= RULE_ID
                    {
                    lv_variable_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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
                    // InternalKiVis.g:992:4: (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) )
                    {
                    // InternalKiVis.g:992:4: (otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) ) )
                    // InternalKiVis.g:993:5: otherlv_5= ',' ( (lv_variable_6_0= RULE_ID ) ) otherlv_7= ',' ( (lv_pool_8_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_21); 

                    					newLeafNode(otherlv_5, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_1_0());
                    				
                    // InternalKiVis.g:997:5: ( (lv_variable_6_0= RULE_ID ) )
                    // InternalKiVis.g:998:6: (lv_variable_6_0= RULE_ID )
                    {
                    // InternalKiVis.g:998:6: (lv_variable_6_0= RULE_ID )
                    // InternalKiVis.g:999:7: lv_variable_6_0= RULE_ID
                    {
                    lv_variable_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

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

                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_21); 

                    					newLeafNode(otherlv_7, grammarAccess.getBindingInterface1Access().getCommaKeyword_3_1_2());
                    				
                    // InternalKiVis.g:1019:5: ( (lv_pool_8_0= RULE_ID ) )
                    // InternalKiVis.g:1020:6: (lv_pool_8_0= RULE_ID )
                    {
                    // InternalKiVis.g:1020:6: (lv_pool_8_0= RULE_ID )
                    // InternalKiVis.g:1021:7: lv_pool_8_0= RULE_ID
                    {
                    lv_pool_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

            otherlv_9=(Token)match(input,33,FollowSets000.FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getBindingInterface1Access().getRightParenthesisKeyword_4());
            		
            // InternalKiVis.g:1043:3: (otherlv_10= '=>' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalKiVis.g:1044:4: otherlv_10= '=>'
                    {
                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1053:1: entryRuleBindingInterface2 returns [EObject current=null] : iv_ruleBindingInterface2= ruleBindingInterface2 EOF ;
    public final EObject entryRuleBindingInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingInterface2 = null;


        try {
            // InternalKiVis.g:1053:58: (iv_ruleBindingInterface2= ruleBindingInterface2 EOF )
            // InternalKiVis.g:1054:2: iv_ruleBindingInterface2= ruleBindingInterface2 EOF
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
    // InternalKiVis.g:1060:1: ruleBindingInterface2 returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? ) ;
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
            // InternalKiVis.g:1066:2: ( ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? ) )
            // InternalKiVis.g:1067:2: ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? )
            {
            // InternalKiVis.g:1067:2: ( () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )? )
            // InternalKiVis.g:1068:3: () otherlv_1= '(' ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )? otherlv_5= ')' (otherlv_6= '=>' )?
            {
            // InternalKiVis.g:1068:3: ()
            // InternalKiVis.g:1069:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBindingInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingInterface2Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1079:3: ( ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalKiVis.g:1080:4: ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
                    {
                    // InternalKiVis.g:1080:4: ( (lv_variable_2_0= RULE_ID ) )
                    // InternalKiVis.g:1081:5: (lv_variable_2_0= RULE_ID )
                    {
                    // InternalKiVis.g:1081:5: (lv_variable_2_0= RULE_ID )
                    // InternalKiVis.g:1082:6: lv_variable_2_0= RULE_ID
                    {
                    lv_variable_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

                    // InternalKiVis.g:1098:4: (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==32) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalKiVis.g:1099:5: otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) )
                            {
                            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_21); 

                            					newLeafNode(otherlv_3, grammarAccess.getBindingInterface2Access().getCommaKeyword_2_1_0());
                            				
                            // InternalKiVis.g:1103:5: ( (lv_pool_4_0= RULE_ID ) )
                            // InternalKiVis.g:1104:6: (lv_pool_4_0= RULE_ID )
                            {
                            // InternalKiVis.g:1104:6: (lv_pool_4_0= RULE_ID )
                            // InternalKiVis.g:1105:7: lv_pool_4_0= RULE_ID
                            {
                            lv_pool_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getBindingInterface2Access().getRightParenthesisKeyword_3());
            		
            // InternalKiVis.g:1127:3: (otherlv_6= '=>' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalKiVis.g:1128:4: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1137:1: entryRuleHandlerInterface1 returns [EObject current=null] : iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF ;
    public final EObject entryRuleHandlerInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerInterface1 = null;


        try {
            // InternalKiVis.g:1137:58: (iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF )
            // InternalKiVis.g:1138:2: iv_ruleHandlerInterface1= ruleHandlerInterface1 EOF
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
    // InternalKiVis.g:1144:1: ruleHandlerInterface1 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? ) ;
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
            // InternalKiVis.g:1150:2: ( ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? ) )
            // InternalKiVis.g:1151:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? )
            {
            // InternalKiVis.g:1151:2: ( () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )? )
            // InternalKiVis.g:1152:3: () otherlv_1= '(' ( (lv_element_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_variable_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )? otherlv_7= ')' (otherlv_8= '=>' )?
            {
            // InternalKiVis.g:1152:3: ()
            // InternalKiVis.g:1153:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerInterface1Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1163:3: ( (lv_element_2_0= RULE_ID ) )
            // InternalKiVis.g:1164:4: (lv_element_2_0= RULE_ID )
            {
            // InternalKiVis.g:1164:4: (lv_element_2_0= RULE_ID )
            // InternalKiVis.g:1165:5: lv_element_2_0= RULE_ID
            {
            lv_element_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

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

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getHandlerInterface1Access().getCommaKeyword_3());
            		
            // InternalKiVis.g:1185:3: ( (lv_variable_4_0= RULE_ID ) )
            // InternalKiVis.g:1186:4: (lv_variable_4_0= RULE_ID )
            {
            // InternalKiVis.g:1186:4: (lv_variable_4_0= RULE_ID )
            // InternalKiVis.g:1187:5: lv_variable_4_0= RULE_ID
            {
            lv_variable_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

            // InternalKiVis.g:1203:3: (otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalKiVis.g:1204:4: otherlv_5= ',' ( (lv_pool_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getHandlerInterface1Access().getCommaKeyword_5_0());
                    			
                    // InternalKiVis.g:1208:4: ( (lv_pool_6_0= RULE_ID ) )
                    // InternalKiVis.g:1209:5: (lv_pool_6_0= RULE_ID )
                    {
                    // InternalKiVis.g:1209:5: (lv_pool_6_0= RULE_ID )
                    // InternalKiVis.g:1210:6: lv_pool_6_0= RULE_ID
                    {
                    lv_pool_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

            otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getHandlerInterface1Access().getRightParenthesisKeyword_6());
            		
            // InternalKiVis.g:1231:3: (otherlv_8= '=>' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKiVis.g:1232:4: otherlv_8= '=>'
                    {
                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1241:1: entryRuleHandlerInterface2 returns [EObject current=null] : iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF ;
    public final EObject entryRuleHandlerInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerInterface2 = null;


        try {
            // InternalKiVis.g:1241:58: (iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF )
            // InternalKiVis.g:1242:2: iv_ruleHandlerInterface2= ruleHandlerInterface2 EOF
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
    // InternalKiVis.g:1248:1: ruleHandlerInterface2 returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? ) ;
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
            // InternalKiVis.g:1254:2: ( ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? ) )
            // InternalKiVis.g:1255:2: ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? )
            {
            // InternalKiVis.g:1255:2: ( () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )? )
            // InternalKiVis.g:1256:3: () otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )? otherlv_5= ')' (otherlv_6= '=>' )?
            {
            // InternalKiVis.g:1256:3: ()
            // InternalKiVis.g:1257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHandlerInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getHandlerInterface2Access().getLeftParenthesisKeyword_1());
            		
            // InternalKiVis.g:1267:3: ( (lv_variable_2_0= RULE_ID ) )
            // InternalKiVis.g:1268:4: (lv_variable_2_0= RULE_ID )
            {
            // InternalKiVis.g:1268:4: (lv_variable_2_0= RULE_ID )
            // InternalKiVis.g:1269:5: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

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

            // InternalKiVis.g:1285:3: (otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalKiVis.g:1286:4: otherlv_3= ',' ( (lv_pool_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getHandlerInterface2Access().getCommaKeyword_3_0());
                    			
                    // InternalKiVis.g:1290:4: ( (lv_pool_4_0= RULE_ID ) )
                    // InternalKiVis.g:1291:5: (lv_pool_4_0= RULE_ID )
                    {
                    // InternalKiVis.g:1291:5: (lv_pool_4_0= RULE_ID )
                    // InternalKiVis.g:1292:6: lv_pool_4_0= RULE_ID
                    {
                    lv_pool_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

            otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getHandlerInterface2Access().getRightParenthesisKeyword_4());
            		
            // InternalKiVis.g:1313:3: (otherlv_6= '=>' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKiVis.g:1314:4: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_2); 

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
    // InternalKiVis.g:1323:1: entryRuleActionInterface1 returns [EObject current=null] : iv_ruleActionInterface1= ruleActionInterface1 EOF ;
    public final EObject entryRuleActionInterface1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInterface1 = null;


        try {
            // InternalKiVis.g:1323:57: (iv_ruleActionInterface1= ruleActionInterface1 EOF )
            // InternalKiVis.g:1324:2: iv_ruleActionInterface1= ruleActionInterface1 EOF
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
    // InternalKiVis.g:1330:1: ruleActionInterface1 returns [EObject current=null] : ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) ;
    public final EObject ruleActionInterface1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKiVis.g:1336:2: ( ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) )
            // InternalKiVis.g:1337:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            {
            // InternalKiVis.g:1337:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            // InternalKiVis.g:1338:3: () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            {
            // InternalKiVis.g:1338:3: ()
            // InternalKiVis.g:1339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionInterface1Access().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1345:3: (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalKiVis.g:1346:4: otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )?
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionInterface1Access().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionInterface1Access().getRightParenthesisKeyword_1_1());
                    			
                    // InternalKiVis.g:1354:4: (otherlv_3= '=>' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==34) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalKiVis.g:1355:5: otherlv_3= '=>'
                            {
                            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getActionInterface1Access().getEqualsSignGreaterThanSignKeyword_1_2());
                            				

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
    // InternalKiVis.g:1365:1: entryRuleActionInterface2 returns [EObject current=null] : iv_ruleActionInterface2= ruleActionInterface2 EOF ;
    public final EObject entryRuleActionInterface2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionInterface2 = null;


        try {
            // InternalKiVis.g:1365:57: (iv_ruleActionInterface2= ruleActionInterface2 EOF )
            // InternalKiVis.g:1366:2: iv_ruleActionInterface2= ruleActionInterface2 EOF
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
    // InternalKiVis.g:1372:1: ruleActionInterface2 returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) ;
    public final EObject ruleActionInterface2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1378:2: ( ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) )
            // InternalKiVis.g:1379:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            {
            // InternalKiVis.g:1379:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            // InternalKiVis.g:1380:3: () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            {
            // InternalKiVis.g:1380:3: ()
            // InternalKiVis.g:1381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionInterface2Access().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1387:3: (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalKiVis.g:1388:4: otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )?
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionInterface2Access().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalKiVis.g:1392:4: ( (lv_pool_2_0= RULE_ID ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalKiVis.g:1393:5: (lv_pool_2_0= RULE_ID )
                            {
                            // InternalKiVis.g:1393:5: (lv_pool_2_0= RULE_ID )
                            // InternalKiVis.g:1394:6: lv_pool_2_0= RULE_ID
                            {
                            lv_pool_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

                            						newLeafNode(lv_pool_2_0, grammarAccess.getActionInterface2Access().getPoolIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionInterface2Rule());
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

                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionInterface2Access().getRightParenthesisKeyword_1_2());
                    			
                    // InternalKiVis.g:1414:4: (otherlv_4= '=>' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==34) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalKiVis.g:1415:5: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            					newLeafNode(otherlv_4, grammarAccess.getActionInterface2Access().getEqualsSignGreaterThanSignKeyword_1_3());
                            				

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
    // InternalKiVis.g:1425:1: entryRuleCodeInterface returns [EObject current=null] : iv_ruleCodeInterface= ruleCodeInterface EOF ;
    public final EObject entryRuleCodeInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeInterface = null;


        try {
            // InternalKiVis.g:1425:54: (iv_ruleCodeInterface= ruleCodeInterface EOF )
            // InternalKiVis.g:1426:2: iv_ruleCodeInterface= ruleCodeInterface EOF
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
    // InternalKiVis.g:1432:1: ruleCodeInterface returns [EObject current=null] : ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) ;
    public final EObject ruleCodeInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1438:2: ( ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? ) )
            // InternalKiVis.g:1439:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            {
            // InternalKiVis.g:1439:2: ( () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )? )
            // InternalKiVis.g:1440:3: () (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            {
            // InternalKiVis.g:1440:3: ()
            // InternalKiVis.g:1441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCodeInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1447:3: (otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalKiVis.g:1448:4: otherlv_1= '(' ( (lv_pool_2_0= RULE_ID ) )? otherlv_3= ')' (otherlv_4= '=>' )?
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getCodeInterfaceAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalKiVis.g:1452:4: ( (lv_pool_2_0= RULE_ID ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalKiVis.g:1453:5: (lv_pool_2_0= RULE_ID )
                            {
                            // InternalKiVis.g:1453:5: (lv_pool_2_0= RULE_ID )
                            // InternalKiVis.g:1454:6: lv_pool_2_0= RULE_ID
                            {
                            lv_pool_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_23); 

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

                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getCodeInterfaceAccess().getRightParenthesisKeyword_1_2());
                    			
                    // InternalKiVis.g:1474:4: (otherlv_4= '=>' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==34) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalKiVis.g:1475:5: otherlv_4= '=>'
                            {
                            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleSetterInterface"
    // InternalKiVis.g:1485:1: entryRuleSetterInterface returns [EObject current=null] : iv_ruleSetterInterface= ruleSetterInterface EOF ;
    public final EObject entryRuleSetterInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetterInterface = null;


        try {
            // InternalKiVis.g:1485:56: (iv_ruleSetterInterface= ruleSetterInterface EOF )
            // InternalKiVis.g:1486:2: iv_ruleSetterInterface= ruleSetterInterface EOF
            {
             newCompositeNode(grammarAccess.getSetterInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSetterInterface=ruleSetterInterface();

            state._fsp--;

             current =iv_ruleSetterInterface; 
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
    // $ANTLR end "entryRuleSetterInterface"


    // $ANTLR start "ruleSetterInterface"
    // InternalKiVis.g:1492:1: ruleSetterInterface returns [EObject current=null] : ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) ;
    public final EObject ruleSetterInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalKiVis.g:1498:2: ( ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? ) )
            // InternalKiVis.g:1499:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            {
            // InternalKiVis.g:1499:2: ( () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )? )
            // InternalKiVis.g:1500:3: () (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            {
            // InternalKiVis.g:1500:3: ()
            // InternalKiVis.g:1501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetterInterfaceAccess().getInterfaceAction_0(),
            					current);
            			

            }

            // InternalKiVis.g:1507:3: (otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalKiVis.g:1508:4: otherlv_1= '(' otherlv_2= ')' (otherlv_3= '=>' )?
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getSetterInterfaceAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getSetterInterfaceAccess().getRightParenthesisKeyword_1_1());
                    			
                    // InternalKiVis.g:1516:4: (otherlv_3= '=>' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==34) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalKiVis.g:1517:5: otherlv_3= '=>'
                            {
                            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getSetterInterfaceAccess().getEqualsSignGreaterThanSignKeyword_1_2());
                            				

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
    // $ANTLR end "ruleSetterInterface"


    // $ANTLR start "entryRuleSimpleKey"
    // InternalKiVis.g:1527:1: entryRuleSimpleKey returns [String current=null] : iv_ruleSimpleKey= ruleSimpleKey EOF ;
    public final String entryRuleSimpleKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleKey = null;


        try {
            // InternalKiVis.g:1527:49: (iv_ruleSimpleKey= ruleSimpleKey EOF )
            // InternalKiVis.g:1528:2: iv_ruleSimpleKey= ruleSimpleKey EOF
            {
             newCompositeNode(grammarAccess.getSimpleKeyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleKey=ruleSimpleKey();

            state._fsp--;

             current =iv_ruleSimpleKey.getText(); 
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
    // $ANTLR end "entryRuleSimpleKey"


    // $ANTLR start "ruleSimpleKey"
    // InternalKiVis.g:1534:1: ruleSimpleKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) (kw= '-' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleSimpleKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1540:2: ( ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) (kw= '-' this_ID_4= RULE_ID )* ) )
            // InternalKiVis.g:1541:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) (kw= '-' this_ID_4= RULE_ID )* )
            {
            // InternalKiVis.g:1541:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) (kw= '-' this_ID_4= RULE_ID )* )
            // InternalKiVis.g:1542:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) (kw= '-' this_ID_4= RULE_ID )*
            {
            // InternalKiVis.g:1542:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==35) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalKiVis.g:1543:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getSimpleKeyAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1551:4: (kw= '#' this_ID_2= RULE_ID )
                    {
                    // InternalKiVis.g:1551:4: (kw= '#' this_ID_2= RULE_ID )
                    // InternalKiVis.g:1552:5: kw= '#' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_21); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getSimpleKeyAccess().getNumberSignKeyword_0_1_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getSimpleKeyAccess().getIDTerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalKiVis.g:1566:3: (kw= '-' this_ID_4= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==36) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalKiVis.g:1567:4: kw= '-' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_21); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSimpleKeyAccess().getHyphenMinusKeyword_1_0());
            	    			
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_27); 

            	    				current.merge(this_ID_4);
            	    			

            	    				newLeafNode(this_ID_4, grammarAccess.getSimpleKeyAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleSimpleKey"


    // $ANTLR start "entryRuleComplexKey"
    // InternalKiVis.g:1584:1: entryRuleComplexKey returns [String current=null] : iv_ruleComplexKey= ruleComplexKey EOF ;
    public final String entryRuleComplexKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplexKey = null;


        try {
            // InternalKiVis.g:1584:50: (iv_ruleComplexKey= ruleComplexKey EOF )
            // InternalKiVis.g:1585:2: iv_ruleComplexKey= ruleComplexKey EOF
            {
             newCompositeNode(grammarAccess.getComplexKeyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComplexKey=ruleComplexKey();

            state._fsp--;

             current =iv_ruleComplexKey.getText(); 
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
    // $ANTLR end "entryRuleComplexKey"


    // $ANTLR start "ruleComplexKey"
    // InternalKiVis.g:1591:1: ruleComplexKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '-' this_ID_4= RULE_ID ) | (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleComplexKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_INT_6=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalKiVis.g:1597:2: ( ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '-' this_ID_4= RULE_ID ) | (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) ) )* ) )
            // InternalKiVis.g:1598:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '-' this_ID_4= RULE_ID ) | (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) ) )* )
            {
            // InternalKiVis.g:1598:2: ( (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '-' this_ID_4= RULE_ID ) | (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) ) )* )
            // InternalKiVis.g:1599:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) ) ( (kw= '-' this_ID_4= RULE_ID ) | (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) ) )*
            {
            // InternalKiVis.g:1599:3: (this_ID_0= RULE_ID | (kw= '#' this_ID_2= RULE_ID ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==35) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalKiVis.g:1600:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getComplexKeyAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1608:4: (kw= '#' this_ID_2= RULE_ID )
                    {
                    // InternalKiVis.g:1608:4: (kw= '#' this_ID_2= RULE_ID )
                    // InternalKiVis.g:1609:5: kw= '#' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_21); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getComplexKeyAccess().getNumberSignKeyword_0_1_0());
                    				
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

                    					current.merge(this_ID_2);
                    				

                    					newLeafNode(this_ID_2, grammarAccess.getComplexKeyAccess().getIDTerminalRuleCall_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalKiVis.g:1623:3: ( (kw= '-' this_ID_4= RULE_ID ) | (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    alt38=1;
                }
                else if ( (LA38_0==37) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalKiVis.g:1624:4: (kw= '-' this_ID_4= RULE_ID )
            	    {
            	    // InternalKiVis.g:1624:4: (kw= '-' this_ID_4= RULE_ID )
            	    // InternalKiVis.g:1625:5: kw= '-' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_21); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getComplexKeyAccess().getHyphenMinusKeyword_1_0_0());
            	    				
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

            	    					current.merge(this_ID_4);
            	    				

            	    					newLeafNode(this_ID_4, grammarAccess.getComplexKeyAccess().getIDTerminalRuleCall_1_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalKiVis.g:1639:4: (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) )
            	    {
            	    // InternalKiVis.g:1639:4: (kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID ) )
            	    // InternalKiVis.g:1640:5: kw= '.' (this_INT_6= RULE_INT | this_ID_7= RULE_ID )
            	    {
            	    kw=(Token)match(input,37,FollowSets000.FOLLOW_29); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getComplexKeyAccess().getFullStopKeyword_1_1_0());
            	    				
            	    // InternalKiVis.g:1645:5: (this_INT_6= RULE_INT | this_ID_7= RULE_ID )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==RULE_INT) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==RULE_ID) ) {
            	        alt37=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalKiVis.g:1646:6: this_INT_6= RULE_INT
            	            {
            	            this_INT_6=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_28); 

            	            						current.merge(this_INT_6);
            	            					

            	            						newLeafNode(this_INT_6, grammarAccess.getComplexKeyAccess().getINTTerminalRuleCall_1_1_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalKiVis.g:1654:6: this_ID_7= RULE_ID
            	            {
            	            this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); 

            	            						current.merge(this_ID_7);
            	            					

            	            						newLeafNode(this_ID_7, grammarAccess.getComplexKeyAccess().getIDTerminalRuleCall_1_1_1_1());
            	            					

            	            }
            	            break;

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
    // $ANTLR end "ruleComplexKey"


    // $ANTLR start "ruleSimulationCorntrol"
    // InternalKiVis.g:1668:1: ruleSimulationCorntrol returns [Enumerator current=null] : ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) ) ;
    public final Enumerator ruleSimulationCorntrol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalKiVis.g:1674:2: ( ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) ) )
            // InternalKiVis.g:1675:2: ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) )
            {
            // InternalKiVis.g:1675:2: ( (enumLiteral_0= 'nothing' ) | (enumLiteral_1= 'step' ) | (enumLiteral_2= 'stop' ) | (enumLiteral_3= 'pause' ) | (enumLiteral_4= 'play' ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt39=1;
                }
                break;
            case 39:
                {
                alt39=2;
                }
                break;
            case 40:
                {
                alt39=3;
                }
                break;
            case 41:
                {
                alt39=4;
                }
                break;
            case 42:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalKiVis.g:1676:3: (enumLiteral_0= 'nothing' )
                    {
                    // InternalKiVis.g:1676:3: (enumLiteral_0= 'nothing' )
                    // InternalKiVis.g:1677:4: enumLiteral_0= 'nothing'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSimulationCorntrolAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalKiVis.g:1684:3: (enumLiteral_1= 'step' )
                    {
                    // InternalKiVis.g:1684:3: (enumLiteral_1= 'step' )
                    // InternalKiVis.g:1685:4: enumLiteral_1= 'step'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getSTEPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSimulationCorntrolAccess().getSTEPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalKiVis.g:1692:3: (enumLiteral_2= 'stop' )
                    {
                    // InternalKiVis.g:1692:3: (enumLiteral_2= 'stop' )
                    // InternalKiVis.g:1693:4: enumLiteral_2= 'stop'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getSTOPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSimulationCorntrolAccess().getSTOPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalKiVis.g:1700:3: (enumLiteral_3= 'pause' )
                    {
                    // InternalKiVis.g:1700:3: (enumLiteral_3= 'pause' )
                    // InternalKiVis.g:1701:4: enumLiteral_3= 'pause'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getSimulationCorntrolAccess().getPAUSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSimulationCorntrolAccess().getPAUSEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalKiVis.g:1708:3: (enumLiteral_4= 'play' )
                    {
                    // InternalKiVis.g:1708:3: (enumLiteral_4= 'play' )
                    // InternalKiVis.g:1709:4: enumLiteral_4= 'play'
                    {
                    enumLiteral_4=(Token)match(input,42,FollowSets000.FOLLOW_2); 

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
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000004093C002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040938002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040920002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003E000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000020L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003C000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000007C000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000000C0L});
    }


}