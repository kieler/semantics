package de.cau.cs.kieler.cview.model.parser.antlr.internal;

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
import de.cau.cs.kieler.cview.model.services.CViewModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCViewModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Component'", "'parent'", "'='", "'type'", "'location'", "'referenceLine'", "'children'", "'src'", "'dst'", "'label'", "'color'", "'DIR'", "'FILE'", "'FUNC'", "'COMPOUND'", "'READER'", "'WRITER'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCViewModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCViewModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCViewModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCViewModel.g"; }



     	private CViewModelGrammarAccess grammarAccess;

        public InternalCViewModelParser(TokenStream input, CViewModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CViewModel";
       	}

       	@Override
       	protected CViewModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCViewModel"
    // InternalCViewModel.g:65:1: entryRuleCViewModel returns [EObject current=null] : iv_ruleCViewModel= ruleCViewModel EOF ;
    public final EObject entryRuleCViewModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCViewModel = null;


        try {
            // InternalCViewModel.g:65:51: (iv_ruleCViewModel= ruleCViewModel EOF )
            // InternalCViewModel.g:66:2: iv_ruleCViewModel= ruleCViewModel EOF
            {
             newCompositeNode(grammarAccess.getCViewModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCViewModel=ruleCViewModel();

            state._fsp--;

             current =iv_ruleCViewModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCViewModel"


    // $ANTLR start "ruleCViewModel"
    // InternalCViewModel.g:72:1: ruleCViewModel returns [EObject current=null] : ( ( (lv_components_0_0= ruleComponent ) )* otherlv_1= ';' ( (lv_connections_2_0= ruleConnection ) )* ) ;
    public final EObject ruleCViewModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_components_0_0 = null;

        EObject lv_connections_2_0 = null;



        	enterRule();

        try {
            // InternalCViewModel.g:78:2: ( ( ( (lv_components_0_0= ruleComponent ) )* otherlv_1= ';' ( (lv_connections_2_0= ruleConnection ) )* ) )
            // InternalCViewModel.g:79:2: ( ( (lv_components_0_0= ruleComponent ) )* otherlv_1= ';' ( (lv_connections_2_0= ruleConnection ) )* )
            {
            // InternalCViewModel.g:79:2: ( ( (lv_components_0_0= ruleComponent ) )* otherlv_1= ';' ( (lv_connections_2_0= ruleConnection ) )* )
            // InternalCViewModel.g:80:3: ( (lv_components_0_0= ruleComponent ) )* otherlv_1= ';' ( (lv_connections_2_0= ruleConnection ) )*
            {
            // InternalCViewModel.g:80:3: ( (lv_components_0_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCViewModel.g:81:4: (lv_components_0_0= ruleComponent )
            	    {
            	    // InternalCViewModel.g:81:4: (lv_components_0_0= ruleComponent )
            	    // InternalCViewModel.g:82:5: lv_components_0_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getCViewModelAccess().getComponentsComponentParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_components_0_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCViewModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_0_0,
            	    						"de.cau.cs.kieler.cview.model.CViewModel.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCViewModelAccess().getSemicolonKeyword_1());
            		
            // InternalCViewModel.g:103:3: ( (lv_connections_2_0= ruleConnection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCViewModel.g:104:4: (lv_connections_2_0= ruleConnection )
            	    {
            	    // InternalCViewModel.g:104:4: (lv_connections_2_0= ruleConnection )
            	    // InternalCViewModel.g:105:5: lv_connections_2_0= ruleConnection
            	    {

            	    					newCompositeNode(grammarAccess.getCViewModelAccess().getConnectionsConnectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_connections_2_0=ruleConnection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCViewModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connections",
            	    						lv_connections_2_0,
            	    						"de.cau.cs.kieler.cview.model.CViewModel.Connection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleCViewModel"


    // $ANTLR start "entryRuleComponent"
    // InternalCViewModel.g:126:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCViewModel.g:126:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCViewModel.g:127:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCViewModel.g:133:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_location_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_referenceLine_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalCViewModel.g:139:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? ) )
            // InternalCViewModel.g:140:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? )
            {
            // InternalCViewModel.g:140:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? )
            // InternalCViewModel.g:141:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalCViewModel.g:145:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCViewModel.g:146:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCViewModel.g:146:4: (lv_name_1_0= RULE_ID )
            // InternalCViewModel.g:147:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCViewModel.g:163:3: (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCViewModel.g:164:4: otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getParentKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalCViewModel.g:172:4: ( (otherlv_4= RULE_ID ) )
                    // InternalCViewModel.g:173:5: (otherlv_4= RULE_ID )
                    {
                    // InternalCViewModel.g:173:5: (otherlv_4= RULE_ID )
                    // InternalCViewModel.g:174:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getParentComponentCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getTypeKeyword_3());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getEqualsSignKeyword_4());
            		
            // InternalCViewModel.g:194:3: ( (lv_type_7_0= ruleComponentType ) )
            // InternalCViewModel.g:195:4: (lv_type_7_0= ruleComponentType )
            {
            // InternalCViewModel.g:195:4: (lv_type_7_0= ruleComponentType )
            // InternalCViewModel.g:196:5: lv_type_7_0= ruleComponentType
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getTypeComponentTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_7_0=ruleComponentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.cau.cs.kieler.cview.model.CViewModel.ComponentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getLocationKeyword_6());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getEqualsSignKeyword_7());
            		
            // InternalCViewModel.g:221:3: ( (lv_location_10_0= RULE_STRING ) )
            // InternalCViewModel.g:222:4: (lv_location_10_0= RULE_STRING )
            {
            // InternalCViewModel.g:222:4: (lv_location_10_0= RULE_STRING )
            // InternalCViewModel.g:223:5: lv_location_10_0= RULE_STRING
            {
            lv_location_10_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_location_10_0, grammarAccess.getComponentAccess().getLocationSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCViewModel.g:239:3: (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCViewModel.g:240:4: otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getReferenceLineKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalCViewModel.g:248:4: ( (lv_referenceLine_13_0= RULE_INT ) )
                    // InternalCViewModel.g:249:5: (lv_referenceLine_13_0= RULE_INT )
                    {
                    // InternalCViewModel.g:249:5: (lv_referenceLine_13_0= RULE_INT )
                    // InternalCViewModel.g:250:6: lv_referenceLine_13_0= RULE_INT
                    {
                    lv_referenceLine_13_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_referenceLine_13_0, grammarAccess.getComponentAccess().getReferenceLineINTTerminalRuleCall_9_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"referenceLine",
                    							lv_referenceLine_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCViewModel.g:267:3: (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCViewModel.g:268:4: otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )*
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getChildrenKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalCViewModel.g:276:4: ( (otherlv_16= RULE_ID ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCViewModel.g:277:5: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalCViewModel.g:277:5: (otherlv_16= RULE_ID )
                    	    // InternalCViewModel.g:278:6: otherlv_16= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getComponentRule());
                    	    						}
                    	    					
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getChildrenComponentCrossReference_10_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnection"
    // InternalCViewModel.g:294:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalCViewModel.g:294:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalCViewModel.g:295:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalCViewModel.g:301:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;
        Token lv_color_9_0=null;


        	enterRule();

        try {
            // InternalCViewModel.g:307:2: ( (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) ) )
            // InternalCViewModel.g:308:2: (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) )
            {
            // InternalCViewModel.g:308:2: (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) )
            // InternalCViewModel.g:309:3: otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'type' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getSrcKeyword_0());
            		
            // InternalCViewModel.g:313:3: ( (otherlv_1= RULE_ID ) )
            // InternalCViewModel.g:314:4: (otherlv_1= RULE_ID )
            {
            // InternalCViewModel.g:314:4: (otherlv_1= RULE_ID )
            // InternalCViewModel.g:315:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getSrcComponentCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getDstKeyword_2());
            		
            // InternalCViewModel.g:330:3: ( (otherlv_3= RULE_ID ) )
            // InternalCViewModel.g:331:4: (otherlv_3= RULE_ID )
            {
            // InternalCViewModel.g:331:4: (otherlv_3= RULE_ID )
            // InternalCViewModel.g:332:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getDstComponentCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getLabelKeyword_4());
            		
            // InternalCViewModel.g:347:3: ( (lv_label_5_0= RULE_STRING ) )
            // InternalCViewModel.g:348:4: (lv_label_5_0= RULE_STRING )
            {
            // InternalCViewModel.g:348:4: (lv_label_5_0= RULE_STRING )
            // InternalCViewModel.g:349:5: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_label_5_0, grammarAccess.getConnectionAccess().getLabelSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getTypeKeyword_6());
            		
            // InternalCViewModel.g:369:3: ( (lv_type_7_0= RULE_STRING ) )
            // InternalCViewModel.g:370:4: (lv_type_7_0= RULE_STRING )
            {
            // InternalCViewModel.g:370:4: (lv_type_7_0= RULE_STRING )
            // InternalCViewModel.g:371:5: lv_type_7_0= RULE_STRING
            {
            lv_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_type_7_0, grammarAccess.getConnectionAccess().getTypeSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getColorKeyword_8());
            		
            // InternalCViewModel.g:391:3: ( (lv_color_9_0= RULE_STRING ) )
            // InternalCViewModel.g:392:4: (lv_color_9_0= RULE_STRING )
            {
            // InternalCViewModel.g:392:4: (lv_color_9_0= RULE_STRING )
            // InternalCViewModel.g:393:5: lv_color_9_0= RULE_STRING
            {
            lv_color_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_color_9_0, grammarAccess.getConnectionAccess().getColorSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color",
            						lv_color_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "ruleComponentType"
    // InternalCViewModel.g:413:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) ) ;
    public final Enumerator ruleComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCViewModel.g:419:2: ( ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) ) )
            // InternalCViewModel.g:420:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) )
            {
            // InternalCViewModel.g:420:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCViewModel.g:421:3: (enumLiteral_0= 'DIR' )
                    {
                    // InternalCViewModel.g:421:3: (enumLiteral_0= 'DIR' )
                    // InternalCViewModel.g:422:4: enumLiteral_0= 'DIR'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCViewModel.g:429:3: (enumLiteral_1= 'FILE' )
                    {
                    // InternalCViewModel.g:429:3: (enumLiteral_1= 'FILE' )
                    // InternalCViewModel.g:430:4: enumLiteral_1= 'FILE'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCViewModel.g:437:3: (enumLiteral_2= 'FUNC' )
                    {
                    // InternalCViewModel.g:437:3: (enumLiteral_2= 'FUNC' )
                    // InternalCViewModel.g:438:4: enumLiteral_2= 'FUNC'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFUNCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComponentTypeAccess().getFUNCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCViewModel.g:445:3: (enumLiteral_3= 'COMPOUND' )
                    {
                    // InternalCViewModel.g:445:3: (enumLiteral_3= 'COMPOUND' )
                    // InternalCViewModel.g:446:4: enumLiteral_3= 'COMPOUND'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getCOMPOUNDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComponentTypeAccess().getCOMPOUNDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCViewModel.g:453:3: (enumLiteral_4= 'READER' )
                    {
                    // InternalCViewModel.g:453:3: (enumLiteral_4= 'READER' )
                    // InternalCViewModel.g:454:4: enumLiteral_4= 'READER'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getREADEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComponentTypeAccess().getREADEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCViewModel.g:461:3: (enumLiteral_5= 'WRITER' )
                    {
                    // InternalCViewModel.g:461:3: (enumLiteral_5= 'WRITER' )
                    // InternalCViewModel.g:462:4: enumLiteral_5= 'WRITER'
                    {
                    enumLiteral_5=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getWRITEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComponentTypeAccess().getWRITEREnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleComponentType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});

}