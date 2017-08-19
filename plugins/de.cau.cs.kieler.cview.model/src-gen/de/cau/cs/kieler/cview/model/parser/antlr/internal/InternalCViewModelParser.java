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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Component'", "'parent'", "'='", "'type'", "'customTypeID'", "'languageID'", "'reference'", "'referenceUnresolved'", "'location'", "'referenceLine'", "'children'", "'tooltip'", "'rawdata'", "'filtered'", "'src'", "'dst'", "'label'", "'typeID'", "'color'", "'DIR'", "'FILE'", "'CUSTOM'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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

                if ( (LA2_0==26) ) {
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
    // InternalCViewModel.g:133:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'customTypeID' otherlv_9= '=' ( (lv_customTypeID_10_0= RULE_STRING ) ) otherlv_11= 'languageID' otherlv_12= '=' ( (lv_languageID_13_0= RULE_STRING ) ) otherlv_14= 'reference' otherlv_15= '=' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'referenceUnresolved' otherlv_18= '=' ( (lv_referenceUnresolved_19_0= RULE_STRING ) ) otherlv_20= 'location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) (otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) ) )? (otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )* )? otherlv_29= 'tooltip' ( (lv_tooltip_30_0= RULE_STRING ) ) otherlv_31= 'rawdata' ( (lv_rawdata_32_0= RULE_STRING ) ) ( (lv_filtered_33_0= 'filtered' ) )? ) ;
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
        Token lv_customTypeID_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_languageID_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_referenceUnresolved_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_location_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_referenceLine_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_tooltip_30_0=null;
        Token otherlv_31=null;
        Token lv_rawdata_32_0=null;
        Token lv_filtered_33_0=null;
        Enumerator lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalCViewModel.g:139:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'customTypeID' otherlv_9= '=' ( (lv_customTypeID_10_0= RULE_STRING ) ) otherlv_11= 'languageID' otherlv_12= '=' ( (lv_languageID_13_0= RULE_STRING ) ) otherlv_14= 'reference' otherlv_15= '=' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'referenceUnresolved' otherlv_18= '=' ( (lv_referenceUnresolved_19_0= RULE_STRING ) ) otherlv_20= 'location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) (otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) ) )? (otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )* )? otherlv_29= 'tooltip' ( (lv_tooltip_30_0= RULE_STRING ) ) otherlv_31= 'rawdata' ( (lv_rawdata_32_0= RULE_STRING ) ) ( (lv_filtered_33_0= 'filtered' ) )? ) )
            // InternalCViewModel.g:140:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'customTypeID' otherlv_9= '=' ( (lv_customTypeID_10_0= RULE_STRING ) ) otherlv_11= 'languageID' otherlv_12= '=' ( (lv_languageID_13_0= RULE_STRING ) ) otherlv_14= 'reference' otherlv_15= '=' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'referenceUnresolved' otherlv_18= '=' ( (lv_referenceUnresolved_19_0= RULE_STRING ) ) otherlv_20= 'location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) (otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) ) )? (otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )* )? otherlv_29= 'tooltip' ( (lv_tooltip_30_0= RULE_STRING ) ) otherlv_31= 'rawdata' ( (lv_rawdata_32_0= RULE_STRING ) ) ( (lv_filtered_33_0= 'filtered' ) )? )
            {
            // InternalCViewModel.g:140:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'customTypeID' otherlv_9= '=' ( (lv_customTypeID_10_0= RULE_STRING ) ) otherlv_11= 'languageID' otherlv_12= '=' ( (lv_languageID_13_0= RULE_STRING ) ) otherlv_14= 'reference' otherlv_15= '=' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'referenceUnresolved' otherlv_18= '=' ( (lv_referenceUnresolved_19_0= RULE_STRING ) ) otherlv_20= 'location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) (otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) ) )? (otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )* )? otherlv_29= 'tooltip' ( (lv_tooltip_30_0= RULE_STRING ) ) otherlv_31= 'rawdata' ( (lv_rawdata_32_0= RULE_STRING ) ) ( (lv_filtered_33_0= 'filtered' ) )? )
            // InternalCViewModel.g:141:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'customTypeID' otherlv_9= '=' ( (lv_customTypeID_10_0= RULE_STRING ) ) otherlv_11= 'languageID' otherlv_12= '=' ( (lv_languageID_13_0= RULE_STRING ) ) otherlv_14= 'reference' otherlv_15= '=' ( (otherlv_16= RULE_ID ) ) otherlv_17= 'referenceUnresolved' otherlv_18= '=' ( (lv_referenceUnresolved_19_0= RULE_STRING ) ) otherlv_20= 'location' otherlv_21= '=' ( (lv_location_22_0= RULE_STRING ) ) (otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) ) )? (otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )* )? otherlv_29= 'tooltip' ( (lv_tooltip_30_0= RULE_STRING ) ) otherlv_31= 'rawdata' ( (lv_rawdata_32_0= RULE_STRING ) ) ( (lv_filtered_33_0= 'filtered' ) )?
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

            			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getCustomTypeIDKeyword_6());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getEqualsSignKeyword_7());
            		
            // InternalCViewModel.g:221:3: ( (lv_customTypeID_10_0= RULE_STRING ) )
            // InternalCViewModel.g:222:4: (lv_customTypeID_10_0= RULE_STRING )
            {
            // InternalCViewModel.g:222:4: (lv_customTypeID_10_0= RULE_STRING )
            // InternalCViewModel.g:223:5: lv_customTypeID_10_0= RULE_STRING
            {
            lv_customTypeID_10_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_customTypeID_10_0, grammarAccess.getComponentAccess().getCustomTypeIDSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customTypeID",
            						lv_customTypeID_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLanguageIDKeyword_9());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getEqualsSignKeyword_10());
            		
            // InternalCViewModel.g:247:3: ( (lv_languageID_13_0= RULE_STRING ) )
            // InternalCViewModel.g:248:4: (lv_languageID_13_0= RULE_STRING )
            {
            // InternalCViewModel.g:248:4: (lv_languageID_13_0= RULE_STRING )
            // InternalCViewModel.g:249:5: lv_languageID_13_0= RULE_STRING
            {
            lv_languageID_13_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_languageID_13_0, grammarAccess.getComponentAccess().getLanguageIDSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"languageID",
            						lv_languageID_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getReferenceKeyword_12());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getEqualsSignKeyword_13());
            		
            // InternalCViewModel.g:273:3: ( (otherlv_16= RULE_ID ) )
            // InternalCViewModel.g:274:4: (otherlv_16= RULE_ID )
            {
            // InternalCViewModel.g:274:4: (otherlv_16= RULE_ID )
            // InternalCViewModel.g:275:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getReferenceComponentCrossReference_14_0());
            				

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getReferenceUnresolvedKeyword_15());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getEqualsSignKeyword_16());
            		
            // InternalCViewModel.g:294:3: ( (lv_referenceUnresolved_19_0= RULE_STRING ) )
            // InternalCViewModel.g:295:4: (lv_referenceUnresolved_19_0= RULE_STRING )
            {
            // InternalCViewModel.g:295:4: (lv_referenceUnresolved_19_0= RULE_STRING )
            // InternalCViewModel.g:296:5: lv_referenceUnresolved_19_0= RULE_STRING
            {
            lv_referenceUnresolved_19_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_referenceUnresolved_19_0, grammarAccess.getComponentAccess().getReferenceUnresolvedSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceUnresolved",
            						lv_referenceUnresolved_19_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_20, grammarAccess.getComponentAccess().getLocationKeyword_18());
            		
            otherlv_21=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getEqualsSignKeyword_19());
            		
            // InternalCViewModel.g:320:3: ( (lv_location_22_0= RULE_STRING ) )
            // InternalCViewModel.g:321:4: (lv_location_22_0= RULE_STRING )
            {
            // InternalCViewModel.g:321:4: (lv_location_22_0= RULE_STRING )
            // InternalCViewModel.g:322:5: lv_location_22_0= RULE_STRING
            {
            lv_location_22_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_location_22_0, grammarAccess.getComponentAccess().getLocationSTRINGTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_22_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCViewModel.g:338:3: (otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCViewModel.g:339:4: otherlv_23= 'referenceLine' otherlv_24= '=' ( (lv_referenceLine_25_0= RULE_INT ) )
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentAccess().getReferenceLineKeyword_21_0());
                    			
                    otherlv_24=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentAccess().getEqualsSignKeyword_21_1());
                    			
                    // InternalCViewModel.g:347:4: ( (lv_referenceLine_25_0= RULE_INT ) )
                    // InternalCViewModel.g:348:5: (lv_referenceLine_25_0= RULE_INT )
                    {
                    // InternalCViewModel.g:348:5: (lv_referenceLine_25_0= RULE_INT )
                    // InternalCViewModel.g:349:6: lv_referenceLine_25_0= RULE_INT
                    {
                    lv_referenceLine_25_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_referenceLine_25_0, grammarAccess.getComponentAccess().getReferenceLineINTTerminalRuleCall_21_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"referenceLine",
                    							lv_referenceLine_25_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCViewModel.g:366:3: (otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCViewModel.g:367:4: otherlv_26= 'children' otherlv_27= '=' ( (otherlv_28= RULE_ID ) )*
                    {
                    otherlv_26=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_26, grammarAccess.getComponentAccess().getChildrenKeyword_22_0());
                    			
                    otherlv_27=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponentAccess().getEqualsSignKeyword_22_1());
                    			
                    // InternalCViewModel.g:375:4: ( (otherlv_28= RULE_ID ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCViewModel.g:376:5: (otherlv_28= RULE_ID )
                    	    {
                    	    // InternalCViewModel.g:376:5: (otherlv_28= RULE_ID )
                    	    // InternalCViewModel.g:377:6: otherlv_28= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getComponentRule());
                    	    						}
                    	    					
                    	    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    						newLeafNode(otherlv_28, grammarAccess.getComponentAccess().getChildrenComponentCrossReference_22_2_0());
                    	    					

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

            otherlv_29=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_29, grammarAccess.getComponentAccess().getTooltipKeyword_23());
            		
            // InternalCViewModel.g:393:3: ( (lv_tooltip_30_0= RULE_STRING ) )
            // InternalCViewModel.g:394:4: (lv_tooltip_30_0= RULE_STRING )
            {
            // InternalCViewModel.g:394:4: (lv_tooltip_30_0= RULE_STRING )
            // InternalCViewModel.g:395:5: lv_tooltip_30_0= RULE_STRING
            {
            lv_tooltip_30_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_tooltip_30_0, grammarAccess.getComponentAccess().getTooltipSTRINGTerminalRuleCall_24_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tooltip",
            						lv_tooltip_30_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_31=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_31, grammarAccess.getComponentAccess().getRawdataKeyword_25());
            		
            // InternalCViewModel.g:415:3: ( (lv_rawdata_32_0= RULE_STRING ) )
            // InternalCViewModel.g:416:4: (lv_rawdata_32_0= RULE_STRING )
            {
            // InternalCViewModel.g:416:4: (lv_rawdata_32_0= RULE_STRING )
            // InternalCViewModel.g:417:5: lv_rawdata_32_0= RULE_STRING
            {
            lv_rawdata_32_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_rawdata_32_0, grammarAccess.getComponentAccess().getRawdataSTRINGTerminalRuleCall_26_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rawdata",
            						lv_rawdata_32_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCViewModel.g:433:3: ( (lv_filtered_33_0= 'filtered' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCViewModel.g:434:4: (lv_filtered_33_0= 'filtered' )
                    {
                    // InternalCViewModel.g:434:4: (lv_filtered_33_0= 'filtered' )
                    // InternalCViewModel.g:435:5: lv_filtered_33_0= 'filtered'
                    {
                    lv_filtered_33_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_filtered_33_0, grammarAccess.getComponentAccess().getFilteredFilteredKeyword_27_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "filtered", true, "filtered");
                    				

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnection"
    // InternalCViewModel.g:451:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalCViewModel.g:451:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalCViewModel.g:452:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalCViewModel.g:458:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'typeID' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) otherlv_10= 'tooltip' ( (lv_tooltip_11_0= RULE_STRING ) ) ) ;
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
        Token otherlv_10=null;
        Token lv_tooltip_11_0=null;


        	enterRule();

        try {
            // InternalCViewModel.g:464:2: ( (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'typeID' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) otherlv_10= 'tooltip' ( (lv_tooltip_11_0= RULE_STRING ) ) ) )
            // InternalCViewModel.g:465:2: (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'typeID' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) otherlv_10= 'tooltip' ( (lv_tooltip_11_0= RULE_STRING ) ) )
            {
            // InternalCViewModel.g:465:2: (otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'typeID' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) otherlv_10= 'tooltip' ( (lv_tooltip_11_0= RULE_STRING ) ) )
            // InternalCViewModel.g:466:3: otherlv_0= 'src' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'dst' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'label' ( (lv_label_5_0= RULE_STRING ) ) otherlv_6= 'typeID' ( (lv_type_7_0= RULE_STRING ) ) otherlv_8= 'color' ( (lv_color_9_0= RULE_STRING ) ) otherlv_10= 'tooltip' ( (lv_tooltip_11_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getSrcKeyword_0());
            		
            // InternalCViewModel.g:470:3: ( (otherlv_1= RULE_ID ) )
            // InternalCViewModel.g:471:4: (otherlv_1= RULE_ID )
            {
            // InternalCViewModel.g:471:4: (otherlv_1= RULE_ID )
            // InternalCViewModel.g:472:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getSrcComponentCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getDstKeyword_2());
            		
            // InternalCViewModel.g:487:3: ( (otherlv_3= RULE_ID ) )
            // InternalCViewModel.g:488:4: (otherlv_3= RULE_ID )
            {
            // InternalCViewModel.g:488:4: (otherlv_3= RULE_ID )
            // InternalCViewModel.g:489:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getDstComponentCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getLabelKeyword_4());
            		
            // InternalCViewModel.g:504:3: ( (lv_label_5_0= RULE_STRING ) )
            // InternalCViewModel.g:505:4: (lv_label_5_0= RULE_STRING )
            {
            // InternalCViewModel.g:505:4: (lv_label_5_0= RULE_STRING )
            // InternalCViewModel.g:506:5: lv_label_5_0= RULE_STRING
            {
            lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            otherlv_6=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getTypeIDKeyword_6());
            		
            // InternalCViewModel.g:526:3: ( (lv_type_7_0= RULE_STRING ) )
            // InternalCViewModel.g:527:4: (lv_type_7_0= RULE_STRING )
            {
            // InternalCViewModel.g:527:4: (lv_type_7_0= RULE_STRING )
            // InternalCViewModel.g:528:5: lv_type_7_0= RULE_STRING
            {
            lv_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_8=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getColorKeyword_8());
            		
            // InternalCViewModel.g:548:3: ( (lv_color_9_0= RULE_STRING ) )
            // InternalCViewModel.g:549:4: (lv_color_9_0= RULE_STRING )
            {
            // InternalCViewModel.g:549:4: (lv_color_9_0= RULE_STRING )
            // InternalCViewModel.g:550:5: lv_color_9_0= RULE_STRING
            {
            lv_color_9_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            otherlv_10=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getConnectionAccess().getTooltipKeyword_10());
            		
            // InternalCViewModel.g:570:3: ( (lv_tooltip_11_0= RULE_STRING ) )
            // InternalCViewModel.g:571:4: (lv_tooltip_11_0= RULE_STRING )
            {
            // InternalCViewModel.g:571:4: (lv_tooltip_11_0= RULE_STRING )
            // InternalCViewModel.g:572:5: lv_tooltip_11_0= RULE_STRING
            {
            lv_tooltip_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_tooltip_11_0, grammarAccess.getConnectionAccess().getTooltipSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tooltip",
            						lv_tooltip_11_0,
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
    // InternalCViewModel.g:592:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'CUSTOM' ) ) ;
    public final Enumerator ruleComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCViewModel.g:598:2: ( ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'CUSTOM' ) ) )
            // InternalCViewModel.g:599:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'CUSTOM' ) )
            {
            // InternalCViewModel.g:599:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'CUSTOM' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCViewModel.g:600:3: (enumLiteral_0= 'DIR' )
                    {
                    // InternalCViewModel.g:600:3: (enumLiteral_0= 'DIR' )
                    // InternalCViewModel.g:601:4: enumLiteral_0= 'DIR'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCViewModel.g:608:3: (enumLiteral_1= 'FILE' )
                    {
                    // InternalCViewModel.g:608:3: (enumLiteral_1= 'FILE' )
                    // InternalCViewModel.g:609:4: enumLiteral_1= 'FILE'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCViewModel.g:616:3: (enumLiteral_2= 'CUSTOM' )
                    {
                    // InternalCViewModel.g:616:3: (enumLiteral_2= 'CUSTOM' )
                    // InternalCViewModel.g:617:4: enumLiteral_2= 'CUSTOM'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getCUSTOMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComponentTypeAccess().getCUSTOMEnumLiteralDeclaration_2());
                    			

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});

}