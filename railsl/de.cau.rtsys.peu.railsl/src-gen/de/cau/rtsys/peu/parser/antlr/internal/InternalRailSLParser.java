package de.cau.rtsys.peu.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.rtsys.peu.services.RailSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BLOCK_END", "RULE_SEG_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Start:'", "'Set track'", "'to'", "'.'", "'reverse'", "'go'", "'slow'", "'stop'", "'Set point'", "'straight'", "'branch'", "'Wait for'", "'seconds.'", "'Reach'", "'Pass'", "'first'", "'second'", "'contact of'", "'Open'", "'Close'", "'crossing.'", "'Turn light'", "'on'", "'off'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int RULE_SEG_NAME=5;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BLOCK_END=4;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRailSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRailSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRailSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRailSL.g"; }



     	private RailSLGrammarAccess grammarAccess;

        public InternalRailSLParser(TokenStream input, RailSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected RailSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalRailSL.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalRailSL.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalRailSL.g:65:2: iv_ruleProgram= ruleProgram EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalRailSL.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_blocks_0_0= ruleBlock ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_blocks_0_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:77:2: ( ( (lv_blocks_0_0= ruleBlock ) )+ )
            // InternalRailSL.g:78:2: ( (lv_blocks_0_0= ruleBlock ) )+
            {
            // InternalRailSL.g:78:2: ( (lv_blocks_0_0= ruleBlock ) )+
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
            	    // InternalRailSL.g:79:3: (lv_blocks_0_0= ruleBlock )
            	    {
            	    // InternalRailSL.g:79:3: (lv_blocks_0_0= ruleBlock )
            	    // InternalRailSL.g:80:4: lv_blocks_0_0= ruleBlock
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getBlocksBlockParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_blocks_0_0=ruleBlock();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"blocks",
            	    					lv_blocks_0_0,
            	    					"de.cau.rtsys.peu.RailSL.Block");
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
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBlock"
    // InternalRailSL.g:100:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalRailSL.g:100:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalRailSL.g:101:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalRailSL.g:107:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= RULE_BLOCK_END ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_end_2_0=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:113:2: ( (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= RULE_BLOCK_END ) ) ) )
            // InternalRailSL.g:114:2: (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= RULE_BLOCK_END ) ) )
            {
            // InternalRailSL.g:114:2: (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= RULE_BLOCK_END ) ) )
            // InternalRailSL.g:115:3: otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= RULE_BLOCK_END ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getStartKeyword_0());
            		
            // InternalRailSL.g:119:3: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==21||LA2_0==24||(LA2_0>=26 && LA2_0<=27)||(LA2_0>=31 && LA2_0<=32)||LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRailSL.g:120:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalRailSL.g:120:4: (lv_statements_1_0= ruleStatement )
            	    // InternalRailSL.g:121:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"de.cau.rtsys.peu.RailSL.Statement");
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

            // InternalRailSL.g:138:3: ( (lv_end_2_0= RULE_BLOCK_END ) )
            // InternalRailSL.g:139:4: (lv_end_2_0= RULE_BLOCK_END )
            {
            // InternalRailSL.g:139:4: (lv_end_2_0= RULE_BLOCK_END )
            // InternalRailSL.g:140:5: lv_end_2_0= RULE_BLOCK_END
            {
            lv_end_2_0=(Token)match(input,RULE_BLOCK_END,FOLLOW_2); 

            					newLeafNode(lv_end_2_0, grammarAccess.getBlockAccess().getEndBLOCK_ENDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_2_0,
            						"de.cau.rtsys.peu.RailSL.BLOCK_END");
            				

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalRailSL.g:160:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRailSL.g:160:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRailSL.g:161:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRailSL.g:167:1: ruleStatement returns [EObject current=null] : (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SetStatement_0 = null;

        EObject this_WaitStatement_1 = null;

        EObject this_OpStatement_2 = null;



        	enterRule();

        try {
            // InternalRailSL.g:173:2: ( (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement ) )
            // InternalRailSL.g:174:2: (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement )
            {
            // InternalRailSL.g:174:2: (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
            case 21:
                {
                alt3=1;
                }
                break;
            case 24:
            case 26:
            case 27:
                {
                alt3=2;
                }
                break;
            case 31:
            case 32:
            case 34:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:175:3: this_SetStatement_0= ruleSetStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSetStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetStatement_0=ruleSetStatement();

                    state._fsp--;


                    			current = this_SetStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:184:3: this_WaitStatement_1= ruleWaitStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWaitStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaitStatement_1=ruleWaitStatement();

                    state._fsp--;


                    			current = this_WaitStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRailSL.g:193:3: this_OpStatement_2= ruleOpStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOpStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpStatement_2=ruleOpStatement();

                    state._fsp--;


                    			current = this_OpStatement_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSetStatement"
    // InternalRailSL.g:205:1: entryRuleSetStatement returns [EObject current=null] : iv_ruleSetStatement= ruleSetStatement EOF ;
    public final EObject entryRuleSetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetStatement = null;


        try {
            // InternalRailSL.g:205:53: (iv_ruleSetStatement= ruleSetStatement EOF )
            // InternalRailSL.g:206:2: iv_ruleSetStatement= ruleSetStatement EOF
            {
             newCompositeNode(grammarAccess.getSetStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetStatement=ruleSetStatement();

            state._fsp--;

             current =iv_ruleSetStatement; 
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
    // $ANTLR end "entryRuleSetStatement"


    // $ANTLR start "ruleSetStatement"
    // InternalRailSL.g:212:1: ruleSetStatement returns [EObject current=null] : (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement ) ;
    public final EObject ruleSetStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SetTrackStatement_0 = null;

        EObject this_SetPointStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:218:2: ( (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement ) )
            // InternalRailSL.g:219:2: (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement )
            {
            // InternalRailSL.g:219:2: (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:220:3: this_SetTrackStatement_0= ruleSetTrackStatement
                    {

                    			newCompositeNode(grammarAccess.getSetStatementAccess().getSetTrackStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetTrackStatement_0=ruleSetTrackStatement();

                    state._fsp--;


                    			current = this_SetTrackStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:229:3: this_SetPointStatement_1= ruleSetPointStatement
                    {

                    			newCompositeNode(grammarAccess.getSetStatementAccess().getSetPointStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetPointStatement_1=ruleSetPointStatement();

                    state._fsp--;


                    			current = this_SetPointStatement_1;
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
    // $ANTLR end "ruleSetStatement"


    // $ANTLR start "entryRuleSetTrackStatement"
    // InternalRailSL.g:241:1: entryRuleSetTrackStatement returns [EObject current=null] : iv_ruleSetTrackStatement= ruleSetTrackStatement EOF ;
    public final EObject entryRuleSetTrackStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetTrackStatement = null;


        try {
            // InternalRailSL.g:241:58: (iv_ruleSetTrackStatement= ruleSetTrackStatement EOF )
            // InternalRailSL.g:242:2: iv_ruleSetTrackStatement= ruleSetTrackStatement EOF
            {
             newCompositeNode(grammarAccess.getSetTrackStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetTrackStatement=ruleSetTrackStatement();

            state._fsp--;

             current =iv_ruleSetTrackStatement; 
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
    // $ANTLR end "entryRuleSetTrackStatement"


    // $ANTLR start "ruleSetTrackStatement"
    // InternalRailSL.g:248:1: ruleSetTrackStatement returns [EObject current=null] : (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) )+ otherlv_2= 'to' ( (lv_mode_3_0= ruleTrackSetting ) ) otherlv_4= '.' ) ;
    public final EObject ruleSetTrackStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_segments_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_mode_3_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:254:2: ( (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) )+ otherlv_2= 'to' ( (lv_mode_3_0= ruleTrackSetting ) ) otherlv_4= '.' ) )
            // InternalRailSL.g:255:2: (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) )+ otherlv_2= 'to' ( (lv_mode_3_0= ruleTrackSetting ) ) otherlv_4= '.' )
            {
            // InternalRailSL.g:255:2: (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) )+ otherlv_2= 'to' ( (lv_mode_3_0= ruleTrackSetting ) ) otherlv_4= '.' )
            // InternalRailSL.g:256:3: otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) )+ otherlv_2= 'to' ( (lv_mode_3_0= ruleTrackSetting ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0());
            		
            // InternalRailSL.g:260:3: ( (lv_segments_1_0= RULE_SEG_NAME ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_SEG_NAME) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRailSL.g:261:4: (lv_segments_1_0= RULE_SEG_NAME )
            	    {
            	    // InternalRailSL.g:261:4: (lv_segments_1_0= RULE_SEG_NAME )
            	    // InternalRailSL.g:262:5: lv_segments_1_0= RULE_SEG_NAME
            	    {
            	    lv_segments_1_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_7); 

            	    					newLeafNode(lv_segments_1_0, grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSetTrackStatementRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"segments",
            	    						lv_segments_1_0,
            	    						"de.cau.rtsys.peu.RailSL.SEG_NAME");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSetTrackStatementAccess().getToKeyword_2());
            		
            // InternalRailSL.g:282:3: ( (lv_mode_3_0= ruleTrackSetting ) )
            // InternalRailSL.g:283:4: (lv_mode_3_0= ruleTrackSetting )
            {
            // InternalRailSL.g:283:4: (lv_mode_3_0= ruleTrackSetting )
            // InternalRailSL.g:284:5: lv_mode_3_0= ruleTrackSetting
            {

            					newCompositeNode(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_mode_3_0=ruleTrackSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTrackStatementRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_3_0,
            						"de.cau.rtsys.peu.RailSL.TrackSetting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_4());
            		

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
    // $ANTLR end "ruleSetTrackStatement"


    // $ANTLR start "entryRuleTrackSetting"
    // InternalRailSL.g:309:1: entryRuleTrackSetting returns [String current=null] : iv_ruleTrackSetting= ruleTrackSetting EOF ;
    public final String entryRuleTrackSetting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrackSetting = null;


        try {
            // InternalRailSL.g:309:52: (iv_ruleTrackSetting= ruleTrackSetting EOF )
            // InternalRailSL.g:310:2: iv_ruleTrackSetting= ruleTrackSetting EOF
            {
             newCompositeNode(grammarAccess.getTrackSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrackSetting=ruleTrackSetting();

            state._fsp--;

             current =iv_ruleTrackSetting.getText(); 
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
    // $ANTLR end "entryRuleTrackSetting"


    // $ANTLR start "ruleTrackSetting"
    // InternalRailSL.g:316:1: ruleTrackSetting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'reverse' )? (kw= 'go' | kw= 'slow' ) ) | kw= 'stop' ) ;
    public final AntlrDatatypeRuleToken ruleTrackSetting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:322:2: ( ( ( (kw= 'reverse' )? (kw= 'go' | kw= 'slow' ) ) | kw= 'stop' ) )
            // InternalRailSL.g:323:2: ( ( (kw= 'reverse' )? (kw= 'go' | kw= 'slow' ) ) | kw= 'stop' )
            {
            // InternalRailSL.g:323:2: ( ( (kw= 'reverse' )? (kw= 'go' | kw= 'slow' ) ) | kw= 'stop' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=17 && LA8_0<=19)) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRailSL.g:324:3: ( (kw= 'reverse' )? (kw= 'go' | kw= 'slow' ) )
                    {
                    // InternalRailSL.g:324:3: ( (kw= 'reverse' )? (kw= 'go' | kw= 'slow' ) )
                    // InternalRailSL.g:325:4: (kw= 'reverse' )? (kw= 'go' | kw= 'slow' )
                    {
                    // InternalRailSL.g:325:4: (kw= 'reverse' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRailSL.g:326:5: kw= 'reverse'
                            {
                            kw=(Token)match(input,17,FOLLOW_10); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getReverseKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalRailSL.g:332:4: (kw= 'go' | kw= 'slow' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==18) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==19) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRailSL.g:333:5: kw= 'go'
                            {
                            kw=(Token)match(input,18,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getGoKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRailSL.g:339:5: kw= 'slow'
                            {
                            kw=(Token)match(input,19,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getSlowKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:347:3: kw= 'stop'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTrackSettingAccess().getStopKeyword_1());
                    		

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
    // $ANTLR end "ruleTrackSetting"


    // $ANTLR start "entryRuleSetPointStatement"
    // InternalRailSL.g:356:1: entryRuleSetPointStatement returns [EObject current=null] : iv_ruleSetPointStatement= ruleSetPointStatement EOF ;
    public final EObject entryRuleSetPointStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPointStatement = null;


        try {
            // InternalRailSL.g:356:58: (iv_ruleSetPointStatement= ruleSetPointStatement EOF )
            // InternalRailSL.g:357:2: iv_ruleSetPointStatement= ruleSetPointStatement EOF
            {
             newCompositeNode(grammarAccess.getSetPointStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetPointStatement=ruleSetPointStatement();

            state._fsp--;

             current =iv_ruleSetPointStatement; 
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
    // $ANTLR end "entryRuleSetPointStatement"


    // $ANTLR start "ruleSetPointStatement"
    // InternalRailSL.g:363:1: ruleSetPointStatement returns [EObject current=null] : (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) )+ otherlv_2= 'to' ( ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) ) ) otherlv_4= '.' ) ;
    public final EObject ruleSetPointStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_points_1_0=null;
        Token otherlv_2=null;
        Token lv_orientation_3_1=null;
        Token lv_orientation_3_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRailSL.g:369:2: ( (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) )+ otherlv_2= 'to' ( ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) ) ) otherlv_4= '.' ) )
            // InternalRailSL.g:370:2: (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) )+ otherlv_2= 'to' ( ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) ) ) otherlv_4= '.' )
            {
            // InternalRailSL.g:370:2: (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) )+ otherlv_2= 'to' ( ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) ) ) otherlv_4= '.' )
            // InternalRailSL.g:371:3: otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) )+ otherlv_2= 'to' ( ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) ) ) otherlv_4= '.'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0());
            		
            // InternalRailSL.g:375:3: ( (lv_points_1_0= RULE_INT ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRailSL.g:376:4: (lv_points_1_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:376:4: (lv_points_1_0= RULE_INT )
            	    // InternalRailSL.g:377:5: lv_points_1_0= RULE_INT
            	    {
            	    lv_points_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            	    					newLeafNode(lv_points_1_0, grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSetPointStatementRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"points",
            	    						lv_points_1_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSetPointStatementAccess().getToKeyword_2());
            		
            // InternalRailSL.g:397:3: ( ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) ) )
            // InternalRailSL.g:398:4: ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) )
            {
            // InternalRailSL.g:398:4: ( (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' ) )
            // InternalRailSL.g:399:5: (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' )
            {
            // InternalRailSL.g:399:5: (lv_orientation_3_1= 'straight' | lv_orientation_3_2= 'branch' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:400:6: lv_orientation_3_1= 'straight'
                    {
                    lv_orientation_3_1=(Token)match(input,22,FOLLOW_9); 

                    						newLeafNode(lv_orientation_3_1, grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetPointStatementRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:411:6: lv_orientation_3_2= 'branch'
                    {
                    lv_orientation_3_2=(Token)match(input,23,FOLLOW_9); 

                    						newLeafNode(lv_orientation_3_2, grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetPointStatementRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSetPointStatementAccess().getFullStopKeyword_4());
            		

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
    // $ANTLR end "ruleSetPointStatement"


    // $ANTLR start "entryRuleWaitStatement"
    // InternalRailSL.g:432:1: entryRuleWaitStatement returns [EObject current=null] : iv_ruleWaitStatement= ruleWaitStatement EOF ;
    public final EObject entryRuleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitStatement = null;


        try {
            // InternalRailSL.g:432:54: (iv_ruleWaitStatement= ruleWaitStatement EOF )
            // InternalRailSL.g:433:2: iv_ruleWaitStatement= ruleWaitStatement EOF
            {
             newCompositeNode(grammarAccess.getWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaitStatement=ruleWaitStatement();

            state._fsp--;

             current =iv_ruleWaitStatement; 
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
    // $ANTLR end "entryRuleWaitStatement"


    // $ANTLR start "ruleWaitStatement"
    // InternalRailSL.g:439:1: ruleWaitStatement returns [EObject current=null] : (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement ) ;
    public final EObject ruleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject this_TimeWaitStatement_0 = null;

        EObject this_ContactWaitStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:445:2: ( (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement ) )
            // InternalRailSL.g:446:2: (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement )
            {
            // InternalRailSL.g:446:2: (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:447:3: this_TimeWaitStatement_0= ruleTimeWaitStatement
                    {

                    			newCompositeNode(grammarAccess.getWaitStatementAccess().getTimeWaitStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeWaitStatement_0=ruleTimeWaitStatement();

                    state._fsp--;


                    			current = this_TimeWaitStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:456:3: this_ContactWaitStatement_1= ruleContactWaitStatement
                    {

                    			newCompositeNode(grammarAccess.getWaitStatementAccess().getContactWaitStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContactWaitStatement_1=ruleContactWaitStatement();

                    state._fsp--;


                    			current = this_ContactWaitStatement_1;
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
    // $ANTLR end "ruleWaitStatement"


    // $ANTLR start "entryRuleTimeWaitStatement"
    // InternalRailSL.g:468:1: entryRuleTimeWaitStatement returns [EObject current=null] : iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF ;
    public final EObject entryRuleTimeWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeWaitStatement = null;


        try {
            // InternalRailSL.g:468:58: (iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF )
            // InternalRailSL.g:469:2: iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF
            {
             newCompositeNode(grammarAccess.getTimeWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeWaitStatement=ruleTimeWaitStatement();

            state._fsp--;

             current =iv_ruleTimeWaitStatement; 
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
    // $ANTLR end "entryRuleTimeWaitStatement"


    // $ANTLR start "ruleTimeWaitStatement"
    // InternalRailSL.g:475:1: ruleTimeWaitStatement returns [EObject current=null] : ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' ) ;
    public final EObject ruleTimeWaitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRailSL.g:481:2: ( ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' ) )
            // InternalRailSL.g:482:2: ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' )
            {
            // InternalRailSL.g:482:2: ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' )
            // InternalRailSL.g:483:3: (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.'
            {
            // InternalRailSL.g:483:3: (otherlv_0= 'Wait for' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRailSL.g:484:4: otherlv_0= 'Wait for'
            	    {
            	    otherlv_0=(Token)match(input,24,FOLLOW_14); 

            	    				newLeafNode(otherlv_0, grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // InternalRailSL.g:489:3: ( (lv_time_1_0= RULE_INT ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRailSL.g:490:4: (lv_time_1_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:490:4: (lv_time_1_0= RULE_INT )
            	    // InternalRailSL.g:491:5: lv_time_1_0= RULE_INT
            	    {
            	    lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            	    					newLeafNode(lv_time_1_0, grammarAccess.getTimeWaitStatementAccess().getTimeINTTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTimeWaitStatementRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"time",
            	    						lv_time_1_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeWaitStatementAccess().getSecondsKeyword_2());
            		

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
    // $ANTLR end "ruleTimeWaitStatement"


    // $ANTLR start "entryRuleContactWaitStatement"
    // InternalRailSL.g:515:1: entryRuleContactWaitStatement returns [EObject current=null] : iv_ruleContactWaitStatement= ruleContactWaitStatement EOF ;
    public final EObject entryRuleContactWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactWaitStatement = null;


        try {
            // InternalRailSL.g:515:61: (iv_ruleContactWaitStatement= ruleContactWaitStatement EOF )
            // InternalRailSL.g:516:2: iv_ruleContactWaitStatement= ruleContactWaitStatement EOF
            {
             newCompositeNode(grammarAccess.getContactWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContactWaitStatement=ruleContactWaitStatement();

            state._fsp--;

             current =iv_ruleContactWaitStatement; 
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
    // $ANTLR end "entryRuleContactWaitStatement"


    // $ANTLR start "ruleContactWaitStatement"
    // InternalRailSL.g:522:1: ruleContactWaitStatement returns [EObject current=null] : ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' ) ;
    public final EObject ruleContactWaitStatement() throws RecognitionException {
        EObject current = null;

        Token lv_event_0_1=null;
        Token lv_event_0_2=null;
        Token lv_contactIndex_1_1=null;
        Token lv_contactIndex_1_2=null;
        Token otherlv_2=null;
        Token lv_segName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRailSL.g:528:2: ( ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' ) )
            // InternalRailSL.g:529:2: ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' )
            {
            // InternalRailSL.g:529:2: ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' )
            // InternalRailSL.g:530:3: ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.'
            {
            // InternalRailSL.g:530:3: ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) )
            // InternalRailSL.g:531:4: ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) )
            {
            // InternalRailSL.g:531:4: ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) )
            // InternalRailSL.g:532:5: (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' )
            {
            // InternalRailSL.g:532:5: (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRailSL.g:533:6: lv_event_0_1= 'Reach'
                    {
                    lv_event_0_1=(Token)match(input,26,FOLLOW_16); 

                    						newLeafNode(lv_event_0_1, grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContactWaitStatementRule());
                    						}
                    						setWithLastConsumed(current, "event", lv_event_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:544:6: lv_event_0_2= 'Pass'
                    {
                    lv_event_0_2=(Token)match(input,27,FOLLOW_16); 

                    						newLeafNode(lv_event_0_2, grammarAccess.getContactWaitStatementAccess().getEventPassKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContactWaitStatementRule());
                    						}
                    						setWithLastConsumed(current, "event", lv_event_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalRailSL.g:557:3: ( ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) ) )
            // InternalRailSL.g:558:4: ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) )
            {
            // InternalRailSL.g:558:4: ( (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' ) )
            // InternalRailSL.g:559:5: (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' )
            {
            // InternalRailSL.g:559:5: (lv_contactIndex_1_1= 'first' | lv_contactIndex_1_2= 'second' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRailSL.g:560:6: lv_contactIndex_1_1= 'first'
                    {
                    lv_contactIndex_1_1=(Token)match(input,28,FOLLOW_17); 

                    						newLeafNode(lv_contactIndex_1_1, grammarAccess.getContactWaitStatementAccess().getContactIndexFirstKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContactWaitStatementRule());
                    						}
                    						setWithLastConsumed(current, "contactIndex", lv_contactIndex_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:571:6: lv_contactIndex_1_2= 'second'
                    {
                    lv_contactIndex_1_2=(Token)match(input,29,FOLLOW_17); 

                    						newLeafNode(lv_contactIndex_1_2, grammarAccess.getContactWaitStatementAccess().getContactIndexSecondKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContactWaitStatementRule());
                    						}
                    						setWithLastConsumed(current, "contactIndex", lv_contactIndex_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2());
            		
            // InternalRailSL.g:588:3: ( (lv_segName_3_0= RULE_SEG_NAME ) )
            // InternalRailSL.g:589:4: (lv_segName_3_0= RULE_SEG_NAME )
            {
            // InternalRailSL.g:589:4: (lv_segName_3_0= RULE_SEG_NAME )
            // InternalRailSL.g:590:5: lv_segName_3_0= RULE_SEG_NAME
            {
            lv_segName_3_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_9); 

            					newLeafNode(lv_segName_3_0, grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactWaitStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segName",
            						lv_segName_3_0,
            						"de.cau.rtsys.peu.RailSL.SEG_NAME");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContactWaitStatementAccess().getFullStopKeyword_4());
            		

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
    // $ANTLR end "ruleContactWaitStatement"


    // $ANTLR start "entryRuleOpStatement"
    // InternalRailSL.g:614:1: entryRuleOpStatement returns [EObject current=null] : iv_ruleOpStatement= ruleOpStatement EOF ;
    public final EObject entryRuleOpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpStatement = null;


        try {
            // InternalRailSL.g:614:52: (iv_ruleOpStatement= ruleOpStatement EOF )
            // InternalRailSL.g:615:2: iv_ruleOpStatement= ruleOpStatement EOF
            {
             newCompositeNode(grammarAccess.getOpStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpStatement=ruleOpStatement();

            state._fsp--;

             current =iv_ruleOpStatement; 
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
    // $ANTLR end "entryRuleOpStatement"


    // $ANTLR start "ruleOpStatement"
    // InternalRailSL.g:621:1: ruleOpStatement returns [EObject current=null] : ( ruleCrossingStatement | this_LightStatement_1= ruleLightStatement ) ;
    public final EObject ruleOpStatement() throws RecognitionException {
        EObject current = null;

        EObject this_LightStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:627:2: ( ( ruleCrossingStatement | this_LightStatement_1= ruleLightStatement ) )
            // InternalRailSL.g:628:2: ( ruleCrossingStatement | this_LightStatement_1= ruleLightStatement )
            {
            // InternalRailSL.g:628:2: ( ruleCrossingStatement | this_LightStatement_1= ruleLightStatement )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=31 && LA16_0<=32)) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRailSL.g:629:3: ruleCrossingStatement
                    {

                    			newCompositeNode(grammarAccess.getOpStatementAccess().getCrossingStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    ruleCrossingStatement();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:637:3: this_LightStatement_1= ruleLightStatement
                    {

                    			newCompositeNode(grammarAccess.getOpStatementAccess().getLightStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LightStatement_1=ruleLightStatement();

                    state._fsp--;


                    			current = this_LightStatement_1;
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
    // $ANTLR end "ruleOpStatement"


    // $ANTLR start "entryRuleCrossingStatement"
    // InternalRailSL.g:649:1: entryRuleCrossingStatement returns [String current=null] : iv_ruleCrossingStatement= ruleCrossingStatement EOF ;
    public final String entryRuleCrossingStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCrossingStatement = null;


        try {
            // InternalRailSL.g:649:57: (iv_ruleCrossingStatement= ruleCrossingStatement EOF )
            // InternalRailSL.g:650:2: iv_ruleCrossingStatement= ruleCrossingStatement EOF
            {
             newCompositeNode(grammarAccess.getCrossingStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossingStatement=ruleCrossingStatement();

            state._fsp--;

             current =iv_ruleCrossingStatement.getText(); 
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
    // $ANTLR end "entryRuleCrossingStatement"


    // $ANTLR start "ruleCrossingStatement"
    // InternalRailSL.g:656:1: ruleCrossingStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'Open' | kw= 'Close' ) kw= 'crossing.' ) ;
    public final AntlrDatatypeRuleToken ruleCrossingStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:662:2: ( ( (kw= 'Open' | kw= 'Close' ) kw= 'crossing.' ) )
            // InternalRailSL.g:663:2: ( (kw= 'Open' | kw= 'Close' ) kw= 'crossing.' )
            {
            // InternalRailSL.g:663:2: ( (kw= 'Open' | kw= 'Close' ) kw= 'crossing.' )
            // InternalRailSL.g:664:3: (kw= 'Open' | kw= 'Close' ) kw= 'crossing.'
            {
            // InternalRailSL.g:664:3: (kw= 'Open' | kw= 'Close' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==32) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRailSL.g:665:4: kw= 'Open'
                    {
                    kw=(Token)match(input,31,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCrossingStatementAccess().getOpenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:671:4: kw= 'Close'
                    {
                    kw=(Token)match(input,32,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCrossingStatementAccess().getCloseKeyword_0_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1());
            		

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
    // $ANTLR end "ruleCrossingStatement"


    // $ANTLR start "entryRuleLightStatement"
    // InternalRailSL.g:686:1: entryRuleLightStatement returns [EObject current=null] : iv_ruleLightStatement= ruleLightStatement EOF ;
    public final EObject entryRuleLightStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightStatement = null;


        try {
            // InternalRailSL.g:686:55: (iv_ruleLightStatement= ruleLightStatement EOF )
            // InternalRailSL.g:687:2: iv_ruleLightStatement= ruleLightStatement EOF
            {
             newCompositeNode(grammarAccess.getLightStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLightStatement=ruleLightStatement();

            state._fsp--;

             current =iv_ruleLightStatement; 
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
    // $ANTLR end "entryRuleLightStatement"


    // $ANTLR start "ruleLightStatement"
    // InternalRailSL.g:693:1: ruleLightStatement returns [EObject current=null] : (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) )+ ( ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) ) ) otherlv_3= '.' ) ;
    public final EObject ruleLightStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lights_1_0=null;
        Token lv_state_2_1=null;
        Token lv_state_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRailSL.g:699:2: ( (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) )+ ( ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) ) ) otherlv_3= '.' ) )
            // InternalRailSL.g:700:2: (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) )+ ( ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) ) ) otherlv_3= '.' )
            {
            // InternalRailSL.g:700:2: (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) )+ ( ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) ) ) otherlv_3= '.' )
            // InternalRailSL.g:701:3: otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) )+ ( ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) ) ) otherlv_3= '.'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLightStatementAccess().getTurnLightKeyword_0());
            		
            // InternalRailSL.g:705:3: ( (lv_lights_1_0= RULE_INT ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRailSL.g:706:4: (lv_lights_1_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:706:4: (lv_lights_1_0= RULE_INT )
            	    // InternalRailSL.g:707:5: lv_lights_1_0= RULE_INT
            	    {
            	    lv_lights_1_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    					newLeafNode(lv_lights_1_0, grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLightStatementRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"lights",
            	    						lv_lights_1_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // InternalRailSL.g:723:3: ( ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) ) )
            // InternalRailSL.g:724:4: ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) )
            {
            // InternalRailSL.g:724:4: ( (lv_state_2_1= 'on' | lv_state_2_2= 'off' ) )
            // InternalRailSL.g:725:5: (lv_state_2_1= 'on' | lv_state_2_2= 'off' )
            {
            // InternalRailSL.g:725:5: (lv_state_2_1= 'on' | lv_state_2_2= 'off' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRailSL.g:726:6: lv_state_2_1= 'on'
                    {
                    lv_state_2_1=(Token)match(input,35,FOLLOW_9); 

                    						newLeafNode(lv_state_2_1, grammarAccess.getLightStatementAccess().getStateOnKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLightStatementRule());
                    						}
                    						setWithLastConsumed(current, "state", lv_state_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:737:6: lv_state_2_2= 'off'
                    {
                    lv_state_2_2=(Token)match(input,36,FOLLOW_9); 

                    						newLeafNode(lv_state_2_2, grammarAccess.getLightStatementAccess().getStateOffKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLightStatementRule());
                    						}
                    						setWithLastConsumed(current, "state", lv_state_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLightStatementAccess().getFullStopKeyword_3());
            		

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
    // $ANTLR end "ruleLightStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000058D204000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000058D204010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001800000040L});

}