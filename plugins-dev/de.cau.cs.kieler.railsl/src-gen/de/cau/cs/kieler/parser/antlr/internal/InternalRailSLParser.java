package de.cau.cs.kieler.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.services.RailSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEG_NAME", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Start:'", "'End.'", "'Loop.'", "'Set track'", "', '", "'and'", "', and'", "'to'", "'.'", "'full'", "'slow'", "'reverse'", "'stop'", "'Set point'", "'straight'", "'branch'", "'Wait for'", "'seconds.'", "'Reach'", "'Pass'", "'contact of'", "'Open'", "'Close'", "'crossing.'", "'Turn light'", "'on'", "'off'", "'Branch:'", "'If'", "'is reached first, do'", "'first'", "'second'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SEG_NAME=4;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalRailSL.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_blocks_0_0= ruleBlock ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_blocks_0_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:77:2: ( ( (lv_blocks_0_0= ruleBlock ) )* )
            // InternalRailSL.g:78:2: ( (lv_blocks_0_0= ruleBlock ) )*
            {
            // InternalRailSL.g:78:2: ( (lv_blocks_0_0= ruleBlock ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
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
            	    					"de.cau.cs.kieler.RailSL.Block");
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
    // InternalRailSL.g:107:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= ruleBLOCK_END ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_statements_1_0 = null;

        AntlrDatatypeRuleToken lv_end_2_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:113:2: ( (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= ruleBLOCK_END ) ) ) )
            // InternalRailSL.g:114:2: (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= ruleBLOCK_END ) ) )
            {
            // InternalRailSL.g:114:2: (otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= ruleBLOCK_END ) ) )
            // InternalRailSL.g:115:3: otherlv_0= 'Start:' ( (lv_statements_1_0= ruleStatement ) )+ ( (lv_end_2_0= ruleBLOCK_END ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getStartKeyword_0());
            		
            // InternalRailSL.g:119:3: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15||LA2_0==25||LA2_0==28||(LA2_0>=30 && LA2_0<=31)||(LA2_0>=33 && LA2_0<=34)||LA2_0==36||LA2_0==39) ) {
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
            	    						"de.cau.cs.kieler.RailSL.Statement");
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

            // InternalRailSL.g:138:3: ( (lv_end_2_0= ruleBLOCK_END ) )
            // InternalRailSL.g:139:4: (lv_end_2_0= ruleBLOCK_END )
            {
            // InternalRailSL.g:139:4: (lv_end_2_0= ruleBLOCK_END )
            // InternalRailSL.g:140:5: lv_end_2_0= ruleBLOCK_END
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getEndBLOCK_ENDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_end_2_0=ruleBLOCK_END();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"de.cau.cs.kieler.RailSL.BLOCK_END");
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBLOCK_END"
    // InternalRailSL.g:161:1: entryRuleBLOCK_END returns [String current=null] : iv_ruleBLOCK_END= ruleBLOCK_END EOF ;
    public final String entryRuleBLOCK_END() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBLOCK_END = null;


        try {
            // InternalRailSL.g:161:49: (iv_ruleBLOCK_END= ruleBLOCK_END EOF )
            // InternalRailSL.g:162:2: iv_ruleBLOCK_END= ruleBLOCK_END EOF
            {
             newCompositeNode(grammarAccess.getBLOCK_ENDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBLOCK_END=ruleBLOCK_END();

            state._fsp--;

             current =iv_ruleBLOCK_END.getText(); 
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
    // $ANTLR end "entryRuleBLOCK_END"


    // $ANTLR start "ruleBLOCK_END"
    // InternalRailSL.g:168:1: ruleBLOCK_END returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'End.' | kw= 'Loop.' ) ;
    public final AntlrDatatypeRuleToken ruleBLOCK_END() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:174:2: ( (kw= 'End.' | kw= 'Loop.' ) )
            // InternalRailSL.g:175:2: (kw= 'End.' | kw= 'Loop.' )
            {
            // InternalRailSL.g:175:2: (kw= 'End.' | kw= 'Loop.' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRailSL.g:176:3: kw= 'End.'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:182:3: kw= 'Loop.'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBLOCK_ENDAccess().getLoopKeyword_1());
                    		

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
    // $ANTLR end "ruleBLOCK_END"


    // $ANTLR start "entryRuleStatement"
    // InternalRailSL.g:191:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRailSL.g:191:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRailSL.g:192:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRailSL.g:198:1: ruleStatement returns [EObject current=null] : (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement | this_ConditionalStatement_3= ruleConditionalStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SetStatement_0 = null;

        EObject this_WaitStatement_1 = null;

        EObject this_OpStatement_2 = null;

        EObject this_ConditionalStatement_3 = null;



        	enterRule();

        try {
            // InternalRailSL.g:204:2: ( (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement | this_ConditionalStatement_3= ruleConditionalStatement ) )
            // InternalRailSL.g:205:2: (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement | this_ConditionalStatement_3= ruleConditionalStatement )
            {
            // InternalRailSL.g:205:2: (this_SetStatement_0= ruleSetStatement | this_WaitStatement_1= ruleWaitStatement | this_OpStatement_2= ruleOpStatement | this_ConditionalStatement_3= ruleConditionalStatement )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
            case 25:
                {
                alt4=1;
                }
                break;
            case 28:
            case 30:
            case 31:
                {
                alt4=2;
                }
                break;
            case 33:
            case 34:
            case 36:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRailSL.g:206:3: this_SetStatement_0= ruleSetStatement
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
                    // InternalRailSL.g:215:3: this_WaitStatement_1= ruleWaitStatement
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
                    // InternalRailSL.g:224:3: this_OpStatement_2= ruleOpStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getOpStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpStatement_2=ruleOpStatement();

                    state._fsp--;


                    			current = this_OpStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRailSL.g:233:3: this_ConditionalStatement_3= ruleConditionalStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getConditionalStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalStatement_3=ruleConditionalStatement();

                    state._fsp--;


                    			current = this_ConditionalStatement_3;
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
    // InternalRailSL.g:245:1: entryRuleSetStatement returns [EObject current=null] : iv_ruleSetStatement= ruleSetStatement EOF ;
    public final EObject entryRuleSetStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetStatement = null;


        try {
            // InternalRailSL.g:245:53: (iv_ruleSetStatement= ruleSetStatement EOF )
            // InternalRailSL.g:246:2: iv_ruleSetStatement= ruleSetStatement EOF
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
    // InternalRailSL.g:252:1: ruleSetStatement returns [EObject current=null] : (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement ) ;
    public final EObject ruleSetStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SetTrackStatement_0 = null;

        EObject this_SetPointStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:258:2: ( (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement ) )
            // InternalRailSL.g:259:2: (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement )
            {
            // InternalRailSL.g:259:2: (this_SetTrackStatement_0= ruleSetTrackStatement | this_SetPointStatement_1= ruleSetPointStatement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRailSL.g:260:3: this_SetTrackStatement_0= ruleSetTrackStatement
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
                    // InternalRailSL.g:269:3: this_SetPointStatement_1= ruleSetPointStatement
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
    // InternalRailSL.g:281:1: entryRuleSetTrackStatement returns [EObject current=null] : iv_ruleSetTrackStatement= ruleSetTrackStatement EOF ;
    public final EObject entryRuleSetTrackStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetTrackStatement = null;


        try {
            // InternalRailSL.g:281:58: (iv_ruleSetTrackStatement= ruleSetTrackStatement EOF )
            // InternalRailSL.g:282:2: iv_ruleSetTrackStatement= ruleSetTrackStatement EOF
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
    // InternalRailSL.g:288:1: ruleSetTrackStatement returns [EObject current=null] : (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) ) (otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) ) )* ( (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) ) | (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) ) )? otherlv_8= 'to' ( (lv_mode_9_0= ruleTrackSetting ) ) otherlv_10= '.' ) ;
    public final EObject ruleSetTrackStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_segments_1_0=null;
        Token otherlv_2=null;
        Token lv_segments_3_0=null;
        Token otherlv_4=null;
        Token lv_segments_5_0=null;
        Token otherlv_6=null;
        Token lv_segments_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_mode_9_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:294:2: ( (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) ) (otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) ) )* ( (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) ) | (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) ) )? otherlv_8= 'to' ( (lv_mode_9_0= ruleTrackSetting ) ) otherlv_10= '.' ) )
            // InternalRailSL.g:295:2: (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) ) (otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) ) )* ( (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) ) | (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) ) )? otherlv_8= 'to' ( (lv_mode_9_0= ruleTrackSetting ) ) otherlv_10= '.' )
            {
            // InternalRailSL.g:295:2: (otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) ) (otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) ) )* ( (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) ) | (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) ) )? otherlv_8= 'to' ( (lv_mode_9_0= ruleTrackSetting ) ) otherlv_10= '.' )
            // InternalRailSL.g:296:3: otherlv_0= 'Set track' ( (lv_segments_1_0= RULE_SEG_NAME ) ) (otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) ) )* ( (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) ) | (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) ) )? otherlv_8= 'to' ( (lv_mode_9_0= ruleTrackSetting ) ) otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0());
            		
            // InternalRailSL.g:300:3: ( (lv_segments_1_0= RULE_SEG_NAME ) )
            // InternalRailSL.g:301:4: (lv_segments_1_0= RULE_SEG_NAME )
            {
            // InternalRailSL.g:301:4: (lv_segments_1_0= RULE_SEG_NAME )
            // InternalRailSL.g:302:5: lv_segments_1_0= RULE_SEG_NAME
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
            						"de.cau.cs.kieler.RailSL.SEG_NAME");
            				

            }


            }

            // InternalRailSL.g:318:3: (otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRailSL.g:319:4: otherlv_2= ', ' ( (lv_segments_3_0= RULE_SEG_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSetTrackStatementAccess().getCommaSpaceKeyword_2_0());
            	    			
            	    // InternalRailSL.g:323:4: ( (lv_segments_3_0= RULE_SEG_NAME ) )
            	    // InternalRailSL.g:324:5: (lv_segments_3_0= RULE_SEG_NAME )
            	    {
            	    // InternalRailSL.g:324:5: (lv_segments_3_0= RULE_SEG_NAME )
            	    // InternalRailSL.g:325:6: lv_segments_3_0= RULE_SEG_NAME
            	    {
            	    lv_segments_3_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_7); 

            	    						newLeafNode(lv_segments_3_0, grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSetTrackStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"segments",
            	    							lv_segments_3_0,
            	    							"de.cau.cs.kieler.RailSL.SEG_NAME");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalRailSL.g:342:3: ( (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) ) | (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) ) )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailSL.g:343:4: (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) )
                    {
                    // InternalRailSL.g:343:4: (otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) ) )
                    // InternalRailSL.g:344:5: otherlv_4= 'and' ( (lv_segments_5_0= RULE_SEG_NAME ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_0_0());
                    				
                    // InternalRailSL.g:348:5: ( (lv_segments_5_0= RULE_SEG_NAME ) )
                    // InternalRailSL.g:349:6: (lv_segments_5_0= RULE_SEG_NAME )
                    {
                    // InternalRailSL.g:349:6: (lv_segments_5_0= RULE_SEG_NAME )
                    // InternalRailSL.g:350:7: lv_segments_5_0= RULE_SEG_NAME
                    {
                    lv_segments_5_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_8); 

                    							newLeafNode(lv_segments_5_0, grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSetTrackStatementRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"segments",
                    								lv_segments_5_0,
                    								"de.cau.cs.kieler.RailSL.SEG_NAME");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:368:4: (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) )
                    {
                    // InternalRailSL.g:368:4: (otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) ) )
                    // InternalRailSL.g:369:5: otherlv_6= ', and' ( (lv_segments_7_0= RULE_SEG_NAME ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getSetTrackStatementAccess().getAndKeyword_3_1_0());
                    				
                    // InternalRailSL.g:373:5: ( (lv_segments_7_0= RULE_SEG_NAME ) )
                    // InternalRailSL.g:374:6: (lv_segments_7_0= RULE_SEG_NAME )
                    {
                    // InternalRailSL.g:374:6: (lv_segments_7_0= RULE_SEG_NAME )
                    // InternalRailSL.g:375:7: lv_segments_7_0= RULE_SEG_NAME
                    {
                    lv_segments_7_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_8); 

                    							newLeafNode(lv_segments_7_0, grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMETerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSetTrackStatementRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"segments",
                    								lv_segments_7_0,
                    								"de.cau.cs.kieler.RailSL.SEG_NAME");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSetTrackStatementAccess().getToKeyword_4());
            		
            // InternalRailSL.g:397:3: ( (lv_mode_9_0= ruleTrackSetting ) )
            // InternalRailSL.g:398:4: (lv_mode_9_0= ruleTrackSetting )
            {
            // InternalRailSL.g:398:4: (lv_mode_9_0= ruleTrackSetting )
            // InternalRailSL.g:399:5: lv_mode_9_0= ruleTrackSetting
            {

            					newCompositeNode(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_mode_9_0=ruleTrackSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTrackStatementRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_9_0,
            						"de.cau.cs.kieler.RailSL.TrackSetting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_6());
            		

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
    // InternalRailSL.g:424:1: entryRuleTrackSetting returns [String current=null] : iv_ruleTrackSetting= ruleTrackSetting EOF ;
    public final String entryRuleTrackSetting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrackSetting = null;


        try {
            // InternalRailSL.g:424:52: (iv_ruleTrackSetting= ruleTrackSetting EOF )
            // InternalRailSL.g:425:2: iv_ruleTrackSetting= ruleTrackSetting EOF
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
    // InternalRailSL.g:431:1: ruleTrackSetting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' ) ;
    public final AntlrDatatypeRuleToken ruleTrackSetting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:437:2: ( ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' ) )
            // InternalRailSL.g:438:2: ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' )
            {
            // InternalRailSL.g:438:2: ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRailSL.g:439:3: ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? )
                    {
                    // InternalRailSL.g:439:3: ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? )
                    // InternalRailSL.g:440:4: (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )?
                    {
                    // InternalRailSL.g:440:4: (kw= 'full' | kw= 'slow' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==22) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRailSL.g:441:5: kw= 'full'
                            {
                            kw=(Token)match(input,21,FOLLOW_11); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRailSL.g:447:5: kw= 'slow'
                            {
                            kw=(Token)match(input,22,FOLLOW_11); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getSlowKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRailSL.g:453:4: (kw= 'reverse' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==23) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRailSL.g:454:5: kw= 'reverse'
                            {
                            kw=(Token)match(input,23,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getReverseKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:462:3: kw= 'stop'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalRailSL.g:471:1: entryRuleSetPointStatement returns [EObject current=null] : iv_ruleSetPointStatement= ruleSetPointStatement EOF ;
    public final EObject entryRuleSetPointStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPointStatement = null;


        try {
            // InternalRailSL.g:471:58: (iv_ruleSetPointStatement= ruleSetPointStatement EOF )
            // InternalRailSL.g:472:2: iv_ruleSetPointStatement= ruleSetPointStatement EOF
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
    // InternalRailSL.g:478:1: ruleSetPointStatement returns [EObject current=null] : (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) ) )? otherlv_8= 'to' ( ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) ) ) otherlv_10= '.' ) ;
    public final EObject ruleSetPointStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_points_1_0=null;
        Token otherlv_2=null;
        Token lv_points_3_0=null;
        Token otherlv_4=null;
        Token lv_points_5_0=null;
        Token otherlv_6=null;
        Token lv_points_7_0=null;
        Token otherlv_8=null;
        Token lv_orientation_9_1=null;
        Token lv_orientation_9_2=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalRailSL.g:484:2: ( (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) ) )? otherlv_8= 'to' ( ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) ) ) otherlv_10= '.' ) )
            // InternalRailSL.g:485:2: (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) ) )? otherlv_8= 'to' ( ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) ) ) otherlv_10= '.' )
            {
            // InternalRailSL.g:485:2: (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) ) )? otherlv_8= 'to' ( ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) ) ) otherlv_10= '.' )
            // InternalRailSL.g:486:3: otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) ) )? otherlv_8= 'to' ( ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) ) ) otherlv_10= '.'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0());
            		
            // InternalRailSL.g:490:3: ( (lv_points_1_0= RULE_INT ) )
            // InternalRailSL.g:491:4: (lv_points_1_0= RULE_INT )
            {
            // InternalRailSL.g:491:4: (lv_points_1_0= RULE_INT )
            // InternalRailSL.g:492:5: lv_points_1_0= RULE_INT
            {
            lv_points_1_0=(Token)match(input,RULE_INT,FOLLOW_7); 

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

            // InternalRailSL.g:508:3: (otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRailSL.g:509:4: otherlv_2= ', ' ( (lv_points_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSetPointStatementAccess().getCommaSpaceKeyword_2_0());
            	    			
            	    // InternalRailSL.g:513:4: ( (lv_points_3_0= RULE_INT ) )
            	    // InternalRailSL.g:514:5: (lv_points_3_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:514:5: (lv_points_3_0= RULE_INT )
            	    // InternalRailSL.g:515:6: lv_points_3_0= RULE_INT
            	    {
            	    lv_points_3_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            	    						newLeafNode(lv_points_3_0, grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSetPointStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"points",
            	    							lv_points_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRailSL.g:532:3: ( (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:533:4: (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) )
                    {
                    // InternalRailSL.g:533:4: (otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) ) )
                    // InternalRailSL.g:534:5: otherlv_4= 'and' ( (lv_points_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getSetPointStatementAccess().getAndKeyword_3_0_0());
                    				
                    // InternalRailSL.g:538:5: ( (lv_points_5_0= RULE_INT ) )
                    // InternalRailSL.g:539:6: (lv_points_5_0= RULE_INT )
                    {
                    // InternalRailSL.g:539:6: (lv_points_5_0= RULE_INT )
                    // InternalRailSL.g:540:7: lv_points_5_0= RULE_INT
                    {
                    lv_points_5_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    							newLeafNode(lv_points_5_0, grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSetPointStatementRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"points",
                    								lv_points_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:558:4: (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) )
                    {
                    // InternalRailSL.g:558:4: (otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) ) )
                    // InternalRailSL.g:559:5: otherlv_6= ', and' ( (lv_points_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getSetPointStatementAccess().getAndKeyword_3_1_0());
                    				
                    // InternalRailSL.g:563:5: ( (lv_points_7_0= RULE_INT ) )
                    // InternalRailSL.g:564:6: (lv_points_7_0= RULE_INT )
                    {
                    // InternalRailSL.g:564:6: (lv_points_7_0= RULE_INT )
                    // InternalRailSL.g:565:7: lv_points_7_0= RULE_INT
                    {
                    lv_points_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    							newLeafNode(lv_points_7_0, grammarAccess.getSetPointStatementAccess().getPointsINTTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSetPointStatementRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"points",
                    								lv_points_7_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getSetPointStatementAccess().getToKeyword_4());
            		
            // InternalRailSL.g:587:3: ( ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) ) )
            // InternalRailSL.g:588:4: ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) )
            {
            // InternalRailSL.g:588:4: ( (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' ) )
            // InternalRailSL.g:589:5: (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' )
            {
            // InternalRailSL.g:589:5: (lv_orientation_9_1= 'straight' | lv_orientation_9_2= 'branch' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRailSL.g:590:6: lv_orientation_9_1= 'straight'
                    {
                    lv_orientation_9_1=(Token)match(input,26,FOLLOW_10); 

                    						newLeafNode(lv_orientation_9_1, grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetPointStatementRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_9_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:601:6: lv_orientation_9_2= 'branch'
                    {
                    lv_orientation_9_2=(Token)match(input,27,FOLLOW_10); 

                    						newLeafNode(lv_orientation_9_2, grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_5_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetPointStatementRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_9_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSetPointStatementAccess().getFullStopKeyword_6());
            		

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
    // InternalRailSL.g:622:1: entryRuleWaitStatement returns [EObject current=null] : iv_ruleWaitStatement= ruleWaitStatement EOF ;
    public final EObject entryRuleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitStatement = null;


        try {
            // InternalRailSL.g:622:54: (iv_ruleWaitStatement= ruleWaitStatement EOF )
            // InternalRailSL.g:623:2: iv_ruleWaitStatement= ruleWaitStatement EOF
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
    // InternalRailSL.g:629:1: ruleWaitStatement returns [EObject current=null] : (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement ) ;
    public final EObject ruleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject this_TimeWaitStatement_0 = null;

        EObject this_ContactWaitStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:635:2: ( (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement ) )
            // InternalRailSL.g:636:2: (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement )
            {
            // InternalRailSL.g:636:2: (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=30 && LA14_0<=31)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRailSL.g:637:3: this_TimeWaitStatement_0= ruleTimeWaitStatement
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
                    // InternalRailSL.g:646:3: this_ContactWaitStatement_1= ruleContactWaitStatement
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
    // InternalRailSL.g:658:1: entryRuleTimeWaitStatement returns [EObject current=null] : iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF ;
    public final EObject entryRuleTimeWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeWaitStatement = null;


        try {
            // InternalRailSL.g:658:58: (iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF )
            // InternalRailSL.g:659:2: iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF
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
    // InternalRailSL.g:665:1: ruleTimeWaitStatement returns [EObject current=null] : ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' ) ;
    public final EObject ruleTimeWaitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRailSL.g:671:2: ( ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' ) )
            // InternalRailSL.g:672:2: ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' )
            {
            // InternalRailSL.g:672:2: ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' )
            // InternalRailSL.g:673:3: (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.'
            {
            // InternalRailSL.g:673:3: (otherlv_0= 'Wait for' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRailSL.g:674:4: otherlv_0= 'Wait for'
            	    {
            	    otherlv_0=(Token)match(input,28,FOLLOW_14); 

            	    				newLeafNode(otherlv_0, grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            // InternalRailSL.g:679:3: ( (lv_time_1_0= RULE_INT ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRailSL.g:680:4: (lv_time_1_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:680:4: (lv_time_1_0= RULE_INT )
            	    // InternalRailSL.g:681:5: lv_time_1_0= RULE_INT
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRailSL.g:705:1: entryRuleContactWaitStatement returns [EObject current=null] : iv_ruleContactWaitStatement= ruleContactWaitStatement EOF ;
    public final EObject entryRuleContactWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactWaitStatement = null;


        try {
            // InternalRailSL.g:705:61: (iv_ruleContactWaitStatement= ruleContactWaitStatement EOF )
            // InternalRailSL.g:706:2: iv_ruleContactWaitStatement= ruleContactWaitStatement EOF
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
    // InternalRailSL.g:712:1: ruleContactWaitStatement returns [EObject current=null] : ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' ) ;
    public final EObject ruleContactWaitStatement() throws RecognitionException {
        EObject current = null;

        Token lv_event_0_1=null;
        Token lv_event_0_2=null;
        Token otherlv_2=null;
        Token lv_segName_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_contactIndex_1_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:718:2: ( ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' ) )
            // InternalRailSL.g:719:2: ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' )
            {
            // InternalRailSL.g:719:2: ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.' )
            // InternalRailSL.g:720:3: ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) otherlv_4= '.'
            {
            // InternalRailSL.g:720:3: ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) )
            // InternalRailSL.g:721:4: ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) )
            {
            // InternalRailSL.g:721:4: ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) )
            // InternalRailSL.g:722:5: (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' )
            {
            // InternalRailSL.g:722:5: (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            else if ( (LA17_0==31) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRailSL.g:723:6: lv_event_0_1= 'Reach'
                    {
                    lv_event_0_1=(Token)match(input,30,FOLLOW_16); 

                    						newLeafNode(lv_event_0_1, grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContactWaitStatementRule());
                    						}
                    						setWithLastConsumed(current, "event", lv_event_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:734:6: lv_event_0_2= 'Pass'
                    {
                    lv_event_0_2=(Token)match(input,31,FOLLOW_16); 

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

            // InternalRailSL.g:747:3: ( (lv_contactIndex_1_0= ruleContactIndex ) )
            // InternalRailSL.g:748:4: (lv_contactIndex_1_0= ruleContactIndex )
            {
            // InternalRailSL.g:748:4: (lv_contactIndex_1_0= ruleContactIndex )
            // InternalRailSL.g:749:5: lv_contactIndex_1_0= ruleContactIndex
            {

            					newCompositeNode(grammarAccess.getContactWaitStatementAccess().getContactIndexContactIndexParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_contactIndex_1_0=ruleContactIndex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactWaitStatementRule());
            					}
            					set(
            						current,
            						"contactIndex",
            						lv_contactIndex_1_0,
            						"de.cau.cs.kieler.RailSL.ContactIndex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2());
            		
            // InternalRailSL.g:770:3: ( (lv_segName_3_0= RULE_SEG_NAME ) )
            // InternalRailSL.g:771:4: (lv_segName_3_0= RULE_SEG_NAME )
            {
            // InternalRailSL.g:771:4: (lv_segName_3_0= RULE_SEG_NAME )
            // InternalRailSL.g:772:5: lv_segName_3_0= RULE_SEG_NAME
            {
            lv_segName_3_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_10); 

            					newLeafNode(lv_segName_3_0, grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactWaitStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segName",
            						lv_segName_3_0,
            						"de.cau.cs.kieler.RailSL.SEG_NAME");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalRailSL.g:796:1: entryRuleOpStatement returns [EObject current=null] : iv_ruleOpStatement= ruleOpStatement EOF ;
    public final EObject entryRuleOpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpStatement = null;


        try {
            // InternalRailSL.g:796:52: (iv_ruleOpStatement= ruleOpStatement EOF )
            // InternalRailSL.g:797:2: iv_ruleOpStatement= ruleOpStatement EOF
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
    // InternalRailSL.g:803:1: ruleOpStatement returns [EObject current=null] : (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement ) ;
    public final EObject ruleOpStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CrossingStatement_0 = null;

        EObject this_LightStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:809:2: ( (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement ) )
            // InternalRailSL.g:810:2: (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement )
            {
            // InternalRailSL.g:810:2: (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=33 && LA18_0<=34)) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRailSL.g:811:3: this_CrossingStatement_0= ruleCrossingStatement
                    {

                    			newCompositeNode(grammarAccess.getOpStatementAccess().getCrossingStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrossingStatement_0=ruleCrossingStatement();

                    state._fsp--;


                    			current = this_CrossingStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:820:3: this_LightStatement_1= ruleLightStatement
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
    // InternalRailSL.g:832:1: entryRuleCrossingStatement returns [EObject current=null] : iv_ruleCrossingStatement= ruleCrossingStatement EOF ;
    public final EObject entryRuleCrossingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossingStatement = null;


        try {
            // InternalRailSL.g:832:58: (iv_ruleCrossingStatement= ruleCrossingStatement EOF )
            // InternalRailSL.g:833:2: iv_ruleCrossingStatement= ruleCrossingStatement EOF
            {
             newCompositeNode(grammarAccess.getCrossingStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossingStatement=ruleCrossingStatement();

            state._fsp--;

             current =iv_ruleCrossingStatement; 
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
    // InternalRailSL.g:839:1: ruleCrossingStatement returns [EObject current=null] : ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' ) ;
    public final EObject ruleCrossingStatement() throws RecognitionException {
        EObject current = null;

        Token lv_mode_0_1=null;
        Token lv_mode_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRailSL.g:845:2: ( ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' ) )
            // InternalRailSL.g:846:2: ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' )
            {
            // InternalRailSL.g:846:2: ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' )
            // InternalRailSL.g:847:3: ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.'
            {
            // InternalRailSL.g:847:3: ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) )
            // InternalRailSL.g:848:4: ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) )
            {
            // InternalRailSL.g:848:4: ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) )
            // InternalRailSL.g:849:5: (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' )
            {
            // InternalRailSL.g:849:5: (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRailSL.g:850:6: lv_mode_0_1= 'Open'
                    {
                    lv_mode_0_1=(Token)match(input,33,FOLLOW_18); 

                    						newLeafNode(lv_mode_0_1, grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCrossingStatementRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:861:6: lv_mode_0_2= 'Close'
                    {
                    lv_mode_0_2=(Token)match(input,34,FOLLOW_18); 

                    						newLeafNode(lv_mode_0_2, grammarAccess.getCrossingStatementAccess().getModeCloseKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCrossingStatementRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCrossingStatementAccess().getCrossingKeyword_1());
            		

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
    // InternalRailSL.g:882:1: entryRuleLightStatement returns [EObject current=null] : iv_ruleLightStatement= ruleLightStatement EOF ;
    public final EObject entryRuleLightStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightStatement = null;


        try {
            // InternalRailSL.g:882:55: (iv_ruleLightStatement= ruleLightStatement EOF )
            // InternalRailSL.g:883:2: iv_ruleLightStatement= ruleLightStatement EOF
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
    // InternalRailSL.g:889:1: ruleLightStatement returns [EObject current=null] : (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) ) )? ( ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) ) ) otherlv_9= '.' ) ;
    public final EObject ruleLightStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lights_1_0=null;
        Token otherlv_2=null;
        Token lv_lights_3_0=null;
        Token otherlv_4=null;
        Token lv_lights_5_0=null;
        Token otherlv_6=null;
        Token lv_lights_7_0=null;
        Token lv_state_8_1=null;
        Token lv_state_8_2=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalRailSL.g:895:2: ( (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) ) )? ( ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) ) ) otherlv_9= '.' ) )
            // InternalRailSL.g:896:2: (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) ) )? ( ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) ) ) otherlv_9= '.' )
            {
            // InternalRailSL.g:896:2: (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) ) )? ( ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) ) ) otherlv_9= '.' )
            // InternalRailSL.g:897:3: otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) ) )* ( (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) ) )? ( ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) ) ) otherlv_9= '.'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLightStatementAccess().getTurnLightKeyword_0());
            		
            // InternalRailSL.g:901:3: ( (lv_lights_1_0= RULE_INT ) )
            // InternalRailSL.g:902:4: (lv_lights_1_0= RULE_INT )
            {
            // InternalRailSL.g:902:4: (lv_lights_1_0= RULE_INT )
            // InternalRailSL.g:903:5: lv_lights_1_0= RULE_INT
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

            // InternalRailSL.g:919:3: (otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRailSL.g:920:4: otherlv_2= ', ' ( (lv_lights_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLightStatementAccess().getCommaSpaceKeyword_2_0());
            	    			
            	    // InternalRailSL.g:924:4: ( (lv_lights_3_0= RULE_INT ) )
            	    // InternalRailSL.g:925:5: (lv_lights_3_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:925:5: (lv_lights_3_0= RULE_INT )
            	    // InternalRailSL.g:926:6: lv_lights_3_0= RULE_INT
            	    {
            	    lv_lights_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    						newLeafNode(lv_lights_3_0, grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLightStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"lights",
            	    							lv_lights_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalRailSL.g:943:3: ( (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) ) | (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            else if ( (LA21_0==18) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalRailSL.g:944:4: (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) )
                    {
                    // InternalRailSL.g:944:4: (otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) ) )
                    // InternalRailSL.g:945:5: otherlv_4= 'and' ( (lv_lights_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getLightStatementAccess().getAndKeyword_3_0_0());
                    				
                    // InternalRailSL.g:949:5: ( (lv_lights_5_0= RULE_INT ) )
                    // InternalRailSL.g:950:6: (lv_lights_5_0= RULE_INT )
                    {
                    // InternalRailSL.g:950:6: (lv_lights_5_0= RULE_INT )
                    // InternalRailSL.g:951:7: lv_lights_5_0= RULE_INT
                    {
                    lv_lights_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    							newLeafNode(lv_lights_5_0, grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_3_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLightStatementRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"lights",
                    								lv_lights_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:969:4: (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) )
                    {
                    // InternalRailSL.g:969:4: (otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) ) )
                    // InternalRailSL.g:970:5: otherlv_6= ', and' ( (lv_lights_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(otherlv_6, grammarAccess.getLightStatementAccess().getAndKeyword_3_1_0());
                    				
                    // InternalRailSL.g:974:5: ( (lv_lights_7_0= RULE_INT ) )
                    // InternalRailSL.g:975:6: (lv_lights_7_0= RULE_INT )
                    {
                    // InternalRailSL.g:975:6: (lv_lights_7_0= RULE_INT )
                    // InternalRailSL.g:976:7: lv_lights_7_0= RULE_INT
                    {
                    lv_lights_7_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    							newLeafNode(lv_lights_7_0, grammarAccess.getLightStatementAccess().getLightsINTTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getLightStatementRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"lights",
                    								lv_lights_7_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRailSL.g:994:3: ( ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) ) )
            // InternalRailSL.g:995:4: ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) )
            {
            // InternalRailSL.g:995:4: ( (lv_state_8_1= 'on' | lv_state_8_2= 'off' ) )
            // InternalRailSL.g:996:5: (lv_state_8_1= 'on' | lv_state_8_2= 'off' )
            {
            // InternalRailSL.g:996:5: (lv_state_8_1= 'on' | lv_state_8_2= 'off' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalRailSL.g:997:6: lv_state_8_1= 'on'
                    {
                    lv_state_8_1=(Token)match(input,37,FOLLOW_10); 

                    						newLeafNode(lv_state_8_1, grammarAccess.getLightStatementAccess().getStateOnKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLightStatementRule());
                    						}
                    						setWithLastConsumed(current, "state", lv_state_8_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:1008:6: lv_state_8_2= 'off'
                    {
                    lv_state_8_2=(Token)match(input,38,FOLLOW_10); 

                    						newLeafNode(lv_state_8_2, grammarAccess.getLightStatementAccess().getStateOffKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLightStatementRule());
                    						}
                    						setWithLastConsumed(current, "state", lv_state_8_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLightStatementAccess().getFullStopKeyword_5());
            		

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


    // $ANTLR start "entryRuleConditionalStatement"
    // InternalRailSL.g:1029:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalRailSL.g:1029:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalRailSL.g:1030:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
            {
             newCompositeNode(grammarAccess.getConditionalStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalStatement=ruleConditionalStatement();

            state._fsp--;

             current =iv_ruleConditionalStatement; 
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
    // $ANTLR end "entryRuleConditionalStatement"


    // $ANTLR start "ruleConditionalStatement"
    // InternalRailSL.g:1036:1: ruleConditionalStatement returns [EObject current=null] : (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lines_1_0 = null;

        EObject lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:1042:2: ( (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ ) )
            // InternalRailSL.g:1043:2: (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ )
            {
            // InternalRailSL.g:1043:2: (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ )
            // InternalRailSL.g:1044:3: otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getBranchKeyword_0());
            		
            // InternalRailSL.g:1048:3: ( (lv_lines_1_0= ruleConditionalLine ) )
            // InternalRailSL.g:1049:4: (lv_lines_1_0= ruleConditionalLine )
            {
            // InternalRailSL.g:1049:4: (lv_lines_1_0= ruleConditionalLine )
            // InternalRailSL.g:1050:5: lv_lines_1_0= ruleConditionalLine
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_lines_1_0=ruleConditionalLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					add(
            						current,
            						"lines",
            						lv_lines_1_0,
            						"de.cau.cs.kieler.RailSL.ConditionalLine");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRailSL.g:1067:3: ( (lv_lines_2_0= ruleConditionalLine ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRailSL.g:1068:4: (lv_lines_2_0= ruleConditionalLine )
            	    {
            	    // InternalRailSL.g:1068:4: (lv_lines_2_0= ruleConditionalLine )
            	    // InternalRailSL.g:1069:5: lv_lines_2_0= ruleConditionalLine
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_lines_2_0=ruleConditionalLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_2_0,
            	    						"de.cau.cs.kieler.RailSL.ConditionalLine");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleConditionalStatement"


    // $ANTLR start "entryRuleConditionalLine"
    // InternalRailSL.g:1090:1: entryRuleConditionalLine returns [EObject current=null] : iv_ruleConditionalLine= ruleConditionalLine EOF ;
    public final EObject entryRuleConditionalLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalLine = null;


        try {
            // InternalRailSL.g:1090:56: (iv_ruleConditionalLine= ruleConditionalLine EOF )
            // InternalRailSL.g:1091:2: iv_ruleConditionalLine= ruleConditionalLine EOF
            {
             newCompositeNode(grammarAccess.getConditionalLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalLine=ruleConditionalLine();

            state._fsp--;

             current =iv_ruleConditionalLine; 
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
    // $ANTLR end "entryRuleConditionalLine"


    // $ANTLR start "ruleConditionalLine"
    // InternalRailSL.g:1097:1: ruleConditionalLine returns [EObject current=null] : (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) ) ;
    public final EObject ruleConditionalLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_segName_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_contact_1_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:1103:2: ( (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) ) )
            // InternalRailSL.g:1104:2: (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) )
            {
            // InternalRailSL.g:1104:2: (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) )
            // InternalRailSL.g:1105:3: otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= RULE_SEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalLineAccess().getIfKeyword_0());
            		
            // InternalRailSL.g:1109:3: ( (lv_contact_1_0= ruleContactIndex ) )
            // InternalRailSL.g:1110:4: (lv_contact_1_0= ruleContactIndex )
            {
            // InternalRailSL.g:1110:4: (lv_contact_1_0= ruleContactIndex )
            // InternalRailSL.g:1111:5: lv_contact_1_0= ruleContactIndex
            {

            					newCompositeNode(grammarAccess.getConditionalLineAccess().getContactContactIndexParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_contact_1_0=ruleContactIndex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLineRule());
            					}
            					set(
            						current,
            						"contact",
            						lv_contact_1_0,
            						"de.cau.cs.kieler.RailSL.ContactIndex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionalLineAccess().getContactOfKeyword_2());
            		
            // InternalRailSL.g:1132:3: ( (lv_segName_3_0= RULE_SEG_NAME ) )
            // InternalRailSL.g:1133:4: (lv_segName_3_0= RULE_SEG_NAME )
            {
            // InternalRailSL.g:1133:4: (lv_segName_3_0= RULE_SEG_NAME )
            // InternalRailSL.g:1134:5: lv_segName_3_0= RULE_SEG_NAME
            {
            lv_segName_3_0=(Token)match(input,RULE_SEG_NAME,FOLLOW_23); 

            					newLeafNode(lv_segName_3_0, grammarAccess.getConditionalLineAccess().getSegNameSEG_NAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"segName",
            						lv_segName_3_0,
            						"de.cau.cs.kieler.RailSL.SEG_NAME");
            				

            }


            }

            // InternalRailSL.g:1150:3: (otherlv_4= 'is reached first, do' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRailSL.g:1151:4: otherlv_4= 'is reached first, do'
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4());
            	    			

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

            // InternalRailSL.g:1156:3: ( (lv_block_5_0= ruleBlock ) )
            // InternalRailSL.g:1157:4: (lv_block_5_0= ruleBlock )
            {
            // InternalRailSL.g:1157:4: (lv_block_5_0= ruleBlock )
            // InternalRailSL.g:1158:5: lv_block_5_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getConditionalLineAccess().getBlockBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_5_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLineRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_5_0,
            						"de.cau.cs.kieler.RailSL.Block");
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
    // $ANTLR end "ruleConditionalLine"


    // $ANTLR start "entryRuleContactIndex"
    // InternalRailSL.g:1179:1: entryRuleContactIndex returns [String current=null] : iv_ruleContactIndex= ruleContactIndex EOF ;
    public final String entryRuleContactIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContactIndex = null;


        try {
            // InternalRailSL.g:1179:52: (iv_ruleContactIndex= ruleContactIndex EOF )
            // InternalRailSL.g:1180:2: iv_ruleContactIndex= ruleContactIndex EOF
            {
             newCompositeNode(grammarAccess.getContactIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContactIndex=ruleContactIndex();

            state._fsp--;

             current =iv_ruleContactIndex.getText(); 
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
    // $ANTLR end "entryRuleContactIndex"


    // $ANTLR start "ruleContactIndex"
    // InternalRailSL.g:1186:1: ruleContactIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'first' | kw= 'second' ) ;
    public final AntlrDatatypeRuleToken ruleContactIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:1192:2: ( (kw= 'first' | kw= 'second' ) )
            // InternalRailSL.g:1193:2: (kw= 'first' | kw= 'second' )
            {
            // InternalRailSL.g:1193:2: (kw= 'first' | kw= 'second' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            else if ( (LA25_0==43) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalRailSL.g:1194:3: kw= 'first'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContactIndexAccess().getFirstKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:1200:3: kw= 'second'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContactIndexAccess().getSecondKeyword_1());
                    		

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
    // $ANTLR end "ruleContactIndex"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000096D2008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000096D200E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000006000070000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000001000L});

}