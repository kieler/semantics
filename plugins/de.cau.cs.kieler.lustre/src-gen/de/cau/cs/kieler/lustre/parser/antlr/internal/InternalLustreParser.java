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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_BOOL", "RULE_FLOAT", "RULE_INT", "RULE_STRING_CONST", "RULE_LUSTRE_ML_COMMENT", "RULE_LUSTRE_SL_COMMENT", "RULE_LUSTRE_COMMENT", "RULE_WS", "'end'", "'package'", "'uses'", "'provides'", "'node'", "'('", "')'", "'returns'", "';'", "'body'", "'::'", "','", "':'", "'when'", "'let'", "'tel'", "'var'", "'='", "'.'", "'['", "']'", "'..'", "'assert'", "'if'", "'then'", "'else'", "'fby'", "'->'", "'or'", "'and'", "'<>'", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'not'", "'pre'", "'current'"
    };
    public static final int T__50=50;
    public static final int RULE_STRING_CONST=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_LUSTRE_ML_COMMENT=9;
    public static final int RULE_LUSTRE_SL_COMMENT=10;
    public static final int RULE_LUSTRE_COMMENT=11;
    public static final int RULE_IDENT=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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
    // InternalLustre.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_pkg_0_0= rulePackage ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_pkg_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_LUSTRE_COMMENT");

        try {
            // InternalLustre.g:83:2: ( ( (lv_pkg_0_0= rulePackage ) ) )
            // InternalLustre.g:84:2: ( (lv_pkg_0_0= rulePackage ) )
            {
            // InternalLustre.g:84:2: ( (lv_pkg_0_0= rulePackage ) )
            // InternalLustre.g:85:3: (lv_pkg_0_0= rulePackage )
            {
            // InternalLustre.g:85:3: (lv_pkg_0_0= rulePackage )
            // InternalLustre.g:86:4: lv_pkg_0_0= rulePackage
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getPkgPackageParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_pkg_0_0=rulePackage();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"pkg",
            					lv_pkg_0_0,
            					"de.cau.cs.kieler.lustre.Lustre.Package");
            				afterParserOrEnumRuleCall();
            			

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRulePackage"
    // InternalLustre.g:109:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalLustre.g:109:48: (iv_rulePackage= rulePackage EOF )
            // InternalLustre.g:110:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalLustre.g:116:1: rulePackage returns [EObject current=null] : ( ( (lv_head_0_0= rulePackage_Header ) ) ( (lv_body_1_0= rulePackage_Body_Content ) ) otherlv_2= 'end' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_head_0_0 = null;

        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:122:2: ( ( ( (lv_head_0_0= rulePackage_Header ) ) ( (lv_body_1_0= rulePackage_Body_Content ) ) otherlv_2= 'end' ) )
            // InternalLustre.g:123:2: ( ( (lv_head_0_0= rulePackage_Header ) ) ( (lv_body_1_0= rulePackage_Body_Content ) ) otherlv_2= 'end' )
            {
            // InternalLustre.g:123:2: ( ( (lv_head_0_0= rulePackage_Header ) ) ( (lv_body_1_0= rulePackage_Body_Content ) ) otherlv_2= 'end' )
            // InternalLustre.g:124:3: ( (lv_head_0_0= rulePackage_Header ) ) ( (lv_body_1_0= rulePackage_Body_Content ) ) otherlv_2= 'end'
            {
            // InternalLustre.g:124:3: ( (lv_head_0_0= rulePackage_Header ) )
            // InternalLustre.g:125:4: (lv_head_0_0= rulePackage_Header )
            {
            // InternalLustre.g:125:4: (lv_head_0_0= rulePackage_Header )
            // InternalLustre.g:126:5: lv_head_0_0= rulePackage_Header
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getHeadPackage_HeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_head_0_0=rulePackage_Header();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.Package_Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:143:3: ( (lv_body_1_0= rulePackage_Body_Content ) )
            // InternalLustre.g:144:4: (lv_body_1_0= rulePackage_Body_Content )
            {
            // InternalLustre.g:144:4: (lv_body_1_0= rulePackage_Body_Content )
            // InternalLustre.g:145:5: lv_body_1_0= rulePackage_Body_Content
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getBodyPackage_Body_ContentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_body_1_0=rulePackage_Body_Content();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.Package_Body_Content");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getEndKeyword_2());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackage_Header"
    // InternalLustre.g:170:1: entryRulePackage_Header returns [EObject current=null] : iv_rulePackage_Header= rulePackage_Header EOF ;
    public final EObject entryRulePackage_Header() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Header = null;


        try {
            // InternalLustre.g:170:55: (iv_rulePackage_Header= rulePackage_Header EOF )
            // InternalLustre.g:171:2: iv_rulePackage_Header= rulePackage_Header EOF
            {
             newCompositeNode(grammarAccess.getPackage_HeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Header=rulePackage_Header();

            state._fsp--;

             current =iv_rulePackage_Header; 
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
    // $ANTLR end "entryRulePackage_Header"


    // $ANTLR start "rulePackage_Header"
    // InternalLustre.g:177:1: rulePackage_Header returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) ) )? otherlv_4= 'provides' ( (lv_provides_5_0= rulePackage_Provide ) )+ ) ;
    public final EObject rulePackage_Header() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_uses_3_0 = null;

        EObject lv_provides_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:183:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) ) )? otherlv_4= 'provides' ( (lv_provides_5_0= rulePackage_Provide ) )+ ) )
            // InternalLustre.g:184:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) ) )? otherlv_4= 'provides' ( (lv_provides_5_0= rulePackage_Provide ) )+ )
            {
            // InternalLustre.g:184:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) ) )? otherlv_4= 'provides' ( (lv_provides_5_0= rulePackage_Provide ) )+ )
            // InternalLustre.g:185:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_IDENT ) ) (otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) ) )? otherlv_4= 'provides' ( (lv_provides_5_0= rulePackage_Provide ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackage_HeaderAccess().getPackageKeyword_0());
            		
            // InternalLustre.g:189:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:190:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:190:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:191:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackage_HeaderAccess().getNameIDENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_HeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            // InternalLustre.g:207:3: (otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLustre.g:208:4: otherlv_2= 'uses' ( (lv_uses_3_0= ruleIdent_List ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getPackage_HeaderAccess().getUsesKeyword_2_0());
                    			
                    // InternalLustre.g:212:4: ( (lv_uses_3_0= ruleIdent_List ) )
                    // InternalLustre.g:213:5: (lv_uses_3_0= ruleIdent_List )
                    {
                    // InternalLustre.g:213:5: (lv_uses_3_0= ruleIdent_List )
                    // InternalLustre.g:214:6: lv_uses_3_0= ruleIdent_List
                    {

                    						newCompositeNode(grammarAccess.getPackage_HeaderAccess().getUsesIdent_ListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_uses_3_0=ruleIdent_List();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_HeaderRule());
                    						}
                    						set(
                    							current,
                    							"uses",
                    							lv_uses_3_0,
                    							"de.cau.cs.kieler.lustre.Lustre.Ident_List");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPackage_HeaderAccess().getProvidesKeyword_3());
            		
            // InternalLustre.g:236:3: ( (lv_provides_5_0= rulePackage_Provide ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLustre.g:237:4: (lv_provides_5_0= rulePackage_Provide )
            	    {
            	    // InternalLustre.g:237:4: (lv_provides_5_0= rulePackage_Provide )
            	    // InternalLustre.g:238:5: lv_provides_5_0= rulePackage_Provide
            	    {

            	    					newCompositeNode(grammarAccess.getPackage_HeaderAccess().getProvidesPackage_ProvideParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_provides_5_0=rulePackage_Provide();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackage_HeaderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"provides",
            	    						lv_provides_5_0,
            	    						"de.cau.cs.kieler.lustre.Lustre.Package_Provide");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "rulePackage_Header"


    // $ANTLR start "entryRulePackage_Provide"
    // InternalLustre.g:259:1: entryRulePackage_Provide returns [EObject current=null] : iv_rulePackage_Provide= rulePackage_Provide EOF ;
    public final EObject entryRulePackage_Provide() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Provide = null;


        try {
            // InternalLustre.g:259:56: (iv_rulePackage_Provide= rulePackage_Provide EOF )
            // InternalLustre.g:260:2: iv_rulePackage_Provide= rulePackage_Provide EOF
            {
             newCompositeNode(grammarAccess.getPackage_ProvideRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Provide=rulePackage_Provide();

            state._fsp--;

             current =iv_rulePackage_Provide; 
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
    // $ANTLR end "entryRulePackage_Provide"


    // $ANTLR start "rulePackage_Provide"
    // InternalLustre.g:266:1: rulePackage_Provide returns [EObject current=null] : (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject rulePackage_Provide() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_param_3_0 = null;

        EObject lv_ret_7_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:272:2: ( (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' ) )
            // InternalLustre.g:273:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' )
            {
            // InternalLustre.g:273:2: (otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' )
            // InternalLustre.g:274:3: otherlv_0= 'node' ( (otherlv_1= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackage_ProvideAccess().getNodeKeyword_0());
            		
            // InternalLustre.g:278:3: ( (otherlv_1= RULE_IDENT ) )
            // InternalLustre.g:279:4: (otherlv_1= RULE_IDENT )
            {
            // InternalLustre.g:279:4: (otherlv_1= RULE_IDENT )
            // InternalLustre.g:280:5: otherlv_1= RULE_IDENT
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackage_ProvideRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_IDENT,FOLLOW_10); 

            					newLeafNode(otherlv_1, grammarAccess.getPackage_ProvideAccess().getNameNode_HeaderCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackage_ProvideAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLustre.g:295:3: ( (lv_param_3_0= ruleVar_Decl_List ) )
            // InternalLustre.g:296:4: (lv_param_3_0= ruleVar_Decl_List )
            {
            // InternalLustre.g:296:4: (lv_param_3_0= ruleVar_Decl_List )
            // InternalLustre.g:297:5: lv_param_3_0= ruleVar_Decl_List
            {

            					newCompositeNode(grammarAccess.getPackage_ProvideAccess().getParamVar_Decl_ListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_param_3_0=ruleVar_Decl_List();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackage_ProvideRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_3_0,
            						"de.cau.cs.kieler.lustre.Lustre.Var_Decl_List");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getPackage_ProvideAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getPackage_ProvideAccess().getReturnsKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getPackage_ProvideAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLustre.g:326:3: ( (lv_ret_7_0= ruleVar_Decl_List ) )
            // InternalLustre.g:327:4: (lv_ret_7_0= ruleVar_Decl_List )
            {
            // InternalLustre.g:327:4: (lv_ret_7_0= ruleVar_Decl_List )
            // InternalLustre.g:328:5: lv_ret_7_0= ruleVar_Decl_List
            {

            					newCompositeNode(grammarAccess.getPackage_ProvideAccess().getRetVar_Decl_ListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_ret_7_0=ruleVar_Decl_List();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackage_ProvideRule());
            					}
            					set(
            						current,
            						"ret",
            						lv_ret_7_0,
            						"de.cau.cs.kieler.lustre.Lustre.Var_Decl_List");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getPackage_ProvideAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPackage_ProvideAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulePackage_Provide"


    // $ANTLR start "entryRulePackage_Body_Content"
    // InternalLustre.g:357:1: entryRulePackage_Body_Content returns [EObject current=null] : iv_rulePackage_Body_Content= rulePackage_Body_Content EOF ;
    public final EObject entryRulePackage_Body_Content() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Body_Content = null;


        try {
            // InternalLustre.g:357:61: (iv_rulePackage_Body_Content= rulePackage_Body_Content EOF )
            // InternalLustre.g:358:2: iv_rulePackage_Body_Content= rulePackage_Body_Content EOF
            {
             newCompositeNode(grammarAccess.getPackage_Body_ContentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Body_Content=rulePackage_Body_Content();

            state._fsp--;

             current =iv_rulePackage_Body_Content; 
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
    // $ANTLR end "entryRulePackage_Body_Content"


    // $ANTLR start "rulePackage_Body_Content"
    // InternalLustre.g:364:1: rulePackage_Body_Content returns [EObject current=null] : (otherlv_0= 'body' ( (lv_entities_1_0= ruleEntity_Decl ) )+ ) ;
    public final EObject rulePackage_Body_Content() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entities_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:370:2: ( (otherlv_0= 'body' ( (lv_entities_1_0= ruleEntity_Decl ) )+ ) )
            // InternalLustre.g:371:2: (otherlv_0= 'body' ( (lv_entities_1_0= ruleEntity_Decl ) )+ )
            {
            // InternalLustre.g:371:2: (otherlv_0= 'body' ( (lv_entities_1_0= ruleEntity_Decl ) )+ )
            // InternalLustre.g:372:3: otherlv_0= 'body' ( (lv_entities_1_0= ruleEntity_Decl ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPackage_Body_ContentAccess().getBodyKeyword_0());
            		
            // InternalLustre.g:376:3: ( (lv_entities_1_0= ruleEntity_Decl ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLustre.g:377:4: (lv_entities_1_0= ruleEntity_Decl )
            	    {
            	    // InternalLustre.g:377:4: (lv_entities_1_0= ruleEntity_Decl )
            	    // InternalLustre.g:378:5: lv_entities_1_0= ruleEntity_Decl
            	    {

            	    					newCompositeNode(grammarAccess.getPackage_Body_ContentAccess().getEntitiesEntity_DeclParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_entities_1_0=ruleEntity_Decl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackage_Body_ContentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_1_0,
            	    						"de.cau.cs.kieler.lustre.Lustre.Entity_Decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "rulePackage_Body_Content"


    // $ANTLR start "entryRuleEntity_Decl"
    // InternalLustre.g:399:1: entryRuleEntity_Decl returns [EObject current=null] : iv_ruleEntity_Decl= ruleEntity_Decl EOF ;
    public final EObject entryRuleEntity_Decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity_Decl = null;


        try {
            // InternalLustre.g:399:52: (iv_ruleEntity_Decl= ruleEntity_Decl EOF )
            // InternalLustre.g:400:2: iv_ruleEntity_Decl= ruleEntity_Decl EOF
            {
             newCompositeNode(grammarAccess.getEntity_DeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity_Decl=ruleEntity_Decl();

            state._fsp--;

             current =iv_ruleEntity_Decl; 
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
    // $ANTLR end "entryRuleEntity_Decl"


    // $ANTLR start "ruleEntity_Decl"
    // InternalLustre.g:406:1: ruleEntity_Decl returns [EObject current=null] : this_Node_Decl_0= ruleNode_Decl ;
    public final EObject ruleEntity_Decl() throws RecognitionException {
        EObject current = null;

        EObject this_Node_Decl_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:412:2: (this_Node_Decl_0= ruleNode_Decl )
            // InternalLustre.g:413:2: this_Node_Decl_0= ruleNode_Decl
            {

            		newCompositeNode(grammarAccess.getEntity_DeclAccess().getNode_DeclParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Node_Decl_0=ruleNode_Decl();

            state._fsp--;


            		current = this_Node_Decl_0;
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
    // $ANTLR end "ruleEntity_Decl"


    // $ANTLR start "entryRuleIdentifier"
    // InternalLustre.g:424:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // InternalLustre.g:424:51: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalLustre.g:425:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalLustre.g:431:1: ruleIdentifier returns [EObject current=null] : ( ( ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) ) )? ( (lv_name_2_0= RULE_IDENT ) ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_pkg_0_0=null;
        Token lv_fromPgk_1_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalLustre.g:437:2: ( ( ( ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) ) )? ( (lv_name_2_0= RULE_IDENT ) ) ) )
            // InternalLustre.g:438:2: ( ( ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) ) )? ( (lv_name_2_0= RULE_IDENT ) ) )
            {
            // InternalLustre.g:438:2: ( ( ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) ) )? ( (lv_name_2_0= RULE_IDENT ) ) )
            // InternalLustre.g:439:3: ( ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) ) )? ( (lv_name_2_0= RULE_IDENT ) )
            {
            // InternalLustre.g:439:3: ( ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_IDENT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalLustre.g:440:4: ( (lv_pkg_0_0= RULE_IDENT ) ) ( (lv_fromPgk_1_0= '::' ) )
                    {
                    // InternalLustre.g:440:4: ( (lv_pkg_0_0= RULE_IDENT ) )
                    // InternalLustre.g:441:5: (lv_pkg_0_0= RULE_IDENT )
                    {
                    // InternalLustre.g:441:5: (lv_pkg_0_0= RULE_IDENT )
                    // InternalLustre.g:442:6: lv_pkg_0_0= RULE_IDENT
                    {
                    lv_pkg_0_0=(Token)match(input,RULE_IDENT,FOLLOW_14); 

                    						newLeafNode(lv_pkg_0_0, grammarAccess.getIdentifierAccess().getPkgIDENTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdentifierRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pkg",
                    							lv_pkg_0_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

                    }


                    }

                    // InternalLustre.g:458:4: ( (lv_fromPgk_1_0= '::' ) )
                    // InternalLustre.g:459:5: (lv_fromPgk_1_0= '::' )
                    {
                    // InternalLustre.g:459:5: (lv_fromPgk_1_0= '::' )
                    // InternalLustre.g:460:6: lv_fromPgk_1_0= '::'
                    {
                    lv_fromPgk_1_0=(Token)match(input,23,FOLLOW_5); 

                    						newLeafNode(lv_fromPgk_1_0, grammarAccess.getIdentifierAccess().getFromPgkColonColonKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIdentifierRule());
                    						}
                    						setWithLastConsumed(current, "fromPgk", true, "::");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalLustre.g:473:3: ( (lv_name_2_0= RULE_IDENT ) )
            // InternalLustre.g:474:4: (lv_name_2_0= RULE_IDENT )
            {
            // InternalLustre.g:474:4: (lv_name_2_0= RULE_IDENT )
            // InternalLustre.g:475:5: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIdentifierAccess().getNameIDENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleType"
    // InternalLustre.g:495:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLustre.g:495:45: (iv_ruleType= ruleType EOF )
            // InternalLustre.g:496:2: iv_ruleType= ruleType EOF
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
    // InternalLustre.g:502:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENT ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLustre.g:508:2: ( ( (lv_name_0_0= RULE_IDENT ) ) )
            // InternalLustre.g:509:2: ( (lv_name_0_0= RULE_IDENT ) )
            {
            // InternalLustre.g:509:2: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:510:3: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:510:3: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:511:4: lv_name_0_0= RULE_IDENT
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


    // $ANTLR start "entryRuleField_List"
    // InternalLustre.g:530:1: entryRuleField_List returns [EObject current=null] : iv_ruleField_List= ruleField_List EOF ;
    public final EObject entryRuleField_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_List = null;


        try {
            // InternalLustre.g:530:51: (iv_ruleField_List= ruleField_List EOF )
            // InternalLustre.g:531:2: iv_ruleField_List= ruleField_List EOF
            {
             newCompositeNode(grammarAccess.getField_ListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField_List=ruleField_List();

            state._fsp--;

             current =iv_ruleField_List; 
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
    // $ANTLR end "entryRuleField_List"


    // $ANTLR start "ruleField_List"
    // InternalLustre.g:537:1: ruleField_List returns [EObject current=null] : ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* ) ;
    public final EObject ruleField_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fields_0_0 = null;

        EObject lv_fields_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:543:2: ( ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* ) )
            // InternalLustre.g:544:2: ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* )
            {
            // InternalLustre.g:544:2: ( ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )* )
            // InternalLustre.g:545:3: ( (lv_fields_0_0= ruleField ) ) (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )*
            {
            // InternalLustre.g:545:3: ( (lv_fields_0_0= ruleField ) )
            // InternalLustre.g:546:4: (lv_fields_0_0= ruleField )
            {
            // InternalLustre.g:546:4: (lv_fields_0_0= ruleField )
            // InternalLustre.g:547:5: lv_fields_0_0= ruleField
            {

            					newCompositeNode(grammarAccess.getField_ListAccess().getFieldsFieldParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_fields_0_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getField_ListRule());
            					}
            					add(
            						current,
            						"fields",
            						lv_fields_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:564:3: (otherlv_1= ',' ( (lv_fields_2_0= ruleField ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLustre.g:565:4: otherlv_1= ',' ( (lv_fields_2_0= ruleField ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getField_ListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLustre.g:569:4: ( (lv_fields_2_0= ruleField ) )
            	    // InternalLustre.g:570:5: (lv_fields_2_0= ruleField )
            	    {
            	    // InternalLustre.g:570:5: (lv_fields_2_0= ruleField )
            	    // InternalLustre.g:571:6: lv_fields_2_0= ruleField
            	    {

            	    						newCompositeNode(grammarAccess.getField_ListAccess().getFieldsFieldParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_fields_2_0=ruleField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getField_ListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fields",
            	    							lv_fields_2_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Field");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleField_List"


    // $ANTLR start "entryRuleField"
    // InternalLustre.g:593:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalLustre.g:593:46: (iv_ruleField= ruleField EOF )
            // InternalLustre.g:594:2: iv_ruleField= ruleField EOF
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
    // InternalLustre.g:600:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:606:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalLustre.g:607:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalLustre.g:607:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalLustre.g:608:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalLustre.g:608:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:609:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:609:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:610:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalLustre.g:630:3: ( (lv_type_2_0= ruleType ) )
            // InternalLustre.g:631:4: (lv_type_2_0= ruleType )
            {
            // InternalLustre.g:631:4: (lv_type_2_0= ruleType )
            // InternalLustre.g:632:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"de.cau.cs.kieler.lustre.Lustre.Type");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "entryRuleIdent_List"
    // InternalLustre.g:653:1: entryRuleIdent_List returns [EObject current=null] : iv_ruleIdent_List= ruleIdent_List EOF ;
    public final EObject entryRuleIdent_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdent_List = null;


        try {
            // InternalLustre.g:653:51: (iv_ruleIdent_List= ruleIdent_List EOF )
            // InternalLustre.g:654:2: iv_ruleIdent_List= ruleIdent_List EOF
            {
             newCompositeNode(grammarAccess.getIdent_ListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdent_List=ruleIdent_List();

            state._fsp--;

             current =iv_ruleIdent_List; 
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
    // $ANTLR end "entryRuleIdent_List"


    // $ANTLR start "ruleIdent_List"
    // InternalLustre.g:660:1: ruleIdent_List returns [EObject current=null] : ( ( (lv_names_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) ) )* ) ;
    public final EObject ruleIdent_List() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalLustre.g:666:2: ( ( ( (lv_names_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) ) )* ) )
            // InternalLustre.g:667:2: ( ( (lv_names_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) ) )* )
            {
            // InternalLustre.g:667:2: ( ( (lv_names_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) ) )* )
            // InternalLustre.g:668:3: ( (lv_names_0_0= RULE_IDENT ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) ) )*
            {
            // InternalLustre.g:668:3: ( (lv_names_0_0= RULE_IDENT ) )
            // InternalLustre.g:669:4: (lv_names_0_0= RULE_IDENT )
            {
            // InternalLustre.g:669:4: (lv_names_0_0= RULE_IDENT )
            // InternalLustre.g:670:5: lv_names_0_0= RULE_IDENT
            {
            lv_names_0_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIdent_ListAccess().getNamesIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdent_ListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            // InternalLustre.g:686:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLustre.g:687:4: otherlv_1= ',' ( (lv_names_2_0= RULE_IDENT ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdent_ListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLustre.g:691:4: ( (lv_names_2_0= RULE_IDENT ) )
            	    // InternalLustre.g:692:5: (lv_names_2_0= RULE_IDENT )
            	    {
            	    // InternalLustre.g:692:5: (lv_names_2_0= RULE_IDENT )
            	    // InternalLustre.g:693:6: lv_names_2_0= RULE_IDENT
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_IDENT,FOLLOW_15); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIdent_ListAccess().getNamesIDENTTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdent_ListRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
            	    					

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
    // $ANTLR end "ruleIdent_List"


    // $ANTLR start "entryRuleNode_Decl"
    // InternalLustre.g:714:1: entryRuleNode_Decl returns [EObject current=null] : iv_ruleNode_Decl= ruleNode_Decl EOF ;
    public final EObject entryRuleNode_Decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Decl = null;


        try {
            // InternalLustre.g:714:50: (iv_ruleNode_Decl= ruleNode_Decl EOF )
            // InternalLustre.g:715:2: iv_ruleNode_Decl= ruleNode_Decl EOF
            {
             newCompositeNode(grammarAccess.getNode_DeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_Decl=ruleNode_Decl();

            state._fsp--;

             current =iv_ruleNode_Decl; 
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
    // $ANTLR end "entryRuleNode_Decl"


    // $ANTLR start "ruleNode_Decl"
    // InternalLustre.g:721:1: ruleNode_Decl returns [EObject current=null] : ( ( (lv_head_0_0= ruleNode_Header ) ) ( (lv_bdy_1_0= ruleFN_Body ) ) ) ;
    public final EObject ruleNode_Decl() throws RecognitionException {
        EObject current = null;

        EObject lv_head_0_0 = null;

        EObject lv_bdy_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:727:2: ( ( ( (lv_head_0_0= ruleNode_Header ) ) ( (lv_bdy_1_0= ruleFN_Body ) ) ) )
            // InternalLustre.g:728:2: ( ( (lv_head_0_0= ruleNode_Header ) ) ( (lv_bdy_1_0= ruleFN_Body ) ) )
            {
            // InternalLustre.g:728:2: ( ( (lv_head_0_0= ruleNode_Header ) ) ( (lv_bdy_1_0= ruleFN_Body ) ) )
            // InternalLustre.g:729:3: ( (lv_head_0_0= ruleNode_Header ) ) ( (lv_bdy_1_0= ruleFN_Body ) )
            {
            // InternalLustre.g:729:3: ( (lv_head_0_0= ruleNode_Header ) )
            // InternalLustre.g:730:4: (lv_head_0_0= ruleNode_Header )
            {
            // InternalLustre.g:730:4: (lv_head_0_0= ruleNode_Header )
            // InternalLustre.g:731:5: lv_head_0_0= ruleNode_Header
            {

            					newCompositeNode(grammarAccess.getNode_DeclAccess().getHeadNode_HeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_head_0_0=ruleNode_Header();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_DeclRule());
            					}
            					set(
            						current,
            						"head",
            						lv_head_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.Node_Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:748:3: ( (lv_bdy_1_0= ruleFN_Body ) )
            // InternalLustre.g:749:4: (lv_bdy_1_0= ruleFN_Body )
            {
            // InternalLustre.g:749:4: (lv_bdy_1_0= ruleFN_Body )
            // InternalLustre.g:750:5: lv_bdy_1_0= ruleFN_Body
            {

            					newCompositeNode(grammarAccess.getNode_DeclAccess().getBdyFN_BodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_bdy_1_0=ruleFN_Body();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_DeclRule());
            					}
            					set(
            						current,
            						"bdy",
            						lv_bdy_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.FN_Body");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleNode_Decl"


    // $ANTLR start "entryRuleNode_Header"
    // InternalLustre.g:771:1: entryRuleNode_Header returns [EObject current=null] : iv_ruleNode_Header= ruleNode_Header EOF ;
    public final EObject entryRuleNode_Header() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Header = null;


        try {
            // InternalLustre.g:771:52: (iv_ruleNode_Header= ruleNode_Header EOF )
            // InternalLustre.g:772:2: iv_ruleNode_Header= ruleNode_Header EOF
            {
             newCompositeNode(grammarAccess.getNode_HeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_Header=ruleNode_Header();

            state._fsp--;

             current =iv_ruleNode_Header; 
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
    // $ANTLR end "entryRuleNode_Header"


    // $ANTLR start "ruleNode_Header"
    // InternalLustre.g:778:1: ruleNode_Header returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject ruleNode_Header() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_param_3_0 = null;

        EObject lv_ret_7_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:784:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' ) )
            // InternalLustre.g:785:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' )
            {
            // InternalLustre.g:785:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';' )
            // InternalLustre.g:786:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_IDENT ) ) otherlv_2= '(' ( (lv_param_3_0= ruleVar_Decl_List ) ) otherlv_4= ')' otherlv_5= 'returns' otherlv_6= '(' ( (lv_ret_7_0= ruleVar_Decl_List ) ) otherlv_8= ')' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNode_HeaderAccess().getNodeKeyword_0());
            		
            // InternalLustre.g:790:3: ( (lv_name_1_0= RULE_IDENT ) )
            // InternalLustre.g:791:4: (lv_name_1_0= RULE_IDENT )
            {
            // InternalLustre.g:791:4: (lv_name_1_0= RULE_IDENT )
            // InternalLustre.g:792:5: lv_name_1_0= RULE_IDENT
            {
            lv_name_1_0=(Token)match(input,RULE_IDENT,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNode_HeaderAccess().getNameIDENTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNode_HeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNode_HeaderAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLustre.g:812:3: ( (lv_param_3_0= ruleVar_Decl_List ) )
            // InternalLustre.g:813:4: (lv_param_3_0= ruleVar_Decl_List )
            {
            // InternalLustre.g:813:4: (lv_param_3_0= ruleVar_Decl_List )
            // InternalLustre.g:814:5: lv_param_3_0= ruleVar_Decl_List
            {

            					newCompositeNode(grammarAccess.getNode_HeaderAccess().getParamVar_Decl_ListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_param_3_0=ruleVar_Decl_List();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_HeaderRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_3_0,
            						"de.cau.cs.kieler.lustre.Lustre.Var_Decl_List");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getNode_HeaderAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getNode_HeaderAccess().getReturnsKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getNode_HeaderAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLustre.g:843:3: ( (lv_ret_7_0= ruleVar_Decl_List ) )
            // InternalLustre.g:844:4: (lv_ret_7_0= ruleVar_Decl_List )
            {
            // InternalLustre.g:844:4: (lv_ret_7_0= ruleVar_Decl_List )
            // InternalLustre.g:845:5: lv_ret_7_0= ruleVar_Decl_List
            {

            					newCompositeNode(grammarAccess.getNode_HeaderAccess().getRetVar_Decl_ListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_ret_7_0=ruleVar_Decl_List();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_HeaderRule());
            					}
            					set(
            						current,
            						"ret",
            						lv_ret_7_0,
            						"de.cau.cs.kieler.lustre.Lustre.Var_Decl_List");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getNode_HeaderAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNode_HeaderAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleNode_Header"


    // $ANTLR start "entryRuleVar_Decl_List"
    // InternalLustre.g:874:1: entryRuleVar_Decl_List returns [EObject current=null] : iv_ruleVar_Decl_List= ruleVar_Decl_List EOF ;
    public final EObject entryRuleVar_Decl_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar_Decl_List = null;


        try {
            // InternalLustre.g:874:54: (iv_ruleVar_Decl_List= ruleVar_Decl_List EOF )
            // InternalLustre.g:875:2: iv_ruleVar_Decl_List= ruleVar_Decl_List EOF
            {
             newCompositeNode(grammarAccess.getVar_Decl_ListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar_Decl_List=ruleVar_Decl_List();

            state._fsp--;

             current =iv_ruleVar_Decl_List; 
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
    // $ANTLR end "entryRuleVar_Decl_List"


    // $ANTLR start "ruleVar_Decl_List"
    // InternalLustre.g:881:1: ruleVar_Decl_List returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVar_Decl ) ) (otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) ) )* ) ;
    public final EObject ruleVar_Decl_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        EObject lv_varList_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:887:2: ( ( ( (lv_varList_0_0= ruleVar_Decl ) ) (otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) ) )* ) )
            // InternalLustre.g:888:2: ( ( (lv_varList_0_0= ruleVar_Decl ) ) (otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) ) )* )
            {
            // InternalLustre.g:888:2: ( ( (lv_varList_0_0= ruleVar_Decl ) ) (otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) ) )* )
            // InternalLustre.g:889:3: ( (lv_varList_0_0= ruleVar_Decl ) ) (otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) ) )*
            {
            // InternalLustre.g:889:3: ( (lv_varList_0_0= ruleVar_Decl ) )
            // InternalLustre.g:890:4: (lv_varList_0_0= ruleVar_Decl )
            {
            // InternalLustre.g:890:4: (lv_varList_0_0= ruleVar_Decl )
            // InternalLustre.g:891:5: lv_varList_0_0= ruleVar_Decl
            {

            					newCompositeNode(grammarAccess.getVar_Decl_ListAccess().getVarListVar_DeclParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_varList_0_0=ruleVar_Decl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVar_Decl_ListRule());
            					}
            					add(
            						current,
            						"varList",
            						lv_varList_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.Var_Decl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:908:3: (otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLustre.g:909:4: otherlv_1= ',' ( (lv_varList_2_0= ruleVar_Decl ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVar_Decl_ListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLustre.g:913:4: ( (lv_varList_2_0= ruleVar_Decl ) )
            	    // InternalLustre.g:914:5: (lv_varList_2_0= ruleVar_Decl )
            	    {
            	    // InternalLustre.g:914:5: (lv_varList_2_0= ruleVar_Decl )
            	    // InternalLustre.g:915:6: lv_varList_2_0= ruleVar_Decl
            	    {

            	    						newCompositeNode(grammarAccess.getVar_Decl_ListAccess().getVarListVar_DeclParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_varList_2_0=ruleVar_Decl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVar_Decl_ListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varList",
            	    							lv_varList_2_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Var_Decl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleVar_Decl_List"


    // $ANTLR start "entryRuleVar_Decl"
    // InternalLustre.g:937:1: entryRuleVar_Decl returns [EObject current=null] : iv_ruleVar_Decl= ruleVar_Decl EOF ;
    public final EObject entryRuleVar_Decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar_Decl = null;


        try {
            // InternalLustre.g:937:49: (iv_ruleVar_Decl= ruleVar_Decl EOF )
            // InternalLustre.g:938:2: iv_ruleVar_Decl= ruleVar_Decl EOF
            {
             newCompositeNode(grammarAccess.getVar_DeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar_Decl=ruleVar_Decl();

            state._fsp--;

             current =iv_ruleVar_Decl; 
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
    // $ANTLR end "entryRuleVar_Decl"


    // $ANTLR start "ruleVar_Decl"
    // InternalLustre.g:944:1: ruleVar_Decl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_clk_3_0= ruleDeclared_Clock ) )? ) ;
    public final EObject ruleVar_Decl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;

        EObject lv_clk_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:950:2: ( ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_clk_3_0= ruleDeclared_Clock ) )? ) )
            // InternalLustre.g:951:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_clk_3_0= ruleDeclared_Clock ) )? )
            {
            // InternalLustre.g:951:2: ( ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_clk_3_0= ruleDeclared_Clock ) )? )
            // InternalLustre.g:952:3: ( (lv_name_0_0= RULE_IDENT ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_clk_3_0= ruleDeclared_Clock ) )?
            {
            // InternalLustre.g:952:3: ( (lv_name_0_0= RULE_IDENT ) )
            // InternalLustre.g:953:4: (lv_name_0_0= RULE_IDENT )
            {
            // InternalLustre.g:953:4: (lv_name_0_0= RULE_IDENT )
            // InternalLustre.g:954:5: lv_name_0_0= RULE_IDENT
            {
            lv_name_0_0=(Token)match(input,RULE_IDENT,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVar_DeclAccess().getNameIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVar_DeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVar_DeclAccess().getColonKeyword_1());
            		
            // InternalLustre.g:974:3: ( (lv_type_2_0= ruleType ) )
            // InternalLustre.g:975:4: (lv_type_2_0= ruleType )
            {
            // InternalLustre.g:975:4: (lv_type_2_0= ruleType )
            // InternalLustre.g:976:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVar_DeclAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVar_DeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"de.cau.cs.kieler.lustre.Lustre.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:993:3: ( (lv_clk_3_0= ruleDeclared_Clock ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLustre.g:994:4: (lv_clk_3_0= ruleDeclared_Clock )
                    {
                    // InternalLustre.g:994:4: (lv_clk_3_0= ruleDeclared_Clock )
                    // InternalLustre.g:995:5: lv_clk_3_0= ruleDeclared_Clock
                    {

                    					newCompositeNode(grammarAccess.getVar_DeclAccess().getClkDeclared_ClockParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_clk_3_0=ruleDeclared_Clock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVar_DeclRule());
                    					}
                    					set(
                    						current,
                    						"clk",
                    						lv_clk_3_0,
                    						"de.cau.cs.kieler.lustre.Lustre.Declared_Clock");
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
    // $ANTLR end "ruleVar_Decl"


    // $ANTLR start "entryRuleDeclared_Clock"
    // InternalLustre.g:1016:1: entryRuleDeclared_Clock returns [EObject current=null] : iv_ruleDeclared_Clock= ruleDeclared_Clock EOF ;
    public final EObject entryRuleDeclared_Clock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclared_Clock = null;


        try {
            // InternalLustre.g:1016:55: (iv_ruleDeclared_Clock= ruleDeclared_Clock EOF )
            // InternalLustre.g:1017:2: iv_ruleDeclared_Clock= ruleDeclared_Clock EOF
            {
             newCompositeNode(grammarAccess.getDeclared_ClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclared_Clock=ruleDeclared_Clock();

            state._fsp--;

             current =iv_ruleDeclared_Clock; 
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
    // $ANTLR end "entryRuleDeclared_Clock"


    // $ANTLR start "ruleDeclared_Clock"
    // InternalLustre.g:1023:1: ruleDeclared_Clock returns [EObject current=null] : (otherlv_0= 'when' ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleDeclared_Clock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1029:2: ( (otherlv_0= 'when' ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalLustre.g:1030:2: (otherlv_0= 'when' ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalLustre.g:1030:2: (otherlv_0= 'when' ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalLustre.g:1031:3: otherlv_0= 'when' ( (lv_name_1_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclared_ClockAccess().getWhenKeyword_0());
            		
            // InternalLustre.g:1035:3: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalLustre.g:1036:4: (lv_name_1_0= ruleIdentifier )
            {
            // InternalLustre.g:1036:4: (lv_name_1_0= ruleIdentifier )
            // InternalLustre.g:1037:5: lv_name_1_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getDeclared_ClockAccess().getNameIdentifierParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclared_ClockRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.cau.cs.kieler.lustre.Lustre.Identifier");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDeclared_Clock"


    // $ANTLR start "entryRuleFN_Body"
    // InternalLustre.g:1058:1: entryRuleFN_Body returns [EObject current=null] : iv_ruleFN_Body= ruleFN_Body EOF ;
    public final EObject entryRuleFN_Body() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFN_Body = null;


        try {
            // InternalLustre.g:1058:48: (iv_ruleFN_Body= ruleFN_Body EOF )
            // InternalLustre.g:1059:2: iv_ruleFN_Body= ruleFN_Body EOF
            {
             newCompositeNode(grammarAccess.getFN_BodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFN_Body=ruleFN_Body();

            state._fsp--;

             current =iv_ruleFN_Body; 
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
    // $ANTLR end "entryRuleFN_Body"


    // $ANTLR start "ruleFN_Body"
    // InternalLustre.g:1065:1: ruleFN_Body returns [EObject current=null] : ( () ( (lv_decl_1_0= ruleLocal_Var_Decl ) )* otherlv_2= 'let' ( (lv_eq_3_0= ruleEquation ) )* otherlv_4= 'tel' (otherlv_5= ';' )? ) ;
    public final EObject ruleFN_Body() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_decl_1_0 = null;

        EObject lv_eq_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1071:2: ( ( () ( (lv_decl_1_0= ruleLocal_Var_Decl ) )* otherlv_2= 'let' ( (lv_eq_3_0= ruleEquation ) )* otherlv_4= 'tel' (otherlv_5= ';' )? ) )
            // InternalLustre.g:1072:2: ( () ( (lv_decl_1_0= ruleLocal_Var_Decl ) )* otherlv_2= 'let' ( (lv_eq_3_0= ruleEquation ) )* otherlv_4= 'tel' (otherlv_5= ';' )? )
            {
            // InternalLustre.g:1072:2: ( () ( (lv_decl_1_0= ruleLocal_Var_Decl ) )* otherlv_2= 'let' ( (lv_eq_3_0= ruleEquation ) )* otherlv_4= 'tel' (otherlv_5= ';' )? )
            // InternalLustre.g:1073:3: () ( (lv_decl_1_0= ruleLocal_Var_Decl ) )* otherlv_2= 'let' ( (lv_eq_3_0= ruleEquation ) )* otherlv_4= 'tel' (otherlv_5= ';' )?
            {
            // InternalLustre.g:1073:3: ()
            // InternalLustre.g:1074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFN_BodyAccess().getFN_BodyAction_0(),
            					current);
            			

            }

            // InternalLustre.g:1080:3: ( (lv_decl_1_0= ruleLocal_Var_Decl ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLustre.g:1081:4: (lv_decl_1_0= ruleLocal_Var_Decl )
            	    {
            	    // InternalLustre.g:1081:4: (lv_decl_1_0= ruleLocal_Var_Decl )
            	    // InternalLustre.g:1082:5: lv_decl_1_0= ruleLocal_Var_Decl
            	    {

            	    					newCompositeNode(grammarAccess.getFN_BodyAccess().getDeclLocal_Var_DeclParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_decl_1_0=ruleLocal_Var_Decl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFN_BodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decl",
            	    						lv_decl_1_0,
            	    						"de.cau.cs.kieler.lustre.Lustre.Local_Var_Decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getFN_BodyAccess().getLetKeyword_2());
            		
            // InternalLustre.g:1103:3: ( (lv_eq_3_0= ruleEquation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_IDENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLustre.g:1104:4: (lv_eq_3_0= ruleEquation )
            	    {
            	    // InternalLustre.g:1104:4: (lv_eq_3_0= ruleEquation )
            	    // InternalLustre.g:1105:5: lv_eq_3_0= ruleEquation
            	    {

            	    					newCompositeNode(grammarAccess.getFN_BodyAccess().getEqEquationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_eq_3_0=ruleEquation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFN_BodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eq",
            	    						lv_eq_3_0,
            	    						"de.cau.cs.kieler.lustre.Lustre.Equation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getFN_BodyAccess().getTelKeyword_4());
            		
            // InternalLustre.g:1126:3: (otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLustre.g:1127:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFN_BodyAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleFN_Body"


    // $ANTLR start "entryRuleLocal_Var_Decl"
    // InternalLustre.g:1136:1: entryRuleLocal_Var_Decl returns [EObject current=null] : iv_ruleLocal_Var_Decl= ruleLocal_Var_Decl EOF ;
    public final EObject entryRuleLocal_Var_Decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocal_Var_Decl = null;


        try {
            // InternalLustre.g:1136:55: (iv_ruleLocal_Var_Decl= ruleLocal_Var_Decl EOF )
            // InternalLustre.g:1137:2: iv_ruleLocal_Var_Decl= ruleLocal_Var_Decl EOF
            {
             newCompositeNode(grammarAccess.getLocal_Var_DeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocal_Var_Decl=ruleLocal_Var_Decl();

            state._fsp--;

             current =iv_ruleLocal_Var_Decl; 
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
    // $ANTLR end "entryRuleLocal_Var_Decl"


    // $ANTLR start "ruleLocal_Var_Decl"
    // InternalLustre.g:1143:1: ruleLocal_Var_Decl returns [EObject current=null] : (otherlv_0= 'var' this_Var_Decl_1= ruleVar_Decl otherlv_2= ';' ) ;
    public final EObject ruleLocal_Var_Decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Var_Decl_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1149:2: ( (otherlv_0= 'var' this_Var_Decl_1= ruleVar_Decl otherlv_2= ';' ) )
            // InternalLustre.g:1150:2: (otherlv_0= 'var' this_Var_Decl_1= ruleVar_Decl otherlv_2= ';' )
            {
            // InternalLustre.g:1150:2: (otherlv_0= 'var' this_Var_Decl_1= ruleVar_Decl otherlv_2= ';' )
            // InternalLustre.g:1151:3: otherlv_0= 'var' this_Var_Decl_1= ruleVar_Decl otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocal_Var_DeclAccess().getVarKeyword_0());
            		

            			newCompositeNode(grammarAccess.getLocal_Var_DeclAccess().getVar_DeclParserRuleCall_1());
            		
            pushFollow(FOLLOW_13);
            this_Var_Decl_1=ruleVar_Decl();

            state._fsp--;


            			current = this_Var_Decl_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLocal_Var_DeclAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleLocal_Var_Decl"


    // $ANTLR start "entryRuleEq_or_Ast"
    // InternalLustre.g:1171:1: entryRuleEq_or_Ast returns [EObject current=null] : iv_ruleEq_or_Ast= ruleEq_or_Ast EOF ;
    public final EObject entryRuleEq_or_Ast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEq_or_Ast = null;


        try {
            // InternalLustre.g:1171:50: (iv_ruleEq_or_Ast= ruleEq_or_Ast EOF )
            // InternalLustre.g:1172:2: iv_ruleEq_or_Ast= ruleEq_or_Ast EOF
            {
             newCompositeNode(grammarAccess.getEq_or_AstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEq_or_Ast=ruleEq_or_Ast();

            state._fsp--;

             current =iv_ruleEq_or_Ast; 
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
    // $ANTLR end "entryRuleEq_or_Ast"


    // $ANTLR start "ruleEq_or_Ast"
    // InternalLustre.g:1178:1: ruleEq_or_Ast returns [EObject current=null] : (this_Equation_0= ruleEquation | this_Assertion_1= ruleAssertion ) ;
    public final EObject ruleEq_or_Ast() throws RecognitionException {
        EObject current = null;

        EObject this_Equation_0 = null;

        EObject this_Assertion_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1184:2: ( (this_Equation_0= ruleEquation | this_Assertion_1= ruleAssertion ) )
            // InternalLustre.g:1185:2: (this_Equation_0= ruleEquation | this_Assertion_1= ruleAssertion )
            {
            // InternalLustre.g:1185:2: (this_Equation_0= ruleEquation | this_Assertion_1= ruleAssertion )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_IDENT) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLustre.g:1186:3: this_Equation_0= ruleEquation
                    {

                    			newCompositeNode(grammarAccess.getEq_or_AstAccess().getEquationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equation_0=ruleEquation();

                    state._fsp--;


                    			current = this_Equation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLustre.g:1195:3: this_Assertion_1= ruleAssertion
                    {

                    			newCompositeNode(grammarAccess.getEq_or_AstAccess().getAssertionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assertion_1=ruleAssertion();

                    state._fsp--;


                    			current = this_Assertion_1;
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
    // $ANTLR end "ruleEq_or_Ast"


    // $ANTLR start "entryRuleEquation"
    // InternalLustre.g:1207:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // InternalLustre.g:1207:49: (iv_ruleEquation= ruleEquation EOF )
            // InternalLustre.g:1208:2: iv_ruleEquation= ruleEquation EOF
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
    // InternalLustre.g:1214:1: ruleEquation returns [EObject current=null] : ( ( (lv_left_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1220:2: ( ( ( (lv_left_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' ) )
            // InternalLustre.g:1221:2: ( ( (lv_left_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            {
            // InternalLustre.g:1221:2: ( ( (lv_left_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';' )
            // InternalLustre.g:1222:3: ( (lv_left_0_0= RULE_IDENT ) ) otherlv_1= '=' ( (lv_right_2_0= ruleRight_Part ) ) otherlv_3= ';'
            {
            // InternalLustre.g:1222:3: ( (lv_left_0_0= RULE_IDENT ) )
            // InternalLustre.g:1223:4: (lv_left_0_0= RULE_IDENT )
            {
            // InternalLustre.g:1223:4: (lv_left_0_0= RULE_IDENT )
            // InternalLustre.g:1224:5: lv_left_0_0= RULE_IDENT
            {
            lv_left_0_0=(Token)match(input,RULE_IDENT,FOLLOW_21); 

            					newLeafNode(lv_left_0_0, grammarAccess.getEquationAccess().getLeftIDENTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.IDENT");
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
            		
            // InternalLustre.g:1244:3: ( (lv_right_2_0= ruleRight_Part ) )
            // InternalLustre.g:1245:4: (lv_right_2_0= ruleRight_Part )
            {
            // InternalLustre.g:1245:4: (lv_right_2_0= ruleRight_Part )
            // InternalLustre.g:1246:5: lv_right_2_0= ruleRight_Part
            {

            					newCompositeNode(grammarAccess.getEquationAccess().getRightRight_PartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleLeft_List"
    // InternalLustre.g:1271:1: entryRuleLeft_List returns [EObject current=null] : iv_ruleLeft_List= ruleLeft_List EOF ;
    public final EObject entryRuleLeft_List() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft_List = null;


        try {
            // InternalLustre.g:1271:50: (iv_ruleLeft_List= ruleLeft_List EOF )
            // InternalLustre.g:1272:2: iv_ruleLeft_List= ruleLeft_List EOF
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
    // InternalLustre.g:1278:1: ruleLeft_List returns [EObject current=null] : ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) ;
    public final EObject ruleLeft_List() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_id_2_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1284:2: ( ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* ) )
            // InternalLustre.g:1285:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            {
            // InternalLustre.g:1285:2: ( ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )* )
            // InternalLustre.g:1286:3: ( (lv_id_0_0= ruleLeft ) ) (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            {
            // InternalLustre.g:1286:3: ( (lv_id_0_0= ruleLeft ) )
            // InternalLustre.g:1287:4: (lv_id_0_0= ruleLeft )
            {
            // InternalLustre.g:1287:4: (lv_id_0_0= ruleLeft )
            // InternalLustre.g:1288:5: lv_id_0_0= ruleLeft
            {

            					newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalLustre.g:1305:3: (otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLustre.g:1306:4: otherlv_1= ',' ( (lv_id_2_0= ruleLeft ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLeft_ListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLustre.g:1310:4: ( (lv_id_2_0= ruleLeft ) )
            	    // InternalLustre.g:1311:5: (lv_id_2_0= ruleLeft )
            	    {
            	    // InternalLustre.g:1311:5: (lv_id_2_0= ruleLeft )
            	    // InternalLustre.g:1312:6: lv_id_2_0= ruleLeft
            	    {

            	    						newCompositeNode(grammarAccess.getLeft_ListAccess().getIdLeftParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop13;
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
    // InternalLustre.g:1334:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLustre.g:1334:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLustre.g:1335:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalLustre.g:1341:1: ruleLeft returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) ( (lv_sel_1_0= ruleSelector ) )? ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_sel_1_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1347:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) ( (lv_sel_1_0= ruleSelector ) )? ) )
            // InternalLustre.g:1348:2: ( ( (lv_name_0_0= ruleIdentifier ) ) ( (lv_sel_1_0= ruleSelector ) )? )
            {
            // InternalLustre.g:1348:2: ( ( (lv_name_0_0= ruleIdentifier ) ) ( (lv_sel_1_0= ruleSelector ) )? )
            // InternalLustre.g:1349:3: ( (lv_name_0_0= ruleIdentifier ) ) ( (lv_sel_1_0= ruleSelector ) )?
            {
            // InternalLustre.g:1349:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalLustre.g:1350:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalLustre.g:1350:4: (lv_name_0_0= ruleIdentifier )
            // InternalLustre.g:1351:5: lv_name_0_0= ruleIdentifier
            {

            					newCompositeNode(grammarAccess.getLeftAccess().getNameIdentifierParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.cau.cs.kieler.lustre.Lustre.Identifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLustre.g:1368:3: ( (lv_sel_1_0= ruleSelector ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=32)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLustre.g:1369:4: (lv_sel_1_0= ruleSelector )
                    {
                    // InternalLustre.g:1369:4: (lv_sel_1_0= ruleSelector )
                    // InternalLustre.g:1370:5: lv_sel_1_0= ruleSelector
                    {

                    					newCompositeNode(grammarAccess.getLeftAccess().getSelSelectorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sel_1_0=ruleSelector();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLeftRule());
                    					}
                    					set(
                    						current,
                    						"sel",
                    						lv_sel_1_0,
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
    // InternalLustre.g:1391:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalLustre.g:1391:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalLustre.g:1392:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalLustre.g:1398:1: ruleSelector returns [EObject current=null] : ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) ;
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
            // InternalLustre.g:1404:2: ( ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) ) )
            // InternalLustre.g:1405:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            {
            // InternalLustre.g:1405:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) ) | (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLustre.g:1406:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:1406:3: (otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) ) )
                    // InternalLustre.g:1407:4: otherlv_0= '.' ( (lv_name_1_0= RULE_IDENT ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getFullStopKeyword_0_0());
                    			
                    // InternalLustre.g:1411:4: ( (lv_name_1_0= RULE_IDENT ) )
                    // InternalLustre.g:1412:5: (lv_name_1_0= RULE_IDENT )
                    {
                    // InternalLustre.g:1412:5: (lv_name_1_0= RULE_IDENT )
                    // InternalLustre.g:1413:6: lv_name_1_0= RULE_IDENT
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
                    // InternalLustre.g:1431:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    {
                    // InternalLustre.g:1431:3: (otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']' )
                    // InternalLustre.g:1432:4: otherlv_2= '[' ( (lv_begin_3_0= ruleExpression ) ) ( (lv_end_4_0= ruleSelTrancheEnd ) )? otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalLustre.g:1436:4: ( (lv_begin_3_0= ruleExpression ) )
                    // InternalLustre.g:1437:5: (lv_begin_3_0= ruleExpression )
                    {
                    // InternalLustre.g:1437:5: (lv_begin_3_0= ruleExpression )
                    // InternalLustre.g:1438:6: lv_begin_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSelectorAccess().getBeginExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalLustre.g:1455:4: ( (lv_end_4_0= ruleSelTrancheEnd ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==34) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLustre.g:1456:5: (lv_end_4_0= ruleSelTrancheEnd )
                            {
                            // InternalLustre.g:1456:5: (lv_end_4_0= ruleSelTrancheEnd )
                            // InternalLustre.g:1457:6: lv_end_4_0= ruleSelTrancheEnd
                            {

                            						newCompositeNode(grammarAccess.getSelectorAccess().getEndSelTrancheEndParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalLustre.g:1483:1: entryRuleSelTrancheEnd returns [EObject current=null] : iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF ;
    public final EObject entryRuleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelTrancheEnd = null;


        try {
            // InternalLustre.g:1483:54: (iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF )
            // InternalLustre.g:1484:2: iv_ruleSelTrancheEnd= ruleSelTrancheEnd EOF
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
    // InternalLustre.g:1490:1: ruleSelTrancheEnd returns [EObject current=null] : (otherlv_0= '..' this_Expression_1= ruleExpression ) ;
    public final EObject ruleSelTrancheEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1496:2: ( (otherlv_0= '..' this_Expression_1= ruleExpression ) )
            // InternalLustre.g:1497:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            {
            // InternalLustre.g:1497:2: (otherlv_0= '..' this_Expression_1= ruleExpression )
            // InternalLustre.g:1498:3: otherlv_0= '..' this_Expression_1= ruleExpression
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); 

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
    // InternalLustre.g:1514:1: entryRuleRight_Part returns [EObject current=null] : iv_ruleRight_Part= ruleRight_Part EOF ;
    public final EObject entryRuleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight_Part = null;


        try {
            // InternalLustre.g:1514:51: (iv_ruleRight_Part= ruleRight_Part EOF )
            // InternalLustre.g:1515:2: iv_ruleRight_Part= ruleRight_Part EOF
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
    // InternalLustre.g:1521:1: ruleRight_Part returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRight_Part() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1527:2: (this_Expression_0= ruleExpression )
            // InternalLustre.g:1528:2: this_Expression_0= ruleExpression
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


    // $ANTLR start "entryRuleAssertion"
    // InternalLustre.g:1539:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalLustre.g:1539:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalLustre.g:1540:2: iv_ruleAssertion= ruleAssertion EOF
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
    // InternalLustre.g:1546:1: ruleAssertion returns [EObject current=null] : (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalLustre.g:1552:2: ( (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' ) )
            // InternalLustre.g:1553:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            {
            // InternalLustre.g:1553:2: (otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';' )
            // InternalLustre.g:1554:3: otherlv_0= 'assert' this_Expression_1= ruleExpression otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertionAccess().getAssertKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAssertionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_13);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExpression"
    // InternalLustre.g:1574:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLustre.g:1574:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLustre.g:1575:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLustre.g:1581:1: ruleExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) ;
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
            // InternalLustre.g:1587:2: ( ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby ) )
            // InternalLustre.g:1588:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            {
            // InternalLustre.g:1588:2: ( ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) ) | this_Fby_7= ruleFby )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_IDENT && LA17_0<=RULE_INT)||LA17_0==18||LA17_0==49||(LA17_0>=52 && LA17_0<=54)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLustre.g:1589:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    {
                    // InternalLustre.g:1589:3: ( () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) ) )
                    // InternalLustre.g:1590:4: () otherlv_1= 'if' ( (lv_ifexpr_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenexpr_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseexpr_6_0= ruleExpression ) )
                    {
                    // InternalLustre.g:1590:4: ()
                    // InternalLustre.g:1591:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpressionAccess().getIfThenElseAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,36,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getIfKeyword_0_1());
                    			
                    // InternalLustre.g:1601:4: ( (lv_ifexpr_2_0= ruleExpression ) )
                    // InternalLustre.g:1602:5: (lv_ifexpr_2_0= ruleExpression )
                    {
                    // InternalLustre.g:1602:5: (lv_ifexpr_2_0= ruleExpression )
                    // InternalLustre.g:1603:6: lv_ifexpr_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getIfexprExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    otherlv_3=(Token)match(input,37,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getThenKeyword_0_3());
                    			
                    // InternalLustre.g:1624:4: ( (lv_thenexpr_4_0= ruleExpression ) )
                    // InternalLustre.g:1625:5: (lv_thenexpr_4_0= ruleExpression )
                    {
                    // InternalLustre.g:1625:5: (lv_thenexpr_4_0= ruleExpression )
                    // InternalLustre.g:1626:6: lv_thenexpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getThenexprExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    otherlv_5=(Token)match(input,38,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getElseKeyword_0_5());
                    			
                    // InternalLustre.g:1647:4: ( (lv_elseexpr_6_0= ruleExpression ) )
                    // InternalLustre.g:1648:5: (lv_elseexpr_6_0= ruleExpression )
                    {
                    // InternalLustre.g:1648:5: (lv_elseexpr_6_0= ruleExpression )
                    // InternalLustre.g:1649:6: lv_elseexpr_6_0= ruleExpression
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
                    // InternalLustre.g:1668:3: this_Fby_7= ruleFby
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
    // InternalLustre.g:1680:1: entryRuleFby returns [EObject current=null] : iv_ruleFby= ruleFby EOF ;
    public final EObject entryRuleFby() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFby = null;


        try {
            // InternalLustre.g:1680:44: (iv_ruleFby= ruleFby EOF )
            // InternalLustre.g:1681:2: iv_ruleFby= ruleFby EOF
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
    // InternalLustre.g:1687:1: ruleFby returns [EObject current=null] : (this_Arrow_0= ruleArrow ( () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) ) )* ) ;
    public final EObject ruleFby() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Arrow_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1693:2: ( (this_Arrow_0= ruleArrow ( () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) ) )* ) )
            // InternalLustre.g:1694:2: (this_Arrow_0= ruleArrow ( () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) ) )* )
            {
            // InternalLustre.g:1694:2: (this_Arrow_0= ruleArrow ( () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) ) )* )
            // InternalLustre.g:1695:3: this_Arrow_0= ruleArrow ( () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) ) )*
            {

            			newCompositeNode(grammarAccess.getFbyAccess().getArrowParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Arrow_0=ruleArrow();

            state._fsp--;


            			current = this_Arrow_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1703:3: ( () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLustre.g:1704:4: () otherlv_2= 'fby' ( (lv_right_3_0= ruleArrow ) )
            	    {
            	    // InternalLustre.g:1704:4: ()
            	    // InternalLustre.g:1705:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFbyAccess().getFbyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,39,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFbyAccess().getFbyKeyword_1_1());
            	    			
            	    // InternalLustre.g:1715:4: ( (lv_right_3_0= ruleArrow ) )
            	    // InternalLustre.g:1716:5: (lv_right_3_0= ruleArrow )
            	    {
            	    // InternalLustre.g:1716:5: (lv_right_3_0= ruleArrow )
            	    // InternalLustre.g:1717:6: lv_right_3_0= ruleArrow
            	    {

            	    						newCompositeNode(grammarAccess.getFbyAccess().getRightArrowParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleArrow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFbyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Arrow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleFby"


    // $ANTLR start "entryRuleArrow"
    // InternalLustre.g:1739:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // InternalLustre.g:1739:46: (iv_ruleArrow= ruleArrow EOF )
            // InternalLustre.g:1740:2: iv_ruleArrow= ruleArrow EOF
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
    // InternalLustre.g:1746:1: ruleArrow returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1752:2: ( (this_Or_0= ruleOr ( () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalLustre.g:1753:2: (this_Or_0= ruleOr ( () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalLustre.g:1753:2: (this_Or_0= ruleOr ( () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalLustre.g:1754:3: this_Or_0= ruleOr ( () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getArrowAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1762:3: ( () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLustre.g:1763:4: () otherlv_2= '->' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalLustre.g:1763:4: ()
            	    // InternalLustre.g:1764:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getArrowAccess().getArrowLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalLustre.g:1774:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalLustre.g:1775:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalLustre.g:1775:5: (lv_right_3_0= ruleOr )
            	    // InternalLustre.g:1776:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getArrowAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArrowRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Or");
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
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleOr"
    // InternalLustre.g:1798:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLustre.g:1798:43: (iv_ruleOr= ruleOr EOF )
            // InternalLustre.g:1799:2: iv_ruleOr= ruleOr EOF
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
    // InternalLustre.g:1805:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1811:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalLustre.g:1812:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalLustre.g:1812:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalLustre.g:1813:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1821:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLustre.g:1822:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalLustre.g:1822:4: ()
            	    // InternalLustre.g:1823:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalLustre.g:1833:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalLustre.g:1834:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalLustre.g:1834:5: (lv_right_3_0= ruleAnd )
            	    // InternalLustre.g:1835:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalLustre.g:1857:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLustre.g:1857:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLustre.g:1858:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalLustre.g:1864:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1870:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalLustre.g:1871:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalLustre.g:1871:2: (this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalLustre.g:1872:3: this_Equality_0= ruleEquality ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1880:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLustre.g:1881:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalLustre.g:1881:4: ()
            	    // InternalLustre.g:1882:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_22); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalLustre.g:1892:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalLustre.g:1893:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalLustre.g:1893:5: (lv_right_3_0= ruleEquality )
            	    // InternalLustre.g:1894:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalLustre.g:1916:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalLustre.g:1916:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalLustre.g:1917:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalLustre.g:1923:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:1929:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalLustre.g:1930:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalLustre.g:1930:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalLustre.g:1931:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:1939:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30||LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLustre.g:1940:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalLustre.g:1940:4: ()
            	    // InternalLustre.g:1941:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalLustre.g:1947:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalLustre.g:1948:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalLustre.g:1948:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalLustre.g:1949:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalLustre.g:1949:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==30) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==43) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalLustre.g:1950:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:1961:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_22); 

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

            	    // InternalLustre.g:1974:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalLustre.g:1975:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalLustre.g:1975:5: (lv_right_3_0= ruleComparison )
            	    // InternalLustre.g:1976:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
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
            	    break loop23;
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
    // InternalLustre.g:1998:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalLustre.g:1998:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalLustre.g:1999:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalLustre.g:2005:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalLustre.g:2011:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalLustre.g:2012:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalLustre.g:2012:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalLustre.g:2013:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2021:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=44 && LA25_0<=47)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLustre.g:2022:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalLustre.g:2022:4: ()
            	    // InternalLustre.g:2023:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalLustre.g:2029:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalLustre.g:2030:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalLustre.g:2030:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalLustre.g:2031:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalLustre.g:2031:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt24=4;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalLustre.g:2032:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,44,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2043:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,45,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalLustre.g:2054:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,46,FOLLOW_22); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalLustre.g:2065:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,47,FOLLOW_22); 

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

            	    // InternalLustre.g:2078:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalLustre.g:2079:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalLustre.g:2079:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalLustre.g:2080:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop25;
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
    // InternalLustre.g:2102:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalLustre.g:2102:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalLustre.g:2103:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalLustre.g:2109:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2115:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalLustre.g:2116:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalLustre.g:2116:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalLustre.g:2117:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2125:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=48 && LA27_0<=49)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLustre.g:2126:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalLustre.g:2126:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==48) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==49) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalLustre.g:2127:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalLustre.g:2127:5: ( () otherlv_2= '+' )
            	            // InternalLustre.g:2128:6: () otherlv_2= '+'
            	            {
            	            // InternalLustre.g:2128:6: ()
            	            // InternalLustre.g:2129:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,48,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2141:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalLustre.g:2141:5: ( () otherlv_4= '-' )
            	            // InternalLustre.g:2142:6: () otherlv_4= '-'
            	            {
            	            // InternalLustre.g:2142:6: ()
            	            // InternalLustre.g:2143:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,49,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2155:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalLustre.g:2156:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalLustre.g:2156:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalLustre.g:2157:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalLustre.g:2179:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalLustre.g:2179:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalLustre.g:2180:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalLustre.g:2186:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2192:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalLustre.g:2193:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalLustre.g:2193:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalLustre.g:2194:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLustre.g:2202:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=50 && LA29_0<=51)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLustre.g:2203:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalLustre.g:2203:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==50) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==51) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalLustre.g:2204:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalLustre.g:2204:5: ( () otherlv_2= '*' )
            	            // InternalLustre.g:2205:6: () otherlv_2= '*'
            	            {
            	            // InternalLustre.g:2205:6: ()
            	            // InternalLustre.g:2206:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getMulLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,50,FOLLOW_22); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLustre.g:2218:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalLustre.g:2218:5: ( () otherlv_4= '/' )
            	            // InternalLustre.g:2219:6: () otherlv_4= '/'
            	            {
            	            // InternalLustre.g:2219:6: ()
            	            // InternalLustre.g:2220:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,51,FOLLOW_22); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLustre.g:2232:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalLustre.g:2233:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalLustre.g:2233:5: (lv_right_5_0= rulePrimary )
            	    // InternalLustre.g:2234:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"de.cau.cs.kieler.lustre.Lustre.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalLustre.g:2256:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLustre.g:2256:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLustre.g:2257:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalLustre.g:2263:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) ;
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
            // InternalLustre.g:2269:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression ) )
            // InternalLustre.g:2270:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            {
            // InternalLustre.g:2270:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) ) | ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) ) | ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) ) | ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) ) | this_AtomicExpression_15= ruleAtomicExpression )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt30=1;
                }
                break;
            case 52:
                {
                alt30=2;
                }
                break;
            case 49:
                {
                alt30=3;
                }
                break;
            case 53:
                {
                alt30=4;
                }
                break;
            case 54:
                {
                alt30=5;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_INT:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalLustre.g:2271:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalLustre.g:2271:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalLustre.g:2272:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLustre.g:2290:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2290:3: ( () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalLustre.g:2291:4: () otherlv_4= 'not' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2291:4: ()
                    // InternalLustre.g:2292:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,52,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
                    			
                    // InternalLustre.g:2302:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalLustre.g:2303:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalLustre.g:2303:5: (lv_expression_5_0= rulePrimary )
                    // InternalLustre.g:2304:6: lv_expression_5_0= rulePrimary
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
                    // InternalLustre.g:2323:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2323:3: ( () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) ) )
                    // InternalLustre.g:2324:4: () otherlv_7= '-' ( (lv_expression_8_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2324:4: ()
                    // InternalLustre.g:2325:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getUMinusAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,49,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
                    			
                    // InternalLustre.g:2335:4: ( (lv_expression_8_0= rulePrimary ) )
                    // InternalLustre.g:2336:5: (lv_expression_8_0= rulePrimary )
                    {
                    // InternalLustre.g:2336:5: (lv_expression_8_0= rulePrimary )
                    // InternalLustre.g:2337:6: lv_expression_8_0= rulePrimary
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
                    // InternalLustre.g:2356:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2356:3: ( () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) ) )
                    // InternalLustre.g:2357:4: () otherlv_10= 'pre' ( (lv_expression_11_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2357:4: ()
                    // InternalLustre.g:2358:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getPreAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrimaryAccess().getPreKeyword_3_1());
                    			
                    // InternalLustre.g:2368:4: ( (lv_expression_11_0= rulePrimary ) )
                    // InternalLustre.g:2369:5: (lv_expression_11_0= rulePrimary )
                    {
                    // InternalLustre.g:2369:5: (lv_expression_11_0= rulePrimary )
                    // InternalLustre.g:2370:6: lv_expression_11_0= rulePrimary
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
                    // InternalLustre.g:2389:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    {
                    // InternalLustre.g:2389:3: ( () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) ) )
                    // InternalLustre.g:2390:4: () otherlv_13= 'current' ( (lv_expression_14_0= rulePrimary ) )
                    {
                    // InternalLustre.g:2390:4: ()
                    // InternalLustre.g:2391:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getCurrentAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,54,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimaryAccess().getCurrentKeyword_4_1());
                    			
                    // InternalLustre.g:2401:4: ( (lv_expression_14_0= rulePrimary ) )
                    // InternalLustre.g:2402:5: (lv_expression_14_0= rulePrimary )
                    {
                    // InternalLustre.g:2402:5: (lv_expression_14_0= rulePrimary )
                    // InternalLustre.g:2403:6: lv_expression_14_0= rulePrimary
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
                    // InternalLustre.g:2422:3: this_AtomicExpression_15= ruleAtomicExpression
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
    // InternalLustre.g:2434:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalLustre.g:2434:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalLustre.g:2435:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalLustre.g:2441:1: ruleAtomicExpression returns [EObject current=null] : (this_ConstantExpression_0= ruleConstantExpression | ( () ( (lv_value_2_0= RULE_IDENT ) ) ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        EObject this_ConstantExpression_0 = null;



        	enterRule();

        try {
            // InternalLustre.g:2447:2: ( (this_ConstantExpression_0= ruleConstantExpression | ( () ( (lv_value_2_0= RULE_IDENT ) ) ) ) )
            // InternalLustre.g:2448:2: (this_ConstantExpression_0= ruleConstantExpression | ( () ( (lv_value_2_0= RULE_IDENT ) ) ) )
            {
            // InternalLustre.g:2448:2: (this_ConstantExpression_0= ruleConstantExpression | ( () ( (lv_value_2_0= RULE_IDENT ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_BOOL && LA31_0<=RULE_INT)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_IDENT) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalLustre.g:2449:3: this_ConstantExpression_0= ruleConstantExpression
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
                    // InternalLustre.g:2458:3: ( () ( (lv_value_2_0= RULE_IDENT ) ) )
                    {
                    // InternalLustre.g:2458:3: ( () ( (lv_value_2_0= RULE_IDENT ) ) )
                    // InternalLustre.g:2459:4: () ( (lv_value_2_0= RULE_IDENT ) )
                    {
                    // InternalLustre.g:2459:4: ()
                    // InternalLustre.g:2460:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicExpressionAccess().getVariablerefAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2466:4: ( (lv_value_2_0= RULE_IDENT ) )
                    // InternalLustre.g:2467:5: (lv_value_2_0= RULE_IDENT )
                    {
                    // InternalLustre.g:2467:5: (lv_value_2_0= RULE_IDENT )
                    // InternalLustre.g:2468:6: lv_value_2_0= RULE_IDENT
                    {
                    lv_value_2_0=(Token)match(input,RULE_IDENT,FOLLOW_2); 

                    						newLeafNode(lv_value_2_0, grammarAccess.getAtomicExpressionAccess().getValueIDENTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"de.cau.cs.kieler.lustre.Lustre.IDENT");
                    					

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleConstantExpression"
    // InternalLustre.g:2489:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // InternalLustre.g:2489:59: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // InternalLustre.g:2490:2: iv_ruleConstantExpression= ruleConstantExpression EOF
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
    // InternalLustre.g:2496:1: ruleConstantExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalLustre.g:2502:2: ( ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) ) )
            // InternalLustre.g:2503:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            {
            // InternalLustre.g:2503:2: ( ( () ( (lv_value_1_0= RULE_BOOL ) ) ) | ( () ( (lv_value_3_0= RULE_FLOAT ) ) ) | ( () ( (lv_value_5_0= RULE_INT ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt32=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalLustre.g:2504:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    {
                    // InternalLustre.g:2504:3: ( () ( (lv_value_1_0= RULE_BOOL ) ) )
                    // InternalLustre.g:2505:4: () ( (lv_value_1_0= RULE_BOOL ) )
                    {
                    // InternalLustre.g:2505:4: ()
                    // InternalLustre.g:2506:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getBooleanConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2512:4: ( (lv_value_1_0= RULE_BOOL ) )
                    // InternalLustre.g:2513:5: (lv_value_1_0= RULE_BOOL )
                    {
                    // InternalLustre.g:2513:5: (lv_value_1_0= RULE_BOOL )
                    // InternalLustre.g:2514:6: lv_value_1_0= RULE_BOOL
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
                    // InternalLustre.g:2532:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    {
                    // InternalLustre.g:2532:3: ( () ( (lv_value_3_0= RULE_FLOAT ) ) )
                    // InternalLustre.g:2533:4: () ( (lv_value_3_0= RULE_FLOAT ) )
                    {
                    // InternalLustre.g:2533:4: ()
                    // InternalLustre.g:2534:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getFloatConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2540:4: ( (lv_value_3_0= RULE_FLOAT ) )
                    // InternalLustre.g:2541:5: (lv_value_3_0= RULE_FLOAT )
                    {
                    // InternalLustre.g:2541:5: (lv_value_3_0= RULE_FLOAT )
                    // InternalLustre.g:2542:6: lv_value_3_0= RULE_FLOAT
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
                    // InternalLustre.g:2560:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    {
                    // InternalLustre.g:2560:3: ( () ( (lv_value_5_0= RULE_INT ) ) )
                    // InternalLustre.g:2561:4: () ( (lv_value_5_0= RULE_INT ) )
                    {
                    // InternalLustre.g:2561:4: ()
                    // InternalLustre.g:2562:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantExpressionAccess().getIntConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalLustre.g:2568:4: ( (lv_value_5_0= RULE_INT ) )
                    // InternalLustre.g:2569:5: (lv_value_5_0= RULE_INT )
                    {
                    // InternalLustre.g:2569:5: (lv_value_5_0= RULE_INT )
                    // InternalLustre.g:2570:6: lv_value_5_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00720010000400F0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080040000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000C000000000002L});

}