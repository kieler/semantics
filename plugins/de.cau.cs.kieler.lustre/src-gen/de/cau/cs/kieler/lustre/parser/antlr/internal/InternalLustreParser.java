package de.cau.cs.kieler.lustre.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.lustre.services.LustreGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLustreParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_BOOL", "RULE_FLOAT", "RULE_INT", "RULE_STRING_CONSTANT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_LUSTRE_COMMENT", "RULE_WS", "'package'", "'uses'", "','", "'provides'", "'body'", "'end'", "'node'", "'('", "')'", "'returns'", "';'", "':'", "'type'", "'='", "'const'", "'when'", "'var'", "'let'", "'tel'", "'assert'", "'.'", "'['", "']'", "'..'", "'if'", "'then'", "'else'", "'fby'", "'->'", "'or'", "'and'", "'<>'", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'not'", "'pre'", "'current'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_CONSTANT=8;
    public static final int RULE_LUSTRE_COMMENT=11;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_BOOL=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLustreParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLustreParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLustreParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLustre.g"; }



     	private LustreGrammarAccess grammarAccess;

        public InternalLustreParser(TokenStream input, LustreGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected LustreGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalLustre.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:66:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalLustre.g:67:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalLustre.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_packages_0_0= rulePackage_Declaration ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:83:2: ( ( (lv_packages_0_0= rulePackage_Declaration ) )+ )
            // InternalLustre.g:84:2: ( (lv_packages_0_0= rulePackage_Declaration ) )+
            {
            // InternalLustre.g:84:2: ( (lv_packages_0_0= rulePackage_Declaration ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLustre.g:85:3: (lv_packages_0_0= rulePackage_Declaration )
            	    {
            	    // InternalLustre.g:85:3: (lv_packages_0_0= rulePackage_Declaration )
            	    // InternalLustre.g:86:4: lv_packages_0_0= rulePackage_Declaration
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getPackagesPackage_DeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_packages_0_0=rulePackage_Declaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"packages",
            	    					lv_packages_0_0,
            	    					"de.cau.cs.kieler.lustre.Lustre.Package_Declaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePackage_Declaration"
    // InternalLustre.g:109:1: entryRulePackage_Declaration returns [EObject current=null] : iv_rulePackage_Declaration= rulePackage_Declaration EOF ;
    public final EObject entryRulePackage_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Declaration = null;


        try {
            // InternalLustre.g:109:60: (iv_rulePackage_Declaration= rulePackage_Declaration EOF )
            // InternalLustre.g:110:2: iv_rulePackage_Declaration= rulePackage_Declaration EOF
            {
             newCompositeNode(grammarAccess.getPackage_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Declaration=rulePackage_Declaration();

            state._fsp--;

             current =iv_rulePackage_Declaration; 
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
    // $ANTLR end "entryRulePackage_Declaration"


    // $ANTLR start "rulePackage_Declaration"
    // InternalLustre.g:116:1: rulePackage_Declaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )* )? otherlv_6= 'provides' ( (lv_provides_7_0= rulePackage_Provided ) )+ otherlv_8= 'body' ( ( (lv_nodes_9_0= ruleNode_Declaration ) ) | ( (lv_types_10_0= ruleType_Declaration ) ) | ( (lv_constants_11_0= ruleConstant_Declaration ) ) )* otherlv_12= 'end' ) ;
    public final EObject rulePackage_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_uses_3_0=null;
        Token otherlv_4=null;
        Token lv_uses_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_provides_7_0 = null;

        EObject lv_nodes_9_0 = null;

        EObject lv_types_10_0 = null;

        EObject lv_constants_11_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:122:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )* )? otherlv_6= 'provides' ( (lv_provides_7_0= rulePackage_Provided ) )+ otherlv_8= 'body' ( ( (lv_nodes_9_0= ruleNode_Declaration ) ) | ( (lv_types_10_0= ruleType_Declaration ) ) | ( (lv_constants_11_0= ruleConstant_Declaration ) ) )* otherlv_12= 'end' ) )
            // InternalLustre.g:123:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )* )? otherlv_6= 'provides' ( (lv_provides_7_0= rulePackage_Provided ) )+ otherlv_8= 'body' ( ( (lv_nodes_9_0= ruleNode_Declaration ) ) | ( (lv_types_10_0= ruleType_Declaration ) ) | ( (lv_constants_11_0= ruleConstant_Declaration ) ) )* otherlv_12= 'end' )
            {
            // InternalLustre.g:123:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )* )? otherlv_6= 'provides' ( (lv_provides_7_0= rulePackage_Provided ) )+ otherlv_8= 'body' ( ( (lv_nodes_9_0= ruleNode_Declaration ) ) | ( (lv_types_10_0= ruleType_Declaration ) ) | ( (lv_constants_11_0= ruleConstant_Declaration ) ) )* otherlv_12= 'end' )
            // InternalLustre.g:124:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )* )? otherlv_6= 'provides' ( (lv_provides_7_0= rulePackage_Provided ) )+ otherlv_8= 'body' ( ( (lv_nodes_9_0= ruleNode_Declaration ) ) | ( (lv_types_10_0= ruleType_Declaration ) ) | ( (lv_constants_11_0= ruleConstant_Declaration ) ) )* otherlv_12= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackage_DeclarationAccess().getPackageKeyword_0());
            		
            // InternalLustre.g:128:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:129:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:129:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:130:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackage_DeclarationAccess().getNameIDENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_DeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            // InternalLustre.g:146:3: (otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLustre.g:147:4: otherlv_2= 'uses' ( (lv_uses_3_0= RULE_IDENT ) ) (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )*
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPackage_DeclarationAccess().getUsesKeyword_2_0());
                    			
                    // InternalLustre.g:151:4: ( (lv_uses_3_0= RULE_IDENT ) )
                    // InternalLustre.g:152:5: (lv_uses_3_0= RULE_IDENT )
                    {
                    // InternalLustre.g:152:5: (lv_uses_3_0= RULE_IDENT )
                    // InternalLustre.g:153:6: lv_uses_3_0= RULE_IDENT
                    {
                    lv_uses_3_0=(Token)match(input,RULE_IDENT,FOLLOW_6); 

                    						newLeafNode(lv_uses_3_0, grammarAccess.getPackage_DeclarationAccess().getUsesIDENTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackage_DeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"uses",
                    							lv_uses_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    // InternalLustre.g:169:4: (otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLustre.g:170:5: otherlv_4= ',' ( (lv_uses_5_0= RULE_IDENT ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPackage_DeclarationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalLustre.g:174:5: ( (lv_uses_5_0= RULE_IDENT ) )
                    	    // InternalLustre.g:175:6: (lv_uses_5_0= RULE_IDENT )
                    	    {
                    	    // InternalLustre.g:175:6: (lv_uses_5_0= RULE_IDENT )
                    	    // InternalLustre.g:176:7: lv_uses_5_0= RULE_IDENT
                    	    {
                    	    lv_uses_5_0=(Token)match(input,RULE_IDENT,FOLLOW_6); 

                    	    							newLeafNode(lv_uses_5_0, grammarAccess.getPackage_DeclarationAccess().getUsesIDENTTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPackage_DeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"uses",
                    	    								lv_uses_5_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPackage_DeclarationAccess().getProvidesKeyword_3());
            		
            // InternalLustre.g:198:3: ( (lv_provides_7_0= rulePackage_Provided ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLustre.g:199:4: (lv_provides_7_0= rulePackage_Provided )
            	    {
            	    // InternalLustre.g:199:4: (lv_provides_7_0= rulePackage_Provided )
            	    // InternalLustre.g:200:5: lv_provides_7_0= rulePackage_Provided
            	    {

            	    					newCompositeNode(grammarAccess.getPackage_DeclarationAccess().getProvidesPackage_ProvidedParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_provides_7_0=rulePackage_Provided();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackage_DeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"provides",
            	    						lv_provides_7_0,
            	    						"de.cau.cs.kieler.lustre.Lustre.Package_Provided");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getPackage_DeclarationAccess().getBodyKeyword_5());
            		
            // InternalLustre.g:221:3: ( ( (lv_nodes_9_0= ruleNode_Declaration ) ) | ( (lv_types_10_0= ruleType_Declaration ) ) | ( (lv_constants_11_0= ruleConstant_Declaration ) ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt5=1;
                    }
                    break;
                case 25:
                    {
                    alt5=2;
                    }
                    break;
                case 27:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalLustre.g:222:4: ( (lv_nodes_9_0= ruleNode_Declaration ) )
            	    {
            	    // InternalLustre.g:222:4: ( (lv_nodes_9_0= ruleNode_Declaration ) )
            	    // InternalLustre.g:223:5: (lv_nodes_9_0= ruleNode_Declaration )
            	    {
            	    // InternalLustre.g:223:5: (lv_nodes_9_0= ruleNode_Declaration )
            	    // InternalLustre.g:224:6: lv_nodes_9_0= ruleNode_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getPackage_DeclarationAccess().getNodesNode_DeclarationParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_nodes_9_0=ruleNode_Declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackage_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodes",
            	    							lv_nodes_9_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Node_Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:242:4: ( (lv_types_10_0= ruleType_Declaration ) )
            	    {
            	    // InternalLustre.g:242:4: ( (lv_types_10_0= ruleType_Declaration ) )
            	    // InternalLustre.g:243:5: (lv_types_10_0= ruleType_Declaration )
            	    {
            	    // InternalLustre.g:243:5: (lv_types_10_0= ruleType_Declaration )
            	    // InternalLustre.g:244:6: lv_types_10_0= ruleType_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getPackage_DeclarationAccess().getTypesType_DeclarationParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_types_10_0=ruleType_Declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackage_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_10_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Type_Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLustre.g:262:4: ( (lv_constants_11_0= ruleConstant_Declaration ) )
            	    {
            	    // InternalLustre.g:262:4: ( (lv_constants_11_0= ruleConstant_Declaration ) )
            	    // InternalLustre.g:263:5: (lv_constants_11_0= ruleConstant_Declaration )
            	    {
            	    // InternalLustre.g:263:5: (lv_constants_11_0= ruleConstant_Declaration )
            	    // InternalLustre.g:264:6: lv_constants_11_0= ruleConstant_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getPackage_DeclarationAccess().getConstantsConstant_DeclarationParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_constants_11_0=ruleConstant_Declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackage_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_11_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Constant_Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPackage_DeclarationAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "rulePackage_Declaration"


    // $ANTLR start "entryRulePackage_Provided"
    // InternalLustre.g:290:1: entryRulePackage_Provided returns [EObject current=null] : iv_rulePackage_Provided= rulePackage_Provided EOF ;
    public final EObject entryRulePackage_Provided() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided = null;


        try {
            // InternalLustre.g:290:57: (iv_rulePackage_Provided= rulePackage_Provided EOF )
            // InternalLustre.g:291:2: iv_rulePackage_Provided= rulePackage_Provided EOF
            {
             newCompositeNode(grammarAccess.getPackage_ProvidedRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Provided=rulePackage_Provided();

            state._fsp--;

             current =iv_rulePackage_Provided; 
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
    // $ANTLR end "entryRulePackage_Provided"


    // $ANTLR start "rulePackage_Provided"
    // InternalLustre.g:297:1: rulePackage_Provided returns [EObject current=null] : (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' ) ;
    public final EObject rulePackage_Provided() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returned_9_0 = null;

        EObject lv_returned_11_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:303:2: ( (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' ) )
            // InternalLustre.g:304:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' )
            {
            // InternalLustre.g:304:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' )
            // InternalLustre.g:305:3: otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackage_ProvidedAccess().getNodeKeyword_0());
            		
            // InternalLustre.g:309:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:310:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:310:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:311:5: otherlv_1= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_ProvidedRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getPackage_ProvidedAccess().getNameNode_DeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPackage_ProvidedAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLustre.g:326:3: ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLustre.g:327:4: ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )*
                    {
                    // InternalLustre.g:327:4: ( (lv_parameters_3_0= rulePackage_Provided_IO ) )
                    // InternalLustre.g:328:5: (lv_parameters_3_0= rulePackage_Provided_IO )
                    {
                    // InternalLustre.g:328:5: (lv_parameters_3_0= rulePackage_Provided_IO )
                    // InternalLustre.g:329:6: lv_parameters_3_0= rulePackage_Provided_IO
                    {

                    						newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getParametersPackage_Provided_IOParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_3_0=rulePackage_Provided_IO();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLustre.g:346:4: (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalLustre.g:347:5: otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPackage_ProvidedAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLustre.g:351:5: ( (lv_parameters_5_0= rulePackage_Provided_IO ) )
                    	    // InternalLustre.g:352:6: (lv_parameters_5_0= rulePackage_Provided_IO )
                    	    {
                    	    // InternalLustre.g:352:6: (lv_parameters_5_0= rulePackage_Provided_IO )
                    	    // InternalLustre.g:353:7: lv_parameters_5_0= rulePackage_Provided_IO
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getParametersPackage_Provided_IOParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_5_0=rulePackage_Provided_IO();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPackage_ProvidedAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getPackage_ProvidedAccess().getReturnsKeyword_5());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getPackage_ProvidedAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLustre.g:384:3: ( (lv_returned_9_0= rulePackage_Provided_IO ) )
            // InternalLustre.g:385:4: (lv_returned_9_0= rulePackage_Provided_IO )
            {
            // InternalLustre.g:385:4: (lv_returned_9_0= rulePackage_Provided_IO )
            // InternalLustre.g:386:5: lv_returned_9_0= rulePackage_Provided_IO
            {

            					newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getReturnedPackage_Provided_IOParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_returned_9_0=rulePackage_Provided_IO();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
            					}
            					add(
            						current,
            						"returned",
            						lv_returned_9_0,
            						"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:403:3: (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLustre.g:404:4: otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getPackage_ProvidedAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalLustre.g:408:4: ( (lv_returned_11_0= rulePackage_Provided_IO ) )
            	    // InternalLustre.g:409:5: (lv_returned_11_0= rulePackage_Provided_IO )
            	    {
            	    // InternalLustre.g:409:5: (lv_returned_11_0= rulePackage_Provided_IO )
            	    // InternalLustre.g:410:6: lv_returned_11_0= rulePackage_Provided_IO
            	    {

            	    						newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getReturnedPackage_Provided_IOParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_returned_11_0=rulePackage_Provided_IO();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackage_ProvidedRule());
            	    						}
            	    						add(
            	    							current,
            	    							"returned",
            	    							lv_returned_11_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Package_Provided_IO");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getPackage_ProvidedAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPackage_ProvidedAccess().getSemicolonKeyword_10());
            		

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
    // $ANTLR end "rulePackage_Provided"


    // $ANTLR start "entryRulePackage_Provided_IO"
    // InternalLustre.g:440:1: entryRulePackage_Provided_IO returns [EObject current=null] : iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF ;
    public final EObject entryRulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided_IO = null;


        try {
            // InternalLustre.g:440:60: (iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF )
            // InternalLustre.g:441:2: iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF
            {
             newCompositeNode(grammarAccess.getPackage_Provided_IORule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Provided_IO=rulePackage_Provided_IO();

            state._fsp--;

             current =iv_rulePackage_Provided_IO; 
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
    // $ANTLR end "entryRulePackage_Provided_IO"


    // $ANTLR start "rulePackage_Provided_IO"
    // InternalLustre.g:447:1: rulePackage_Provided_IO returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) ;
    public final EObject rulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalLustre.g:453:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) )
            // InternalLustre.g:454:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            {
            // InternalLustre.g:454:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            // InternalLustre.g:455:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) )
            {
            // InternalLustre.g:455:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:456:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:456:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:457:5: otherlv_0= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_Provided_IORule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getPackage_Provided_IOAccess().getNameVariable_DeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage_Provided_IOAccess().getColonKeyword_1());
            		
            // InternalLustre.g:472:3: ( (lv_type_2_0= RULE_IDENT ) )
            // InternalLustre.g:473:4: (lv_type_2_0= RULE_IDENT )
            {
            // InternalLustre.g:473:4: (lv_type_2_0= RULE_IDENT )
            // InternalLustre.g:474:5: lv_type_2_0= RULE_IDENT
            {
            lv_type_2_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getPackage_Provided_IOAccess().getTypeIDENTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_Provided_IORule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

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
    // $ANTLR end "rulePackage_Provided_IO"


    // $ANTLR start "entryRuleType_Declaration"
    // InternalLustre.g:494:1: entryRuleType_Declaration returns [EObject current=null] : iv_ruleType_Declaration= ruleType_Declaration EOF ;
    public final EObject entryRuleType_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Declaration = null;


        try {
            // InternalLustre.g:494:57: (iv_ruleType_Declaration= ruleType_Declaration EOF )
            // InternalLustre.g:495:2: iv_ruleType_Declaration= ruleType_Declaration EOF
            {
             newCompositeNode(grammarAccess.getType_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Declaration=ruleType_Declaration();

            state._fsp--;

             current =iv_ruleType_Declaration; 
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
    // $ANTLR end "entryRuleType_Declaration"


    // $ANTLR start "ruleType_Declaration"
    // InternalLustre.g:501:1: ruleType_Declaration returns [EObject current=null] : ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleType_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:507:2: ( ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) ) )
            // InternalLustre.g:508:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) )
            {
            // InternalLustre.g:508:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_IDENT) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==23) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==26) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLustre.g:509:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' )
                    {
                    // InternalLustre.g:509:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' )
                    // InternalLustre.g:510:4: otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getType_DeclarationAccess().getTypeKeyword_0_0());
                    			
                    // InternalLustre.g:514:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:515:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:515:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:516:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_14); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getType_DeclarationAccess().getNameIDENTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getType_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getType_DeclarationAccess().getSemicolonKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:538:3: (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' )
                    {
                    // InternalLustre.g:538:3: (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' )
                    // InternalLustre.g:539:4: otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getType_DeclarationAccess().getTypeKeyword_1_0());
                    			
                    // InternalLustre.g:543:4: ( (lv_name_4_0= RULE_IDENT ) )
                    // InternalLustre.g:544:5: (lv_name_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:544:5: (lv_name_4_0= RULE_IDENT )
                    // InternalLustre.g:545:6: lv_name_4_0= RULE_IDENT
                    {
                    lv_name_4_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getType_DeclarationAccess().getNameIDENTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getType_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getType_DeclarationAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalLustre.g:565:4: ( (lv_type_6_0= ruleType ) )
                    // InternalLustre.g:566:5: (lv_type_6_0= ruleType )
                    {
                    // InternalLustre.g:566:5: (lv_type_6_0= ruleType )
                    // InternalLustre.g:567:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getType_DeclarationAccess().getTypeTypeParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getType_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getType_DeclarationAccess().getSemicolonKeyword_1_4());
                    			

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
    // $ANTLR end "ruleType_Declaration"


    // $ANTLR start "entryRuleType"
    // InternalLustre.g:593:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLustre.g:593:45: (iv_ruleType= ruleType EOF )
            // InternalLustre.g:594:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalLustre.g:600:1: ruleType returns [EObject current=null] : ( (otherlv_0= RULE_IDENT ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalLustre.g:606:2: ( ( (otherlv_0= RULE_IDENT ) ) )
            // InternalLustre.g:607:2: ( (otherlv_0= RULE_IDENT ) )
            {
            // InternalLustre.g:607:2: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:608:3: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:608:3: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:609:4: otherlv_0= RULE_IDENT
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getNameType_DeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleField"
    // InternalLustre.g:623:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLustre.g:623:46: (iv_ruleField= ruleField EOF )
            // InternalLustre.g:624:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalLustre.g:630:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLustre.g:636:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) )
            // InternalLustre.g:637:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            {
            // InternalLustre.g:637:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            // InternalLustre.g:638:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) )
            {
            // InternalLustre.g:638:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:639:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:639:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:640:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalLustre.g:660:3: ( (otherlv_2= RULE_IDENT ) )
            // InternalLustre.g:661:4: (otherlv_2= RULE_IDENT )
            {
            // InternalLustre.g:661:4: (otherlv_2= RULE_IDENT )
            // InternalLustre.g:662:5: otherlv_2= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getTypeTypeCrossReference_2_0());
            				

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleConstant_Declaration"
    // InternalLustre.g:677:1: entryRuleConstant_Declaration returns [EObject current=null] : iv_ruleConstant_Declaration= ruleConstant_Declaration EOF ;
    public final EObject entryRuleConstant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant_Declaration = null;


        try {
            // InternalLustre.g:677:61: (iv_ruleConstant_Declaration= ruleConstant_Declaration EOF )
            // InternalLustre.g:678:2: iv_ruleConstant_Declaration= ruleConstant_Declaration EOF
            {
             newCompositeNode(grammarAccess.getConstant_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant_Declaration=ruleConstant_Declaration();

            state._fsp--;

             current =iv_ruleConstant_Declaration; 
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
    // $ANTLR end "entryRuleConstant_Declaration"


    // $ANTLR start "ruleConstant_Declaration"
    // InternalLustre.g:684:1: ruleConstant_Declaration returns [EObject current=null] : ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) ;
    public final EObject ruleConstant_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_type_3_0 = null;

        EObject lv_expr_8_0 = null;

        EObject lv_type_13_0 = null;

        EObject lv_expr_15_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:690:2: ( ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) )
            // InternalLustre.g:691:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            {
            // InternalLustre.g:691:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_IDENT) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==24) ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3==RULE_IDENT) ) {
                            int LA10_5 = input.LA(5);

                            if ( (LA10_5==26) ) {
                                alt10=3;
                            }
                            else if ( (LA10_5==23) ) {
                                alt10=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_2==26) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLustre.g:692:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    {
                    // InternalLustre.g:692:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    // InternalLustre.g:693:4: otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_0_0());
                    			
                    // InternalLustre.g:697:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:698:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:698:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:699:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getConstant_DeclarationAccess().getNameIDENTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_0_2());
                    			
                    // InternalLustre.g:719:4: ( (lv_type_3_0= ruleType ) )
                    // InternalLustre.g:720:5: (lv_type_3_0= ruleType )
                    {
                    // InternalLustre.g:720:5: (lv_type_3_0= ruleType )
                    // InternalLustre.g:721:6: lv_type_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:744:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    {
                    // InternalLustre.g:744:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    // InternalLustre.g:745:4: otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_1_0());
                    			
                    // InternalLustre.g:749:4: ( (lv_name_6_0= RULE_IDENT ) )
                    // InternalLustre.g:750:5: (lv_name_6_0= RULE_IDENT )
                    {
                    // InternalLustre.g:750:5: (lv_name_6_0= RULE_IDENT )
                    // InternalLustre.g:751:6: lv_name_6_0= RULE_IDENT
                    {
                    lv_name_6_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getConstant_DeclarationAccess().getNameIDENTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalLustre.g:771:4: ( (lv_expr_8_0= ruleConstantExpression ) )
                    // InternalLustre.g:772:5: (lv_expr_8_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:772:5: (lv_expr_8_0= ruleConstantExpression )
                    // InternalLustre.g:773:6: lv_expr_8_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_expr_8_0=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_8_0,
                    							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:796:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    {
                    // InternalLustre.g:796:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    // InternalLustre.g:797:4: otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_2_0());
                    			
                    // InternalLustre.g:801:4: ( (lv_name_11_0= RULE_IDENT ) )
                    // InternalLustre.g:802:5: (lv_name_11_0= RULE_IDENT )
                    {
                    // InternalLustre.g:802:5: (lv_name_11_0= RULE_IDENT )
                    // InternalLustre.g:803:6: lv_name_11_0= RULE_IDENT
                    {
                    lv_name_11_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

                    						newLeafNode(lv_name_11_0, grammarAccess.getConstant_DeclarationAccess().getNameIDENTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_11_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_2_2());
                    			
                    // InternalLustre.g:823:4: ( (lv_type_13_0= ruleType ) )
                    // InternalLustre.g:824:5: (lv_type_13_0= ruleType )
                    {
                    // InternalLustre.g:824:5: (lv_type_13_0= ruleType )
                    // InternalLustre.g:825:6: lv_type_13_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_13_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_13_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_2_4());
                    			
                    // InternalLustre.g:846:4: ( (lv_expr_15_0= ruleConstantExpression ) )
                    // InternalLustre.g:847:5: (lv_expr_15_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:847:5: (lv_expr_15_0= ruleConstantExpression )
                    // InternalLustre.g:848:6: lv_expr_15_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_expr_15_0=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConstant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_15_0,
                    							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_2_6());
                    			

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
    // $ANTLR end "ruleConstant_Declaration"


    // $ANTLR start "entryRuleVariable_Declaration"
    // InternalLustre.g:874:1: entryRuleVariable_Declaration returns [EObject current=null] : iv_ruleVariable_Declaration= ruleVariable_Declaration EOF ;
    public final EObject entryRuleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Declaration = null;


        try {
            // InternalLustre.g:874:61: (iv_ruleVariable_Declaration= ruleVariable_Declaration EOF )
            // InternalLustre.g:875:2: iv_ruleVariable_Declaration= ruleVariable_Declaration EOF
            {
             newCompositeNode(grammarAccess.getVariable_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable_Declaration=ruleVariable_Declaration();

            state._fsp--;

             current =iv_ruleVariable_Declaration; 
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
    // $ANTLR end "entryRuleVariable_Declaration"


    // $ANTLR start "ruleVariable_Declaration"
    // InternalLustre.g:881:1: ruleVariable_Declaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) ;
    public final EObject ruleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_clock_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:887:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) )
            // InternalLustre.g:888:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            {
            // InternalLustre.g:888:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            // InternalLustre.g:889:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            {
            // InternalLustre.g:889:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:890:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:890:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:891:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariable_DeclarationAccess().getNameIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariable_DeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_DeclarationAccess().getColonKeyword_1());
            		
            // InternalLustre.g:911:3: ( (lv_type_2_0= ruleType ) )
            // InternalLustre.g:912:4: (lv_type_2_0= ruleType )
            {
            // InternalLustre.g:912:4: (lv_type_2_0= ruleType )
            // InternalLustre.g:913:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariable_DeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_DeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"de.cau.cs.kieler.lustre.Lustre.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:930:3: (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLustre.g:931:4: otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariable_DeclarationAccess().getWhenKeyword_3_0());
                    			
                    // InternalLustre.g:935:4: ( (lv_clock_4_0= RULE_IDENT ) )
                    // InternalLustre.g:936:5: (lv_clock_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:936:5: (lv_clock_4_0= RULE_IDENT )
                    // InternalLustre.g:937:6: lv_clock_4_0= RULE_IDENT
                    {
                    lv_clock_4_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    						newLeafNode(lv_clock_4_0, grammarAccess.getVariable_DeclarationAccess().getClockIDENTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariable_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"clock",
                    							lv_clock_4_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

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
    // $ANTLR end "ruleVariable_Declaration"


    // $ANTLR start "entryRuleLocal_Variable_Declaration"
    // InternalLustre.g:958:1: entryRuleLocal_Variable_Declaration returns [EObject current=null] : iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF ;
    public final EObject entryRuleLocal_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Variable_Declaration = null;


        try {
            // InternalLustre.g:958:67: (iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF )
            // InternalLustre.g:959:2: iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF
            {
             newCompositeNode(grammarAccess.getLocal_Variable_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocal_Variable_Declaration=ruleLocal_Variable_Declaration();

            state._fsp--;

             current =iv_ruleLocal_Variable_Declaration; 
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
    // $ANTLR end "entryRuleLocal_Variable_Declaration"


    // $ANTLR start "ruleLocal_Variable_Declaration"
    // InternalLustre.g:965:1: ruleLocal_Variable_Declaration returns [EObject current=null] : (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' ) ;
    public final EObject ruleLocal_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Variable_Declaration_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:971:2: ( (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' ) )
            // InternalLustre.g:972:2: (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' )
            {
            // InternalLustre.g:972:2: (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' )
            // InternalLustre.g:973:3: otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocal_Variable_DeclarationAccess().getVarKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLocal_Variable_DeclarationAccess().getVariable_DeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_Variable_Declaration_1=ruleVariable_Declaration();

            state._fsp--;


            			current = this_Variable_Declaration_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLocal_Variable_DeclarationAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLocal_Variable_Declaration"


    // $ANTLR start "entryRuleLocal_Constant_Declaration"
    // InternalLustre.g:993:1: entryRuleLocal_Constant_Declaration returns [EObject current=null] : iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF ;
    public final EObject entryRuleLocal_Constant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Constant_Declaration = null;


        try {
            // InternalLustre.g:993:67: (iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF )
            // InternalLustre.g:994:2: iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF
            {
             newCompositeNode(grammarAccess.getLocal_Constant_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocal_Constant_Declaration=ruleLocal_Constant_Declaration();

            state._fsp--;

             current =iv_ruleLocal_Constant_Declaration; 
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
    // $ANTLR end "entryRuleLocal_Constant_Declaration"


    // $ANTLR start "ruleLocal_Constant_Declaration"
    // InternalLustre.g:1000:1: ruleLocal_Constant_Declaration returns [EObject current=null] : ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) ) ;
    public final EObject ruleLocal_Constant_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_expr_4_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_expr_12_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1006:2: ( ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) ) )
            // InternalLustre.g:1007:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) )
            {
            // InternalLustre.g:1007:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_IDENT) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==26) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==24) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLustre.g:1008:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' )
                    {
                    // InternalLustre.g:1008:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' )
                    // InternalLustre.g:1009:4: () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';'
                    {
                    // InternalLustre.g:1009:4: ()
                    // InternalLustre.g:1010:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLocal_Constant_DeclarationAccess().getConstant_DeclarationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocal_Constant_DeclarationAccess().getConstKeyword_0_1());
                    			
                    // InternalLustre.g:1020:4: ( (lv_name_2_0= RULE_IDENT ) )
                    // InternalLustre.g:1021:5: (lv_name_2_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1021:5: (lv_name_2_0= RULE_IDENT )
                    // InternalLustre.g:1022:6: lv_name_2_0= RULE_IDENT
                    {
                    lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getLocal_Constant_DeclarationAccess().getNameIDENTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocal_Constant_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocal_Constant_DeclarationAccess().getEqualsSignKeyword_0_3());
                    			
                    // InternalLustre.g:1042:4: ( (lv_expr_4_0= ruleConstantExpression ) )
                    // InternalLustre.g:1043:5: (lv_expr_4_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:1043:5: (lv_expr_4_0= ruleConstantExpression )
                    // InternalLustre.g:1044:6: lv_expr_4_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getExprConstantExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_expr_4_0=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocal_Constant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocal_Constant_DeclarationAccess().getSemicolonKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:1067:3: ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' )
                    {
                    // InternalLustre.g:1067:3: ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' )
                    // InternalLustre.g:1068:4: () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';'
                    {
                    // InternalLustre.g:1068:4: ()
                    // InternalLustre.g:1069:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLocal_Constant_DeclarationAccess().getConstant_DeclarationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocal_Constant_DeclarationAccess().getConstKeyword_1_1());
                    			
                    // InternalLustre.g:1079:4: ( (lv_name_8_0= RULE_IDENT ) )
                    // InternalLustre.g:1080:5: (lv_name_8_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1080:5: (lv_name_8_0= RULE_IDENT )
                    // InternalLustre.g:1081:6: lv_name_8_0= RULE_IDENT
                    {
                    lv_name_8_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getLocal_Constant_DeclarationAccess().getNameIDENTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocal_Constant_DeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocal_Constant_DeclarationAccess().getColonKeyword_1_3());
                    			
                    // InternalLustre.g:1101:4: ( (lv_type_10_0= ruleType ) )
                    // InternalLustre.g:1102:5: (lv_type_10_0= ruleType )
                    {
                    // InternalLustre.g:1102:5: (lv_type_10_0= ruleType )
                    // InternalLustre.g:1103:6: lv_type_10_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getTypeTypeParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_10_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocal_Constant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getLocal_Constant_DeclarationAccess().getEqualsSignKeyword_1_5());
                    			
                    // InternalLustre.g:1124:4: ( (lv_expr_12_0= ruleConstantExpression ) )
                    // InternalLustre.g:1125:5: (lv_expr_12_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:1125:5: (lv_expr_12_0= ruleConstantExpression )
                    // InternalLustre.g:1126:6: lv_expr_12_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_expr_12_0=ruleConstantExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocal_Constant_DeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_12_0,
                    							"de.cau.cs.kieler.lustre.Lustre.ConstantExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getLocal_Constant_DeclarationAccess().getSemicolonKeyword_1_7());
                    			

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
    // $ANTLR end "ruleLocal_Constant_Declaration"


    // $ANTLR start "entryRuleNode_Declaration"
    // InternalLustre.g:1152:1: entryRuleNode_Declaration returns [EObject current=null] : iv_ruleNode_Declaration= ruleNode_Declaration EOF ;
    public final EObject entryRuleNode_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Declaration = null;


        try {
            // InternalLustre.g:1152:57: (iv_ruleNode_Declaration= ruleNode_Declaration EOF )
            // InternalLustre.g:1153:2: iv_ruleNode_Declaration= ruleNode_Declaration EOF
            {
             newCompositeNode(grammarAccess.getNode_DeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_Declaration=ruleNode_Declaration();

            state._fsp--;

             current =iv_ruleNode_Declaration; 
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
    // $ANTLR end "entryRuleNode_Declaration"


    // $ANTLR start "ruleNode_Declaration"
    // InternalLustre.g:1159:1: ruleNode_Declaration returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) )* otherlv_19= 'tel' (otherlv_20= ';' )? ) ;
    public final EObject ruleNode_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returned_9_0 = null;

        EObject lv_returned_11_0 = null;

        EObject lv_constants_14_0 = null;

        EObject lv_variables_15_0 = null;

        EObject lv_equations_17_0 = null;

        EObject lv_assertions_18_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1165:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) )* otherlv_19= 'tel' (otherlv_20= ';' )? ) )
            // InternalLustre.g:1166:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) )* otherlv_19= 'tel' (otherlv_20= ';' )? )
            {
            // InternalLustre.g:1166:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) )* otherlv_19= 'tel' (otherlv_20= ';' )? )
            // InternalLustre.g:1167:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) )* otherlv_19= 'tel' (otherlv_20= ';' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNode_DeclarationAccess().getNodeKeyword_0());
            		
            // InternalLustre.g:1171:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:1172:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:1172:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:1173:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNode_DeclarationAccess().getNameIDENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNode_DeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNode_DeclarationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLustre.g:1193:3: ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_IDENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLustre.g:1194:4: ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )*
                    {
                    // InternalLustre.g:1194:4: ( (lv_parameters_3_0= ruleVariable_Declaration ) )
                    // InternalLustre.g:1195:5: (lv_parameters_3_0= ruleVariable_Declaration )
                    {
                    // InternalLustre.g:1195:5: (lv_parameters_3_0= ruleVariable_Declaration )
                    // InternalLustre.g:1196:6: lv_parameters_3_0= ruleVariable_Declaration
                    {

                    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getParametersVariable_DeclarationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parameters_3_0=ruleVariable_Declaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLustre.g:1213:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalLustre.g:1214:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getNode_DeclarationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLustre.g:1218:5: ( (lv_parameters_5_0= ruleVariable_Declaration ) )
                    	    // InternalLustre.g:1219:6: (lv_parameters_5_0= ruleVariable_Declaration )
                    	    {
                    	    // InternalLustre.g:1219:6: (lv_parameters_5_0= ruleVariable_Declaration )
                    	    // InternalLustre.g:1220:7: lv_parameters_5_0= ruleVariable_Declaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_DeclarationAccess().getParametersVariable_DeclarationParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parameters_5_0=ruleVariable_Declaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getNode_DeclarationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getNode_DeclarationAccess().getReturnsKeyword_5());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getNode_DeclarationAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLustre.g:1251:3: ( (lv_returned_9_0= ruleVariable_Declaration ) )
            // InternalLustre.g:1252:4: (lv_returned_9_0= ruleVariable_Declaration )
            {
            // InternalLustre.g:1252:4: (lv_returned_9_0= ruleVariable_Declaration )
            // InternalLustre.g:1253:5: lv_returned_9_0= ruleVariable_Declaration
            {

            					newCompositeNode(grammarAccess.getNode_DeclarationAccess().getReturnedVariable_DeclarationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_returned_9_0=ruleVariable_Declaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            					}
            					add(
            						current,
            						"returned",
            						lv_returned_9_0,
            						"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:1270:3: (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLustre.g:1271:4: otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getNode_DeclarationAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalLustre.g:1275:4: ( (lv_returned_11_0= ruleVariable_Declaration ) )
            	    // InternalLustre.g:1276:5: (lv_returned_11_0= ruleVariable_Declaration )
            	    {
            	    // InternalLustre.g:1276:5: (lv_returned_11_0= ruleVariable_Declaration )
            	    // InternalLustre.g:1277:6: lv_returned_11_0= ruleVariable_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getReturnedVariable_DeclarationParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_returned_11_0=ruleVariable_Declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"returned",
            	    							lv_returned_11_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Variable_Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getNode_DeclarationAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getNode_DeclarationAccess().getSemicolonKeyword_10());
            		
            // InternalLustre.g:1303:3: ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }
                else if ( (LA16_0==29) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLustre.g:1304:4: ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) )
            	    {
            	    // InternalLustre.g:1304:4: ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) )
            	    // InternalLustre.g:1305:5: (lv_constants_14_0= ruleLocal_Constant_Declaration )
            	    {
            	    // InternalLustre.g:1305:5: (lv_constants_14_0= ruleLocal_Constant_Declaration )
            	    // InternalLustre.g:1306:6: lv_constants_14_0= ruleLocal_Constant_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getConstantsLocal_Constant_DeclarationParserRuleCall_11_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_constants_14_0=ruleLocal_Constant_Declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_14_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Local_Constant_Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:1324:4: ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) )
            	    {
            	    // InternalLustre.g:1324:4: ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) )
            	    // InternalLustre.g:1325:5: (lv_variables_15_0= ruleLocal_Variable_Declaration )
            	    {
            	    // InternalLustre.g:1325:5: (lv_variables_15_0= ruleLocal_Variable_Declaration )
            	    // InternalLustre.g:1326:6: lv_variables_15_0= ruleLocal_Variable_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getVariablesLocal_Variable_DeclarationParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_variables_15_0=ruleLocal_Variable_Declaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_15_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Local_Variable_Declaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_16=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_16, grammarAccess.getNode_DeclarationAccess().getLetKeyword_12());
            		
            // InternalLustre.g:1348:3: ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_IDENT) ) {
                    alt17=1;
                }
                else if ( (LA17_0==32) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLustre.g:1349:4: ( (lv_equations_17_0= ruleEquation ) )
            	    {
            	    // InternalLustre.g:1349:4: ( (lv_equations_17_0= ruleEquation ) )
            	    // InternalLustre.g:1350:5: (lv_equations_17_0= ruleEquation )
            	    {
            	    // InternalLustre.g:1350:5: (lv_equations_17_0= ruleEquation )
            	    // InternalLustre.g:1351:6: lv_equations_17_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getEquationsEquationParserRuleCall_13_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_equations_17_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"equations",
            	    							lv_equations_17_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:1369:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    {
            	    // InternalLustre.g:1369:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    // InternalLustre.g:1370:5: (lv_assertions_18_0= ruleAssertion )
            	    {
            	    // InternalLustre.g:1370:5: (lv_assertions_18_0= ruleAssertion )
            	    // InternalLustre.g:1371:6: lv_assertions_18_0= ruleAssertion
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getAssertionsAssertionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_assertions_18_0=ruleAssertion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assertions",
            	    							lv_assertions_18_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Assertion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_19=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_19, grammarAccess.getNode_DeclarationAccess().getTelKeyword_14());
            		
            // InternalLustre.g:1393:3: (otherlv_20= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLustre.g:1394:4: otherlv_20= ';'
                    {
                    otherlv_20=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getNode_DeclarationAccess().getSemicolonKeyword_15());
                    			

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
    // $ANTLR end "ruleNode_Declaration"


    // $ANTLR start "entryRuleEquation"
    // InternalLustre.g:1403:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalLustre.g:1403:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalLustre.g:1404:2: iv_ruleEquation= ruleEquation EOF
            {
             newCompositeNode(grammarAccess.getEquationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquation=ruleEquation();

            state._fsp--;

             current =iv_ruleEquation; 
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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // InternalLustre.g:1410:1: ruleEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1416:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) )
            // InternalLustre.g:1417:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            {
            // InternalLustre.g:1417:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            // InternalLustre.g:1418:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';'
            {
            // InternalLustre.g:1418:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:1419:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:1419:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:1420:5: otherlv_0= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLeftVariable_DeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
            		
            // InternalLustre.g:1435:3: ( (lv_right_2_0= ruleRight_Part ) )
            // InternalLustre.g:1436:4: (lv_right_2_0= ruleRight_Part )
            {
            // InternalLustre.g:1436:4: (lv_right_2_0= ruleRight_Part )
            // InternalLustre.g:1437:5: lv_right_2_0= ruleRight_Part
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_right_2_0=ruleRight_Part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEquationRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"de.cau.cs.kieler.lustre.Lustre.Right_Part");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleAssertion"
    // InternalLustre.g:1462:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalLustre.g:1462:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalLustre.g:1463:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
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
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalLustre.g:1469:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1475:2: ( (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) )
            // InternalLustre.g:1476:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            {
            // InternalLustre.g:1476:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            // InternalLustre.g:1477:3: otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAssertionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAssertionAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleLeft_List"
    // InternalLustre.g:1497:1: entryRuleLeft_List returns [EObject current=null] : iv_ruleLeft_List= ruleLeft_List EOF ;
    public final EObject entryRuleLeft_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft_List = null;


        try {
            // InternalLustre.g:1497:50: (iv_ruleLeft_List= ruleLeft_List EOF )
            // InternalLustre.g:1498:2: iv_ruleLeft_List= ruleLeft_List EOF
            {
             newCompositeNode(grammarAccess.getLeft_ListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft_List=ruleLeft_List();

            state._fsp--;

             current =iv_ruleLeft_List; 
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
    // $ANTLR end "entryRuleLeft_List"


    // $ANTLR start "ruleLeft_List"
    // InternalLustre.g:1504:1: ruleLeft_List returns [EObject current=null] : ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) ;
    public final EObject ruleLeft_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1510:2: ( ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) )
            // InternalLustre.g:1511:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            {
            // InternalLustre.g:1511:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            // InternalLustre.g:1512:3: ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            {
            // InternalLustre.g:1512:3: ( (lv_id_0_0= ruleLeft ) )
            // InternalLustre.g:1513:4: (lv_id_0_0= ruleLeft )
            {
            // InternalLustre.g:1513:4: (lv_id_0_0= ruleLeft )
            // InternalLustre.g:1514:5: lv_id_0_0= ruleLeft
            {

            					newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_id_0_0=ruleLeft();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeft_ListRule());
            					}
            					add(
            						current,
            						"id",
            						lv_id_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.Left");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:1531:3: (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLustre.g:1532:4: otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLeft_ListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLustre.g:1536:4: ( (lv_id_2_0= ruleLeft ) )
            	    // InternalLustre.g:1537:5: (lv_id_2_0= ruleLeft )
            	    {
            	    // InternalLustre.g:1537:5: (lv_id_2_0= ruleLeft )
            	    // InternalLustre.g:1538:6: lv_id_2_0= ruleLeft
            	    {

            	    						newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_id_2_0=ruleLeft();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLeft_ListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"id",
            	    							lv_id_2_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Left");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleLeft_List"


    // $ANTLR start "entryRuleLeft"
    // InternalLustre.g:1560:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLustre.g:1560:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLustre.g:1561:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalLustre.g:1567:1: ruleLeft returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1573:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) )
            // InternalLustre.g:1574:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            {
            // InternalLustre.g:1574:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            // InternalLustre.g:1575:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )?
            {
            // InternalLustre.g:1575:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:1576:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:1576:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:1577:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLeftAccess().getNameIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            // InternalLustre.g:1593:3: ( (lv_selector_1_0= ruleSelector ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=33 && LA20_0<=34)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLustre.g:1594:4: (lv_selector_1_0= ruleSelector )
                    {
                    // InternalLustre.g:1594:4: (lv_selector_1_0= ruleSelector )
                    // InternalLustre.g:1595:5: lv_selector_1_0= ruleSelector
                    {

                    					newCompositeNode(grammarAccess.getLeftAccess().getSelectorSelectorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_selector_1_0=ruleSelector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLeftRule());
                    					}
                    					set(
                    						current,
                    						"selector",
                    						lv_selector_1_0,
                    						"de.cau.cs.kieler.lustre.Lustre.Selector");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleSelector"
    // InternalLustre.g:1616:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalLustre.g:1616:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalLustre.g:1617:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalLustre.g:1623:1: ruleSelector returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_begin_3_0 = null;

        EObject lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1629:2: ( ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) )
            // InternalLustre.g:1630:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            {
            // InternalLustre.g:1630:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==34) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLustre.g:1631:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:1631:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // InternalLustre.g:1632:4: otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getFullStopKeyword_0_0());
                    			
                    // InternalLustre.g:1636:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:1637:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1637:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:1638:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSelectorAccess().getNameIDENTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:1656:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    {
                    // InternalLustre.g:1656:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    // InternalLustre.g:1657:4: otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalLustre.g:1661:4: ( (lv_begin_3_0= ruleExpression ) )
                    // InternalLustre.g:1662:5: (lv_begin_3_0= ruleExpression )
                    {
                    // InternalLustre.g:1662:5: (lv_begin_3_0= ruleExpression )
                    // InternalLustre.g:1663:6: lv_begin_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getBeginExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_begin_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectorRule());
                    						}
                    						set(
                    							current,
                    							"begin",
                    							lv_begin_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLustre.g:1680:4: ( (lv_end_4_0= ruleSelTrancheEnd ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalLustre.g:1681:5: (lv_end_4_0= ruleSelTrancheEnd )
                            {
                            // InternalLustre.g:1681:5: (lv_end_4_0= ruleSelTrancheEnd )
                            // InternalLustre.g:1682:6: lv_end_4_0= ruleSelTrancheEnd
                            {

                            						newCompositeNode(grammarAccess.getSelectorAccess().getEndSelTrancheEndParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_26);
                            lv_end_4_0=ruleSelTrancheEnd();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSelectorRule());
                            						}
                            						set(
                            							current,
                            							"end",
                            							lv_end_4_0,
                            							"de.cau.cs.kieler.lustre.Lustre.SelTrancheEnd");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectorAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleSelTrancheEnd"
    // InternalLustre.g:1708:1: entryRuleSelTrancheEnd returns [EObject current=null] : iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF ;
    public final EObject entryRuleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelTrancheEnd = null;


        try {
            // InternalLustre.g:1708:54: (iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF )
            // InternalLustre.g:1709:2: iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF
            {
             newCompositeNode(grammarAccess.getSelTrancheEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelTrancheEnd=ruleSelTrancheEnd();

            state._fsp--;

             current =iv_ruleSelTrancheEnd; 
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
    // $ANTLR end "entryRuleSelTrancheEnd"


    // $ANTLR start "ruleSelTrancheEnd"
    // InternalLustre.g:1715:1: ruleSelTrancheEnd returns [EObject current=null] : (otherlv_0= '..' this_Expression_1= ruleExpression ) ;
    public final EObject ruleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1721:2: ( (otherlv_0= '..' this_Expression_1= ruleExpression ) )
            // InternalLustre.g:1722:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            {
            // InternalLustre.g:1722:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            // InternalLustre.g:1723:3: otherlv_0= '..' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSelTrancheEndAccess().getFullStopFullStopKeyword_0());
            		

            			newCompositeNode(grammarAccess.getSelTrancheEndAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleSelTrancheEnd"


    // $ANTLR start "entryRuleRight_Part"
    // InternalLustre.g:1739:1: entryRuleRight_Part returns [EObject current=null] : iv_ruleRight_Part= ruleRight_Part EOF ;
    public final EObject entryRuleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight_Part = null;


        try {
            // InternalLustre.g:1739:51: (iv_ruleRight_Part= ruleRight_Part EOF )
            // InternalLustre.g:1740:2: iv_ruleRight_Part= ruleRight_Part EOF
            {
             newCompositeNode(grammarAccess.getRight_PartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight_Part=ruleRight_Part();

            state._fsp--;

             current =iv_ruleRight_Part; 
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
    // $ANTLR end "entryRuleRight_Part"


    // $ANTLR start "ruleRight_Part"
    // InternalLustre.g:1746:1: ruleRight_Part returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1752:2: (this_Expression_0= ruleExpression )
            // InternalLustre.g:1753:2: this_Expression_0= ruleExpression
            {

            		newCompositeNode(grammarAccess.getRight_PartAccess().getExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;


            		current = this_Expression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRight_Part"


    // $ANTLR start "entryRuleExpression"
    // InternalLustre.g:1764:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLustre.g:1764:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLustre.g:1765:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLustre.g:1771:1: ruleExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ifexpr_2_0 = null;

        EObject lv_thenexpr_4_0 = null;

        EObject lv_elseexpr_6_0 = null;

        EObject this_Fby_7 = null;



        	enterRule();

        try {
            // InternalLustre.g:1777:2: ( ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) )
            // InternalLustre.g:1778:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            {
            // InternalLustre.g:1778:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=RULE_IDENT && LA23_0<=RULE_INT)||LA23_0==20||LA23_0==50||(LA23_0>=53 && LA23_0<=55)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLustre.g:1779:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    {
                    // InternalLustre.g:1779:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    // InternalLustre.g:1780:4: () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) )
                    {
                    // InternalLustre.g:1780:4: ()
                    // InternalLustre.g:1781:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getIfThenElseAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_0_1());
                    			
                    // InternalLustre.g:1791:4: ( (lv_ifexpr_2_0= ruleExpression ) )
                    // InternalLustre.g:1792:5: (lv_ifexpr_2_0= ruleExpression )
                    {
                    // InternalLustre.g:1792:5: (lv_ifexpr_2_0= ruleExpression )
                    // InternalLustre.g:1793:6: lv_ifexpr_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getIfexprExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_ifexpr_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"ifexpr",
                    							lv_ifexpr_2_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_0_3());
                    			
                    // InternalLustre.g:1814:4: ( (lv_thenexpr_4_0= ruleExpression ) )
                    // InternalLustre.g:1815:5: (lv_thenexpr_4_0= ruleExpression )
                    {
                    // InternalLustre.g:1815:5: (lv_thenexpr_4_0= ruleExpression )
                    // InternalLustre.g:1816:6: lv_thenexpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getThenexprExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_thenexpr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"thenexpr",
                    							lv_thenexpr_4_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseKeyword_0_5());
                    			
                    // InternalLustre.g:1837:4: ( (lv_elseexpr_6_0= ruleExpression ) )
                    // InternalLustre.g:1838:5: (lv_elseexpr_6_0= ruleExpression )
                    {
                    // InternalLustre.g:1838:5: (lv_elseexpr_6_0= ruleExpression )
                    // InternalLustre.g:1839:6: lv_elseexpr_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getElseexprExpressionParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseexpr_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"elseexpr",
                    							lv_elseexpr_6_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:1858:3: this_Fby_7= ruleFby
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFbyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fby_7=ruleFby();

                    state._fsp--;


                    			current = this_Fby_7;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFby"
    // InternalLustre.g:1870:1: entryRuleFby returns [EObject current=null] : iv_ruleFby= ruleFby EOF ;
    public final EObject entryRuleFby() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFby = null;


        try {
            // InternalLustre.g:1870:44: (iv_ruleFby= ruleFby EOF )
            // InternalLustre.g:1871:2: iv_ruleFby= ruleFby EOF
            {
             newCompositeNode(grammarAccess.getFbyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFby=ruleFby();

            state._fsp--;

             current =iv_ruleFby; 
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
    // $ANTLR end "entryRuleFby"


    // $ANTLR start "ruleFby"
    // InternalLustre.g:1877:1: ruleFby returns [EObject current=null] : (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) ;
    public final EObject ruleFby() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Arrow_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1883:2: ( (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) )
            // InternalLustre.g:1884:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            {
            // InternalLustre.g:1884:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            // InternalLustre.g:1885:3: this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getFbyAccess().getArrowParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Arrow_0=ruleArrow();

            state._fsp--;


            			current = this_Arrow_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1893:3: ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLustre.g:1894:4: () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    {
                    // InternalLustre.g:1894:4: ()
                    // InternalLustre.g:1895:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getFbyAccess().getFbySubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:1901:4: (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==40) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalLustre.g:1902:5: otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    {
                    	    otherlv_2=(Token)match(input,40,FOLLOW_22); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getFbyAccess().getFbyKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:1906:5: ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    // InternalLustre.g:1907:6: (lv_subExpressions_3_0= ruleArrow )
                    	    {
                    	    // InternalLustre.g:1907:6: (lv_subExpressions_3_0= ruleArrow )
                    	    // InternalLustre.g:1908:7: lv_subExpressions_3_0= ruleArrow
                    	    {

                    	    							newCompositeNode(grammarAccess.getFbyAccess().getSubExpressionsArrowParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_subExpressions_3_0=ruleArrow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFbyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subExpressions",
                    	    								lv_subExpressions_3_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.Arrow");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
    // $ANTLR end "ruleFby"


    // $ANTLR start "entryRuleArrow"
    // InternalLustre.g:1931:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalLustre.g:1931:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalLustre.g:1932:2: iv_ruleArrow= ruleArrow EOF
            {
             newCompositeNode(grammarAccess.getArrowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrow=ruleArrow();

            state._fsp--;

             current =iv_ruleArrow; 
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
    // $ANTLR end "entryRuleArrow"


    // $ANTLR start "ruleArrow"
    // InternalLustre.g:1938:1: ruleArrow returns [EObject current=null] : (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1944:2: ( (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) )
            // InternalLustre.g:1945:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            {
            // InternalLustre.g:1945:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            // InternalLustre.g:1946:3: this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getArrowAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1954:3: ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalLustre.g:1955:4: () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    {
                    // InternalLustre.g:1955:4: ()
                    // InternalLustre.g:1956:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getArrowAccess().getArrowSubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:1962:4: (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==41) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalLustre.g:1963:5: otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) )
                    	    {
                    	    otherlv_2=(Token)match(input,41,FOLLOW_22); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:1967:5: ( (lv_subExpressions_3_0= ruleOr ) )
                    	    // InternalLustre.g:1968:6: (lv_subExpressions_3_0= ruleOr )
                    	    {
                    	    // InternalLustre.g:1968:6: (lv_subExpressions_3_0= ruleOr )
                    	    // InternalLustre.g:1969:7: lv_subExpressions_3_0= ruleOr
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrowAccess().getSubExpressionsOrParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_subExpressions_3_0=ruleOr();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subExpressions",
                    	    								lv_subExpressions_3_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.Or");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
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
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleOr"
    // InternalLustre.g:1992:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLustre.g:1992:43: (iv_ruleOr= ruleOr EOF )
            // InternalLustre.g:1993:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLustre.g:1999:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2005:2: ( (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) )
            // InternalLustre.g:2006:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            {
            // InternalLustre.g:2006:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            // InternalLustre.g:2007:3: this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2015:3: ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLustre.g:2016:4: () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    {
                    // InternalLustre.g:2016:4: ()
                    // InternalLustre.g:2017:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getOrAccess().getOrSubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2023:4: (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==42) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalLustre.g:2024:5: otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_22); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:2028:5: ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    // InternalLustre.g:2029:6: (lv_subExpressions_3_0= ruleAnd )
                    	    {
                    	    // InternalLustre.g:2029:6: (lv_subExpressions_3_0= ruleAnd )
                    	    // InternalLustre.g:2030:7: lv_subExpressions_3_0= ruleAnd
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrAccess().getSubExpressionsAndParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    lv_subExpressions_3_0=ruleAnd();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subExpressions",
                    	    								lv_subExpressions_3_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.And");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalLustre.g:2053:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLustre.g:2053:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLustre.g:2054:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLustre.g:2060:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2066:2: ( (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) )
            // InternalLustre.g:2067:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            {
            // InternalLustre.g:2067:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            // InternalLustre.g:2068:3: this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2076:3: ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalLustre.g:2077:4: () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    {
                    // InternalLustre.g:2077:4: ()
                    // InternalLustre.g:2078:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getAndAccess().getAndSubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2084:4: (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==43) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalLustre.g:2085:5: otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_22); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:2089:5: ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    // InternalLustre.g:2090:6: (lv_subExpressions_3_0= ruleEquality )
                    	    {
                    	    // InternalLustre.g:2090:6: (lv_subExpressions_3_0= ruleEquality )
                    	    // InternalLustre.g:2091:7: lv_subExpressions_3_0= ruleEquality
                    	    {

                    	    							newCompositeNode(grammarAccess.getAndAccess().getSubExpressionsEqualityParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_subExpressions_3_0=ruleEquality();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAndRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subExpressions",
                    	    								lv_subExpressions_3_0,
                    	    								"de.cau.cs.kieler.lustre.Lustre.Equality");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalLustre.g:2114:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalLustre.g:2114:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalLustre.g:2115:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalLustre.g:2121:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2127:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalLustre.g:2128:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalLustre.g:2128:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalLustre.g:2129:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2137:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26||LA33_0==44) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalLustre.g:2138:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalLustre.g:2138:4: ()
            	    // InternalLustre.g:2139:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalLustre.g:2145:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalLustre.g:2146:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalLustre.g:2146:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalLustre.g:2147:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalLustre.g:2147:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==26) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==44) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalLustre.g:2148:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2159:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalLustre.g:2172:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalLustre.g:2173:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalLustre.g:2173:5: (lv_right_3_0= ruleComparison )
            	    // InternalLustre.g:2174:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalLustre.g:2196:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalLustre.g:2196:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalLustre.g:2197:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalLustre.g:2203:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2209:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalLustre.g:2210:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalLustre.g:2210:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalLustre.g:2211:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2219:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=45 && LA35_0<=48)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLustre.g:2220:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalLustre.g:2220:4: ()
            	    // InternalLustre.g:2221:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalLustre.g:2227:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalLustre.g:2228:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalLustre.g:2228:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalLustre.g:2229:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalLustre.g:2229:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case 45:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt34=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt34) {
            	        case 1 :
            	            // InternalLustre.g:2230:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,45,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2241:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,46,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalLustre.g:2252:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,47,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalLustre.g:2263:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,48,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalLustre.g:2276:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalLustre.g:2277:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalLustre.g:2277:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalLustre.g:2278:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalLustre.g:2300:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalLustre.g:2300:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalLustre.g:2301:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalLustre.g:2307:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2313:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalLustre.g:2314:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalLustre.g:2314:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            // InternalLustre.g:2315:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2323:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=49 && LA37_0<=50)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalLustre.g:2324:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalLustre.g:2324:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==49) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==50) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalLustre.g:2325:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalLustre.g:2325:5: ( () otherlv_2= '+' )
            	            // InternalLustre.g:2326:6: () otherlv_2= '+'
            	            {
            	            // InternalLustre.g:2326:6: ()
            	            // InternalLustre.g:2327:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusSubExpressionsAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,49,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2339:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalLustre.g:2339:5: ( () otherlv_4= '-' )
            	            // InternalLustre.g:2340:6: () otherlv_4= '-'
            	            {
            	            // InternalLustre.g:2340:6: ()
            	            // InternalLustre.g:2341:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusSubExpressionsAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,50,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2353:4: ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    // InternalLustre.g:2354:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    {
            	    // InternalLustre.g:2354:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    // InternalLustre.g:2355:6: lv_subExpressions_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getSubExpressionsMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_subExpressions_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subExpressions",
            	    							lv_subExpressions_5_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalLustre.g:2377:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalLustre.g:2377:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalLustre.g:2378:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalLustre.g:2384:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2390:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) )
            // InternalLustre.g:2391:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            {
            // InternalLustre.g:2391:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            // InternalLustre.g:2392:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2400:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=51 && LA39_0<=52)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLustre.g:2401:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) )
            	    {
            	    // InternalLustre.g:2401:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==51) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==52) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalLustre.g:2402:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalLustre.g:2402:5: ( () otherlv_2= '*' )
            	            // InternalLustre.g:2403:6: () otherlv_2= '*'
            	            {
            	            // InternalLustre.g:2403:6: ()
            	            // InternalLustre.g:2404:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getMulOrDivAccess().getMulSubExpressionsAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2416:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalLustre.g:2416:5: ( () otherlv_4= '/' )
            	            // InternalLustre.g:2417:6: () otherlv_4= '/'
            	            {
            	            // InternalLustre.g:2417:6: ()
            	            // InternalLustre.g:2418:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getMulOrDivAccess().getDivSubExpressionsAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2430:4: ( (lv_subExpressions_5_0= rulePrimary ) )
            	    // InternalLustre.g:2431:5: (lv_subExpressions_5_0= rulePrimary )
            	    {
            	    // InternalLustre.g:2431:5: (lv_subExpressions_5_0= rulePrimary )
            	    // InternalLustre.g:2432:6: lv_subExpressions_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getSubExpressionsPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_subExpressions_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subExpressions",
            	    							lv_subExpressions_5_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalLustre.g:2454:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLustre.g:2454:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLustre.g:2455:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalLustre.g:2461:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_11_0 = null;

        EObject lv_expression_14_0 = null;

        EObject this_AtomicExpression_15 = null;



        	enterRule();

        try {
            // InternalLustre.g:2467:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) )
            // InternalLustre.g:2468:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            {
            // InternalLustre.g:2468:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt40=1;
                }
                break;
            case 53:
                {
                alt40=2;
                }
                break;
            case 50:
                {
                alt40=3;
                }
                break;
            case 54:
                {
                alt40=4;
                }
                break;
            case 55:
                {
                alt40=5;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalLustre.g:2469:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalLustre.g:2469:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalLustre.g:2470:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2488:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2488:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalLustre.g:2489:4: () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2489:4: ()
                    // InternalLustre.g:2490:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
                    			
                    // InternalLustre.g:2500:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalLustre.g:2501:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalLustre.g:2501:5: (lv_expression_5_0= rulePrimary )
                    // InternalLustre.g:2502:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:2521:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2521:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalLustre.g:2522:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2522:4: ()
                    // InternalLustre.g:2523:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUMinusAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,50,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalLustre.g:2533:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalLustre.g:2534:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalLustre.g:2534:5: (lv_expression_8_0= rulePrimary )
                    // InternalLustre.g:2535:6: lv_expression_8_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLustre.g:2554:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2554:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    // InternalLustre.g:2555:4: () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2555:4: ()
                    // InternalLustre.g:2556:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getPreAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,54,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getPreKeyword_3_1());
                    			
                    // InternalLustre.g:2566:4: ( (lv_expression_11_0= rulePrimary ) )
                    // InternalLustre.g:2567:5: (lv_expression_11_0= rulePrimary )
                    {
                    // InternalLustre.g:2567:5: (lv_expression_11_0= rulePrimary )
                    // InternalLustre.g:2568:6: lv_expression_11_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_11_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_11_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLustre.g:2587:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2587:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    // InternalLustre.g:2588:4: () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2588:4: ()
                    // InternalLustre.g:2589:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getCurrentAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,55,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCurrentKeyword_4_1());
                    			
                    // InternalLustre.g:2599:4: ( (lv_expression_14_0= rulePrimary ) )
                    // InternalLustre.g:2600:5: (lv_expression_14_0= rulePrimary )
                    {
                    // InternalLustre.g:2600:5: (lv_expression_14_0= rulePrimary )
                    // InternalLustre.g:2601:6: lv_expression_14_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_14_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_14_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLustre.g:2620:3: this_AtomicExpression_15= ruleAtomicExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicExpressionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicExpression_15=ruleAtomicExpression();

                    state._fsp--;


                    			current = this_AtomicExpression_15;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalLustre.g:2632:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalLustre.g:2632:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalLustre.g:2633:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;

             current =iv_ruleAtomicExpression; 
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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalLustre.g:2639:1: ruleAtomicExpression returns [EObject current=null] : (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantExpression_0 = null;

        EObject this_VariableReference_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:2645:2: ( (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) )
            // InternalLustre.g:2646:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            {
            // InternalLustre.g:2646:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_BOOL && LA41_0<=RULE_INT)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_IDENT) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalLustre.g:2647:3: this_ConstantExpression_0= ruleConstantExpression
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getConstantExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;


                    			current = this_ConstantExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLustre.g:2656:3: this_VariableReference_1= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getVariableReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_1;
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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleVariableReference"
    // InternalLustre.g:2668:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalLustre.g:2668:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalLustre.g:2669:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalLustre.g:2675:1: ruleVariableReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_IDENT ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLustre.g:2681:2: ( ( () ( (otherlv_1= RULE_IDENT ) ) ) )
            // InternalLustre.g:2682:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            {
            // InternalLustre.g:2682:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            // InternalLustre.g:2683:3: () ( (otherlv_1= RULE_IDENT ) )
            {
            // InternalLustre.g:2683:3: ()
            // InternalLustre.g:2684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableReferenceAccess().getVariableReferenceAction_0(),
            					current);
            			

            }

            // InternalLustre.g:2690:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:2691:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:2691:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:2692:5: otherlv_1= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableReferenceAccess().getValueVariable_DeclarationCrossReference_1_0());
            				

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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalLustre.g:2707:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalLustre.g:2707:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalLustre.g:2708:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression; 
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
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // InternalLustre.g:2714:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalLustre.g:2720:2: ( ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalLustre.g:2721:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalLustre.g:2721:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt42=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt42=2;
                }
                break;
            case RULE_INT:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalLustre.g:2722:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    {
                    // InternalLustre.g:2722:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    // InternalLustre.g:2723:4: () ( (lv_value_1_0= RULE_BOOL ) )
                    {
                    // InternalLustre.g:2723:4: ()
                    // InternalLustre.g:2724:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2730:4: ( (lv_value_1_0= RULE_BOOL ) )
                    // InternalLustre.g:2731:5: (lv_value_1_0= RULE_BOOL )
                    {
                    // InternalLustre.g:2731:5: (lv_value_1_0= RULE_BOOL )
                    // InternalLustre.g:2732:6: lv_value_1_0= RULE_BOOL
                    {
                    lv_value_1_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConstantExpressionAccess().getValueBOOLTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"de.cau.cs.kieler.lustre.Lustre.BOOL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2750:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalLustre.g:2750:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalLustre.g:2751:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalLustre.g:2751:4: ()
                    // InternalLustre.g:2752:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getFloatConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2758:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalLustre.g:2759:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalLustre.g:2759:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalLustre.g:2760:6: lv_value_3_0= RULE_FLOAT
                    {
                    lv_value_3_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getConstantExpressionAccess().getValueFLOATTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.FLOAT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:2778:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalLustre.g:2778:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalLustre.g:2779:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalLustre.g:2779:4: ()
                    // InternalLustre.g:2780:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getIntConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2786:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalLustre.g:2787:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalLustre.g:2787:5: (lv_value_5_0= RULE_INT )
                    // InternalLustre.g:2788:6: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getConstantExpressionAccess().getValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstantExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.cau.cs.kieler.lustre.Lustre.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleConstantExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000A0C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000068000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00E40020001000F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100004000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000200000L});

}