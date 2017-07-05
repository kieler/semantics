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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Folder'", "'parent'", "'='", "'location'", "'File'", "'Component'", "'!'", "'type'", "'referenceFile'", "'referenceLine'", "'DIR'", "'FILE'", "'FUNC'", "'COMPOUND'", "'READER'", "'WRITER'"
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
        	return "Model";
       	}

       	@Override
       	protected CViewModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCViewModel.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCViewModel.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalCViewModel.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCViewModel.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_folders_0_0= ruleFolder ) )* otherlv_1= ';' ( (lv_files_2_0= ruleFile ) )* otherlv_3= ';' ( (lv_components_4_0= ruleComponent ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_folders_0_0 = null;

        EObject lv_files_2_0 = null;

        EObject lv_components_4_0 = null;



        	enterRule();

        try {
            // InternalCViewModel.g:78:2: ( ( ( (lv_folders_0_0= ruleFolder ) )* otherlv_1= ';' ( (lv_files_2_0= ruleFile ) )* otherlv_3= ';' ( (lv_components_4_0= ruleComponent ) )* ) )
            // InternalCViewModel.g:79:2: ( ( (lv_folders_0_0= ruleFolder ) )* otherlv_1= ';' ( (lv_files_2_0= ruleFile ) )* otherlv_3= ';' ( (lv_components_4_0= ruleComponent ) )* )
            {
            // InternalCViewModel.g:79:2: ( ( (lv_folders_0_0= ruleFolder ) )* otherlv_1= ';' ( (lv_files_2_0= ruleFile ) )* otherlv_3= ';' ( (lv_components_4_0= ruleComponent ) )* )
            // InternalCViewModel.g:80:3: ( (lv_folders_0_0= ruleFolder ) )* otherlv_1= ';' ( (lv_files_2_0= ruleFile ) )* otherlv_3= ';' ( (lv_components_4_0= ruleComponent ) )*
            {
            // InternalCViewModel.g:80:3: ( (lv_folders_0_0= ruleFolder ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCViewModel.g:81:4: (lv_folders_0_0= ruleFolder )
            	    {
            	    // InternalCViewModel.g:81:4: (lv_folders_0_0= ruleFolder )
            	    // InternalCViewModel.g:82:5: lv_folders_0_0= ruleFolder
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFoldersFolderParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_folders_0_0=ruleFolder();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"folders",
            	    						lv_folders_0_0,
            	    						"de.cau.cs.kieler.cview.model.CViewModel.Folder");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getSemicolonKeyword_1());
            		
            // InternalCViewModel.g:103:3: ( (lv_files_2_0= ruleFile ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCViewModel.g:104:4: (lv_files_2_0= ruleFile )
            	    {
            	    // InternalCViewModel.g:104:4: (lv_files_2_0= ruleFile )
            	    // InternalCViewModel.g:105:5: lv_files_2_0= ruleFile
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFilesFileParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_files_2_0=ruleFile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"files",
            	    						lv_files_2_0,
            	    						"de.cau.cs.kieler.cview.model.CViewModel.File");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSemicolonKeyword_3());
            		
            // InternalCViewModel.g:126:3: ( (lv_components_4_0= ruleComponent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCViewModel.g:127:4: (lv_components_4_0= ruleComponent )
            	    {
            	    // InternalCViewModel.g:127:4: (lv_components_4_0= ruleComponent )
            	    // InternalCViewModel.g:128:5: lv_components_4_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_components_4_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_4_0,
            	    						"de.cau.cs.kieler.cview.model.CViewModel.Component");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFolder"
    // InternalCViewModel.g:149:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // InternalCViewModel.g:149:47: (iv_ruleFolder= ruleFolder EOF )
            // InternalCViewModel.g:150:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
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
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // InternalCViewModel.g:156:1: ruleFolder returns [EObject current=null] : (otherlv_0= 'Folder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;


        	enterRule();

        try {
            // InternalCViewModel.g:162:2: ( (otherlv_0= 'Folder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) ) )
            // InternalCViewModel.g:163:2: (otherlv_0= 'Folder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) )
            {
            // InternalCViewModel.g:163:2: (otherlv_0= 'Folder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) )
            // InternalCViewModel.g:164:3: otherlv_0= 'Folder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFolderAccess().getFolderKeyword_0());
            		
            // InternalCViewModel.g:168:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCViewModel.g:169:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCViewModel.g:169:4: (lv_name_1_0= RULE_ID )
            // InternalCViewModel.g:170:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFolderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFolderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCViewModel.g:186:3: (otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCViewModel.g:187:4: otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getFolderAccess().getParentKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getFolderAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalCViewModel.g:195:4: ( (otherlv_4= RULE_ID ) )
                    // InternalCViewModel.g:196:5: (otherlv_4= RULE_ID )
                    {
                    // InternalCViewModel.g:196:5: (otherlv_4= RULE_ID )
                    // InternalCViewModel.g:197:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFolderRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_4, grammarAccess.getFolderAccess().getParentFolderCrossReference_2_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getLocationKeyword_3());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFolderAccess().getEqualsSignKeyword_4());
            		
            // InternalCViewModel.g:217:3: ( (lv_location_7_0= RULE_STRING ) )
            // InternalCViewModel.g:218:4: (lv_location_7_0= RULE_STRING )
            {
            // InternalCViewModel.g:218:4: (lv_location_7_0= RULE_STRING )
            // InternalCViewModel.g:219:5: lv_location_7_0= RULE_STRING
            {
            lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_location_7_0, grammarAccess.getFolderAccess().getLocationSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFolderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_7_0,
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
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleFile"
    // InternalCViewModel.g:239:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalCViewModel.g:239:45: (iv_ruleFile= ruleFile EOF )
            // InternalCViewModel.g:240:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalCViewModel.g:246:1: ruleFile returns [EObject current=null] : (otherlv_0= 'File' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_location_7_0=null;


        	enterRule();

        try {
            // InternalCViewModel.g:252:2: ( (otherlv_0= 'File' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) ) )
            // InternalCViewModel.g:253:2: (otherlv_0= 'File' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) )
            {
            // InternalCViewModel.g:253:2: (otherlv_0= 'File' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) ) )
            // InternalCViewModel.g:254:3: otherlv_0= 'File' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parent' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'location' otherlv_6= '=' ( (lv_location_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
            		
            // InternalCViewModel.g:258:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCViewModel.g:259:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCViewModel.g:259:4: (lv_name_1_0= RULE_ID )
            // InternalCViewModel.g:260:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFileAccess().getParentKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFileAccess().getEqualsSignKeyword_3());
            		
            // InternalCViewModel.g:284:3: ( (otherlv_4= RULE_ID ) )
            // InternalCViewModel.g:285:4: (otherlv_4= RULE_ID )
            {
            // InternalCViewModel.g:285:4: (otherlv_4= RULE_ID )
            // InternalCViewModel.g:286:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getFileAccess().getParentFolderCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getFileAccess().getLocationKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFileAccess().getEqualsSignKeyword_6());
            		
            // InternalCViewModel.g:305:3: ( (lv_location_7_0= RULE_STRING ) )
            // InternalCViewModel.g:306:4: (lv_location_7_0= RULE_STRING )
            {
            // InternalCViewModel.g:306:4: (lv_location_7_0= RULE_STRING )
            // InternalCViewModel.g:307:5: lv_location_7_0= RULE_STRING
            {
            lv_location_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_location_7_0, grammarAccess.getFileAccess().getLocationSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_7_0,
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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleComponent"
    // InternalCViewModel.g:327:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCViewModel.g:327:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCViewModel.g:328:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalCViewModel.g:334:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' (otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleComponentType ) ) (otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) ) )? ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_referenceLine_14_0=null;
        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalCViewModel.g:340:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' (otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleComponentType ) ) (otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) ) )? ) )
            // InternalCViewModel.g:341:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' (otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleComponentType ) ) (otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) ) )? )
            {
            // InternalCViewModel.g:341:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' (otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleComponentType ) ) (otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) ) )? )
            // InternalCViewModel.g:342:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' (otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleComponentType ) ) (otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) )? (otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalCViewModel.g:346:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCViewModel.g:347:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCViewModel.g:347:4: (lv_name_1_0= RULE_ID )
            // InternalCViewModel.g:348:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getExclamationMarkKeyword_2());
            		
            // InternalCViewModel.g:368:3: (otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCViewModel.g:369:4: otherlv_3= 'parent' otherlv_4= '=' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getParentKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalCViewModel.g:377:4: ( (otherlv_5= RULE_ID ) )
                    // InternalCViewModel.g:378:5: (otherlv_5= RULE_ID )
                    {
                    // InternalCViewModel.g:378:5: (otherlv_5= RULE_ID )
                    // InternalCViewModel.g:379:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getParentComponentCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getTypeKeyword_4());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getEqualsSignKeyword_5());
            		
            // InternalCViewModel.g:399:3: ( (lv_type_8_0= ruleComponentType ) )
            // InternalCViewModel.g:400:4: (lv_type_8_0= ruleComponentType )
            {
            // InternalCViewModel.g:400:4: (lv_type_8_0= ruleComponentType )
            // InternalCViewModel.g:401:5: lv_type_8_0= ruleComponentType
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getTypeComponentTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_8_0=ruleComponentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"de.cau.cs.kieler.cview.model.CViewModel.ComponentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCViewModel.g:418:3: (otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCViewModel.g:419:4: otherlv_9= 'referenceFile' otherlv_10= '=' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getReferenceFileKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalCViewModel.g:427:4: ( (otherlv_11= RULE_ID ) )
                    // InternalCViewModel.g:428:5: (otherlv_11= RULE_ID )
                    {
                    // InternalCViewModel.g:428:5: (otherlv_11= RULE_ID )
                    // InternalCViewModel.g:429:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getReferenceFileFileCrossReference_7_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCViewModel.g:441:3: (otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCViewModel.g:442:4: otherlv_12= 'referenceLine' otherlv_13= '=' ( (lv_referenceLine_14_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getReferenceLineKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalCViewModel.g:450:4: ( (lv_referenceLine_14_0= RULE_INT ) )
                    // InternalCViewModel.g:451:5: (lv_referenceLine_14_0= RULE_INT )
                    {
                    // InternalCViewModel.g:451:5: (lv_referenceLine_14_0= RULE_INT )
                    // InternalCViewModel.g:452:6: lv_referenceLine_14_0= RULE_INT
                    {
                    lv_referenceLine_14_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_referenceLine_14_0, grammarAccess.getComponentAccess().getReferenceLineINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"referenceLine",
                    							lv_referenceLine_14_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "ruleComponentType"
    // InternalCViewModel.g:473:1: ruleComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) ) ;
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
            // InternalCViewModel.g:479:2: ( ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) ) )
            // InternalCViewModel.g:480:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) )
            {
            // InternalCViewModel.g:480:2: ( (enumLiteral_0= 'DIR' ) | (enumLiteral_1= 'FILE' ) | (enumLiteral_2= 'FUNC' ) | (enumLiteral_3= 'COMPOUND' ) | (enumLiteral_4= 'READER' ) | (enumLiteral_5= 'WRITER' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 27:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCViewModel.g:481:3: (enumLiteral_0= 'DIR' )
                    {
                    // InternalCViewModel.g:481:3: (enumLiteral_0= 'DIR' )
                    // InternalCViewModel.g:482:4: enumLiteral_0= 'DIR'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComponentTypeAccess().getDIREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCViewModel.g:489:3: (enumLiteral_1= 'FILE' )
                    {
                    // InternalCViewModel.g:489:3: (enumLiteral_1= 'FILE' )
                    // InternalCViewModel.g:490:4: enumLiteral_1= 'FILE'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComponentTypeAccess().getFILEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCViewModel.g:497:3: (enumLiteral_2= 'FUNC' )
                    {
                    // InternalCViewModel.g:497:3: (enumLiteral_2= 'FUNC' )
                    // InternalCViewModel.g:498:4: enumLiteral_2= 'FUNC'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getFUNCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComponentTypeAccess().getFUNCEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCViewModel.g:505:3: (enumLiteral_3= 'COMPOUND' )
                    {
                    // InternalCViewModel.g:505:3: (enumLiteral_3= 'COMPOUND' )
                    // InternalCViewModel.g:506:4: enumLiteral_3= 'COMPOUND'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getCOMPOUNDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComponentTypeAccess().getCOMPOUNDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCViewModel.g:513:3: (enumLiteral_4= 'READER' )
                    {
                    // InternalCViewModel.g:513:3: (enumLiteral_4= 'READER' )
                    // InternalCViewModel.g:514:4: enumLiteral_4= 'READER'
                    {
                    enumLiteral_4=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getComponentTypeAccess().getREADEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComponentTypeAccess().getREADEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCViewModel.g:521:3: (enumLiteral_5= 'WRITER' )
                    {
                    // InternalCViewModel.g:521:3: (enumLiteral_5= 'WRITER' )
                    // InternalCViewModel.g:522:4: enumLiteral_5= 'WRITER'
                    {
                    enumLiteral_5=(Token)match(input,27,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});

}