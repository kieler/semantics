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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Component'", "'parent'", "'='", "'type'", "'location'", "'referenceLine'", "'children'", "'DIR'", "'FILE'", "'FUNC'", "'COMPOUND'", "'READER'", "'WRITER'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalCViewModel.g:72:1: ruleCViewModel returns [EObject current=null] : ( (lv_components_0_0= ruleComponent ) )* ;
    public final EObject ruleCViewModel() throws RecognitionException {
        EObject current = null;

        EObject lv_components_0_0 = null;



        	enterRule();

        try {
            // InternalCViewModel.g:78:2: ( ( (lv_components_0_0= ruleComponent ) )* )
            // InternalCViewModel.g:79:2: ( (lv_components_0_0= ruleComponent ) )*
            {
            // InternalCViewModel.g:79:2: ( (lv_components_0_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCViewModel.g:80:3: (lv_components_0_0= ruleComponent )
            	    {
            	    // InternalCViewModel.g:80:3: (lv_components_0_0= ruleComponent )
            	    // InternalCViewModel.g:81:4: lv_components_0_0= ruleComponent
            	    {

            	    				newCompositeNode(grammarAccess.getCViewModelAccess().getComponentsComponentParserRuleCall_0());
            	    			
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
    // InternalCViewModel.g:101:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCViewModel.g:101:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCViewModel.g:102:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalCViewModel.g:108:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? ) ;
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
            // InternalCViewModel.g:114:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? ) )
            // InternalCViewModel.g:115:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? )
            {
            // InternalCViewModel.g:115:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )? )
            // InternalCViewModel.g:116:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= ruleComponentType ) ) otherlv_8= 'location' otherlv_9= '=' ( (lv_location_10_0= RULE_STRING ) ) (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )? (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalCViewModel.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCViewModel.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCViewModel.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalCViewModel.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalCViewModel.g:138:3: (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCViewModel.g:139:4: otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getParentKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalCViewModel.g:147:4: ( (otherlv_4= RULE_ID ) )
                    // InternalCViewModel.g:148:5: (otherlv_4= RULE_ID )
                    {
                    // InternalCViewModel.g:148:5: (otherlv_4= RULE_ID )
                    // InternalCViewModel.g:149:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getParentComponentCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getTypeKeyword_3());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getEqualsSignKeyword_4());
            		
            // InternalCViewModel.g:169:3: ( (lv_type_7_0= ruleComponentType ) )
            // InternalCViewModel.g:170:4: (lv_type_7_0= ruleComponentType )
            {
            // InternalCViewModel.g:170:4: (lv_type_7_0= ruleComponentType )
            // InternalCViewModel.g:171:5: lv_type_7_0= ruleComponentType
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getTypeComponentTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_8=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getLocationKeyword_6());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getEqualsSignKeyword_7());
            		
            // InternalCViewModel.g:196:3: ( (lv_location_10_0= RULE_STRING ) )
            // InternalCViewModel.g:197:4: (lv_location_10_0= RULE_STRING )
            {
            // InternalCViewModel.g:197:4: (lv_location_10_0= RULE_STRING )
            // InternalCViewModel.g:198:5: lv_location_10_0= RULE_STRING
            {
            lv_location_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            // InternalCViewModel.g:214:3: (otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCViewModel.g:215:4: otherlv_11= 'referenceLine' otherlv_12= '=' ( (lv_referenceLine_13_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getReferenceLineKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalCViewModel.g:223:4: ( (lv_referenceLine_13_0= RULE_INT ) )
                    // InternalCViewModel.g:224:5: (lv_referenceLine_13_0= RULE_INT )
                    {
                    // InternalCViewModel.g:224:5: (lv_referenceLine_13_0= RULE_INT )
                    // InternalCViewModel.g:225:6: lv_referenceLine_13_0= RULE_INT
                    {
                    lv_referenceLine_13_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            // InternalCViewModel.g:242:3: (otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCViewModel.g:243:4: otherlv_14= 'children' otherlv_15= '=' ( (otherlv_16= RULE_ID ) )*
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getChildrenKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalCViewModel.g:251:4: ( (otherlv_16= RULE_ID ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCViewModel.g:252:5: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalCViewModel.g:252:5: (otherlv_16= RULE_ID )
                    	    // InternalCViewModel.g:253:6: otherlv_16= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getComponentRule());
                    	    						}
                    	    					
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getChildrenComponentCrossReference_10_2_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
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


    // $ANTLR start "ruleComponentType"
    // InternalCViewModel.g:269:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) ) ;
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
            // InternalCViewModel.g:275:2: ( ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) ) )
            // InternalCViewModel.g:276:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) )
            {
            // InternalCViewModel.g:276:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCViewModel.g:277:3: (enumLiteral_0= 'DIR' )
                    {
                    // InternalCViewModel.g:277:3: (enumLiteral_0= 'DIR' )
                    // InternalCViewModel.g:278:4: enumLiteral_0= 'DIR'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCViewModel.g:285:3: (enumLiteral_1= 'FILE' )
                    {
                    // InternalCViewModel.g:285:3: (enumLiteral_1= 'FILE' )
                    // InternalCViewModel.g:286:4: enumLiteral_1= 'FILE'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCViewModel.g:293:3: (enumLiteral_2= 'FUNC' )
                    {
                    // InternalCViewModel.g:293:3: (enumLiteral_2= 'FUNC' )
                    // InternalCViewModel.g:294:4: enumLiteral_2= 'FUNC'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFUNCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComponentTypeAccess().getFUNCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCViewModel.g:301:3: (enumLiteral_3= 'COMPOUND' )
                    {
                    // InternalCViewModel.g:301:3: (enumLiteral_3= 'COMPOUND' )
                    // InternalCViewModel.g:302:4: enumLiteral_3= 'COMPOUND'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getCOMPOUNDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComponentTypeAccess().getCOMPOUNDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCViewModel.g:309:3: (enumLiteral_4= 'READER' )
                    {
                    // InternalCViewModel.g:309:3: (enumLiteral_4= 'READER' )
                    // InternalCViewModel.g:310:4: enumLiteral_4= 'READER'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getREADEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComponentTypeAccess().getREADEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCViewModel.g:317:3: (enumLiteral_5= 'WRITER' )
                    {
                    // InternalCViewModel.g:317:3: (enumLiteral_5= 'WRITER' )
                    // InternalCViewModel.g:318:4: enumLiteral_5= 'WRITER'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});

}