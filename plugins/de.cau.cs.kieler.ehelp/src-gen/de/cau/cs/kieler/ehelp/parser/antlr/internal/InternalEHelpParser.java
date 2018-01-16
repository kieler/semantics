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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'chapter'", "'{'", "'}'", "'list'", "'enum'", "'-'", "'table'", "'spacing'", "'='", "'stretch'", "'|'", "'center'", "'left'", "'right'", "'top'", "'middle'", "'bottom'", "'?'", "'!'", "'['", "']'"
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
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalEHelp.g:71:1: ruleEHelpModel returns [EObject current=null] : ( (lv_chapters_0_0= ruleChapter ) )* ;
    public final EObject ruleEHelpModel() throws RecognitionException {
        EObject current = null;

        EObject lv_chapters_0_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:77:2: ( ( (lv_chapters_0_0= ruleChapter ) )* )
            // InternalEHelp.g:78:2: ( (lv_chapters_0_0= ruleChapter ) )*
            {
            // InternalEHelp.g:78:2: ( (lv_chapters_0_0= ruleChapter ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEHelp.g:79:3: (lv_chapters_0_0= ruleChapter )
            	    {
            	    // InternalEHelp.g:79:3: (lv_chapters_0_0= ruleChapter )
            	    // InternalEHelp.g:80:4: lv_chapters_0_0= ruleChapter
            	    {

            	    				newCompositeNode(grammarAccess.getEHelpModelAccess().getChaptersChapterParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_chapters_0_0=ruleChapter();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEHelpModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"chapters",
            	    					lv_chapters_0_0,
            	    					"de.cau.cs.kieler.ehelp.EHelp.Chapter");
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
    // $ANTLR end "ruleEHelpModel"


    // $ANTLR start "entryRuleChapter"
    // InternalEHelp.g:100:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // InternalEHelp.g:100:48: (iv_ruleChapter= ruleChapter EOF )
            // InternalEHelp.g:101:2: iv_ruleChapter= ruleChapter EOF
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
    // InternalEHelp.g:107:1: ruleChapter returns [EObject current=null] : (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' ) ;
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
            // InternalEHelp.g:113:2: ( (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' ) )
            // InternalEHelp.g:114:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' )
            {
            // InternalEHelp.g:114:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}' )
            // InternalEHelp.g:115:3: otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) )? ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_content_4_0= ruleContent ) )* ( (lv_subchapters_5_0= ruleChapter ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getChapterAccess().getChapterKeyword_0());
            		
            // InternalEHelp.g:119:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEHelp.g:120:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalEHelp.g:120:4: (lv_name_1_0= RULE_ID )
                    // InternalEHelp.g:121:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalEHelp.g:137:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalEHelp.g:138:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalEHelp.g:138:4: (lv_title_2_0= RULE_STRING )
            // InternalEHelp.g:139:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEHelp.g:159:3: ( (lv_content_4_0= ruleContent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||(LA3_0>=14 && LA3_0<=15)||LA3_0==17||(LA3_0>=28 && LA3_0<=30)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEHelp.g:160:4: (lv_content_4_0= ruleContent )
            	    {
            	    // InternalEHelp.g:160:4: (lv_content_4_0= ruleContent )
            	    // InternalEHelp.g:161:5: lv_content_4_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getChapterAccess().getContentContentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop3;
                }
            } while (true);

            // InternalEHelp.g:178:3: ( (lv_subchapters_5_0= ruleChapter ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEHelp.g:179:4: (lv_subchapters_5_0= ruleChapter )
            	    {
            	    // InternalEHelp.g:179:4: (lv_subchapters_5_0= ruleChapter )
            	    // InternalEHelp.g:180:5: lv_subchapters_5_0= ruleChapter
            	    {

            	    					newCompositeNode(grammarAccess.getChapterAccess().getSubchaptersChapterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalEHelp.g:205:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalEHelp.g:205:45: (iv_ruleList= ruleList EOF )
            // InternalEHelp.g:206:2: iv_ruleList= ruleList EOF
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
    // InternalEHelp.g:212:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:218:2: ( (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) )
            // InternalEHelp.g:219:2: (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            {
            // InternalEHelp.g:219:2: (otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            // InternalEHelp.g:220:3: otherlv_0= 'list' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEHelp.g:228:3: ( (lv_items_2_0= ruleListItem ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEHelp.g:229:4: (lv_items_2_0= ruleListItem )
            	    {
            	    // InternalEHelp.g:229:4: (lv_items_2_0= ruleListItem )
            	    // InternalEHelp.g:230:5: lv_items_2_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getListAccess().getItemsListItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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
    // InternalEHelp.g:255:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalEHelp.g:255:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalEHelp.g:256:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalEHelp.g:262:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:268:2: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' ) )
            // InternalEHelp.g:269:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            {
            // InternalEHelp.g:269:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}' )
            // InternalEHelp.g:270:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_items_2_0= ruleListItem ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEHelp.g:278:3: ( (lv_items_2_0= ruleListItem ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEHelp.g:279:4: (lv_items_2_0= ruleListItem )
            	    {
            	    // InternalEHelp.g:279:4: (lv_items_2_0= ruleListItem )
            	    // InternalEHelp.g:280:5: lv_items_2_0= ruleListItem
            	    {

            	    					newCompositeNode(grammarAccess.getEnumAccess().getItemsListItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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
    // InternalEHelp.g:305:1: entryRuleListItem returns [EObject current=null] : iv_ruleListItem= ruleListItem EOF ;
    public final EObject entryRuleListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListItem = null;


        try {
            // InternalEHelp.g:305:49: (iv_ruleListItem= ruleListItem EOF )
            // InternalEHelp.g:306:2: iv_ruleListItem= ruleListItem EOF
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
    // InternalEHelp.g:312:1: ruleListItem returns [EObject current=null] : (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* ) ;
    public final EObject ruleListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_content_1_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:318:2: ( (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* ) )
            // InternalEHelp.g:319:2: (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* )
            {
            // InternalEHelp.g:319:2: (otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )* )
            // InternalEHelp.g:320:3: otherlv_0= '-' ( (lv_content_1_0= ruleContent ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getListItemAccess().getHyphenMinusKeyword_0());
            		
            // InternalEHelp.g:324:3: ( (lv_content_1_0= ruleContent ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||(LA7_0>=14 && LA7_0<=15)||LA7_0==17||(LA7_0>=28 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEHelp.g:325:4: (lv_content_1_0= ruleContent )
            	    {
            	    // InternalEHelp.g:325:4: (lv_content_1_0= ruleContent )
            	    // InternalEHelp.g:326:5: lv_content_1_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getListItemAccess().getContentContentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleListItem"


    // $ANTLR start "entryRuleContent"
    // InternalEHelp.g:347:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalEHelp.g:347:48: (iv_ruleContent= ruleContent EOF )
            // InternalEHelp.g:348:2: iv_ruleContent= ruleContent EOF
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
    // InternalEHelp.g:354:1: ruleContent returns [EObject current=null] : (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable ) ;
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
            // InternalEHelp.g:360:2: ( (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable ) )
            // InternalEHelp.g:361:2: (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable )
            {
            // InternalEHelp.g:361:2: (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable )
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEHelp.g:362:3: this_Keyword_0= ruleKeyword
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
                    // InternalEHelp.g:371:3: this_Context_1= ruleContext
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
                    // InternalEHelp.g:380:3: this_Text_2= ruleText
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
                    // InternalEHelp.g:389:3: this_Images_3= ruleImages
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
                    // InternalEHelp.g:398:3: this_Link_4= ruleLink
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
                    // InternalEHelp.g:407:3: this_List_5= ruleList
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
                    // InternalEHelp.g:416:3: this_Enum_6= ruleEnum
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
                    // InternalEHelp.g:425:3: this_Table_7= ruleTable
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
    // InternalEHelp.g:437:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalEHelp.g:437:46: (iv_ruleTable= ruleTable EOF )
            // InternalEHelp.g:438:2: iv_ruleTable= ruleTable EOF
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
    // InternalEHelp.g:444:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' ) ;
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
            // InternalEHelp.g:450:2: ( (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' ) )
            // InternalEHelp.g:451:2: (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' )
            {
            // InternalEHelp.g:451:2: (otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}' )
            // InternalEHelp.g:452:3: otherlv_0= 'table' ( (lv_width_1_0= RULE_INT ) )? (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )? ( (lv_stretch_5_0= 'stretch' ) )? otherlv_6= '{' ( (lv_rows_7_0= ruleTableRow ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
            		
            // InternalEHelp.g:456:3: ( (lv_width_1_0= RULE_INT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEHelp.g:457:4: (lv_width_1_0= RULE_INT )
                    {
                    // InternalEHelp.g:457:4: (lv_width_1_0= RULE_INT )
                    // InternalEHelp.g:458:5: lv_width_1_0= RULE_INT
                    {
                    lv_width_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            // InternalEHelp.g:474:3: (otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEHelp.g:475:4: otherlv_2= 'spacing' otherlv_3= '=' ( (lv_spacing_4_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableAccess().getSpacingKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getTableAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalEHelp.g:483:4: ( (lv_spacing_4_0= RULE_INT ) )
                    // InternalEHelp.g:484:5: (lv_spacing_4_0= RULE_INT )
                    {
                    // InternalEHelp.g:484:5: (lv_spacing_4_0= RULE_INT )
                    // InternalEHelp.g:485:6: lv_spacing_4_0= RULE_INT
                    {
                    lv_spacing_4_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            // InternalEHelp.g:502:3: ( (lv_stretch_5_0= 'stretch' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEHelp.g:503:4: (lv_stretch_5_0= 'stretch' )
                    {
                    // InternalEHelp.g:503:4: (lv_stretch_5_0= 'stretch' )
                    // InternalEHelp.g:504:5: lv_stretch_5_0= 'stretch'
                    {
                    lv_stretch_5_0=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(lv_stretch_5_0, grammarAccess.getTableAccess().getStretchStretchKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    					setWithLastConsumed(current, "stretch", true, "stretch");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEHelp.g:520:3: ( (lv_rows_7_0= ruleTableRow ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEHelp.g:521:4: (lv_rows_7_0= ruleTableRow )
            	    {
            	    // InternalEHelp.g:521:4: (lv_rows_7_0= ruleTableRow )
            	    // InternalEHelp.g:522:5: lv_rows_7_0= ruleTableRow
            	    {

            	    					newCompositeNode(grammarAccess.getTableAccess().getRowsTableRowParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

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
    // InternalEHelp.g:547:1: entryRuleTableRow returns [EObject current=null] : iv_ruleTableRow= ruleTableRow EOF ;
    public final EObject entryRuleTableRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableRow = null;


        try {
            // InternalEHelp.g:547:49: (iv_ruleTableRow= ruleTableRow EOF )
            // InternalEHelp.g:548:2: iv_ruleTableRow= ruleTableRow EOF
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
    // InternalEHelp.g:554:1: ruleTableRow returns [EObject current=null] : (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* ) ;
    public final EObject ruleTableRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cells_1_0 = null;

        EObject lv_cells_3_0 = null;



        	enterRule();

        try {
            // InternalEHelp.g:560:2: ( (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* ) )
            // InternalEHelp.g:561:2: (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* )
            {
            // InternalEHelp.g:561:2: (otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )* )
            // InternalEHelp.g:562:3: otherlv_0= '-' ( (lv_cells_1_0= ruleTableCell ) ) (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTableRowAccess().getHyphenMinusKeyword_0());
            		
            // InternalEHelp.g:566:3: ( (lv_cells_1_0= ruleTableCell ) )
            // InternalEHelp.g:567:4: (lv_cells_1_0= ruleTableCell )
            {
            // InternalEHelp.g:567:4: (lv_cells_1_0= ruleTableCell )
            // InternalEHelp.g:568:5: lv_cells_1_0= ruleTableCell
            {

            					newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalEHelp.g:585:3: (otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEHelp.g:586:4: otherlv_2= '|' ( (lv_cells_3_0= ruleTableCell ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTableRowAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalEHelp.g:590:4: ( (lv_cells_3_0= ruleTableCell ) )
            	    // InternalEHelp.g:591:5: (lv_cells_3_0= ruleTableCell )
            	    {
            	    // InternalEHelp.g:591:5: (lv_cells_3_0= ruleTableCell )
            	    // InternalEHelp.g:592:6: lv_cells_3_0= ruleTableCell
            	    {

            	    						newCompositeNode(grammarAccess.getTableRowAccess().getCellsTableCellParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleTableRow"


    // $ANTLR start "entryRuleTableCell"
    // InternalEHelp.g:614:1: entryRuleTableCell returns [EObject current=null] : iv_ruleTableCell= ruleTableCell EOF ;
    public final EObject entryRuleTableCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableCell = null;


        try {
            // InternalEHelp.g:614:50: (iv_ruleTableCell= ruleTableCell EOF )
            // InternalEHelp.g:615:2: iv_ruleTableCell= ruleTableCell EOF
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
    // InternalEHelp.g:621:1: ruleTableCell returns [EObject current=null] : ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* ) ;
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
            // InternalEHelp.g:627:2: ( ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* ) )
            // InternalEHelp.g:628:2: ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* )
            {
            // InternalEHelp.g:628:2: ( ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )* )
            // InternalEHelp.g:629:3: ( (lv_center_0_0= 'center' ) )? ( (lv_left_1_0= 'left' ) )? ( (lv_right_2_0= 'right' ) )? ( (lv_top_3_0= 'top' ) )? ( (lv_middle_4_0= 'middle' ) )? ( (lv_bottom_5_0= 'bottom' ) )? ( (lv_content_6_0= ruleContent ) )*
            {
            // InternalEHelp.g:629:3: ( (lv_center_0_0= 'center' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEHelp.g:630:4: (lv_center_0_0= 'center' )
                    {
                    // InternalEHelp.g:630:4: (lv_center_0_0= 'center' )
                    // InternalEHelp.g:631:5: lv_center_0_0= 'center'
                    {
                    lv_center_0_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_center_0_0, grammarAccess.getTableCellAccess().getCenterCenterKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "center", true, "center");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:643:3: ( (lv_left_1_0= 'left' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEHelp.g:644:4: (lv_left_1_0= 'left' )
                    {
                    // InternalEHelp.g:644:4: (lv_left_1_0= 'left' )
                    // InternalEHelp.g:645:5: lv_left_1_0= 'left'
                    {
                    lv_left_1_0=(Token)match(input,23,FOLLOW_19); 

                    					newLeafNode(lv_left_1_0, grammarAccess.getTableCellAccess().getLeftLeftKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "left", true, "left");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:657:3: ( (lv_right_2_0= 'right' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEHelp.g:658:4: (lv_right_2_0= 'right' )
                    {
                    // InternalEHelp.g:658:4: (lv_right_2_0= 'right' )
                    // InternalEHelp.g:659:5: lv_right_2_0= 'right'
                    {
                    lv_right_2_0=(Token)match(input,24,FOLLOW_20); 

                    					newLeafNode(lv_right_2_0, grammarAccess.getTableCellAccess().getRightRightKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "right", true, "right");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:671:3: ( (lv_top_3_0= 'top' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEHelp.g:672:4: (lv_top_3_0= 'top' )
                    {
                    // InternalEHelp.g:672:4: (lv_top_3_0= 'top' )
                    // InternalEHelp.g:673:5: lv_top_3_0= 'top'
                    {
                    lv_top_3_0=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(lv_top_3_0, grammarAccess.getTableCellAccess().getTopTopKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "top", true, "top");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:685:3: ( (lv_middle_4_0= 'middle' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEHelp.g:686:4: (lv_middle_4_0= 'middle' )
                    {
                    // InternalEHelp.g:686:4: (lv_middle_4_0= 'middle' )
                    // InternalEHelp.g:687:5: lv_middle_4_0= 'middle'
                    {
                    lv_middle_4_0=(Token)match(input,26,FOLLOW_22); 

                    					newLeafNode(lv_middle_4_0, grammarAccess.getTableCellAccess().getMiddleMiddleKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "middle", true, "middle");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:699:3: ( (lv_bottom_5_0= 'bottom' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEHelp.g:700:4: (lv_bottom_5_0= 'bottom' )
                    {
                    // InternalEHelp.g:700:4: (lv_bottom_5_0= 'bottom' )
                    // InternalEHelp.g:701:5: lv_bottom_5_0= 'bottom'
                    {
                    lv_bottom_5_0=(Token)match(input,27,FOLLOW_10); 

                    					newLeafNode(lv_bottom_5_0, grammarAccess.getTableCellAccess().getBottomBottomKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableCellRule());
                    					}
                    					setWithLastConsumed(current, "bottom", true, "bottom");
                    				

                    }


                    }
                    break;

            }

            // InternalEHelp.g:713:3: ( (lv_content_6_0= ruleContent ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING||(LA20_0>=14 && LA20_0<=15)||LA20_0==17||(LA20_0>=28 && LA20_0<=30)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEHelp.g:714:4: (lv_content_6_0= ruleContent )
            	    {
            	    // InternalEHelp.g:714:4: (lv_content_6_0= ruleContent )
            	    // InternalEHelp.g:715:5: lv_content_6_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getTableCellAccess().getContentContentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleTableCell"


    // $ANTLR start "entryRuleText"
    // InternalEHelp.g:736:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalEHelp.g:736:45: (iv_ruleText= ruleText EOF )
            // InternalEHelp.g:737:2: iv_ruleText= ruleText EOF
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
    // InternalEHelp.g:743:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEHelp.g:749:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalEHelp.g:750:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalEHelp.g:750:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalEHelp.g:751:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalEHelp.g:751:3: (lv_text_0_0= RULE_STRING )
            // InternalEHelp.g:752:4: lv_text_0_0= RULE_STRING
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
    // InternalEHelp.g:771:1: entryRuleKeyword returns [EObject current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final EObject entryRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyword = null;


        try {
            // InternalEHelp.g:771:48: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalEHelp.g:772:2: iv_ruleKeyword= ruleKeyword EOF
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
    // InternalEHelp.g:778:1: ruleKeyword returns [EObject current=null] : (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' ) ;
    public final EObject ruleKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEHelp.g:784:2: ( (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' ) )
            // InternalEHelp.g:785:2: (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' )
            {
            // InternalEHelp.g:785:2: (otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?' )
            // InternalEHelp.g:786:3: otherlv_0= '?' ( (lv_text_1_0= RULE_STRING ) ) otherlv_2= '?'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getKeywordAccess().getQuestionMarkKeyword_0());
            		
            // InternalEHelp.g:790:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalEHelp.g:791:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalEHelp.g:791:4: (lv_text_1_0= RULE_STRING )
            // InternalEHelp.g:792:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalEHelp.g:816:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalEHelp.g:816:48: (iv_ruleContext= ruleContext EOF )
            // InternalEHelp.g:817:2: iv_ruleContext= ruleContext EOF
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
    // InternalEHelp.g:823:1: ruleContext returns [EObject current=null] : (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEHelp.g:829:2: ( (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' ) )
            // InternalEHelp.g:830:2: (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' )
            {
            // InternalEHelp.g:830:2: (otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!' )
            // InternalEHelp.g:831:3: otherlv_0= '!' ( (lv_id_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= '!'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getExclamationMarkKeyword_0());
            		
            // InternalEHelp.g:835:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalEHelp.g:836:4: (lv_id_1_0= RULE_ID )
            {
            // InternalEHelp.g:836:4: (lv_id_1_0= RULE_ID )
            // InternalEHelp.g:837:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalEHelp.g:853:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalEHelp.g:854:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalEHelp.g:854:4: (lv_label_2_0= RULE_STRING )
            // InternalEHelp.g:855:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalEHelp.g:879:1: entryRuleImages returns [EObject current=null] : iv_ruleImages= ruleImages EOF ;
    public final EObject entryRuleImages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImages = null;


        try {
            // InternalEHelp.g:879:47: (iv_ruleImages= ruleImages EOF )
            // InternalEHelp.g:880:2: iv_ruleImages= ruleImages EOF
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
    // InternalEHelp.g:886:1: ruleImages returns [EObject current=null] : (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' ) ;
    public final EObject ruleImages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_images_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEHelp.g:892:2: ( (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' ) )
            // InternalEHelp.g:893:2: (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' )
            {
            // InternalEHelp.g:893:2: (otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']' )
            // InternalEHelp.g:894:3: otherlv_0= '[' ( (lv_images_1_0= RULE_STRING ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImagesAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEHelp.g:898:3: ( (lv_images_1_0= RULE_STRING ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEHelp.g:899:4: (lv_images_1_0= RULE_STRING )
            	    {
            	    // InternalEHelp.g:899:4: (lv_images_1_0= RULE_STRING )
            	    // InternalEHelp.g:900:5: lv_images_1_0= RULE_STRING
            	    {
            	    lv_images_1_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

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
    // InternalEHelp.g:924:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalEHelp.g:924:45: (iv_ruleLink= ruleLink EOF )
            // InternalEHelp.g:925:2: iv_ruleLink= ruleLink EOF
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
    // InternalEHelp.g:931:1: ruleLink returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_caption_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEHelp.g:937:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' ) )
            // InternalEHelp.g:938:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' )
            {
            // InternalEHelp.g:938:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']' )
            // InternalEHelp.g:939:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) ( (lv_caption_2_0= RULE_STRING ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalEHelp.g:943:3: ( (otherlv_1= RULE_ID ) )
            // InternalEHelp.g:944:4: (otherlv_1= RULE_ID )
            {
            // InternalEHelp.g:944:4: (otherlv_1= RULE_ID )
            // InternalEHelp.g:945:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkChapterCrossReference_1_0());
            				

            }


            }

            // InternalEHelp.g:956:3: ( (lv_caption_2_0= RULE_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEHelp.g:957:4: (lv_caption_2_0= RULE_STRING )
                    {
                    // InternalEHelp.g:957:4: (lv_caption_2_0= RULE_STRING )
                    // InternalEHelp.g:958:5: lv_caption_2_0= RULE_STRING
                    {
                    lv_caption_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\36\3\uffff\1\5\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\4\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\10\uffff\1\5\1\6\1\uffff\1\7\12\uffff\1\1\1\2\1\4",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "361:2: (this_Keyword_0= ruleKeyword | this_Context_1= ruleContext | this_Text_2= ruleText | this_Images_3= ruleImages | this_Link_4= ruleLink | this_List_5= ruleList | this_Enum_6= ruleEnum | this_Table_7= ruleTable )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007002E820L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000007002C022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000141040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000141000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000007FE2C020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000007F82C022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000007F02C022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000007E02C022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000007C02C022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007802C022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});

}