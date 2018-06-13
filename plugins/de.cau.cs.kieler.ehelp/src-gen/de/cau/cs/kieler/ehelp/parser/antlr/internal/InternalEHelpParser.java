package de.cau.cs.kieler.ehelp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.ehelp.services.EHelpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEHelpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'path'", "'home'", "'chapter'", "'{'", "'}'", "'list'", "'enum'", "'-'", "'table'", "'spacing'", "'='", "'stretch'", "'|'", "'center'", "'left'", "'right'", "'top'", "'middle'", "'bottom'", "'?'", "'!'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
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


        public InternalEHelpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEHelpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEHelpParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEHelp.g"; }



     	private EHelpGrammarAccess grammarAccess;

        public InternalEHelpParser(TokenStream input, EHelpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EHelpModel";
       	}

       	@Override
       	protected EHelpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEHelpModel"
    // InternalEHelp.g:64:1: entryRuleEHelpModel returns [EObject current=null] : iv_ruleEHelpModel= ruleEHelpModel EOF ;
    public final EObject entryRuleEHelpModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHelpModel = null;


        try {
            // InternalEHelp.g:64:51: (iv_ruleEHelpModel= ruleEHelpModel EOF )
            // InternalEHelp.g:65:2: iv_ruleEHelpModel= ruleEHelpModel EOF
            {
             newCompositeNode(grammarAccess.getEHelpModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHelpModel=ruleEHelpModel();

            state._fsp--;

             current =iv_ruleEHelpModel; 
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
    // $ANTLR end "entryRuleEHelpModel"


    // $ANTLR start "ruleEHelpModel"
    // InternalEHelp.g:71:1: ruleEHelpModel returns [EObject current=null] : ( ( (lv_configs_0_0= ruleConfig ) )* ( (lv_chapters_1_0= ruleChapter ) )* ) ;
    public final EObject ruleEHelpModel() throws RecognitionException {
        EObject current = null;

        EObject lv_configs_0_0 = null;

        EObject lv_chapters_1_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:77:2: ( ( ( (lv_configs_0_0= ruleConfig ) )* ( (lv_chapters_1_0= ruleChapter ) )* ) )
            // InternalEHelp.g:78:2: ( ( (lv_configs_0_0= ruleConfig ) )* ( (lv_chapters_1_0= ruleChapter ) )* )
            {
            // InternalEHelp.g:78:2: ( ( (lv_configs_0_0= ruleConfig ) )* ( (lv_chapters_1_0= ruleChapter ) )* )
            // InternalEHelp.g:79:3: ( (lv_configs_0_0= ruleConfig ) )* ( (lv_chapters_1_0= ruleChapter ) )*
            {
            // InternalEHelp.g:79:3: ( (lv_configs_0_0= ruleConfig ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEHelp.g:80:4: (lv_configs_0_0= ruleConfig )
            	    {
            	    // InternalEHelp.g:80:4: (lv_configs_0_0= ruleConfig )
            	    // InternalEHelp.g:81:5: lv_configs_0_0= ruleConfig
            	    {

            	    					newCompositeNode(grammarAccess.getEHelpModelAccess().getConfigsConfigParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_configs_0_0=ruleConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEHelpModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configs",
            	    						lv_configs_0_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.Config");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEHelp.g:98:3: ( (lv_chapters_1_0= ruleChapter ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEHelp.g:99:4: (lv_chapters_1_0= ruleChapter )
            	    {
            	    // InternalEHelp.g:99:4: (lv_chapters_1_0= ruleChapter )
            	    // InternalEHelp.g:100:5: lv_chapters_1_0= ruleChapter
            	    {

            	    					newCompositeNode(grammarAccess.getEHelpModelAccess().getChaptersChapterParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_chapters_1_0=ruleChapter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEHelpModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chapters",
            	    						lv_chapters_1_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.Chapter");
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
    // $ANTLR end "ruleEHelpModel"


    // $ANTLR start "entryRuleConfig"
    // InternalEHelp.g:121:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalEHelp.g:121:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalEHelp.g:122:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalEHelp.g:128:1: ruleConfig returns [EObject current=null] : (this_ConfigPath_0= ruleConfigPath | this_ConfigHome_1= ruleConfigHome ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        EObject this_ConfigPath_0 = null;

        EObject this_ConfigHome_1 = null;



        	enterRule();

        try {
            // InternalEHelp.g:134:2: ( (this_ConfigPath_0= ruleConfigPath | this_ConfigHome_1= ruleConfigHome ) )
            // InternalEHelp.g:135:2: (this_ConfigPath_0= ruleConfigPath | this_ConfigHome_1= ruleConfigHome )
            {
            // InternalEHelp.g:135:2: (this_ConfigPath_0= ruleConfigPath | this_ConfigHome_1= ruleConfigHome )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==12) ) {
                    alt3=1;
                }
                else if ( (LA3_1==13) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEHelp.g:136:3: this_ConfigPath_0= ruleConfigPath
                    {

                    			newCompositeNode(grammarAccess.getConfigAccess().getConfigPathParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConfigPath_0=ruleConfigPath();

                    state._fsp--;


                    			current = this_ConfigPath_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEHelp.g:145:3: this_ConfigHome_1= ruleConfigHome
                    {

                    			newCompositeNode(grammarAccess.getConfigAccess().getConfigHomeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConfigHome_1=ruleConfigHome();

                    state._fsp--;


                    			current = this_ConfigHome_1;
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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleConfigPath"
    // InternalEHelp.g:157:1: entryRuleConfigPath returns [EObject current=null] : iv_ruleConfigPath= ruleConfigPath EOF ;
    public final EObject entryRuleConfigPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigPath = null;


        try {
            // InternalEHelp.g:157:51: (iv_ruleConfigPath= ruleConfigPath EOF )
            // InternalEHelp.g:158:2: iv_ruleConfigPath= ruleConfigPath EOF
            {
             newCompositeNode(grammarAccess.getConfigPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigPath=ruleConfigPath();

            state._fsp--;

             current =iv_ruleConfigPath; 
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
    // $ANTLR end "entryRuleConfigPath"


    // $ANTLR start "ruleConfigPath"
    // InternalEHelp.g:164:1: ruleConfigPath returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;


        	enterRule();

        try {
            // InternalEHelp.g:170:2: ( (otherlv_0= 'config' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) ) )
            // InternalEHelp.g:171:2: (otherlv_0= 'config' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) )
            {
            // InternalEHelp.g:171:2: (otherlv_0= 'config' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) ) )
            // InternalEHelp.g:172:3: otherlv_0= 'config' otherlv_1= 'path' ( (lv_path_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigPathAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigPathAccess().getPathKeyword_1());
            		
            // InternalEHelp.g:180:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalEHelp.g:181:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalEHelp.g:181:4: (lv_path_2_0= RULE_STRING )
            // InternalEHelp.g:182:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_2_0, grammarAccess.getConfigPathAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigPathRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
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
    // $ANTLR end "ruleConfigPath"


    // $ANTLR start "entryRuleConfigHome"
    // InternalEHelp.g:202:1: entryRuleConfigHome returns [EObject current=null] : iv_ruleConfigHome= ruleConfigHome EOF ;
    public final EObject entryRuleConfigHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigHome = null;


        try {
            // InternalEHelp.g:202:51: (iv_ruleConfigHome= ruleConfigHome EOF )
            // InternalEHelp.g:203:2: iv_ruleConfigHome= ruleConfigHome EOF
            {
             newCompositeNode(grammarAccess.getConfigHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigHome=ruleConfigHome();

            state._fsp--;

             current =iv_ruleConfigHome; 
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
    // $ANTLR end "entryRuleConfigHome"


    // $ANTLR start "ruleConfigHome"
    // InternalEHelp.g:209:1: ruleConfigHome returns [EObject current=null] : (otherlv_0= 'config' otherlv_1= 'home' ( (lv_home_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_home_2_0=null;


        	enterRule();

        try {
            // InternalEHelp.g:215:2: ( (otherlv_0= 'config' otherlv_1= 'home' ( (lv_home_2_0= RULE_STRING ) ) ) )
            // InternalEHelp.g:216:2: (otherlv_0= 'config' otherlv_1= 'home' ( (lv_home_2_0= RULE_STRING ) ) )
            {
            // InternalEHelp.g:216:2: (otherlv_0= 'config' otherlv_1= 'home' ( (lv_home_2_0= RULE_STRING ) ) )
            // InternalEHelp.g:217:3: otherlv_0= 'config' otherlv_1= 'home' ( (lv_home_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigHomeAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigHomeAccess().getHomeKeyword_1());
            		
            // InternalEHelp.g:225:3: ( (lv_home_2_0= RULE_STRING ) )
            // InternalEHelp.g:226:4: (lv_home_2_0= RULE_STRING )
            {
            // InternalEHelp.g:226:4: (lv_home_2_0= RULE_STRING )
            // InternalEHelp.g:227:5: lv_home_2_0= RULE_STRING
            {
            lv_home_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_home_2_0, grammarAccess.getConfigHomeAccess().getHomeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigHomeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"home",
            						lv_home_2_0,
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
    // $ANTLR end "ruleConfigHome"


    // $ANTLR start "entryRuleChapter"
    // InternalEHelp.g:247:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // InternalEHelp.g:247:48: (iv_ruleChapter= ruleChapter EOF )
            // InternalEHelp.g:248:2: iv_ruleChapter= ruleChapter EOF
            {
             newCompositeNode(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalEHelp.g:254:1: ruleChapter returns [EObject current=null] : (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_content_4_0 = null;

        EObject lv_subchapters_5_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:260:2: ( (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' ) )
            // InternalEHelp.g:261:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' )
            {
            // InternalEHelp.g:261:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' )
            // InternalEHelp.g:262:3: otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getChapterAccess().getChapterKeyword_0());
            		
            // InternalEHelp.g:266:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEHelp.g:267:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalEHelp.g:267:4: (lv_name_1_0= RULE_ID )
                    // InternalEHelp.g:268:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getChapterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:284:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalEHelp.g:285:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalEHelp.g:285:4: (lv_title_2_0= RULE_STRING )
            // InternalEHelp.g:286:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_title_2_0, grammarAccess.getChapterAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChapterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEHelp.g:306:3: ( (lv_content_4_0= ruleContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||(LA5_0>=17 && LA5_0<=18)||LA5_0==20||(LA5_0>=31 && LA5_0<=33)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEHelp.g:307:4: (lv_content_4_0= ruleContent )
            	    {
            	    // InternalEHelp.g:307:4: (lv_content_4_0= ruleContent )
            	    // InternalEHelp.g:308:5: lv_content_4_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getChapterAccess().getContentContentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_content_4_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChapterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_4_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalEHelp.g:325:3: ( (lv_subchapters_5_0= ruleChapter ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEHelp.g:326:4: (lv_subchapters_5_0= ruleChapter )
            	    {
            	    // InternalEHelp.g:326:4: (lv_subchapters_5_0= ruleChapter )
            	    // InternalEHelp.g:327:5: lv_subchapters_5_0= ruleChapter
            	    {

            	    					newCompositeNode(grammarAccess.getChapterAccess().getSubchaptersChapterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_subchapters_5_0=ruleChapter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChapterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subchapters",
            	    						lv_subchapters_5_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.Chapter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleList"
    // InternalEHelp.g:352:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalEHelp.g:352:45: (iv_ruleList= ruleList EOF )
            // InternalEHelp.g:353:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalEHelp.g:359:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:365:2: ( (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) )
            // InternalEHelp.g:366:2: (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            {
            // InternalEHelp.g:366:2: (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            // InternalEHelp.g:367:3: otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEHelp.g:375:3: ( (lv_items_2_0= ruleListItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEHelp.g:376:4: (lv_items_2_0= ruleListItem )
            	    {
            	    // InternalEHelp.g:376:4: (lv_items_2_0= ruleListItem )
            	    // InternalEHelp.g:377:5: lv_items_2_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getItemsListItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_items_2_0=ruleListItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.ListItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getListAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleEnum"
    // InternalEHelp.g:402:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalEHelp.g:402:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalEHelp.g:403:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalEHelp.g:409:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:415:2: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) )
            // InternalEHelp.g:416:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            {
            // InternalEHelp.g:416:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            // InternalEHelp.g:417:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEHelp.g:425:3: ( (lv_items_2_0= ruleListItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEHelp.g:426:4: (lv_items_2_0= ruleListItem )
            	    {
            	    // InternalEHelp.g:426:4: (lv_items_2_0= ruleListItem )
            	    // InternalEHelp.g:427:5: lv_items_2_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getItemsListItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_items_2_0=ruleListItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.ListItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleListItem"
    // InternalEHelp.g:452:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalEHelp.g:452:49: (iv_ruleListItem= ruleListItem EOF )
            // InternalEHelp.g:453:2: iv_ruleListItem= ruleListItem EOF
            {
             newCompositeNode(grammarAccess.getListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListItem=ruleListItem();

            state._fsp--;

             current =iv_ruleListItem; 
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
    // $ANTLR end "entryRuleListItem"


    // $ANTLR start "ruleListItem"
    // InternalEHelp.g:459:1: ruleListItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* ) ;
    public final EObject ruleListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:465:2: ( (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* ) )
            // InternalEHelp.g:466:2: (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* )
            {
            // InternalEHelp.g:466:2: (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* )
            // InternalEHelp.g:467:3: otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getListItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalEHelp.g:471:3: ( (lv_content_1_0= ruleContent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||(LA9_0>=17 && LA9_0<=18)||LA9_0==20||(LA9_0>=31 && LA9_0<=33)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEHelp.g:472:4: (lv_content_1_0= ruleContent )
            	    {
            	    // InternalEHelp.g:472:4: (lv_content_1_0= ruleContent )
            	    // InternalEHelp.g:473:5: lv_content_1_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getListItemAccess().getContentContentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_content_1_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListItemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_1_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleContent"
    // InternalEHelp.g:494:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalEHelp.g:494:48: (iv_ruleContent= ruleContent EOF )
            // InternalEHelp.g:495:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalEHelp.g:501:1: ruleContent returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Keyword_0 = null;

        EObject this_Context_1 = null;

        EObject this_Text_2 = null;

        EObject this_Images_3 = null;

        EObject this_Link_4 = null;

        EObject this_List_5 = null;

        EObject this_Enum_6 = null;

        EObject this_Table_7 = null;



        	enterRule();

        try {
            // InternalEHelp.g:507:2: ( (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable ) )
            // InternalEHelp.g:508:2: (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable )
            {
            // InternalEHelp.g:508:2: (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalEHelp.g:509:3: this_Keyword_0= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getKeywordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keyword_0=ruleKeyword();

                    state._fsp--;


                    			current = this_Keyword_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEHelp.g:518:3: this_Context_1= ruleContext
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getContextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Context_1=ruleContext();

                    state._fsp--;


                    			current = this_Context_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEHelp.g:527:3: this_Text_2= ruleText
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_2=ruleText();

                    state._fsp--;


                    			current = this_Text_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEHelp.g:536:3: this_Images_3= ruleImages
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getImagesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Images_3=ruleImages();

                    state._fsp--;


                    			current = this_Images_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEHelp.g:545:3: this_Link_4= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getLinkParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_4=ruleLink();

                    state._fsp--;


                    			current = this_Link_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEHelp.g:554:3: this_List_5= ruleList
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getListParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_5=ruleList();

                    state._fsp--;


                    			current = this_List_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalEHelp.g:563:3: this_Enum_6= ruleEnum
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getEnumParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enum_6=ruleEnum();

                    state._fsp--;


                    			current = this_Enum_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalEHelp.g:572:3: this_Table_7= ruleTable
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getTableParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Table_7=ruleTable();

                    state._fsp--;


                    			current = this_Table_7;
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


    // $ANTLR start "entryRuleTable"
    // InternalEHelp.g:584:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalEHelp.g:584:46: (iv_ruleTable= ruleTable EOF )
            // InternalEHelp.g:585:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalEHelp.g:591:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_width_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_spacing_4_0=null;
        Token lv_stretch_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_rows_7_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:597:2: ( (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' ) )
            // InternalEHelp.g:598:2: (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' )
            {
            // InternalEHelp.g:598:2: (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' )
            // InternalEHelp.g:599:3: otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalEHelp.g:603:3: ( (lv_width_1_0= RULE_INT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEHelp.g:604:4: (lv_width_1_0= RULE_INT )
                    {
                    // InternalEHelp.g:604:4: (lv_width_1_0= RULE_INT )
                    // InternalEHelp.g:605:5: lv_width_1_0= RULE_INT
                    {
                    lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    					newLeafNode(lv_width_1_0, grammarAccess.getTableAccess().getWidthINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"width",
                    						lv_width_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:621:3: (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEHelp.g:622:4: otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableAccess().getSpacingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getTableAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalEHelp.g:630:4: ( (lv_spacing_4_0= RULE_INT ) )
                    // InternalEHelp.g:631:5: (lv_spacing_4_0= RULE_INT )
                    {
                    // InternalEHelp.g:631:5: (lv_spacing_4_0= RULE_INT )
                    // InternalEHelp.g:632:6: lv_spacing_4_0= RULE_INT
                    {
                    lv_spacing_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_spacing_4_0, grammarAccess.getTableAccess().getSpacingINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"spacing",
                    							lv_spacing_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEHelp.g:649:3: ( (lv_stretch_5_0= 'stretch' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEHelp.g:650:4: (lv_stretch_5_0= 'stretch' )
                    {
                    // InternalEHelp.g:650:4: (lv_stretch_5_0= 'stretch' )
                    // InternalEHelp.g:651:5: lv_stretch_5_0= 'stretch'
                    {
                    lv_stretch_5_0=(Token)match(input,23,FOLLOW_9); 

                    					newLeafNode(lv_stretch_5_0, grammarAccess.getTableAccess().getStretchStretchKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    					setWithLastConsumed(current, "stretch", true, "stretch");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEHelp.g:667:3: ( (lv_rows_7_0= ruleTableRow ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEHelp.g:668:4: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // InternalEHelp.g:668:4: (lv_rows_7_0= ruleTableRow )
            	    // InternalEHelp.g:669:5: lv_rows_7_0= ruleTableRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rows_7_0=ruleTableRow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rows",
            	    						lv_rows_7_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.TableRow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleTableRow"
    // InternalEHelp.g:694:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalEHelp.g:694:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalEHelp.g:695:2: iv_ruleTableRow= ruleTableRow EOF
            {
             newCompositeNode(grammarAccess.getTableRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableRow=ruleTableRow();

            state._fsp--;

             current =iv_ruleTableRow; 
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
    // $ANTLR end "entryRuleTableRow"


    // $ANTLR start "ruleTableRow"
    // InternalEHelp.g:701:1: ruleTableRow returns [EObject current=null] : (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;

        EObject lv_cells_3_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:707:2: ( (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* ) )
            // InternalEHelp.g:708:2: (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* )
            {
            // InternalEHelp.g:708:2: (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* )
            // InternalEHelp.g:709:3: otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getHyphenMinusKeyword_0());
            		
            // InternalEHelp.g:713:3: ( (lv_cells_1_0= ruleTableCell ) )
            // InternalEHelp.g:714:4: (lv_cells_1_0= ruleTableCell )
            {
            // InternalEHelp.g:714:4: (lv_cells_1_0= ruleTableCell )
            // InternalEHelp.g:715:5: lv_cells_1_0= ruleTableCell
            {

            					newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_cells_1_0=ruleTableCell();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRowRule());
            					}
            					add(
            						current,
            						"cells",
            						lv_cells_1_0,
            						"de.cau.cs.kieler.ehelp.EHelp.TableCell");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEHelp.g:732:3: (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEHelp.g:733:4: otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_19); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalEHelp.g:737:4: ( (lv_cells_3_0= ruleTableCell ) )
            	    // InternalEHelp.g:738:5: (lv_cells_3_0= ruleTableCell )
            	    {
            	    // InternalEHelp.g:738:5: (lv_cells_3_0= ruleTableCell )
            	    // InternalEHelp.g:739:6: lv_cells_3_0= ruleTableCell
            	    {

            	    						newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_cells_3_0=ruleTableCell();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cells",
            	    							lv_cells_3_0,
            	    							"de.cau.cs.kieler.ehelp.EHelp.TableCell");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableCell"
    // InternalEHelp.g:761:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // InternalEHelp.g:761:50: (iv_ruleTableCell= ruleTableCell EOF )
            // InternalEHelp.g:762:2: iv_ruleTableCell= ruleTableCell EOF
            {
             newCompositeNode(grammarAccess.getTableCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableCell=ruleTableCell();

            state._fsp--;

             current =iv_ruleTableCell; 
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
    // $ANTLR end "entryRuleTableCell"


    // $ANTLR start "ruleTableCell"
    // InternalEHelp.g:768:1: ruleTableCell returns [EObject current=null] : ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* ) ;
    public final EObject ruleTableCell() throws RecognitionException {
        EObject current = null;

        Token lv_center_0_0=null;
        Token lv_left_1_0=null;
        Token lv_right_2_0=null;
        Token lv_top_3_0=null;
        Token lv_middle_4_0=null;
        Token lv_bottom_5_0=null;
        EObject lv_content_6_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:774:2: ( ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* ) )
            // InternalEHelp.g:775:2: ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* )
            {
            // InternalEHelp.g:775:2: ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* )
            // InternalEHelp.g:776:3: ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )*
            {
            // InternalEHelp.g:776:3: ( (lv_center_0_0= 'center' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEHelp.g:777:4: (lv_center_0_0= 'center' )
                    {
                    // InternalEHelp.g:777:4: (lv_center_0_0= 'center' )
                    // InternalEHelp.g:778:5: lv_center_0_0= 'center'
                    {
                    lv_center_0_0=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(lv_center_0_0, grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "center", true, "center");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:790:3: ( (lv_left_1_0= 'left' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEHelp.g:791:4: (lv_left_1_0= 'left' )
                    {
                    // InternalEHelp.g:791:4: (lv_left_1_0= 'left' )
                    // InternalEHelp.g:792:5: lv_left_1_0= 'left'
                    {
                    lv_left_1_0=(Token)match(input,26,FOLLOW_22); 

                    					newLeafNode(lv_left_1_0, grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "left", true, "left");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:804:3: ( (lv_right_2_0= 'right' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEHelp.g:805:4: (lv_right_2_0= 'right' )
                    {
                    // InternalEHelp.g:805:4: (lv_right_2_0= 'right' )
                    // InternalEHelp.g:806:5: lv_right_2_0= 'right'
                    {
                    lv_right_2_0=(Token)match(input,27,FOLLOW_23); 

                    					newLeafNode(lv_right_2_0, grammarAccess.getTableCellAccess().getRightRightKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "right", true, "right");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:818:3: ( (lv_top_3_0= 'top' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEHelp.g:819:4: (lv_top_3_0= 'top' )
                    {
                    // InternalEHelp.g:819:4: (lv_top_3_0= 'top' )
                    // InternalEHelp.g:820:5: lv_top_3_0= 'top'
                    {
                    lv_top_3_0=(Token)match(input,28,FOLLOW_24); 

                    					newLeafNode(lv_top_3_0, grammarAccess.getTableCellAccess().getTopTopKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "top", true, "top");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:832:3: ( (lv_middle_4_0= 'middle' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEHelp.g:833:4: (lv_middle_4_0= 'middle' )
                    {
                    // InternalEHelp.g:833:4: (lv_middle_4_0= 'middle' )
                    // InternalEHelp.g:834:5: lv_middle_4_0= 'middle'
                    {
                    lv_middle_4_0=(Token)match(input,29,FOLLOW_25); 

                    					newLeafNode(lv_middle_4_0, grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "middle", true, "middle");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:846:3: ( (lv_bottom_5_0= 'bottom' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEHelp.g:847:4: (lv_bottom_5_0= 'bottom' )
                    {
                    // InternalEHelp.g:847:4: (lv_bottom_5_0= 'bottom' )
                    // InternalEHelp.g:848:5: lv_bottom_5_0= 'bottom'
                    {
                    lv_bottom_5_0=(Token)match(input,30,FOLLOW_13); 

                    					newLeafNode(lv_bottom_5_0, grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "bottom", true, "bottom");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:860:3: ( (lv_content_6_0= ruleContent ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||(LA22_0>=17 && LA22_0<=18)||LA22_0==20||(LA22_0>=31 && LA22_0<=33)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEHelp.g:861:4: (lv_content_6_0= ruleContent )
            	    {
            	    // InternalEHelp.g:861:4: (lv_content_6_0= ruleContent )
            	    // InternalEHelp.g:862:5: lv_content_6_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getTableCellAccess().getContentContentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_content_6_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableCellRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_6_0,
            	    						"de.cau.cs.kieler.ehelp.EHelp.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleTableCell"


    // $ANTLR start "entryRuleText"
    // InternalEHelp.g:883:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalEHelp.g:883:45: (iv_ruleText= ruleText EOF )
            // InternalEHelp.g:884:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalEHelp.g:890:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEHelp.g:896:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalEHelp.g:897:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalEHelp.g:897:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalEHelp.g:898:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalEHelp.g:898:3: (lv_text_0_0= RULE_STRING )
            // InternalEHelp.g:899:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleKeyword"
    // InternalEHelp.g:918:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // InternalEHelp.g:918:48: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalEHelp.g:919:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword; 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalEHelp.g:925:1: ruleKeyword returns [EObject current=null] : (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEHelp.g:931:2: ( (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' ) )
            // InternalEHelp.g:932:2: (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' )
            {
            // InternalEHelp.g:932:2: (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' )
            // InternalEHelp.g:933:3: otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getKeywordAccess().getQuestionMarkKeyword_0());
            		
            // InternalEHelp.g:937:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalEHelp.g:938:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalEHelp.g:938:4: (lv_text_1_0= RULE_STRING )
            // InternalEHelp.g:939:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_text_1_0, grammarAccess.getKeywordAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeywordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getKeywordAccess().getQuestionMarkKeyword_2());
            		

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "entryRuleContext"
    // InternalEHelp.g:963:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalEHelp.g:963:48: (iv_ruleContext= ruleContext EOF )
            // InternalEHelp.g:964:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalEHelp.g:970:1: ruleContext returns [EObject current=null] : (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEHelp.g:976:2: ( (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' ) )
            // InternalEHelp.g:977:2: (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' )
            {
            // InternalEHelp.g:977:2: (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' )
            // InternalEHelp.g:978:3: otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getExclamationMarkKeyword_0());
            		
            // InternalEHelp.g:982:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalEHelp.g:983:4: (lv_id_1_0= RULE_ID )
            {
            // InternalEHelp.g:983:4: (lv_id_1_0= RULE_ID )
            // InternalEHelp.g:984:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_id_1_0, grammarAccess.getContextAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEHelp.g:1000:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalEHelp.g:1001:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalEHelp.g:1001:4: (lv_label_2_0= RULE_STRING )
            // InternalEHelp.g:1002:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_label_2_0, grammarAccess.getContextAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContextAccess().getExclamationMarkKeyword_3());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleImages"
    // InternalEHelp.g:1026:1: entryRuleImages returns [EObject current=null] : iv_ruleImages= ruleImages EOF ;
    public final EObject entryRuleImages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImages = null;


        try {
            // InternalEHelp.g:1026:47: (iv_ruleImages= ruleImages EOF )
            // InternalEHelp.g:1027:2: iv_ruleImages= ruleImages EOF
            {
             newCompositeNode(grammarAccess.getImagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImages=ruleImages();

            state._fsp--;

             current =iv_ruleImages; 
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
    // $ANTLR end "entryRuleImages"


    // $ANTLR start "ruleImages"
    // InternalEHelp.g:1033:1: ruleImages returns [EObject current=null] : (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' ) ;
    public final EObject ruleImages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_images_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEHelp.g:1039:2: ( (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' ) )
            // InternalEHelp.g:1040:2: (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' )
            {
            // InternalEHelp.g:1040:2: (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' )
            // InternalEHelp.g:1041:3: otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImagesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEHelp.g:1045:3: ( (lv_images_1_0= RULE_STRING ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_STRING) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEHelp.g:1046:4: (lv_images_1_0= RULE_STRING )
            	    {
            	    // InternalEHelp.g:1046:4: (lv_images_1_0= RULE_STRING )
            	    // InternalEHelp.g:1047:5: lv_images_1_0= RULE_STRING
            	    {
            	    lv_images_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            	    					newLeafNode(lv_images_1_0, grammarAccess.getImagesAccess().getImagesSTRINGTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getImagesRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"images",
            	    						lv_images_1_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImagesAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleImages"


    // $ANTLR start "entryRuleLink"
    // InternalEHelp.g:1071:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalEHelp.g:1071:45: (iv_ruleLink= ruleLink EOF )
            // InternalEHelp.g:1072:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalEHelp.g:1078:1: ruleLink returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_caption_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEHelp.g:1084:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' ) )
            // InternalEHelp.g:1085:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' )
            {
            // InternalEHelp.g:1085:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' )
            // InternalEHelp.g:1086:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEHelp.g:1090:3: ( (otherlv_1= RULE_ID ) )
            // InternalEHelp.g:1091:4: (otherlv_1= RULE_ID )
            {
            // InternalEHelp.g:1091:4: (otherlv_1= RULE_ID )
            // InternalEHelp.g:1092:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkChapterCrossReference_1_0());
            				

            }


            }

            // InternalEHelp.g:1103:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEHelp.g:1104:4: (lv_caption_2_0= RULE_STRING )
                    {
                    // InternalEHelp.g:1104:4: (lv_caption_2_0= RULE_STRING )
                    // InternalEHelp.g:1105:5: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    					newLeafNode(lv_caption_2_0, grammarAccess.getLinkAccess().getCaptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLinkRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"caption",
                    						lv_caption_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLink"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\41\3\uffff\1\5\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\5\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\14\uffff\1\5\1\6\1\uffff\1\7\12\uffff\1\1\1\2\1\4",
            "",
            "",
            "",
            "\1\11\1\10",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "508:2: (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000380174010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000380160012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000A08040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000A08000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003FF160010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003FC160012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003F8160012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000003F0160012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003E0160012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000003C0160012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});

}