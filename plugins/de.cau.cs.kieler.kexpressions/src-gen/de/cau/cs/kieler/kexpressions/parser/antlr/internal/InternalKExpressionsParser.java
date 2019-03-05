package de.cau.cs.kieler.kexpressions.parser.antlr.internal;

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
import de.cau.cs.kieler.kexpressions.services.KExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'('", "')'", "','", "'\\''", "'['", "']'", "'.'", "'()'", "'random'", "'randomize'", "'extern'", "'!'", "'{'", "'}'", "'_'", "'null'", "'#'", "'@'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'val'", "'?'", "'->'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=5;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_SL_COMMENT_ANNOTATION=12;
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
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NUMBER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalKExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKExpressions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private KExpressionsGrammarAccess grammarAccess;

        public InternalKExpressionsParser(TokenStream input, KExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected KExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalKExpressions.g:71:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalKExpressions.g:71:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalKExpressions.g:72:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalKExpressions.g:78:1: ruleRoot returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:84:2: (this_Expression_0= ruleExpression )
            // InternalKExpressions.g:85:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRootAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleExpression"
    // InternalKExpressions.g:99:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalKExpressions.g:99:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalKExpressions.g:100:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalKExpressions.g:106:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:112:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // InternalKExpressions.g:113:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // InternalKExpressions.g:113:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalKExpressions.g:114:3: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:126:3: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalKExpressions.g:141:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalKExpressions.g:141:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalKExpressions.g:142:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalKExpressions.g:148:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:154:2: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // InternalKExpressions.g:155:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_LogicalOrExpression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalKExpressions.g:169:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalKExpressions.g:169:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalKExpressions.g:170:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalKExpressions.g:176:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:182:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? ) )
            // InternalKExpressions.g:183:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            {
            // InternalKExpressions.g:183:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )? )
            // InternalKExpressions.g:184:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:195:3: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKExpressions.g:196:4: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) ) (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    {
                    // InternalKExpressions.g:196:4: ()
                    // InternalKExpressions.g:197:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getLogicalOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:206:4: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )
                    // InternalKExpressions.g:207:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    {
                    // InternalKExpressions.g:207:5: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    // InternalKExpressions.g:208:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    {
                    // InternalKExpressions.g:208:6: (lv_operator_2_0= ruleLogicalOrOperator )
                    // InternalKExpressions.g:209:7: lv_operator_2_0= ruleLogicalOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_2_0=ruleLogicalOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.LogicalOrOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:226:5: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    // InternalKExpressions.g:227:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    {
                    // InternalKExpressions.g:227:6: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    // InternalKExpressions.g:228:7: lv_subExpressions_3_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_subExpressions_3_0=ruleLogicalAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:246:4: (otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKExpressions.g:247:5: otherlv_4= '||' ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:251:5: ( (lv_subExpressions_5_0= ruleLogicalAndExpression ) )
                    	    // InternalKExpressions.g:252:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    {
                    	    // InternalKExpressions.g:252:6: (lv_subExpressions_5_0= ruleLogicalAndExpression )
                    	    // InternalKExpressions.g:253:7: lv_subExpressions_5_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_3);
                    	    lv_subExpressions_5_0=ruleLogicalAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalKExpressions.g:276:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalKExpressions.g:276:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalKExpressions.g:277:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalKExpressions.g:283:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:289:2: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? ) )
            // InternalKExpressions.g:290:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            {
            // InternalKExpressions.g:290:2: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )? )
            // InternalKExpressions.g:291:3: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:302:3: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKExpressions.g:303:4: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) ) (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    {
                    // InternalKExpressions.g:303:4: ()
                    // InternalKExpressions.g:304:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getLogicalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:313:4: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )
                    // InternalKExpressions.g:314:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    {
                    // InternalKExpressions.g:314:5: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    // InternalKExpressions.g:315:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    {
                    // InternalKExpressions.g:315:6: (lv_operator_2_0= ruleLogicalAndOperator )
                    // InternalKExpressions.g:316:7: lv_operator_2_0= ruleLogicalAndOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_2_0=ruleLogicalAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.LogicalAndOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:333:5: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    // InternalKExpressions.g:334:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    {
                    // InternalKExpressions.g:334:6: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    // InternalKExpressions.g:335:7: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_subExpressions_3_0=ruleBitwiseOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:353:4: (otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalKExpressions.g:354:5: otherlv_4= '&&' ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:358:5: ( (lv_subExpressions_5_0= ruleBitwiseOrExpression ) )
                    	    // InternalKExpressions.g:359:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    {
                    	    // InternalKExpressions.g:359:6: (lv_subExpressions_5_0= ruleBitwiseOrExpression )
                    	    // InternalKExpressions.g:360:7: lv_subExpressions_5_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_5);
                    	    lv_subExpressions_5_0=ruleBitwiseOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


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

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleBitwiseOrExpression"
    // InternalKExpressions.g:383:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // InternalKExpressions.g:383:60: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // InternalKExpressions.g:384:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseOrExpression"


    // $ANTLR start "ruleBitwiseOrExpression"
    // InternalKExpressions.g:390:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseXOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:396:2: ( (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? ) )
            // InternalKExpressions.g:397:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            {
            // InternalKExpressions.g:397:2: (this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )? )
            // InternalKExpressions.g:398:3: this_BitwiseXOrExpression_0= ruleBitwiseXOrExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseXOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_BitwiseXOrExpression_0=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseXOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:409:3: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKExpressions.g:410:4: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) ) (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    {
                    // InternalKExpressions.g:410:4: ()
                    // InternalKExpressions.g:411:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getBitwiseOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:420:4: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) ) )
                    // InternalKExpressions.g:421:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    {
                    // InternalKExpressions.g:421:5: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    // InternalKExpressions.g:422:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    {
                    // InternalKExpressions.g:422:6: (lv_operator_2_0= ruleBitwiseOrOperator )
                    // InternalKExpressions.g:423:7: lv_operator_2_0= ruleBitwiseOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_2_0=ruleBitwiseOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseOrOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:440:5: ( (lv_subExpressions_3_0= ruleBitwiseXOrExpression ) )
                    // InternalKExpressions.g:441:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    {
                    // InternalKExpressions.g:441:6: (lv_subExpressions_3_0= ruleBitwiseXOrExpression )
                    // InternalKExpressions.g:442:7: lv_subExpressions_3_0= ruleBitwiseXOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_subExpressions_3_0=ruleBitwiseXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:460:4: (otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalKExpressions.g:461:5: otherlv_4= '|' ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseOrExpressionAccess().getVerticalLineKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:465:5: ( (lv_subExpressions_5_0= ruleBitwiseXOrExpression ) )
                    	    // InternalKExpressions.g:466:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    {
                    	    // InternalKExpressions.g:466:6: (lv_subExpressions_5_0= ruleBitwiseXOrExpression )
                    	    // InternalKExpressions.g:467:7: lv_subExpressions_5_0= ruleBitwiseXOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseXOrExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_subExpressions_5_0=ruleBitwiseXOrExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBitwiseOrExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseOrExpression"


    // $ANTLR start "entryRuleBitwiseXOrExpression"
    // InternalKExpressions.g:490:1: entryRuleBitwiseXOrExpression returns [EObject current=null] : iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF ;
    public final EObject entryRuleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseXOrExpression = null;


        try {
            // InternalKExpressions.g:490:61: (iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF )
            // InternalKExpressions.g:491:2: iv_ruleBitwiseXOrExpression= ruleBitwiseXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseXOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseXOrExpression=ruleBitwiseXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseXOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseXOrExpression"


    // $ANTLR start "ruleBitwiseXOrExpression"
    // InternalKExpressions.g:497:1: ruleBitwiseXOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) ;
    public final EObject ruleBitwiseXOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:503:2: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? ) )
            // InternalKExpressions.g:504:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            {
            // InternalKExpressions.g:504:2: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )? )
            // InternalKExpressions.g:505:3: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_7);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BitwiseAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:516:3: ( () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKExpressions.g:517:4: () ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) ) (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    {
                    // InternalKExpressions.g:517:4: ()
                    // InternalKExpressions.g:518:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getBitwiseXOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:527:4: ( ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )
                    // InternalKExpressions.g:528:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    {
                    // InternalKExpressions.g:528:5: ( (lv_operator_2_0= ruleBitwiseXOrOperator ) )
                    // InternalKExpressions.g:529:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    {
                    // InternalKExpressions.g:529:6: (lv_operator_2_0= ruleBitwiseXOrOperator )
                    // InternalKExpressions.g:530:7: lv_operator_2_0= ruleBitwiseXOrOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getOperatorBitwiseXOrOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_2_0=ruleBitwiseXOrOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseXOrOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:547:5: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    // InternalKExpressions.g:548:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    {
                    // InternalKExpressions.g:548:6: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    // InternalKExpressions.g:549:7: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_subExpressions_3_0=ruleBitwiseAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:567:4: (otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalKExpressions.g:568:5: otherlv_4= '^' ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseXOrExpressionAccess().getCircumflexAccentKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:572:5: ( (lv_subExpressions_5_0= ruleBitwiseAndExpression ) )
                    	    // InternalKExpressions.g:573:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    {
                    	    // InternalKExpressions.g:573:6: (lv_subExpressions_5_0= ruleBitwiseAndExpression )
                    	    // InternalKExpressions.g:574:7: lv_subExpressions_5_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseXOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_subExpressions_5_0=ruleBitwiseAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBitwiseXOrExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseXOrExpression"


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // InternalKExpressions.g:597:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // InternalKExpressions.g:597:61: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // InternalKExpressions.g:598:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseAndExpression"


    // $ANTLR start "ruleBitwiseAndExpression"
    // InternalKExpressions.g:604:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:610:2: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? ) )
            // InternalKExpressions.g:611:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            {
            // InternalKExpressions.g:611:2: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )? )
            // InternalKExpressions.g:612:3: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_8);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareOperation_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:623:3: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKExpressions.g:624:4: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) ) (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    {
                    // InternalKExpressions.g:624:4: ()
                    // InternalKExpressions.g:625:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getBitwiseAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:634:4: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )
                    // InternalKExpressions.g:635:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    {
                    // InternalKExpressions.g:635:5: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    // InternalKExpressions.g:636:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    {
                    // InternalKExpressions.g:636:6: (lv_operator_2_0= ruleBitwiseAndOperator )
                    // InternalKExpressions.g:637:7: lv_operator_2_0= ruleBitwiseAndOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_2_0=ruleBitwiseAndOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseAndOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:654:5: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    // InternalKExpressions.g:655:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    {
                    // InternalKExpressions.g:655:6: (lv_subExpressions_3_0= ruleCompareOperation )
                    // InternalKExpressions.g:656:7: lv_subExpressions_3_0= ruleCompareOperation
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_subExpressions_3_0=ruleCompareOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:674:4: (otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalKExpressions.g:675:5: otherlv_4= '&' ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getBitwiseAndExpressionAccess().getAmpersandKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:679:5: ( (lv_subExpressions_5_0= ruleCompareOperation ) )
                    	    // InternalKExpressions.g:680:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    {
                    	    // InternalKExpressions.g:680:6: (lv_subExpressions_5_0= ruleCompareOperation )
                    	    // InternalKExpressions.g:681:7: lv_subExpressions_5_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_subExpressions_5_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBitwiseAndExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperation");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // InternalKExpressions.g:704:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // InternalKExpressions.g:704:57: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // InternalKExpressions.g:705:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareOperation"


    // $ANTLR start "ruleCompareOperation"
    // InternalKExpressions.g:711:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:717:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // InternalKExpressions.g:718:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // InternalKExpressions.g:718:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // InternalKExpressions.g:719:3: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NotOrValuedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:730:3: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=49 && LA12_0<=54)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalKExpressions.g:731:4: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // InternalKExpressions.g:731:4: ()
                    // InternalKExpressions.g:732:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:741:4: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // InternalKExpressions.g:742:5: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // InternalKExpressions.g:742:5: (lv_operator_2_0= ruleCompareOperator )
                    // InternalKExpressions.g:743:6: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.CompareOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:760:4: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // InternalKExpressions.g:761:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // InternalKExpressions.g:761:5: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // InternalKExpressions.g:762:6: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCompareOperationRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_3_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.NotOrValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // InternalKExpressions.g:784:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // InternalKExpressions.g:784:62: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // InternalKExpressions.g:785:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotOrValuedExpression"


    // $ANTLR start "ruleNotOrValuedExpression"
    // InternalKExpressions.g:791:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:797:2: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // InternalKExpressions.g:798:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // InternalKExpressions.g:798:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalKExpressions.g:799:3: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_0=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:811:3: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NotExpression_1=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNotOrValuedExpression"


    // $ANTLR start "entryRuleBitwiseNotExpression"
    // InternalKExpressions.g:826:1: entryRuleBitwiseNotExpression returns [EObject current=null] : iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF ;
    public final EObject entryRuleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseNotExpression = null;


        try {
            // InternalKExpressions.g:826:61: (iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF )
            // InternalKExpressions.g:827:2: iv_ruleBitwiseNotExpression= ruleBitwiseNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBitwiseNotExpression=ruleBitwiseNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBitwiseNotExpression"


    // $ANTLR start "ruleBitwiseNotExpression"
    // InternalKExpressions.g:833:1: ruleBitwiseNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleBitwiseNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:839:2: ( ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // InternalKExpressions.g:840:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // InternalKExpressions.g:840:2: ( ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==56) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_HOSTCODE)||LA14_0==RULE_BOOLEAN||LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==31||(LA14_0>=39 && LA14_0<=41)||LA14_0==48||LA14_0==55||LA14_0==57) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalKExpressions.g:841:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    {
                    // InternalKExpressions.g:841:3: ( () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) ) )
                    // InternalKExpressions.g:842:4: () ( (lv_operator_1_0= ruleBitwiseNotOperator ) ) ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    {
                    // InternalKExpressions.g:842:4: ()
                    // InternalKExpressions.g:843:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getBitwiseNotExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:852:4: ( (lv_operator_1_0= ruleBitwiseNotOperator ) )
                    // InternalKExpressions.g:853:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    {
                    // InternalKExpressions.g:853:5: (lv_operator_1_0= ruleBitwiseNotOperator )
                    // InternalKExpressions.g:854:6: lv_operator_1_0= ruleBitwiseNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getOperatorBitwiseNotOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_1_0=ruleBitwiseNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:871:4: ( (lv_subExpressions_2_0= ruleBitwiseNotExpression ) )
                    // InternalKExpressions.g:872:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    {
                    // InternalKExpressions.g:872:5: (lv_subExpressions_2_0= ruleBitwiseNotExpression )
                    // InternalKExpressions.g:873:6: lv_subExpressions_2_0= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getSubExpressionsBitwiseNotExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBitwiseNotExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.BitwiseNotExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:892:3: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBitwiseNotExpressionAccess().getAtomicExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_3=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseNotExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalKExpressions.g:907:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalKExpressions.g:907:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalKExpressions.g:908:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalKExpressions.g:914:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_BitwiseNotExpression_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:920:2: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression ) )
            // InternalKExpressions.g:921:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            {
            // InternalKExpressions.g:921:2: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_BitwiseNotExpression_3= ruleBitwiseNotExpression )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_HOSTCODE)||LA15_0==RULE_BOOLEAN||LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==31||(LA15_0>=39 && LA15_0<=41)||LA15_0==48||(LA15_0>=55 && LA15_0<=57)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalKExpressions.g:922:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // InternalKExpressions.g:922:3: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // InternalKExpressions.g:923:4: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // InternalKExpressions.g:923:4: ()
                    // InternalKExpressions.g:924:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:933:4: ( (lv_operator_1_0= ruleNotOperator ) )
                    // InternalKExpressions.g:934:5: (lv_operator_1_0= ruleNotOperator )
                    {
                    // InternalKExpressions.g:934:5: (lv_operator_1_0= ruleNotOperator )
                    // InternalKExpressions.g:935:6: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_operator_1_0=ruleNotOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.NotOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:952:4: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // InternalKExpressions.g:953:5: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // InternalKExpressions.g:953:5: (lv_subExpressions_2_0= ruleNotExpression )
                    // InternalKExpressions.g:954:6: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.NotExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:973:3: this_BitwiseNotExpression_3= ruleBitwiseNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNotExpressionAccess().getBitwiseNotExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BitwiseNotExpression_3=ruleBitwiseNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BitwiseNotExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // InternalKExpressions.g:988:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // InternalKExpressions.g:988:57: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // InternalKExpressions.g:989:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedExpression"


    // $ANTLR start "ruleValuedExpression"
    // InternalKExpressions.g:995:1: ruleValuedExpression returns [EObject current=null] : this_ShiftExpressions_0= ruleShiftExpressions ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpressions_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1001:2: (this_ShiftExpressions_0= ruleShiftExpressions )
            // InternalKExpressions.g:1002:2: this_ShiftExpressions_0= ruleShiftExpressions
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getValuedExpressionAccess().getShiftExpressionsParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_ShiftExpressions_0=ruleShiftExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ShiftExpressions_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValuedExpression"


    // $ANTLR start "entryRuleShiftExpressions"
    // InternalKExpressions.g:1016:1: entryRuleShiftExpressions returns [EObject current=null] : iv_ruleShiftExpressions= ruleShiftExpressions EOF ;
    public final EObject entryRuleShiftExpressions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpressions = null;


        try {
            // InternalKExpressions.g:1016:57: (iv_ruleShiftExpressions= ruleShiftExpressions EOF )
            // InternalKExpressions.g:1017:2: iv_ruleShiftExpressions= ruleShiftExpressions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftExpressions=ruleShiftExpressions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpressions; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftExpressions"


    // $ANTLR start "ruleShiftExpressions"
    // InternalKExpressions.g:1023:1: ruleShiftExpressions returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* ) )? ) ;
    public final EObject ruleShiftExpressions() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;

        Enumerator lv_operator_12_0 = null;

        EObject lv_subExpressions_13_0 = null;

        EObject lv_subExpressions_15_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1029:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:1030:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:1030:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* ) )? )
            // InternalKExpressions.g:1031:3: this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1042:3: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* ) )?
            int alt19=4;
            switch ( input.LA(1) ) {
                case 22:
                    {
                    alt19=1;
                    }
                    break;
                case 23:
                    {
                    alt19=2;
                    }
                    break;
                case 24:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalKExpressions.g:1043:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1043:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
                    // InternalKExpressions.g:1044:5: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1044:5: ()
                    // InternalKExpressions.g:1045:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftExpressionsAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1054:5: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1055:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1055:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKExpressions.g:1056:7: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKExpressions.g:1056:7: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKExpressions.g:1057:8: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleShiftLeftOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1074:6: ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
                    // InternalKExpressions.g:1075:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1075:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
                    // InternalKExpressions.g:1076:8: lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_subExpressions_3_0=ruleShiftRightRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightRightUnsignedExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1094:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==22) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalKExpressions.g:1095:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getShiftExpressionsAccess().getLessThanSignLessThanSignKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1099:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1100:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1100:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
                    	    // InternalKExpressions.g:1101:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightRightUnsignedExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1121:4: ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1121:4: ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
                    // InternalKExpressions.g:1122:5: () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1122:5: ()
                    // InternalKExpressions.g:1123:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftExpressionsAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1132:5: ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1133:6: ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1133:6: ( (lv_operator_7_0= ruleShiftRightOperator ) )
                    // InternalKExpressions.g:1134:7: (lv_operator_7_0= ruleShiftRightOperator )
                    {
                    // InternalKExpressions.g:1134:7: (lv_operator_7_0= ruleShiftRightOperator )
                    // InternalKExpressions.g:1135:8: lv_operator_7_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1152:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) )
                    // InternalKExpressions.g:1153:7: (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1153:7: (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression )
                    // InternalKExpressions.g:1154:8: lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_subExpressions_8_0=ruleShiftLeftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightUnsignedExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1172:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==23) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalKExpressions.g:1173:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1177:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1178:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1178:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
                    	    // InternalKExpressions.g:1179:8: lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
                    	    lv_subExpressions_10_0=ruleShiftLeftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightUnsignedExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:1199:4: ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1199:4: ( () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )* )
                    // InternalKExpressions.g:1200:5: () ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )*
                    {
                    // InternalKExpressions.g:1200:5: ()
                    // InternalKExpressions.g:1201:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftExpressionsAccess().getOperatorExpressionSubExpressionsAction_1_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1210:5: ( ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) ) )
                    // InternalKExpressions.g:1211:6: ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) )
                    {
                    // InternalKExpressions.g:1211:6: ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKExpressions.g:1212:7: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKExpressions.g:1212:7: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
                    // InternalKExpressions.g:1213:8: lv_operator_12_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_2_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_12_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_12_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1230:6: ( (lv_subExpressions_13_0= ruleShiftLeftRightExpression ) )
                    // InternalKExpressions.g:1231:7: (lv_subExpressions_13_0= ruleShiftLeftRightExpression )
                    {
                    // InternalKExpressions.g:1231:7: (lv_subExpressions_13_0= ruleShiftLeftRightExpression )
                    // InternalKExpressions.g:1232:8: lv_subExpressions_13_0= ruleShiftLeftRightExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_2_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_subExpressions_13_0=ruleShiftLeftRightExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_13_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1250:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalKExpressions.g:1251:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) )
                    	    {
                    	    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_14, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1255:6: ( (lv_subExpressions_15_0= ruleShiftLeftRightExpression ) )
                    	    // InternalKExpressions.g:1256:7: (lv_subExpressions_15_0= ruleShiftLeftRightExpression )
                    	    {
                    	    // InternalKExpressions.g:1256:7: (lv_subExpressions_15_0= ruleShiftLeftRightExpression )
                    	    // InternalKExpressions.g:1257:8: lv_subExpressions_15_0= ruleShiftLeftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_2_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_subExpressions_15_0=ruleShiftLeftRightExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftExpressionsRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_15_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftExpressions"


    // $ANTLR start "entryRuleShiftLeftRightExpression"
    // InternalKExpressions.g:1281:1: entryRuleShiftLeftRightExpression returns [EObject current=null] : iv_ruleShiftLeftRightExpression= ruleShiftLeftRightExpression EOF ;
    public final EObject entryRuleShiftLeftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftLeftRightExpression = null;


        try {
            // InternalKExpressions.g:1281:65: (iv_ruleShiftLeftRightExpression= ruleShiftLeftRightExpression EOF )
            // InternalKExpressions.g:1282:2: iv_ruleShiftLeftRightExpression= ruleShiftLeftRightExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftLeftRightExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftLeftRightExpression=ruleShiftLeftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftLeftRightExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftLeftRightExpression"


    // $ANTLR start "ruleShiftLeftRightExpression"
    // InternalKExpressions.g:1288:1: ruleShiftLeftRightExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )? ) ;
    public final EObject ruleShiftLeftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1294:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:1295:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:1295:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )? )
            // InternalKExpressions.g:1296:3: this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_15);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1307:3: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )?
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalKExpressions.g:1308:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1308:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
                    // InternalKExpressions.g:1309:5: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1309:5: ()
                    // InternalKExpressions.g:1310:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftLeftRightExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1319:5: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1320:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1320:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKExpressions.g:1321:7: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKExpressions.g:1321:7: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKExpressions.g:1322:8: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleShiftLeftOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1339:6: ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
                    // InternalKExpressions.g:1340:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1340:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
                    // InternalKExpressions.g:1341:8: lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_subExpressions_3_0=ruleShiftRightRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightRightUnsignedExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1359:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==22) ) {
                            int LA20_2 = input.LA(2);

                            if ( (synpred22_InternalKExpressions()) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKExpressions.g:1360:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getShiftLeftRightExpressionAccess().getLessThanSignLessThanSignKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1364:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1365:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1365:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
                    	    // InternalKExpressions.g:1366:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftLeftRightExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightRightUnsignedExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;
                case 2 :
                    // InternalKExpressions.g:1386:4: ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1386:4: ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
                    // InternalKExpressions.g:1387:5: () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1387:5: ()
                    // InternalKExpressions.g:1388:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftLeftRightExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1397:5: ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1398:6: ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1398:6: ( (lv_operator_7_0= ruleShiftRightOperator ) )
                    // InternalKExpressions.g:1399:7: (lv_operator_7_0= ruleShiftRightOperator )
                    {
                    // InternalKExpressions.g:1399:7: (lv_operator_7_0= ruleShiftRightOperator )
                    // InternalKExpressions.g:1400:8: lv_operator_7_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1417:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) )
                    // InternalKExpressions.g:1418:7: (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1418:7: (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression )
                    // InternalKExpressions.g:1419:8: lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_subExpressions_8_0=ruleShiftLeftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightUnsignedExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1437:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==23) ) {
                            int LA21_2 = input.LA(2);

                            if ( (synpred24_InternalKExpressions()) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalKExpressions.g:1438:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getShiftLeftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1442:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1443:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1443:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
                    	    // InternalKExpressions.g:1444:8: lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
                    	    lv_subExpressions_10_0=ruleShiftLeftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftLeftRightExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightUnsignedExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftLeftRightExpression"


    // $ANTLR start "entryRuleShiftLeftRightUnsignedExpression"
    // InternalKExpressions.g:1468:1: entryRuleShiftLeftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftLeftRightUnsignedExpression= ruleShiftLeftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftLeftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftLeftRightUnsignedExpression = null;


        try {
            // InternalKExpressions.g:1468:73: (iv_ruleShiftLeftRightUnsignedExpression= ruleShiftLeftRightUnsignedExpression EOF )
            // InternalKExpressions.g:1469:2: iv_ruleShiftLeftRightUnsignedExpression= ruleShiftLeftRightUnsignedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftLeftRightUnsignedExpression=ruleShiftLeftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftLeftRightUnsignedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftLeftRightUnsignedExpression"


    // $ANTLR start "ruleShiftLeftRightUnsignedExpression"
    // InternalKExpressions.g:1475:1: ruleShiftLeftRightUnsignedExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? ) ;
    public final EObject ruleShiftLeftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1481:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:1482:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:1482:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? )
            // InternalKExpressions.g:1483:3: this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_16);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1494:3: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )?
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalKExpressions.g:1495:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1495:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
                    // InternalKExpressions.g:1496:5: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1496:5: ()
                    // InternalKExpressions.g:1497:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1506:5: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1507:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1507:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
                    // InternalKExpressions.g:1508:7: (lv_operator_2_0= ruleShiftLeftOperator )
                    {
                    // InternalKExpressions.g:1508:7: (lv_operator_2_0= ruleShiftLeftOperator )
                    // InternalKExpressions.g:1509:8: lv_operator_2_0= ruleShiftLeftOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleShiftLeftOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightUnsignedExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1526:6: ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
                    // InternalKExpressions.g:1527:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1527:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
                    // InternalKExpressions.g:1528:8: lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_subExpressions_3_0=ruleShiftRightRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightUnsignedExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightRightUnsignedExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1546:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==22) ) {
                            int LA23_2 = input.LA(2);

                            if ( (synpred26_InternalKExpressions()) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalKExpressions.g:1547:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getLessThanSignLessThanSignKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1551:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1552:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1552:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
                    	    // InternalKExpressions.g:1553:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftLeftRightUnsignedExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightRightUnsignedExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;
                case 2 :
                    // InternalKExpressions.g:1573:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1573:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
                    // InternalKExpressions.g:1574:5: () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
                    {
                    // InternalKExpressions.g:1574:5: ()
                    // InternalKExpressions.g:1575:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1584:5: ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) )
                    // InternalKExpressions.g:1585:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
                    {
                    // InternalKExpressions.g:1585:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKExpressions.g:1586:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKExpressions.g:1586:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
                    // InternalKExpressions.g:1587:8: lv_operator_7_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightUnsignedExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1604:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
                    // InternalKExpressions.g:1605:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
                    {
                    // InternalKExpressions.g:1605:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
                    // InternalKExpressions.g:1606:8: lv_subExpressions_8_0= ruleShiftLeftRightExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_subExpressions_8_0=ruleShiftLeftRightExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftLeftRightUnsignedExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1624:5: (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==24) ) {
                            int LA24_2 = input.LA(2);

                            if ( (synpred28_InternalKExpressions()) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalKExpressions.g:1625:6: otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1629:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
                    	    // InternalKExpressions.g:1630:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
                    	    {
                    	    // InternalKExpressions.g:1630:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
                    	    // InternalKExpressions.g:1631:8: lv_subExpressions_10_0= ruleShiftLeftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_subExpressions_10_0=ruleShiftLeftRightExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftLeftRightUnsignedExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftLeftRightUnsignedExpression"


    // $ANTLR start "entryRuleShiftRightRightUnsignedExpression"
    // InternalKExpressions.g:1655:1: entryRuleShiftRightRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightRightUnsignedExpression= ruleShiftRightRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightRightUnsignedExpression = null;


        try {
            // InternalKExpressions.g:1655:74: (iv_ruleShiftRightRightUnsignedExpression= ruleShiftRightRightUnsignedExpression EOF )
            // InternalKExpressions.g:1656:2: iv_ruleShiftRightRightUnsignedExpression= ruleShiftRightRightUnsignedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightRightUnsignedExpression=ruleShiftRightRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightRightUnsignedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftRightRightUnsignedExpression"


    // $ANTLR start "ruleShiftRightRightUnsignedExpression"
    // InternalKExpressions.g:1662:1: ruleShiftRightRightUnsignedExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? ) ;
    public final EObject ruleShiftRightRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1668:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:1669:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:1669:2: (this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )? )
            // InternalKExpressions.g:1670:3: this_SumExpression_0= ruleSumExpression ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_17);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1681:3: ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )?
            int alt28=3;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalKExpressions.g:1682:4: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1682:4: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
                    // InternalKExpressions.g:1683:5: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1683:5: ()
                    // InternalKExpressions.g:1684:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftRightRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1693:5: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1694:6: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1694:6: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKExpressions.g:1695:7: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKExpressions.g:1695:7: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKExpressions.g:1696:8: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftRightRightUnsignedExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1713:6: ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) )
                    // InternalKExpressions.g:1714:7: (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1714:7: (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression )
                    // InternalKExpressions.g:1715:8: lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_subExpressions_3_0=ruleShiftLeftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftRightRightUnsignedExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightUnsignedExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1733:5: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==23) ) {
                            int LA26_2 = input.LA(2);

                            if ( (synpred30_InternalKExpressions()) ) {
                                alt26=1;
                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalKExpressions.g:1734:6: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getShiftRightRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1738:6: ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1739:7: (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1739:7: (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression )
                    	    // InternalKExpressions.g:1740:8: lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
                    	    lv_subExpressions_5_0=ruleShiftLeftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftRightRightUnsignedExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightUnsignedExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:1760:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
                    {
                    // InternalKExpressions.g:1760:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
                    // InternalKExpressions.g:1761:5: () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
                    {
                    // InternalKExpressions.g:1761:5: ()
                    // InternalKExpressions.g:1762:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getShiftRightRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:1771:5: ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) )
                    // InternalKExpressions.g:1772:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
                    {
                    // InternalKExpressions.g:1772:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKExpressions.g:1773:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKExpressions.g:1773:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
                    // InternalKExpressions.g:1774:8: lv_operator_7_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftRightRightUnsignedExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:1791:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
                    // InternalKExpressions.g:1792:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
                    {
                    // InternalKExpressions.g:1792:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
                    // InternalKExpressions.g:1793:8: lv_subExpressions_8_0= ruleShiftLeftRightExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_subExpressions_8_0=ruleShiftLeftRightExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getShiftRightRightUnsignedExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1811:5: (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==24) ) {
                            int LA27_2 = input.LA(2);

                            if ( (synpred32_InternalKExpressions()) ) {
                                alt27=1;
                            }


                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalKExpressions.g:1812:6: otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getShiftRightRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:1816:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
                    	    // InternalKExpressions.g:1817:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
                    	    {
                    	    // InternalKExpressions.g:1817:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
                    	    // InternalKExpressions.g:1818:8: lv_subExpressions_10_0= ruleShiftLeftRightExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_subExpressions_10_0=ruleShiftLeftRightExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getShiftRightRightUnsignedExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ShiftLeftRightExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftRightRightUnsignedExpression"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKExpressions.g:1842:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKExpressions.g:1842:61: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKExpressions.g:1843:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightExpression=ruleShiftRightExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftRightExpression"


    // $ANTLR start "ruleShiftRightExpression"
    // InternalKExpressions.g:1849:1: ruleShiftRightExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1855:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKExpressions.g:1856:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKExpressions.g:1856:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKExpressions.g:1857:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_13);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1868:3: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalKExpressions.g:1869:4: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1869:4: ()
                    // InternalKExpressions.g:1870:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getShiftRightExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:1879:4: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1880:5: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1880:5: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKExpressions.g:1881:6: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKExpressions.g:1881:6: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKExpressions.g:1882:7: lv_operator_2_0= ruleShiftRightOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleShiftRightOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:1899:5: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKExpressions.g:1900:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1900:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKExpressions.g:1901:7: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_subExpressions_3_0=ruleShiftRightUnsignedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:1919:4: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==23) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalKExpressions.g:1920:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:1924:5: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1925:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1925:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKExpressions.g:1926:7: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
                    	    lv_subExpressions_5_0=ruleShiftRightUnsignedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShiftRightExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftRightExpression"


    // $ANTLR start "entryRuleShiftRightUnsignedExpression"
    // InternalKExpressions.g:1949:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKExpressions.g:1949:69: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKExpressions.g:1950:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftRightUnsignedExpression=ruleShiftRightUnsignedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftRightUnsignedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftRightUnsignedExpression"


    // $ANTLR start "ruleShiftRightUnsignedExpression"
    // InternalKExpressions.g:1956:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1962:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) )
            // InternalKExpressions.g:1963:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            {
            // InternalKExpressions.g:1963:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            // InternalKExpressions.g:1964:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_14);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1975:3: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalKExpressions.g:1976:4: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    {
                    // InternalKExpressions.g:1976:4: ()
                    // InternalKExpressions.g:1977:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:1986:4: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) )
                    // InternalKExpressions.g:1987:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    {
                    // InternalKExpressions.g:1987:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKExpressions.g:1988:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKExpressions.g:1988:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKExpressions.g:1989:7: lv_operator_2_0= ruleShiftRightUnsignedOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleShiftRightUnsignedOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ShiftRightUnsignedOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:2006:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    // InternalKExpressions.g:2007:6: (lv_subExpressions_3_0= ruleSumExpression )
                    {
                    // InternalKExpressions.g:2007:6: (lv_subExpressions_3_0= ruleSumExpression )
                    // InternalKExpressions.g:2008:7: lv_subExpressions_3_0= ruleSumExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_subExpressions_3_0=ruleSumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2026:4: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==24) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalKExpressions.g:2027:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:2031:5: ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    // InternalKExpressions.g:2032:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    {
                    	    // InternalKExpressions.g:2032:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    // InternalKExpressions.g:2033:7: lv_subExpressions_5_0= ruleSumExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_subExpressions_5_0=ruleSumExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getShiftRightUnsignedExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftRightUnsignedExpression"


    // $ANTLR start "entryRuleSumExpression"
    // InternalKExpressions.g:2056:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalKExpressions.g:2056:54: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalKExpressions.g:2057:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSumExpression"


    // $ANTLR start "ruleSumExpression"
    // InternalKExpressions.g:2063:1: ruleSumExpression returns [EObject current=null] : (this_ProductExpression_0= ruleProductExpression ( ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* ) )? ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_ProductExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2069:2: ( (this_ProductExpression_0= ruleProductExpression ( ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:2070:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:2070:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* ) )? )
            // InternalKExpressions.g:2071:3: this_ProductExpression_0= ruleProductExpression ( ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSumExpressionAccess().getProductExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_18);
            this_ProductExpression_0=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProductExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2082:3: ( ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            else if ( (LA35_0==26) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // InternalKExpressions.g:2083:4: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2083:4: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )* )
                    // InternalKExpressions.g:2084:5: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    {
                    // InternalKExpressions.g:2084:5: ()
                    // InternalKExpressions.g:2085:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getSumExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2094:5: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )
                    // InternalKExpressions.g:2095:6: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    {
                    // InternalKExpressions.g:2095:6: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKExpressions.g:2096:7: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKExpressions.g:2096:7: (lv_operator_2_0= ruleAddOperator )
                    // InternalKExpressions.g:2097:8: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleAddOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.AddOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2114:6: ( (lv_subExpressions_3_0= ruleSubExpression ) )
                    // InternalKExpressions.g:2115:7: (lv_subExpressions_3_0= ruleSubExpression )
                    {
                    // InternalKExpressions.g:2115:7: (lv_subExpressions_3_0= ruleSubExpression )
                    // InternalKExpressions.g:2116:8: lv_subExpressions_3_0= ruleSubExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_subExpressions_3_0=ruleSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2134:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==25) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalKExpressions.g:2135:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getSumExpressionAccess().getPlusSignKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2139:6: ( (lv_subExpressions_5_0= ruleSubExpression ) )
                    	    // InternalKExpressions.g:2140:7: (lv_subExpressions_5_0= ruleSubExpression )
                    	    {
                    	    // InternalKExpressions.g:2140:7: (lv_subExpressions_5_0= ruleSubExpression )
                    	    // InternalKExpressions.g:2141:8: lv_subExpressions_5_0= ruleSubExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_subExpressions_5_0=ruleSubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SubExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;
                case 2 :
                    // InternalKExpressions.g:2161:4: ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2161:4: ( () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )* )
                    // InternalKExpressions.g:2162:5: () ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )*
                    {
                    // InternalKExpressions.g:2162:5: ()
                    // InternalKExpressions.g:2163:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getSumExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2172:5: ( ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) ) )
                    // InternalKExpressions.g:2173:6: ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleAddExpression ) )
                    {
                    // InternalKExpressions.g:2173:6: ( (lv_operator_7_0= ruleSubOperator ) )
                    // InternalKExpressions.g:2174:7: (lv_operator_7_0= ruleSubOperator )
                    {
                    // InternalKExpressions.g:2174:7: (lv_operator_7_0= ruleSubOperator )
                    // InternalKExpressions.g:2175:8: lv_operator_7_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2192:6: ( (lv_subExpressions_8_0= ruleAddExpression ) )
                    // InternalKExpressions.g:2193:7: (lv_subExpressions_8_0= ruleAddExpression )
                    {
                    // InternalKExpressions.g:2193:7: (lv_subExpressions_8_0= ruleAddExpression )
                    // InternalKExpressions.g:2194:8: lv_subExpressions_8_0= ruleAddExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_subExpressions_8_0=ruleAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2212:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==26) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalKExpressions.g:2213:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleAddExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getSumExpressionAccess().getHyphenMinusKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2217:6: ( (lv_subExpressions_10_0= ruleAddExpression ) )
                    	    // InternalKExpressions.g:2218:7: (lv_subExpressions_10_0= ruleAddExpression )
                    	    {
                    	    // InternalKExpressions.g:2218:7: (lv_subExpressions_10_0= ruleAddExpression )
                    	    // InternalKExpressions.g:2219:8: lv_subExpressions_10_0= ruleAddExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsAddExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_subExpressions_10_0=ruleAddExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getSumExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.AddExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalKExpressions.g:2243:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalKExpressions.g:2243:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalKExpressions.g:2244:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalKExpressions.g:2250:1: ruleAddExpression returns [EObject current=null] : (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ProductExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2256:2: ( (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? ) )
            // InternalKExpressions.g:2257:2: (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? )
            {
            // InternalKExpressions.g:2257:2: (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? )
            // InternalKExpressions.g:2258:3: this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAddExpressionAccess().getProductExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_ProductExpression_0=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProductExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2269:3: ( () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKExpressions.g:2270:4: () ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
                    {
                    // InternalKExpressions.g:2270:4: ()
                    // InternalKExpressions.g:2271:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:2280:4: ( ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) )
                    // InternalKExpressions.g:2281:5: ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) )
                    {
                    // InternalKExpressions.g:2281:5: ( (lv_operator_2_0= ruleAddOperator ) )
                    // InternalKExpressions.g:2282:6: (lv_operator_2_0= ruleAddOperator )
                    {
                    // InternalKExpressions.g:2282:6: (lv_operator_2_0= ruleAddOperator )
                    // InternalKExpressions.g:2283:7: lv_operator_2_0= ruleAddOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleAddOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.AddOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:2300:5: ( (lv_subExpressions_3_0= ruleProductExpression ) )
                    // InternalKExpressions.g:2301:6: (lv_subExpressions_3_0= ruleProductExpression )
                    {
                    // InternalKExpressions.g:2301:6: (lv_subExpressions_3_0= ruleProductExpression )
                    // InternalKExpressions.g:2302:7: lv_subExpressions_3_0= ruleProductExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_subExpressions_3_0=ruleProductExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2320:4: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==25) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalKExpressions.g:2321:5: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:2325:5: ( (lv_subExpressions_5_0= ruleProductExpression ) )
                    	    // InternalKExpressions.g:2326:6: (lv_subExpressions_5_0= ruleProductExpression )
                    	    {
                    	    // InternalKExpressions.g:2326:6: (lv_subExpressions_5_0= ruleProductExpression )
                    	    // InternalKExpressions.g:2327:7: lv_subExpressions_5_0= ruleProductExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_subExpressions_5_0=ruleProductExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAddExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // InternalKExpressions.g:2350:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // InternalKExpressions.g:2350:54: (iv_ruleSubExpression= ruleSubExpression EOF )
            // InternalKExpressions.g:2351:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubExpression"


    // $ANTLR start "ruleSubExpression"
    // InternalKExpressions.g:2357:1: ruleSubExpression returns [EObject current=null] : (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_ProductExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2363:2: ( (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? ) )
            // InternalKExpressions.g:2364:2: (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? )
            {
            // InternalKExpressions.g:2364:2: (this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )? )
            // InternalKExpressions.g:2365:3: this_ProductExpression_0= ruleProductExpression ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSubExpressionAccess().getProductExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_ProductExpression_0=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProductExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2376:3: ( () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKExpressions.g:2377:4: () ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) ) (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
                    {
                    // InternalKExpressions.g:2377:4: ()
                    // InternalKExpressions.g:2378:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:2387:4: ( ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) )
                    // InternalKExpressions.g:2388:5: ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) )
                    {
                    // InternalKExpressions.g:2388:5: ( (lv_operator_2_0= ruleSubOperator ) )
                    // InternalKExpressions.g:2389:6: (lv_operator_2_0= ruleSubOperator )
                    {
                    // InternalKExpressions.g:2389:6: (lv_operator_2_0= ruleSubOperator )
                    // InternalKExpressions.g:2390:7: lv_operator_2_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:2407:5: ( (lv_subExpressions_3_0= ruleProductExpression ) )
                    // InternalKExpressions.g:2408:6: (lv_subExpressions_3_0= ruleProductExpression )
                    {
                    // InternalKExpressions.g:2408:6: (lv_subExpressions_3_0= ruleProductExpression )
                    // InternalKExpressions.g:2409:7: lv_subExpressions_3_0= ruleProductExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_subExpressions_3_0=ruleProductExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2427:4: (otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==26) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalKExpressions.g:2428:5: otherlv_4= '-' ( (lv_subExpressions_5_0= ruleProductExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSubExpressionAccess().getHyphenMinusKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:2432:5: ( (lv_subExpressions_5_0= ruleProductExpression ) )
                    	    // InternalKExpressions.g:2433:6: (lv_subExpressions_5_0= ruleProductExpression )
                    	    {
                    	    // InternalKExpressions.g:2433:6: (lv_subExpressions_5_0= ruleProductExpression )
                    	    // InternalKExpressions.g:2434:7: lv_subExpressions_5_0= ruleProductExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_subExpressions_5_0=ruleProductExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSubExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleProductExpression"
    // InternalKExpressions.g:2457:1: entryRuleProductExpression returns [EObject current=null] : iv_ruleProductExpression= ruleProductExpression EOF ;
    public final EObject entryRuleProductExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExpression = null;


        try {
            // InternalKExpressions.g:2457:58: (iv_ruleProductExpression= ruleProductExpression EOF )
            // InternalKExpressions.g:2458:2: iv_ruleProductExpression= ruleProductExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProductExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleProductExpression=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProductExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProductExpression"


    // $ANTLR start "ruleProductExpression"
    // InternalKExpressions.g:2464:1: ruleProductExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* ) )? ) ;
    public final EObject ruleProductExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;

        Enumerator lv_operator_12_0 = null;

        EObject lv_subExpressions_13_0 = null;

        EObject lv_subExpressions_15_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2470:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:2471:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:2471:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* ) )? )
            // InternalKExpressions.g:2472:3: this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProductExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2483:3: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* ) )?
            int alt43=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt43=1;
                    }
                    break;
                case 28:
                    {
                    alt43=2;
                    }
                    break;
                case 29:
                    {
                    alt43=3;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // InternalKExpressions.g:2484:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2484:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
                    // InternalKExpressions.g:2485:5: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
                    {
                    // InternalKExpressions.g:2485:5: ()
                    // InternalKExpressions.g:2486:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getProductExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2495:5: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) )
                    // InternalKExpressions.g:2496:6: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) )
                    {
                    // InternalKExpressions.g:2496:6: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKExpressions.g:2497:7: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKExpressions.g:2497:7: (lv_operator_2_0= ruleMultOperator )
                    // InternalKExpressions.g:2498:8: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleMultOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2515:6: ( (lv_subExpressions_3_0= ruleDivModExpression ) )
                    // InternalKExpressions.g:2516:7: (lv_subExpressions_3_0= ruleDivModExpression )
                    {
                    // InternalKExpressions.g:2516:7: (lv_subExpressions_3_0= ruleDivModExpression )
                    // InternalKExpressions.g:2517:8: lv_subExpressions_3_0= ruleDivModExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_subExpressions_3_0=ruleDivModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.DivModExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2535:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==27) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalKExpressions.g:2536:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getProductExpressionAccess().getAsteriskKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2540:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
                    	    // InternalKExpressions.g:2541:7: (lv_subExpressions_5_0= ruleDivModExpression )
                    	    {
                    	    // InternalKExpressions.g:2541:7: (lv_subExpressions_5_0= ruleDivModExpression )
                    	    // InternalKExpressions.g:2542:8: lv_subExpressions_5_0= ruleDivModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_subExpressions_5_0=ruleDivModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.DivModExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2562:4: ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2562:4: ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* )
                    // InternalKExpressions.g:2563:5: () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )*
                    {
                    // InternalKExpressions.g:2563:5: ()
                    // InternalKExpressions.g:2564:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getProductExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2573:5: ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) )
                    // InternalKExpressions.g:2574:6: ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) )
                    {
                    // InternalKExpressions.g:2574:6: ( (lv_operator_7_0= ruleDivOperator ) )
                    // InternalKExpressions.g:2575:7: (lv_operator_7_0= ruleDivOperator )
                    {
                    // InternalKExpressions.g:2575:7: (lv_operator_7_0= ruleDivOperator )
                    // InternalKExpressions.g:2576:8: lv_operator_7_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2593:6: ( (lv_subExpressions_8_0= ruleMultModExpression ) )
                    // InternalKExpressions.g:2594:7: (lv_subExpressions_8_0= ruleMultModExpression )
                    {
                    // InternalKExpressions.g:2594:7: (lv_subExpressions_8_0= ruleMultModExpression )
                    // InternalKExpressions.g:2595:8: lv_subExpressions_8_0= ruleMultModExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_subExpressions_8_0=ruleMultModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultModExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2613:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==28) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalKExpressions.g:2614:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getProductExpressionAccess().getSolidusKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2618:6: ( (lv_subExpressions_10_0= ruleMultModExpression ) )
                    	    // InternalKExpressions.g:2619:7: (lv_subExpressions_10_0= ruleMultModExpression )
                    	    {
                    	    // InternalKExpressions.g:2619:7: (lv_subExpressions_10_0= ruleMultModExpression )
                    	    // InternalKExpressions.g:2620:8: lv_subExpressions_10_0= ruleMultModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_subExpressions_10_0=ruleMultModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.MultModExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;
                case 3 :
                    // InternalKExpressions.g:2640:4: ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2640:4: ( () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )* )
                    // InternalKExpressions.g:2641:5: () ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )*
                    {
                    // InternalKExpressions.g:2641:5: ()
                    // InternalKExpressions.g:2642:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getProductExpressionAccess().getOperatorExpressionSubExpressionsAction_1_2_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2651:5: ( ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) ) )
                    // InternalKExpressions.g:2652:6: ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleMultDivExpression ) )
                    {
                    // InternalKExpressions.g:2652:6: ( (lv_operator_12_0= ruleModOperator ) )
                    // InternalKExpressions.g:2653:7: (lv_operator_12_0= ruleModOperator )
                    {
                    // InternalKExpressions.g:2653:7: (lv_operator_12_0= ruleModOperator )
                    // InternalKExpressions.g:2654:8: lv_operator_12_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorModOperatorEnumRuleCall_1_2_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_12_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_12_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2671:6: ( (lv_subExpressions_13_0= ruleMultDivExpression ) )
                    // InternalKExpressions.g:2672:7: (lv_subExpressions_13_0= ruleMultDivExpression )
                    {
                    // InternalKExpressions.g:2672:7: (lv_subExpressions_13_0= ruleMultDivExpression )
                    // InternalKExpressions.g:2673:8: lv_subExpressions_13_0= ruleMultDivExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_2_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_subExpressions_13_0=ruleMultDivExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_13_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultDivExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2691:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==29) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalKExpressions.g:2692:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleMultDivExpression ) )
                    	    {
                    	    otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_14, grammarAccess.getProductExpressionAccess().getPercentSignKeyword_1_2_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2696:6: ( (lv_subExpressions_15_0= ruleMultDivExpression ) )
                    	    // InternalKExpressions.g:2697:7: (lv_subExpressions_15_0= ruleMultDivExpression )
                    	    {
                    	    // InternalKExpressions.g:2697:7: (lv_subExpressions_15_0= ruleMultDivExpression )
                    	    // InternalKExpressions.g:2698:8: lv_subExpressions_15_0= ruleMultDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_2_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_subExpressions_15_0=ruleMultDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getProductExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_15_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.MultDivExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProductExpression"


    // $ANTLR start "entryRuleMultDivExpression"
    // InternalKExpressions.g:2722:1: entryRuleMultDivExpression returns [EObject current=null] : iv_ruleMultDivExpression= ruleMultDivExpression EOF ;
    public final EObject entryRuleMultDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDivExpression = null;


        try {
            // InternalKExpressions.g:2722:58: (iv_ruleMultDivExpression= ruleMultDivExpression EOF )
            // InternalKExpressions.g:2723:2: iv_ruleMultDivExpression= ruleMultDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultDivExpression=ruleMultDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultDivExpression"


    // $ANTLR start "ruleMultDivExpression"
    // InternalKExpressions.g:2729:1: ruleMultDivExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )? ) ;
    public final EObject ruleMultDivExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2735:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:2736:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:2736:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )? )
            // InternalKExpressions.g:2737:3: this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultDivExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2748:3: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )?
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalKExpressions.g:2749:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2749:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
                    // InternalKExpressions.g:2750:5: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
                    {
                    // InternalKExpressions.g:2750:5: ()
                    // InternalKExpressions.g:2751:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getMultDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2760:5: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) )
                    // InternalKExpressions.g:2761:6: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) )
                    {
                    // InternalKExpressions.g:2761:6: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKExpressions.g:2762:7: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKExpressions.g:2762:7: (lv_operator_2_0= ruleMultOperator )
                    // InternalKExpressions.g:2763:8: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleMultOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultDivExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2780:6: ( (lv_subExpressions_3_0= ruleDivModExpression ) )
                    // InternalKExpressions.g:2781:7: (lv_subExpressions_3_0= ruleDivModExpression )
                    {
                    // InternalKExpressions.g:2781:7: (lv_subExpressions_3_0= ruleDivModExpression )
                    // InternalKExpressions.g:2782:8: lv_subExpressions_3_0= ruleDivModExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_subExpressions_3_0=ruleDivModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultDivExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.DivModExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2800:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==27) ) {
                            int LA44_2 = input.LA(2);

                            if ( (synpred52_InternalKExpressions()) ) {
                                alt44=1;
                            }


                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalKExpressions.g:2801:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getMultDivExpressionAccess().getAsteriskKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2805:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
                    	    // InternalKExpressions.g:2806:7: (lv_subExpressions_5_0= ruleDivModExpression )
                    	    {
                    	    // InternalKExpressions.g:2806:7: (lv_subExpressions_5_0= ruleDivModExpression )
                    	    // InternalKExpressions.g:2807:8: lv_subExpressions_5_0= ruleDivModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_subExpressions_5_0=ruleDivModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultDivExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.DivModExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2827:4: ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2827:4: ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* )
                    // InternalKExpressions.g:2828:5: () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )*
                    {
                    // InternalKExpressions.g:2828:5: ()
                    // InternalKExpressions.g:2829:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getMultDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2838:5: ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) )
                    // InternalKExpressions.g:2839:6: ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) )
                    {
                    // InternalKExpressions.g:2839:6: ( (lv_operator_7_0= ruleDivOperator ) )
                    // InternalKExpressions.g:2840:7: (lv_operator_7_0= ruleDivOperator )
                    {
                    // InternalKExpressions.g:2840:7: (lv_operator_7_0= ruleDivOperator )
                    // InternalKExpressions.g:2841:8: lv_operator_7_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultDivExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2858:6: ( (lv_subExpressions_8_0= ruleMultModExpression ) )
                    // InternalKExpressions.g:2859:7: (lv_subExpressions_8_0= ruleMultModExpression )
                    {
                    // InternalKExpressions.g:2859:7: (lv_subExpressions_8_0= ruleMultModExpression )
                    // InternalKExpressions.g:2860:8: lv_subExpressions_8_0= ruleMultModExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_subExpressions_8_0=ruleMultModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultDivExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultModExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2878:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==28) ) {
                            int LA45_2 = input.LA(2);

                            if ( (synpred54_InternalKExpressions()) ) {
                                alt45=1;
                            }


                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalKExpressions.g:2879:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getMultDivExpressionAccess().getSolidusKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2883:6: ( (lv_subExpressions_10_0= ruleMultModExpression ) )
                    	    // InternalKExpressions.g:2884:7: (lv_subExpressions_10_0= ruleMultModExpression )
                    	    {
                    	    // InternalKExpressions.g:2884:7: (lv_subExpressions_10_0= ruleMultModExpression )
                    	    // InternalKExpressions.g:2885:8: lv_subExpressions_10_0= ruleMultModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_subExpressions_10_0=ruleMultModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultDivExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.MultModExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultDivExpression"


    // $ANTLR start "entryRuleMultModExpression"
    // InternalKExpressions.g:2909:1: entryRuleMultModExpression returns [EObject current=null] : iv_ruleMultModExpression= ruleMultModExpression EOF ;
    public final EObject entryRuleMultModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultModExpression = null;


        try {
            // InternalKExpressions.g:2909:58: (iv_ruleMultModExpression= ruleMultModExpression EOF )
            // InternalKExpressions.g:2910:2: iv_ruleMultModExpression= ruleMultModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultModExpression=ruleMultModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultModExpression"


    // $ANTLR start "ruleMultModExpression"
    // InternalKExpressions.g:2916:1: ruleMultModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? ) ;
    public final EObject ruleMultModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2922:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:2923:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:2923:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? )
            // InternalKExpressions.g:2924:3: this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultModExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2935:3: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )?
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalKExpressions.g:2936:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
                    {
                    // InternalKExpressions.g:2936:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
                    // InternalKExpressions.g:2937:5: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
                    {
                    // InternalKExpressions.g:2937:5: ()
                    // InternalKExpressions.g:2938:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getMultModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:2947:5: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) )
                    // InternalKExpressions.g:2948:6: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) )
                    {
                    // InternalKExpressions.g:2948:6: ( (lv_operator_2_0= ruleMultOperator ) )
                    // InternalKExpressions.g:2949:7: (lv_operator_2_0= ruleMultOperator )
                    {
                    // InternalKExpressions.g:2949:7: (lv_operator_2_0= ruleMultOperator )
                    // InternalKExpressions.g:2950:8: lv_operator_2_0= ruleMultOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleMultOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultModExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:2967:6: ( (lv_subExpressions_3_0= ruleDivModExpression ) )
                    // InternalKExpressions.g:2968:7: (lv_subExpressions_3_0= ruleDivModExpression )
                    {
                    // InternalKExpressions.g:2968:7: (lv_subExpressions_3_0= ruleDivModExpression )
                    // InternalKExpressions.g:2969:8: lv_subExpressions_3_0= ruleDivModExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_subExpressions_3_0=ruleDivModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultModExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.DivModExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2987:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            int LA47_2 = input.LA(2);

                            if ( (synpred56_InternalKExpressions()) ) {
                                alt47=1;
                            }


                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalKExpressions.g:2988:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getMultModExpressionAccess().getAsteriskKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:2992:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
                    	    // InternalKExpressions.g:2993:7: (lv_subExpressions_5_0= ruleDivModExpression )
                    	    {
                    	    // InternalKExpressions.g:2993:7: (lv_subExpressions_5_0= ruleDivModExpression )
                    	    // InternalKExpressions.g:2994:8: lv_subExpressions_5_0= ruleDivModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_22);
                    	    lv_subExpressions_5_0=ruleDivModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultModExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.DivModExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3014:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
                    {
                    // InternalKExpressions.g:3014:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
                    // InternalKExpressions.g:3015:5: () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
                    {
                    // InternalKExpressions.g:3015:5: ()
                    // InternalKExpressions.g:3016:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getMultModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:3025:5: ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) )
                    // InternalKExpressions.g:3026:6: ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
                    {
                    // InternalKExpressions.g:3026:6: ( (lv_operator_7_0= ruleModOperator ) )
                    // InternalKExpressions.g:3027:7: (lv_operator_7_0= ruleModOperator )
                    {
                    // InternalKExpressions.g:3027:7: (lv_operator_7_0= ruleModOperator )
                    // InternalKExpressions.g:3028:8: lv_operator_7_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultModExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:3045:6: ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
                    // InternalKExpressions.g:3046:7: (lv_subExpressions_8_0= ruleMultDivExpression )
                    {
                    // InternalKExpressions.g:3046:7: (lv_subExpressions_8_0= ruleMultDivExpression )
                    // InternalKExpressions.g:3047:8: lv_subExpressions_8_0= ruleMultDivExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_subExpressions_8_0=ruleMultDivExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getMultModExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultDivExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:3065:5: (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==29) ) {
                            int LA48_2 = input.LA(2);

                            if ( (synpred58_InternalKExpressions()) ) {
                                alt48=1;
                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalKExpressions.g:3066:6: otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getMultModExpressionAccess().getPercentSignKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:3070:6: ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
                    	    // InternalKExpressions.g:3071:7: (lv_subExpressions_10_0= ruleMultDivExpression )
                    	    {
                    	    // InternalKExpressions.g:3071:7: (lv_subExpressions_10_0= ruleMultDivExpression )
                    	    // InternalKExpressions.g:3072:8: lv_subExpressions_10_0= ruleMultDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_subExpressions_10_0=ruleMultDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMultModExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.MultDivExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultModExpression"


    // $ANTLR start "entryRuleDivModExpression"
    // InternalKExpressions.g:3096:1: entryRuleDivModExpression returns [EObject current=null] : iv_ruleDivModExpression= ruleDivModExpression EOF ;
    public final EObject entryRuleDivModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivModExpression = null;


        try {
            // InternalKExpressions.g:3096:57: (iv_ruleDivModExpression= ruleDivModExpression EOF )
            // InternalKExpressions.g:3097:2: iv_ruleDivModExpression= ruleDivModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDivModExpression=ruleDivModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDivModExpression"


    // $ANTLR start "ruleDivModExpression"
    // InternalKExpressions.g:3103:1: ruleDivModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? ) ;
    public final EObject ruleDivModExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3109:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? ) )
            // InternalKExpressions.g:3110:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? )
            {
            // InternalKExpressions.g:3110:2: (this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )? )
            // InternalKExpressions.g:3111:3: this_NegExpression_0= ruleNegExpression ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDivModExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:3122:3: ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )?
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalKExpressions.g:3123:4: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* )
                    {
                    // InternalKExpressions.g:3123:4: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* )
                    // InternalKExpressions.g:3124:5: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )*
                    {
                    // InternalKExpressions.g:3124:5: ()
                    // InternalKExpressions.g:3125:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getDivModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:3134:5: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) )
                    // InternalKExpressions.g:3135:6: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) )
                    {
                    // InternalKExpressions.g:3135:6: ( (lv_operator_2_0= ruleDivOperator ) )
                    // InternalKExpressions.g:3136:7: (lv_operator_2_0= ruleDivOperator )
                    {
                    // InternalKExpressions.g:3136:7: (lv_operator_2_0= ruleDivOperator )
                    // InternalKExpressions.g:3137:8: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_0_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getDivModExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.DivOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:3154:6: ( (lv_subExpressions_3_0= ruleMultModExpression ) )
                    // InternalKExpressions.g:3155:7: (lv_subExpressions_3_0= ruleMultModExpression )
                    {
                    // InternalKExpressions.g:3155:7: (lv_subExpressions_3_0= ruleMultModExpression )
                    // InternalKExpressions.g:3156:8: lv_subExpressions_3_0= ruleMultModExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_0_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_subExpressions_3_0=ruleMultModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getDivModExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_3_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultModExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:3174:5: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==28) ) {
                            int LA50_2 = input.LA(2);

                            if ( (synpred60_InternalKExpressions()) ) {
                                alt50=1;
                            }


                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalKExpressions.g:3175:6: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getDivModExpressionAccess().getSolidusKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:3179:6: ( (lv_subExpressions_5_0= ruleMultModExpression ) )
                    	    // InternalKExpressions.g:3180:7: (lv_subExpressions_5_0= ruleMultModExpression )
                    	    {
                    	    // InternalKExpressions.g:3180:7: (lv_subExpressions_5_0= ruleMultModExpression )
                    	    // InternalKExpressions.g:3181:8: lv_subExpressions_5_0= ruleMultModExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_23);
                    	    lv_subExpressions_5_0=ruleMultModExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getDivModExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.MultModExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3201:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
                    {
                    // InternalKExpressions.g:3201:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
                    // InternalKExpressions.g:3202:5: () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
                    {
                    // InternalKExpressions.g:3202:5: ()
                    // InternalKExpressions.g:3203:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndAdd(
                      							grammarAccess.getDivModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalKExpressions.g:3212:5: ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) )
                    // InternalKExpressions.g:3213:6: ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
                    {
                    // InternalKExpressions.g:3213:6: ( (lv_operator_7_0= ruleModOperator ) )
                    // InternalKExpressions.g:3214:7: (lv_operator_7_0= ruleModOperator )
                    {
                    // InternalKExpressions.g:3214:7: (lv_operator_7_0= ruleModOperator )
                    // InternalKExpressions.g:3215:8: lv_operator_7_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_1_0_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_7_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getDivModExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_7_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.ModOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }

                    // InternalKExpressions.g:3232:6: ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
                    // InternalKExpressions.g:3233:7: (lv_subExpressions_8_0= ruleMultDivExpression )
                    {
                    // InternalKExpressions.g:3233:7: (lv_subExpressions_8_0= ruleMultDivExpression )
                    // InternalKExpressions.g:3234:8: lv_subExpressions_8_0= ruleMultDivExpression
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_1_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_subExpressions_8_0=ruleMultDivExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getDivModExpressionRule());
                      								}
                      								add(
                      									current,
                      									"subExpressions",
                      									lv_subExpressions_8_0,
                      									"de.cau.cs.kieler.kexpressions.KExpressions.MultDivExpression");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:3252:5: (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==29) ) {
                            int LA51_2 = input.LA(2);

                            if ( (synpred62_InternalKExpressions()) ) {
                                alt51=1;
                            }


                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKExpressions.g:3253:6: otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
                    	    {
                    	    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_9, grammarAccess.getDivModExpressionAccess().getPercentSignKeyword_1_1_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:3257:6: ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
                    	    // InternalKExpressions.g:3258:7: (lv_subExpressions_10_0= ruleMultDivExpression )
                    	    {
                    	    // InternalKExpressions.g:3258:7: (lv_subExpressions_10_0= ruleMultDivExpression )
                    	    // InternalKExpressions.g:3259:8: lv_subExpressions_10_0= ruleMultDivExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_24);
                    	    lv_subExpressions_10_0=ruleMultDivExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getDivModExpressionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"subExpressions",
                    	      									lv_subExpressions_10_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.MultDivExpression");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDivModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKExpressions.g:3283:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKExpressions.g:3283:54: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKExpressions.g:3284:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegExpression"


    // $ANTLR start "ruleNegExpression"
    // InternalKExpressions.g:3290:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3296:2: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKExpressions.g:3297:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKExpressions.g:3297:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_COMMENT_ANNOTATION)||LA53_0==31||(LA53_0>=39 && LA53_0<=41)||LA53_0==43||LA53_0==48||LA53_0==55||LA53_0==57) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalKExpressions.g:3298:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKExpressions.g:3298:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKExpressions.g:3299:4: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKExpressions.g:3299:4: ()
                    // InternalKExpressions.g:3300:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:3309:4: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKExpressions.g:3310:5: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKExpressions.g:3310:5: (lv_operator_1_0= ruleSubOperator )
                    // InternalKExpressions.g:3311:6: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_1_0=ruleSubOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.SubOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3328:4: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKExpressions.g:3329:5: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKExpressions.g:3329:5: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKExpressions.g:3330:6: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_2_0=ruleNegExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNegExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3349:3: this_TernaryOperation_3= ruleTernaryOperation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNegExpressionAccess().getTernaryOperationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TernaryOperation_3=ruleTernaryOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TernaryOperation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNegExpression"


    // $ANTLR start "entryRuleTernaryOperation"
    // InternalKExpressions.g:3364:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKExpressions.g:3364:57: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKExpressions.g:3365:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTernaryOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTernaryOperation=ruleTernaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTernaryOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTernaryOperation"


    // $ANTLR start "ruleTernaryOperation"
    // InternalKExpressions.g:3371:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_FBYExpression_6 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3377:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression ) )
            // InternalKExpressions.g:3378:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression )
            {
            // InternalKExpressions.g:3378:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression )
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalKExpressions.g:3379:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKExpressions.g:3379:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
                    // InternalKExpressions.g:3380:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKExpressions.g:3380:4: ()
                    // InternalKExpressions.g:3381:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTernaryOperationAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:3390:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:3391:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:3391:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:3392:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3409:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKExpressions.g:3410:5: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKExpressions.g:3410:5: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKExpressions.g:3411:6: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleConditionalOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ConditionalOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3428:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:3429:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:3429:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:3430:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_3_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4());
                      			
                    }
                    // InternalKExpressions.g:3451:4: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:3452:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:3452:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:3453:6: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTernaryOperationRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_5_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3472:3: this_FBYExpression_6= ruleFBYExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTernaryOperationAccess().getFBYExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FBYExpression_6=ruleFBYExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FBYExpression_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTernaryOperation"


    // $ANTLR start "entryRuleFBYExpression"
    // InternalKExpressions.g:3487:1: entryRuleFBYExpression returns [EObject current=null] : iv_ruleFBYExpression= ruleFBYExpression EOF ;
    public final EObject entryRuleFBYExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFBYExpression = null;


        try {
            // InternalKExpressions.g:3487:54: (iv_ruleFBYExpression= ruleFBYExpression EOF )
            // InternalKExpressions.g:3488:2: iv_ruleFBYExpression= ruleFBYExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFBYExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFBYExpression=ruleFBYExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFBYExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFBYExpression"


    // $ANTLR start "ruleFBYExpression"
    // InternalKExpressions.g:3494:1: ruleFBYExpression returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression ) ;
    public final EObject ruleFBYExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_AtomicValuedExpression_4 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3500:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression ) )
            // InternalKExpressions.g:3501:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )
            {
            // InternalKExpressions.g:3501:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // InternalKExpressions.g:3502:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    {
                    // InternalKExpressions.g:3502:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKExpressions.g:3503:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKExpressions.g:3503:4: ()
                    // InternalKExpressions.g:3504:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getFBYExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:3513:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:3514:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:3514:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:3515:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_subExpressions_1_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFBYExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3532:4: ( (lv_operator_2_0= ruleFBYOperator ) )
                    // InternalKExpressions.g:3533:5: (lv_operator_2_0= ruleFBYOperator )
                    {
                    // InternalKExpressions.g:3533:5: (lv_operator_2_0= ruleFBYOperator )
                    // InternalKExpressions.g:3534:6: lv_operator_2_0= ruleFBYOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFBYExpressionAccess().getOperatorFBYOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_29);
                    lv_operator_2_0=ruleFBYOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFBYExpressionRule());
                      						}
                      						set(
                      							current,
                      							"operator",
                      							lv_operator_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.FBYOperator");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3551:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:3552:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:3552:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:3553:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFBYExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_3_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.AtomicValuedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3572:3: this_AtomicValuedExpression_4= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFBYExpressionAccess().getAtomicValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicValuedExpression_4=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicValuedExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFBYExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKExpressions.g:3587:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKExpressions.g:3587:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKExpressions.g:3588:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // InternalKExpressions.g:3594:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_ReferenceCall_5 = null;

        EObject this_FunctionCall_6 = null;

        EObject this_RandomCall_7 = null;

        EObject this_RandomizeCall_8 = null;

        EObject this_TextExpression_9 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3600:2: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression ) )
            // InternalKExpressions.g:3601:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            {
            // InternalKExpressions.g:3601:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )
            int alt56=8;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalKExpressions.g:3602:3: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_0=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3614:3: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedObjectTestExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:3626:3: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // InternalKExpressions.g:3626:3: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // InternalKExpressions.g:3627:4: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BoolExpression_3;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:3648:3: this_ReferenceCall_5= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCall_5=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReferenceCall_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:3660:3: this_FunctionCall_6= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_6=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:3672:3: this_RandomCall_7= ruleRandomCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomCall_7=ruleRandomCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomCall_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalKExpressions.g:3684:3: this_RandomizeCall_8= ruleRandomizeCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomizeCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCall_8=ruleRandomizeCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomizeCall_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalKExpressions.g:3696:3: this_TextExpression_9= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_9=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleAtomicValuedExpression"
    // InternalKExpressions.g:3711:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKExpressions.g:3711:63: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKExpressions.g:3712:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicValuedExpression"


    // $ANTLR start "ruleAtomicValuedExpression"
    // InternalKExpressions.g:3718:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_VectorValue_3 = null;

        EObject this_ValuedExpression_5 = null;

        EObject this_AtomicExpression_7 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3724:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKExpressions.g:3725:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKExpressions.g:3725:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt57=6;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalKExpressions.g:3726:3: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3738:3: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FloatValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:3750:3: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:3762:3: this_VectorValue_3= ruleVectorValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVectorValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_VectorValue_3=ruleVectorValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VectorValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:3774:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKExpressions.g:3774:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKExpressions.g:3775:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ValuedExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:3796:3: this_AtomicExpression_7= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AtomicExpression_7=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AtomicExpression_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomicValuedExpression"


    // $ANTLR start "entryRuleValuedObjectTestExpression"
    // InternalKExpressions.g:3811:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKExpressions.g:3811:67: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKExpressions.g:3812:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedObjectTestExpression"


    // $ANTLR start "ruleValuedObjectTestExpression"
    // InternalKExpressions.g:3818:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_ValuedObjectReference_7 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3824:2: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) )
            // InternalKExpressions.g:3825:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            {
            // InternalKExpressions.g:3825:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55||LA60_0==57) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalKExpressions.g:3826:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    {
                    // InternalKExpressions.g:3826:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    // InternalKExpressions.g:3827:4: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')'
                    {
                    // InternalKExpressions.g:3827:4: ()
                    // InternalKExpressions.g:3828:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:3837:4: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKExpressions.g:3838:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKExpressions.g:3838:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKExpressions.g:3839:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKExpressions.g:3839:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==55) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==57) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalKExpressions.g:3840:7: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_33);
                            lv_operator_1_1=rulePreOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              							}
                              							set(
                              								current,
                              								"operator",
                              								lv_operator_1_1,
                              								"de.cau.cs.kieler.kexpressions.KExpressions.PreOperator");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalKExpressions.g:3856:7: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_33);
                            lv_operator_1_2=ruleValOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              							}
                              							set(
                              								current,
                              								"operator",
                              								lv_operator_1_2,
                              								"de.cau.cs.kieler.kexpressions.KExpressions.ValOperator");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalKExpressions.g:3878:4: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKExpressions.g:3879:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:3879:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:3880:6: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                      						}
                      						add(
                      							current,
                      							"subExpressions",
                      							lv_subExpressions_3_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectTestExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3897:4: (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==33) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalKExpressions.g:3898:5: otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            {
                            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getCommaKeyword_0_4_0());
                              				
                            }
                            // InternalKExpressions.g:3902:5: ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            // InternalKExpressions.g:3903:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            {
                            // InternalKExpressions.g:3903:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            // InternalKExpressions.g:3904:7: lv_subExpressions_5_0= ruleValuedObjectReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_32);
                            lv_subExpressions_5_0=ruleValuedObjectReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getValuedObjectTestExpressionRule());
                              							}
                              							add(
                              								current,
                              								"subExpressions",
                              								lv_subExpressions_5_0,
                              								"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3928:3: this_ValuedObjectReference_7= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectReference_7=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedObjectReference_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValuedObjectTestExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalKExpressions.g:3943:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKExpressions.g:3943:47: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKExpressions.g:3944:2: iv_rulePrimeID= rulePrimeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimeIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimeID=rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimeID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimeID"


    // $ANTLR start "rulePrimeID"
    // InternalKExpressions.g:3950:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3956:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKExpressions.g:3957:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKExpressions.g:3957:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKExpressions.g:3958:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKExpressions.g:3965:3: (kw= '\\'' )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==34) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalKExpressions.g:3966:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,34,FollowSets000.FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimeID"


    // $ANTLR start "entryRuleValuedObjectReference"
    // InternalKExpressions.g:3976:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKExpressions.g:3976:62: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKExpressions.g:3977:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValuedObjectReference"


    // $ANTLR start "ruleValuedObjectReference"
    // InternalKExpressions.g:3983:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3989:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKExpressions.g:3990:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKExpressions.g:3990:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKExpressions.g:3991:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKExpressions.g:3991:3: ( ( rulePrimeID ) )
            // InternalKExpressions.g:3992:4: ( rulePrimeID )
            {
            // InternalKExpressions.g:3992:4: ( rulePrimeID )
            // InternalKExpressions.g:3993:5: rulePrimeID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:4010:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==35) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalKExpressions.g:4011:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKExpressions.g:4015:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKExpressions.g:4016:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKExpressions.g:4016:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKExpressions.g:4017:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"indices",
            	      							lv_indices_2_0,
            	      							"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalKExpressions.g:4039:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalKExpressions.g:4040:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKExpressions.g:4044:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKExpressions.g:4045:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:4045:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKExpressions.g:4046:6: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
                      						}
                      						set(
                      							current,
                      							"subReference",
                      							lv_subReference_5_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKExpressions.g:4068:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKExpressions.g:4068:54: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKExpressions.g:4069:2: iv_ruleReferenceCall= ruleReferenceCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceCall=ruleReferenceCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceCall"


    // $ANTLR start "ruleReferenceCall"
    // InternalKExpressions.g:4075:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4081:2: ( ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) ) )
            // InternalKExpressions.g:4082:2: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            {
            // InternalKExpressions.g:4082:2: ( ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' ) )
            // InternalKExpressions.g:4083:3: ( ( rulePrimeID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            {
            // InternalKExpressions.g:4083:3: ( ( rulePrimeID ) )
            // InternalKExpressions.g:4084:4: ( rulePrimeID )
            {
            // InternalKExpressions.g:4084:4: ( rulePrimeID )
            // InternalKExpressions.g:4085:5: rulePrimeID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getReferenceCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReferenceCallAccess().getValuedObjectValuedObjectCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:4102:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' ) | otherlv_6= '()' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==31) ) {
                alt65=1;
            }
            else if ( (LA65_0==38) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalKExpressions.g:4103:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    {
                    // InternalKExpressions.g:4103:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')' )
                    // InternalKExpressions.g:4104:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_1_0_0());
                      				
                    }
                    // InternalKExpressions.g:4108:5: ( (lv_parameters_2_0= ruleParameter ) )
                    // InternalKExpressions.g:4109:6: (lv_parameters_2_0= ruleParameter )
                    {
                    // InternalKExpressions.g:4109:6: (lv_parameters_2_0= ruleParameter )
                    // InternalKExpressions.g:4110:7: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      							}
                      							add(
                      								current,
                      								"parameters",
                      								lv_parameters_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:4127:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==33) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalKExpressions.g:4128:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getCommaKeyword_1_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:4132:6: ( (lv_parameters_4_0= ruleParameter ) )
                    	    // InternalKExpressions.g:4133:7: (lv_parameters_4_0= ruleParameter )
                    	    {
                    	    // InternalKExpressions.g:4133:7: (lv_parameters_4_0= ruleParameter )
                    	    // InternalKExpressions.g:4134:8: lv_parameters_4_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_1_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_parameters_4_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"parameters",
                    	      									lv_parameters_4_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_1_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4158:4: otherlv_6= '()'
                    {
                    otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReferenceCall"


    // $ANTLR start "entryRuleRandomCall"
    // InternalKExpressions.g:4167:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKExpressions.g:4167:51: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKExpressions.g:4168:2: iv_ruleRandomCall= ruleRandomCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomCall=ruleRandomCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRandomCall"


    // $ANTLR start "ruleRandomCall"
    // InternalKExpressions.g:4174:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4180:2: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKExpressions.g:4181:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKExpressions.g:4181:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKExpressions.g:4182:3: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKExpressions.g:4182:3: ()
            // InternalKExpressions.g:4183:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRandomCallAccess().getRandomCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
              		
            }
            // InternalKExpressions.g:4196:3: (otherlv_2= '()' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==38) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalKExpressions.g:4197:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRandomCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRandomCall"


    // $ANTLR start "entryRuleRandomizeCall"
    // InternalKExpressions.g:4206:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKExpressions.g:4206:54: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKExpressions.g:4207:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRandomizeCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRandomizeCall=ruleRandomizeCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRandomizeCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRandomizeCall"


    // $ANTLR start "ruleRandomizeCall"
    // InternalKExpressions.g:4213:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4219:2: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKExpressions.g:4220:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKExpressions.g:4220:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKExpressions.g:4221:3: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKExpressions.g:4221:3: ()
            // InternalKExpressions.g:4222:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRandomizeCallAccess().getRandomizeCallAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
              		
            }
            // InternalKExpressions.g:4235:3: (otherlv_2= '()' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKExpressions.g:4236:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRandomizeCallAccess().getLeftParenthesisRightParenthesisKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRandomizeCall"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalKExpressions.g:4245:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKExpressions.g:4245:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKExpressions.g:4246:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalKExpressions.g:4252:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_functionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4258:2: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKExpressions.g:4259:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKExpressions.g:4259:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKExpressions.g:4260:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
              		
            }
            // InternalKExpressions.g:4264:3: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKExpressions.g:4265:4: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKExpressions.g:4265:4: (lv_functionName_1_0= RULE_ID )
            // InternalKExpressions.g:4266:5: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_functionName_1_0, grammarAccess.getFunctionCallAccess().getFunctionNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionCallRule());
              					}
              					setWithLastConsumed(
              						current,
              						"functionName",
              						lv_functionName_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ID");
              				
            }

            }


            }

            // InternalKExpressions.g:4282:3: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==31) ) {
                alt69=1;
            }
            else if ( (LA69_0==38) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalKExpressions.g:4283:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKExpressions.g:4283:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKExpressions.g:4284:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalKExpressions.g:4288:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKExpressions.g:4289:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKExpressions.g:4289:6: (lv_parameters_3_0= ruleParameter )
                    // InternalKExpressions.g:4290:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_35);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      							}
                      							add(
                      								current,
                      								"parameters",
                      								lv_parameters_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:4307:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==33) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalKExpressions.g:4308:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:4312:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKExpressions.g:4313:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKExpressions.g:4313:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKExpressions.g:4314:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_35);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"parameters",
                    	      									lv_parameters_5_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4338:4: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleParameter"
    // InternalKExpressions.g:4347:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKExpressions.g:4347:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKExpressions.g:4348:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalKExpressions.g:4354:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_pureOutput_0_0=null;
        Token lv_callByReference_1_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4360:2: ( ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKExpressions.g:4361:2: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKExpressions.g:4361:2: ( ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalKExpressions.g:4362:3: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalKExpressions.g:4362:3: ( ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==42) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==21) ) {
                    alt71=1;
                }
            }
            else if ( (LA71_0==21) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalKExpressions.g:4363:4: ( (lv_pureOutput_0_0= '!' ) )? ( (lv_callByReference_1_0= '&' ) )
                    {
                    // InternalKExpressions.g:4363:4: ( (lv_pureOutput_0_0= '!' ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==42) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalKExpressions.g:4364:5: (lv_pureOutput_0_0= '!' )
                            {
                            // InternalKExpressions.g:4364:5: (lv_pureOutput_0_0= '!' )
                            // InternalKExpressions.g:4365:6: lv_pureOutput_0_0= '!'
                            {
                            lv_pureOutput_0_0=(Token)match(input,42,FollowSets000.FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_pureOutput_0_0, grammarAccess.getParameterAccess().getPureOutputExclamationMarkKeyword_0_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getParameterRule());
                              						}
                              						setWithLastConsumed(current, "pureOutput", true, "!");
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalKExpressions.g:4377:4: ( (lv_callByReference_1_0= '&' ) )
                    // InternalKExpressions.g:4378:5: (lv_callByReference_1_0= '&' )
                    {
                    // InternalKExpressions.g:4378:5: (lv_callByReference_1_0= '&' )
                    // InternalKExpressions.g:4379:6: lv_callByReference_1_0= '&'
                    {
                    lv_callByReference_1_0=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_callByReference_1_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getParameterRule());
                      						}
                      						setWithLastConsumed(current, "callByReference", true, "&");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalKExpressions.g:4392:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalKExpressions.g:4393:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalKExpressions.g:4393:4: (lv_expression_2_0= ruleExpression )
            // InternalKExpressions.g:4394:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalKExpressions.g:4415:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKExpressions.g:4415:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKExpressions.g:4416:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTextExpression"


    // $ANTLR start "ruleTextExpression"
    // InternalKExpressions.g:4422:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4428:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKExpressions.g:4429:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKExpressions.g:4429:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKExpressions.g:4430:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKExpressions.g:4430:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_COMMENT_ANNOTATION||LA72_0==48) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalKExpressions.g:4431:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExpressions.g:4431:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExpressions.g:4432:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTextExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTextExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"de.cau.cs.kieler.kexpressions.KExpressions.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // InternalKExpressions.g:4449:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKExpressions.g:4450:4: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKExpressions.g:4450:4: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKExpressions.g:4451:5: lv_text_1_0= RULE_HOSTCODE
            {
            lv_text_1_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_1_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTextExpressionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.HOSTCODE");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTextExpression"


    // $ANTLR start "entryRuleIntValue"
    // InternalKExpressions.g:4471:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKExpressions.g:4471:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKExpressions.g:4472:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalKExpressions.g:4478:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4484:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKExpressions.g:4485:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKExpressions.g:4485:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalKExpressions.g:4486:3: (lv_value_0_0= RULE_INT )
            {
            // InternalKExpressions.g:4486:3: (lv_value_0_0= RULE_INT )
            // InternalKExpressions.g:4487:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.cau.cs.kieler.annotations.Annotations.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalKExpressions.g:4506:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKExpressions.g:4506:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKExpressions.g:4507:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalKExpressions.g:4513:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4519:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKExpressions.g:4520:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKExpressions.g:4520:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKExpressions.g:4521:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKExpressions.g:4521:3: (lv_value_0_0= RULE_FLOAT )
            // InternalKExpressions.g:4522:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFloatValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.cau.cs.kieler.annotations.Annotations.FLOAT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalKExpressions.g:4541:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKExpressions.g:4541:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKExpressions.g:4542:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalKExpressions.g:4548:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4554:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKExpressions.g:4555:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKExpressions.g:4555:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKExpressions.g:4556:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKExpressions.g:4556:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKExpressions.g:4557:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLEANTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBoolValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.cau.cs.kieler.annotations.Annotations.BOOLEAN");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalKExpressions.g:4576:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKExpressions.g:4576:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKExpressions.g:4577:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalKExpressions.g:4583:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4589:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKExpressions.g:4590:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKExpressions.g:4590:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKExpressions.g:4591:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalKExpressions.g:4591:3: (lv_value_0_0= RULE_STRING )
            // InternalKExpressions.g:4592:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringValueRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.cau.cs.kieler.annotations.Annotations.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVectorValue"
    // InternalKExpressions.g:4611:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKExpressions.g:4611:52: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKExpressions.g:4612:2: iv_ruleVectorValue= ruleVectorValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValue=ruleVectorValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVectorValue"


    // $ANTLR start "ruleVectorValue"
    // InternalKExpressions.g:4618:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4624:2: ( (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' ) )
            // InternalKExpressions.g:4625:2: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            {
            // InternalKExpressions.g:4625:2: (otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}' )
            // InternalKExpressions.g:4626:3: otherlv_0= '{' ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKExpressions.g:4630:3: ( (lv_values_1_0= ruleVectorValueMember ) )
            // InternalKExpressions.g:4631:4: (lv_values_1_0= ruleVectorValueMember )
            {
            // InternalKExpressions.g:4631:4: (lv_values_1_0= ruleVectorValueMember )
            // InternalKExpressions.g:4632:5: lv_values_1_0= ruleVectorValueMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
            lv_values_1_0=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVectorValueRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_1_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:4649:3: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==33) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalKExpressions.g:4650:4: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalKExpressions.g:4654:4: ( (lv_values_3_0= ruleVectorValueMember ) )
            	    // InternalKExpressions.g:4655:5: (lv_values_3_0= ruleVectorValueMember )
            	    {
            	    // InternalKExpressions.g:4655:5: (lv_values_3_0= ruleVectorValueMember )
            	    // InternalKExpressions.g:4656:6: lv_values_3_0= ruleVectorValueMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    lv_values_3_0=ruleVectorValueMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getVectorValueRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_3_0,
            	      							"de.cau.cs.kieler.kexpressions.KExpressions.VectorValueMember");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVectorValueAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVectorValue"


    // $ANTLR start "entryRuleVectorValueMember"
    // InternalKExpressions.g:4682:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKExpressions.g:4682:58: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKExpressions.g:4683:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVectorValueMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVectorValueMember=ruleVectorValueMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVectorValueMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVectorValueMember"


    // $ANTLR start "ruleVectorValueMember"
    // InternalKExpressions.g:4689:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4695:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKExpressions.g:4696:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKExpressions.g:4696:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt74=3;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // InternalKExpressions.g:4697:3: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVectorValueMemberAccess().getBoolExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4709:3: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVectorValueMemberAccess().getValuedExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedExpression_1=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:4721:3: this_IgnoreValue_2= ruleIgnoreValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVectorValueMemberAccess().getIgnoreValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IgnoreValue_2=ruleIgnoreValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IgnoreValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVectorValueMember"


    // $ANTLR start "entryRuleIgnoreValue"
    // InternalKExpressions.g:4736:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKExpressions.g:4736:52: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKExpressions.g:4737:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIgnoreValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIgnoreValue=ruleIgnoreValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIgnoreValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIgnoreValue"


    // $ANTLR start "ruleIgnoreValue"
    // InternalKExpressions.g:4743:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4749:2: ( ( () otherlv_1= '_' ) )
            // InternalKExpressions.g:4750:2: ( () otherlv_1= '_' )
            {
            // InternalKExpressions.g:4750:2: ( () otherlv_1= '_' )
            // InternalKExpressions.g:4751:3: () otherlv_1= '_'
            {
            // InternalKExpressions.g:4751:3: ()
            // InternalKExpressions.g:4752:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIgnoreValueAccess().getIgnoreValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIgnoreValueAccess().get_Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIgnoreValue"


    // $ANTLR start "entryRuleAnyValue"
    // InternalKExpressions.g:4769:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKExpressions.g:4769:49: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKExpressions.g:4770:2: iv_ruleAnyValue= ruleAnyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnyValue=ruleAnyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnyValue"


    // $ANTLR start "ruleAnyValue"
    // InternalKExpressions.g:4776:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4782:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKExpressions.g:4783:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKExpressions.g:4783:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt75=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt75=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt75=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt75=3;
                }
                break;
            case RULE_STRING:
                {
                alt75=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalKExpressions.g:4784:3: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getIntValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntValue_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:4796:3: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getFloatValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FloatValue_1=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FloatValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:4808:3: this_BoolValue_2= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getBoolValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BoolValue_2=ruleBoolValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:4820:3: this_StringValue_3= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnyValueAccess().getStringValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValue_3=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnyValue"


    // $ANTLR start "entryRuleJsonObjectValue"
    // InternalKExpressions.g:4835:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // InternalKExpressions.g:4835:56: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // InternalKExpressions.g:4836:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonObjectValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonObjectValue"


    // $ANTLR start "ruleJsonObjectValue"
    // InternalKExpressions.g:4842:1: ruleJsonObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4848:2: ( ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) )
            // InternalKExpressions.g:4849:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            {
            // InternalKExpressions.g:4849:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            // InternalKExpressions.g:4850:3: () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}'
            {
            // InternalKExpressions.g:4850:3: ()
            // InternalKExpressions.g:4851:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonObjectValueAccess().getJsonObjectValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalKExpressions.g:4864:3: ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_STRING) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalKExpressions.g:4865:4: ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    {
                    // InternalKExpressions.g:4865:4: ( (lv_members_2_0= ruleJsonObjectMember ) )
                    // InternalKExpressions.g:4866:5: (lv_members_2_0= ruleJsonObjectMember )
                    {
                    // InternalKExpressions.g:4866:5: (lv_members_2_0= ruleJsonObjectMember )
                    // InternalKExpressions.g:4867:6: lv_members_2_0= ruleJsonObjectMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_46);
                    lv_members_2_0=ruleJsonObjectMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                      						}
                      						add(
                      							current,
                      							"members",
                      							lv_members_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:4884:4: (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==33) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalKExpressions.g:4885:5: otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:4889:5: ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    // InternalKExpressions.g:4890:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    {
                    	    // InternalKExpressions.g:4890:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    // InternalKExpressions.g:4891:7: lv_members_4_0= ruleJsonObjectMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_46);
                    	    lv_members_4_0=ruleJsonObjectMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"members",
                    	      								lv_members_4_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectMember");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJsonObjectValueAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonObjectValue"


    // $ANTLR start "entryRuleJsonObjectMember"
    // InternalKExpressions.g:4918:1: entryRuleJsonObjectMember returns [EObject current=null] : iv_ruleJsonObjectMember= ruleJsonObjectMember EOF ;
    public final EObject entryRuleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectMember = null;


        try {
            // InternalKExpressions.g:4918:57: (iv_ruleJsonObjectMember= ruleJsonObjectMember EOF )
            // InternalKExpressions.g:4919:2: iv_ruleJsonObjectMember= ruleJsonObjectMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonObjectMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonObjectMember=ruleJsonObjectMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonObjectMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonObjectMember"


    // $ANTLR start "ruleJsonObjectMember"
    // InternalKExpressions.g:4925:1: ruleJsonObjectMember returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) ;
    public final EObject ruleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4931:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) )
            // InternalKExpressions.g:4932:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            {
            // InternalKExpressions.g:4932:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            // InternalKExpressions.g:4933:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) )
            {
            // InternalKExpressions.g:4933:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalKExpressions.g:4934:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalKExpressions.g:4934:4: (lv_key_0_0= RULE_STRING )
            // InternalKExpressions.g:4935:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getJsonObjectMemberAccess().getKeySTRINGTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getJsonObjectMemberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"de.cau.cs.kieler.annotations.Annotations.STRING");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectMemberAccess().getColonKeyword_1());
              		
            }
            // InternalKExpressions.g:4955:3: ( (lv_value_2_0= ruleJsonValue ) )
            // InternalKExpressions.g:4956:4: (lv_value_2_0= ruleJsonValue )
            {
            // InternalKExpressions.g:4956:4: (lv_value_2_0= ruleJsonValue )
            // InternalKExpressions.g:4957:5: lv_value_2_0= ruleJsonValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonObjectMemberAccess().getValueJsonValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonObjectMemberRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonObjectMember"


    // $ANTLR start "entryRuleJsonArrayValue"
    // InternalKExpressions.g:4978:1: entryRuleJsonArrayValue returns [EObject current=null] : iv_ruleJsonArrayValue= ruleJsonArrayValue EOF ;
    public final EObject entryRuleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArrayValue = null;


        try {
            // InternalKExpressions.g:4978:55: (iv_ruleJsonArrayValue= ruleJsonArrayValue EOF )
            // InternalKExpressions.g:4979:2: iv_ruleJsonArrayValue= ruleJsonArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonArrayValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonArrayValue=ruleJsonArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonArrayValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonArrayValue"


    // $ANTLR start "ruleJsonArrayValue"
    // InternalKExpressions.g:4985:1: ruleJsonArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4991:2: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) )
            // InternalKExpressions.g:4992:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalKExpressions.g:4992:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            // InternalKExpressions.g:4993:3: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']'
            {
            // InternalKExpressions.g:4993:3: ()
            // InternalKExpressions.g:4994:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJsonArrayValueAccess().getJsonArrayValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalKExpressions.g:5007:3: ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_STRING)||LA79_0==35||LA79_0==43||LA79_0==46) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalKExpressions.g:5008:4: ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    {
                    // InternalKExpressions.g:5008:4: ( (lv_elements_2_0= ruleJsonValue ) )
                    // InternalKExpressions.g:5009:5: (lv_elements_2_0= ruleJsonValue )
                    {
                    // InternalKExpressions.g:5009:5: (lv_elements_2_0= ruleJsonValue )
                    // InternalKExpressions.g:5010:6: lv_elements_2_0= ruleJsonValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_51);
                    lv_elements_2_0=ruleJsonValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getJsonArrayValueRule());
                      						}
                      						add(
                      							current,
                      							"elements",
                      							lv_elements_2_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:5027:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==33) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalKExpressions.g:5028:5: otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:5032:5: ( (lv_elements_4_0= ruleJsonValue ) )
                    	    // InternalKExpressions.g:5033:6: (lv_elements_4_0= ruleJsonValue )
                    	    {
                    	    // InternalKExpressions.g:5033:6: (lv_elements_4_0= ruleJsonValue )
                    	    // InternalKExpressions.g:5034:7: lv_elements_4_0= ruleJsonValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_51);
                    	    lv_elements_4_0=ruleJsonValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getJsonArrayValueRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"elements",
                    	      								lv_elements_4_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.JsonValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getJsonArrayValueAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonArrayValue"


    // $ANTLR start "entryRuleJsonValue"
    // InternalKExpressions.g:5061:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // InternalKExpressions.g:5061:50: (iv_ruleJsonValue= ruleJsonValue EOF )
            // InternalKExpressions.g:5062:2: iv_ruleJsonValue= ruleJsonValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonValue=ruleJsonValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonValue"


    // $ANTLR start "ruleJsonValue"
    // InternalKExpressions.g:5068:1: ruleJsonValue returns [EObject current=null] : (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObjectValue_0 = null;

        EObject this_JsonArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_AnyValue_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5074:2: ( (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) )
            // InternalKExpressions.g:5075:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            {
            // InternalKExpressions.g:5075:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            int alt80=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt80=1;
                }
                break;
            case 35:
                {
                alt80=2;
                }
                break;
            case 46:
                {
                alt80=3;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalKExpressions.g:5076:3: this_JsonObjectValue_0= ruleJsonObjectValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonObjectValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonObjectValue_0=ruleJsonObjectValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonObjectValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5088:3: this_JsonArrayValue_1= ruleJsonArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getJsonArrayValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonArrayValue_1=ruleJsonArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonArrayValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:5100:3: this_NullValue_2= ruleNullValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getNullValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullValue_2=ruleNullValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:5112:3: this_AnyValue_3= ruleAnyValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getJsonValueAccess().getAnyValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AnyValue_3=ruleAnyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AnyValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonValue"


    // $ANTLR start "entryRuleNullValue"
    // InternalKExpressions.g:5127:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalKExpressions.g:5127:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalKExpressions.g:5128:2: iv_ruleNullValue= ruleNullValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullValue=ruleNullValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullValue"


    // $ANTLR start "ruleNullValue"
    // InternalKExpressions.g:5134:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5140:2: ( ( () otherlv_1= 'null' ) )
            // InternalKExpressions.g:5141:2: ( () otherlv_1= 'null' )
            {
            // InternalKExpressions.g:5141:2: ( () otherlv_1= 'null' )
            // InternalKExpressions.g:5142:3: () otherlv_1= 'null'
            {
            // InternalKExpressions.g:5142:3: ()
            // InternalKExpressions.g:5143:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullValueAccess().getNullValueAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullValueAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullValue"


    // $ANTLR start "entryRuleJsonPragma"
    // InternalKExpressions.g:5160:1: entryRuleJsonPragma returns [EObject current=null] : iv_ruleJsonPragma= ruleJsonPragma EOF ;
    public final EObject entryRuleJsonPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPragma = null;


        try {
            // InternalKExpressions.g:5160:51: (iv_ruleJsonPragma= ruleJsonPragma EOF )
            // InternalKExpressions.g:5161:2: iv_ruleJsonPragma= ruleJsonPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonPragma=ruleJsonPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonPragma; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonPragma"


    // $ANTLR start "ruleJsonPragma"
    // InternalKExpressions.g:5167:1: ruleJsonPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5173:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKExpressions.g:5174:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKExpressions.g:5174:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKExpressions.g:5175:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKExpressions.g:5179:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5180:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5180:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5181:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonPragmaRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5198:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKExpressions.g:5199:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKExpressions.g:5199:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKExpressions.g:5200:5: lv_value_2_0= ruleJsonObjectValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonPragmaAccess().getValueJsonObjectValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonPragmaRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonPragma"


    // $ANTLR start "entryRuleJsonAnnotation"
    // InternalKExpressions.g:5221:1: entryRuleJsonAnnotation returns [EObject current=null] : iv_ruleJsonAnnotation= ruleJsonAnnotation EOF ;
    public final EObject entryRuleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonAnnotation = null;


        try {
            // InternalKExpressions.g:5221:55: (iv_ruleJsonAnnotation= ruleJsonAnnotation EOF )
            // InternalKExpressions.g:5222:2: iv_ruleJsonAnnotation= ruleJsonAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJsonAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleJsonAnnotation=ruleJsonAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJsonAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJsonAnnotation"


    // $ANTLR start "ruleJsonAnnotation"
    // InternalKExpressions.g:5228:1: ruleJsonAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5234:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKExpressions.g:5235:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKExpressions.g:5235:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKExpressions.g:5236:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5240:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5241:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5241:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5242:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5259:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKExpressions.g:5260:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKExpressions.g:5260:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKExpressions.g:5261:5: lv_value_2_0= ruleJsonObjectValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonAnnotationAccess().getValueJsonObjectValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getJsonAnnotationRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.JsonObjectValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJsonAnnotation"


    // $ANTLR start "entryRuleAnnotation"
    // InternalKExpressions.g:5282:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKExpressions.g:5282:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKExpressions.g:5283:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalKExpressions.g:5289:1: ruleAnnotation returns [EObject current=null] : (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_0 = null;

        EObject this_JsonAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5295:2: ( (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) )
            // InternalKExpressions.g:5296:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            {
            // InternalKExpressions.g:5296:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // InternalKExpressions.g:5297:3: this_Annotation_0= superAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Annotation_0=superAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Annotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5309:3: this_JsonAnnotation_1= ruleJsonAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationAccess().getJsonAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_JsonAnnotation_1=ruleJsonAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JsonAnnotation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entrySuperAnnotation"
    // InternalKExpressions.g:5324:1: entrySuperAnnotation returns [EObject current=null] : iv_superAnnotation= superAnnotation EOF ;
    public final EObject entrySuperAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superAnnotation = null;


        try {
            // InternalKExpressions.g:5324:52: (iv_superAnnotation= superAnnotation EOF )
            // InternalKExpressions.g:5325:2: iv_superAnnotation= superAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superAnnotation=superAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entrySuperAnnotation"


    // $ANTLR start "superAnnotation"
    // InternalKExpressions.g:5331:1: superAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5337:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKExpressions.g:5338:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKExpressions.g:5338:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt82=4;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // InternalKExpressions.g:5339:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CommentAnnotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5351:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_KeyStringValueAnnotation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:5363:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedKeyStringValueAnnotation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:5375:3: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsAnnotationAccess().getTagAnnotationParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TagAnnotation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "superAnnotation"


    // $ANTLR start "entrySuperPragma"
    // InternalKExpressions.g:5390:1: entrySuperPragma returns [EObject current=null] : iv_superPragma= superPragma EOF ;
    public final EObject entrySuperPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_superPragma = null;


        try {
            // InternalKExpressions.g:5390:48: (iv_superPragma= superPragma EOF )
            // InternalKExpressions.g:5391:2: iv_superPragma= superPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superPragma=superPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superPragma; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entrySuperPragma"


    // $ANTLR start "superPragma"
    // InternalKExpressions.g:5397:1: superPragma returns [EObject current=null] : (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) ;
    public final EObject superPragma() throws RecognitionException {
        EObject current = null;

        EObject this_StringPragma_0 = null;

        EObject this_PragmaTag_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5403:2: ( (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) )
            // InternalKExpressions.g:5404:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            {
            // InternalKExpressions.g:5404:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // InternalKExpressions.g:5405:3: this_StringPragma_0= ruleStringPragma
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsPragmaAccess().getStringPragmaParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringPragma_0=ruleStringPragma();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringPragma_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5417:3: this_PragmaTag_1= rulePragmaTag
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsPragmaAccess().getPragmaTagParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PragmaTag_1=rulePragmaTag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PragmaTag_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "superPragma"


    // $ANTLR start "entrySuperValuedAnnotation"
    // InternalKExpressions.g:5432:1: entrySuperValuedAnnotation returns [EObject current=null] : iv_superValuedAnnotation= superValuedAnnotation EOF ;
    public final EObject entrySuperValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superValuedAnnotation = null;


        try {
            // InternalKExpressions.g:5432:58: (iv_superValuedAnnotation= superValuedAnnotation EOF )
            // InternalKExpressions.g:5433:2: iv_superValuedAnnotation= superValuedAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superValuedAnnotation=superValuedAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superValuedAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entrySuperValuedAnnotation"


    // $ANTLR start "superValuedAnnotation"
    // InternalKExpressions.g:5439:1: superValuedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) ;
    public final EObject superValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5445:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) )
            // InternalKExpressions.g:5446:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            {
            // InternalKExpressions.g:5446:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            int alt84=3;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalKExpressions.g:5447:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CommentAnnotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5459:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_KeyStringValueAnnotation_1=ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_KeyStringValueAnnotation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:5471:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsValuedAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedKeyStringValueAnnotation_2=ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedKeyStringValueAnnotation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "superValuedAnnotation"


    // $ANTLR start "entrySuperQuotedStringAnnotation"
    // InternalKExpressions.g:5486:1: entrySuperQuotedStringAnnotation returns [EObject current=null] : iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF ;
    public final EObject entrySuperQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superQuotedStringAnnotation = null;


        try {
            // InternalKExpressions.g:5486:64: (iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF )
            // InternalKExpressions.g:5487:2: iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_superQuotedStringAnnotation=superQuotedStringAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_superQuotedStringAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entrySuperQuotedStringAnnotation"


    // $ANTLR start "superQuotedStringAnnotation"
    // InternalKExpressions.g:5493:1: superQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5499:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKExpressions.g:5500:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKExpressions.g:5500:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt85=4;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // InternalKExpressions.g:5501:3: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getCommentAnnotationParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CommentAnnotation_0=ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CommentAnnotation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5513:3: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getQuotedKeyStringValueAnnotationParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedKeyStringValueAnnotation_1=ruleQuotedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QuotedKeyStringValueAnnotation_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:5525:3: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getQuotedTypedKeyStringValueAnnotationParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QuotedTypedKeyStringValueAnnotation_2=ruleQuotedTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QuotedTypedKeyStringValueAnnotation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:5537:3: this_TagAnnotation_3= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAnnotationsQuotedStringAnnotationAccess().getTagAnnotationParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TagAnnotation_3=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TagAnnotation_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "superQuotedStringAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // InternalKExpressions.g:5552:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKExpressions.g:5552:58: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKExpressions.g:5553:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // InternalKExpressions.g:5559:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5565:2: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKExpressions.g:5566:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKExpressions.g:5566:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:5567:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:5567:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:5568:4: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_values_0_0, grammarAccess.getCommentAnnotationAccess().getValuesCOMMENT_ANNOTATIONTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getCommentAnnotationRule());
              				}
              				addWithLastConsumed(
              					current,
              					"values",
              					lv_values_0_0,
              					"de.cau.cs.kieler.annotations.Annotations.COMMENT_ANNOTATION");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // InternalKExpressions.g:5587:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKExpressions.g:5587:54: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKExpressions.g:5588:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // InternalKExpressions.g:5594:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5600:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKExpressions.g:5601:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKExpressions.g:5601:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKExpressions.g:5602:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5606:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5607:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5607:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5608:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRulePragmaTag"
    // InternalKExpressions.g:5629:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKExpressions.g:5629:50: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKExpressions.g:5630:2: iv_rulePragmaTag= rulePragmaTag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPragmaTagRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePragmaTag=rulePragmaTag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePragmaTag; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePragmaTag"


    // $ANTLR start "rulePragmaTag"
    // InternalKExpressions.g:5636:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5642:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKExpressions.g:5643:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKExpressions.g:5643:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKExpressions.g:5644:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKExpressions.g:5648:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5649:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5649:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5650:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPragmaTagAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPragmaTagRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePragmaTag"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // InternalKExpressions.g:5671:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5671:65: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5672:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // InternalKExpressions.g:5678:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5684:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExpressions.g:5685:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExpressions.g:5685:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKExpressions.g:5686:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5690:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5691:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5691:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5692:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5709:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKExpressions.g:5710:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKExpressions.g:5710:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKExpressions.g:5711:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_2_0,
              						"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5728:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==33) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalKExpressions.g:5729:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5733:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKExpressions.g:5734:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExpressions.g:5734:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKExpressions.g:5735:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_4_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedKeyStringValueAnnotation"
    // InternalKExpressions.g:5757:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5757:75: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5758:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedKeyStringValueAnnotation=ruleRestrictedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedKeyStringValueAnnotation"
    // InternalKExpressions.g:5764:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5770:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKExpressions.g:5771:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKExpressions.g:5771:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKExpressions.g:5772:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5776:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5777:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5777:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5778:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5795:3: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKExpressions.g:5796:4: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKExpressions.g:5796:4: (lv_values_2_0= ruleEStringBoolean )
            // InternalKExpressions.g:5797:5: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_values_2_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_2_0,
              						"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5814:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==33) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalKExpressions.g:5815:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5819:4: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKExpressions.g:5820:5: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKExpressions.g:5820:5: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKExpressions.g:5821:6: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_values_4_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRestrictedKeyStringValueAnnotationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_4_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRestrictedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleStringPragma"
    // InternalKExpressions.g:5843:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKExpressions.g:5843:53: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKExpressions.g:5844:2: iv_ruleStringPragma= ruleStringPragma EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringPragmaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringPragma=ruleStringPragma();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringPragma; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringPragma"


    // $ANTLR start "ruleStringPragma"
    // InternalKExpressions.g:5850:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5856:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExpressions.g:5857:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExpressions.g:5857:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKExpressions.g:5858:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKExpressions.g:5862:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5863:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5863:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5864:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5881:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKExpressions.g:5882:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKExpressions.g:5882:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKExpressions.g:5883:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_values_2_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringPragmaRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_2_0,
              						"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:5900:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==33) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalKExpressions.g:5901:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5905:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKExpressions.g:5906:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExpressions.g:5906:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKExpressions.g:5907:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_values_4_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getStringPragmaRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_4_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringPragma"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:5929:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5929:70: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5930:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:5936:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5942:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExpressions.g:5943:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExpressions.g:5943:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKExpressions.g:5944:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5948:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5949:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5949:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5950:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKExpressions.g:5971:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExpressions.g:5972:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5972:4: (lv_type_3_0= ruleExtendedID )
            // InternalKExpressions.g:5973:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKExpressions.g:5994:3: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKExpressions.g:5995:4: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKExpressions.g:5995:4: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKExpressions.g:5996:5: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_values_5_0=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_5_0,
              						"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:6013:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==33) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalKExpressions.g:6014:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKExpressions.g:6018:4: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKExpressions.g:6019:5: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExpressions.g:6019:5: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKExpressions.g:6020:6: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_values_7_0=ruleEStringAllTypes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_7_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.EStringAllTypes");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleRestrictedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:6042:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:6042:80: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:6043:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedTypedKeyStringValueAnnotation=ruleRestrictedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleRestrictedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:6049:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        AntlrDatatypeRuleToken lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:6055:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKExpressions.g:6056:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKExpressions.g:6056:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKExpressions.g:6057:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:6061:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:6062:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:6062:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:6063:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKExpressions.g:6084:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExpressions.g:6085:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExpressions.g:6085:4: (lv_type_3_0= ruleExtendedID )
            // InternalKExpressions.g:6086:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKExpressions.g:6107:3: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKExpressions.g:6108:4: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKExpressions.g:6108:4: (lv_values_5_0= ruleEStringBoolean )
            // InternalKExpressions.g:6109:5: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_54);
            lv_values_5_0=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
              					}
              					add(
              						current,
              						"values",
              						lv_values_5_0,
              						"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:6126:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==33) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalKExpressions.g:6127:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKExpressions.g:6131:4: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKExpressions.g:6132:5: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKExpressions.g:6132:5: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKExpressions.g:6133:6: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    lv_values_7_0=ruleEStringBoolean();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getRestrictedTypedKeyStringValueAnnotationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"values",
            	      							lv_values_7_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.EStringBoolean");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRestrictedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedKeyStringValueAnnotation"
    // InternalKExpressions.g:6155:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:6155:71: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:6156:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedKeyStringValueAnnotation=ruleQuotedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuotedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedKeyStringValueAnnotation"
    // InternalKExpressions.g:6162:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:6168:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKExpressions.g:6169:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKExpressions.g:6169:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKExpressions.g:6170:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:6174:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:6175:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:6175:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:6176:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_48);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:6193:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKExpressions.g:6194:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalKExpressions.g:6194:4: (lv_values_2_0= RULE_STRING )
            // InternalKExpressions.g:6195:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_values_2_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
              					}
              					addWithLastConsumed(
              						current,
              						"values",
              						lv_values_2_0,
              						"de.cau.cs.kieler.annotations.Annotations.STRING");
              				
            }

            }


            }

            // InternalKExpressions.g:6211:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==33) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalKExpressions.g:6212:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:6216:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKExpressions.g:6217:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKExpressions.g:6217:5: (lv_values_4_0= RULE_STRING )
            	    // InternalKExpressions.g:6218:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_values_4_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getQuotedKeyStringValueAnnotationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"values",
            	      							lv_values_4_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuotedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleQuotedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:6239:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:6239:76: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:6240:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQuotedTypedKeyStringValueAnnotation=ruleQuotedTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuotedTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleQuotedTypedKeyStringValueAnnotation"
    // InternalKExpressions.g:6246:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token lv_values_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:6252:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKExpressions.g:6253:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKExpressions.g:6253:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKExpressions.g:6254:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:6258:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:6259:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:6259:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:6260:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKExpressions.g:6281:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExpressions.g:6282:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExpressions.g:6282:4: (lv_type_3_0= ruleExtendedID )
            // InternalKExpressions.g:6283:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_type_3_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"de.cau.cs.kieler.annotations.Annotations.ExtendedID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKExpressions.g:6304:3: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKExpressions.g:6305:4: (lv_values_5_0= RULE_STRING )
            {
            // InternalKExpressions.g:6305:4: (lv_values_5_0= RULE_STRING )
            // InternalKExpressions.g:6306:5: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_values_5_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
              					}
              					addWithLastConsumed(
              						current,
              						"values",
              						lv_values_5_0,
              						"de.cau.cs.kieler.annotations.Annotations.STRING");
              				
            }

            }


            }

            // InternalKExpressions.g:6322:3: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==33) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalKExpressions.g:6323:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKExpressions.g:6327:4: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKExpressions.g:6328:5: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKExpressions.g:6328:5: (lv_values_7_0= RULE_STRING )
            	    // InternalKExpressions.g:6329:6: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_values_7_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getQuotedTypedKeyStringValueAnnotationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"values",
            	      							lv_values_7_0,
            	      							"de.cau.cs.kieler.annotations.Annotations.STRING");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuotedTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleEStringBoolean"
    // InternalKExpressions.g:6350:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKExpressions.g:6350:54: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKExpressions.g:6351:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringBoolean=ruleEStringBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEStringBoolean"


    // $ANTLR start "ruleEStringBoolean"
    // InternalKExpressions.g:6357:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:6363:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKExpressions.g:6364:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKExpressions.g:6364:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt93=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt93=1;
                }
                break;
            case RULE_ID:
                {
                alt93=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt93=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalKExpressions.g:6365:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringBooleanAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:6373:3: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEStringBooleanAccess().getExtendedIDParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ExtendedID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:6384:3: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BOOLEAN_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringBooleanAccess().getBOOLEANTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEStringBoolean"


    // $ANTLR start "entryRuleEStringAllTypes"
    // InternalKExpressions.g:6395:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKExpressions.g:6395:55: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKExpressions.g:6396:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringAllTypesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEStringAllTypes=ruleEStringAllTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStringAllTypes.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEStringAllTypes"


    // $ANTLR start "ruleEStringAllTypes"
    // InternalKExpressions.g:6402:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:6408:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKExpressions.g:6409:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKExpressions.g:6409:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt94=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt94=1;
                }
                break;
            case RULE_ID:
                {
                alt94=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt94=3;
                }
                break;
            case 26:
                {
                int LA94_4 = input.LA(2);

                if ( (LA94_4==RULE_INT) ) {
                    alt94=4;
                }
                else if ( (LA94_4==RULE_FLOAT) ) {
                    alt94=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt94=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt94=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalKExpressions.g:6410:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAllTypesAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:6418:3: this_ExtendedID_1= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEStringAllTypesAccess().getExtendedIDParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExtendedID_1=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ExtendedID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:6429:3: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_BOOLEAN_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_BOOLEAN_2, grammarAccess.getEStringAllTypesAccess().getBOOLEANTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:6437:3: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEStringAllTypesAccess().getIntegerParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Integer_3=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Integer_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:6448:3: this_Floateger_4= ruleFloateger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEStringAllTypesAccess().getFloategerParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Floateger_4=ruleFloateger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Floateger_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEStringAllTypes"


    // $ANTLR start "entryRuleExtendedID"
    // InternalKExpressions.g:6462:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKExpressions.g:6462:50: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKExpressions.g:6463:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // InternalKExpressions.g:6469:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6475:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKExpressions.g:6476:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKExpressions.g:6476:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKExpressions.g:6477:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKExpressions.g:6484:3: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==26) ) {
                    int LA96_2 = input.LA(2);

                    if ( (LA96_2==RULE_ID) ) {
                        alt96=1;
                    }


                }
                else if ( (LA96_0==37) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalKExpressions.g:6485:4: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKExpressions.g:6485:4: (kw= '.' | kw= '-' )
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==37) ) {
            	        alt95=1;
            	    }
            	    else if ( (LA95_0==26) ) {
            	        alt95=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 95, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalKExpressions.g:6486:5: kw= '.'
            	            {
            	            kw=(Token)match(input,37,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKExpressions.g:6492:5: kw= '-'
            	            {
            	            kw=(Token)match(input,26,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            // InternalKExpressions.g:6506:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==47) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalKExpressions.g:6507:4: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getExtendedIDAccess().getNumberSignKeyword_2_0());
                      			
                    }
                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_5, grammarAccess.getExtendedIDAccess().getINTTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // InternalKExpressions.g:6524:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKExpressions.g:6524:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalKExpressions.g:6525:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalKExpressions.g:6531:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6537:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKExpressions.g:6538:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKExpressions.g:6538:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKExpressions.g:6539:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKExpressions.g:6539:3: (kw= '-' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==26) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalKExpressions.g:6540:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleFloateger"
    // InternalKExpressions.g:6557:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKExpressions.g:6557:49: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKExpressions.g:6558:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloateger"


    // $ANTLR start "ruleFloateger"
    // InternalKExpressions.g:6564:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6570:2: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKExpressions.g:6571:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKExpressions.g:6571:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKExpressions.g:6572:3: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKExpressions.g:6572:3: (kw= '-' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==26) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalKExpressions.g:6573:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_FLOAT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_FLOAT_1, grammarAccess.getFloategerAccess().getFLOATTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFloateger"


    // $ANTLR start "ruleCompareOperator"
    // InternalKExpressions.g:6590:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6596:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKExpressions.g:6597:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKExpressions.g:6597:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt100=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt100=1;
                }
                break;
            case 50:
                {
                alt100=2;
                }
                break;
            case 51:
                {
                alt100=3;
                }
                break;
            case 52:
                {
                alt100=4;
                }
                break;
            case 53:
                {
                alt100=5;
                }
                break;
            case 54:
                {
                alt100=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalKExpressions.g:6598:3: (enumLiteral_0= '==' )
                    {
                    // InternalKExpressions.g:6598:3: (enumLiteral_0= '==' )
                    // InternalKExpressions.g:6599:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:6606:3: (enumLiteral_1= '<' )
                    {
                    // InternalKExpressions.g:6606:3: (enumLiteral_1= '<' )
                    // InternalKExpressions.g:6607:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:6614:3: (enumLiteral_2= '<=' )
                    {
                    // InternalKExpressions.g:6614:3: (enumLiteral_2= '<=' )
                    // InternalKExpressions.g:6615:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:6622:3: (enumLiteral_3= '>' )
                    {
                    // InternalKExpressions.g:6622:3: (enumLiteral_3= '>' )
                    // InternalKExpressions.g:6623:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:6630:3: (enumLiteral_4= '>=' )
                    {
                    // InternalKExpressions.g:6630:3: (enumLiteral_4= '>=' )
                    // InternalKExpressions.g:6631:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:6638:3: (enumLiteral_5= '!=' )
                    {
                    // InternalKExpressions.g:6638:3: (enumLiteral_5= '!=' )
                    // InternalKExpressions.g:6639:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rulePreOperator"
    // InternalKExpressions.g:6649:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6655:2: ( (enumLiteral_0= 'pre' ) )
            // InternalKExpressions.g:6656:2: (enumLiteral_0= 'pre' )
            {
            // InternalKExpressions.g:6656:2: (enumLiteral_0= 'pre' )
            // InternalKExpressions.g:6657:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePreOperator"


    // $ANTLR start "ruleBitwiseNotOperator"
    // InternalKExpressions.g:6666:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6672:2: ( (enumLiteral_0= '~' ) )
            // InternalKExpressions.g:6673:2: (enumLiteral_0= '~' )
            {
            // InternalKExpressions.g:6673:2: (enumLiteral_0= '~' )
            // InternalKExpressions.g:6674:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBitwiseNotOperatorAccess().getBITWISE_NOTEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseNotOperator"


    // $ANTLR start "ruleBitwiseXOrOperator"
    // InternalKExpressions.g:6683:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6689:2: ( (enumLiteral_0= '^' ) )
            // InternalKExpressions.g:6690:2: (enumLiteral_0= '^' )
            {
            // InternalKExpressions.g:6690:2: (enumLiteral_0= '^' )
            // InternalKExpressions.g:6691:3: enumLiteral_0= '^'
            {
            enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBitwiseXOrOperatorAccess().getBITWISE_XOREnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseXOrOperator"


    // $ANTLR start "ruleBitwiseOrOperator"
    // InternalKExpressions.g:6700:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6706:2: ( (enumLiteral_0= '|' ) )
            // InternalKExpressions.g:6707:2: (enumLiteral_0= '|' )
            {
            // InternalKExpressions.g:6707:2: (enumLiteral_0= '|' )
            // InternalKExpressions.g:6708:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBitwiseOrOperatorAccess().getBITWISE_OREnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseOrOperator"


    // $ANTLR start "ruleBitwiseAndOperator"
    // InternalKExpressions.g:6717:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6723:2: ( (enumLiteral_0= '&' ) )
            // InternalKExpressions.g:6724:2: (enumLiteral_0= '&' )
            {
            // InternalKExpressions.g:6724:2: (enumLiteral_0= '&' )
            // InternalKExpressions.g:6725:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBitwiseAndOperatorAccess().getBITWISE_ANDEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBitwiseAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalKExpressions.g:6734:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6740:2: ( (enumLiteral_0= '!' ) )
            // InternalKExpressions.g:6741:2: (enumLiteral_0= '!' )
            {
            // InternalKExpressions.g:6741:2: (enumLiteral_0= '!' )
            // InternalKExpressions.g:6742:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalKExpressions.g:6751:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6757:2: ( (enumLiteral_0= '+' ) )
            // InternalKExpressions.g:6758:2: (enumLiteral_0= '+' )
            {
            // InternalKExpressions.g:6758:2: (enumLiteral_0= '+' )
            // InternalKExpressions.g:6759:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleSubOperator"
    // InternalKExpressions.g:6768:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6774:2: ( (enumLiteral_0= '-' ) )
            // InternalKExpressions.g:6775:2: (enumLiteral_0= '-' )
            {
            // InternalKExpressions.g:6775:2: (enumLiteral_0= '-' )
            // InternalKExpressions.g:6776:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSubOperator"


    // $ANTLR start "ruleMultOperator"
    // InternalKExpressions.g:6785:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6791:2: ( (enumLiteral_0= '*' ) )
            // InternalKExpressions.g:6792:2: (enumLiteral_0= '*' )
            {
            // InternalKExpressions.g:6792:2: (enumLiteral_0= '*' )
            // InternalKExpressions.g:6793:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultOperator"


    // $ANTLR start "ruleModOperator"
    // InternalKExpressions.g:6802:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6808:2: ( (enumLiteral_0= '%' ) )
            // InternalKExpressions.g:6809:2: (enumLiteral_0= '%' )
            {
            // InternalKExpressions.g:6809:2: (enumLiteral_0= '%' )
            // InternalKExpressions.g:6810:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModOperator"


    // $ANTLR start "ruleDivOperator"
    // InternalKExpressions.g:6819:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6825:2: ( (enumLiteral_0= '/' ) )
            // InternalKExpressions.g:6826:2: (enumLiteral_0= '/' )
            {
            // InternalKExpressions.g:6826:2: (enumLiteral_0= '/' )
            // InternalKExpressions.g:6827:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDivOperator"


    // $ANTLR start "ruleValOperator"
    // InternalKExpressions.g:6836:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6842:2: ( (enumLiteral_0= 'val' ) )
            // InternalKExpressions.g:6843:2: (enumLiteral_0= 'val' )
            {
            // InternalKExpressions.g:6843:2: (enumLiteral_0= 'val' )
            // InternalKExpressions.g:6844:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalKExpressions.g:6853:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6859:2: ( (enumLiteral_0= '||' ) )
            // InternalKExpressions.g:6860:2: (enumLiteral_0= '||' )
            {
            // InternalKExpressions.g:6860:2: (enumLiteral_0= '||' )
            // InternalKExpressions.g:6861:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getLOGICAL_OREnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalKExpressions.g:6870:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6876:2: ( (enumLiteral_0= '&&' ) )
            // InternalKExpressions.g:6877:2: (enumLiteral_0= '&&' )
            {
            // InternalKExpressions.g:6877:2: (enumLiteral_0= '&&' )
            // InternalKExpressions.g:6878:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getLOGICAL_ANDEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleShiftLeftOperator"
    // InternalKExpressions.g:6887:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6893:2: ( (enumLiteral_0= '<<' ) )
            // InternalKExpressions.g:6894:2: (enumLiteral_0= '<<' )
            {
            // InternalKExpressions.g:6894:2: (enumLiteral_0= '<<' )
            // InternalKExpressions.g:6895:3: enumLiteral_0= '<<'
            {
            enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShiftLeftOperatorAccess().getSHIFT_LEFTEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftLeftOperator"


    // $ANTLR start "ruleShiftRightOperator"
    // InternalKExpressions.g:6904:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6910:2: ( (enumLiteral_0= '>>' ) )
            // InternalKExpressions.g:6911:2: (enumLiteral_0= '>>' )
            {
            // InternalKExpressions.g:6911:2: (enumLiteral_0= '>>' )
            // InternalKExpressions.g:6912:3: enumLiteral_0= '>>'
            {
            enumLiteral_0=(Token)match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShiftRightOperatorAccess().getSHIFT_RIGHTEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftRightOperator"


    // $ANTLR start "ruleShiftRightUnsignedOperator"
    // InternalKExpressions.g:6921:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6927:2: ( (enumLiteral_0= '>>>' ) )
            // InternalKExpressions.g:6928:2: (enumLiteral_0= '>>>' )
            {
            // InternalKExpressions.g:6928:2: (enumLiteral_0= '>>>' )
            // InternalKExpressions.g:6929:3: enumLiteral_0= '>>>'
            {
            enumLiteral_0=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getShiftRightUnsignedOperatorAccess().getSHIFT_RIGHT_UNSIGNEDEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShiftRightUnsignedOperator"


    // $ANTLR start "ruleConditionalOperator"
    // InternalKExpressions.g:6938:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6944:2: ( (enumLiteral_0= '?' ) )
            // InternalKExpressions.g:6945:2: (enumLiteral_0= '?' )
            {
            // InternalKExpressions.g:6945:2: (enumLiteral_0= '?' )
            // InternalKExpressions.g:6946:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getConditionalOperatorAccess().getCONDITIONALEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConditionalOperator"


    // $ANTLR start "ruleFBYOperator"
    // InternalKExpressions.g:6955:1: ruleFBYOperator returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleFBYOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6961:2: ( (enumLiteral_0= '->' ) )
            // InternalKExpressions.g:6962:2: (enumLiteral_0= '->' )
            {
            // InternalKExpressions.g:6962:2: (enumLiteral_0= '->' )
            // InternalKExpressions.g:6963:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getFBYOperatorAccess().getFBYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getFBYOperatorAccess().getFBYEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFBYOperator"

    // $ANTLR start synpred1_InternalKExpressions
    public final void synpred1_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKExpressions.g:114:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKExpressions.g:114:3: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKExpressions

    // $ANTLR start synpred13_InternalKExpressions
    public final void synpred13_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // InternalKExpressions.g:799:3: (this_ValuedExpression_0= ruleValuedExpression )
        // InternalKExpressions.g:799:3: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalKExpressions

    // $ANTLR start synpred22_InternalKExpressions
    public final void synpred22_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1360:6: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1360:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        {
        otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1364:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        // InternalKExpressions.g:1365:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        {
        // InternalKExpressions.g:1365:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        // InternalKExpressions.g:1366:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalKExpressions

    // $ANTLR start synpred23_InternalKExpressions
    public final void synpred23_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1308:4: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) )
        // InternalKExpressions.g:1308:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
        {
        // InternalKExpressions.g:1308:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
        // InternalKExpressions.g:1309:5: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
        {
        // InternalKExpressions.g:1309:5: ()
        // InternalKExpressions.g:1310:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:1319:5: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1320:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
        {
        // InternalKExpressions.g:1320:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
        // InternalKExpressions.g:1321:7: (lv_operator_2_0= ruleShiftLeftOperator )
        {
        // InternalKExpressions.g:1321:7: (lv_operator_2_0= ruleShiftLeftOperator )
        // InternalKExpressions.g:1322:8: lv_operator_2_0= ruleShiftLeftOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_2_0=ruleShiftLeftOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:1339:6: ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
        // InternalKExpressions.g:1340:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
        {
        // InternalKExpressions.g:1340:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
        // InternalKExpressions.g:1341:8: lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_12);
        lv_subExpressions_3_0=ruleShiftRightRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:1359:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
        loop109:
        do {
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==22) ) {
                alt109=1;
            }


            switch (alt109) {
        	case 1 :
        	    // InternalKExpressions.g:1360:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:1364:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        	    // InternalKExpressions.g:1365:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        	    {
        	    // InternalKExpressions.g:1365:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        	    // InternalKExpressions.g:1366:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_12);
        	    lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop109;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred23_InternalKExpressions

    // $ANTLR start synpred24_InternalKExpressions
    public final void synpred24_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1438:6: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1438:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
        {
        otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1442:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
        // InternalKExpressions.g:1443:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
        {
        // InternalKExpressions.g:1443:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
        // InternalKExpressions.g:1444:8: lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleShiftLeftRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24_InternalKExpressions

    // $ANTLR start synpred25_InternalKExpressions
    public final void synpred25_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1386:4: ( ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )
        // InternalKExpressions.g:1386:4: ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
        {
        // InternalKExpressions.g:1386:4: ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
        // InternalKExpressions.g:1387:5: () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )*
        {
        // InternalKExpressions.g:1387:5: ()
        // InternalKExpressions.g:1388:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:1397:5: ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1398:6: ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) )
        {
        // InternalKExpressions.g:1398:6: ( (lv_operator_7_0= ruleShiftRightOperator ) )
        // InternalKExpressions.g:1399:7: (lv_operator_7_0= ruleShiftRightOperator )
        {
        // InternalKExpressions.g:1399:7: (lv_operator_7_0= ruleShiftRightOperator )
        // InternalKExpressions.g:1400:8: lv_operator_7_0= ruleShiftRightOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_7_0=ruleShiftRightOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:1417:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) )
        // InternalKExpressions.g:1418:7: (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression )
        {
        // InternalKExpressions.g:1418:7: (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression )
        // InternalKExpressions.g:1419:8: lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_13);
        lv_subExpressions_8_0=ruleShiftLeftRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:1437:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )*
        loop110:
        do {
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==23) ) {
                alt110=1;
            }


            switch (alt110) {
        	case 1 :
        	    // InternalKExpressions.g:1438:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:1442:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) )
        	    // InternalKExpressions.g:1443:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
        	    {
        	    // InternalKExpressions.g:1443:7: (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression )
        	    // InternalKExpressions.g:1444:8: lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getShiftLeftRightExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_1_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_13);
        	    lv_subExpressions_10_0=ruleShiftLeftRightUnsignedExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop110;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred25_InternalKExpressions

    // $ANTLR start synpred26_InternalKExpressions
    public final void synpred26_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1547:6: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1547:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        {
        otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1551:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        // InternalKExpressions.g:1552:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        {
        // InternalKExpressions.g:1552:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        // InternalKExpressions.g:1553:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalKExpressions

    // $ANTLR start synpred27_InternalKExpressions
    public final void synpred27_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1495:4: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) )
        // InternalKExpressions.g:1495:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
        {
        // InternalKExpressions.g:1495:4: ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* )
        // InternalKExpressions.g:1496:5: () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
        {
        // InternalKExpressions.g:1496:5: ()
        // InternalKExpressions.g:1497:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:1506:5: ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1507:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
        {
        // InternalKExpressions.g:1507:6: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
        // InternalKExpressions.g:1508:7: (lv_operator_2_0= ruleShiftLeftOperator )
        {
        // InternalKExpressions.g:1508:7: (lv_operator_2_0= ruleShiftLeftOperator )
        // InternalKExpressions.g:1509:8: lv_operator_2_0= ruleShiftLeftOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_2_0=ruleShiftLeftOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:1526:6: ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) )
        // InternalKExpressions.g:1527:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
        {
        // InternalKExpressions.g:1527:7: (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression )
        // InternalKExpressions.g:1528:8: lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_12);
        lv_subExpressions_3_0=ruleShiftRightRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:1546:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )*
        loop111:
        do {
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==22) ) {
                alt111=1;
            }


            switch (alt111) {
        	case 1 :
        	    // InternalKExpressions.g:1547:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:1551:6: ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) )
        	    // InternalKExpressions.g:1552:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        	    {
        	    // InternalKExpressions.g:1552:7: (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression )
        	    // InternalKExpressions.g:1553:8: lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftRightRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_12);
        	    lv_subExpressions_5_0=ruleShiftRightRightUnsignedExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop111;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred27_InternalKExpressions

    // $ANTLR start synpred28_InternalKExpressions
    public final void synpred28_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1625:6: (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )
        // InternalKExpressions.g:1625:6: otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        {
        otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1629:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        // InternalKExpressions.g:1630:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        {
        // InternalKExpressions.g:1630:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        // InternalKExpressions.g:1631:8: lv_subExpressions_10_0= ruleShiftLeftRightExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleShiftLeftRightExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalKExpressions

    // $ANTLR start synpred29_InternalKExpressions
    public final void synpred29_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1573:4: ( ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )
        // InternalKExpressions.g:1573:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
        {
        // InternalKExpressions.g:1573:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
        // InternalKExpressions.g:1574:5: () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
        {
        // InternalKExpressions.g:1574:5: ()
        // InternalKExpressions.g:1575:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:1584:5: ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) )
        // InternalKExpressions.g:1585:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
        {
        // InternalKExpressions.g:1585:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) )
        // InternalKExpressions.g:1586:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
        {
        // InternalKExpressions.g:1586:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
        // InternalKExpressions.g:1587:8: lv_operator_7_0= ruleShiftRightUnsignedOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_7_0=ruleShiftRightUnsignedOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:1604:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
        // InternalKExpressions.g:1605:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
        {
        // InternalKExpressions.g:1605:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
        // InternalKExpressions.g:1606:8: lv_subExpressions_8_0= ruleShiftLeftRightExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_14);
        lv_subExpressions_8_0=ruleShiftLeftRightExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:1624:5: (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
        loop112:
        do {
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==24) ) {
                alt112=1;
            }


            switch (alt112) {
        	case 1 :
        	    // InternalKExpressions.g:1625:6: otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:1629:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        	    // InternalKExpressions.g:1630:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        	    {
        	    // InternalKExpressions.g:1630:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        	    // InternalKExpressions.g:1631:8: lv_subExpressions_10_0= ruleShiftLeftRightExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getShiftLeftRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    lv_subExpressions_10_0=ruleShiftLeftRightExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop112;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred29_InternalKExpressions

    // $ANTLR start synpred30_InternalKExpressions
    public final void synpred30_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1734:6: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1734:6: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) )
        {
        otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1738:6: ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) )
        // InternalKExpressions.g:1739:7: (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression )
        {
        // InternalKExpressions.g:1739:7: (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression )
        // InternalKExpressions.g:1740:8: lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleShiftLeftRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30_InternalKExpressions

    // $ANTLR start synpred31_InternalKExpressions
    public final void synpred31_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1682:4: ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )
        // InternalKExpressions.g:1682:4: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
        {
        // InternalKExpressions.g:1682:4: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* )
        // InternalKExpressions.g:1683:5: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )*
        {
        // InternalKExpressions.g:1683:5: ()
        // InternalKExpressions.g:1684:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:1693:5: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) )
        // InternalKExpressions.g:1694:6: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) )
        {
        // InternalKExpressions.g:1694:6: ( (lv_operator_2_0= ruleShiftRightOperator ) )
        // InternalKExpressions.g:1695:7: (lv_operator_2_0= ruleShiftRightOperator )
        {
        // InternalKExpressions.g:1695:7: (lv_operator_2_0= ruleShiftRightOperator )
        // InternalKExpressions.g:1696:8: lv_operator_2_0= ruleShiftRightOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getOperatorShiftRightOperatorEnumRuleCall_1_0_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_2_0=ruleShiftRightOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:1713:6: ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) )
        // InternalKExpressions.g:1714:7: (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression )
        {
        // InternalKExpressions.g:1714:7: (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression )
        // InternalKExpressions.g:1715:8: lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_13);
        lv_subExpressions_3_0=ruleShiftLeftRightUnsignedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:1733:5: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )*
        loop113:
        do {
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==23) ) {
                alt113=1;
            }


            switch (alt113) {
        	case 1 :
        	    // InternalKExpressions.g:1734:6: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:1738:6: ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) )
        	    // InternalKExpressions.g:1739:7: (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression )
        	    {
        	    // InternalKExpressions.g:1739:7: (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression )
        	    // InternalKExpressions.g:1740:8: lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightUnsignedExpressionParserRuleCall_1_0_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_13);
        	    lv_subExpressions_5_0=ruleShiftLeftRightUnsignedExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop113;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred31_InternalKExpressions

    // $ANTLR start synpred32_InternalKExpressions
    public final void synpred32_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1812:6: (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )
        // InternalKExpressions.g:1812:6: otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        {
        otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1816:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        // InternalKExpressions.g:1817:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        {
        // InternalKExpressions.g:1817:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        // InternalKExpressions.g:1818:8: lv_subExpressions_10_0= ruleShiftLeftRightExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleShiftLeftRightExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalKExpressions

    // $ANTLR start synpred33_InternalKExpressions
    public final void synpred33_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1760:4: ( ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )
        // InternalKExpressions.g:1760:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
        {
        // InternalKExpressions.g:1760:4: ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* )
        // InternalKExpressions.g:1761:5: () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
        {
        // InternalKExpressions.g:1761:5: ()
        // InternalKExpressions.g:1762:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:1771:5: ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) )
        // InternalKExpressions.g:1772:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
        {
        // InternalKExpressions.g:1772:6: ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) )
        // InternalKExpressions.g:1773:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
        {
        // InternalKExpressions.g:1773:7: (lv_operator_7_0= ruleShiftRightUnsignedOperator )
        // InternalKExpressions.g:1774:8: lv_operator_7_0= ruleShiftRightUnsignedOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_1_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_7_0=ruleShiftRightUnsignedOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:1791:6: ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) )
        // InternalKExpressions.g:1792:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
        {
        // InternalKExpressions.g:1792:7: (lv_subExpressions_8_0= ruleShiftLeftRightExpression )
        // InternalKExpressions.g:1793:8: lv_subExpressions_8_0= ruleShiftLeftRightExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_14);
        lv_subExpressions_8_0=ruleShiftLeftRightExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:1811:5: (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )*
        loop114:
        do {
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==24) ) {
                alt114=1;
            }


            switch (alt114) {
        	case 1 :
        	    // InternalKExpressions.g:1812:6: otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:1816:6: ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) )
        	    // InternalKExpressions.g:1817:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        	    {
        	    // InternalKExpressions.g:1817:7: (lv_subExpressions_10_0= ruleShiftLeftRightExpression )
        	    // InternalKExpressions.g:1818:8: lv_subExpressions_10_0= ruleShiftLeftRightExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getShiftRightRightUnsignedExpressionAccess().getSubExpressionsShiftLeftRightExpressionParserRuleCall_1_1_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_14);
        	    lv_subExpressions_10_0=ruleShiftLeftRightExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop114;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred33_InternalKExpressions

    // $ANTLR start synpred52_InternalKExpressions
    public final void synpred52_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:2801:6: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )
        // InternalKExpressions.g:2801:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        {
        otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:2805:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        // InternalKExpressions.g:2806:7: (lv_subExpressions_5_0= ruleDivModExpression )
        {
        // InternalKExpressions.g:2806:7: (lv_subExpressions_5_0= ruleDivModExpression )
        // InternalKExpressions.g:2807:8: lv_subExpressions_5_0= ruleDivModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleDivModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred52_InternalKExpressions

    // $ANTLR start synpred53_InternalKExpressions
    public final void synpred53_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:2749:4: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) )
        // InternalKExpressions.g:2749:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
        {
        // InternalKExpressions.g:2749:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
        // InternalKExpressions.g:2750:5: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
        {
        // InternalKExpressions.g:2750:5: ()
        // InternalKExpressions.g:2751:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:2760:5: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) )
        // InternalKExpressions.g:2761:6: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) )
        {
        // InternalKExpressions.g:2761:6: ( (lv_operator_2_0= ruleMultOperator ) )
        // InternalKExpressions.g:2762:7: (lv_operator_2_0= ruleMultOperator )
        {
        // InternalKExpressions.g:2762:7: (lv_operator_2_0= ruleMultOperator )
        // InternalKExpressions.g:2763:8: lv_operator_2_0= ruleMultOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_2_0=ruleMultOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:2780:6: ( (lv_subExpressions_3_0= ruleDivModExpression ) )
        // InternalKExpressions.g:2781:7: (lv_subExpressions_3_0= ruleDivModExpression )
        {
        // InternalKExpressions.g:2781:7: (lv_subExpressions_3_0= ruleDivModExpression )
        // InternalKExpressions.g:2782:8: lv_subExpressions_3_0= ruleDivModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_22);
        lv_subExpressions_3_0=ruleDivModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:2800:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
        loop124:
        do {
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==27) ) {
                alt124=1;
            }


            switch (alt124) {
        	case 1 :
        	    // InternalKExpressions.g:2801:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:2805:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        	    // InternalKExpressions.g:2806:7: (lv_subExpressions_5_0= ruleDivModExpression )
        	    {
        	    // InternalKExpressions.g:2806:7: (lv_subExpressions_5_0= ruleDivModExpression )
        	    // InternalKExpressions.g:2807:8: lv_subExpressions_5_0= ruleDivModExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_subExpressions_5_0=ruleDivModExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop124;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred53_InternalKExpressions

    // $ANTLR start synpred54_InternalKExpressions
    public final void synpred54_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:2879:6: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )
        // InternalKExpressions.g:2879:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) )
        {
        otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:2883:6: ( (lv_subExpressions_10_0= ruleMultModExpression ) )
        // InternalKExpressions.g:2884:7: (lv_subExpressions_10_0= ruleMultModExpression )
        {
        // InternalKExpressions.g:2884:7: (lv_subExpressions_10_0= ruleMultModExpression )
        // InternalKExpressions.g:2885:8: lv_subExpressions_10_0= ruleMultModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleMultModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred54_InternalKExpressions

    // $ANTLR start synpred55_InternalKExpressions
    public final void synpred55_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:2827:4: ( ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )
        // InternalKExpressions.g:2827:4: ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* )
        {
        // InternalKExpressions.g:2827:4: ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* )
        // InternalKExpressions.g:2828:5: () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )*
        {
        // InternalKExpressions.g:2828:5: ()
        // InternalKExpressions.g:2829:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:2838:5: ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) )
        // InternalKExpressions.g:2839:6: ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) )
        {
        // InternalKExpressions.g:2839:6: ( (lv_operator_7_0= ruleDivOperator ) )
        // InternalKExpressions.g:2840:7: (lv_operator_7_0= ruleDivOperator )
        {
        // InternalKExpressions.g:2840:7: (lv_operator_7_0= ruleDivOperator )
        // InternalKExpressions.g:2841:8: lv_operator_7_0= ruleDivOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_7_0=ruleDivOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:2858:6: ( (lv_subExpressions_8_0= ruleMultModExpression ) )
        // InternalKExpressions.g:2859:7: (lv_subExpressions_8_0= ruleMultModExpression )
        {
        // InternalKExpressions.g:2859:7: (lv_subExpressions_8_0= ruleMultModExpression )
        // InternalKExpressions.g:2860:8: lv_subExpressions_8_0= ruleMultModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_23);
        lv_subExpressions_8_0=ruleMultModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:2878:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )*
        loop125:
        do {
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==28) ) {
                alt125=1;
            }


            switch (alt125) {
        	case 1 :
        	    // InternalKExpressions.g:2879:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:2883:6: ( (lv_subExpressions_10_0= ruleMultModExpression ) )
        	    // InternalKExpressions.g:2884:7: (lv_subExpressions_10_0= ruleMultModExpression )
        	    {
        	    // InternalKExpressions.g:2884:7: (lv_subExpressions_10_0= ruleMultModExpression )
        	    // InternalKExpressions.g:2885:8: lv_subExpressions_10_0= ruleMultModExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMultDivExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_1_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_23);
        	    lv_subExpressions_10_0=ruleMultModExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop125;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred55_InternalKExpressions

    // $ANTLR start synpred56_InternalKExpressions
    public final void synpred56_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:2988:6: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )
        // InternalKExpressions.g:2988:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        {
        otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:2992:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        // InternalKExpressions.g:2993:7: (lv_subExpressions_5_0= ruleDivModExpression )
        {
        // InternalKExpressions.g:2993:7: (lv_subExpressions_5_0= ruleDivModExpression )
        // InternalKExpressions.g:2994:8: lv_subExpressions_5_0= ruleDivModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleDivModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred56_InternalKExpressions

    // $ANTLR start synpred57_InternalKExpressions
    public final void synpred57_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:2936:4: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) )
        // InternalKExpressions.g:2936:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
        {
        // InternalKExpressions.g:2936:4: ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* )
        // InternalKExpressions.g:2937:5: () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
        {
        // InternalKExpressions.g:2937:5: ()
        // InternalKExpressions.g:2938:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:2947:5: ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) )
        // InternalKExpressions.g:2948:6: ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) )
        {
        // InternalKExpressions.g:2948:6: ( (lv_operator_2_0= ruleMultOperator ) )
        // InternalKExpressions.g:2949:7: (lv_operator_2_0= ruleMultOperator )
        {
        // InternalKExpressions.g:2949:7: (lv_operator_2_0= ruleMultOperator )
        // InternalKExpressions.g:2950:8: lv_operator_2_0= ruleMultOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultModExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_2_0=ruleMultOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:2967:6: ( (lv_subExpressions_3_0= ruleDivModExpression ) )
        // InternalKExpressions.g:2968:7: (lv_subExpressions_3_0= ruleDivModExpression )
        {
        // InternalKExpressions.g:2968:7: (lv_subExpressions_3_0= ruleDivModExpression )
        // InternalKExpressions.g:2969:8: lv_subExpressions_3_0= ruleDivModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_22);
        lv_subExpressions_3_0=ruleDivModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:2987:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )*
        loop126:
        do {
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==27) ) {
                alt126=1;
            }


            switch (alt126) {
        	case 1 :
        	    // InternalKExpressions.g:2988:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:2992:6: ( (lv_subExpressions_5_0= ruleDivModExpression ) )
        	    // InternalKExpressions.g:2993:7: (lv_subExpressions_5_0= ruleDivModExpression )
        	    {
        	    // InternalKExpressions.g:2993:7: (lv_subExpressions_5_0= ruleDivModExpression )
        	    // InternalKExpressions.g:2994:8: lv_subExpressions_5_0= ruleDivModExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsDivModExpressionParserRuleCall_1_0_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_22);
        	    lv_subExpressions_5_0=ruleDivModExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop126;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred57_InternalKExpressions

    // $ANTLR start synpred58_InternalKExpressions
    public final void synpred58_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:3066:6: (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )
        // InternalKExpressions.g:3066:6: otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        {
        otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:3070:6: ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        // InternalKExpressions.g:3071:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        {
        // InternalKExpressions.g:3071:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        // InternalKExpressions.g:3072:8: lv_subExpressions_10_0= ruleMultDivExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleMultDivExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred58_InternalKExpressions

    // $ANTLR start synpred59_InternalKExpressions
    public final void synpred59_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:3014:4: ( ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )
        // InternalKExpressions.g:3014:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
        {
        // InternalKExpressions.g:3014:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
        // InternalKExpressions.g:3015:5: () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
        {
        // InternalKExpressions.g:3015:5: ()
        // InternalKExpressions.g:3016:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:3025:5: ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) )
        // InternalKExpressions.g:3026:6: ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
        {
        // InternalKExpressions.g:3026:6: ( (lv_operator_7_0= ruleModOperator ) )
        // InternalKExpressions.g:3027:7: (lv_operator_7_0= ruleModOperator )
        {
        // InternalKExpressions.g:3027:7: (lv_operator_7_0= ruleModOperator )
        // InternalKExpressions.g:3028:8: lv_operator_7_0= ruleModOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_7_0=ruleModOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3045:6: ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
        // InternalKExpressions.g:3046:7: (lv_subExpressions_8_0= ruleMultDivExpression )
        {
        // InternalKExpressions.g:3046:7: (lv_subExpressions_8_0= ruleMultDivExpression )
        // InternalKExpressions.g:3047:8: lv_subExpressions_8_0= ruleMultDivExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_24);
        lv_subExpressions_8_0=ruleMultDivExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:3065:5: (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
        loop127:
        do {
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==29) ) {
                alt127=1;
            }


            switch (alt127) {
        	case 1 :
        	    // InternalKExpressions.g:3066:6: otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:3070:6: ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        	    // InternalKExpressions.g:3071:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        	    {
        	    // InternalKExpressions.g:3071:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        	    // InternalKExpressions.g:3072:8: lv_subExpressions_10_0= ruleMultDivExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getMultModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_24);
        	    lv_subExpressions_10_0=ruleMultDivExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop127;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred59_InternalKExpressions

    // $ANTLR start synpred60_InternalKExpressions
    public final void synpred60_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:3175:6: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )
        // InternalKExpressions.g:3175:6: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) )
        {
        otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:3179:6: ( (lv_subExpressions_5_0= ruleMultModExpression ) )
        // InternalKExpressions.g:3180:7: (lv_subExpressions_5_0= ruleMultModExpression )
        {
        // InternalKExpressions.g:3180:7: (lv_subExpressions_5_0= ruleMultModExpression )
        // InternalKExpressions.g:3181:8: lv_subExpressions_5_0= ruleMultModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_0_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleMultModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred60_InternalKExpressions

    // $ANTLR start synpred61_InternalKExpressions
    public final void synpred61_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:3123:4: ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) )
        // InternalKExpressions.g:3123:4: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* )
        {
        // InternalKExpressions.g:3123:4: ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* )
        // InternalKExpressions.g:3124:5: () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )*
        {
        // InternalKExpressions.g:3124:5: ()
        // InternalKExpressions.g:3125:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:3134:5: ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) )
        // InternalKExpressions.g:3135:6: ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) )
        {
        // InternalKExpressions.g:3135:6: ( (lv_operator_2_0= ruleDivOperator ) )
        // InternalKExpressions.g:3136:7: (lv_operator_2_0= ruleDivOperator )
        {
        // InternalKExpressions.g:3136:7: (lv_operator_2_0= ruleDivOperator )
        // InternalKExpressions.g:3137:8: lv_operator_2_0= ruleDivOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDivModExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_0_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_2_0=ruleDivOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3154:6: ( (lv_subExpressions_3_0= ruleMultModExpression ) )
        // InternalKExpressions.g:3155:7: (lv_subExpressions_3_0= ruleMultModExpression )
        {
        // InternalKExpressions.g:3155:7: (lv_subExpressions_3_0= ruleMultModExpression )
        // InternalKExpressions.g:3156:8: lv_subExpressions_3_0= ruleMultModExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_0_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_23);
        lv_subExpressions_3_0=ruleMultModExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:3174:5: (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )*
        loop128:
        do {
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==28) ) {
                alt128=1;
            }


            switch (alt128) {
        	case 1 :
        	    // InternalKExpressions.g:3175:6: otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:3179:6: ( (lv_subExpressions_5_0= ruleMultModExpression ) )
        	    // InternalKExpressions.g:3180:7: (lv_subExpressions_5_0= ruleMultModExpression )
        	    {
        	    // InternalKExpressions.g:3180:7: (lv_subExpressions_5_0= ruleMultModExpression )
        	    // InternalKExpressions.g:3181:8: lv_subExpressions_5_0= ruleMultModExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultModExpressionParserRuleCall_1_0_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_23);
        	    lv_subExpressions_5_0=ruleMultModExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop128;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred61_InternalKExpressions

    // $ANTLR start synpred62_InternalKExpressions
    public final void synpred62_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:3253:6: (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )
        // InternalKExpressions.g:3253:6: otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        {
        otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:3257:6: ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        // InternalKExpressions.g:3258:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        {
        // InternalKExpressions.g:3258:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        // InternalKExpressions.g:3259:8: lv_subExpressions_10_0= ruleMultDivExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleMultDivExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred62_InternalKExpressions

    // $ANTLR start synpred63_InternalKExpressions
    public final void synpred63_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Enumerator lv_operator_7_0 = null;

        EObject lv_subExpressions_8_0 = null;

        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:3201:4: ( ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )
        // InternalKExpressions.g:3201:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
        {
        // InternalKExpressions.g:3201:4: ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* )
        // InternalKExpressions.g:3202:5: () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
        {
        // InternalKExpressions.g:3202:5: ()
        // InternalKExpressions.g:3203:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        // InternalKExpressions.g:3212:5: ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) )
        // InternalKExpressions.g:3213:6: ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
        {
        // InternalKExpressions.g:3213:6: ( (lv_operator_7_0= ruleModOperator ) )
        // InternalKExpressions.g:3214:7: (lv_operator_7_0= ruleModOperator )
        {
        // InternalKExpressions.g:3214:7: (lv_operator_7_0= ruleModOperator )
        // InternalKExpressions.g:3215:8: lv_operator_7_0= ruleModOperator
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDivModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_1_0_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_11);
        lv_operator_7_0=ruleModOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3232:6: ( (lv_subExpressions_8_0= ruleMultDivExpression ) )
        // InternalKExpressions.g:3233:7: (lv_subExpressions_8_0= ruleMultDivExpression )
        {
        // InternalKExpressions.g:3233:7: (lv_subExpressions_8_0= ruleMultDivExpression )
        // InternalKExpressions.g:3234:8: lv_subExpressions_8_0= ruleMultDivExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_1_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_24);
        lv_subExpressions_8_0=ruleMultDivExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

        // InternalKExpressions.g:3252:5: (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )*
        loop129:
        do {
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==29) ) {
                alt129=1;
            }


            switch (alt129) {
        	case 1 :
        	    // InternalKExpressions.g:3253:6: otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        	    {
        	    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return ;
        	    // InternalKExpressions.g:3257:6: ( (lv_subExpressions_10_0= ruleMultDivExpression ) )
        	    // InternalKExpressions.g:3258:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        	    {
        	    // InternalKExpressions.g:3258:7: (lv_subExpressions_10_0= ruleMultDivExpression )
        	    // InternalKExpressions.g:3259:8: lv_subExpressions_10_0= ruleMultDivExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getDivModExpressionAccess().getSubExpressionsMultDivExpressionParserRuleCall_1_1_2_1_0());
        	      							
        	    }
        	    pushFollow(FollowSets000.FOLLOW_24);
        	    lv_subExpressions_10_0=ruleMultDivExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop129;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred63_InternalKExpressions

    // $ANTLR start synpred65_InternalKExpressions
    public final void synpred65_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:3379:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKExpressions.g:3379:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKExpressions.g:3379:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )
        // InternalKExpressions.g:3380:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        {
        // InternalKExpressions.g:3380:4: ()
        // InternalKExpressions.g:3381:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKExpressions.g:3390:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:3391:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:3391:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:3392:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_28);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3409:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKExpressions.g:3410:5: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKExpressions.g:3410:5: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKExpressions.g:3411:6: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_29);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3428:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:3429:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:3429:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:3430:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_30);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_29); if (state.failed) return ;
        // InternalKExpressions.g:3451:4: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:3452:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:3452:5: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:3453:6: lv_subExpressions_5_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_5_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred65_InternalKExpressions

    // $ANTLR start synpred66_InternalKExpressions
    public final void synpred66_InternalKExpressions_fragment() throws RecognitionException {   
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // InternalKExpressions.g:3502:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
        // InternalKExpressions.g:3502:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
        {
        // InternalKExpressions.g:3502:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
        // InternalKExpressions.g:3503:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        {
        // InternalKExpressions.g:3503:4: ()
        // InternalKExpressions.g:3504:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKExpressions.g:3513:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:3514:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:3514:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:3515:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_31);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3532:4: ( (lv_operator_2_0= ruleFBYOperator ) )
        // InternalKExpressions.g:3533:5: (lv_operator_2_0= ruleFBYOperator )
        {
        // InternalKExpressions.g:3533:5: (lv_operator_2_0= ruleFBYOperator )
        // InternalKExpressions.g:3534:6: lv_operator_2_0= ruleFBYOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFBYExpressionAccess().getOperatorFBYOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_29);
        lv_operator_2_0=ruleFBYOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:3551:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:3552:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:3552:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:3553:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getFBYExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred66_InternalKExpressions

    // $ANTLR start synpred78_InternalKExpressions
    public final void synpred78_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKExpressions.g:3774:3: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKExpressions.g:3774:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKExpressions.g:3774:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKExpressions.g:3775:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_11); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_32);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalKExpressions

    // $ANTLR start synpred95_InternalKExpressions
    public final void synpred95_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKExpressions.g:4697:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKExpressions.g:4697:3: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_InternalKExpressions

    // $ANTLR start synpred96_InternalKExpressions
    public final void synpred96_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKExpressions.g:4709:3: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKExpressions.g:4709:3: this_ValuedExpression_1= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedExpression_1=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_InternalKExpressions

    // Delegated rules

    public final boolean synpred32_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA81 dfa81 = new DFA81(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA85 dfa85 = new DFA85(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\1\4\20\0\3\uffff";
    static final String dfa_3s = "\1\71\20\0\3\uffff";
    static final String dfa_4s = "\21\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\1\20\1\2\1\3\1\7\1\4\1\16\17\uffff\1\1\4\uffff\1\6\7\uffff\1\14\1\15\1\13\1\21\1\5\4\uffff\1\17\6\uffff\1\10\1\21\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "113:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_1 = input.LA(1);

                         
                        int index1_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 19;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\23\uffff";
    static final String dfa_8s = "\1\4\5\uffff\13\0\2\uffff";
    static final String dfa_9s = "\1\71\5\uffff\13\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\17\uffff\1\2\1\uffff";
    static final String dfa_11s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\1\20\2\1\1\7\1\1\1\16\17\uffff\1\1\4\uffff\1\6\7\uffff\1\14\1\15\1\13\1\21\1\1\4\uffff\1\17\6\uffff\1\10\1\21\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "798:2: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_12 = input.LA(1);

                         
                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_13 = input.LA(1);

                         
                        int index13_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_14 = input.LA(1);

                         
                        int index13_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_15 = input.LA(1);

                         
                        int index13_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_16 = input.LA(1);

                         
                        int index13_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index13_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\26\uffff";
    static final String dfa_14s = "\1\3\25\uffff";
    static final String dfa_15s = "\1\21\2\0\23\uffff";
    static final String dfa_16s = "\1\66\2\0\23\uffff";
    static final String dfa_17s = "\3\uffff\1\3\20\uffff\1\1\1\2";
    static final String dfa_18s = "\1\uffff\1\0\1\1\23\uffff}>";
    static final String[] dfa_19s = {
            "\5\3\1\1\1\2\1\3\7\uffff\2\3\2\uffff\1\3\7\uffff\1\3\4\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1307:3: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalKExpressions()) ) {s = 20;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalKExpressions()) ) {s = 21;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_20s = {
            "\5\3\1\1\1\3\1\2\7\uffff\2\3\2\uffff\1\3\7\uffff\1\3\4\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1494:3: ( ( () ( ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightRightUnsignedExpression ) ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleShiftRightRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalKExpressions()) ) {s = 20;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_2 = input.LA(1);

                         
                        int index25_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalKExpressions()) ) {s = 21;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index25_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_21s = {
            "\6\3\1\1\1\2\7\uffff\2\3\2\uffff\1\3\7\uffff\1\3\4\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "1681:3: ( ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftLeftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftLeftRightUnsignedExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_8_0= ruleShiftLeftRightExpression ) ) ) (otherlv_9= '>>>' ( (lv_subExpressions_10_0= ruleShiftLeftRightExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalKExpressions()) ) {s = 20;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalKExpressions()) ) {s = 21;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\33\uffff";
    static final String dfa_23s = "\1\3\32\uffff";
    static final String dfa_24s = "\1\21\2\0\30\uffff";
    static final String dfa_25s = "\1\66\2\0\30\uffff";
    static final String dfa_26s = "\3\uffff\1\3\25\uffff\1\1\1\2";
    static final String dfa_27s = "\1\uffff\1\0\1\1\30\uffff}>";
    static final String[] dfa_28s = {
            "\12\3\1\1\1\2\1\3\2\uffff\2\3\2\uffff\1\3\7\uffff\1\3\4\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "2748:3: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleMultModExpression ) ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleMultModExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_1 = input.LA(1);

                         
                        int index46_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalKExpressions()) ) {s = 25;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index46_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_2 = input.LA(1);

                         
                        int index46_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalKExpressions()) ) {s = 26;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index46_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_29s = {
            "\12\3\1\1\1\3\1\2\2\uffff\2\3\2\uffff\1\3\7\uffff\1\3\4\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "2935:3: ( ( () ( ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivModExpression ) ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleDivModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalKExpressions()) ) {s = 25;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalKExpressions()) ) {s = 26;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String[] dfa_30s = {
            "\13\3\1\1\1\2\2\uffff\2\3\2\uffff\1\3\7\uffff\1\3\4\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3122:3: ( ( () ( ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleMultModExpression ) ) ) (otherlv_4= '/' ( (lv_subExpressions_5_0= ruleMultModExpression ) ) )* ) | ( () ( ( (lv_operator_7_0= ruleModOperator ) ) ( (lv_subExpressions_8_0= ruleMultDivExpression ) ) ) (otherlv_9= '%' ( (lv_subExpressions_10_0= ruleMultDivExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_1 = input.LA(1);

                         
                        int index52_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalKExpressions()) ) {s = 25;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index52_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_2 = input.LA(1);

                         
                        int index52_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalKExpressions()) ) {s = 26;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index52_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_31s = "\22\uffff";
    static final String dfa_32s = "\1\4\17\0\2\uffff";
    static final String dfa_33s = "\1\71\17\0\2\uffff";
    static final String dfa_34s = "\20\uffff\1\1\1\2";
    static final String dfa_35s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\2\uffff}>";
    static final String[] dfa_36s = {
            "\1\11\1\17\1\1\1\2\1\6\1\3\1\15\24\uffff\1\5\7\uffff\1\13\1\14\1\12\1\uffff\1\4\4\uffff\1\16\6\uffff\1\7\1\uffff\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "3378:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) ) | this_FBYExpression_6= ruleFBYExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index54_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "3501:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleFBYOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) | this_AtomicValuedExpression_4= ruleAtomicValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_15 = input.LA(1);

                         
                        int index55_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index55_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_37s = "\13\uffff";
    static final String dfa_38s = "\3\uffff\1\2\5\uffff\1\2\1\uffff";
    static final String dfa_39s = "\1\4\2\uffff\1\21\5\uffff\1\21\1\uffff";
    static final String dfa_40s = "\1\71\2\uffff\1\73\5\uffff\1\73\1\uffff";
    static final String dfa_41s = "\1\uffff\1\1\1\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\uffff\1\4";
    static final String dfa_42s = "\13\uffff}>";
    static final String[] dfa_43s = {
            "\1\3\1\10\2\uffff\1\1\1\uffff\1\10\24\uffff\1\4\7\uffff\1\6\1\7\1\5\6\uffff\1\10\6\uffff\1\2\1\uffff\1\2",
            "",
            "",
            "\16\2\1\12\2\2\1\11\3\2\1\12\5\uffff\1\2\4\uffff\6\2\3\uffff\2\2",
            "",
            "",
            "",
            "",
            "",
            "\16\2\1\12\2\2\1\11\3\2\1\12\5\uffff\1\2\4\uffff\6\2\3\uffff\2\2",
            ""
    };

    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_37;
            this.eof = dfa_38;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "3601:2: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_ReferenceCall_5= ruleReferenceCall | this_FunctionCall_6= ruleFunctionCall | this_RandomCall_7= ruleRandomCall | this_RandomizeCall_8= ruleRandomizeCall | this_TextExpression_9= ruleTextExpression )";
        }
    }
    static final String dfa_44s = "\21\uffff";
    static final String dfa_45s = "\1\4\4\uffff\1\0\13\uffff";
    static final String dfa_46s = "\1\71\4\uffff\1\0\13\uffff";
    static final String dfa_47s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\11\uffff\1\5";
    static final String dfa_48s = "\5\uffff\1\0\13\uffff}>";
    static final String[] dfa_49s = {
            "\2\6\1\1\1\2\1\6\1\3\1\6\24\uffff\1\5\7\uffff\3\6\1\uffff\1\4\4\uffff\1\6\6\uffff\1\6\1\uffff\1\6",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_44;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "3725:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_5 = input.LA(1);

                         
                        int index57_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 16;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index57_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_50s = "\25\uffff";
    static final String dfa_51s = "\1\4\20\0\4\uffff";
    static final String dfa_52s = "\1\71\20\0\4\uffff";
    static final String dfa_53s = "\21\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_54s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\4\uffff}>";
    static final String[] dfa_55s = {
            "\1\12\1\20\1\2\1\3\1\7\1\4\1\16\17\uffff\1\1\4\uffff\1\6\7\uffff\1\14\1\15\1\13\1\21\1\5\1\uffff\1\23\2\uffff\1\17\6\uffff\1\10\1\21\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final char[] dfa_51 = DFA.unpackEncodedStringToUnsignedChars(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[][] dfa_55 = unpackEncodedStringArray(dfa_55s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_50;
            this.eof = dfa_50;
            this.min = dfa_51;
            this.max = dfa_52;
            this.accept = dfa_53;
            this.special = dfa_54;
            this.transition = dfa_55;
        }
        public String getDescription() {
            return "4696:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_4 = input.LA(1);

                         
                        int index74_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_5 = input.LA(1);

                         
                        int index74_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_6 = input.LA(1);

                         
                        int index74_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_9 = input.LA(1);

                         
                        int index74_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_10 = input.LA(1);

                         
                        int index74_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_11 = input.LA(1);

                         
                        int index74_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_12 = input.LA(1);

                         
                        int index74_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_13 = input.LA(1);

                         
                        int index74_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_14 = input.LA(1);

                         
                        int index74_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_15 = input.LA(1);

                         
                        int index74_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_16 = input.LA(1);

                         
                        int index74_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalKExpressions()) ) {s = 17;}

                        else if ( (synpred96_InternalKExpressions()) ) {s = 20;}

                         
                        input.seek(index74_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_56s = "\12\uffff";
    static final String dfa_57s = "\3\uffff\1\1\4\uffff\2\1";
    static final String dfa_58s = "\1\12\1\uffff\4\4\1\6\1\uffff\2\4";
    static final String dfa_59s = "\1\60\1\uffff\1\4\1\60\1\4\1\7\1\6\1\uffff\2\60";
    static final String dfa_60s = "\1\uffff\1\1\5\uffff\1\2\2\uffff";
    static final String dfa_61s = "\12\uffff}>";
    static final String[] dfa_62s = {
            "\1\1\45\uffff\1\2",
            "",
            "\1\3",
            "\7\1\17\uffff\1\5\10\uffff\1\1\1\uffff\1\4\5\uffff\1\7\3\uffff\1\6\1\1",
            "\1\10",
            "\1\10\1\uffff\2\1",
            "\1\11",
            "",
            "\7\1\17\uffff\1\5\10\uffff\1\1\1\uffff\1\4\5\uffff\1\7\3\uffff\1\6\1\1",
            "\7\1\17\uffff\1\1\10\uffff\1\1\7\uffff\1\7\4\uffff\1\1"
    };

    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final char[] dfa_58 = DFA.unpackEncodedStringToUnsignedChars(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final short[] dfa_60 = DFA.unpackEncodedString(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[][] dfa_62 = unpackEncodedStringArray(dfa_62s);

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = dfa_56;
            this.eof = dfa_57;
            this.min = dfa_58;
            this.max = dfa_59;
            this.accept = dfa_60;
            this.special = dfa_61;
            this.transition = dfa_62;
        }
        public String getDescription() {
            return "5296:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )";
        }
    }
    static final String dfa_63s = "\14\uffff";
    static final String dfa_64s = "\3\uffff\1\11\6\uffff\2\11";
    static final String dfa_65s = "\1\12\1\uffff\4\4\1\6\3\uffff\2\4";
    static final String dfa_66s = "\1\60\1\uffff\1\4\1\60\1\4\1\7\1\6\3\uffff\2\60";
    static final String dfa_67s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\4\2\uffff";
    static final String dfa_68s = "\14\uffff}>";
    static final String[] dfa_69s = {
            "\1\1\45\uffff\1\2",
            "",
            "\1\3",
            "\1\10\1\11\4\10\1\11\17\uffff\1\5\10\uffff\1\7\1\uffff\1\4\11\uffff\1\6\1\11",
            "\1\12",
            "\1\12\1\uffff\2\10",
            "\1\13",
            "",
            "",
            "",
            "\1\10\1\11\4\10\1\11\17\uffff\1\5\10\uffff\1\7\1\uffff\1\4\11\uffff\1\6\1\11",
            "\1\10\1\11\4\10\1\11\17\uffff\1\10\10\uffff\1\7\14\uffff\1\11"
    };

    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final char[] dfa_65 = DFA.unpackEncodedStringToUnsignedChars(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final short[] dfa_67 = DFA.unpackEncodedString(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[][] dfa_69 = unpackEncodedStringArray(dfa_69s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_63;
            this.eof = dfa_64;
            this.min = dfa_65;
            this.max = dfa_66;
            this.accept = dfa_67;
            this.special = dfa_68;
            this.transition = dfa_69;
        }
        public String getDescription() {
            return "5338:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_70s = "\2\uffff\1\6\5\uffff\2\6";
    static final String dfa_71s = "\1\57\4\4\1\6\2\uffff\2\4";
    static final String dfa_72s = "\1\57\1\4\1\57\1\4\1\7\1\6\2\uffff\1\57\1\32";
    static final String dfa_73s = "\6\uffff\1\2\1\1\2\uffff";
    static final String[] dfa_74s = {
            "\1\1",
            "\1\2",
            "\1\7\1\uffff\4\7\20\uffff\1\4\12\uffff\1\3\11\uffff\1\5",
            "\1\10",
            "\1\10\1\uffff\2\7",
            "\1\11",
            "",
            "",
            "\1\7\1\uffff\4\7\20\uffff\1\4\12\uffff\1\3\11\uffff\1\5",
            "\1\7\1\uffff\4\7\20\uffff\1\7"
    };
    static final short[] dfa_70 = DFA.unpackEncodedString(dfa_70s);
    static final char[] dfa_71 = DFA.unpackEncodedStringToUnsignedChars(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final short[] dfa_73 = DFA.unpackEncodedString(dfa_73s);
    static final short[][] dfa_74 = unpackEncodedStringArray(dfa_74s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_56;
            this.eof = dfa_70;
            this.min = dfa_71;
            this.max = dfa_72;
            this.accept = dfa_73;
            this.special = dfa_61;
            this.transition = dfa_74;
        }
        public String getDescription() {
            return "5404:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )";
        }
    }
    static final String dfa_75s = "\1\12\1\uffff\4\4\1\6\2\uffff\2\4";
    static final String dfa_76s = "\1\60\1\uffff\1\4\1\57\1\4\1\7\1\6\2\uffff\1\57\1\43";
    static final String dfa_77s = "\1\uffff\1\1\5\uffff\1\2\1\3\2\uffff";
    static final String[] dfa_78s = {
            "\1\1\45\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\uffff\4\7\20\uffff\1\5\10\uffff\1\10\1\uffff\1\4\11\uffff\1\6",
            "\1\11",
            "\1\11\1\uffff\2\7",
            "\1\12",
            "",
            "",
            "\1\7\1\uffff\4\7\20\uffff\1\5\10\uffff\1\10\1\uffff\1\4\11\uffff\1\6",
            "\1\7\1\uffff\4\7\20\uffff\1\7\10\uffff\1\10"
    };
    static final char[] dfa_75 = DFA.unpackEncodedStringToUnsignedChars(dfa_75s);
    static final char[] dfa_76 = DFA.unpackEncodedStringToUnsignedChars(dfa_76s);
    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final short[][] dfa_78 = unpackEncodedStringArray(dfa_78s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_37;
            this.eof = dfa_37;
            this.min = dfa_75;
            this.max = dfa_76;
            this.accept = dfa_77;
            this.special = dfa_42;
            this.transition = dfa_78;
        }
        public String getDescription() {
            return "5446:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )";
        }
    }
    static final String dfa_79s = "\3\uffff\1\7\6\uffff\2\7";
    static final String dfa_80s = "\1\12\1\uffff\1\4\1\11\2\4\1\6\3\uffff\2\11";
    static final String dfa_81s = "\1\60\1\uffff\1\4\1\57\2\4\1\6\3\uffff\1\57\1\43";
    static final String dfa_82s = "\1\uffff\1\1\5\uffff\1\4\1\3\1\2\2\uffff";
    static final String[] dfa_83s = {
            "\1\1\45\uffff\1\2",
            "",
            "\1\3",
            "\1\11\20\uffff\1\5\10\uffff\1\10\1\uffff\1\4\11\uffff\1\6",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\11\20\uffff\1\5\10\uffff\1\10\1\uffff\1\4\11\uffff\1\6",
            "\1\11\31\uffff\1\10"
    };
    static final short[] dfa_79 = DFA.unpackEncodedString(dfa_79s);
    static final char[] dfa_80 = DFA.unpackEncodedStringToUnsignedChars(dfa_80s);
    static final char[] dfa_81 = DFA.unpackEncodedStringToUnsignedChars(dfa_81s);
    static final short[] dfa_82 = DFA.unpackEncodedString(dfa_82s);
    static final short[][] dfa_83 = unpackEncodedStringArray(dfa_83s);

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = dfa_63;
            this.eof = dfa_79;
            this.min = dfa_80;
            this.max = dfa_81;
            this.accept = dfa_82;
            this.special = dfa_68;
            this.transition = dfa_83;
        }
        public String getDescription() {
            return "5500:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x03810F80840007F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x007E000000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x02810B80840007F0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001400002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000028000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x02810B80800007F0L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0280000000000010L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002800000002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004080000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x03810F80842007F0L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000420L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x03812F80840007F0L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100200000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000200L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00004808000003C0L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00004818000003C0L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000001200000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000040003D0L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000802004000002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000080L});
    }


}