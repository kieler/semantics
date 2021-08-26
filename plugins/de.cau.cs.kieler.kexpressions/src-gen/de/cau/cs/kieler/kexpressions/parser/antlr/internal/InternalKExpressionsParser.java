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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT_ANNOTATION", "RULE_SL_COMMENT", "RULE_NUMBER", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "':'", "'->'", "'fby'", "'sfby'", "'('", "')'", "','", "'static'", "'.'", "'\\''", "'['", "']'", "'()'", "'random'", "'randomize'", "'extern'", "'{'", "'to'", "'}'", "'_'", "'null'", "'#'", "'@'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'pre'", "'~'", "'!'", "'val'", "'?'", "'!&'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_HOSTCODE=6;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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

            if ( ((LA12_0>=53 && LA12_0<=58)) ) {
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

            if ( (LA14_0==60) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||LA14_0==RULE_HOSTCODE||LA14_0==RULE_BOOLEAN||LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==34||LA14_0==37||(LA14_0>=43 && LA14_0<=45)||LA14_0==52||LA14_0==59||LA14_0==62) ) {
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

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID||LA15_0==RULE_HOSTCODE||LA15_0==RULE_BOOLEAN||LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==34||LA15_0==37||(LA15_0>=43 && LA15_0<=45)||LA15_0==52||(LA15_0>=59 && LA15_0<=60)||LA15_0==62) ) {
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
    // InternalKExpressions.g:1023:1: ruleShiftExpressions returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* ) ;
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
            // InternalKExpressions.g:1029:2: ( (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* ) )
            // InternalKExpressions.g:1030:2: (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* )
            {
            // InternalKExpressions.g:1030:2: (this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )* )
            // InternalKExpressions.g:1031:3: this_SumExpression_0= ruleSumExpression ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )*
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
            // InternalKExpressions.g:1042:3: ( ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* ) )*
            loop19:
            do {
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
            	    // InternalKExpressions.g:1043:4: ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1043:4: ( () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )
            	    // InternalKExpressions.g:1044:5: () ( (lv_operator_2_0= ruleShiftLeftOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
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

            	    // InternalKExpressions.g:1054:5: ( (lv_operator_2_0= ruleShiftLeftOperator ) )
            	    // InternalKExpressions.g:1055:6: (lv_operator_2_0= ruleShiftLeftOperator )
            	    {
            	    // InternalKExpressions.g:1055:6: (lv_operator_2_0= ruleShiftLeftOperator )
            	    // InternalKExpressions.g:1056:7: lv_operator_2_0= ruleShiftLeftOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftLeftOperatorEnumRuleCall_1_0_1_0());
            	      						
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

            	    // InternalKExpressions.g:1073:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
            	    // InternalKExpressions.g:1074:6: (lv_subExpressions_3_0= ruleSumExpression )
            	    {
            	    // InternalKExpressions.g:1074:6: (lv_subExpressions_3_0= ruleSumExpression )
            	    // InternalKExpressions.g:1075:7: lv_subExpressions_3_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_subExpressions_3_0=ruleSumExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1092:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        alt16 = dfa16.predict(input);
            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1093:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getShiftExpressionsAccess().getLessThanSignLessThanSignKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1097:6: ( (lv_subExpressions_5_0= ruleSumExpression ) )
            	    	    // InternalKExpressions.g:1098:7: (lv_subExpressions_5_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1098:7: (lv_subExpressions_5_0= ruleSumExpression )
            	    	    // InternalKExpressions.g:1099:8: lv_subExpressions_5_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_10);
            	    	    lv_subExpressions_5_0=ruleSumExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
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
            	    // InternalKExpressions.g:1119:4: ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1119:4: ( () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )* )
            	    // InternalKExpressions.g:1120:5: () ( (lv_operator_7_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_8_0= ruleSumExpression ) ) (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1120:5: ()
            	    // InternalKExpressions.g:1121:6: 
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

            	    // InternalKExpressions.g:1130:5: ( (lv_operator_7_0= ruleShiftRightOperator ) )
            	    // InternalKExpressions.g:1131:6: (lv_operator_7_0= ruleShiftRightOperator )
            	    {
            	    // InternalKExpressions.g:1131:6: (lv_operator_7_0= ruleShiftRightOperator )
            	    // InternalKExpressions.g:1132:7: lv_operator_7_0= ruleShiftRightOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightOperatorEnumRuleCall_1_1_1_0());
            	      						
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

            	    // InternalKExpressions.g:1149:5: ( (lv_subExpressions_8_0= ruleSumExpression ) )
            	    // InternalKExpressions.g:1150:6: (lv_subExpressions_8_0= ruleSumExpression )
            	    {
            	    // InternalKExpressions.g:1150:6: (lv_subExpressions_8_0= ruleSumExpression )
            	    // InternalKExpressions.g:1151:7: lv_subExpressions_8_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_subExpressions_8_0=ruleSumExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1168:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        alt17 = dfa17.predict(input);
            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1169:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1173:6: ( (lv_subExpressions_10_0= ruleSumExpression ) )
            	    	    // InternalKExpressions.g:1174:7: (lv_subExpressions_10_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1174:7: (lv_subExpressions_10_0= ruleSumExpression )
            	    	    // InternalKExpressions.g:1175:8: lv_subExpressions_10_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_10);
            	    	    lv_subExpressions_10_0=ruleSumExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
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
            	    // InternalKExpressions.g:1195:4: ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1195:4: ( () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )* )
            	    // InternalKExpressions.g:1196:5: () ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_13_0= ruleSumExpression ) ) (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1196:5: ()
            	    // InternalKExpressions.g:1197:6: 
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

            	    // InternalKExpressions.g:1206:5: ( (lv_operator_12_0= ruleShiftRightUnsignedOperator ) )
            	    // InternalKExpressions.g:1207:6: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
            	    {
            	    // InternalKExpressions.g:1207:6: (lv_operator_12_0= ruleShiftRightUnsignedOperator )
            	    // InternalKExpressions.g:1208:7: lv_operator_12_0= ruleShiftRightUnsignedOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getOperatorShiftRightUnsignedOperatorEnumRuleCall_1_2_1_0());
            	      						
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

            	    // InternalKExpressions.g:1225:5: ( (lv_subExpressions_13_0= ruleSumExpression ) )
            	    // InternalKExpressions.g:1226:6: (lv_subExpressions_13_0= ruleSumExpression )
            	    {
            	    // InternalKExpressions.g:1226:6: (lv_subExpressions_13_0= ruleSumExpression )
            	    // InternalKExpressions.g:1227:7: lv_subExpressions_13_0= ruleSumExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_subExpressions_13_0=ruleSumExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1244:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        alt18 = dfa18.predict(input);
            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1245:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_14, grammarAccess.getShiftExpressionsAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1249:6: ( (lv_subExpressions_15_0= ruleSumExpression ) )
            	    	    // InternalKExpressions.g:1250:7: (lv_subExpressions_15_0= ruleSumExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1250:7: (lv_subExpressions_15_0= ruleSumExpression )
            	    	    // InternalKExpressions.g:1251:8: lv_subExpressions_15_0= ruleSumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_10);
            	    	    lv_subExpressions_15_0=ruleSumExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.SumExpression");
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

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleShiftExpressions"


    // $ANTLR start "entryRuleShiftRightExpression"
    // InternalKExpressions.g:1275:1: entryRuleShiftRightExpression returns [EObject current=null] : iv_ruleShiftRightExpression= ruleShiftRightExpression EOF ;
    public final EObject entryRuleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightExpression = null;


        try {
            // InternalKExpressions.g:1275:61: (iv_ruleShiftRightExpression= ruleShiftRightExpression EOF )
            // InternalKExpressions.g:1276:2: iv_ruleShiftRightExpression= ruleShiftRightExpression EOF
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
    // InternalKExpressions.g:1282:1: ruleShiftRightExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1288:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? ) )
            // InternalKExpressions.g:1289:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            {
            // InternalKExpressions.g:1289:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )? )
            // InternalKExpressions.g:1290:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_12);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1301:3: ( () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalKExpressions.g:1302:4: () ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) ) (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    {
                    // InternalKExpressions.g:1302:4: ()
                    // InternalKExpressions.g:1303:5: 
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

                    // InternalKExpressions.g:1312:4: ( ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) ) )
                    // InternalKExpressions.g:1313:5: ( (lv_operator_2_0= ruleShiftRightOperator ) ) ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    {
                    // InternalKExpressions.g:1313:5: ( (lv_operator_2_0= ruleShiftRightOperator ) )
                    // InternalKExpressions.g:1314:6: (lv_operator_2_0= ruleShiftRightOperator )
                    {
                    // InternalKExpressions.g:1314:6: (lv_operator_2_0= ruleShiftRightOperator )
                    // InternalKExpressions.g:1315:7: lv_operator_2_0= ruleShiftRightOperator
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

                    // InternalKExpressions.g:1332:5: ( (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression ) )
                    // InternalKExpressions.g:1333:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    {
                    // InternalKExpressions.g:1333:6: (lv_subExpressions_3_0= ruleShiftRightUnsignedExpression )
                    // InternalKExpressions.g:1334:7: lv_subExpressions_3_0= ruleShiftRightUnsignedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
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

                    // InternalKExpressions.g:1352:4: (otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==23) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalKExpressions.g:1353:5: otherlv_4= '>>' ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightExpressionAccess().getGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:1357:5: ( (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression ) )
                    	    // InternalKExpressions.g:1358:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    {
                    	    // InternalKExpressions.g:1358:6: (lv_subExpressions_5_0= ruleShiftRightUnsignedExpression )
                    	    // InternalKExpressions.g:1359:7: lv_subExpressions_5_0= ruleShiftRightUnsignedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightExpressionAccess().getSubExpressionsShiftRightUnsignedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
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
                    	    break loop20;
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
    // InternalKExpressions.g:1382:1: entryRuleShiftRightUnsignedExpression returns [EObject current=null] : iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF ;
    public final EObject entryRuleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftRightUnsignedExpression = null;


        try {
            // InternalKExpressions.g:1382:69: (iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF )
            // InternalKExpressions.g:1383:2: iv_ruleShiftRightUnsignedExpression= ruleShiftRightUnsignedExpression EOF
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
    // InternalKExpressions.g:1389:1: ruleShiftRightUnsignedExpression returns [EObject current=null] : (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) ;
    public final EObject ruleShiftRightUnsignedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SumExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1395:2: ( (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? ) )
            // InternalKExpressions.g:1396:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            {
            // InternalKExpressions.g:1396:2: (this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )? )
            // InternalKExpressions.g:1397:3: this_SumExpression_0= ruleSumExpression ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSumExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_SumExpression_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SumExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1408:3: ( () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalKExpressions.g:1409:4: () ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) ) (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    {
                    // InternalKExpressions.g:1409:4: ()
                    // InternalKExpressions.g:1410:5: 
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

                    // InternalKExpressions.g:1419:4: ( ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) ) )
                    // InternalKExpressions.g:1420:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) ) ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    {
                    // InternalKExpressions.g:1420:5: ( (lv_operator_2_0= ruleShiftRightUnsignedOperator ) )
                    // InternalKExpressions.g:1421:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    {
                    // InternalKExpressions.g:1421:6: (lv_operator_2_0= ruleShiftRightUnsignedOperator )
                    // InternalKExpressions.g:1422:7: lv_operator_2_0= ruleShiftRightUnsignedOperator
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

                    // InternalKExpressions.g:1439:5: ( (lv_subExpressions_3_0= ruleSumExpression ) )
                    // InternalKExpressions.g:1440:6: (lv_subExpressions_3_0= ruleSumExpression )
                    {
                    // InternalKExpressions.g:1440:6: (lv_subExpressions_3_0= ruleSumExpression )
                    // InternalKExpressions.g:1441:7: lv_subExpressions_3_0= ruleSumExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

                    // InternalKExpressions.g:1459:4: (otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==24) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalKExpressions.g:1460:5: otherlv_4= '>>>' ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getShiftRightUnsignedExpressionAccess().getGreaterThanSignGreaterThanSignGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:1464:5: ( (lv_subExpressions_5_0= ruleSumExpression ) )
                    	    // InternalKExpressions.g:1465:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    {
                    	    // InternalKExpressions.g:1465:6: (lv_subExpressions_5_0= ruleSumExpression )
                    	    // InternalKExpressions.g:1466:7: lv_subExpressions_5_0= ruleSumExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getShiftRightUnsignedExpressionAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
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
                    	    break loop22;
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
    // InternalKExpressions.g:1489:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalKExpressions.g:1489:54: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalKExpressions.g:1490:2: iv_ruleSumExpression= ruleSumExpression EOF
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
    // InternalKExpressions.g:1496:1: ruleSumExpression returns [EObject current=null] : (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* ) ;
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
            // InternalKExpressions.g:1502:2: ( (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* ) )
            // InternalKExpressions.g:1503:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* )
            {
            // InternalKExpressions.g:1503:2: (this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )* )
            // InternalKExpressions.g:1504:3: this_ProductExpression_0= ruleProductExpression ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSumExpressionAccess().getProductExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_14);
            this_ProductExpression_0=ruleProductExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ProductExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1515:3: ( ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }
                else if ( (LA26_0==26) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalKExpressions.g:1516:4: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1516:4: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )* )
            	    // InternalKExpressions.g:1517:5: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleProductExpression ) ) (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1517:5: ()
            	    // InternalKExpressions.g:1518:6: 
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

            	    // InternalKExpressions.g:1527:5: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // InternalKExpressions.g:1528:6: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // InternalKExpressions.g:1528:6: (lv_operator_2_0= ruleAddOperator )
            	    // InternalKExpressions.g:1529:7: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_0_1_0());
            	      						
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

            	    // InternalKExpressions.g:1546:5: ( (lv_subExpressions_3_0= ruleProductExpression ) )
            	    // InternalKExpressions.g:1547:6: (lv_subExpressions_3_0= ruleProductExpression )
            	    {
            	    // InternalKExpressions.g:1547:6: (lv_subExpressions_3_0= ruleProductExpression )
            	    // InternalKExpressions.g:1548:7: lv_subExpressions_3_0= ruleProductExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_subExpressions_3_0=ruleProductExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1565:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        alt24 = dfa24.predict(input);
            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1566:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getSumExpressionAccess().getPlusSignKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1570:6: ( (lv_subExpressions_5_0= ruleProductExpression ) )
            	    	    // InternalKExpressions.g:1571:7: (lv_subExpressions_5_0= ruleProductExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1571:7: (lv_subExpressions_5_0= ruleProductExpression )
            	    	    // InternalKExpressions.g:1572:8: lv_subExpressions_5_0= ruleProductExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_subExpressions_5_0=ruleProductExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
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
            	case 2 :
            	    // InternalKExpressions.g:1592:4: ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1592:4: ( () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )* )
            	    // InternalKExpressions.g:1593:5: () ( (lv_operator_7_0= ruleSubOperator ) ) ( (lv_subExpressions_8_0= ruleProductExpression ) ) (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1593:5: ()
            	    // InternalKExpressions.g:1594:6: 
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

            	    // InternalKExpressions.g:1603:5: ( (lv_operator_7_0= ruleSubOperator ) )
            	    // InternalKExpressions.g:1604:6: (lv_operator_7_0= ruleSubOperator )
            	    {
            	    // InternalKExpressions.g:1604:6: (lv_operator_7_0= ruleSubOperator )
            	    // InternalKExpressions.g:1605:7: lv_operator_7_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_1_0());
            	      						
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

            	    // InternalKExpressions.g:1622:5: ( (lv_subExpressions_8_0= ruleProductExpression ) )
            	    // InternalKExpressions.g:1623:6: (lv_subExpressions_8_0= ruleProductExpression )
            	    {
            	    // InternalKExpressions.g:1623:6: (lv_subExpressions_8_0= ruleProductExpression )
            	    // InternalKExpressions.g:1624:7: lv_subExpressions_8_0= ruleProductExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_subExpressions_8_0=ruleProductExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1641:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        alt25 = dfa25.predict(input);
            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1642:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getSumExpressionAccess().getHyphenMinusKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1646:6: ( (lv_subExpressions_10_0= ruleProductExpression ) )
            	    	    // InternalKExpressions.g:1647:7: (lv_subExpressions_10_0= ruleProductExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1647:7: (lv_subExpressions_10_0= ruleProductExpression )
            	    	    // InternalKExpressions.g:1648:8: lv_subExpressions_10_0= ruleProductExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_subExpressions_10_0=ruleProductExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.ProductExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

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
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRuleProductExpression"
    // InternalKExpressions.g:1672:1: entryRuleProductExpression returns [EObject current=null] : iv_ruleProductExpression= ruleProductExpression EOF ;
    public final EObject entryRuleProductExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductExpression = null;


        try {
            // InternalKExpressions.g:1672:58: (iv_ruleProductExpression= ruleProductExpression EOF )
            // InternalKExpressions.g:1673:2: iv_ruleProductExpression= ruleProductExpression EOF
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
    // InternalKExpressions.g:1679:1: ruleProductExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* ) ;
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
            // InternalKExpressions.g:1685:2: ( (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* ) )
            // InternalKExpressions.g:1686:2: (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* )
            {
            // InternalKExpressions.g:1686:2: (this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )* )
            // InternalKExpressions.g:1687:3: this_NegExpression_0= ruleNegExpression ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProductExpressionAccess().getNegExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_15);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NegExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:1698:3: ( ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* ) | ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* ) )*
            loop30:
            do {
                int alt30=4;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    alt30=1;
                    }
                    break;
                case 28:
                    {
                    alt30=2;
                    }
                    break;
                case 29:
                    {
                    alt30=3;
                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // InternalKExpressions.g:1699:4: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1699:4: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )* )
            	    // InternalKExpressions.g:1700:5: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleNegExpression ) ) (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1700:5: ()
            	    // InternalKExpressions.g:1701:6: 
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

            	    // InternalKExpressions.g:1710:5: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // InternalKExpressions.g:1711:6: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // InternalKExpressions.g:1711:6: (lv_operator_2_0= ruleMultOperator )
            	    // InternalKExpressions.g:1712:7: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_0_1_0());
            	      						
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

            	    // InternalKExpressions.g:1729:5: ( (lv_subExpressions_3_0= ruleNegExpression ) )
            	    // InternalKExpressions.g:1730:6: (lv_subExpressions_3_0= ruleNegExpression )
            	    {
            	    // InternalKExpressions.g:1730:6: (lv_subExpressions_3_0= ruleNegExpression )
            	    // InternalKExpressions.g:1731:7: lv_subExpressions_3_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_subExpressions_3_0=ruleNegExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1748:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        alt27 = dfa27.predict(input);
            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1749:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getProductExpressionAccess().getAsteriskKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1753:6: ( (lv_subExpressions_5_0= ruleNegExpression ) )
            	    	    // InternalKExpressions.g:1754:7: (lv_subExpressions_5_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1754:7: (lv_subExpressions_5_0= ruleNegExpression )
            	    	    // InternalKExpressions.g:1755:8: lv_subExpressions_5_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_15);
            	    	    lv_subExpressions_5_0=ruleNegExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
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
            	case 2 :
            	    // InternalKExpressions.g:1775:4: ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1775:4: ( () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )* )
            	    // InternalKExpressions.g:1776:5: () ( (lv_operator_7_0= ruleDivOperator ) ) ( (lv_subExpressions_8_0= ruleNegExpression ) ) (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1776:5: ()
            	    // InternalKExpressions.g:1777:6: 
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

            	    // InternalKExpressions.g:1786:5: ( (lv_operator_7_0= ruleDivOperator ) )
            	    // InternalKExpressions.g:1787:6: (lv_operator_7_0= ruleDivOperator )
            	    {
            	    // InternalKExpressions.g:1787:6: (lv_operator_7_0= ruleDivOperator )
            	    // InternalKExpressions.g:1788:7: lv_operator_7_0= ruleDivOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_1_0());
            	      						
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

            	    // InternalKExpressions.g:1805:5: ( (lv_subExpressions_8_0= ruleNegExpression ) )
            	    // InternalKExpressions.g:1806:6: (lv_subExpressions_8_0= ruleNegExpression )
            	    {
            	    // InternalKExpressions.g:1806:6: (lv_subExpressions_8_0= ruleNegExpression )
            	    // InternalKExpressions.g:1807:7: lv_subExpressions_8_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_subExpressions_8_0=ruleNegExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1824:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        alt28 = dfa28.predict(input);
            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1825:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_9, grammarAccess.getProductExpressionAccess().getSolidusKeyword_1_1_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1829:6: ( (lv_subExpressions_10_0= ruleNegExpression ) )
            	    	    // InternalKExpressions.g:1830:7: (lv_subExpressions_10_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1830:7: (lv_subExpressions_10_0= ruleNegExpression )
            	    	    // InternalKExpressions.g:1831:8: lv_subExpressions_10_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_15);
            	    	    lv_subExpressions_10_0=ruleNegExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalKExpressions.g:1851:4: ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* )
            	    {
            	    // InternalKExpressions.g:1851:4: ( () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )* )
            	    // InternalKExpressions.g:1852:5: () ( (lv_operator_12_0= ruleModOperator ) ) ( (lv_subExpressions_13_0= ruleNegExpression ) ) (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*
            	    {
            	    // InternalKExpressions.g:1852:5: ()
            	    // InternalKExpressions.g:1853:6: 
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

            	    // InternalKExpressions.g:1862:5: ( (lv_operator_12_0= ruleModOperator ) )
            	    // InternalKExpressions.g:1863:6: (lv_operator_12_0= ruleModOperator )
            	    {
            	    // InternalKExpressions.g:1863:6: (lv_operator_12_0= ruleModOperator )
            	    // InternalKExpressions.g:1864:7: lv_operator_12_0= ruleModOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getOperatorModOperatorEnumRuleCall_1_2_1_0());
            	      						
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

            	    // InternalKExpressions.g:1881:5: ( (lv_subExpressions_13_0= ruleNegExpression ) )
            	    // InternalKExpressions.g:1882:6: (lv_subExpressions_13_0= ruleNegExpression )
            	    {
            	    // InternalKExpressions.g:1882:6: (lv_subExpressions_13_0= ruleNegExpression )
            	    // InternalKExpressions.g:1883:7: lv_subExpressions_13_0= ruleNegExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_subExpressions_13_0=ruleNegExpression();

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
            	      								"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalKExpressions.g:1900:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        alt29 = dfa29.predict(input);
            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalKExpressions.g:1901:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_14, grammarAccess.getProductExpressionAccess().getPercentSignKeyword_1_2_3_0());
            	    	      					
            	    	    }
            	    	    // InternalKExpressions.g:1905:6: ( (lv_subExpressions_15_0= ruleNegExpression ) )
            	    	    // InternalKExpressions.g:1906:7: (lv_subExpressions_15_0= ruleNegExpression )
            	    	    {
            	    	    // InternalKExpressions.g:1906:7: (lv_subExpressions_15_0= ruleNegExpression )
            	    	    // InternalKExpressions.g:1907:8: lv_subExpressions_15_0= ruleNegExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_15);
            	    	    lv_subExpressions_15_0=ruleNegExpression();

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
            	    	      									"de.cau.cs.kieler.kexpressions.KExpressions.NegExpression");
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


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleProductExpression"


    // $ANTLR start "entryRuleNegExpression"
    // InternalKExpressions.g:1931:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // InternalKExpressions.g:1931:54: (iv_ruleNegExpression= ruleNegExpression EOF )
            // InternalKExpressions.g:1932:2: iv_ruleNegExpression= ruleNegExpression EOF
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
    // InternalKExpressions.g:1938:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_TernaryOperation_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:1944:2: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation ) )
            // InternalKExpressions.g:1945:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            {
            // InternalKExpressions.g:1945:2: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_TernaryOperation_3= ruleTernaryOperation )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_COMMENT_ANNOTATION)||LA31_0==34||LA31_0==37||(LA31_0>=43 && LA31_0<=46)||LA31_0==52||LA31_0==59||LA31_0==62) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalKExpressions.g:1946:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // InternalKExpressions.g:1946:3: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // InternalKExpressions.g:1947:4: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // InternalKExpressions.g:1947:4: ()
                    // InternalKExpressions.g:1948:5: 
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

                    // InternalKExpressions.g:1957:4: ( (lv_operator_1_0= ruleSubOperator ) )
                    // InternalKExpressions.g:1958:5: (lv_operator_1_0= ruleSubOperator )
                    {
                    // InternalKExpressions.g:1958:5: (lv_operator_1_0= ruleSubOperator )
                    // InternalKExpressions.g:1959:6: lv_operator_1_0= ruleSubOperator
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

                    // InternalKExpressions.g:1976:4: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // InternalKExpressions.g:1977:5: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // InternalKExpressions.g:1977:5: (lv_subExpressions_2_0= ruleNegExpression )
                    // InternalKExpressions.g:1978:6: lv_subExpressions_2_0= ruleNegExpression
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
                    // InternalKExpressions.g:1997:3: this_TernaryOperation_3= ruleTernaryOperation
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
    // InternalKExpressions.g:2012:1: entryRuleTernaryOperation returns [EObject current=null] : iv_ruleTernaryOperation= ruleTernaryOperation EOF ;
    public final EObject entryRuleTernaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryOperation = null;


        try {
            // InternalKExpressions.g:2012:57: (iv_ruleTernaryOperation= ruleTernaryOperation EOF )
            // InternalKExpressions.g:2013:2: iv_ruleTernaryOperation= ruleTernaryOperation EOF
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
    // InternalKExpressions.g:2019:1: ruleTernaryOperation returns [EObject current=null] : ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression ) ;
    public final EObject ruleTernaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_InitExpression_6 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2025:2: ( ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression ) )
            // InternalKExpressions.g:2026:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )
            {
            // InternalKExpressions.g:2026:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalKExpressions.g:2027:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
                    {
                    // InternalKExpressions.g:2027:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
                    // InternalKExpressions.g:2028:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
                    {
                    // InternalKExpressions.g:2028:4: ()
                    // InternalKExpressions.g:2029:5: 
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

                    // InternalKExpressions.g:2038:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:2039:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:2039:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:2040:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
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

                    // InternalKExpressions.g:2057:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
                    // InternalKExpressions.g:2058:5: (lv_operator_2_0= ruleConditionalOperator )
                    {
                    // InternalKExpressions.g:2058:5: (lv_operator_2_0= ruleConditionalOperator )
                    // InternalKExpressions.g:2059:6: lv_operator_2_0= ruleConditionalOperator
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
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

                    // InternalKExpressions.g:2076:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:2077:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:2077:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:2078:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
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

                    // InternalKExpressions.g:2095:4: (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==30) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalKExpressions.g:2096:5: otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                            {
                            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTernaryOperationAccess().getColonKeyword_0_4_0());
                              				
                            }
                            // InternalKExpressions.g:2100:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                            // InternalKExpressions.g:2101:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                            {
                            // InternalKExpressions.g:2101:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                            // InternalKExpressions.g:2102:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_4_1_0());
                              						
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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2122:3: this_InitExpression_6= ruleInitExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTernaryOperationAccess().getInitExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InitExpression_6=ruleInitExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitExpression_6;
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


    // $ANTLR start "entryRuleInitExpression"
    // InternalKExpressions.g:2137:1: entryRuleInitExpression returns [EObject current=null] : iv_ruleInitExpression= ruleInitExpression EOF ;
    public final EObject entryRuleInitExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitExpression = null;


        try {
            // InternalKExpressions.g:2137:55: (iv_ruleInitExpression= ruleInitExpression EOF )
            // InternalKExpressions.g:2138:2: iv_ruleInitExpression= ruleInitExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInitExpression=ruleInitExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitExpression; 
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
    // $ANTLR end "entryRuleInitExpression"


    // $ANTLR start "ruleInitExpression"
    // InternalKExpressions.g:2144:1: ruleInitExpression returns [EObject current=null] : (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? ) ;
    public final EObject ruleInitExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_FbyExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2150:2: ( (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? ) )
            // InternalKExpressions.g:2151:2: (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? )
            {
            // InternalKExpressions.g:2151:2: (this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )? )
            // InternalKExpressions.g:2152:3: this_FbyExpression_0= ruleFbyExpression ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInitExpressionAccess().getFbyExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_FbyExpression_0=ruleFbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FbyExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2163:3: ( () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalKExpressions.g:2164:4: () ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) ) (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )*
                    {
                    // InternalKExpressions.g:2164:4: ()
                    // InternalKExpressions.g:2165:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getInitExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:2174:4: ( ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) ) )
                    // InternalKExpressions.g:2175:5: ( (lv_operator_2_0= ruleInitOperator ) ) ( (lv_subExpressions_3_0= ruleFbyExpression ) )
                    {
                    // InternalKExpressions.g:2175:5: ( (lv_operator_2_0= ruleInitOperator ) )
                    // InternalKExpressions.g:2176:6: (lv_operator_2_0= ruleInitOperator )
                    {
                    // InternalKExpressions.g:2176:6: (lv_operator_2_0= ruleInitOperator )
                    // InternalKExpressions.g:2177:7: lv_operator_2_0= ruleInitOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getInitExpressionAccess().getOperatorInitOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleInitOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getInitExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.InitOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:2194:5: ( (lv_subExpressions_3_0= ruleFbyExpression ) )
                    // InternalKExpressions.g:2195:6: (lv_subExpressions_3_0= ruleFbyExpression )
                    {
                    // InternalKExpressions.g:2195:6: (lv_subExpressions_3_0= ruleFbyExpression )
                    // InternalKExpressions.g:2196:7: lv_subExpressions_3_0= ruleFbyExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsFbyExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_subExpressions_3_0=ruleFbyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getInitExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.FbyExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2214:4: (otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==31) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalKExpressions.g:2215:5: otherlv_4= '->' ( (lv_subExpressions_5_0= ruleFbyExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getInitExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:2219:5: ( (lv_subExpressions_5_0= ruleFbyExpression ) )
                    	    // InternalKExpressions.g:2220:6: (lv_subExpressions_5_0= ruleFbyExpression )
                    	    {
                    	    // InternalKExpressions.g:2220:6: (lv_subExpressions_5_0= ruleFbyExpression )
                    	    // InternalKExpressions.g:2221:7: lv_subExpressions_5_0= ruleFbyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getInitExpressionAccess().getSubExpressionsFbyExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_subExpressions_5_0=ruleFbyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getInitExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.FbyExpression");
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
    // $ANTLR end "ruleInitExpression"


    // $ANTLR start "entryRuleFbyExpression"
    // InternalKExpressions.g:2244:1: entryRuleFbyExpression returns [EObject current=null] : iv_ruleFbyExpression= ruleFbyExpression EOF ;
    public final EObject entryRuleFbyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFbyExpression = null;


        try {
            // InternalKExpressions.g:2244:54: (iv_ruleFbyExpression= ruleFbyExpression EOF )
            // InternalKExpressions.g:2245:2: iv_ruleFbyExpression= ruleFbyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFbyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFbyExpression=ruleFbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFbyExpression; 
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
    // $ANTLR end "entryRuleFbyExpression"


    // $ANTLR start "ruleFbyExpression"
    // InternalKExpressions.g:2251:1: ruleFbyExpression returns [EObject current=null] : (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? ) ;
    public final EObject ruleFbyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SfbyExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2257:2: ( (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? ) )
            // InternalKExpressions.g:2258:2: (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? )
            {
            // InternalKExpressions.g:2258:2: (this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )? )
            // InternalKExpressions.g:2259:3: this_SfbyExpression_0= ruleSfbyExpression ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFbyExpressionAccess().getSfbyExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_SfbyExpression_0=ruleSfbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SfbyExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2270:3: ( () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalKExpressions.g:2271:4: () ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) ) (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )*
                    {
                    // InternalKExpressions.g:2271:4: ()
                    // InternalKExpressions.g:2272:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getFbyExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:2281:4: ( ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) ) )
                    // InternalKExpressions.g:2282:5: ( (lv_operator_2_0= ruleFbyOperator ) ) ( (lv_subExpressions_3_0= ruleSfbyExpression ) )
                    {
                    // InternalKExpressions.g:2282:5: ( (lv_operator_2_0= ruleFbyOperator ) )
                    // InternalKExpressions.g:2283:6: (lv_operator_2_0= ruleFbyOperator )
                    {
                    // InternalKExpressions.g:2283:6: (lv_operator_2_0= ruleFbyOperator )
                    // InternalKExpressions.g:2284:7: lv_operator_2_0= ruleFbyOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFbyExpressionAccess().getOperatorFbyOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
                    lv_operator_2_0=ruleFbyOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFbyExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.FbyOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:2301:5: ( (lv_subExpressions_3_0= ruleSfbyExpression ) )
                    // InternalKExpressions.g:2302:6: (lv_subExpressions_3_0= ruleSfbyExpression )
                    {
                    // InternalKExpressions.g:2302:6: (lv_subExpressions_3_0= ruleSfbyExpression )
                    // InternalKExpressions.g:2303:7: lv_subExpressions_3_0= ruleSfbyExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFbyExpressionAccess().getSubExpressionsSfbyExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_subExpressions_3_0=ruleSfbyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFbyExpressionRule());
                      							}
                      							add(
                      								current,
                      								"subExpressions",
                      								lv_subExpressions_3_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SfbyExpression");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalKExpressions.g:2321:4: (otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==32) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalKExpressions.g:2322:5: otherlv_4= 'fby' ( (lv_subExpressions_5_0= ruleSfbyExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getFbyExpressionAccess().getFbyKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:2326:5: ( (lv_subExpressions_5_0= ruleSfbyExpression ) )
                    	    // InternalKExpressions.g:2327:6: (lv_subExpressions_5_0= ruleSfbyExpression )
                    	    {
                    	    // InternalKExpressions.g:2327:6: (lv_subExpressions_5_0= ruleSfbyExpression )
                    	    // InternalKExpressions.g:2328:7: lv_subExpressions_5_0= ruleSfbyExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFbyExpressionAccess().getSubExpressionsSfbyExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_20);
                    	    lv_subExpressions_5_0=ruleSfbyExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFbyExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"subExpressions",
                    	      								lv_subExpressions_5_0,
                    	      								"de.cau.cs.kieler.kexpressions.KExpressions.SfbyExpression");
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
    // $ANTLR end "ruleFbyExpression"


    // $ANTLR start "entryRuleSfbyExpression"
    // InternalKExpressions.g:2351:1: entryRuleSfbyExpression returns [EObject current=null] : iv_ruleSfbyExpression= ruleSfbyExpression EOF ;
    public final EObject entryRuleSfbyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSfbyExpression = null;


        try {
            // InternalKExpressions.g:2351:55: (iv_ruleSfbyExpression= ruleSfbyExpression EOF )
            // InternalKExpressions.g:2352:2: iv_ruleSfbyExpression= ruleSfbyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSfbyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSfbyExpression=ruleSfbyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSfbyExpression; 
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
    // $ANTLR end "entryRuleSfbyExpression"


    // $ANTLR start "ruleSfbyExpression"
    // InternalKExpressions.g:2358:1: ruleSfbyExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) ;
    public final EObject ruleSfbyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2364:2: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? ) )
            // InternalKExpressions.g:2365:2: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            {
            // InternalKExpressions.g:2365:2: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )? )
            // InternalKExpressions.g:2366:3: this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSfbyExpressionAccess().getAtomicValuedExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AtomicValuedExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalKExpressions.g:2377:3: ( () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalKExpressions.g:2378:4: () ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    {
                    // InternalKExpressions.g:2378:4: ()
                    // InternalKExpressions.g:2379:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getSfbyExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalKExpressions.g:2388:4: ( ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
                    // InternalKExpressions.g:2389:5: ( (lv_operator_2_0= ruleSfbyOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // InternalKExpressions.g:2389:5: ( (lv_operator_2_0= ruleSfbyOperator ) )
                    // InternalKExpressions.g:2390:6: (lv_operator_2_0= ruleSfbyOperator )
                    {
                    // InternalKExpressions.g:2390:6: (lv_operator_2_0= ruleSfbyOperator )
                    // InternalKExpressions.g:2391:7: lv_operator_2_0= ruleSfbyOperator
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSfbyExpressionAccess().getOperatorSfbyOperatorEnumRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_operator_2_0=ruleSfbyOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSfbyExpressionRule());
                      							}
                      							set(
                      								current,
                      								"operator",
                      								lv_operator_2_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.SfbyOperator");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:2408:5: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // InternalKExpressions.g:2409:6: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // InternalKExpressions.g:2409:6: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // InternalKExpressions.g:2410:7: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getSfbyExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getSfbyExpressionRule());
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

                    // InternalKExpressions.g:2428:4: (otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==33) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalKExpressions.g:2429:5: otherlv_4= 'sfby' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getSfbyExpressionAccess().getSfbyKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:2433:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                    	    // InternalKExpressions.g:2434:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    {
                    	    // InternalKExpressions.g:2434:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                    	    // InternalKExpressions.g:2435:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSfbyExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_21);
                    	    lv_subExpressions_5_0=ruleAtomicValuedExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSfbyExpressionRule());
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
    // $ANTLR end "ruleSfbyExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalKExpressions.g:2458:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // InternalKExpressions.g:2458:57: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // InternalKExpressions.g:2459:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
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
    // InternalKExpressions.g:2465:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BoolValue_0 = null;

        EObject this_BoolExpression_2 = null;

        EObject this_ReferenceCall_4 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_RandomCall_6 = null;

        EObject this_RandomizeCall_7 = null;

        EObject this_ValuedObjectTestExpression_8 = null;

        EObject this_SpecialAccessExpression_9 = null;

        EObject this_TextExpression_10 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2471:2: ( (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression ) )
            // InternalKExpressions.g:2472:2: (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression )
            {
            // InternalKExpressions.g:2472:2: (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression )
            int alt40=9;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalKExpressions.g:2473:3: this_BoolValue_0= ruleBoolValue
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
                    // InternalKExpressions.g:2485:3: (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' )
                    {
                    // InternalKExpressions.g:2485:3: (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' )
                    // InternalKExpressions.g:2486:4: otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_BoolExpression_2=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_BoolExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:2507:3: this_ReferenceCall_4= ruleReferenceCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getReferenceCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceCall_4=ruleReferenceCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReferenceCall_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:2519:3: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionCall_5=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionCall_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:2531:3: this_RandomCall_6= ruleRandomCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomCallParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomCall_6=ruleRandomCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2543:3: this_RandomizeCall_7= ruleRandomizeCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getRandomizeCallParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RandomizeCall_7=ruleRandomizeCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RandomizeCall_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalKExpressions.g:2555:3: this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ValuedObjectTestExpression_8=ruleValuedObjectTestExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ValuedObjectTestExpression_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalKExpressions.g:2567:3: this_SpecialAccessExpression_9= ruleSpecialAccessExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getSpecialAccessExpressionParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SpecialAccessExpression_9=ruleSpecialAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecialAccessExpression_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalKExpressions.g:2579:3: this_TextExpression_10= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TextExpression_10=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TextExpression_10;
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
    // InternalKExpressions.g:2594:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // InternalKExpressions.g:2594:63: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // InternalKExpressions.g:2595:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
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
    // InternalKExpressions.g:2601:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) ;
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
            // InternalKExpressions.g:2607:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression ) )
            // InternalKExpressions.g:2608:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            {
            // InternalKExpressions.g:2608:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )
            int alt41=6;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalKExpressions.g:2609:3: this_IntValue_0= ruleIntValue
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
                    // InternalKExpressions.g:2621:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKExpressions.g:2633:3: this_StringValue_2= ruleStringValue
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
                    // InternalKExpressions.g:2645:3: this_VectorValue_3= ruleVectorValue
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
                    // InternalKExpressions.g:2657:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    {
                    // InternalKExpressions.g:2657:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
                    // InternalKExpressions.g:2658:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_ValuedExpression_5=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ValuedExpression_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:2679:3: this_AtomicExpression_7= ruleAtomicExpression
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
    // InternalKExpressions.g:2694:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // InternalKExpressions.g:2694:67: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // InternalKExpressions.g:2695:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
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
    // InternalKExpressions.g:2701:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) ;
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
            // InternalKExpressions.g:2707:2: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference ) )
            // InternalKExpressions.g:2708:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            {
            // InternalKExpressions.g:2708:2: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' ) | this_ValuedObjectReference_7= ruleValuedObjectReference )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==59||LA44_0==62) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalKExpressions.g:2709:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    {
                    // InternalKExpressions.g:2709:3: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')' )
                    // InternalKExpressions.g:2710:4: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )? otherlv_6= ')'
                    {
                    // InternalKExpressions.g:2710:4: ()
                    // InternalKExpressions.g:2711:5: 
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

                    // InternalKExpressions.g:2720:4: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // InternalKExpressions.g:2721:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // InternalKExpressions.g:2721:5: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // InternalKExpressions.g:2722:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // InternalKExpressions.g:2722:6: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==59) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==62) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalKExpressions.g:2723:7: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_23);
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
                            // InternalKExpressions.g:2739:7: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_23);
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

                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                      			
                    }
                    // InternalKExpressions.g:2761:4: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // InternalKExpressions.g:2762:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // InternalKExpressions.g:2762:5: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // InternalKExpressions.g:2763:6: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKExpressions.g:2780:4: (otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==36) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalKExpressions.g:2781:5: otherlv_4= ',' ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            {
                            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getCommaKeyword_0_4_0());
                              				
                            }
                            // InternalKExpressions.g:2785:5: ( (lv_subExpressions_5_0= ruleValuedObjectReference ) )
                            // InternalKExpressions.g:2786:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            {
                            // InternalKExpressions.g:2786:6: (lv_subExpressions_5_0= ruleValuedObjectReference )
                            // InternalKExpressions.g:2787:7: lv_subExpressions_5_0= ruleValuedObjectReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_22);
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

                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_5());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:2811:3: this_ValuedObjectReference_7= ruleValuedObjectReference
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


    // $ANTLR start "entryRuleSpecialAccessExpression"
    // InternalKExpressions.g:2826:1: entryRuleSpecialAccessExpression returns [EObject current=null] : iv_ruleSpecialAccessExpression= ruleSpecialAccessExpression EOF ;
    public final EObject entryRuleSpecialAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialAccessExpression = null;


        try {
            // InternalKExpressions.g:2826:64: (iv_ruleSpecialAccessExpression= ruleSpecialAccessExpression EOF )
            // InternalKExpressions.g:2827:2: iv_ruleSpecialAccessExpression= ruleSpecialAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecialAccessExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecialAccessExpression=ruleSpecialAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecialAccessExpression; 
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
    // $ANTLR end "entryRuleSpecialAccessExpression"


    // $ANTLR start "ruleSpecialAccessExpression"
    // InternalKExpressions.g:2833:1: ruleSpecialAccessExpression returns [EObject current=null] : ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) ) ;
    public final EObject ruleSpecialAccessExpression() throws RecognitionException {
        EObject current = null;

        Token lv_access_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_subReference_7_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2839:2: ( ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) ) )
            // InternalKExpressions.g:2840:2: ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) )
            {
            // InternalKExpressions.g:2840:2: ( ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) ) )
            // InternalKExpressions.g:2841:3: ( (lv_access_0_0= 'static' ) ) otherlv_1= '(' ( ( ( rulePrimeID ) ) otherlv_3= '.' )? ( ( rulePrimeID ) ) otherlv_5= ')' otherlv_6= '.' ( (lv_subReference_7_0= ruleValuedObjectReference ) )
            {
            // InternalKExpressions.g:2841:3: ( (lv_access_0_0= 'static' ) )
            // InternalKExpressions.g:2842:4: (lv_access_0_0= 'static' )
            {
            // InternalKExpressions.g:2842:4: (lv_access_0_0= 'static' )
            // InternalKExpressions.g:2843:5: lv_access_0_0= 'static'
            {
            lv_access_0_0=(Token)match(input,37,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_access_0_0, grammarAccess.getSpecialAccessExpressionAccess().getAccessStaticKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpecialAccessExpressionRule());
              					}
              					setWithLastConsumed(current, "access", lv_access_0_0, "static");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSpecialAccessExpressionAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalKExpressions.g:2859:3: ( ( ( rulePrimeID ) ) otherlv_3= '.' )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalKExpressions.g:2860:4: ( ( rulePrimeID ) ) otherlv_3= '.'
                    {
                    // InternalKExpressions.g:2860:4: ( ( rulePrimeID ) )
                    // InternalKExpressions.g:2861:5: ( rulePrimeID )
                    {
                    // InternalKExpressions.g:2861:5: ( rulePrimeID )
                    // InternalKExpressions.g:2862:6: rulePrimeID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSpecialAccessExpressionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSpecialAccessExpressionAccess().getContainerNamedObjectCrossReference_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    rulePrimeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getSpecialAccessExpressionAccess().getFullStopKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalKExpressions.g:2884:3: ( ( rulePrimeID ) )
            // InternalKExpressions.g:2885:4: ( rulePrimeID )
            {
            // InternalKExpressions.g:2885:4: ( rulePrimeID )
            // InternalKExpressions.g:2886:5: rulePrimeID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSpecialAccessExpressionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialAccessExpressionAccess().getTargetNamedObjectCrossReference_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSpecialAccessExpressionAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_6=(Token)match(input,38,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSpecialAccessExpressionAccess().getFullStopKeyword_5());
              		
            }
            // InternalKExpressions.g:2911:3: ( (lv_subReference_7_0= ruleValuedObjectReference ) )
            // InternalKExpressions.g:2912:4: (lv_subReference_7_0= ruleValuedObjectReference )
            {
            // InternalKExpressions.g:2912:4: (lv_subReference_7_0= ruleValuedObjectReference )
            // InternalKExpressions.g:2913:5: lv_subReference_7_0= ruleValuedObjectReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSpecialAccessExpressionAccess().getSubReferenceValuedObjectReferenceParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_subReference_7_0=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSpecialAccessExpressionRule());
              					}
              					set(
              						current,
              						"subReference",
              						lv_subReference_7_0,
              						"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
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
    // $ANTLR end "ruleSpecialAccessExpression"


    // $ANTLR start "entryRulePrimeID"
    // InternalKExpressions.g:2934:1: entryRulePrimeID returns [String current=null] : iv_rulePrimeID= rulePrimeID EOF ;
    public final String entryRulePrimeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimeID = null;


        try {
            // InternalKExpressions.g:2934:47: (iv_rulePrimeID= rulePrimeID EOF )
            // InternalKExpressions.g:2935:2: iv_rulePrimeID= rulePrimeID EOF
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
    // InternalKExpressions.g:2941:1: rulePrimeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '\\'' )* ) ;
    public final AntlrDatatypeRuleToken rulePrimeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalKExpressions.g:2947:2: ( (this_ID_0= RULE_ID (kw= '\\'' )* ) )
            // InternalKExpressions.g:2948:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            {
            // InternalKExpressions.g:2948:2: (this_ID_0= RULE_ID (kw= '\\'' )* )
            // InternalKExpressions.g:2949:3: this_ID_0= RULE_ID (kw= '\\'' )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getPrimeIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKExpressions.g:2956:3: (kw= '\\'' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==39) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalKExpressions.g:2957:4: kw= '\\''
            	    {
            	    kw=(Token)match(input,39,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getPrimeIDAccess().getApostropheKeyword_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalKExpressions.g:2967:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // InternalKExpressions.g:2967:62: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // InternalKExpressions.g:2968:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
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
    // InternalKExpressions.g:2974:1: ruleValuedObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:2980:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ) )
            // InternalKExpressions.g:2981:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            {
            // InternalKExpressions.g:2981:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? )
            // InternalKExpressions.g:2982:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            {
            // InternalKExpressions.g:2982:3: ( ( rulePrimeID ) )
            // InternalKExpressions.g:2983:4: ( rulePrimeID )
            {
            // InternalKExpressions.g:2983:4: ( rulePrimeID )
            // InternalKExpressions.g:2984:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_29);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:3001:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==40) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalKExpressions.g:3002:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKExpressions.g:3006:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKExpressions.g:3007:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKExpressions.g:3007:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKExpressions.g:3008:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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

            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalKExpressions.g:3030:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalKExpressions.g:3031:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getValuedObjectReferenceAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKExpressions.g:3035:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKExpressions.g:3036:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:3036:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKExpressions.g:3037:6: lv_subReference_5_0= ruleValuedObjectReference
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


    // $ANTLR start "entryRuleScheduleObjectReference"
    // InternalKExpressions.g:3059:1: entryRuleScheduleObjectReference returns [EObject current=null] : iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF ;
    public final EObject entryRuleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleObjectReference = null;


        try {
            // InternalKExpressions.g:3059:64: (iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF )
            // InternalKExpressions.g:3060:2: iv_ruleScheduleObjectReference= ruleScheduleObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScheduleObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScheduleObjectReference=ruleScheduleObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScheduleObjectReference; 
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
    // $ANTLR end "entryRuleScheduleObjectReference"


    // $ANTLR start "ruleScheduleObjectReference"
    // InternalKExpressions.g:3066:1: ruleScheduleObjectReference returns [EObject current=null] : ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) ;
    public final EObject ruleScheduleObjectReference() throws RecognitionException {
        EObject current = null;

        Token lv_priority_1_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3072:2: ( ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) ) )
            // InternalKExpressions.g:3073:2: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            {
            // InternalKExpressions.g:3073:2: ( ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) ) )
            // InternalKExpressions.g:3074:3: ( ( rulePrimeID ) ) ( (lv_priority_1_0= RULE_INT ) )
            {
            // InternalKExpressions.g:3074:3: ( ( rulePrimeID ) )
            // InternalKExpressions.g:3075:4: ( rulePrimeID )
            {
            // InternalKExpressions.g:3075:4: ( rulePrimeID )
            // InternalKExpressions.g:3076:5: rulePrimeID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScheduleObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:3093:3: ( (lv_priority_1_0= RULE_INT ) )
            // InternalKExpressions.g:3094:4: (lv_priority_1_0= RULE_INT )
            {
            // InternalKExpressions.g:3094:4: (lv_priority_1_0= RULE_INT )
            // InternalKExpressions.g:3095:5: lv_priority_1_0= RULE_INT
            {
            lv_priority_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_priority_1_0, grammarAccess.getScheduleObjectReferenceAccess().getPriorityINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getScheduleObjectReferenceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"priority",
              						lv_priority_1_0,
              						"de.cau.cs.kieler.annotations.Annotations.INT");
              				
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
    // $ANTLR end "ruleScheduleObjectReference"


    // $ANTLR start "entryRuleReferenceCall"
    // InternalKExpressions.g:3115:1: entryRuleReferenceCall returns [EObject current=null] : iv_ruleReferenceCall= ruleReferenceCall EOF ;
    public final EObject entryRuleReferenceCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceCall = null;


        try {
            // InternalKExpressions.g:3115:54: (iv_ruleReferenceCall= ruleReferenceCall EOF )
            // InternalKExpressions.g:3116:2: iv_ruleReferenceCall= ruleReferenceCall EOF
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
    // InternalKExpressions.g:3122:1: ruleReferenceCall returns [EObject current=null] : ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) ) ;
    public final EObject ruleReferenceCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_indices_2_0 = null;

        EObject lv_subReference_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3128:2: ( ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) ) )
            // InternalKExpressions.g:3129:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) )
            {
            // InternalKExpressions.g:3129:2: ( ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' ) )
            // InternalKExpressions.g:3130:3: ( ( rulePrimeID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )? ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' )
            {
            // InternalKExpressions.g:3130:3: ( ( rulePrimeID ) )
            // InternalKExpressions.g:3131:4: ( rulePrimeID )
            {
            // InternalKExpressions.g:3131:4: ( rulePrimeID )
            // InternalKExpressions.g:3132:5: rulePrimeID
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
            pushFollow(FollowSets000.FOLLOW_32);
            rulePrimeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalKExpressions.g:3149:3: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==40) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalKExpressions.g:3150:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getReferenceCallAccess().getLeftSquareBracketKeyword_1_0());
            	      			
            	    }
            	    // InternalKExpressions.g:3154:4: ( (lv_indices_2_0= ruleExpression ) )
            	    // InternalKExpressions.g:3155:5: (lv_indices_2_0= ruleExpression )
            	    {
            	    // InternalKExpressions.g:3155:5: (lv_indices_2_0= ruleExpression )
            	    // InternalKExpressions.g:3156:6: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getReferenceCallAccess().getIndicesExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getReferenceCallRule());
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

            	    otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getReferenceCallAccess().getRightSquareBracketKeyword_1_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalKExpressions.g:3178:3: (otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalKExpressions.g:3179:4: otherlv_4= '.' ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getReferenceCallAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalKExpressions.g:3183:4: ( (lv_subReference_5_0= ruleValuedObjectReference ) )
                    // InternalKExpressions.g:3184:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:3184:5: (lv_subReference_5_0= ruleValuedObjectReference )
                    // InternalKExpressions.g:3185:6: lv_subReference_5_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReferenceCallAccess().getSubReferenceValuedObjectReferenceParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_subReference_5_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReferenceCallRule());
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

            // InternalKExpressions.g:3203:3: ( (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' ) | otherlv_11= '()' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==34) ) {
                alt52=1;
            }
            else if ( (LA52_0==42) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalKExpressions.g:3204:4: (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' )
                    {
                    // InternalKExpressions.g:3204:4: (otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')' )
                    // InternalKExpressions.g:3205:5: otherlv_6= '(' ( (lv_parameters_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getReferenceCallAccess().getLeftParenthesisKeyword_3_0_0());
                      				
                    }
                    // InternalKExpressions.g:3209:5: ( (lv_parameters_7_0= ruleParameter ) )
                    // InternalKExpressions.g:3210:6: (lv_parameters_7_0= ruleParameter )
                    {
                    // InternalKExpressions.g:3210:6: (lv_parameters_7_0= ruleParameter )
                    // InternalKExpressions.g:3211:7: lv_parameters_7_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_3_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_parameters_7_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                      							}
                      							add(
                      								current,
                      								"parameters",
                      								lv_parameters_7_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:3228:5: (otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==36) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalKExpressions.g:3229:6: otherlv_8= ',' ( (lv_parameters_9_0= ruleParameter ) )
                    	    {
                    	    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_8, grammarAccess.getReferenceCallAccess().getCommaKeyword_3_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:3233:6: ( (lv_parameters_9_0= ruleParameter ) )
                    	    // InternalKExpressions.g:3234:7: (lv_parameters_9_0= ruleParameter )
                    	    {
                    	    // InternalKExpressions.g:3234:7: (lv_parameters_9_0= ruleParameter )
                    	    // InternalKExpressions.g:3235:8: lv_parameters_9_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getReferenceCallAccess().getParametersParameterParserRuleCall_3_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_parameters_9_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getReferenceCallRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"parameters",
                    	      									lv_parameters_9_0,
                    	      									"de.cau.cs.kieler.kexpressions.KExpressions.Parameter");
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

                    otherlv_10=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getReferenceCallAccess().getRightParenthesisKeyword_3_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3259:4: otherlv_11= '()'
                    {
                    otherlv_11=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getReferenceCallAccess().getLeftParenthesisRightParenthesisKeyword_3_1());
                      			
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
    // InternalKExpressions.g:3268:1: entryRuleRandomCall returns [EObject current=null] : iv_ruleRandomCall= ruleRandomCall EOF ;
    public final EObject entryRuleRandomCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomCall = null;


        try {
            // InternalKExpressions.g:3268:51: (iv_ruleRandomCall= ruleRandomCall EOF )
            // InternalKExpressions.g:3269:2: iv_ruleRandomCall= ruleRandomCall EOF
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
    // InternalKExpressions.g:3275:1: ruleRandomCall returns [EObject current=null] : ( () otherlv_1= 'random' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3281:2: ( ( () otherlv_1= 'random' (otherlv_2= '()' )? ) )
            // InternalKExpressions.g:3282:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            {
            // InternalKExpressions.g:3282:2: ( () otherlv_1= 'random' (otherlv_2= '()' )? )
            // InternalKExpressions.g:3283:3: () otherlv_1= 'random' (otherlv_2= '()' )?
            {
            // InternalKExpressions.g:3283:3: ()
            // InternalKExpressions.g:3284:4: 
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

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomCallAccess().getRandomKeyword_1());
              		
            }
            // InternalKExpressions.g:3297:3: (otherlv_2= '()' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalKExpressions.g:3298:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:3307:1: entryRuleRandomizeCall returns [EObject current=null] : iv_ruleRandomizeCall= ruleRandomizeCall EOF ;
    public final EObject entryRuleRandomizeCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandomizeCall = null;


        try {
            // InternalKExpressions.g:3307:54: (iv_ruleRandomizeCall= ruleRandomizeCall EOF )
            // InternalKExpressions.g:3308:2: iv_ruleRandomizeCall= ruleRandomizeCall EOF
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
    // InternalKExpressions.g:3314:1: ruleRandomizeCall returns [EObject current=null] : ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) ;
    public final EObject ruleRandomizeCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3320:2: ( ( () otherlv_1= 'randomize' (otherlv_2= '()' )? ) )
            // InternalKExpressions.g:3321:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            {
            // InternalKExpressions.g:3321:2: ( () otherlv_1= 'randomize' (otherlv_2= '()' )? )
            // InternalKExpressions.g:3322:3: () otherlv_1= 'randomize' (otherlv_2= '()' )?
            {
            // InternalKExpressions.g:3322:3: ()
            // InternalKExpressions.g:3323:4: 
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

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRandomizeCallAccess().getRandomizeKeyword_1());
              		
            }
            // InternalKExpressions.g:3336:3: (otherlv_2= '()' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalKExpressions.g:3337:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:3346:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalKExpressions.g:3346:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalKExpressions.g:3347:2: iv_ruleFunctionCall= ruleFunctionCall EOF
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
    // InternalKExpressions.g:3353:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) ;
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
            // InternalKExpressions.g:3359:2: ( (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) ) )
            // InternalKExpressions.g:3360:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            {
            // InternalKExpressions.g:3360:2: (otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' ) )
            // InternalKExpressions.g:3361:3: otherlv_0= 'extern' ( (lv_functionName_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getExternKeyword_0());
              		
            }
            // InternalKExpressions.g:3365:3: ( (lv_functionName_1_0= RULE_ID ) )
            // InternalKExpressions.g:3366:4: (lv_functionName_1_0= RULE_ID )
            {
            // InternalKExpressions.g:3366:4: (lv_functionName_1_0= RULE_ID )
            // InternalKExpressions.g:3367:5: lv_functionName_1_0= RULE_ID
            {
            lv_functionName_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); if (state.failed) return current;
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

            // InternalKExpressions.g:3383:3: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            else if ( (LA56_0==42) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalKExpressions.g:3384:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // InternalKExpressions.g:3384:4: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // InternalKExpressions.g:3385:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                      				
                    }
                    // InternalKExpressions.g:3389:5: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalKExpressions.g:3390:6: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalKExpressions.g:3390:6: (lv_parameters_3_0= ruleParameter )
                    // InternalKExpressions.g:3391:7: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
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

                    // InternalKExpressions.g:3408:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==36) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalKExpressions.g:3409:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:3413:6: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalKExpressions.g:3414:7: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalKExpressions.g:3414:7: (lv_parameters_5_0= ruleParameter )
                    	    // InternalKExpressions.g:3415:8: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3439:4: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:3448:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalKExpressions.g:3448:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalKExpressions.g:3449:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalKExpressions.g:3455:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_accessType_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3461:2: ( ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalKExpressions.g:3462:2: ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalKExpressions.g:3462:2: ( ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) ) | ( (lv_expression_2_0= ruleExpression ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21||LA57_0==64) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_COMMENT_ANNOTATION)||LA57_0==26||LA57_0==34||LA57_0==37||(LA57_0>=43 && LA57_0<=46)||LA57_0==52||(LA57_0>=59 && LA57_0<=62)) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalKExpressions.g:3463:3: ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) )
                    {
                    // InternalKExpressions.g:3463:3: ( ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) ) )
                    // InternalKExpressions.g:3464:4: ( (lv_accessType_0_0= ruleParameterAccessType ) ) ( (lv_expression_1_0= ruleValuedObjectReference ) )
                    {
                    // InternalKExpressions.g:3464:4: ( (lv_accessType_0_0= ruleParameterAccessType ) )
                    // InternalKExpressions.g:3465:5: (lv_accessType_0_0= ruleParameterAccessType )
                    {
                    // InternalKExpressions.g:3465:5: (lv_accessType_0_0= ruleParameterAccessType )
                    // InternalKExpressions.g:3466:6: lv_accessType_0_0= ruleParameterAccessType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getAccessTypeParameterAccessTypeEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_accessType_0_0=ruleParameterAccessType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"accessType",
                      							lv_accessType_0_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ParameterAccessType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalKExpressions.g:3483:4: ( (lv_expression_1_0= ruleValuedObjectReference ) )
                    // InternalKExpressions.g:3484:5: (lv_expression_1_0= ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:3484:5: (lv_expression_1_0= ruleValuedObjectReference )
                    // InternalKExpressions.g:3485:6: lv_expression_1_0= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getExpressionValuedObjectReferenceParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_1_0=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_1_0,
                      							"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3504:3: ( (lv_expression_2_0= ruleExpression ) )
                    {
                    // InternalKExpressions.g:3504:3: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalKExpressions.g:3505:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalKExpressions.g:3505:4: (lv_expression_2_0= ruleExpression )
                    // InternalKExpressions.g:3506:5: lv_expression_2_0= ruleExpression
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTextExpression"
    // InternalKExpressions.g:3527:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // InternalKExpressions.g:3527:55: (iv_ruleTextExpression= ruleTextExpression EOF )
            // InternalKExpressions.g:3528:2: iv_ruleTextExpression= ruleTextExpression EOF
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
    // InternalKExpressions.g:3534:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_annotations_0_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3540:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) ) )
            // InternalKExpressions.g:3541:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            {
            // InternalKExpressions.g:3541:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) ) )
            // InternalKExpressions.g:3542:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_text_1_0= RULE_HOSTCODE ) )
            {
            // InternalKExpressions.g:3542:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_COMMENT_ANNOTATION||LA58_0==52) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalKExpressions.g:3543:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalKExpressions.g:3543:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalKExpressions.g:3544:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTextExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
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
            	    break loop58;
                }
            } while (true);

            // InternalKExpressions.g:3561:3: ( (lv_text_1_0= RULE_HOSTCODE ) )
            // InternalKExpressions.g:3562:4: (lv_text_1_0= RULE_HOSTCODE )
            {
            // InternalKExpressions.g:3562:4: (lv_text_1_0= RULE_HOSTCODE )
            // InternalKExpressions.g:3563:5: lv_text_1_0= RULE_HOSTCODE
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
    // InternalKExpressions.g:3583:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalKExpressions.g:3583:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalKExpressions.g:3584:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalKExpressions.g:3590:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3596:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalKExpressions.g:3597:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalKExpressions.g:3597:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalKExpressions.g:3598:3: (lv_value_0_0= RULE_INT )
            {
            // InternalKExpressions.g:3598:3: (lv_value_0_0= RULE_INT )
            // InternalKExpressions.g:3599:4: lv_value_0_0= RULE_INT
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
    // InternalKExpressions.g:3618:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalKExpressions.g:3618:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalKExpressions.g:3619:2: iv_ruleFloatValue= ruleFloatValue EOF
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
    // InternalKExpressions.g:3625:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3631:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalKExpressions.g:3632:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalKExpressions.g:3632:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalKExpressions.g:3633:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalKExpressions.g:3633:3: (lv_value_0_0= RULE_FLOAT )
            // InternalKExpressions.g:3634:4: lv_value_0_0= RULE_FLOAT
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
    // InternalKExpressions.g:3653:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalKExpressions.g:3653:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalKExpressions.g:3654:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalKExpressions.g:3660:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3666:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalKExpressions.g:3667:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalKExpressions.g:3667:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalKExpressions.g:3668:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalKExpressions.g:3668:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalKExpressions.g:3669:4: lv_value_0_0= RULE_BOOLEAN
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
    // InternalKExpressions.g:3688:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalKExpressions.g:3688:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalKExpressions.g:3689:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalKExpressions.g:3695:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3701:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalKExpressions.g:3702:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalKExpressions.g:3702:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalKExpressions.g:3703:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalKExpressions.g:3703:3: (lv_value_0_0= RULE_STRING )
            // InternalKExpressions.g:3704:4: lv_value_0_0= RULE_STRING
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
    // InternalKExpressions.g:3723:1: entryRuleVectorValue returns [EObject current=null] : iv_ruleVectorValue= ruleVectorValue EOF ;
    public final EObject entryRuleVectorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValue = null;


        try {
            // InternalKExpressions.g:3723:52: (iv_ruleVectorValue= ruleVectorValue EOF )
            // InternalKExpressions.g:3724:2: iv_ruleVectorValue= ruleVectorValue EOF
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
    // InternalKExpressions.g:3730:1: ruleVectorValue returns [EObject current=null] : (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleVectorValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_range_5_0=null;
        Token otherlv_7=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;

        EObject lv_values_4_0 = null;

        EObject lv_values_6_1 = null;

        EObject lv_values_6_2 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3736:2: ( (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' ) )
            // InternalKExpressions.g:3737:2: (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' )
            {
            // InternalKExpressions.g:3737:2: (otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}' )
            // InternalKExpressions.g:3738:3: otherlv_0= '{' ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVectorValueAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalKExpressions.g:3742:3: ( ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* ) | ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||(LA61_0>=RULE_HOSTCODE && LA61_0<=RULE_COMMENT_ANNOTATION)||LA61_0==26||LA61_0==34||LA61_0==37||(LA61_0>=43 && LA61_0<=46)||LA61_0==49||LA61_0==52||(LA61_0>=59 && LA61_0<=62)) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_INT) ) {
                int LA61_2 = input.LA(2);

                if ( ((LA61_2>=17 && LA61_2<=29)||(LA61_2>=31 && LA61_2<=33)||LA61_2==36||LA61_2==48||(LA61_2>=53 && LA61_2<=58)||LA61_2==63) ) {
                    alt61=1;
                }
                else if ( (LA61_2==47) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalKExpressions.g:3743:4: ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* )
                    {
                    // InternalKExpressions.g:3743:4: ( ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )* )
                    // InternalKExpressions.g:3744:5: ( (lv_values_1_0= ruleVectorValueMember ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
                    {
                    // InternalKExpressions.g:3744:5: ( (lv_values_1_0= ruleVectorValueMember ) )
                    // InternalKExpressions.g:3745:6: (lv_values_1_0= ruleVectorValueMember )
                    {
                    // InternalKExpressions.g:3745:6: (lv_values_1_0= ruleVectorValueMember )
                    // InternalKExpressions.g:3746:7: lv_values_1_0= ruleVectorValueMember
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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

                    // InternalKExpressions.g:3763:5: (otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==36) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalKExpressions.g:3764:6: otherlv_2= ',' ( (lv_values_3_0= ruleVectorValueMember ) )
                    	    {
                    	    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_2, grammarAccess.getVectorValueAccess().getCommaKeyword_1_0_1_0());
                    	      					
                    	    }
                    	    // InternalKExpressions.g:3768:6: ( (lv_values_3_0= ruleVectorValueMember ) )
                    	    // InternalKExpressions.g:3769:7: (lv_values_3_0= ruleVectorValueMember )
                    	    {
                    	    // InternalKExpressions.g:3769:7: (lv_values_3_0= ruleVectorValueMember )
                    	    // InternalKExpressions.g:3770:8: lv_values_3_0= ruleVectorValueMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getVectorValueAccess().getValuesVectorValueMemberParserRuleCall_1_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
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
                    	    break loop59;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:3790:4: ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) )
                    {
                    // InternalKExpressions.g:3790:4: ( ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) ) )
                    // InternalKExpressions.g:3791:5: ( (lv_values_4_0= ruleIntValue ) ) ( (lv_range_5_0= 'to' ) ) ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) )
                    {
                    // InternalKExpressions.g:3791:5: ( (lv_values_4_0= ruleIntValue ) )
                    // InternalKExpressions.g:3792:6: (lv_values_4_0= ruleIntValue )
                    {
                    // InternalKExpressions.g:3792:6: (lv_values_4_0= ruleIntValue )
                    // InternalKExpressions.g:3793:7: lv_values_4_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getVectorValueAccess().getValuesIntValueParserRuleCall_1_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_values_4_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getVectorValueRule());
                      							}
                      							add(
                      								current,
                      								"values",
                      								lv_values_4_0,
                      								"de.cau.cs.kieler.kexpressions.KExpressions.IntValue");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:3810:5: ( (lv_range_5_0= 'to' ) )
                    // InternalKExpressions.g:3811:6: (lv_range_5_0= 'to' )
                    {
                    // InternalKExpressions.g:3811:6: (lv_range_5_0= 'to' )
                    // InternalKExpressions.g:3812:7: lv_range_5_0= 'to'
                    {
                    lv_range_5_0=(Token)match(input,47,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_range_5_0, grammarAccess.getVectorValueAccess().getRangeToKeyword_1_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVectorValueRule());
                      							}
                      							setWithLastConsumed(current, "range", lv_range_5_0 != null, "to");
                      						
                    }

                    }


                    }

                    // InternalKExpressions.g:3824:5: ( ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) ) )
                    // InternalKExpressions.g:3825:6: ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) )
                    {
                    // InternalKExpressions.g:3825:6: ( (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference ) )
                    // InternalKExpressions.g:3826:7: (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference )
                    {
                    // InternalKExpressions.g:3826:7: (lv_values_6_1= ruleIntValue | lv_values_6_2= ruleValuedObjectReference )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_INT) ) {
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
                            // InternalKExpressions.g:3827:8: lv_values_6_1= ruleIntValue
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getVectorValueAccess().getValuesIntValueParserRuleCall_1_1_2_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
                            lv_values_6_1=ruleIntValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getVectorValueRule());
                              								}
                              								add(
                              									current,
                              									"values",
                              									lv_values_6_1,
                              									"de.cau.cs.kieler.kexpressions.KExpressions.IntValue");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalKExpressions.g:3843:8: lv_values_6_2= ruleValuedObjectReference
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getVectorValueAccess().getValuesValuedObjectReferenceParserRuleCall_1_1_2_0_1());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_41);
                            lv_values_6_2=ruleValuedObjectReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getVectorValueRule());
                              								}
                              								add(
                              									current,
                              									"values",
                              									lv_values_6_2,
                              									"de.cau.cs.kieler.kexpressions.KExpressions.ValuedObjectReference");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getVectorValueAccess().getRightCurlyBracketKeyword_2());
              		
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
    // InternalKExpressions.g:3871:1: entryRuleVectorValueMember returns [EObject current=null] : iv_ruleVectorValueMember= ruleVectorValueMember EOF ;
    public final EObject entryRuleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorValueMember = null;


        try {
            // InternalKExpressions.g:3871:58: (iv_ruleVectorValueMember= ruleVectorValueMember EOF )
            // InternalKExpressions.g:3872:2: iv_ruleVectorValueMember= ruleVectorValueMember EOF
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
    // InternalKExpressions.g:3878:1: ruleVectorValueMember returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) ;
    public final EObject ruleVectorValueMember() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;

        EObject this_IgnoreValue_2 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3884:2: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue ) )
            // InternalKExpressions.g:3885:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            {
            // InternalKExpressions.g:3885:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )
            int alt62=3;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // InternalKExpressions.g:3886:3: this_BoolExpression_0= ruleBoolExpression
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
                    // InternalKExpressions.g:3898:3: this_ValuedExpression_1= ruleValuedExpression
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
                    // InternalKExpressions.g:3910:3: this_IgnoreValue_2= ruleIgnoreValue
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
    // InternalKExpressions.g:3925:1: entryRuleIgnoreValue returns [EObject current=null] : iv_ruleIgnoreValue= ruleIgnoreValue EOF ;
    public final EObject entryRuleIgnoreValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnoreValue = null;


        try {
            // InternalKExpressions.g:3925:52: (iv_ruleIgnoreValue= ruleIgnoreValue EOF )
            // InternalKExpressions.g:3926:2: iv_ruleIgnoreValue= ruleIgnoreValue EOF
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
    // InternalKExpressions.g:3932:1: ruleIgnoreValue returns [EObject current=null] : ( () otherlv_1= '_' ) ;
    public final EObject ruleIgnoreValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:3938:2: ( ( () otherlv_1= '_' ) )
            // InternalKExpressions.g:3939:2: ( () otherlv_1= '_' )
            {
            // InternalKExpressions.g:3939:2: ( () otherlv_1= '_' )
            // InternalKExpressions.g:3940:3: () otherlv_1= '_'
            {
            // InternalKExpressions.g:3940:3: ()
            // InternalKExpressions.g:3941:4: 
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

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:3958:1: entryRuleAnyValue returns [EObject current=null] : iv_ruleAnyValue= ruleAnyValue EOF ;
    public final EObject entryRuleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyValue = null;


        try {
            // InternalKExpressions.g:3958:49: (iv_ruleAnyValue= ruleAnyValue EOF )
            // InternalKExpressions.g:3959:2: iv_ruleAnyValue= ruleAnyValue EOF
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
    // InternalKExpressions.g:3965:1: ruleAnyValue returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) ;
    public final EObject ruleAnyValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_BoolValue_2 = null;

        EObject this_StringValue_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:3971:2: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue ) )
            // InternalKExpressions.g:3972:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            {
            // InternalKExpressions.g:3972:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_BoolValue_2= ruleBoolValue | this_StringValue_3= ruleStringValue )
            int alt63=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt63=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt63=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt63=3;
                }
                break;
            case RULE_STRING:
                {
                alt63=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalKExpressions.g:3973:3: this_IntValue_0= ruleIntValue
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
                    // InternalKExpressions.g:3985:3: this_FloatValue_1= ruleFloatValue
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
                    // InternalKExpressions.g:3997:3: this_BoolValue_2= ruleBoolValue
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
                    // InternalKExpressions.g:4009:3: this_StringValue_3= ruleStringValue
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
    // InternalKExpressions.g:4024:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // InternalKExpressions.g:4024:56: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // InternalKExpressions.g:4025:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
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
    // InternalKExpressions.g:4031:1: ruleJsonObjectValue returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_members_2_0 = null;

        EObject lv_members_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4037:2: ( ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' ) )
            // InternalKExpressions.g:4038:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            {
            // InternalKExpressions.g:4038:2: ( () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}' )
            // InternalKExpressions.g:4039:3: () otherlv_1= '{' ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )? otherlv_5= '}'
            {
            // InternalKExpressions.g:4039:3: ()
            // InternalKExpressions.g:4040:4: 
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

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectValueAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalKExpressions.g:4053:3: ( ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalKExpressions.g:4054:4: ( (lv_members_2_0= ruleJsonObjectMember ) ) (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    {
                    // InternalKExpressions.g:4054:4: ( (lv_members_2_0= ruleJsonObjectMember ) )
                    // InternalKExpressions.g:4055:5: (lv_members_2_0= ruleJsonObjectMember )
                    {
                    // InternalKExpressions.g:4055:5: (lv_members_2_0= ruleJsonObjectMember )
                    // InternalKExpressions.g:4056:6: lv_members_2_0= ruleJsonObjectMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_38);
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

                    // InternalKExpressions.g:4073:4: (otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==36) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalKExpressions.g:4074:5: otherlv_3= ',' ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonObjectValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:4078:5: ( (lv_members_4_0= ruleJsonObjectMember ) )
                    	    // InternalKExpressions.g:4079:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    {
                    	    // InternalKExpressions.g:4079:6: (lv_members_4_0= ruleJsonObjectMember )
                    	    // InternalKExpressions.g:4080:7: lv_members_4_0= ruleJsonObjectMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonObjectValueAccess().getMembersJsonObjectMemberParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_38);
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
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:4107:1: entryRuleJsonObjectMember returns [EObject current=null] : iv_ruleJsonObjectMember= ruleJsonObjectMember EOF ;
    public final EObject entryRuleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectMember = null;


        try {
            // InternalKExpressions.g:4107:57: (iv_ruleJsonObjectMember= ruleJsonObjectMember EOF )
            // InternalKExpressions.g:4108:2: iv_ruleJsonObjectMember= ruleJsonObjectMember EOF
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
    // InternalKExpressions.g:4114:1: ruleJsonObjectMember returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) ;
    public final EObject ruleJsonObjectMember() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4120:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) ) )
            // InternalKExpressions.g:4121:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            {
            // InternalKExpressions.g:4121:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) ) )
            // InternalKExpressions.g:4122:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonValue ) )
            {
            // InternalKExpressions.g:4122:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalKExpressions.g:4123:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalKExpressions.g:4123:4: (lv_key_0_0= RULE_STRING )
            // InternalKExpressions.g:4124:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_44); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonObjectMemberAccess().getColonKeyword_1());
              		
            }
            // InternalKExpressions.g:4144:3: ( (lv_value_2_0= ruleJsonValue ) )
            // InternalKExpressions.g:4145:4: (lv_value_2_0= ruleJsonValue )
            {
            // InternalKExpressions.g:4145:4: (lv_value_2_0= ruleJsonValue )
            // InternalKExpressions.g:4146:5: lv_value_2_0= ruleJsonValue
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
    // InternalKExpressions.g:4167:1: entryRuleJsonArrayValue returns [EObject current=null] : iv_ruleJsonArrayValue= ruleJsonArrayValue EOF ;
    public final EObject entryRuleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArrayValue = null;


        try {
            // InternalKExpressions.g:4167:55: (iv_ruleJsonArrayValue= ruleJsonArrayValue EOF )
            // InternalKExpressions.g:4168:2: iv_ruleJsonArrayValue= ruleJsonArrayValue EOF
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
    // InternalKExpressions.g:4174:1: ruleJsonArrayValue returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleJsonArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4180:2: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' ) )
            // InternalKExpressions.g:4181:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            {
            // InternalKExpressions.g:4181:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']' )
            // InternalKExpressions.g:4182:3: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )? otherlv_5= ']'
            {
            // InternalKExpressions.g:4182:3: ()
            // InternalKExpressions.g:4183:4: 
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJsonArrayValueAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalKExpressions.g:4196:3: ( ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT||(LA67_0>=RULE_FLOAT && LA67_0<=RULE_STRING)||LA67_0==40||LA67_0==46||LA67_0==50) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalKExpressions.g:4197:4: ( (lv_elements_2_0= ruleJsonValue ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    {
                    // InternalKExpressions.g:4197:4: ( (lv_elements_2_0= ruleJsonValue ) )
                    // InternalKExpressions.g:4198:5: (lv_elements_2_0= ruleJsonValue )
                    {
                    // InternalKExpressions.g:4198:5: (lv_elements_2_0= ruleJsonValue )
                    // InternalKExpressions.g:4199:6: lv_elements_2_0= ruleJsonValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_47);
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

                    // InternalKExpressions.g:4216:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==36) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalKExpressions.g:4217:5: otherlv_3= ',' ( (lv_elements_4_0= ruleJsonValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getJsonArrayValueAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalKExpressions.g:4221:5: ( (lv_elements_4_0= ruleJsonValue ) )
                    	    // InternalKExpressions.g:4222:6: (lv_elements_4_0= ruleJsonValue )
                    	    {
                    	    // InternalKExpressions.g:4222:6: (lv_elements_4_0= ruleJsonValue )
                    	    // InternalKExpressions.g:4223:7: lv_elements_4_0= ruleJsonValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getJsonArrayValueAccess().getElementsJsonValueParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_47);
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:4250:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // InternalKExpressions.g:4250:50: (iv_ruleJsonValue= ruleJsonValue EOF )
            // InternalKExpressions.g:4251:2: iv_ruleJsonValue= ruleJsonValue EOF
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
    // InternalKExpressions.g:4257:1: ruleJsonValue returns [EObject current=null] : (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObjectValue_0 = null;

        EObject this_JsonArrayValue_1 = null;

        EObject this_NullValue_2 = null;

        EObject this_AnyValue_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4263:2: ( (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue ) )
            // InternalKExpressions.g:4264:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            {
            // InternalKExpressions.g:4264:2: (this_JsonObjectValue_0= ruleJsonObjectValue | this_JsonArrayValue_1= ruleJsonArrayValue | this_NullValue_2= ruleNullValue | this_AnyValue_3= ruleAnyValue )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt68=1;
                }
                break;
            case 40:
                {
                alt68=2;
                }
                break;
            case 50:
                {
                alt68=3;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case RULE_STRING:
                {
                alt68=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalKExpressions.g:4265:3: this_JsonObjectValue_0= ruleJsonObjectValue
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
                    // InternalKExpressions.g:4277:3: this_JsonArrayValue_1= ruleJsonArrayValue
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
                    // InternalKExpressions.g:4289:3: this_NullValue_2= ruleNullValue
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
                    // InternalKExpressions.g:4301:3: this_AnyValue_3= ruleAnyValue
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
    // InternalKExpressions.g:4316:1: entryRuleNullValue returns [EObject current=null] : iv_ruleNullValue= ruleNullValue EOF ;
    public final EObject entryRuleNullValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullValue = null;


        try {
            // InternalKExpressions.g:4316:50: (iv_ruleNullValue= ruleNullValue EOF )
            // InternalKExpressions.g:4317:2: iv_ruleNullValue= ruleNullValue EOF
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
    // InternalKExpressions.g:4323:1: ruleNullValue returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4329:2: ( ( () otherlv_1= 'null' ) )
            // InternalKExpressions.g:4330:2: ( () otherlv_1= 'null' )
            {
            // InternalKExpressions.g:4330:2: ( () otherlv_1= 'null' )
            // InternalKExpressions.g:4331:3: () otherlv_1= 'null'
            {
            // InternalKExpressions.g:4331:3: ()
            // InternalKExpressions.g:4332:4: 
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

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:4349:1: entryRuleJsonPragma returns [EObject current=null] : iv_ruleJsonPragma= ruleJsonPragma EOF ;
    public final EObject entryRuleJsonPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPragma = null;


        try {
            // InternalKExpressions.g:4349:51: (iv_ruleJsonPragma= ruleJsonPragma EOF )
            // InternalKExpressions.g:4350:2: iv_ruleJsonPragma= ruleJsonPragma EOF
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
    // InternalKExpressions.g:4356:1: ruleJsonPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4362:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKExpressions.g:4363:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKExpressions.g:4363:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKExpressions.g:4364:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKExpressions.g:4368:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:4369:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:4369:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:4370:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_48);
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

            // InternalKExpressions.g:4387:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKExpressions.g:4388:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKExpressions.g:4388:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKExpressions.g:4389:5: lv_value_2_0= ruleJsonObjectValue
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
    // InternalKExpressions.g:4410:1: entryRuleJsonAnnotation returns [EObject current=null] : iv_ruleJsonAnnotation= ruleJsonAnnotation EOF ;
    public final EObject entryRuleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonAnnotation = null;


        try {
            // InternalKExpressions.g:4410:55: (iv_ruleJsonAnnotation= ruleJsonAnnotation EOF )
            // InternalKExpressions.g:4411:2: iv_ruleJsonAnnotation= ruleJsonAnnotation EOF
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
    // InternalKExpressions.g:4417:1: ruleJsonAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4423:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // InternalKExpressions.g:4424:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // InternalKExpressions.g:4424:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // InternalKExpressions.g:4425:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getJsonAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:4429:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:4430:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:4430:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:4431:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getJsonAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_48);
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

            // InternalKExpressions.g:4448:3: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // InternalKExpressions.g:4449:4: (lv_value_2_0= ruleJsonObjectValue )
            {
            // InternalKExpressions.g:4449:4: (lv_value_2_0= ruleJsonObjectValue )
            // InternalKExpressions.g:4450:5: lv_value_2_0= ruleJsonObjectValue
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
    // InternalKExpressions.g:4471:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalKExpressions.g:4471:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalKExpressions.g:4472:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalKExpressions.g:4478:1: ruleAnnotation returns [EObject current=null] : (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_Annotation_0 = null;

        EObject this_JsonAnnotation_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4484:2: ( (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation ) )
            // InternalKExpressions.g:4485:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            {
            // InternalKExpressions.g:4485:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalKExpressions.g:4486:3: this_Annotation_0= superAnnotation
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
                    // InternalKExpressions.g:4498:3: this_JsonAnnotation_1= ruleJsonAnnotation
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
    // InternalKExpressions.g:4513:1: entrySuperAnnotation returns [EObject current=null] : iv_superAnnotation= superAnnotation EOF ;
    public final EObject entrySuperAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superAnnotation = null;


        try {
            // InternalKExpressions.g:4513:52: (iv_superAnnotation= superAnnotation EOF )
            // InternalKExpressions.g:4514:2: iv_superAnnotation= superAnnotation EOF
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
    // InternalKExpressions.g:4520:1: superAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4526:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKExpressions.g:4527:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKExpressions.g:4527:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt70=4;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // InternalKExpressions.g:4528:3: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKExpressions.g:4540:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
                    // InternalKExpressions.g:4552:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
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
                    // InternalKExpressions.g:4564:3: this_TagAnnotation_3= ruleTagAnnotation
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
    // InternalKExpressions.g:4579:1: entrySuperPragma returns [EObject current=null] : iv_superPragma= superPragma EOF ;
    public final EObject entrySuperPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_superPragma = null;


        try {
            // InternalKExpressions.g:4579:48: (iv_superPragma= superPragma EOF )
            // InternalKExpressions.g:4580:2: iv_superPragma= superPragma EOF
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
    // InternalKExpressions.g:4586:1: superPragma returns [EObject current=null] : (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) ;
    public final EObject superPragma() throws RecognitionException {
        EObject current = null;

        EObject this_StringPragma_0 = null;

        EObject this_PragmaTag_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4592:2: ( (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag ) )
            // InternalKExpressions.g:4593:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            {
            // InternalKExpressions.g:4593:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalKExpressions.g:4594:3: this_StringPragma_0= ruleStringPragma
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
                    // InternalKExpressions.g:4606:3: this_PragmaTag_1= rulePragmaTag
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
    // InternalKExpressions.g:4621:1: entrySuperValuedAnnotation returns [EObject current=null] : iv_superValuedAnnotation= superValuedAnnotation EOF ;
    public final EObject entrySuperValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superValuedAnnotation = null;


        try {
            // InternalKExpressions.g:4621:58: (iv_superValuedAnnotation= superValuedAnnotation EOF )
            // InternalKExpressions.g:4622:2: iv_superValuedAnnotation= superValuedAnnotation EOF
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
    // InternalKExpressions.g:4628:1: superValuedAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) ;
    public final EObject superValuedAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyStringValueAnnotation_1 = null;

        EObject this_TypedKeyStringValueAnnotation_2 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4634:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation ) )
            // InternalKExpressions.g:4635:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            {
            // InternalKExpressions.g:4635:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )
            int alt72=3;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalKExpressions.g:4636:3: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKExpressions.g:4648:3: this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation
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
                    // InternalKExpressions.g:4660:3: this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation
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
    // InternalKExpressions.g:4675:1: entrySuperQuotedStringAnnotation returns [EObject current=null] : iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF ;
    public final EObject entrySuperQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_superQuotedStringAnnotation = null;


        try {
            // InternalKExpressions.g:4675:64: (iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF )
            // InternalKExpressions.g:4676:2: iv_superQuotedStringAnnotation= superQuotedStringAnnotation EOF
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
    // InternalKExpressions.g:4682:1: superQuotedStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) ;
    public final EObject superQuotedStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_QuotedKeyStringValueAnnotation_1 = null;

        EObject this_QuotedTypedKeyStringValueAnnotation_2 = null;

        EObject this_TagAnnotation_3 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4688:2: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation ) )
            // InternalKExpressions.g:4689:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            {
            // InternalKExpressions.g:4689:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )
            int alt73=4;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // InternalKExpressions.g:4690:3: this_CommentAnnotation_0= ruleCommentAnnotation
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
                    // InternalKExpressions.g:4702:3: this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation
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
                    // InternalKExpressions.g:4714:3: this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation
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
                    // InternalKExpressions.g:4726:3: this_TagAnnotation_3= ruleTagAnnotation
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
    // InternalKExpressions.g:4741:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // InternalKExpressions.g:4741:58: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // InternalKExpressions.g:4742:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
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
    // InternalKExpressions.g:4748:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:4754:2: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // InternalKExpressions.g:4755:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // InternalKExpressions.g:4755:2: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // InternalKExpressions.g:4756:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // InternalKExpressions.g:4756:3: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // InternalKExpressions.g:4757:4: lv_values_0_0= RULE_COMMENT_ANNOTATION
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
    // InternalKExpressions.g:4776:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // InternalKExpressions.g:4776:54: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // InternalKExpressions.g:4777:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
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
    // InternalKExpressions.g:4783:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4789:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKExpressions.g:4790:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKExpressions.g:4790:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKExpressions.g:4791:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:4795:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:4796:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:4796:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:4797:5: lv_name_1_0= ruleExtendedID
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
    // InternalKExpressions.g:4818:1: entryRulePragmaTag returns [EObject current=null] : iv_rulePragmaTag= rulePragmaTag EOF ;
    public final EObject entryRulePragmaTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePragmaTag = null;


        try {
            // InternalKExpressions.g:4818:50: (iv_rulePragmaTag= rulePragmaTag EOF )
            // InternalKExpressions.g:4819:2: iv_rulePragmaTag= rulePragmaTag EOF
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
    // InternalKExpressions.g:4825:1: rulePragmaTag returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject rulePragmaTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4831:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // InternalKExpressions.g:4832:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // InternalKExpressions.g:4832:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) )
            // InternalKExpressions.g:4833:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPragmaTagAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKExpressions.g:4837:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:4838:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:4838:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:4839:5: lv_name_1_0= ruleExtendedID
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
    // InternalKExpressions.g:4860:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:4860:65: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:4861:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:4867:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4873:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExpressions.g:4874:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExpressions.g:4874:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKExpressions.g:4875:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:4879:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:4880:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:4880:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:4881:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalKExpressions.g:4898:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKExpressions.g:4899:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKExpressions.g:4899:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKExpressions.g:4900:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
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

            // InternalKExpressions.g:4917:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==36) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalKExpressions.g:4918:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:4922:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKExpressions.g:4923:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExpressions.g:4923:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKExpressions.g:4924:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
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
            	    break loop74;
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
    // InternalKExpressions.g:4946:1: entryRuleRestrictedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:4946:75: (iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:4947:2: iv_ruleRestrictedKeyStringValueAnnotation= ruleRestrictedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:4953:1: ruleRestrictedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) ;
    public final EObject ruleRestrictedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:4959:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* ) )
            // InternalKExpressions.g:4960:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKExpressions.g:4960:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )* )
            // InternalKExpressions.g:4961:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringBoolean ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:4965:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:4966:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:4966:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:4967:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_51);
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

            // InternalKExpressions.g:4984:3: ( (lv_values_2_0= ruleEStringBoolean ) )
            // InternalKExpressions.g:4985:4: (lv_values_2_0= ruleEStringBoolean )
            {
            // InternalKExpressions.g:4985:4: (lv_values_2_0= ruleEStringBoolean )
            // InternalKExpressions.g:4986:5: lv_values_2_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
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

            // InternalKExpressions.g:5003:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==36) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalKExpressions.g:5004:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5008:4: ( (lv_values_4_0= ruleEStringBoolean ) )
            	    // InternalKExpressions.g:5009:5: (lv_values_4_0= ruleEStringBoolean )
            	    {
            	    // InternalKExpressions.g:5009:5: (lv_values_4_0= ruleEStringBoolean )
            	    // InternalKExpressions.g:5010:6: lv_values_4_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
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
            	    break loop75;
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
    // InternalKExpressions.g:5032:1: entryRuleStringPragma returns [EObject current=null] : iv_ruleStringPragma= ruleStringPragma EOF ;
    public final EObject entryRuleStringPragma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPragma = null;


        try {
            // InternalKExpressions.g:5032:53: (iv_ruleStringPragma= ruleStringPragma EOF )
            // InternalKExpressions.g:5033:2: iv_ruleStringPragma= ruleStringPragma EOF
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
    // InternalKExpressions.g:5039:1: ruleStringPragma returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) ;
    public final EObject ruleStringPragma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5045:2: ( (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExpressions.g:5046:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExpressions.g:5046:2: (otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )* )
            // InternalKExpressions.g:5047:3: otherlv_0= '#' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEStringAllTypes ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getStringPragmaAccess().getNumberSignKeyword_0());
              		
            }
            // InternalKExpressions.g:5051:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5052:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5052:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5053:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_49);
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

            // InternalKExpressions.g:5070:3: ( (lv_values_2_0= ruleEStringAllTypes ) )
            // InternalKExpressions.g:5071:4: (lv_values_2_0= ruleEStringAllTypes )
            {
            // InternalKExpressions.g:5071:4: (lv_values_2_0= ruleEStringAllTypes )
            // InternalKExpressions.g:5072:5: lv_values_2_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
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

            // InternalKExpressions.g:5089:3: (otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==36) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalKExpressions.g:5090:4: otherlv_3= ',' ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getStringPragmaAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5094:4: ( (lv_values_4_0= ruleEStringAllTypes ) )
            	    // InternalKExpressions.g:5095:5: (lv_values_4_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExpressions.g:5095:5: (lv_values_4_0= ruleEStringAllTypes )
            	    // InternalKExpressions.g:5096:6: lv_values_4_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getStringPragmaAccess().getValuesEStringAllTypesParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
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
            	    break loop76;
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
    // InternalKExpressions.g:5118:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5118:70: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5119:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:5125:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) ;
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
            // InternalKExpressions.g:5131:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* ) )
            // InternalKExpressions.g:5132:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            {
            // InternalKExpressions.g:5132:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )* )
            // InternalKExpressions.g:5133:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringAllTypes ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5137:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5138:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5138:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5139:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKExpressions.g:5160:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExpressions.g:5161:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5161:4: (lv_type_3_0= ruleExtendedID )
            // InternalKExpressions.g:5162:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKExpressions.g:5183:3: ( (lv_values_5_0= ruleEStringAllTypes ) )
            // InternalKExpressions.g:5184:4: (lv_values_5_0= ruleEStringAllTypes )
            {
            // InternalKExpressions.g:5184:4: (lv_values_5_0= ruleEStringAllTypes )
            // InternalKExpressions.g:5185:5: lv_values_5_0= ruleEStringAllTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
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

            // InternalKExpressions.g:5202:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==36) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalKExpressions.g:5203:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5207:4: ( (lv_values_7_0= ruleEStringAllTypes ) )
            	    // InternalKExpressions.g:5208:5: (lv_values_7_0= ruleEStringAllTypes )
            	    {
            	    // InternalKExpressions.g:5208:5: (lv_values_7_0= ruleEStringAllTypes )
            	    // InternalKExpressions.g:5209:6: lv_values_7_0= ruleEStringAllTypes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
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
            	    break loop77;
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
    // InternalKExpressions.g:5231:1: entryRuleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleRestrictedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5231:80: (iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5232:2: iv_ruleRestrictedTypedKeyStringValueAnnotation= ruleRestrictedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:5238:1: ruleRestrictedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) ;
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
            // InternalKExpressions.g:5244:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* ) )
            // InternalKExpressions.g:5245:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            {
            // InternalKExpressions.g:5245:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )* )
            // InternalKExpressions.g:5246:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEStringBoolean ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5250:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5251:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5251:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5252:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKExpressions.g:5273:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExpressions.g:5274:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5274:4: (lv_type_3_0= ruleExtendedID )
            // InternalKExpressions.g:5275:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKExpressions.g:5296:3: ( (lv_values_5_0= ruleEStringBoolean ) )
            // InternalKExpressions.g:5297:4: (lv_values_5_0= ruleEStringBoolean )
            {
            // InternalKExpressions.g:5297:4: (lv_values_5_0= ruleEStringBoolean )
            // InternalKExpressions.g:5298:5: lv_values_5_0= ruleEStringBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
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

            // InternalKExpressions.g:5315:3: (otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==36) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalKExpressions.g:5316:4: otherlv_6= ',' ( (lv_values_7_0= ruleEStringBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_51); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5320:4: ( (lv_values_7_0= ruleEStringBoolean ) )
            	    // InternalKExpressions.g:5321:5: (lv_values_7_0= ruleEStringBoolean )
            	    {
            	    // InternalKExpressions.g:5321:5: (lv_values_7_0= ruleEStringBoolean )
            	    // InternalKExpressions.g:5322:6: lv_values_7_0= ruleEStringBoolean
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRestrictedTypedKeyStringValueAnnotationAccess().getValuesEStringBooleanParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_50);
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
            	    break loop78;
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
    // InternalKExpressions.g:5344:1: entryRuleQuotedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5344:71: (iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5345:2: iv_ruleQuotedKeyStringValueAnnotation= ruleQuotedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:5351:1: ruleQuotedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleQuotedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5357:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalKExpressions.g:5358:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalKExpressions.g:5358:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalKExpressions.g:5359:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5363:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5364:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5364:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5365:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_43);
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

            // InternalKExpressions.g:5382:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalKExpressions.g:5383:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalKExpressions.g:5383:4: (lv_values_2_0= RULE_STRING )
            // InternalKExpressions.g:5384:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
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

            // InternalKExpressions.g:5400:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==36) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalKExpressions.g:5401:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getQuotedKeyStringValueAnnotationAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5405:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalKExpressions.g:5406:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalKExpressions.g:5406:5: (lv_values_4_0= RULE_STRING )
            	    // InternalKExpressions.g:5407:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
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
            	    break loop79;
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
    // InternalKExpressions.g:5428:1: entryRuleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleQuotedTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuotedTypedKeyStringValueAnnotation = null;


        try {
            // InternalKExpressions.g:5428:76: (iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF )
            // InternalKExpressions.g:5429:2: iv_ruleQuotedTypedKeyStringValueAnnotation= ruleQuotedTypedKeyStringValueAnnotation EOF
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
    // InternalKExpressions.g:5435:1: ruleQuotedTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) ;
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
            // InternalKExpressions.g:5441:2: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* ) )
            // InternalKExpressions.g:5442:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            {
            // InternalKExpressions.g:5442:2: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )* )
            // InternalKExpressions.g:5443:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= RULE_STRING ) ) (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
              		
            }
            // InternalKExpressions.g:5447:3: ( (lv_name_1_0= ruleExtendedID ) )
            // InternalKExpressions.g:5448:4: (lv_name_1_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5448:4: (lv_name_1_0= ruleExtendedID )
            // InternalKExpressions.g:5449:5: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_52);
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

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalKExpressions.g:5470:3: ( (lv_type_3_0= ruleExtendedID ) )
            // InternalKExpressions.g:5471:4: (lv_type_3_0= ruleExtendedID )
            {
            // InternalKExpressions.g:5471:4: (lv_type_3_0= ruleExtendedID )
            // InternalKExpressions.g:5472:5: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_4=(Token)match(input,41,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalKExpressions.g:5493:3: ( (lv_values_5_0= RULE_STRING ) )
            // InternalKExpressions.g:5494:4: (lv_values_5_0= RULE_STRING )
            {
            // InternalKExpressions.g:5494:4: (lv_values_5_0= RULE_STRING )
            // InternalKExpressions.g:5495:5: lv_values_5_0= RULE_STRING
            {
            lv_values_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
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

            // InternalKExpressions.g:5511:3: (otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==36) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalKExpressions.g:5512:4: otherlv_6= ',' ( (lv_values_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getQuotedTypedKeyStringValueAnnotationAccess().getCommaKeyword_6_0());
            	      			
            	    }
            	    // InternalKExpressions.g:5516:4: ( (lv_values_7_0= RULE_STRING ) )
            	    // InternalKExpressions.g:5517:5: (lv_values_7_0= RULE_STRING )
            	    {
            	    // InternalKExpressions.g:5517:5: (lv_values_7_0= RULE_STRING )
            	    // InternalKExpressions.g:5518:6: lv_values_7_0= RULE_STRING
            	    {
            	    lv_values_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_50); if (state.failed) return current;
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
            	    break loop80;
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
    // InternalKExpressions.g:5539:1: entryRuleEStringBoolean returns [String current=null] : iv_ruleEStringBoolean= ruleEStringBoolean EOF ;
    public final String entryRuleEStringBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringBoolean = null;


        try {
            // InternalKExpressions.g:5539:54: (iv_ruleEStringBoolean= ruleEStringBoolean EOF )
            // InternalKExpressions.g:5540:2: iv_ruleEStringBoolean= ruleEStringBoolean EOF
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
    // InternalKExpressions.g:5546:1: ruleEStringBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleEStringBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5552:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN ) )
            // InternalKExpressions.g:5553:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            {
            // InternalKExpressions.g:5553:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN )
            int alt81=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt81=1;
                }
                break;
            case RULE_ID:
                {
                alt81=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt81=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalKExpressions.g:5554:3: this_STRING_0= RULE_STRING
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
                    // InternalKExpressions.g:5562:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKExpressions.g:5573:3: this_BOOLEAN_2= RULE_BOOLEAN
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
    // InternalKExpressions.g:5584:1: entryRuleEStringAllTypes returns [String current=null] : iv_ruleEStringAllTypes= ruleEStringAllTypes EOF ;
    public final String entryRuleEStringAllTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEStringAllTypes = null;


        try {
            // InternalKExpressions.g:5584:55: (iv_ruleEStringAllTypes= ruleEStringAllTypes EOF )
            // InternalKExpressions.g:5585:2: iv_ruleEStringAllTypes= ruleEStringAllTypes EOF
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
    // InternalKExpressions.g:5591:1: ruleEStringAllTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) ;
    public final AntlrDatatypeRuleToken ruleEStringAllTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_ExtendedID_1 = null;

        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Floateger_4 = null;



        	enterRule();

        try {
            // InternalKExpressions.g:5597:2: ( (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger ) )
            // InternalKExpressions.g:5598:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            {
            // InternalKExpressions.g:5598:2: (this_STRING_0= RULE_STRING | this_ExtendedID_1= ruleExtendedID | this_BOOLEAN_2= RULE_BOOLEAN | this_Integer_3= ruleInteger | this_Floateger_4= ruleFloateger )
            int alt82=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt82=1;
                }
                break;
            case RULE_ID:
                {
                alt82=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt82=3;
                }
                break;
            case 26:
                {
                int LA82_4 = input.LA(2);

                if ( (LA82_4==RULE_INT) ) {
                    alt82=4;
                }
                else if ( (LA82_4==RULE_FLOAT) ) {
                    alt82=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt82=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalKExpressions.g:5599:3: this_STRING_0= RULE_STRING
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
                    // InternalKExpressions.g:5607:3: this_ExtendedID_1= ruleExtendedID
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
                    // InternalKExpressions.g:5618:3: this_BOOLEAN_2= RULE_BOOLEAN
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
                    // InternalKExpressions.g:5626:3: this_Integer_3= ruleInteger
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
                    // InternalKExpressions.g:5637:3: this_Floateger_4= ruleFloateger
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
    // InternalKExpressions.g:5651:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // InternalKExpressions.g:5651:50: (iv_ruleExtendedID= ruleExtendedID EOF )
            // InternalKExpressions.g:5652:2: iv_ruleExtendedID= ruleExtendedID EOF
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
    // InternalKExpressions.g:5658:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5664:2: ( (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? ) )
            // InternalKExpressions.g:5665:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            {
            // InternalKExpressions.g:5665:2: (this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )? )
            // InternalKExpressions.g:5666:3: this_ID_0= RULE_ID ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )* (kw= '#' this_INT_5= RULE_INT )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalKExpressions.g:5673:3: ( (kw= '.' | kw= '-' ) this_ID_3= RULE_ID )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==26) ) {
                    int LA84_2 = input.LA(2);

                    if ( (LA84_2==RULE_ID) ) {
                        alt84=1;
                    }


                }
                else if ( (LA84_0==38) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalKExpressions.g:5674:4: (kw= '.' | kw= '-' ) this_ID_3= RULE_ID
            	    {
            	    // InternalKExpressions.g:5674:4: (kw= '.' | kw= '-' )
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==38) ) {
            	        alt83=1;
            	    }
            	    else if ( (LA83_0==26) ) {
            	        alt83=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 83, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // InternalKExpressions.g:5675:5: kw= '.'
            	            {
            	            kw=(Token)match(input,38,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalKExpressions.g:5681:5: kw= '-'
            	            {
            	            kw=(Token)match(input,26,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getExtendedIDAccess().getHyphenMinusKeyword_1_0_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_3, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            // InternalKExpressions.g:5695:3: (kw= '#' this_INT_5= RULE_INT )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalKExpressions.g:5696:4: kw= '#' this_INT_5= RULE_INT
                    {
                    kw=(Token)match(input,51,FollowSets000.FOLLOW_31); if (state.failed) return current;
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
    // InternalKExpressions.g:5713:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalKExpressions.g:5713:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalKExpressions.g:5714:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalKExpressions.g:5720:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5726:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalKExpressions.g:5727:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalKExpressions.g:5727:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalKExpressions.g:5728:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalKExpressions.g:5728:3: (kw= '-' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==26) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalKExpressions.g:5729:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_31); if (state.failed) return current;
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
    // InternalKExpressions.g:5746:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // InternalKExpressions.g:5746:49: (iv_ruleFloateger= ruleFloateger EOF )
            // InternalKExpressions.g:5747:2: iv_ruleFloateger= ruleFloateger EOF
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
    // InternalKExpressions.g:5753:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5759:2: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // InternalKExpressions.g:5760:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // InternalKExpressions.g:5760:2: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // InternalKExpressions.g:5761:3: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // InternalKExpressions.g:5761:3: (kw= '-' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==26) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalKExpressions.g:5762:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_54); if (state.failed) return current;
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
    // InternalKExpressions.g:5779:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // InternalKExpressions.g:5785:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // InternalKExpressions.g:5786:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // InternalKExpressions.g:5786:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt88=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt88=1;
                }
                break;
            case 54:
                {
                alt88=2;
                }
                break;
            case 55:
                {
                alt88=3;
                }
                break;
            case 56:
                {
                alt88=4;
                }
                break;
            case 57:
                {
                alt88=5;
                }
                break;
            case 58:
                {
                alt88=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalKExpressions.g:5787:3: (enumLiteral_0= '==' )
                    {
                    // InternalKExpressions.g:5787:3: (enumLiteral_0= '==' )
                    // InternalKExpressions.g:5788:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:5795:3: (enumLiteral_1= '<' )
                    {
                    // InternalKExpressions.g:5795:3: (enumLiteral_1= '<' )
                    // InternalKExpressions.g:5796:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalKExpressions.g:5803:3: (enumLiteral_2= '<=' )
                    {
                    // InternalKExpressions.g:5803:3: (enumLiteral_2= '<=' )
                    // InternalKExpressions.g:5804:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalKExpressions.g:5811:3: (enumLiteral_3= '>' )
                    {
                    // InternalKExpressions.g:5811:3: (enumLiteral_3= '>' )
                    // InternalKExpressions.g:5812:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalKExpressions.g:5819:3: (enumLiteral_4= '>=' )
                    {
                    // InternalKExpressions.g:5819:3: (enumLiteral_4= '>=' )
                    // InternalKExpressions.g:5820:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalKExpressions.g:5827:3: (enumLiteral_5= '!=' )
                    {
                    // InternalKExpressions.g:5827:3: (enumLiteral_5= '!=' )
                    // InternalKExpressions.g:5828:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:5838:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5844:2: ( (enumLiteral_0= 'pre' ) )
            // InternalKExpressions.g:5845:2: (enumLiteral_0= 'pre' )
            {
            // InternalKExpressions.g:5845:2: (enumLiteral_0= 'pre' )
            // InternalKExpressions.g:5846:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:5855:1: ruleBitwiseNotOperator returns [Enumerator current=null] : (enumLiteral_0= '~' ) ;
    public final Enumerator ruleBitwiseNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5861:2: ( (enumLiteral_0= '~' ) )
            // InternalKExpressions.g:5862:2: (enumLiteral_0= '~' )
            {
            // InternalKExpressions.g:5862:2: (enumLiteral_0= '~' )
            // InternalKExpressions.g:5863:3: enumLiteral_0= '~'
            {
            enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:5872:1: ruleBitwiseXOrOperator returns [Enumerator current=null] : (enumLiteral_0= '^' ) ;
    public final Enumerator ruleBitwiseXOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5878:2: ( (enumLiteral_0= '^' ) )
            // InternalKExpressions.g:5879:2: (enumLiteral_0= '^' )
            {
            // InternalKExpressions.g:5879:2: (enumLiteral_0= '^' )
            // InternalKExpressions.g:5880:3: enumLiteral_0= '^'
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
    // InternalKExpressions.g:5889:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5895:2: ( (enumLiteral_0= '|' ) )
            // InternalKExpressions.g:5896:2: (enumLiteral_0= '|' )
            {
            // InternalKExpressions.g:5896:2: (enumLiteral_0= '|' )
            // InternalKExpressions.g:5897:3: enumLiteral_0= '|'
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
    // InternalKExpressions.g:5906:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5912:2: ( (enumLiteral_0= '&' ) )
            // InternalKExpressions.g:5913:2: (enumLiteral_0= '&' )
            {
            // InternalKExpressions.g:5913:2: (enumLiteral_0= '&' )
            // InternalKExpressions.g:5914:3: enumLiteral_0= '&'
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
    // InternalKExpressions.g:5923:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5929:2: ( (enumLiteral_0= '!' ) )
            // InternalKExpressions.g:5930:2: (enumLiteral_0= '!' )
            {
            // InternalKExpressions.g:5930:2: (enumLiteral_0= '!' )
            // InternalKExpressions.g:5931:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:5940:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5946:2: ( (enumLiteral_0= '+' ) )
            // InternalKExpressions.g:5947:2: (enumLiteral_0= '+' )
            {
            // InternalKExpressions.g:5947:2: (enumLiteral_0= '+' )
            // InternalKExpressions.g:5948:3: enumLiteral_0= '+'
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
    // InternalKExpressions.g:5957:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5963:2: ( (enumLiteral_0= '-' ) )
            // InternalKExpressions.g:5964:2: (enumLiteral_0= '-' )
            {
            // InternalKExpressions.g:5964:2: (enumLiteral_0= '-' )
            // InternalKExpressions.g:5965:3: enumLiteral_0= '-'
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
    // InternalKExpressions.g:5974:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5980:2: ( (enumLiteral_0= '*' ) )
            // InternalKExpressions.g:5981:2: (enumLiteral_0= '*' )
            {
            // InternalKExpressions.g:5981:2: (enumLiteral_0= '*' )
            // InternalKExpressions.g:5982:3: enumLiteral_0= '*'
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
    // InternalKExpressions.g:5991:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:5997:2: ( (enumLiteral_0= '%' ) )
            // InternalKExpressions.g:5998:2: (enumLiteral_0= '%' )
            {
            // InternalKExpressions.g:5998:2: (enumLiteral_0= '%' )
            // InternalKExpressions.g:5999:3: enumLiteral_0= '%'
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
    // InternalKExpressions.g:6008:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6014:2: ( (enumLiteral_0= '/' ) )
            // InternalKExpressions.g:6015:2: (enumLiteral_0= '/' )
            {
            // InternalKExpressions.g:6015:2: (enumLiteral_0= '/' )
            // InternalKExpressions.g:6016:3: enumLiteral_0= '/'
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
    // InternalKExpressions.g:6025:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6031:2: ( (enumLiteral_0= 'val' ) )
            // InternalKExpressions.g:6032:2: (enumLiteral_0= 'val' )
            {
            // InternalKExpressions.g:6032:2: (enumLiteral_0= 'val' )
            // InternalKExpressions.g:6033:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalKExpressions.g:6042:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6048:2: ( (enumLiteral_0= '||' ) )
            // InternalKExpressions.g:6049:2: (enumLiteral_0= '||' )
            {
            // InternalKExpressions.g:6049:2: (enumLiteral_0= '||' )
            // InternalKExpressions.g:6050:3: enumLiteral_0= '||'
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
    // InternalKExpressions.g:6059:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6065:2: ( (enumLiteral_0= '&&' ) )
            // InternalKExpressions.g:6066:2: (enumLiteral_0= '&&' )
            {
            // InternalKExpressions.g:6066:2: (enumLiteral_0= '&&' )
            // InternalKExpressions.g:6067:3: enumLiteral_0= '&&'
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
    // InternalKExpressions.g:6076:1: ruleShiftLeftOperator returns [Enumerator current=null] : (enumLiteral_0= '<<' ) ;
    public final Enumerator ruleShiftLeftOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6082:2: ( (enumLiteral_0= '<<' ) )
            // InternalKExpressions.g:6083:2: (enumLiteral_0= '<<' )
            {
            // InternalKExpressions.g:6083:2: (enumLiteral_0= '<<' )
            // InternalKExpressions.g:6084:3: enumLiteral_0= '<<'
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
    // InternalKExpressions.g:6093:1: ruleShiftRightOperator returns [Enumerator current=null] : (enumLiteral_0= '>>' ) ;
    public final Enumerator ruleShiftRightOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6099:2: ( (enumLiteral_0= '>>' ) )
            // InternalKExpressions.g:6100:2: (enumLiteral_0= '>>' )
            {
            // InternalKExpressions.g:6100:2: (enumLiteral_0= '>>' )
            // InternalKExpressions.g:6101:3: enumLiteral_0= '>>'
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
    // InternalKExpressions.g:6110:1: ruleShiftRightUnsignedOperator returns [Enumerator current=null] : (enumLiteral_0= '>>>' ) ;
    public final Enumerator ruleShiftRightUnsignedOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6116:2: ( (enumLiteral_0= '>>>' ) )
            // InternalKExpressions.g:6117:2: (enumLiteral_0= '>>>' )
            {
            // InternalKExpressions.g:6117:2: (enumLiteral_0= '>>>' )
            // InternalKExpressions.g:6118:3: enumLiteral_0= '>>>'
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
    // InternalKExpressions.g:6127:1: ruleConditionalOperator returns [Enumerator current=null] : (enumLiteral_0= '?' ) ;
    public final Enumerator ruleConditionalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6133:2: ( (enumLiteral_0= '?' ) )
            // InternalKExpressions.g:6134:2: (enumLiteral_0= '?' )
            {
            // InternalKExpressions.g:6134:2: (enumLiteral_0= '?' )
            // InternalKExpressions.g:6135:3: enumLiteral_0= '?'
            {
            enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleInitOperator"
    // InternalKExpressions.g:6144:1: ruleInitOperator returns [Enumerator current=null] : (enumLiteral_0= '->' ) ;
    public final Enumerator ruleInitOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6150:2: ( (enumLiteral_0= '->' ) )
            // InternalKExpressions.g:6151:2: (enumLiteral_0= '->' )
            {
            // InternalKExpressions.g:6151:2: (enumLiteral_0= '->' )
            // InternalKExpressions.g:6152:3: enumLiteral_0= '->'
            {
            enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getInitOperatorAccess().getINITEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getInitOperatorAccess().getINITEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleInitOperator"


    // $ANTLR start "ruleFbyOperator"
    // InternalKExpressions.g:6161:1: ruleFbyOperator returns [Enumerator current=null] : (enumLiteral_0= 'fby' ) ;
    public final Enumerator ruleFbyOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6167:2: ( (enumLiteral_0= 'fby' ) )
            // InternalKExpressions.g:6168:2: (enumLiteral_0= 'fby' )
            {
            // InternalKExpressions.g:6168:2: (enumLiteral_0= 'fby' )
            // InternalKExpressions.g:6169:3: enumLiteral_0= 'fby'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getFbyOperatorAccess().getFBYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getFbyOperatorAccess().getFBYEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleFbyOperator"


    // $ANTLR start "ruleSfbyOperator"
    // InternalKExpressions.g:6178:1: ruleSfbyOperator returns [Enumerator current=null] : (enumLiteral_0= 'sfby' ) ;
    public final Enumerator ruleSfbyOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6184:2: ( (enumLiteral_0= 'sfby' ) )
            // InternalKExpressions.g:6185:2: (enumLiteral_0= 'sfby' )
            {
            // InternalKExpressions.g:6185:2: (enumLiteral_0= 'sfby' )
            // InternalKExpressions.g:6186:3: enumLiteral_0= 'sfby'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getSfbyOperatorAccess().getSFBYEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getSfbyOperatorAccess().getSFBYEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleSfbyOperator"


    // $ANTLR start "ruleParameterAccessType"
    // InternalKExpressions.g:6195:1: ruleParameterAccessType returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) ) ;
    public final Enumerator ruleParameterAccessType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalKExpressions.g:6201:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) ) )
            // InternalKExpressions.g:6202:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) )
            {
            // InternalKExpressions.g:6202:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '!&' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==21) ) {
                alt89=1;
            }
            else if ( (LA89_0==64) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalKExpressions.g:6203:3: (enumLiteral_0= '&' )
                    {
                    // InternalKExpressions.g:6203:3: (enumLiteral_0= '&' )
                    // InternalKExpressions.g:6204:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterAccessTypeAccess().getCALL_BY_REFERENCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getParameterAccessTypeAccess().getCALL_BY_REFERENCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalKExpressions.g:6211:3: (enumLiteral_1= '!&' )
                    {
                    // InternalKExpressions.g:6211:3: (enumLiteral_1= '!&' )
                    // InternalKExpressions.g:6212:4: enumLiteral_1= '!&'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getParameterAccessTypeAccess().getPURE_OUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getParameterAccessTypeAccess().getPURE_OUTPUTEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleParameterAccessType"

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

    // $ANTLR start synpred16_InternalKExpressions
    public final void synpred16_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1093:6: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )
        // InternalKExpressions.g:1093:6: otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) )
        {
        otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1097:6: ( (lv_subExpressions_5_0= ruleSumExpression ) )
        // InternalKExpressions.g:1098:7: (lv_subExpressions_5_0= ruleSumExpression )
        {
        // InternalKExpressions.g:1098:7: (lv_subExpressions_5_0= ruleSumExpression )
        // InternalKExpressions.g:1099:8: lv_subExpressions_5_0= ruleSumExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_0_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleSumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalKExpressions

    // $ANTLR start synpred18_InternalKExpressions
    public final void synpred18_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1169:6: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )
        // InternalKExpressions.g:1169:6: otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) )
        {
        otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1173:6: ( (lv_subExpressions_10_0= ruleSumExpression ) )
        // InternalKExpressions.g:1174:7: (lv_subExpressions_10_0= ruleSumExpression )
        {
        // InternalKExpressions.g:1174:7: (lv_subExpressions_10_0= ruleSumExpression )
        // InternalKExpressions.g:1175:8: lv_subExpressions_10_0= ruleSumExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_1_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleSumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred18_InternalKExpressions

    // $ANTLR start synpred20_InternalKExpressions
    public final void synpred20_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_subExpressions_15_0 = null;


        // InternalKExpressions.g:1245:6: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )
        // InternalKExpressions.g:1245:6: otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) )
        {
        otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1249:6: ( (lv_subExpressions_15_0= ruleSumExpression ) )
        // InternalKExpressions.g:1250:7: (lv_subExpressions_15_0= ruleSumExpression )
        {
        // InternalKExpressions.g:1250:7: (lv_subExpressions_15_0= ruleSumExpression )
        // InternalKExpressions.g:1251:8: lv_subExpressions_15_0= ruleSumExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getShiftExpressionsAccess().getSubExpressionsSumExpressionParserRuleCall_1_2_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_15_0=ruleSumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalKExpressions

    // $ANTLR start synpred26_InternalKExpressions
    public final void synpred26_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1566:6: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )
        // InternalKExpressions.g:1566:6: otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) )
        {
        otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1570:6: ( (lv_subExpressions_5_0= ruleProductExpression ) )
        // InternalKExpressions.g:1571:7: (lv_subExpressions_5_0= ruleProductExpression )
        {
        // InternalKExpressions.g:1571:7: (lv_subExpressions_5_0= ruleProductExpression )
        // InternalKExpressions.g:1572:8: lv_subExpressions_5_0= ruleProductExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_0_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleProductExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalKExpressions

    // $ANTLR start synpred28_InternalKExpressions
    public final void synpred28_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1642:6: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )
        // InternalKExpressions.g:1642:6: otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) )
        {
        otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1646:6: ( (lv_subExpressions_10_0= ruleProductExpression ) )
        // InternalKExpressions.g:1647:7: (lv_subExpressions_10_0= ruleProductExpression )
        {
        // InternalKExpressions.g:1647:7: (lv_subExpressions_10_0= ruleProductExpression )
        // InternalKExpressions.g:1648:8: lv_subExpressions_10_0= ruleProductExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getSumExpressionAccess().getSubExpressionsProductExpressionParserRuleCall_1_1_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleProductExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28_InternalKExpressions

    // $ANTLR start synpred30_InternalKExpressions
    public final void synpred30_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:1749:6: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )
        // InternalKExpressions.g:1749:6: otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) )
        {
        otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1753:6: ( (lv_subExpressions_5_0= ruleNegExpression ) )
        // InternalKExpressions.g:1754:7: (lv_subExpressions_5_0= ruleNegExpression )
        {
        // InternalKExpressions.g:1754:7: (lv_subExpressions_5_0= ruleNegExpression )
        // InternalKExpressions.g:1755:8: lv_subExpressions_5_0= ruleNegExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_0_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_5_0=ruleNegExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30_InternalKExpressions

    // $ANTLR start synpred32_InternalKExpressions
    public final void synpred32_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        EObject lv_subExpressions_10_0 = null;


        // InternalKExpressions.g:1825:6: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )
        // InternalKExpressions.g:1825:6: otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) )
        {
        otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1829:6: ( (lv_subExpressions_10_0= ruleNegExpression ) )
        // InternalKExpressions.g:1830:7: (lv_subExpressions_10_0= ruleNegExpression )
        {
        // InternalKExpressions.g:1830:7: (lv_subExpressions_10_0= ruleNegExpression )
        // InternalKExpressions.g:1831:8: lv_subExpressions_10_0= ruleNegExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_1_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_10_0=ruleNegExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32_InternalKExpressions

    // $ANTLR start synpred34_InternalKExpressions
    public final void synpred34_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_14=null;
        EObject lv_subExpressions_15_0 = null;


        // InternalKExpressions.g:1901:6: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )
        // InternalKExpressions.g:1901:6: otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) )
        {
        otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalKExpressions.g:1905:6: ( (lv_subExpressions_15_0= ruleNegExpression ) )
        // InternalKExpressions.g:1906:7: (lv_subExpressions_15_0= ruleNegExpression )
        {
        // InternalKExpressions.g:1906:7: (lv_subExpressions_15_0= ruleNegExpression )
        // InternalKExpressions.g:1907:8: lv_subExpressions_15_0= ruleNegExpression
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getProductExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_1_2_3_1_0());
          							
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_subExpressions_15_0=ruleNegExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34_InternalKExpressions

    // $ANTLR start synpred38_InternalKExpressions
    public final void synpred38_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_subExpressions_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject lv_subExpressions_5_0 = null;


        // InternalKExpressions.g:2027:3: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) )
        // InternalKExpressions.g:2027:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
        {
        // InternalKExpressions.g:2027:3: ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? )
        // InternalKExpressions.g:2028:4: () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
        {
        // InternalKExpressions.g:2028:4: ()
        // InternalKExpressions.g:2029:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalKExpressions.g:2038:4: ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:2039:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:2039:5: (lv_subExpressions_1_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:2040:6: lv_subExpressions_1_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_1_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_16);
        lv_subExpressions_1_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:2057:4: ( (lv_operator_2_0= ruleConditionalOperator ) )
        // InternalKExpressions.g:2058:5: (lv_operator_2_0= ruleConditionalOperator )
        {
        // InternalKExpressions.g:2058:5: (lv_operator_2_0= ruleConditionalOperator )
        // InternalKExpressions.g:2059:6: lv_operator_2_0= ruleConditionalOperator
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getOperatorConditionalOperatorEnumRuleCall_0_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_17);
        lv_operator_2_0=ruleConditionalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:2076:4: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
        // InternalKExpressions.g:2077:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        {
        // InternalKExpressions.g:2077:5: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
        // InternalKExpressions.g:2078:6: lv_subExpressions_3_0= ruleAtomicValuedExpression
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_3_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_18);
        lv_subExpressions_3_0=ruleAtomicValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalKExpressions.g:2095:4: (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )?
        int alt105=2;
        int LA105_0 = input.LA(1);

        if ( (LA105_0==30) ) {
            alt105=1;
        }
        switch (alt105) {
            case 1 :
                // InternalKExpressions.g:2096:5: otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                {
                otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_17); if (state.failed) return ;
                // InternalKExpressions.g:2100:5: ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) )
                // InternalKExpressions.g:2101:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                {
                // InternalKExpressions.g:2101:6: (lv_subExpressions_5_0= ruleAtomicValuedExpression )
                // InternalKExpressions.g:2102:7: lv_subExpressions_5_0= ruleAtomicValuedExpression
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getTernaryOperationAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_0_4_1_0());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_subExpressions_5_0=ruleAtomicValuedExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred38_InternalKExpressions

    // $ANTLR start synpred47_InternalKExpressions
    public final void synpred47_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_ReferenceCall_4 = null;


        // InternalKExpressions.g:2507:3: (this_ReferenceCall_4= ruleReferenceCall )
        // InternalKExpressions.g:2507:3: this_ReferenceCall_4= ruleReferenceCall
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ReferenceCall_4=ruleReferenceCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalKExpressions

    // $ANTLR start synpred51_InternalKExpressions
    public final void synpred51_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_ValuedObjectTestExpression_8 = null;


        // InternalKExpressions.g:2555:3: (this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression )
        // InternalKExpressions.g:2555:3: this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ValuedObjectTestExpression_8=ruleValuedObjectTestExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalKExpressions

    // $ANTLR start synpred57_InternalKExpressions
    public final void synpred57_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_ValuedExpression_5 = null;


        // InternalKExpressions.g:2657:3: ( (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) )
        // InternalKExpressions.g:2657:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        {
        // InternalKExpressions.g:2657:3: (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' )
        // InternalKExpressions.g:2658:4: otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')'
        {
        otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_11); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_22);
        this_ValuedExpression_5=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalKExpressions

    // $ANTLR start synpred78_InternalKExpressions
    public final void synpred78_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // InternalKExpressions.g:3886:3: (this_BoolExpression_0= ruleBoolExpression )
        // InternalKExpressions.g:3886:3: this_BoolExpression_0= ruleBoolExpression
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
    // $ANTLR end synpred78_InternalKExpressions

    // $ANTLR start synpred79_InternalKExpressions
    public final void synpred79_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_1 = null;


        // InternalKExpressions.g:3898:3: (this_ValuedExpression_1= ruleValuedExpression )
        // InternalKExpressions.g:3898:3: this_ValuedExpression_1= ruleValuedExpression
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
    // $ANTLR end synpred79_InternalKExpressions

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
    public final boolean synpred20_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalKExpressions_fragment(); // can never throw exception
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
    public final boolean synpred16_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalKExpressions_fragment(); // can never throw exception
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
    public final boolean synpred34_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalKExpressions_fragment(); // can never throw exception
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
    public final boolean synpred47_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalKExpressions_fragment(); // can never throw exception
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
    public final boolean synpred38_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalKExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalKExpressions_fragment(); // can never throw exception
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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\4\21\0\3\uffff";
    static final String dfa_3s = "\1\76\21\0\3\uffff";
    static final String dfa_4s = "\22\uffff\1\1\1\uffff\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\1\2\1\21\1\3\1\7\1\4\1\17\17\uffff\1\1\7\uffff\1\6\2\uffff\1\16\5\uffff\1\12\1\13\1\11\1\5\5\uffff\1\20\6\uffff\1\14\2\22\1\15",
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
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA1_14 = input.LA(1);

                         
                        int index1_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA1_15 = input.LA(1);

                         
                        int index1_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA1_16 = input.LA(1);

                         
                        int index1_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA1_17 = input.LA(1);

                         
                        int index1_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index1_17);
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
    static final String dfa_7s = "\24\uffff";
    static final String dfa_8s = "\1\4\5\uffff\14\0\2\uffff";
    static final String dfa_9s = "\1\76\5\uffff\14\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\20\uffff\1\2\1\uffff";
    static final String dfa_11s = "\6\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\10\1\1\1\21\1\1\1\7\1\1\1\17\17\uffff\1\1\7\uffff\1\6\2\uffff\1\16\5\uffff\1\12\1\13\1\11\1\1\5\uffff\1\20\6\uffff\1\14\2\22\1\15",
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

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_12 = input.LA(1);

                         
                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_13 = input.LA(1);

                         
                        int index13_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_14 = input.LA(1);

                         
                        int index13_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_15 = input.LA(1);

                         
                        int index13_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_16 = input.LA(1);

                         
                        int index13_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_16);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_17 = input.LA(1);

                         
                        int index13_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index13_17);
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
    static final String dfa_13s = "\1\1\24\uffff";
    static final String dfa_14s = "\1\21\20\uffff\1\0\3\uffff";
    static final String dfa_15s = "\1\72\20\uffff\1\0\3\uffff";
    static final String dfa_16s = "\1\uffff\1\2\22\uffff\1\1";
    static final String dfa_17s = "\21\uffff\1\0\3\uffff}>";
    static final String[] dfa_18s = {
            "\5\1\1\21\2\1\12\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            "",
            "",
            ""
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "()* loopback of 1092:5: (otherlv_4= '<<' ( (lv_subExpressions_5_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_17 = input.LA(1);

                         
                        int index16_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalKExpressions()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index16_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\1\21\21\uffff\1\0\2\uffff";
    static final String dfa_20s = "\1\72\21\uffff\1\0\2\uffff";
    static final String dfa_21s = "\22\uffff\1\0\2\uffff}>";
    static final String[] dfa_22s = {
            "\6\1\1\22\1\1\12\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_16;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()* loopback of 1168:5: (otherlv_9= '>>' ( (lv_subExpressions_10_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_18 = input.LA(1);

                         
                        int index17_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalKExpressions()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index17_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_23s = "\1\21\22\uffff\1\0\1\uffff";
    static final String dfa_24s = "\1\72\22\uffff\1\0\1\uffff";
    static final String dfa_25s = "\23\uffff\1\0\1\uffff}>";
    static final String[] dfa_26s = {
            "\7\1\1\23\12\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            ""
    };
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_23;
            this.max = dfa_24;
            this.accept = dfa_16;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "()* loopback of 1244:5: (otherlv_14= '>>>' ( (lv_subExpressions_15_0= ruleSumExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_19 = input.LA(1);

                         
                        int index18_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalKExpressions()) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\27\uffff";
    static final String dfa_28s = "\1\1\26\uffff";
    static final String dfa_29s = "\1\21\23\uffff\1\0\2\uffff";
    static final String dfa_30s = "\1\72\23\uffff\1\0\2\uffff";
    static final String dfa_31s = "\1\uffff\1\2\24\uffff\1\1";
    static final String dfa_32s = "\24\uffff\1\0\2\uffff}>";
    static final String[] dfa_33s = {
            "\10\1\1\24\1\1\10\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 1565:5: (otherlv_4= '+' ( (lv_subExpressions_5_0= ruleProductExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_20 = input.LA(1);

                         
                        int index24_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalKExpressions()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index24_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\1\21\24\uffff\1\0\1\uffff";
    static final String dfa_35s = "\1\72\24\uffff\1\0\1\uffff";
    static final String dfa_36s = "\25\uffff\1\0\1\uffff}>";
    static final String[] dfa_37s = {
            "\11\1\1\25\10\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            ""
    };
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_31;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "()* loopback of 1641:5: (otherlv_9= '-' ( (lv_subExpressions_10_0= ruleProductExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_21 = input.LA(1);

                         
                        int index25_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKExpressions()) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_21);
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
    static final String dfa_38s = "\32\uffff";
    static final String dfa_39s = "\1\1\31\uffff";
    static final String dfa_40s = "\1\21\25\uffff\1\0\3\uffff";
    static final String dfa_41s = "\1\72\25\uffff\1\0\3\uffff";
    static final String dfa_42s = "\1\uffff\1\2\27\uffff\1\1";
    static final String dfa_43s = "\26\uffff\1\0\3\uffff}>";
    static final String[] dfa_44s = {
            "\12\1\1\26\2\1\5\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()* loopback of 1748:5: (otherlv_4= '*' ( (lv_subExpressions_5_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_22 = input.LA(1);

                         
                        int index27_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalKExpressions()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_45s = "\1\21\26\uffff\1\0\2\uffff";
    static final String dfa_46s = "\1\72\26\uffff\1\0\2\uffff";
    static final String dfa_47s = "\27\uffff\1\0\2\uffff}>";
    static final String[] dfa_48s = {
            "\13\1\1\27\1\1\5\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[][] dfa_48 = unpackEncodedStringArray(dfa_48s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_42;
            this.special = dfa_47;
            this.transition = dfa_48;
        }
        public String getDescription() {
            return "()* loopback of 1824:5: (otherlv_9= '/' ( (lv_subExpressions_10_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_23 = input.LA(1);

                         
                        int index28_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalKExpressions()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_23);
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
    static final String dfa_49s = "\1\21\27\uffff\1\0\1\uffff";
    static final String dfa_50s = "\1\72\27\uffff\1\0\1\uffff";
    static final String dfa_51s = "\30\uffff\1\0\1\uffff}>";
    static final String[] dfa_52s = {
            "\14\1\1\30\5\uffff\2\1\4\uffff\1\1\6\uffff\1\1\4\uffff\6\1",
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
            "\1\uffff",
            ""
    };
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final char[] dfa_50 = DFA.unpackEncodedStringToUnsignedChars(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_49;
            this.max = dfa_50;
            this.accept = dfa_42;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "()* loopback of 1900:5: (otherlv_14= '%' ( (lv_subExpressions_15_0= ruleNegExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_24 = input.LA(1);

                         
                        int index29_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalKExpressions()) ) {s = 25;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index29_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_53s = "\23\uffff";
    static final String dfa_54s = "\1\4\20\0\2\uffff";
    static final String dfa_55s = "\1\76\20\0\2\uffff";
    static final String dfa_56s = "\21\uffff\1\1\1\2";
    static final String dfa_57s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\2\uffff}>";
    static final String[] dfa_58s = {
            "\1\7\1\1\1\20\1\2\1\6\1\3\1\16\27\uffff\1\5\2\uffff\1\15\5\uffff\1\11\1\12\1\10\1\4\5\uffff\1\17\6\uffff\1\13\2\uffff\1\14",
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
            ""
    };

    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_53;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "2026:2: ( ( () ( (lv_subExpressions_1_0= ruleAtomicValuedExpression ) ) ( (lv_operator_2_0= ruleConditionalOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) (otherlv_4= ':' ( (lv_subExpressions_5_0= ruleAtomicValuedExpression ) ) )? ) | this_InitExpression_6= ruleInitExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA33_8 = input.LA(1);

                         
                        int index33_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA33_9 = input.LA(1);

                         
                        int index33_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA33_10 = input.LA(1);

                         
                        int index33_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA33_11 = input.LA(1);

                         
                        int index33_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA33_12 = input.LA(1);

                         
                        int index33_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA33_13 = input.LA(1);

                         
                        int index33_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA33_14 = input.LA(1);

                         
                        int index33_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA33_15 = input.LA(1);

                         
                        int index33_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA33_16 = input.LA(1);

                         
                        int index33_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index33_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_59s = "\16\uffff";
    static final String dfa_60s = "\1\4\2\uffff\1\0\12\uffff";
    static final String dfa_61s = "\1\76\2\uffff\1\0\12\uffff";
    static final String dfa_62s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11\2\uffff\1\3";
    static final String dfa_63s = "\3\uffff\1\0\12\uffff}>";
    static final String[] dfa_64s = {
            "\1\3\1\uffff\1\12\1\uffff\1\1\1\uffff\1\12\27\uffff\1\2\2\uffff\1\11\5\uffff\1\5\1\6\1\4\6\uffff\1\12\6\uffff\1\7\2\uffff\1\7",
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
            ""
    };

    static final short[] dfa_59 = DFA.unpackEncodedString(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final char[] dfa_61 = DFA.unpackEncodedStringToUnsignedChars(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[] dfa_63 = DFA.unpackEncodedString(dfa_63s);
    static final short[][] dfa_64 = unpackEncodedStringArray(dfa_64s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_59;
            this.eof = dfa_59;
            this.min = dfa_60;
            this.max = dfa_61;
            this.accept = dfa_62;
            this.special = dfa_63;
            this.transition = dfa_64;
        }
        public String getDescription() {
            return "2472:2: (this_BoolValue_0= ruleBoolValue | (otherlv_1= '(' this_BoolExpression_2= ruleBoolExpression otherlv_3= ')' ) | this_ReferenceCall_4= ruleReferenceCall | this_FunctionCall_5= ruleFunctionCall | this_RandomCall_6= ruleRandomCall | this_RandomizeCall_7= ruleRandomizeCall | this_ValuedObjectTestExpression_8= ruleValuedObjectTestExpression | this_SpecialAccessExpression_9= ruleSpecialAccessExpression | this_TextExpression_10= ruleTextExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_3 = input.LA(1);

                         
                        int index40_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalKExpressions()) ) {s = 13;}

                        else if ( (synpred51_InternalKExpressions()) ) {s = 7;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_65s = "\22\uffff";
    static final String dfa_66s = "\1\4\4\uffff\1\0\14\uffff";
    static final String dfa_67s = "\1\76\4\uffff\1\0\14\uffff";
    static final String dfa_68s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\12\uffff\1\5";
    static final String dfa_69s = "\5\uffff\1\0\14\uffff}>";
    static final String[] dfa_70s = {
            "\1\6\1\1\1\6\1\2\1\6\1\3\1\6\27\uffff\1\5\2\uffff\1\6\5\uffff\3\6\1\4\5\uffff\1\6\6\uffff\1\6\2\uffff\1\6",
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
            "",
            ""
    };

    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_65;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "2608:2: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | this_VectorValue_3= ruleVectorValue | (otherlv_4= '(' this_ValuedExpression_5= ruleValuedExpression otherlv_6= ')' ) | this_AtomicExpression_7= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_5 = input.LA(1);

                         
                        int index41_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalKExpressions()) ) {s = 17;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index41_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_71s = "\5\uffff";
    static final String dfa_72s = "\1\4\2\43\2\uffff";
    static final String dfa_73s = "\1\4\2\47\2\uffff";
    static final String dfa_74s = "\3\uffff\1\1\1\2";
    static final String dfa_75s = "\5\uffff}>";
    static final String[] dfa_76s = {
            "\1\1",
            "\1\4\2\uffff\1\3\1\2",
            "\1\4\2\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] dfa_71 = DFA.unpackEncodedString(dfa_71s);
    static final char[] dfa_72 = DFA.unpackEncodedStringToUnsignedChars(dfa_72s);
    static final char[] dfa_73 = DFA.unpackEncodedStringToUnsignedChars(dfa_73s);
    static final short[] dfa_74 = DFA.unpackEncodedString(dfa_74s);
    static final short[] dfa_75 = DFA.unpackEncodedString(dfa_75s);
    static final short[][] dfa_76 = unpackEncodedStringArray(dfa_76s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_71;
            this.eof = dfa_71;
            this.min = dfa_72;
            this.max = dfa_73;
            this.accept = dfa_74;
            this.special = dfa_75;
            this.transition = dfa_76;
        }
        public String getDescription() {
            return "2859:3: ( ( ( rulePrimeID ) ) otherlv_3= '.' )?";
        }
    }
    static final String dfa_77s = "\26\uffff";
    static final String dfa_78s = "\1\4\21\0\4\uffff";
    static final String dfa_79s = "\1\76\21\0\4\uffff";
    static final String dfa_80s = "\22\uffff\1\1\1\uffff\1\3\1\2";
    static final String dfa_81s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\4\uffff}>";
    static final String[] dfa_82s = {
            "\1\10\1\2\1\21\1\3\1\7\1\4\1\17\17\uffff\1\1\7\uffff\1\6\2\uffff\1\16\5\uffff\1\12\1\13\1\11\1\5\2\uffff\1\24\2\uffff\1\20\6\uffff\1\14\2\22\1\15",
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
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_77 = DFA.unpackEncodedString(dfa_77s);
    static final char[] dfa_78 = DFA.unpackEncodedStringToUnsignedChars(dfa_78s);
    static final char[] dfa_79 = DFA.unpackEncodedStringToUnsignedChars(dfa_79s);
    static final short[] dfa_80 = DFA.unpackEncodedString(dfa_80s);
    static final short[] dfa_81 = DFA.unpackEncodedString(dfa_81s);
    static final short[][] dfa_82 = unpackEncodedStringArray(dfa_82s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_77;
            this.eof = dfa_77;
            this.min = dfa_78;
            this.max = dfa_79;
            this.accept = dfa_80;
            this.special = dfa_81;
            this.transition = dfa_82;
        }
        public String getDescription() {
            return "3885:2: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression | this_IgnoreValue_2= ruleIgnoreValue )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_2 = input.LA(1);

                         
                        int index62_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_9 = input.LA(1);

                         
                        int index62_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_10 = input.LA(1);

                         
                        int index62_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_11 = input.LA(1);

                         
                        int index62_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_12 = input.LA(1);

                         
                        int index62_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_13 = input.LA(1);

                         
                        int index62_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA62_14 = input.LA(1);

                         
                        int index62_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA62_15 = input.LA(1);

                         
                        int index62_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA62_17 = input.LA(1);

                         
                        int index62_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalKExpressions()) ) {s = 18;}

                        else if ( (synpred79_InternalKExpressions()) ) {s = 21;}

                         
                        input.seek(index62_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_83s = "\12\uffff";
    static final String dfa_84s = "\3\uffff\1\1\4\uffff\2\1";
    static final String dfa_85s = "\1\12\1\uffff\4\4\1\5\1\uffff\2\4";
    static final String dfa_86s = "\1\64\1\uffff\1\4\1\64\1\4\1\7\1\5\1\uffff\2\64";
    static final String dfa_87s = "\1\uffff\1\1\5\uffff\1\2\2\uffff";
    static final String dfa_88s = "\12\uffff}>";
    static final String[] dfa_89s = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\7\1\17\uffff\1\5\13\uffff\1\4\1\uffff\1\1\5\uffff\1\7\4\uffff\1\6\1\1",
            "\1\10",
            "\1\10\1\1\1\uffff\1\1",
            "\1\11",
            "",
            "\7\1\17\uffff\1\5\13\uffff\1\4\1\uffff\1\1\5\uffff\1\7\4\uffff\1\6\1\1",
            "\7\1\17\uffff\1\1\15\uffff\1\1\5\uffff\1\7\5\uffff\1\1"
    };

    static final short[] dfa_83 = DFA.unpackEncodedString(dfa_83s);
    static final short[] dfa_84 = DFA.unpackEncodedString(dfa_84s);
    static final char[] dfa_85 = DFA.unpackEncodedStringToUnsignedChars(dfa_85s);
    static final char[] dfa_86 = DFA.unpackEncodedStringToUnsignedChars(dfa_86s);
    static final short[] dfa_87 = DFA.unpackEncodedString(dfa_87s);
    static final short[] dfa_88 = DFA.unpackEncodedString(dfa_88s);
    static final short[][] dfa_89 = unpackEncodedStringArray(dfa_89s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_83;
            this.eof = dfa_84;
            this.min = dfa_85;
            this.max = dfa_86;
            this.accept = dfa_87;
            this.special = dfa_88;
            this.transition = dfa_89;
        }
        public String getDescription() {
            return "4485:2: (this_Annotation_0= superAnnotation | this_JsonAnnotation_1= ruleJsonAnnotation )";
        }
    }
    static final String dfa_90s = "\14\uffff";
    static final String dfa_91s = "\3\uffff\1\11\6\uffff\2\11";
    static final String dfa_92s = "\1\12\1\uffff\4\4\1\5\3\uffff\2\4";
    static final String dfa_93s = "\1\64\1\uffff\1\4\1\64\1\4\1\7\1\5\3\uffff\2\64";
    static final String dfa_94s = "\1\uffff\1\1\5\uffff\1\3\1\2\1\4\2\uffff";
    static final String dfa_95s = "\14\uffff}>";
    static final String[] dfa_96s = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\2\10\1\11\3\10\1\11\17\uffff\1\5\13\uffff\1\4\1\uffff\1\7\12\uffff\1\6\1\11",
            "\1\12",
            "\1\12\1\10\1\uffff\1\10",
            "\1\13",
            "",
            "",
            "",
            "\2\10\1\11\3\10\1\11\17\uffff\1\5\13\uffff\1\4\1\uffff\1\7\12\uffff\1\6\1\11",
            "\2\10\1\11\3\10\1\11\17\uffff\1\10\15\uffff\1\7\13\uffff\1\11"
    };

    static final short[] dfa_90 = DFA.unpackEncodedString(dfa_90s);
    static final short[] dfa_91 = DFA.unpackEncodedString(dfa_91s);
    static final char[] dfa_92 = DFA.unpackEncodedStringToUnsignedChars(dfa_92s);
    static final char[] dfa_93 = DFA.unpackEncodedStringToUnsignedChars(dfa_93s);
    static final short[] dfa_94 = DFA.unpackEncodedString(dfa_94s);
    static final short[] dfa_95 = DFA.unpackEncodedString(dfa_95s);
    static final short[][] dfa_96 = unpackEncodedStringArray(dfa_96s);

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = dfa_90;
            this.eof = dfa_91;
            this.min = dfa_92;
            this.max = dfa_93;
            this.accept = dfa_94;
            this.special = dfa_95;
            this.transition = dfa_96;
        }
        public String getDescription() {
            return "4527:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
    static final String dfa_97s = "\2\uffff\1\6\5\uffff\2\6";
    static final String dfa_98s = "\1\63\4\4\1\5\2\uffff\2\4";
    static final String dfa_99s = "\1\63\1\4\1\63\1\4\1\7\1\5\2\uffff\1\63\1\32";
    static final String dfa_100s = "\6\uffff\1\2\1\1\2\uffff";
    static final String[] dfa_101s = {
            "\1\1",
            "\1\2",
            "\2\7\1\uffff\3\7\20\uffff\1\4\13\uffff\1\3\14\uffff\1\5",
            "\1\10",
            "\1\10\1\7\1\uffff\1\7",
            "\1\11",
            "",
            "",
            "\2\7\1\uffff\3\7\20\uffff\1\4\13\uffff\1\3\14\uffff\1\5",
            "\2\7\1\uffff\3\7\20\uffff\1\7"
    };
    static final short[] dfa_97 = DFA.unpackEncodedString(dfa_97s);
    static final char[] dfa_98 = DFA.unpackEncodedStringToUnsignedChars(dfa_98s);
    static final char[] dfa_99 = DFA.unpackEncodedStringToUnsignedChars(dfa_99s);
    static final short[] dfa_100 = DFA.unpackEncodedString(dfa_100s);
    static final short[][] dfa_101 = unpackEncodedStringArray(dfa_101s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_83;
            this.eof = dfa_97;
            this.min = dfa_98;
            this.max = dfa_99;
            this.accept = dfa_100;
            this.special = dfa_88;
            this.transition = dfa_101;
        }
        public String getDescription() {
            return "4593:2: (this_StringPragma_0= ruleStringPragma | this_PragmaTag_1= rulePragmaTag )";
        }
    }
    static final String dfa_102s = "\13\uffff";
    static final String dfa_103s = "\1\12\1\uffff\4\4\1\5\2\uffff\2\4";
    static final String dfa_104s = "\1\64\1\uffff\1\4\1\63\1\4\1\7\1\5\2\uffff\1\63\1\50";
    static final String dfa_105s = "\1\uffff\1\1\5\uffff\1\3\1\2\2\uffff";
    static final String dfa_106s = "\13\uffff}>";
    static final String[] dfa_107s = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\2\10\1\uffff\3\10\20\uffff\1\5\13\uffff\1\4\1\uffff\1\7\12\uffff\1\6",
            "\1\11",
            "\1\11\1\10\1\uffff\1\10",
            "\1\12",
            "",
            "",
            "\2\10\1\uffff\3\10\20\uffff\1\5\13\uffff\1\4\1\uffff\1\7\12\uffff\1\6",
            "\2\10\1\uffff\3\10\20\uffff\1\10\15\uffff\1\7"
    };

    static final short[] dfa_102 = DFA.unpackEncodedString(dfa_102s);
    static final char[] dfa_103 = DFA.unpackEncodedStringToUnsignedChars(dfa_103s);
    static final char[] dfa_104 = DFA.unpackEncodedStringToUnsignedChars(dfa_104s);
    static final short[] dfa_105 = DFA.unpackEncodedString(dfa_105s);
    static final short[] dfa_106 = DFA.unpackEncodedString(dfa_106s);
    static final short[][] dfa_107 = unpackEncodedStringArray(dfa_107s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_102;
            this.eof = dfa_102;
            this.min = dfa_103;
            this.max = dfa_104;
            this.accept = dfa_105;
            this.special = dfa_106;
            this.transition = dfa_107;
        }
        public String getDescription() {
            return "4635:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyStringValueAnnotation_1= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_2= ruleTypedKeyStringValueAnnotation )";
        }
    }
    static final String dfa_108s = "\1\12\1\uffff\1\4\1\11\2\4\1\5\3\uffff\2\11";
    static final String dfa_109s = "\1\64\1\uffff\1\4\1\63\2\4\1\5\3\uffff\1\63\1\50";
    static final String[] dfa_110s = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\1\10\20\uffff\1\5\13\uffff\1\4\1\uffff\1\7\12\uffff\1\6",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "\1\10\20\uffff\1\5\13\uffff\1\4\1\uffff\1\7\12\uffff\1\6",
            "\1\10\36\uffff\1\7"
    };
    static final char[] dfa_108 = DFA.unpackEncodedStringToUnsignedChars(dfa_108s);
    static final char[] dfa_109 = DFA.unpackEncodedStringToUnsignedChars(dfa_109s);
    static final short[][] dfa_110 = unpackEncodedStringArray(dfa_110s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_90;
            this.eof = dfa_91;
            this.min = dfa_108;
            this.max = dfa_109;
            this.accept = dfa_94;
            this.special = dfa_95;
            this.transition = dfa_110;
        }
        public String getDescription() {
            return "4689:2: (this_CommentAnnotation_0= ruleCommentAnnotation | this_QuotedKeyStringValueAnnotation_1= ruleQuotedKeyStringValueAnnotation | this_QuotedTypedKeyStringValueAnnotation_2= ruleQuotedTypedKeyStringValueAnnotation | this_TagAnnotation_3= ruleTagAnnotation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x78107824040007F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x07E0000000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x48107824040007F0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x48107824000007F0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4800000000000010L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000014000000002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000054400000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040400000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x78107824042007F0L,0x0000000000000001L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000440L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x78127824040007F0L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001001000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4800000000000030L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000200L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00044100000003A0L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00044300000003A0L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000021000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000040003B0L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000310L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008004004000002L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000080L});
    }


}