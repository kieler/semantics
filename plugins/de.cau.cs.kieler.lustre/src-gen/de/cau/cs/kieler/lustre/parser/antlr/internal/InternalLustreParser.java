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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_BOOL", "RULE_FLOAT", "RULE_INT", "RULE_STRING_CONSTANT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_LUSTRE_COMMENT", "RULE_WS", "'node'", "'('", "','", "')'", "'returns'", "';'", "':'", "'type'", "'='", "'const'", "'when'", "'var'", "'let'", "'tel'", "'assert'", "'automaton'", "'|'", "'end'", "'->'", "'until'", "'unless'", "'then'", "'continue'", "'.'", "'['", "']'", "'..'", "'if'", "'else'", "'fby'", "'or'", "'and'", "'<>'", "'>='", "'<='", "'>'", "'<'", "'mod'", "'+'", "'-'", "'*'", "'/'", "'not'", "'pre'", "'current'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
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
    // InternalLustre.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_nodes_0_0= ruleNode_Declaration ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_nodes_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:83:2: ( ( (lv_nodes_0_0= ruleNode_Declaration ) )+ )
            // InternalLustre.g:84:2: ( (lv_nodes_0_0= ruleNode_Declaration ) )+
            {
            // InternalLustre.g:84:2: ( (lv_nodes_0_0= ruleNode_Declaration ) )+
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
            	    // InternalLustre.g:85:3: (lv_nodes_0_0= ruleNode_Declaration )
            	    {
            	    // InternalLustre.g:85:3: (lv_nodes_0_0= ruleNode_Declaration )
            	    // InternalLustre.g:86:4: lv_nodes_0_0= ruleNode_Declaration
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getNodesNode_DeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_nodes_0_0=ruleNode_Declaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"nodes",
            	    					lv_nodes_0_0,
            	    					"de.cau.cs.kieler.lustre.Lustre.Node_Declaration");
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


    // $ANTLR start "entryRulePackage_Provided"
    // InternalLustre.g:109:1: entryRulePackage_Provided returns [EObject current=null] : iv_rulePackage_Provided= rulePackage_Provided EOF ;
    public final EObject entryRulePackage_Provided() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided = null;


        try {
            // InternalLustre.g:109:57: (iv_rulePackage_Provided= rulePackage_Provided EOF )
            // InternalLustre.g:110:2: iv_rulePackage_Provided= rulePackage_Provided EOF
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
    // InternalLustre.g:116:1: rulePackage_Provided returns [EObject current=null] : (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' ) ;
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
            // InternalLustre.g:122:2: ( (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' ) )
            // InternalLustre.g:123:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' )
            {
            // InternalLustre.g:123:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';' )
            // InternalLustre.g:124:3: otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= rulePackage_Provided_IO ) ) (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )* otherlv_12= ')' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackage_ProvidedAccess().getNodeKeyword_0());
            		
            // InternalLustre.g:128:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:129:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:129:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:130:5: otherlv_1= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_ProvidedRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getPackage_ProvidedAccess().getNameNode_DeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackage_ProvidedAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLustre.g:145:3: ( ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLustre.g:146:4: ( (lv_parameters_3_0= rulePackage_Provided_IO ) ) (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )*
                    {
                    // InternalLustre.g:146:4: ( (lv_parameters_3_0= rulePackage_Provided_IO ) )
                    // InternalLustre.g:147:5: (lv_parameters_3_0= rulePackage_Provided_IO )
                    {
                    // InternalLustre.g:147:5: (lv_parameters_3_0= rulePackage_Provided_IO )
                    // InternalLustre.g:148:6: lv_parameters_3_0= rulePackage_Provided_IO
                    {

                    						newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getParametersPackage_Provided_IOParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalLustre.g:165:4: (otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLustre.g:166:5: otherlv_4= ',' ( (lv_parameters_5_0= rulePackage_Provided_IO ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPackage_ProvidedAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLustre.g:170:5: ( (lv_parameters_5_0= rulePackage_Provided_IO ) )
                    	    // InternalLustre.g:171:6: (lv_parameters_5_0= rulePackage_Provided_IO )
                    	    {
                    	    // InternalLustre.g:171:6: (lv_parameters_5_0= rulePackage_Provided_IO )
                    	    // InternalLustre.g:172:7: lv_parameters_5_0= rulePackage_Provided_IO
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getParametersPackage_Provided_IOParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPackage_ProvidedAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getPackage_ProvidedAccess().getReturnsKeyword_5());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getPackage_ProvidedAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLustre.g:203:3: ( (lv_returned_9_0= rulePackage_Provided_IO ) )
            // InternalLustre.g:204:4: (lv_returned_9_0= rulePackage_Provided_IO )
            {
            // InternalLustre.g:204:4: (lv_returned_9_0= rulePackage_Provided_IO )
            // InternalLustre.g:205:5: lv_returned_9_0= rulePackage_Provided_IO
            {

            					newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getReturnedPackage_Provided_IOParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalLustre.g:222:3: (otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLustre.g:223:4: otherlv_10= ',' ( (lv_returned_11_0= rulePackage_Provided_IO ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getPackage_ProvidedAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalLustre.g:227:4: ( (lv_returned_11_0= rulePackage_Provided_IO ) )
            	    // InternalLustre.g:228:5: (lv_returned_11_0= rulePackage_Provided_IO )
            	    {
            	    // InternalLustre.g:228:5: (lv_returned_11_0= rulePackage_Provided_IO )
            	    // InternalLustre.g:229:6: lv_returned_11_0= rulePackage_Provided_IO
            	    {

            	    						newCompositeNode(grammarAccess.getPackage_ProvidedAccess().getReturnedPackage_Provided_IOParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getPackage_ProvidedAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLustre.g:259:1: entryRulePackage_Provided_IO returns [EObject current=null] : iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF ;
    public final EObject entryRulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provided_IO = null;


        try {
            // InternalLustre.g:259:60: (iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF )
            // InternalLustre.g:260:2: iv_rulePackage_Provided_IO= rulePackage_Provided_IO EOF
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
    // InternalLustre.g:266:1: rulePackage_Provided_IO returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) ;
    public final EObject rulePackage_Provided_IO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalLustre.g:272:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) ) )
            // InternalLustre.g:273:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            {
            // InternalLustre.g:273:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) ) )
            // InternalLustre.g:274:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= RULE_IDENT ) )
            {
            // InternalLustre.g:274:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:275:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:275:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:276:5: otherlv_0= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_Provided_IORule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getPackage_Provided_IOAccess().getNameVariable_DeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage_Provided_IOAccess().getColonKeyword_1());
            		
            // InternalLustre.g:291:3: ( (lv_type_2_0= RULE_IDENT ) )
            // InternalLustre.g:292:4: (lv_type_2_0= RULE_IDENT )
            {
            // InternalLustre.g:292:4: (lv_type_2_0= RULE_IDENT )
            // InternalLustre.g:293:5: lv_type_2_0= RULE_IDENT
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
    // InternalLustre.g:313:1: entryRuleType_Declaration returns [EObject current=null] : iv_ruleType_Declaration= ruleType_Declaration EOF ;
    public final EObject entryRuleType_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Declaration = null;


        try {
            // InternalLustre.g:313:57: (iv_ruleType_Declaration= ruleType_Declaration EOF )
            // InternalLustre.g:314:2: iv_ruleType_Declaration= ruleType_Declaration EOF
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
    // InternalLustre.g:320:1: ruleType_Declaration returns [EObject current=null] : ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) ) ;
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
            // InternalLustre.g:326:2: ( ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) ) )
            // InternalLustre.g:327:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) )
            {
            // InternalLustre.g:327:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' ) | (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_IDENT) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==18) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==21) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLustre.g:328:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' )
                    {
                    // InternalLustre.g:328:3: (otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';' )
                    // InternalLustre.g:329:4: otherlv_0= 'type' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getType_DeclarationAccess().getTypeKeyword_0_0());
                    			
                    // InternalLustre.g:333:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:334:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:334:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:335:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_9); 

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

                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getType_DeclarationAccess().getSemicolonKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:357:3: (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' )
                    {
                    // InternalLustre.g:357:3: (otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';' )
                    // InternalLustre.g:358:4: otherlv_3= 'type' ( (lv_name_4_0= RULE_IDENT ) ) otherlv_5= '=' ( (lv_type_6_0= ruleType ) ) otherlv_7= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getType_DeclarationAccess().getTypeKeyword_1_0());
                    			
                    // InternalLustre.g:362:4: ( (lv_name_4_0= RULE_IDENT ) )
                    // InternalLustre.g:363:5: (lv_name_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:363:5: (lv_name_4_0= RULE_IDENT )
                    // InternalLustre.g:364:6: lv_name_4_0= RULE_IDENT
                    {
                    lv_name_4_0=(Token)match(input,RULE_IDENT,FOLLOW_11); 

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

                    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getType_DeclarationAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalLustre.g:384:4: ( (lv_type_6_0= ruleType ) )
                    // InternalLustre.g:385:5: (lv_type_6_0= ruleType )
                    {
                    // InternalLustre.g:385:5: (lv_type_6_0= ruleType )
                    // InternalLustre.g:386:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getType_DeclarationAccess().getTypeTypeParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_7=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLustre.g:412:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLustre.g:412:45: (iv_ruleType= ruleType EOF )
            // InternalLustre.g:413:2: iv_ruleType= ruleType EOF
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
    // InternalLustre.g:419:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENT ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLustre.g:425:2: ( ( (lv_name_0_0= RULE_IDENT ) ) )
            // InternalLustre.g:426:2: ( (lv_name_0_0= RULE_IDENT ) )
            {
            // InternalLustre.g:426:2: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:427:3: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:427:3: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:428:4: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"de.cau.cs.kieler.lustre.Lustre.IDENT");
            			

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
    // InternalLustre.g:447:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLustre.g:447:46: (iv_ruleField= ruleField EOF )
            // InternalLustre.g:448:2: iv_ruleField= ruleField EOF
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
    // InternalLustre.g:454:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLustre.g:460:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) ) )
            // InternalLustre.g:461:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            {
            // InternalLustre.g:461:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) ) )
            // InternalLustre.g:462:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (otherlv_2= RULE_IDENT ) )
            {
            // InternalLustre.g:462:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:463:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:463:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:464:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalLustre.g:484:3: ( (otherlv_2= RULE_IDENT ) )
            // InternalLustre.g:485:4: (otherlv_2= RULE_IDENT )
            {
            // InternalLustre.g:485:4: (otherlv_2= RULE_IDENT )
            // InternalLustre.g:486:5: otherlv_2= RULE_IDENT
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
    // InternalLustre.g:501:1: entryRuleConstant_Declaration returns [EObject current=null] : iv_ruleConstant_Declaration= ruleConstant_Declaration EOF ;
    public final EObject entryRuleConstant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant_Declaration = null;


        try {
            // InternalLustre.g:501:61: (iv_ruleConstant_Declaration= ruleConstant_Declaration EOF )
            // InternalLustre.g:502:2: iv_ruleConstant_Declaration= ruleConstant_Declaration EOF
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
    // InternalLustre.g:508:1: ruleConstant_Declaration returns [EObject current=null] : ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) ;
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
            // InternalLustre.g:514:2: ( ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) ) )
            // InternalLustre.g:515:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            {
            // InternalLustre.g:515:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' ) | (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' ) | (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_IDENT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==21) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==19) ) {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==RULE_IDENT) ) {
                            int LA6_5 = input.LA(5);

                            if ( (LA6_5==21) ) {
                                alt6=3;
                            }
                            else if ( (LA6_5==18) ) {
                                alt6=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLustre.g:516:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    {
                    // InternalLustre.g:516:3: (otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';' )
                    // InternalLustre.g:517:4: otherlv_0= 'const' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_0_0());
                    			
                    // InternalLustre.g:521:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:522:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:522:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:523:6: lv_name_1_0= RULE_IDENT
                    {
                    lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

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

                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_0_2());
                    			
                    // InternalLustre.g:543:4: ( (lv_type_3_0= ruleType ) )
                    // InternalLustre.g:544:5: (lv_type_3_0= ruleType )
                    {
                    // InternalLustre.g:544:5: (lv_type_3_0= ruleType )
                    // InternalLustre.g:545:6: lv_type_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_4=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:568:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    {
                    // InternalLustre.g:568:3: (otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';' )
                    // InternalLustre.g:569:4: otherlv_5= 'const' ( (lv_name_6_0= RULE_IDENT ) ) otherlv_7= '=' ( (lv_expr_8_0= ruleConstantExpression ) ) otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_1_0());
                    			
                    // InternalLustre.g:573:4: ( (lv_name_6_0= RULE_IDENT ) )
                    // InternalLustre.g:574:5: (lv_name_6_0= RULE_IDENT )
                    {
                    // InternalLustre.g:574:5: (lv_name_6_0= RULE_IDENT )
                    // InternalLustre.g:575:6: lv_name_6_0= RULE_IDENT
                    {
                    lv_name_6_0=(Token)match(input,RULE_IDENT,FOLLOW_11); 

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

                    otherlv_7=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalLustre.g:595:4: ( (lv_expr_8_0= ruleConstantExpression ) )
                    // InternalLustre.g:596:5: (lv_expr_8_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:596:5: (lv_expr_8_0= ruleConstantExpression )
                    // InternalLustre.g:597:6: lv_expr_8_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstant_DeclarationAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLustre.g:620:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    {
                    // InternalLustre.g:620:3: (otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';' )
                    // InternalLustre.g:621:4: otherlv_10= 'const' ( (lv_name_11_0= RULE_IDENT ) ) otherlv_12= ':' ( (lv_type_13_0= ruleType ) ) otherlv_14= '=' ( (lv_expr_15_0= ruleConstantExpression ) ) otherlv_16= ';'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstant_DeclarationAccess().getConstKeyword_2_0());
                    			
                    // InternalLustre.g:625:4: ( (lv_name_11_0= RULE_IDENT ) )
                    // InternalLustre.g:626:5: (lv_name_11_0= RULE_IDENT )
                    {
                    // InternalLustre.g:626:5: (lv_name_11_0= RULE_IDENT )
                    // InternalLustre.g:627:6: lv_name_11_0= RULE_IDENT
                    {
                    lv_name_11_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

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

                    otherlv_12=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getConstant_DeclarationAccess().getColonKeyword_2_2());
                    			
                    // InternalLustre.g:647:4: ( (lv_type_13_0= ruleType ) )
                    // InternalLustre.g:648:5: (lv_type_13_0= ruleType )
                    {
                    // InternalLustre.g:648:5: (lv_type_13_0= ruleType )
                    // InternalLustre.g:649:6: lv_type_13_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getTypeTypeParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_14=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getConstant_DeclarationAccess().getEqualsSignKeyword_2_4());
                    			
                    // InternalLustre.g:670:4: ( (lv_expr_15_0= ruleConstantExpression ) )
                    // InternalLustre.g:671:5: (lv_expr_15_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:671:5: (lv_expr_15_0= ruleConstantExpression )
                    // InternalLustre.g:672:6: lv_expr_15_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getConstant_DeclarationAccess().getExprConstantExpressionParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_16=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLustre.g:698:1: entryRuleVariable_Declaration returns [EObject current=null] : iv_ruleVariable_Declaration= ruleVariable_Declaration EOF ;
    public final EObject entryRuleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable_Declaration = null;


        try {
            // InternalLustre.g:698:61: (iv_ruleVariable_Declaration= ruleVariable_Declaration EOF )
            // InternalLustre.g:699:2: iv_ruleVariable_Declaration= ruleVariable_Declaration EOF
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
    // InternalLustre.g:705:1: ruleVariable_Declaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) ;
    public final EObject ruleVariable_Declaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_clock_4_0=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:711:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? ) )
            // InternalLustre.g:712:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            {
            // InternalLustre.g:712:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )? )
            // InternalLustre.g:713:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            {
            // InternalLustre.g:713:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:714:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:714:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:715:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_DeclarationAccess().getColonKeyword_1());
            		
            // InternalLustre.g:735:3: ( (lv_type_2_0= ruleType ) )
            // InternalLustre.g:736:4: (lv_type_2_0= ruleType )
            {
            // InternalLustre.g:736:4: (lv_type_2_0= ruleType )
            // InternalLustre.g:737:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariable_DeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalLustre.g:754:3: (otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLustre.g:755:4: otherlv_3= 'when' ( (lv_clock_4_0= RULE_IDENT ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariable_DeclarationAccess().getWhenKeyword_3_0());
                    			
                    // InternalLustre.g:759:4: ( (lv_clock_4_0= RULE_IDENT ) )
                    // InternalLustre.g:760:5: (lv_clock_4_0= RULE_IDENT )
                    {
                    // InternalLustre.g:760:5: (lv_clock_4_0= RULE_IDENT )
                    // InternalLustre.g:761:6: lv_clock_4_0= RULE_IDENT
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
    // InternalLustre.g:782:1: entryRuleLocal_Variable_Declaration returns [EObject current=null] : iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF ;
    public final EObject entryRuleLocal_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Variable_Declaration = null;


        try {
            // InternalLustre.g:782:67: (iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF )
            // InternalLustre.g:783:2: iv_ruleLocal_Variable_Declaration= ruleLocal_Variable_Declaration EOF
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
    // InternalLustre.g:789:1: ruleLocal_Variable_Declaration returns [EObject current=null] : (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' ) ;
    public final EObject ruleLocal_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Variable_Declaration_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:795:2: ( (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' ) )
            // InternalLustre.g:796:2: (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' )
            {
            // InternalLustre.g:796:2: (otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';' )
            // InternalLustre.g:797:3: otherlv_0= 'var' this_Variable_Declaration_1= ruleVariable_Declaration otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocal_Variable_DeclarationAccess().getVarKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLocal_Variable_DeclarationAccess().getVariable_DeclarationParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Variable_Declaration_1=ruleVariable_Declaration();

            state._fsp--;


            			current = this_Variable_Declaration_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLustre.g:817:1: entryRuleLocal_Constant_Declaration returns [EObject current=null] : iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF ;
    public final EObject entryRuleLocal_Constant_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Constant_Declaration = null;


        try {
            // InternalLustre.g:817:67: (iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF )
            // InternalLustre.g:818:2: iv_ruleLocal_Constant_Declaration= ruleLocal_Constant_Declaration EOF
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
    // InternalLustre.g:824:1: ruleLocal_Constant_Declaration returns [EObject current=null] : ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) ) ;
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
            // InternalLustre.g:830:2: ( ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) ) )
            // InternalLustre.g:831:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) )
            {
            // InternalLustre.g:831:2: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' ) | ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_IDENT) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==21) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==19) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLustre.g:832:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' )
                    {
                    // InternalLustre.g:832:3: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';' )
                    // InternalLustre.g:833:4: () otherlv_1= 'const' ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleConstantExpression ) ) otherlv_5= ';'
                    {
                    // InternalLustre.g:833:4: ()
                    // InternalLustre.g:834:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLocal_Constant_DeclarationAccess().getConstant_DeclarationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getLocal_Constant_DeclarationAccess().getConstKeyword_0_1());
                    			
                    // InternalLustre.g:844:4: ( (lv_name_2_0= RULE_IDENT ) )
                    // InternalLustre.g:845:5: (lv_name_2_0= RULE_IDENT )
                    {
                    // InternalLustre.g:845:5: (lv_name_2_0= RULE_IDENT )
                    // InternalLustre.g:846:6: lv_name_2_0= RULE_IDENT
                    {
                    lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_11); 

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

                    otherlv_3=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocal_Constant_DeclarationAccess().getEqualsSignKeyword_0_3());
                    			
                    // InternalLustre.g:866:4: ( (lv_expr_4_0= ruleConstantExpression ) )
                    // InternalLustre.g:867:5: (lv_expr_4_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:867:5: (lv_expr_4_0= ruleConstantExpression )
                    // InternalLustre.g:868:6: lv_expr_4_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getExprConstantExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocal_Constant_DeclarationAccess().getSemicolonKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:891:3: ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' )
                    {
                    // InternalLustre.g:891:3: ( () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';' )
                    // InternalLustre.g:892:4: () otherlv_7= 'const' ( (lv_name_8_0= RULE_IDENT ) ) otherlv_9= ':' ( (lv_type_10_0= ruleType ) ) otherlv_11= '=' ( (lv_expr_12_0= ruleConstantExpression ) ) otherlv_13= ';'
                    {
                    // InternalLustre.g:892:4: ()
                    // InternalLustre.g:893:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLocal_Constant_DeclarationAccess().getConstant_DeclarationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocal_Constant_DeclarationAccess().getConstKeyword_1_1());
                    			
                    // InternalLustre.g:903:4: ( (lv_name_8_0= RULE_IDENT ) )
                    // InternalLustre.g:904:5: (lv_name_8_0= RULE_IDENT )
                    {
                    // InternalLustre.g:904:5: (lv_name_8_0= RULE_IDENT )
                    // InternalLustre.g:905:6: lv_name_8_0= RULE_IDENT
                    {
                    lv_name_8_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

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

                    otherlv_9=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocal_Constant_DeclarationAccess().getColonKeyword_1_3());
                    			
                    // InternalLustre.g:925:4: ( (lv_type_10_0= ruleType ) )
                    // InternalLustre.g:926:5: (lv_type_10_0= ruleType )
                    {
                    // InternalLustre.g:926:5: (lv_type_10_0= ruleType )
                    // InternalLustre.g:927:6: lv_type_10_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getTypeTypeParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_11=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getLocal_Constant_DeclarationAccess().getEqualsSignKeyword_1_5());
                    			
                    // InternalLustre.g:948:4: ( (lv_expr_12_0= ruleConstantExpression ) )
                    // InternalLustre.g:949:5: (lv_expr_12_0= ruleConstantExpression )
                    {
                    // InternalLustre.g:949:5: (lv_expr_12_0= ruleConstantExpression )
                    // InternalLustre.g:950:6: lv_expr_12_0= ruleConstantExpression
                    {

                    						newCompositeNode(grammarAccess.getLocal_Constant_DeclarationAccess().getExprConstantExpressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_13=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLustre.g:976:1: entryRuleNode_Declaration returns [EObject current=null] : iv_ruleNode_Declaration= ruleNode_Declaration EOF ;
    public final EObject entryRuleNode_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Declaration = null;


        try {
            // InternalLustre.g:976:57: (iv_ruleNode_Declaration= ruleNode_Declaration EOF )
            // InternalLustre.g:977:2: iv_ruleNode_Declaration= ruleNode_Declaration EOF
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
    // InternalLustre.g:983:1: ruleNode_Declaration returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_returned_9_0 = null;

        EObject lv_returned_11_0 = null;

        EObject lv_constants_14_0 = null;

        EObject lv_variables_15_0 = null;

        EObject lv_equations_17_0 = null;

        EObject lv_assertions_18_0 = null;

        EObject lv_automatons_19_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:989:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? ) )
            // InternalLustre.g:990:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? )
            {
            // InternalLustre.g:990:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )? )
            // InternalLustre.g:991:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )? otherlv_6= ')' otherlv_7= 'returns' otherlv_8= '(' ( (lv_returned_9_0= ruleVariable_Declaration ) ) (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )* otherlv_12= ')' otherlv_13= ';' ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )* otherlv_16= 'let' ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )* otherlv_20= 'tel' (otherlv_21= ';' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNode_DeclarationAccess().getNodeKeyword_0());
            		
            // InternalLustre.g:995:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:996:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:996:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:997:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNode_DeclarationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLustre.g:1017:3: ( ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLustre.g:1018:4: ( (lv_parameters_3_0= ruleVariable_Declaration ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )*
                    {
                    // InternalLustre.g:1018:4: ( (lv_parameters_3_0= ruleVariable_Declaration ) )
                    // InternalLustre.g:1019:5: (lv_parameters_3_0= ruleVariable_Declaration )
                    {
                    // InternalLustre.g:1019:5: (lv_parameters_3_0= ruleVariable_Declaration )
                    // InternalLustre.g:1020:6: lv_parameters_3_0= ruleVariable_Declaration
                    {

                    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getParametersVariable_DeclarationParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalLustre.g:1037:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLustre.g:1038:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable_Declaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getNode_DeclarationAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLustre.g:1042:5: ( (lv_parameters_5_0= ruleVariable_Declaration ) )
                    	    // InternalLustre.g:1043:6: (lv_parameters_5_0= ruleVariable_Declaration )
                    	    {
                    	    // InternalLustre.g:1043:6: (lv_parameters_5_0= ruleVariable_Declaration )
                    	    // InternalLustre.g:1044:7: lv_parameters_5_0= ruleVariable_Declaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getNode_DeclarationAccess().getParametersVariable_DeclarationParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getNode_DeclarationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getNode_DeclarationAccess().getReturnsKeyword_5());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getNode_DeclarationAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLustre.g:1075:3: ( (lv_returned_9_0= ruleVariable_Declaration ) )
            // InternalLustre.g:1076:4: (lv_returned_9_0= ruleVariable_Declaration )
            {
            // InternalLustre.g:1076:4: (lv_returned_9_0= ruleVariable_Declaration )
            // InternalLustre.g:1077:5: lv_returned_9_0= ruleVariable_Declaration
            {

            					newCompositeNode(grammarAccess.getNode_DeclarationAccess().getReturnedVariable_DeclarationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalLustre.g:1094:3: (otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLustre.g:1095:4: otherlv_10= ',' ( (lv_returned_11_0= ruleVariable_Declaration ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getNode_DeclarationAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalLustre.g:1099:4: ( (lv_returned_11_0= ruleVariable_Declaration ) )
            	    // InternalLustre.g:1100:5: (lv_returned_11_0= ruleVariable_Declaration )
            	    {
            	    // InternalLustre.g:1100:5: (lv_returned_11_0= ruleVariable_Declaration )
            	    // InternalLustre.g:1101:6: lv_returned_11_0= ruleVariable_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getReturnedVariable_DeclarationParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop11;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getNode_DeclarationAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getNode_DeclarationAccess().getSemicolonKeyword_10());
            		
            // InternalLustre.g:1127:3: ( ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) ) | ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }
                else if ( (LA12_0==24) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLustre.g:1128:4: ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) )
            	    {
            	    // InternalLustre.g:1128:4: ( (lv_constants_14_0= ruleLocal_Constant_Declaration ) )
            	    // InternalLustre.g:1129:5: (lv_constants_14_0= ruleLocal_Constant_Declaration )
            	    {
            	    // InternalLustre.g:1129:5: (lv_constants_14_0= ruleLocal_Constant_Declaration )
            	    // InternalLustre.g:1130:6: lv_constants_14_0= ruleLocal_Constant_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getConstantsLocal_Constant_DeclarationParserRuleCall_11_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    // InternalLustre.g:1148:4: ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) )
            	    {
            	    // InternalLustre.g:1148:4: ( (lv_variables_15_0= ruleLocal_Variable_Declaration ) )
            	    // InternalLustre.g:1149:5: (lv_variables_15_0= ruleLocal_Variable_Declaration )
            	    {
            	    // InternalLustre.g:1149:5: (lv_variables_15_0= ruleLocal_Variable_Declaration )
            	    // InternalLustre.g:1150:6: lv_variables_15_0= ruleLocal_Variable_Declaration
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getVariablesLocal_Variable_DeclarationParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop12;
                }
            } while (true);

            otherlv_16=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getNode_DeclarationAccess().getLetKeyword_12());
            		
            // InternalLustre.g:1172:3: ( ( (lv_equations_17_0= ruleEquation ) ) | ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_automatons_19_0= ruleAutomaton ) ) )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                    {
                    alt13=1;
                    }
                    break;
                case 27:
                    {
                    alt13=2;
                    }
                    break;
                case 28:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalLustre.g:1173:4: ( (lv_equations_17_0= ruleEquation ) )
            	    {
            	    // InternalLustre.g:1173:4: ( (lv_equations_17_0= ruleEquation ) )
            	    // InternalLustre.g:1174:5: (lv_equations_17_0= ruleEquation )
            	    {
            	    // InternalLustre.g:1174:5: (lv_equations_17_0= ruleEquation )
            	    // InternalLustre.g:1175:6: lv_equations_17_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getEquationsEquationParserRuleCall_13_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    // InternalLustre.g:1193:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    {
            	    // InternalLustre.g:1193:4: ( (lv_assertions_18_0= ruleAssertion ) )
            	    // InternalLustre.g:1194:5: (lv_assertions_18_0= ruleAssertion )
            	    {
            	    // InternalLustre.g:1194:5: (lv_assertions_18_0= ruleAssertion )
            	    // InternalLustre.g:1195:6: lv_assertions_18_0= ruleAssertion
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getAssertionsAssertionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	case 3 :
            	    // InternalLustre.g:1213:4: ( (lv_automatons_19_0= ruleAutomaton ) )
            	    {
            	    // InternalLustre.g:1213:4: ( (lv_automatons_19_0= ruleAutomaton ) )
            	    // InternalLustre.g:1214:5: (lv_automatons_19_0= ruleAutomaton )
            	    {
            	    // InternalLustre.g:1214:5: (lv_automatons_19_0= ruleAutomaton )
            	    // InternalLustre.g:1215:6: lv_automatons_19_0= ruleAutomaton
            	    {

            	    						newCompositeNode(grammarAccess.getNode_DeclarationAccess().getAutomatonsAutomatonParserRuleCall_13_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_automatons_19_0=ruleAutomaton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNode_DeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"automatons",
            	    							lv_automatons_19_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Automaton");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_20=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getNode_DeclarationAccess().getTelKeyword_14());
            		
            // InternalLustre.g:1237:3: (otherlv_21= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLustre.g:1238:4: otherlv_21= ';'
                    {
                    otherlv_21=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getNode_DeclarationAccess().getSemicolonKeyword_15());
                    			

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
    // InternalLustre.g:1247:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalLustre.g:1247:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalLustre.g:1248:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalLustre.g:1254:1: ruleEquation returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1260:2: ( ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) )
            // InternalLustre.g:1261:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            {
            // InternalLustre.g:1261:2: ( ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            // InternalLustre.g:1262:3: ( (otherlv_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';'
            {
            // InternalLustre.g:1262:3: ( (otherlv_0= RULE_IDENT ) )
            // InternalLustre.g:1263:4: (otherlv_0= RULE_IDENT )
            {
            // InternalLustre.g:1263:4: (otherlv_0= RULE_IDENT )
            // InternalLustre.g:1264:5: otherlv_0= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_IDENT,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getEquationAccess().getLeftVariable_DeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
            		
            // InternalLustre.g:1279:3: ( (lv_right_2_0= ruleRight_Part ) )
            // InternalLustre.g:1280:4: (lv_right_2_0= ruleRight_Part )
            {
            // InternalLustre.g:1280:4: (lv_right_2_0= ruleRight_Part )
            // InternalLustre.g:1281:5: lv_right_2_0= ruleRight_Part
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

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
    // InternalLustre.g:1306:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalLustre.g:1306:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalLustre.g:1307:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalLustre.g:1313:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1319:2: ( (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) )
            // InternalLustre.g:1320:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            {
            // InternalLustre.g:1320:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            // InternalLustre.g:1321:3: otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAssertionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAutomaton"
    // InternalLustre.g:1341:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // InternalLustre.g:1341:50: (iv_ruleAutomaton= ruleAutomaton EOF )
            // InternalLustre.g:1342:2: iv_ruleAutomaton= ruleAutomaton EOF
            {
             newCompositeNode(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomaton=ruleAutomaton();

            state._fsp--;

             current =iv_ruleAutomaton; 
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
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalLustre.g:1348:1: ruleAutomaton returns [EObject current=null] : (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' ) ;
    public final EObject ruleAutomaton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_states_1_0 = null;

        EObject lv_states_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1354:2: ( (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' ) )
            // InternalLustre.g:1355:2: (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' )
            {
            // InternalLustre.g:1355:2: (otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';' )
            // InternalLustre.g:1356:3: otherlv_0= 'automaton' ( (lv_states_1_0= ruleAState ) ) (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )* otherlv_4= 'end' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomatonAccess().getAutomatonKeyword_0());
            		
            // InternalLustre.g:1360:3: ( (lv_states_1_0= ruleAState ) )
            // InternalLustre.g:1361:4: (lv_states_1_0= ruleAState )
            {
            // InternalLustre.g:1361:4: (lv_states_1_0= ruleAState )
            // InternalLustre.g:1362:5: lv_states_1_0= ruleAState
            {

            					newCompositeNode(grammarAccess.getAutomatonAccess().getStatesAStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_states_1_0=ruleAState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomatonRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.AState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:1379:3: (otherlv_2= '|' ( (lv_states_3_0= ruleAState ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLustre.g:1380:4: otherlv_2= '|' ( (lv_states_3_0= ruleAState ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAutomatonAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalLustre.g:1384:4: ( (lv_states_3_0= ruleAState ) )
            	    // InternalLustre.g:1385:5: (lv_states_3_0= ruleAState )
            	    {
            	    // InternalLustre.g:1385:5: (lv_states_3_0= ruleAState )
            	    // InternalLustre.g:1386:6: lv_states_3_0= ruleAState
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getStatesAStateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_states_3_0=ruleAState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.AState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAutomatonAccess().getEndKeyword_3());
            		
            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAutomatonAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleAState"
    // InternalLustre.g:1416:1: entryRuleAState returns [EObject current=null] : iv_ruleAState= ruleAState EOF ;
    public final EObject entryRuleAState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAState = null;


        try {
            // InternalLustre.g:1416:47: (iv_ruleAState= ruleAState EOF )
            // InternalLustre.g:1417:2: iv_ruleAState= ruleAState EOF
            {
             newCompositeNode(grammarAccess.getAStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAState=ruleAState();

            state._fsp--;

             current =iv_ruleAState; 
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
    // $ANTLR end "entryRuleAState"


    // $ANTLR start "ruleAState"
    // InternalLustre.g:1423:1: ruleAState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ ) ;
    public final EObject ruleAState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_equations_2_0 = null;

        EObject lv_assertions_3_0 = null;

        EObject lv_automatons_4_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1429:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ ) )
            // InternalLustre.g:1430:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ )
            {
            // InternalLustre.g:1430:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+ )
            // InternalLustre.g:1431:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= '->' ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )* ( (lv_transitions_5_0= ruleATransition ) )+
            {
            // InternalLustre.g:1431:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:1432:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:1432:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:1433:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAStateAccess().getNameIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAStateAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalLustre.g:1453:3: ( ( (lv_equations_2_0= ruleEquation ) ) | ( (lv_assertions_3_0= ruleAssertion ) ) | ( (lv_automatons_4_0= ruleAutomaton ) ) )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case RULE_IDENT:
                    {
                    alt16=1;
                    }
                    break;
                case 27:
                    {
                    alt16=2;
                    }
                    break;
                case 28:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalLustre.g:1454:4: ( (lv_equations_2_0= ruleEquation ) )
            	    {
            	    // InternalLustre.g:1454:4: ( (lv_equations_2_0= ruleEquation ) )
            	    // InternalLustre.g:1455:5: (lv_equations_2_0= ruleEquation )
            	    {
            	    // InternalLustre.g:1455:5: (lv_equations_2_0= ruleEquation )
            	    // InternalLustre.g:1456:6: lv_equations_2_0= ruleEquation
            	    {

            	    						newCompositeNode(grammarAccess.getAStateAccess().getEquationsEquationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_equations_2_0=ruleEquation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"equations",
            	    							lv_equations_2_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Equation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLustre.g:1474:4: ( (lv_assertions_3_0= ruleAssertion ) )
            	    {
            	    // InternalLustre.g:1474:4: ( (lv_assertions_3_0= ruleAssertion ) )
            	    // InternalLustre.g:1475:5: (lv_assertions_3_0= ruleAssertion )
            	    {
            	    // InternalLustre.g:1475:5: (lv_assertions_3_0= ruleAssertion )
            	    // InternalLustre.g:1476:6: lv_assertions_3_0= ruleAssertion
            	    {

            	    						newCompositeNode(grammarAccess.getAStateAccess().getAssertionsAssertionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_assertions_3_0=ruleAssertion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assertions",
            	    							lv_assertions_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Assertion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLustre.g:1494:4: ( (lv_automatons_4_0= ruleAutomaton ) )
            	    {
            	    // InternalLustre.g:1494:4: ( (lv_automatons_4_0= ruleAutomaton ) )
            	    // InternalLustre.g:1495:5: (lv_automatons_4_0= ruleAutomaton )
            	    {
            	    // InternalLustre.g:1495:5: (lv_automatons_4_0= ruleAutomaton )
            	    // InternalLustre.g:1496:6: lv_automatons_4_0= ruleAutomaton
            	    {

            	    						newCompositeNode(grammarAccess.getAStateAccess().getAutomatonsAutomatonParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_automatons_4_0=ruleAutomaton();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"automatons",
            	    							lv_automatons_4_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Automaton");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalLustre.g:1514:3: ( (lv_transitions_5_0= ruleATransition ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLustre.g:1515:4: (lv_transitions_5_0= ruleATransition )
            	    {
            	    // InternalLustre.g:1515:4: (lv_transitions_5_0= ruleATransition )
            	    // InternalLustre.g:1516:5: lv_transitions_5_0= ruleATransition
            	    {

            	    					newCompositeNode(grammarAccess.getAStateAccess().getTransitionsATransitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_transitions_5_0=ruleATransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_5_0,
            	    						"de.cau.cs.kieler.lustre.Lustre.ATransition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // $ANTLR end "ruleAState"


    // $ANTLR start "entryRuleATransition"
    // InternalLustre.g:1537:1: entryRuleATransition returns [EObject current=null] : iv_ruleATransition= ruleATransition EOF ;
    public final EObject entryRuleATransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATransition = null;


        try {
            // InternalLustre.g:1537:52: (iv_ruleATransition= ruleATransition EOF )
            // InternalLustre.g:1538:2: iv_ruleATransition= ruleATransition EOF
            {
             newCompositeNode(grammarAccess.getATransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleATransition=ruleATransition();

            state._fsp--;

             current =iv_ruleATransition; 
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
    // $ANTLR end "entryRuleATransition"


    // $ANTLR start "ruleATransition"
    // InternalLustre.g:1544:1: ruleATransition returns [EObject current=null] : ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' ) ;
    public final EObject ruleATransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_strong_1_0=null;
        Token otherlv_3=null;
        Token lv_history_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1550:2: ( ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' ) )
            // InternalLustre.g:1551:2: ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' )
            {
            // InternalLustre.g:1551:2: ( (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';' )
            // InternalLustre.g:1552:3: (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) ) ( (lv_condition_2_0= ruleExpression ) ) (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) ) ( (otherlv_5= RULE_IDENT ) ) otherlv_6= ';'
            {
            // InternalLustre.g:1552:3: (otherlv_0= 'until' | ( (lv_strong_1_0= 'unless' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLustre.g:1553:4: otherlv_0= 'until'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getATransitionAccess().getUntilKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLustre.g:1558:4: ( (lv_strong_1_0= 'unless' ) )
                    {
                    // InternalLustre.g:1558:4: ( (lv_strong_1_0= 'unless' ) )
                    // InternalLustre.g:1559:5: (lv_strong_1_0= 'unless' )
                    {
                    // InternalLustre.g:1559:5: (lv_strong_1_0= 'unless' )
                    // InternalLustre.g:1560:6: lv_strong_1_0= 'unless'
                    {
                    lv_strong_1_0=(Token)match(input,33,FOLLOW_17); 

                    						newLeafNode(lv_strong_1_0, grammarAccess.getATransitionAccess().getStrongUnlessKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getATransitionRule());
                    						}
                    						setWithLastConsumed(current, "strong", true, "unless");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:1573:3: ( (lv_condition_2_0= ruleExpression ) )
            // InternalLustre.g:1574:4: (lv_condition_2_0= ruleExpression )
            {
            // InternalLustre.g:1574:4: (lv_condition_2_0= ruleExpression )
            // InternalLustre.g:1575:5: lv_condition_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getATransitionAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_condition_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getATransitionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"de.cau.cs.kieler.lustre.Lustre.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:1592:3: (otherlv_3= 'then' | ( (lv_history_4_0= 'continue' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLustre.g:1593:4: otherlv_3= 'then'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getATransitionAccess().getThenKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLustre.g:1598:4: ( (lv_history_4_0= 'continue' ) )
                    {
                    // InternalLustre.g:1598:4: ( (lv_history_4_0= 'continue' ) )
                    // InternalLustre.g:1599:5: (lv_history_4_0= 'continue' )
                    {
                    // InternalLustre.g:1599:5: (lv_history_4_0= 'continue' )
                    // InternalLustre.g:1600:6: lv_history_4_0= 'continue'
                    {
                    lv_history_4_0=(Token)match(input,35,FOLLOW_4); 

                    						newLeafNode(lv_history_4_0, grammarAccess.getATransitionAccess().getHistoryContinueKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getATransitionRule());
                    						}
                    						setWithLastConsumed(current, "history", true, "continue");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:1613:3: ( (otherlv_5= RULE_IDENT ) )
            // InternalLustre.g:1614:4: (otherlv_5= RULE_IDENT )
            {
            // InternalLustre.g:1614:4: (otherlv_5= RULE_IDENT )
            // InternalLustre.g:1615:5: otherlv_5= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getATransitionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_IDENT,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getATransitionAccess().getNextStateAStateCrossReference_3_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getATransitionAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleATransition"


    // $ANTLR start "entryRuleLeft_List"
    // InternalLustre.g:1634:1: entryRuleLeft_List returns [EObject current=null] : iv_ruleLeft_List= ruleLeft_List EOF ;
    public final EObject entryRuleLeft_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft_List = null;


        try {
            // InternalLustre.g:1634:50: (iv_ruleLeft_List= ruleLeft_List EOF )
            // InternalLustre.g:1635:2: iv_ruleLeft_List= ruleLeft_List EOF
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
    // InternalLustre.g:1641:1: ruleLeft_List returns [EObject current=null] : ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) ;
    public final EObject ruleLeft_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1647:2: ( ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) )
            // InternalLustre.g:1648:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            {
            // InternalLustre.g:1648:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            // InternalLustre.g:1649:3: ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            {
            // InternalLustre.g:1649:3: ( (lv_id_0_0= ruleLeft ) )
            // InternalLustre.g:1650:4: (lv_id_0_0= ruleLeft )
            {
            // InternalLustre.g:1650:4: (lv_id_0_0= ruleLeft )
            // InternalLustre.g:1651:5: lv_id_0_0= ruleLeft
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

            // InternalLustre.g:1668:3: (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLustre.g:1669:4: otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLeft_ListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLustre.g:1673:4: ( (lv_id_2_0= ruleLeft ) )
            	    // InternalLustre.g:1674:5: (lv_id_2_0= ruleLeft )
            	    {
            	    // InternalLustre.g:1674:5: (lv_id_2_0= ruleLeft )
            	    // InternalLustre.g:1675:6: lv_id_2_0= ruleLeft
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
            	    break loop20;
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
    // InternalLustre.g:1697:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLustre.g:1697:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLustre.g:1698:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalLustre.g:1704:1: ruleLeft returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_selector_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1710:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? ) )
            // InternalLustre.g:1711:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            {
            // InternalLustre.g:1711:2: ( ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )? )
            // InternalLustre.g:1712:3: ( (lv_name_0_0= RULE_IDENT ) ) ( (lv_selector_1_0= ruleSelector ) )?
            {
            // InternalLustre.g:1712:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:1713:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:1713:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:1714:5: lv_name_0_0= RULE_IDENT
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

            // InternalLustre.g:1730:3: ( (lv_selector_1_0= ruleSelector ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=36 && LA21_0<=37)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLustre.g:1731:4: (lv_selector_1_0= ruleSelector )
                    {
                    // InternalLustre.g:1731:4: (lv_selector_1_0= ruleSelector )
                    // InternalLustre.g:1732:5: lv_selector_1_0= ruleSelector
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
    // InternalLustre.g:1753:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalLustre.g:1753:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalLustre.g:1754:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalLustre.g:1760:1: ruleSelector returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) ;
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
            // InternalLustre.g:1766:2: ( ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) )
            // InternalLustre.g:1767:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            {
            // InternalLustre.g:1767:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLustre.g:1768:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:1768:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // InternalLustre.g:1769:4: otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getFullStopKeyword_0_0());
                    			
                    // InternalLustre.g:1773:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:1774:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1774:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:1775:6: lv_name_1_0= RULE_IDENT
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
                    // InternalLustre.g:1793:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    {
                    // InternalLustre.g:1793:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    // InternalLustre.g:1794:4: otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalLustre.g:1798:4: ( (lv_begin_3_0= ruleExpression ) )
                    // InternalLustre.g:1799:5: (lv_begin_3_0= ruleExpression )
                    {
                    // InternalLustre.g:1799:5: (lv_begin_3_0= ruleExpression )
                    // InternalLustre.g:1800:6: lv_begin_3_0= ruleExpression
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

                    // InternalLustre.g:1817:4: ( (lv_end_4_0= ruleSelTrancheEnd ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==39) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalLustre.g:1818:5: (lv_end_4_0= ruleSelTrancheEnd )
                            {
                            // InternalLustre.g:1818:5: (lv_end_4_0= ruleSelTrancheEnd )
                            // InternalLustre.g:1819:6: lv_end_4_0= ruleSelTrancheEnd
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

                    otherlv_5=(Token)match(input,38,FOLLOW_2); 

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
    // InternalLustre.g:1845:1: entryRuleSelTrancheEnd returns [EObject current=null] : iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF ;
    public final EObject entryRuleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelTrancheEnd = null;


        try {
            // InternalLustre.g:1845:54: (iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF )
            // InternalLustre.g:1846:2: iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF
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
    // InternalLustre.g:1852:1: ruleSelTrancheEnd returns [EObject current=null] : (otherlv_0= '..' this_Expression_1= ruleExpression ) ;
    public final EObject ruleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1858:2: ( (otherlv_0= '..' this_Expression_1= ruleExpression ) )
            // InternalLustre.g:1859:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            {
            // InternalLustre.g:1859:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            // InternalLustre.g:1860:3: otherlv_0= '..' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,39,FOLLOW_17); 

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
    // InternalLustre.g:1876:1: entryRuleRight_Part returns [EObject current=null] : iv_ruleRight_Part= ruleRight_Part EOF ;
    public final EObject entryRuleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight_Part = null;


        try {
            // InternalLustre.g:1876:51: (iv_ruleRight_Part= ruleRight_Part EOF )
            // InternalLustre.g:1877:2: iv_ruleRight_Part= ruleRight_Part EOF
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
    // InternalLustre.g:1883:1: ruleRight_Part returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1889:2: (this_Expression_0= ruleExpression )
            // InternalLustre.g:1890:2: this_Expression_0= ruleExpression
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
    // InternalLustre.g:1901:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLustre.g:1901:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLustre.g:1902:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLustre.g:1908:1: ruleExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) ;
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
            // InternalLustre.g:1914:2: ( ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) )
            // InternalLustre.g:1915:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            {
            // InternalLustre.g:1915:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_IDENT && LA24_0<=RULE_INT)||LA24_0==14||LA24_0==52||(LA24_0>=55 && LA24_0<=57)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalLustre.g:1916:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    {
                    // InternalLustre.g:1916:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    // InternalLustre.g:1917:4: () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) )
                    {
                    // InternalLustre.g:1917:4: ()
                    // InternalLustre.g:1918:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getIfThenElseAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_0_1());
                    			
                    // InternalLustre.g:1928:4: ( (lv_ifexpr_2_0= ruleExpression ) )
                    // InternalLustre.g:1929:5: (lv_ifexpr_2_0= ruleExpression )
                    {
                    // InternalLustre.g:1929:5: (lv_ifexpr_2_0= ruleExpression )
                    // InternalLustre.g:1930:6: lv_ifexpr_2_0= ruleExpression
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

                    otherlv_3=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_0_3());
                    			
                    // InternalLustre.g:1951:4: ( (lv_thenexpr_4_0= ruleExpression ) )
                    // InternalLustre.g:1952:5: (lv_thenexpr_4_0= ruleExpression )
                    {
                    // InternalLustre.g:1952:5: (lv_thenexpr_4_0= ruleExpression )
                    // InternalLustre.g:1953:6: lv_thenexpr_4_0= ruleExpression
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

                    otherlv_5=(Token)match(input,41,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseKeyword_0_5());
                    			
                    // InternalLustre.g:1974:4: ( (lv_elseexpr_6_0= ruleExpression ) )
                    // InternalLustre.g:1975:5: (lv_elseexpr_6_0= ruleExpression )
                    {
                    // InternalLustre.g:1975:5: (lv_elseexpr_6_0= ruleExpression )
                    // InternalLustre.g:1976:6: lv_elseexpr_6_0= ruleExpression
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
                    // InternalLustre.g:1995:3: this_Fby_7= ruleFby
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
    // InternalLustre.g:2007:1: entryRuleFby returns [EObject current=null] : iv_ruleFby= ruleFby EOF ;
    public final EObject entryRuleFby() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFby = null;


        try {
            // InternalLustre.g:2007:44: (iv_ruleFby= ruleFby EOF )
            // InternalLustre.g:2008:2: iv_ruleFby= ruleFby EOF
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
    // InternalLustre.g:2014:1: ruleFby returns [EObject current=null] : (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) ;
    public final EObject ruleFby() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Arrow_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2020:2: ( (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? ) )
            // InternalLustre.g:2021:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            {
            // InternalLustre.g:2021:2: (this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )? )
            // InternalLustre.g:2022:3: this_Arrow_0= ruleArrow ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getFbyAccess().getArrowParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Arrow_0=ruleArrow();

            state._fsp--;


            			current = this_Arrow_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2030:3: ( () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLustre.g:2031:4: () (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    {
                    // InternalLustre.g:2031:4: ()
                    // InternalLustre.g:2032:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getFbyAccess().getFbySubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2038:4: (otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==42) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalLustre.g:2039:5: otherlv_2= 'fby' ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    {
                    	    otherlv_2=(Token)match(input,42,FOLLOW_17); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getFbyAccess().getFbyKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:2043:5: ( (lv_subExpressions_3_0= ruleArrow ) )
                    	    // InternalLustre.g:2044:6: (lv_subExpressions_3_0= ruleArrow )
                    	    {
                    	    // InternalLustre.g:2044:6: (lv_subExpressions_3_0= ruleArrow )
                    	    // InternalLustre.g:2045:7: lv_subExpressions_3_0= ruleArrow
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
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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
    // InternalLustre.g:2068:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalLustre.g:2068:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalLustre.g:2069:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalLustre.g:2075:1: ruleArrow returns [EObject current=null] : (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2081:2: ( (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? ) )
            // InternalLustre.g:2082:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            {
            // InternalLustre.g:2082:2: (this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )? )
            // InternalLustre.g:2083:3: this_Or_0= ruleOr ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getArrowAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2091:3: ( () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+ )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLustre.g:2092:4: () (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    {
                    // InternalLustre.g:2092:4: ()
                    // InternalLustre.g:2093:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getArrowAccess().getArrowSubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2099:4: (otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==31) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalLustre.g:2100:5: otherlv_2= '->' ( (lv_subExpressions_3_0= ruleOr ) )
                    	    {
                    	    otherlv_2=(Token)match(input,31,FOLLOW_17); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:2104:5: ( (lv_subExpressions_3_0= ruleOr ) )
                    	    // InternalLustre.g:2105:6: (lv_subExpressions_3_0= ruleOr )
                    	    {
                    	    // InternalLustre.g:2105:6: (lv_subExpressions_3_0= ruleOr )
                    	    // InternalLustre.g:2106:7: lv_subExpressions_3_0= ruleOr
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
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
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
    // InternalLustre.g:2129:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLustre.g:2129:43: (iv_ruleOr= ruleOr EOF )
            // InternalLustre.g:2130:2: iv_ruleOr= ruleOr EOF
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
    // InternalLustre.g:2136:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2142:2: ( (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? ) )
            // InternalLustre.g:2143:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            {
            // InternalLustre.g:2143:2: (this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )? )
            // InternalLustre.g:2144:3: this_And_0= ruleAnd ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2152:3: ( () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+ )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLustre.g:2153:4: () (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    {
                    // InternalLustre.g:2153:4: ()
                    // InternalLustre.g:2154:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getOrAccess().getOrSubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2160:4: (otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) ) )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==43) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalLustre.g:2161:5: otherlv_2= 'or' ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    {
                    	    otherlv_2=(Token)match(input,43,FOLLOW_17); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:2165:5: ( (lv_subExpressions_3_0= ruleAnd ) )
                    	    // InternalLustre.g:2166:6: (lv_subExpressions_3_0= ruleAnd )
                    	    {
                    	    // InternalLustre.g:2166:6: (lv_subExpressions_3_0= ruleAnd )
                    	    // InternalLustre.g:2167:7: lv_subExpressions_3_0= ruleAnd
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
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
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
    // InternalLustre.g:2190:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLustre.g:2190:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLustre.g:2191:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalLustre.g:2197:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2203:2: ( (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? ) )
            // InternalLustre.g:2204:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            {
            // InternalLustre.g:2204:2: (this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )? )
            // InternalLustre.g:2205:3: this_Equality_0= ruleEquality ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2213:3: ( () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLustre.g:2214:4: () (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    {
                    // InternalLustre.g:2214:4: ()
                    // InternalLustre.g:2215:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getAndAccess().getAndSubExpressionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2221:4: (otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==44) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalLustre.g:2222:5: otherlv_2= 'and' ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FOLLOW_17); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
                    	    				
                    	    // InternalLustre.g:2226:5: ( (lv_subExpressions_3_0= ruleEquality ) )
                    	    // InternalLustre.g:2227:6: (lv_subExpressions_3_0= ruleEquality )
                    	    {
                    	    // InternalLustre.g:2227:6: (lv_subExpressions_3_0= ruleEquality )
                    	    // InternalLustre.g:2228:7: lv_subExpressions_3_0= ruleEquality
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
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
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
    // InternalLustre.g:2251:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalLustre.g:2251:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalLustre.g:2252:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalLustre.g:2258:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2264:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalLustre.g:2265:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalLustre.g:2265:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalLustre.g:2266:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2274:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21||LA34_0==45) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalLustre.g:2275:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalLustre.g:2275:4: ()
            	    // InternalLustre.g:2276:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalLustre.g:2282:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalLustre.g:2283:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalLustre.g:2283:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalLustre.g:2284:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalLustre.g:2284:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==21) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==45) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalLustre.g:2285:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,21,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2296:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,45,FOLLOW_17); 

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

            	    // InternalLustre.g:2309:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalLustre.g:2310:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalLustre.g:2310:5: (lv_right_3_0= ruleComparison )
            	    // InternalLustre.g:2311:6: lv_right_3_0= ruleComparison
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
            	    break loop34;
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
    // InternalLustre.g:2333:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalLustre.g:2333:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalLustre.g:2334:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalLustre.g:2340:1: ruleComparison returns [EObject current=null] : (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Mod_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2346:2: ( (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* ) )
            // InternalLustre.g:2347:2: (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            {
            // InternalLustre.g:2347:2: (this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )* )
            // InternalLustre.g:2348:3: this_Mod_0= ruleMod ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getModParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Mod_0=ruleMod();

            state._fsp--;


            			current = this_Mod_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2356:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=46 && LA36_0<=49)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLustre.g:2357:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= ruleMod ) )
            	    {
            	    // InternalLustre.g:2357:4: ()
            	    // InternalLustre.g:2358:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalLustre.g:2364:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalLustre.g:2365:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalLustre.g:2365:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalLustre.g:2366:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalLustre.g:2366:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt35=4;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // InternalLustre.g:2367:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,46,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2378:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,47,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalLustre.g:2389:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,48,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalLustre.g:2400:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,49,FOLLOW_17); 

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

            	    // InternalLustre.g:2413:4: ( (lv_right_3_0= ruleMod ) )
            	    // InternalLustre.g:2414:5: (lv_right_3_0= ruleMod )
            	    {
            	    // InternalLustre.g:2414:5: (lv_right_3_0= ruleMod )
            	    // InternalLustre.g:2415:6: lv_right_3_0= ruleMod
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightModParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleMod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Mod");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
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


    // $ANTLR start "entryRuleMod"
    // InternalLustre.g:2437:1: entryRuleMod returns [EObject current=null] : iv_ruleMod= ruleMod EOF ;
    public final EObject entryRuleMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMod = null;


        try {
            // InternalLustre.g:2437:44: (iv_ruleMod= ruleMod EOF )
            // InternalLustre.g:2438:2: iv_ruleMod= ruleMod EOF
            {
             newCompositeNode(grammarAccess.getModRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMod=ruleMod();

            state._fsp--;

             current =iv_ruleMod; 
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
    // $ANTLR end "entryRuleMod"


    // $ANTLR start "ruleMod"
    // InternalLustre.g:2444:1: ruleMod returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2450:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalLustre.g:2451:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalLustre.g:2451:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )* )
            // InternalLustre.g:2452:3: this_PlusOrMinus_0= rulePlusOrMinus ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getModAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2460:3: ( () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==50) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalLustre.g:2461:4: () otherlv_2= 'mod' ( (lv_subExpressions_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalLustre.g:2461:4: ()
            	    // InternalLustre.g:2462:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getModAccess().getModSubExpressionsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getModAccess().getModKeyword_1_1());
            	    			
            	    // InternalLustre.g:2472:4: ( (lv_subExpressions_3_0= rulePlusOrMinus ) )
            	    // InternalLustre.g:2473:5: (lv_subExpressions_3_0= rulePlusOrMinus )
            	    {
            	    // InternalLustre.g:2473:5: (lv_subExpressions_3_0= rulePlusOrMinus )
            	    // InternalLustre.g:2474:6: lv_subExpressions_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getModAccess().getSubExpressionsPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_subExpressions_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subExpressions",
            	    							lv_subExpressions_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.PlusOrMinus");
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
    // $ANTLR end "ruleMod"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalLustre.g:2496:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalLustre.g:2496:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalLustre.g:2497:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalLustre.g:2503:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2509:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalLustre.g:2510:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalLustre.g:2510:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )* )
            // InternalLustre.g:2511:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2519:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=51 && LA39_0<=52)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLustre.g:2520:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalLustre.g:2520:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // InternalLustre.g:2521:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalLustre.g:2521:5: ( () otherlv_2= '+' )
            	            // InternalLustre.g:2522:6: () otherlv_2= '+'
            	            {
            	            // InternalLustre.g:2522:6: ()
            	            // InternalLustre.g:2523:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusSubExpressionsAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,51,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2535:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalLustre.g:2535:5: ( () otherlv_4= '-' )
            	            // InternalLustre.g:2536:6: () otherlv_4= '-'
            	            {
            	            // InternalLustre.g:2536:6: ()
            	            // InternalLustre.g:2537:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusSubExpressionsAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,52,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2549:4: ( (lv_subExpressions_5_0= ruleMulOrDiv ) )
            	    // InternalLustre.g:2550:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    {
            	    // InternalLustre.g:2550:5: (lv_subExpressions_5_0= ruleMulOrDiv )
            	    // InternalLustre.g:2551:6: lv_subExpressions_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getSubExpressionsMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalLustre.g:2573:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalLustre.g:2573:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalLustre.g:2574:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalLustre.g:2580:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2586:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* ) )
            // InternalLustre.g:2587:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            {
            // InternalLustre.g:2587:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )* )
            // InternalLustre.g:2588:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2596:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=53 && LA41_0<=54)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalLustre.g:2597:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_subExpressions_5_0= rulePrimary ) )
            	    {
            	    // InternalLustre.g:2597:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==53) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==54) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalLustre.g:2598:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalLustre.g:2598:5: ( () otherlv_2= '*' )
            	            // InternalLustre.g:2599:6: () otherlv_2= '*'
            	            {
            	            // InternalLustre.g:2599:6: ()
            	            // InternalLustre.g:2600:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getMulOrDivAccess().getMulSubExpressionsAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,53,FOLLOW_17); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2612:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalLustre.g:2612:5: ( () otherlv_4= '/' )
            	            // InternalLustre.g:2613:6: () otherlv_4= '/'
            	            {
            	            // InternalLustre.g:2613:6: ()
            	            // InternalLustre.g:2614:7: 
            	            {

            	            							current = forceCreateModelElementAndAdd(
            	            								grammarAccess.getMulOrDivAccess().getDivSubExpressionsAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,54,FOLLOW_17); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2626:4: ( (lv_subExpressions_5_0= rulePrimary ) )
            	    // InternalLustre.g:2627:5: (lv_subExpressions_5_0= rulePrimary )
            	    {
            	    // InternalLustre.g:2627:5: (lv_subExpressions_5_0= rulePrimary )
            	    // InternalLustre.g:2628:6: lv_subExpressions_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getSubExpressionsPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop41;
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
    // InternalLustre.g:2650:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLustre.g:2650:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLustre.g:2651:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalLustre.g:2657:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) ;
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
            // InternalLustre.g:2663:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) )
            // InternalLustre.g:2664:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            {
            // InternalLustre.g:2664:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            int alt42=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt42=1;
                }
                break;
            case 55:
                {
                alt42=2;
                }
                break;
            case 52:
                {
                alt42=3;
                }
                break;
            case 56:
                {
                alt42=4;
                }
                break;
            case 57:
                {
                alt42=5;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalLustre.g:2665:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalLustre.g:2665:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalLustre.g:2666:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_38);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2684:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2684:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalLustre.g:2685:4: () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2685:4: ()
                    // InternalLustre.g:2686:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,55,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
                    			
                    // InternalLustre.g:2696:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalLustre.g:2697:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalLustre.g:2697:5: (lv_expression_5_0= rulePrimary )
                    // InternalLustre.g:2698:6: lv_expression_5_0= rulePrimary
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
                    // InternalLustre.g:2717:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2717:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalLustre.g:2718:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2718:4: ()
                    // InternalLustre.g:2719:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUMinusAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,52,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalLustre.g:2729:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalLustre.g:2730:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalLustre.g:2730:5: (lv_expression_8_0= rulePrimary )
                    // InternalLustre.g:2731:6: lv_expression_8_0= rulePrimary
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
                    // InternalLustre.g:2750:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2750:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    // InternalLustre.g:2751:4: () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2751:4: ()
                    // InternalLustre.g:2752:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getPreAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,56,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getPreKeyword_3_1());
                    			
                    // InternalLustre.g:2762:4: ( (lv_expression_11_0= rulePrimary ) )
                    // InternalLustre.g:2763:5: (lv_expression_11_0= rulePrimary )
                    {
                    // InternalLustre.g:2763:5: (lv_expression_11_0= rulePrimary )
                    // InternalLustre.g:2764:6: lv_expression_11_0= rulePrimary
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
                    // InternalLustre.g:2783:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2783:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    // InternalLustre.g:2784:4: () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2784:4: ()
                    // InternalLustre.g:2785:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getCurrentAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,57,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCurrentKeyword_4_1());
                    			
                    // InternalLustre.g:2795:4: ( (lv_expression_14_0= rulePrimary ) )
                    // InternalLustre.g:2796:5: (lv_expression_14_0= rulePrimary )
                    {
                    // InternalLustre.g:2796:5: (lv_expression_14_0= rulePrimary )
                    // InternalLustre.g:2797:6: lv_expression_14_0= rulePrimary
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
                    // InternalLustre.g:2816:3: this_AtomicExpression_15= ruleAtomicExpression
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
    // InternalLustre.g:2828:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalLustre.g:2828:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalLustre.g:2829:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalLustre.g:2835:1: ruleAtomicExpression returns [EObject current=null] : (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantExpression_0 = null;

        EObject this_VariableReference_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:2841:2: ( (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference ) )
            // InternalLustre.g:2842:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            {
            // InternalLustre.g:2842:2: (this_ConstantExpression_0= ruleConstantExpression | this_VariableReference_1= ruleVariableReference )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_BOOL && LA43_0<=RULE_INT)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_IDENT) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalLustre.g:2843:3: this_ConstantExpression_0= ruleConstantExpression
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
                    // InternalLustre.g:2852:3: this_VariableReference_1= ruleVariableReference
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
    // InternalLustre.g:2864:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalLustre.g:2864:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalLustre.g:2865:2: iv_ruleVariableReference= ruleVariableReference EOF
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
    // InternalLustre.g:2871:1: ruleVariableReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_IDENT ) ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLustre.g:2877:2: ( ( () ( (otherlv_1= RULE_IDENT ) ) ) )
            // InternalLustre.g:2878:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            {
            // InternalLustre.g:2878:2: ( () ( (otherlv_1= RULE_IDENT ) ) )
            // InternalLustre.g:2879:3: () ( (otherlv_1= RULE_IDENT ) )
            {
            // InternalLustre.g:2879:3: ()
            // InternalLustre.g:2880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableReferenceAccess().getVariableReferenceAction_0(),
            					current);
            			

            }

            // InternalLustre.g:2886:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:2887:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:2887:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:2888:5: otherlv_1= RULE_IDENT
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
    // InternalLustre.g:2903:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalLustre.g:2903:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalLustre.g:2904:2: iv_ruleConstantExpression= ruleConstantExpression EOF
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
    // InternalLustre.g:2910:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalLustre.g:2916:2: ( ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalLustre.g:2917:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalLustre.g:2917:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt44=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt44=2;
                }
                break;
            case RULE_INT:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalLustre.g:2918:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    {
                    // InternalLustre.g:2918:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    // InternalLustre.g:2919:4: () ( (lv_value_1_0= RULE_BOOL ) )
                    {
                    // InternalLustre.g:2919:4: ()
                    // InternalLustre.g:2920:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getBoolConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2926:4: ( (lv_value_1_0= RULE_BOOL ) )
                    // InternalLustre.g:2927:5: (lv_value_1_0= RULE_BOOL )
                    {
                    // InternalLustre.g:2927:5: (lv_value_1_0= RULE_BOOL )
                    // InternalLustre.g:2928:6: lv_value_1_0= RULE_BOOL
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
                    // InternalLustre.g:2946:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalLustre.g:2946:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalLustre.g:2947:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalLustre.g:2947:4: ()
                    // InternalLustre.g:2948:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getFloatConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2954:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalLustre.g:2955:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalLustre.g:2955:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalLustre.g:2956:6: lv_value_3_0= RULE_FLOAT
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
                    // InternalLustre.g:2974:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalLustre.g:2974:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalLustre.g:2975:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalLustre.g:2975:4: ()
                    // InternalLustre.g:2976:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getIntConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2982:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalLustre.g:2983:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalLustre.g:2983:5: (lv_value_5_0= RULE_INT )
                    // InternalLustre.g:2984:6: lv_value_5_0= RULE_INT
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x03900100000040F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000318000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000318000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000200002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});

}