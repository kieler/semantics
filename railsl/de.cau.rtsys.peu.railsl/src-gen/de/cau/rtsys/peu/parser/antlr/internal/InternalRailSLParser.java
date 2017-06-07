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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Start:'", "'End.'", "'Loop.'", "'Set track'", "','", "'to'", "'.'", "'full'", "'slow'", "'reverse'", "'stop'", "'Set point'", "'straight'", "'branch'", "'Wait for'", "'seconds.'", "'Reach'", "'Pass'", "'contact of'", "'Open'", "'Close'", "'crossing.'", "'Turn light'", "'on'", "'off'", "'Branch:'", "'If'", "'is reached first, do'", "'first'", "'second'", "'KH_ST_0'", "'KH_ST_1'", "'KH_ST_2'", "'KH_ST_3'", "'KH_ST_4'", "'KH_ST_5'", "'KH_ST_6'", "'KH_LN_0'", "'KH_LN_1'", "'KH_LN_2'", "'KH_LN_3'", "'KH_LN_4'", "'KH_LN_5'", "'KH_LN_6'", "'KH_LN_7'", "'KH_LN_8'", "'KIO_LN_0'", "'KIO_LN_1'", "'OC_ST_0'", "'OC_ST_1'", "'OC_ST_2'", "'OC_ST_3'", "'OC_ST_4'", "'OC_LN_0'", "'OC_LN_1'", "'OC_LN_2'", "'OC_LN_3'", "'OC_LN_4'", "'OC_LN_5'", "'IC_ST_0'", "'IC_ST_1'", "'IC_ST_2'", "'IC_ST_3'", "'IC_ST_4'", "'IC_LN_0'", "'IC_LN_1'", "'IC_LN_2'", "'IC_LN_3'", "'IC_LN_4'", "'IC_LN_5'", "'OC_JCT_0'", "'IC_JCT_0'", "'OI_LN_0'", "'OI_LN_1'", "'OI_LN_2'", "'IO_LN_0'", "'IO_LN_1'", "'IO_LN_2'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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

                if ( (LA1_0==11) ) {
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
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getStartKeyword_0());
            		
            // InternalRailSL.g:119:3: ( (lv_statements_1_0= ruleStatement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==22||LA2_0==25||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=30 && LA2_0<=31)||LA2_0==33||LA2_0==36) ) {
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
            						"de.cau.rtsys.peu.RailSL.BLOCK_END");
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

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
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
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBLOCK_ENDAccess().getEndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:182:3: kw= 'Loop.'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

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
            case 14:
            case 22:
                {
                alt4=1;
                }
                break;
            case 25:
            case 27:
            case 28:
                {
                alt4=2;
                }
                break;
            case 30:
            case 31:
            case 33:
                {
                alt4=3;
                }
                break;
            case 36:
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

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
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
    // InternalRailSL.g:288:1: ruleSetTrackStatement returns [EObject current=null] : (otherlv_0= 'Set track' ( (lv_segments_1_0= ruleSEG_NAME ) ) (otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) ) )* otherlv_4= 'to' ( (lv_mode_5_0= ruleTrackSetting ) ) otherlv_6= '.' ) ;
    public final EObject ruleSetTrackStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_segments_1_0 = null;

        AntlrDatatypeRuleToken lv_segments_3_0 = null;

        AntlrDatatypeRuleToken lv_mode_5_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:294:2: ( (otherlv_0= 'Set track' ( (lv_segments_1_0= ruleSEG_NAME ) ) (otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) ) )* otherlv_4= 'to' ( (lv_mode_5_0= ruleTrackSetting ) ) otherlv_6= '.' ) )
            // InternalRailSL.g:295:2: (otherlv_0= 'Set track' ( (lv_segments_1_0= ruleSEG_NAME ) ) (otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) ) )* otherlv_4= 'to' ( (lv_mode_5_0= ruleTrackSetting ) ) otherlv_6= '.' )
            {
            // InternalRailSL.g:295:2: (otherlv_0= 'Set track' ( (lv_segments_1_0= ruleSEG_NAME ) ) (otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) ) )* otherlv_4= 'to' ( (lv_mode_5_0= ruleTrackSetting ) ) otherlv_6= '.' )
            // InternalRailSL.g:296:3: otherlv_0= 'Set track' ( (lv_segments_1_0= ruleSEG_NAME ) ) (otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) ) )* otherlv_4= 'to' ( (lv_mode_5_0= ruleTrackSetting ) ) otherlv_6= '.'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSetTrackStatementAccess().getSetTrackKeyword_0());
            		
            // InternalRailSL.g:300:3: ( (lv_segments_1_0= ruleSEG_NAME ) )
            // InternalRailSL.g:301:4: (lv_segments_1_0= ruleSEG_NAME )
            {
            // InternalRailSL.g:301:4: (lv_segments_1_0= ruleSEG_NAME )
            // InternalRailSL.g:302:5: lv_segments_1_0= ruleSEG_NAME
            {

            					newCompositeNode(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_segments_1_0=ruleSEG_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTrackStatementRule());
            					}
            					add(
            						current,
            						"segments",
            						lv_segments_1_0,
            						"de.cau.rtsys.peu.RailSL.SEG_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRailSL.g:319:3: (otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRailSL.g:320:4: otherlv_2= ',' ( (lv_segments_3_0= ruleSEG_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSetTrackStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRailSL.g:324:4: ( (lv_segments_3_0= ruleSEG_NAME ) )
            	    // InternalRailSL.g:325:5: (lv_segments_3_0= ruleSEG_NAME )
            	    {
            	    // InternalRailSL.g:325:5: (lv_segments_3_0= ruleSEG_NAME )
            	    // InternalRailSL.g:326:6: lv_segments_3_0= ruleSEG_NAME
            	    {

            	    						newCompositeNode(grammarAccess.getSetTrackStatementAccess().getSegmentsSEG_NAMEParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_segments_3_0=ruleSEG_NAME();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSetTrackStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"segments",
            	    							lv_segments_3_0,
            	    							"de.cau.rtsys.peu.RailSL.SEG_NAME");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSetTrackStatementAccess().getToKeyword_3());
            		
            // InternalRailSL.g:348:3: ( (lv_mode_5_0= ruleTrackSetting ) )
            // InternalRailSL.g:349:4: (lv_mode_5_0= ruleTrackSetting )
            {
            // InternalRailSL.g:349:4: (lv_mode_5_0= ruleTrackSetting )
            // InternalRailSL.g:350:5: lv_mode_5_0= ruleTrackSetting
            {

            					newCompositeNode(grammarAccess.getSetTrackStatementAccess().getModeTrackSettingParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_mode_5_0=ruleTrackSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetTrackStatementRule());
            					}
            					set(
            						current,
            						"mode",
            						lv_mode_5_0,
            						"de.cau.rtsys.peu.RailSL.TrackSetting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSetTrackStatementAccess().getFullStopKeyword_5());
            		

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
    // InternalRailSL.g:375:1: entryRuleTrackSetting returns [String current=null] : iv_ruleTrackSetting= ruleTrackSetting EOF ;
    public final String entryRuleTrackSetting() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrackSetting = null;


        try {
            // InternalRailSL.g:375:52: (iv_ruleTrackSetting= ruleTrackSetting EOF )
            // InternalRailSL.g:376:2: iv_ruleTrackSetting= ruleTrackSetting EOF
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
    // InternalRailSL.g:382:1: ruleTrackSetting returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' ) ;
    public final AntlrDatatypeRuleToken ruleTrackSetting() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:388:2: ( ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' ) )
            // InternalRailSL.g:389:2: ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' )
            {
            // InternalRailSL.g:389:2: ( ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? ) | kw= 'stop' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=19)) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRailSL.g:390:3: ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? )
                    {
                    // InternalRailSL.g:390:3: ( (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )? )
                    // InternalRailSL.g:391:4: (kw= 'full' | kw= 'slow' ) (kw= 'reverse' )?
                    {
                    // InternalRailSL.g:391:4: (kw= 'full' | kw= 'slow' )
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
                            // InternalRailSL.g:392:5: kw= 'full'
                            {
                            kw=(Token)match(input,18,FOLLOW_10); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getFullKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRailSL.g:398:5: kw= 'slow'
                            {
                            kw=(Token)match(input,19,FOLLOW_10); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getSlowKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRailSL.g:404:4: (kw= 'reverse' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRailSL.g:405:5: kw= 'reverse'
                            {
                            kw=(Token)match(input,20,FOLLOW_2); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getTrackSettingAccess().getReverseKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRailSL.g:413:3: kw= 'stop'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalRailSL.g:422:1: entryRuleSetPointStatement returns [EObject current=null] : iv_ruleSetPointStatement= ruleSetPointStatement EOF ;
    public final EObject entryRuleSetPointStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetPointStatement = null;


        try {
            // InternalRailSL.g:422:58: (iv_ruleSetPointStatement= ruleSetPointStatement EOF )
            // InternalRailSL.g:423:2: iv_ruleSetPointStatement= ruleSetPointStatement EOF
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
    // InternalRailSL.g:429:1: ruleSetPointStatement returns [EObject current=null] : (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) ) )* otherlv_4= 'to' ( ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) ) ) otherlv_6= '.' ) ;
    public final EObject ruleSetPointStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_points_1_0=null;
        Token otherlv_2=null;
        Token lv_points_3_0=null;
        Token otherlv_4=null;
        Token lv_orientation_5_1=null;
        Token lv_orientation_5_2=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRailSL.g:435:2: ( (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) ) )* otherlv_4= 'to' ( ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) ) ) otherlv_6= '.' ) )
            // InternalRailSL.g:436:2: (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) ) )* otherlv_4= 'to' ( ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) ) ) otherlv_6= '.' )
            {
            // InternalRailSL.g:436:2: (otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) ) )* otherlv_4= 'to' ( ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) ) ) otherlv_6= '.' )
            // InternalRailSL.g:437:3: otherlv_0= 'Set point' ( (lv_points_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) ) )* otherlv_4= 'to' ( ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) ) ) otherlv_6= '.'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSetPointStatementAccess().getSetPointKeyword_0());
            		
            // InternalRailSL.g:441:3: ( (lv_points_1_0= RULE_INT ) )
            // InternalRailSL.g:442:4: (lv_points_1_0= RULE_INT )
            {
            // InternalRailSL.g:442:4: (lv_points_1_0= RULE_INT )
            // InternalRailSL.g:443:5: lv_points_1_0= RULE_INT
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

            // InternalRailSL.g:459:3: (otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRailSL.g:460:4: otherlv_2= ',' ( (lv_points_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSetPointStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRailSL.g:464:4: ( (lv_points_3_0= RULE_INT ) )
            	    // InternalRailSL.g:465:5: (lv_points_3_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:465:5: (lv_points_3_0= RULE_INT )
            	    // InternalRailSL.g:466:6: lv_points_3_0= RULE_INT
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getSetPointStatementAccess().getToKeyword_3());
            		
            // InternalRailSL.g:487:3: ( ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) ) )
            // InternalRailSL.g:488:4: ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) )
            {
            // InternalRailSL.g:488:4: ( (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' ) )
            // InternalRailSL.g:489:5: (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' )
            {
            // InternalRailSL.g:489:5: (lv_orientation_5_1= 'straight' | lv_orientation_5_2= 'branch' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRailSL.g:490:6: lv_orientation_5_1= 'straight'
                    {
                    lv_orientation_5_1=(Token)match(input,23,FOLLOW_9); 

                    						newLeafNode(lv_orientation_5_1, grammarAccess.getSetPointStatementAccess().getOrientationStraightKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetPointStatementRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_5_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:501:6: lv_orientation_5_2= 'branch'
                    {
                    lv_orientation_5_2=(Token)match(input,24,FOLLOW_9); 

                    						newLeafNode(lv_orientation_5_2, grammarAccess.getSetPointStatementAccess().getOrientationBranchKeyword_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetPointStatementRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_5_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSetPointStatementAccess().getFullStopKeyword_5());
            		

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
    // InternalRailSL.g:522:1: entryRuleWaitStatement returns [EObject current=null] : iv_ruleWaitStatement= ruleWaitStatement EOF ;
    public final EObject entryRuleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitStatement = null;


        try {
            // InternalRailSL.g:522:54: (iv_ruleWaitStatement= ruleWaitStatement EOF )
            // InternalRailSL.g:523:2: iv_ruleWaitStatement= ruleWaitStatement EOF
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
    // InternalRailSL.g:529:1: ruleWaitStatement returns [EObject current=null] : (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement ) ;
    public final EObject ruleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject this_TimeWaitStatement_0 = null;

        EObject this_ContactWaitStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:535:2: ( (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement ) )
            // InternalRailSL.g:536:2: (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement )
            {
            // InternalRailSL.g:536:2: (this_TimeWaitStatement_0= ruleTimeWaitStatement | this_ContactWaitStatement_1= ruleContactWaitStatement )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRailSL.g:537:3: this_TimeWaitStatement_0= ruleTimeWaitStatement
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
                    // InternalRailSL.g:546:3: this_ContactWaitStatement_1= ruleContactWaitStatement
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
    // InternalRailSL.g:558:1: entryRuleTimeWaitStatement returns [EObject current=null] : iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF ;
    public final EObject entryRuleTimeWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeWaitStatement = null;


        try {
            // InternalRailSL.g:558:58: (iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF )
            // InternalRailSL.g:559:2: iv_ruleTimeWaitStatement= ruleTimeWaitStatement EOF
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
    // InternalRailSL.g:565:1: ruleTimeWaitStatement returns [EObject current=null] : ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' ) ;
    public final EObject ruleTimeWaitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRailSL.g:571:2: ( ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' ) )
            // InternalRailSL.g:572:2: ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' )
            {
            // InternalRailSL.g:572:2: ( (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.' )
            // InternalRailSL.g:573:3: (otherlv_0= 'Wait for' )+ ( (lv_time_1_0= RULE_INT ) )+ otherlv_2= 'seconds.'
            {
            // InternalRailSL.g:573:3: (otherlv_0= 'Wait for' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRailSL.g:574:4: otherlv_0= 'Wait for'
            	    {
            	    otherlv_0=(Token)match(input,25,FOLLOW_13); 

            	    				newLeafNode(otherlv_0, grammarAccess.getTimeWaitStatementAccess().getWaitForKeyword_0());
            	    			

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

            // InternalRailSL.g:579:3: ( (lv_time_1_0= RULE_INT ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRailSL.g:580:4: (lv_time_1_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:580:4: (lv_time_1_0= RULE_INT )
            	    // InternalRailSL.g:581:5: lv_time_1_0= RULE_INT
            	    {
            	    lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_2); 

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
    // InternalRailSL.g:605:1: entryRuleContactWaitStatement returns [EObject current=null] : iv_ruleContactWaitStatement= ruleContactWaitStatement EOF ;
    public final EObject entryRuleContactWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactWaitStatement = null;


        try {
            // InternalRailSL.g:605:61: (iv_ruleContactWaitStatement= ruleContactWaitStatement EOF )
            // InternalRailSL.g:606:2: iv_ruleContactWaitStatement= ruleContactWaitStatement EOF
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
    // InternalRailSL.g:612:1: ruleContactWaitStatement returns [EObject current=null] : ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= ruleSEG_NAME ) ) otherlv_4= '.' ) ;
    public final EObject ruleContactWaitStatement() throws RecognitionException {
        EObject current = null;

        Token lv_event_0_1=null;
        Token lv_event_0_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_contactIndex_1_0 = null;

        AntlrDatatypeRuleToken lv_segName_3_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:618:2: ( ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= ruleSEG_NAME ) ) otherlv_4= '.' ) )
            // InternalRailSL.g:619:2: ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= ruleSEG_NAME ) ) otherlv_4= '.' )
            {
            // InternalRailSL.g:619:2: ( ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= ruleSEG_NAME ) ) otherlv_4= '.' )
            // InternalRailSL.g:620:3: ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) ) ( (lv_contactIndex_1_0= ruleContactIndex ) ) otherlv_2= 'contact of' ( (lv_segName_3_0= ruleSEG_NAME ) ) otherlv_4= '.'
            {
            // InternalRailSL.g:620:3: ( ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) ) )
            // InternalRailSL.g:621:4: ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) )
            {
            // InternalRailSL.g:621:4: ( (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' ) )
            // InternalRailSL.g:622:5: (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' )
            {
            // InternalRailSL.g:622:5: (lv_event_0_1= 'Reach' | lv_event_0_2= 'Pass' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRailSL.g:623:6: lv_event_0_1= 'Reach'
                    {
                    lv_event_0_1=(Token)match(input,27,FOLLOW_15); 

                    						newLeafNode(lv_event_0_1, grammarAccess.getContactWaitStatementAccess().getEventReachKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContactWaitStatementRule());
                    						}
                    						setWithLastConsumed(current, "event", lv_event_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:634:6: lv_event_0_2= 'Pass'
                    {
                    lv_event_0_2=(Token)match(input,28,FOLLOW_15); 

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

            // InternalRailSL.g:647:3: ( (lv_contactIndex_1_0= ruleContactIndex ) )
            // InternalRailSL.g:648:4: (lv_contactIndex_1_0= ruleContactIndex )
            {
            // InternalRailSL.g:648:4: (lv_contactIndex_1_0= ruleContactIndex )
            // InternalRailSL.g:649:5: lv_contactIndex_1_0= ruleContactIndex
            {

            					newCompositeNode(grammarAccess.getContactWaitStatementAccess().getContactIndexContactIndexParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_contactIndex_1_0=ruleContactIndex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactWaitStatementRule());
            					}
            					set(
            						current,
            						"contactIndex",
            						lv_contactIndex_1_0,
            						"de.cau.rtsys.peu.RailSL.ContactIndex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getContactWaitStatementAccess().getContactOfKeyword_2());
            		
            // InternalRailSL.g:670:3: ( (lv_segName_3_0= ruleSEG_NAME ) )
            // InternalRailSL.g:671:4: (lv_segName_3_0= ruleSEG_NAME )
            {
            // InternalRailSL.g:671:4: (lv_segName_3_0= ruleSEG_NAME )
            // InternalRailSL.g:672:5: lv_segName_3_0= ruleSEG_NAME
            {

            					newCompositeNode(grammarAccess.getContactWaitStatementAccess().getSegNameSEG_NAMEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_segName_3_0=ruleSEG_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContactWaitStatementRule());
            					}
            					set(
            						current,
            						"segName",
            						lv_segName_3_0,
            						"de.cau.rtsys.peu.RailSL.SEG_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRailSL.g:697:1: entryRuleOpStatement returns [EObject current=null] : iv_ruleOpStatement= ruleOpStatement EOF ;
    public final EObject entryRuleOpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpStatement = null;


        try {
            // InternalRailSL.g:697:52: (iv_ruleOpStatement= ruleOpStatement EOF )
            // InternalRailSL.g:698:2: iv_ruleOpStatement= ruleOpStatement EOF
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
    // InternalRailSL.g:704:1: ruleOpStatement returns [EObject current=null] : (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement ) ;
    public final EObject ruleOpStatement() throws RecognitionException {
        EObject current = null;

        EObject this_CrossingStatement_0 = null;

        EObject this_LightStatement_1 = null;



        	enterRule();

        try {
            // InternalRailSL.g:710:2: ( (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement ) )
            // InternalRailSL.g:711:2: (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement )
            {
            // InternalRailSL.g:711:2: (this_CrossingStatement_0= ruleCrossingStatement | this_LightStatement_1= ruleLightStatement )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=30 && LA16_0<=31)) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRailSL.g:712:3: this_CrossingStatement_0= ruleCrossingStatement
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
                    // InternalRailSL.g:721:3: this_LightStatement_1= ruleLightStatement
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
    // InternalRailSL.g:733:1: entryRuleCrossingStatement returns [EObject current=null] : iv_ruleCrossingStatement= ruleCrossingStatement EOF ;
    public final EObject entryRuleCrossingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossingStatement = null;


        try {
            // InternalRailSL.g:733:58: (iv_ruleCrossingStatement= ruleCrossingStatement EOF )
            // InternalRailSL.g:734:2: iv_ruleCrossingStatement= ruleCrossingStatement EOF
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
    // InternalRailSL.g:740:1: ruleCrossingStatement returns [EObject current=null] : ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' ) ;
    public final EObject ruleCrossingStatement() throws RecognitionException {
        EObject current = null;

        Token lv_mode_0_1=null;
        Token lv_mode_0_2=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRailSL.g:746:2: ( ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' ) )
            // InternalRailSL.g:747:2: ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' )
            {
            // InternalRailSL.g:747:2: ( ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.' )
            // InternalRailSL.g:748:3: ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) ) otherlv_1= 'crossing.'
            {
            // InternalRailSL.g:748:3: ( ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) ) )
            // InternalRailSL.g:749:4: ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) )
            {
            // InternalRailSL.g:749:4: ( (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' ) )
            // InternalRailSL.g:750:5: (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' )
            {
            // InternalRailSL.g:750:5: (lv_mode_0_1= 'Open' | lv_mode_0_2= 'Close' )
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
                    // InternalRailSL.g:751:6: lv_mode_0_1= 'Open'
                    {
                    lv_mode_0_1=(Token)match(input,30,FOLLOW_17); 

                    						newLeafNode(lv_mode_0_1, grammarAccess.getCrossingStatementAccess().getModeOpenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCrossingStatementRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:762:6: lv_mode_0_2= 'Close'
                    {
                    lv_mode_0_2=(Token)match(input,31,FOLLOW_17); 

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

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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
    // InternalRailSL.g:783:1: entryRuleLightStatement returns [EObject current=null] : iv_ruleLightStatement= ruleLightStatement EOF ;
    public final EObject entryRuleLightStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightStatement = null;


        try {
            // InternalRailSL.g:783:55: (iv_ruleLightStatement= ruleLightStatement EOF )
            // InternalRailSL.g:784:2: iv_ruleLightStatement= ruleLightStatement EOF
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
    // InternalRailSL.g:790:1: ruleLightStatement returns [EObject current=null] : (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) ) )* ( ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) ) ) otherlv_5= '.' ) ;
    public final EObject ruleLightStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lights_1_0=null;
        Token otherlv_2=null;
        Token lv_lights_3_0=null;
        Token lv_state_4_1=null;
        Token lv_state_4_2=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRailSL.g:796:2: ( (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) ) )* ( ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) ) ) otherlv_5= '.' ) )
            // InternalRailSL.g:797:2: (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) ) )* ( ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) ) ) otherlv_5= '.' )
            {
            // InternalRailSL.g:797:2: (otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) ) )* ( ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) ) ) otherlv_5= '.' )
            // InternalRailSL.g:798:3: otherlv_0= 'Turn light' ( (lv_lights_1_0= RULE_INT ) ) (otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) ) )* ( ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) ) ) otherlv_5= '.'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLightStatementAccess().getTurnLightKeyword_0());
            		
            // InternalRailSL.g:802:3: ( (lv_lights_1_0= RULE_INT ) )
            // InternalRailSL.g:803:4: (lv_lights_1_0= RULE_INT )
            {
            // InternalRailSL.g:803:4: (lv_lights_1_0= RULE_INT )
            // InternalRailSL.g:804:5: lv_lights_1_0= RULE_INT
            {
            lv_lights_1_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            // InternalRailSL.g:820:3: (otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRailSL.g:821:4: otherlv_2= ',' ( (lv_lights_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLightStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRailSL.g:825:4: ( (lv_lights_3_0= RULE_INT ) )
            	    // InternalRailSL.g:826:5: (lv_lights_3_0= RULE_INT )
            	    {
            	    // InternalRailSL.g:826:5: (lv_lights_3_0= RULE_INT )
            	    // InternalRailSL.g:827:6: lv_lights_3_0= RULE_INT
            	    {
            	    lv_lights_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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
            	    break loop18;
                }
            } while (true);

            // InternalRailSL.g:844:3: ( ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) ) )
            // InternalRailSL.g:845:4: ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) )
            {
            // InternalRailSL.g:845:4: ( (lv_state_4_1= 'on' | lv_state_4_2= 'off' ) )
            // InternalRailSL.g:846:5: (lv_state_4_1= 'on' | lv_state_4_2= 'off' )
            {
            // InternalRailSL.g:846:5: (lv_state_4_1= 'on' | lv_state_4_2= 'off' )
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
                    // InternalRailSL.g:847:6: lv_state_4_1= 'on'
                    {
                    lv_state_4_1=(Token)match(input,34,FOLLOW_9); 

                    						newLeafNode(lv_state_4_1, grammarAccess.getLightStatementAccess().getStateOnKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLightStatementRule());
                    						}
                    						setWithLastConsumed(current, "state", lv_state_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:858:6: lv_state_4_2= 'off'
                    {
                    lv_state_4_2=(Token)match(input,35,FOLLOW_9); 

                    						newLeafNode(lv_state_4_2, grammarAccess.getLightStatementAccess().getStateOffKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLightStatementRule());
                    						}
                    						setWithLastConsumed(current, "state", lv_state_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLightStatementAccess().getFullStopKeyword_4());
            		

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
    // InternalRailSL.g:879:1: entryRuleConditionalStatement returns [EObject current=null] : iv_ruleConditionalStatement= ruleConditionalStatement EOF ;
    public final EObject entryRuleConditionalStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalStatement = null;


        try {
            // InternalRailSL.g:879:61: (iv_ruleConditionalStatement= ruleConditionalStatement EOF )
            // InternalRailSL.g:880:2: iv_ruleConditionalStatement= ruleConditionalStatement EOF
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
    // InternalRailSL.g:886:1: ruleConditionalStatement returns [EObject current=null] : (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ ) ;
    public final EObject ruleConditionalStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_lines_1_0 = null;

        EObject lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:892:2: ( (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ ) )
            // InternalRailSL.g:893:2: (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ )
            {
            // InternalRailSL.g:893:2: (otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+ )
            // InternalRailSL.g:894:3: otherlv_0= 'Branch:' ( (lv_lines_1_0= ruleConditionalLine ) ) ( (lv_lines_2_0= ruleConditionalLine ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalStatementAccess().getBranchKeyword_0());
            		
            // InternalRailSL.g:898:3: ( (lv_lines_1_0= ruleConditionalLine ) )
            // InternalRailSL.g:899:4: (lv_lines_1_0= ruleConditionalLine )
            {
            // InternalRailSL.g:899:4: (lv_lines_1_0= ruleConditionalLine )
            // InternalRailSL.g:900:5: lv_lines_1_0= ruleConditionalLine
            {

            					newCompositeNode(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_lines_1_0=ruleConditionalLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            					}
            					add(
            						current,
            						"lines",
            						lv_lines_1_0,
            						"de.cau.rtsys.peu.RailSL.ConditionalLine");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRailSL.g:917:3: ( (lv_lines_2_0= ruleConditionalLine ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRailSL.g:918:4: (lv_lines_2_0= ruleConditionalLine )
            	    {
            	    // InternalRailSL.g:918:4: (lv_lines_2_0= ruleConditionalLine )
            	    // InternalRailSL.g:919:5: lv_lines_2_0= ruleConditionalLine
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalStatementAccess().getLinesConditionalLineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_lines_2_0=ruleConditionalLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_2_0,
            	    						"de.cau.rtsys.peu.RailSL.ConditionalLine");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalRailSL.g:940:1: entryRuleConditionalLine returns [EObject current=null] : iv_ruleConditionalLine= ruleConditionalLine EOF ;
    public final EObject entryRuleConditionalLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalLine = null;


        try {
            // InternalRailSL.g:940:56: (iv_ruleConditionalLine= ruleConditionalLine EOF )
            // InternalRailSL.g:941:2: iv_ruleConditionalLine= ruleConditionalLine EOF
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
    // InternalRailSL.g:947:1: ruleConditionalLine returns [EObject current=null] : (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) (otherlv_2= 'contact of' )+ ( (lv_segName_3_0= ruleSEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) ) ;
    public final EObject ruleConditionalLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_contact_1_0 = null;

        AntlrDatatypeRuleToken lv_segName_3_0 = null;

        EObject lv_block_5_0 = null;



        	enterRule();

        try {
            // InternalRailSL.g:953:2: ( (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) (otherlv_2= 'contact of' )+ ( (lv_segName_3_0= ruleSEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) ) )
            // InternalRailSL.g:954:2: (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) (otherlv_2= 'contact of' )+ ( (lv_segName_3_0= ruleSEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) )
            {
            // InternalRailSL.g:954:2: (otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) (otherlv_2= 'contact of' )+ ( (lv_segName_3_0= ruleSEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) ) )
            // InternalRailSL.g:955:3: otherlv_0= 'If' ( (lv_contact_1_0= ruleContactIndex ) ) (otherlv_2= 'contact of' )+ ( (lv_segName_3_0= ruleSEG_NAME ) ) (otherlv_4= 'is reached first, do' )+ ( (lv_block_5_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalLineAccess().getIfKeyword_0());
            		
            // InternalRailSL.g:959:3: ( (lv_contact_1_0= ruleContactIndex ) )
            // InternalRailSL.g:960:4: (lv_contact_1_0= ruleContactIndex )
            {
            // InternalRailSL.g:960:4: (lv_contact_1_0= ruleContactIndex )
            // InternalRailSL.g:961:5: lv_contact_1_0= ruleContactIndex
            {

            					newCompositeNode(grammarAccess.getConditionalLineAccess().getContactContactIndexParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_contact_1_0=ruleContactIndex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLineRule());
            					}
            					set(
            						current,
            						"contact",
            						lv_contact_1_0,
            						"de.cau.rtsys.peu.RailSL.ContactIndex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRailSL.g:978:3: (otherlv_2= 'contact of' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRailSL.g:979:4: otherlv_2= 'contact of'
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionalLineAccess().getContactOfKeyword_2());
            	    			

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

            // InternalRailSL.g:984:3: ( (lv_segName_3_0= ruleSEG_NAME ) )
            // InternalRailSL.g:985:4: (lv_segName_3_0= ruleSEG_NAME )
            {
            // InternalRailSL.g:985:4: (lv_segName_3_0= ruleSEG_NAME )
            // InternalRailSL.g:986:5: lv_segName_3_0= ruleSEG_NAME
            {

            					newCompositeNode(grammarAccess.getConditionalLineAccess().getSegNameSEG_NAMEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_segName_3_0=ruleSEG_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLineRule());
            					}
            					set(
            						current,
            						"segName",
            						lv_segName_3_0,
            						"de.cau.rtsys.peu.RailSL.SEG_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRailSL.g:1003:3: (otherlv_4= 'is reached first, do' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRailSL.g:1004:4: otherlv_4= 'is reached first, do'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getConditionalLineAccess().getIsReachedFirstDoKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalRailSL.g:1009:3: ( (lv_block_5_0= ruleBlock ) )
            // InternalRailSL.g:1010:4: (lv_block_5_0= ruleBlock )
            {
            // InternalRailSL.g:1010:4: (lv_block_5_0= ruleBlock )
            // InternalRailSL.g:1011:5: lv_block_5_0= ruleBlock
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
            						"de.cau.rtsys.peu.RailSL.Block");
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
    // InternalRailSL.g:1032:1: entryRuleContactIndex returns [String current=null] : iv_ruleContactIndex= ruleContactIndex EOF ;
    public final String entryRuleContactIndex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContactIndex = null;


        try {
            // InternalRailSL.g:1032:52: (iv_ruleContactIndex= ruleContactIndex EOF )
            // InternalRailSL.g:1033:2: iv_ruleContactIndex= ruleContactIndex EOF
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
    // InternalRailSL.g:1039:1: ruleContactIndex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'first' | kw= 'second' ) ;
    public final AntlrDatatypeRuleToken ruleContactIndex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:1045:2: ( (kw= 'first' | kw= 'second' ) )
            // InternalRailSL.g:1046:2: (kw= 'first' | kw= 'second' )
            {
            // InternalRailSL.g:1046:2: (kw= 'first' | kw= 'second' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            else if ( (LA23_0==40) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRailSL.g:1047:3: kw= 'first'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getContactIndexAccess().getFirstKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:1053:3: kw= 'second'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSEG_NAME"
    // InternalRailSL.g:1062:1: entryRuleSEG_NAME returns [String current=null] : iv_ruleSEG_NAME= ruleSEG_NAME EOF ;
    public final String entryRuleSEG_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEG_NAME = null;


        try {
            // InternalRailSL.g:1062:48: (iv_ruleSEG_NAME= ruleSEG_NAME EOF )
            // InternalRailSL.g:1063:2: iv_ruleSEG_NAME= ruleSEG_NAME EOF
            {
             newCompositeNode(grammarAccess.getSEG_NAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSEG_NAME=ruleSEG_NAME();

            state._fsp--;

             current =iv_ruleSEG_NAME.getText(); 
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
    // $ANTLR end "entryRuleSEG_NAME"


    // $ANTLR start "ruleSEG_NAME"
    // InternalRailSL.g:1069:1: ruleSEG_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'KH_ST_0' | kw= 'KH_ST_1' | kw= 'KH_ST_2' | kw= 'KH_ST_3' | kw= 'KH_ST_4' | kw= 'KH_ST_5' | kw= 'KH_ST_6' | kw= 'KH_LN_0' | kw= 'KH_LN_1' | kw= 'KH_LN_2' | kw= 'KH_LN_3' | kw= 'KH_LN_4' | kw= 'KH_LN_5' | kw= 'KH_LN_6' | kw= 'KH_LN_7' | kw= 'KH_LN_8' | kw= 'KIO_LN_0' | kw= 'KIO_LN_1' | kw= 'OC_ST_0' | kw= 'OC_ST_1' | kw= 'OC_ST_2' | kw= 'OC_ST_3' | kw= 'OC_ST_4' | kw= 'OC_LN_0' | kw= 'OC_LN_1' | kw= 'OC_LN_2' | kw= 'OC_LN_3' | kw= 'OC_LN_4' | kw= 'OC_LN_5' | kw= 'IC_ST_0' | kw= 'IC_ST_1' | kw= 'IC_ST_2' | kw= 'IC_ST_3' | kw= 'IC_ST_4' | kw= 'IC_LN_0' | kw= 'IC_LN_1' | kw= 'IC_LN_2' | kw= 'IC_LN_3' | kw= 'IC_LN_4' | kw= 'IC_LN_5' | kw= 'OC_JCT_0' | kw= 'IC_JCT_0' | kw= 'OI_LN_0' | kw= 'OI_LN_1' | kw= 'OI_LN_2' | kw= 'IO_LN_0' | kw= 'IO_LN_1' | kw= 'IO_LN_2' ) ;
    public final AntlrDatatypeRuleToken ruleSEG_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRailSL.g:1075:2: ( (kw= 'KH_ST_0' | kw= 'KH_ST_1' | kw= 'KH_ST_2' | kw= 'KH_ST_3' | kw= 'KH_ST_4' | kw= 'KH_ST_5' | kw= 'KH_ST_6' | kw= 'KH_LN_0' | kw= 'KH_LN_1' | kw= 'KH_LN_2' | kw= 'KH_LN_3' | kw= 'KH_LN_4' | kw= 'KH_LN_5' | kw= 'KH_LN_6' | kw= 'KH_LN_7' | kw= 'KH_LN_8' | kw= 'KIO_LN_0' | kw= 'KIO_LN_1' | kw= 'OC_ST_0' | kw= 'OC_ST_1' | kw= 'OC_ST_2' | kw= 'OC_ST_3' | kw= 'OC_ST_4' | kw= 'OC_LN_0' | kw= 'OC_LN_1' | kw= 'OC_LN_2' | kw= 'OC_LN_3' | kw= 'OC_LN_4' | kw= 'OC_LN_5' | kw= 'IC_ST_0' | kw= 'IC_ST_1' | kw= 'IC_ST_2' | kw= 'IC_ST_3' | kw= 'IC_ST_4' | kw= 'IC_LN_0' | kw= 'IC_LN_1' | kw= 'IC_LN_2' | kw= 'IC_LN_3' | kw= 'IC_LN_4' | kw= 'IC_LN_5' | kw= 'OC_JCT_0' | kw= 'IC_JCT_0' | kw= 'OI_LN_0' | kw= 'OI_LN_1' | kw= 'OI_LN_2' | kw= 'IO_LN_0' | kw= 'IO_LN_1' | kw= 'IO_LN_2' ) )
            // InternalRailSL.g:1076:2: (kw= 'KH_ST_0' | kw= 'KH_ST_1' | kw= 'KH_ST_2' | kw= 'KH_ST_3' | kw= 'KH_ST_4' | kw= 'KH_ST_5' | kw= 'KH_ST_6' | kw= 'KH_LN_0' | kw= 'KH_LN_1' | kw= 'KH_LN_2' | kw= 'KH_LN_3' | kw= 'KH_LN_4' | kw= 'KH_LN_5' | kw= 'KH_LN_6' | kw= 'KH_LN_7' | kw= 'KH_LN_8' | kw= 'KIO_LN_0' | kw= 'KIO_LN_1' | kw= 'OC_ST_0' | kw= 'OC_ST_1' | kw= 'OC_ST_2' | kw= 'OC_ST_3' | kw= 'OC_ST_4' | kw= 'OC_LN_0' | kw= 'OC_LN_1' | kw= 'OC_LN_2' | kw= 'OC_LN_3' | kw= 'OC_LN_4' | kw= 'OC_LN_5' | kw= 'IC_ST_0' | kw= 'IC_ST_1' | kw= 'IC_ST_2' | kw= 'IC_ST_3' | kw= 'IC_ST_4' | kw= 'IC_LN_0' | kw= 'IC_LN_1' | kw= 'IC_LN_2' | kw= 'IC_LN_3' | kw= 'IC_LN_4' | kw= 'IC_LN_5' | kw= 'OC_JCT_0' | kw= 'IC_JCT_0' | kw= 'OI_LN_0' | kw= 'OI_LN_1' | kw= 'OI_LN_2' | kw= 'IO_LN_0' | kw= 'IO_LN_1' | kw= 'IO_LN_2' )
            {
            // InternalRailSL.g:1076:2: (kw= 'KH_ST_0' | kw= 'KH_ST_1' | kw= 'KH_ST_2' | kw= 'KH_ST_3' | kw= 'KH_ST_4' | kw= 'KH_ST_5' | kw= 'KH_ST_6' | kw= 'KH_LN_0' | kw= 'KH_LN_1' | kw= 'KH_LN_2' | kw= 'KH_LN_3' | kw= 'KH_LN_4' | kw= 'KH_LN_5' | kw= 'KH_LN_6' | kw= 'KH_LN_7' | kw= 'KH_LN_8' | kw= 'KIO_LN_0' | kw= 'KIO_LN_1' | kw= 'OC_ST_0' | kw= 'OC_ST_1' | kw= 'OC_ST_2' | kw= 'OC_ST_3' | kw= 'OC_ST_4' | kw= 'OC_LN_0' | kw= 'OC_LN_1' | kw= 'OC_LN_2' | kw= 'OC_LN_3' | kw= 'OC_LN_4' | kw= 'OC_LN_5' | kw= 'IC_ST_0' | kw= 'IC_ST_1' | kw= 'IC_ST_2' | kw= 'IC_ST_3' | kw= 'IC_ST_4' | kw= 'IC_LN_0' | kw= 'IC_LN_1' | kw= 'IC_LN_2' | kw= 'IC_LN_3' | kw= 'IC_LN_4' | kw= 'IC_LN_5' | kw= 'OC_JCT_0' | kw= 'IC_JCT_0' | kw= 'OI_LN_0' | kw= 'OI_LN_1' | kw= 'OI_LN_2' | kw= 'IO_LN_0' | kw= 'IO_LN_1' | kw= 'IO_LN_2' )
            int alt24=48;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt24=1;
                }
                break;
            case 42:
                {
                alt24=2;
                }
                break;
            case 43:
                {
                alt24=3;
                }
                break;
            case 44:
                {
                alt24=4;
                }
                break;
            case 45:
                {
                alt24=5;
                }
                break;
            case 46:
                {
                alt24=6;
                }
                break;
            case 47:
                {
                alt24=7;
                }
                break;
            case 48:
                {
                alt24=8;
                }
                break;
            case 49:
                {
                alt24=9;
                }
                break;
            case 50:
                {
                alt24=10;
                }
                break;
            case 51:
                {
                alt24=11;
                }
                break;
            case 52:
                {
                alt24=12;
                }
                break;
            case 53:
                {
                alt24=13;
                }
                break;
            case 54:
                {
                alt24=14;
                }
                break;
            case 55:
                {
                alt24=15;
                }
                break;
            case 56:
                {
                alt24=16;
                }
                break;
            case 57:
                {
                alt24=17;
                }
                break;
            case 58:
                {
                alt24=18;
                }
                break;
            case 59:
                {
                alt24=19;
                }
                break;
            case 60:
                {
                alt24=20;
                }
                break;
            case 61:
                {
                alt24=21;
                }
                break;
            case 62:
                {
                alt24=22;
                }
                break;
            case 63:
                {
                alt24=23;
                }
                break;
            case 64:
                {
                alt24=24;
                }
                break;
            case 65:
                {
                alt24=25;
                }
                break;
            case 66:
                {
                alt24=26;
                }
                break;
            case 67:
                {
                alt24=27;
                }
                break;
            case 68:
                {
                alt24=28;
                }
                break;
            case 69:
                {
                alt24=29;
                }
                break;
            case 70:
                {
                alt24=30;
                }
                break;
            case 71:
                {
                alt24=31;
                }
                break;
            case 72:
                {
                alt24=32;
                }
                break;
            case 73:
                {
                alt24=33;
                }
                break;
            case 74:
                {
                alt24=34;
                }
                break;
            case 75:
                {
                alt24=35;
                }
                break;
            case 76:
                {
                alt24=36;
                }
                break;
            case 77:
                {
                alt24=37;
                }
                break;
            case 78:
                {
                alt24=38;
                }
                break;
            case 79:
                {
                alt24=39;
                }
                break;
            case 80:
                {
                alt24=40;
                }
                break;
            case 81:
                {
                alt24=41;
                }
                break;
            case 82:
                {
                alt24=42;
                }
                break;
            case 83:
                {
                alt24=43;
                }
                break;
            case 84:
                {
                alt24=44;
                }
                break;
            case 85:
                {
                alt24=45;
                }
                break;
            case 86:
                {
                alt24=46;
                }
                break;
            case 87:
                {
                alt24=47;
                }
                break;
            case 88:
                {
                alt24=48;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRailSL.g:1077:3: kw= 'KH_ST_0'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_0Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRailSL.g:1083:3: kw= 'KH_ST_1'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_1Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRailSL.g:1089:3: kw= 'KH_ST_2'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_2Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRailSL.g:1095:3: kw= 'KH_ST_3'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_3Keyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRailSL.g:1101:3: kw= 'KH_ST_4'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_4Keyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRailSL.g:1107:3: kw= 'KH_ST_5'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_5Keyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRailSL.g:1113:3: kw= 'KH_ST_6'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_ST_6Keyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRailSL.g:1119:3: kw= 'KH_LN_0'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_0Keyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRailSL.g:1125:3: kw= 'KH_LN_1'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_1Keyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRailSL.g:1131:3: kw= 'KH_LN_2'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_2Keyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRailSL.g:1137:3: kw= 'KH_LN_3'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_3Keyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalRailSL.g:1143:3: kw= 'KH_LN_4'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_4Keyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalRailSL.g:1149:3: kw= 'KH_LN_5'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_5Keyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalRailSL.g:1155:3: kw= 'KH_LN_6'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_6Keyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalRailSL.g:1161:3: kw= 'KH_LN_7'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_7Keyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalRailSL.g:1167:3: kw= 'KH_LN_8'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKH_LN_8Keyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalRailSL.g:1173:3: kw= 'KIO_LN_0'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKIO_LN_0Keyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalRailSL.g:1179:3: kw= 'KIO_LN_1'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getKIO_LN_1Keyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalRailSL.g:1185:3: kw= 'OC_ST_0'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_ST_0Keyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalRailSL.g:1191:3: kw= 'OC_ST_1'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_ST_1Keyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalRailSL.g:1197:3: kw= 'OC_ST_2'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_ST_2Keyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalRailSL.g:1203:3: kw= 'OC_ST_3'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_ST_3Keyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalRailSL.g:1209:3: kw= 'OC_ST_4'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_ST_4Keyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalRailSL.g:1215:3: kw= 'OC_LN_0'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_LN_0Keyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalRailSL.g:1221:3: kw= 'OC_LN_1'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_LN_1Keyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalRailSL.g:1227:3: kw= 'OC_LN_2'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_LN_2Keyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalRailSL.g:1233:3: kw= 'OC_LN_3'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_LN_3Keyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalRailSL.g:1239:3: kw= 'OC_LN_4'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_LN_4Keyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalRailSL.g:1245:3: kw= 'OC_LN_5'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_LN_5Keyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalRailSL.g:1251:3: kw= 'IC_ST_0'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_ST_0Keyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalRailSL.g:1257:3: kw= 'IC_ST_1'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_ST_1Keyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalRailSL.g:1263:3: kw= 'IC_ST_2'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_ST_2Keyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalRailSL.g:1269:3: kw= 'IC_ST_3'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_ST_3Keyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalRailSL.g:1275:3: kw= 'IC_ST_4'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_ST_4Keyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalRailSL.g:1281:3: kw= 'IC_LN_0'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_LN_0Keyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalRailSL.g:1287:3: kw= 'IC_LN_1'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_LN_1Keyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalRailSL.g:1293:3: kw= 'IC_LN_2'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_LN_2Keyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalRailSL.g:1299:3: kw= 'IC_LN_3'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_LN_3Keyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalRailSL.g:1305:3: kw= 'IC_LN_4'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_LN_4Keyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalRailSL.g:1311:3: kw= 'IC_LN_5'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_LN_5Keyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalRailSL.g:1317:3: kw= 'OC_JCT_0'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOC_JCT_0Keyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalRailSL.g:1323:3: kw= 'IC_JCT_0'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIC_JCT_0Keyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalRailSL.g:1329:3: kw= 'OI_LN_0'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOI_LN_0Keyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalRailSL.g:1335:3: kw= 'OI_LN_1'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOI_LN_1Keyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalRailSL.g:1341:3: kw= 'OI_LN_2'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getOI_LN_2Keyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalRailSL.g:1347:3: kw= 'IO_LN_0'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIO_LN_0Keyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalRailSL.g:1353:3: kw= 'IO_LN_1'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIO_LN_1Keyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalRailSL.g:1359:3: kw= 'IO_LN_2'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSEG_NAMEAccess().getIO_LN_2Keyword_47());
                    		

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
    // $ANTLR end "ruleSEG_NAME"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000012DA404000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000012DA407000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xFFFFFE0000000000L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000002C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFFFFE0020000000L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000800L});

}