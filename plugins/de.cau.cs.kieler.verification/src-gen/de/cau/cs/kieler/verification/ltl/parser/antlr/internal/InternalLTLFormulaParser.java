package de.cau.cs.kieler.verification.ltl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.verification.ltl.services.LTLFormulaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLTLFormulaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "'&&'", "'||'", "'G'", "'('", "')'", "'F'", "'X'", "'!'", "'U'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLTLFormulaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLTLFormulaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLTLFormulaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLTLFormula.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private LTLFormulaGrammarAccess grammarAccess;

        public InternalLTLFormulaParser(TokenStream input, LTLFormulaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LTLFormula";
       	}

       	@Override
       	protected LTLFormulaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLTLFormula"
    // InternalLTLFormula.g:70:1: entryRuleLTLFormula returns [EObject current=null] : iv_ruleLTLFormula= ruleLTLFormula EOF ;
    public final EObject entryRuleLTLFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLTLFormula = null;


        try {
            // InternalLTLFormula.g:70:51: (iv_ruleLTLFormula= ruleLTLFormula EOF )
            // InternalLTLFormula.g:71:2: iv_ruleLTLFormula= ruleLTLFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLTLFormulaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLTLFormula=ruleLTLFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLTLFormula; 
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
    // $ANTLR end "entryRuleLTLFormula"


    // $ANTLR start "ruleLTLFormula"
    // InternalLTLFormula.g:77:1: ruleLTLFormula returns [EObject current=null] : ( ( (lv_formulas_0_0= ruleOr ) ) (otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) ) )* ) ;
    public final EObject ruleLTLFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formulas_0_0 = null;

        EObject lv_formulas_2_0 = null;



        	enterRule();

        try {
            // InternalLTLFormula.g:83:2: ( ( ( (lv_formulas_0_0= ruleOr ) ) (otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) ) )* ) )
            // InternalLTLFormula.g:84:2: ( ( (lv_formulas_0_0= ruleOr ) ) (otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) ) )* )
            {
            // InternalLTLFormula.g:84:2: ( ( (lv_formulas_0_0= ruleOr ) ) (otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) ) )* )
            // InternalLTLFormula.g:85:3: ( (lv_formulas_0_0= ruleOr ) ) (otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) ) )*
            {
            // InternalLTLFormula.g:85:3: ( (lv_formulas_0_0= ruleOr ) )
            // InternalLTLFormula.g:86:4: (lv_formulas_0_0= ruleOr )
            {
            // InternalLTLFormula.g:86:4: (lv_formulas_0_0= ruleOr )
            // InternalLTLFormula.g:87:5: lv_formulas_0_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLTLFormulaAccess().getFormulasOrParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_3);
            lv_formulas_0_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLTLFormulaRule());
              					}
              					add(
              						current,
              						"formulas",
              						lv_formulas_0_0,
              						"de.cau.cs.kieler.verification.ltl.LTLFormula.Or");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLTLFormula.g:104:3: (otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLTLFormula.g:105:4: otherlv_1= '->' ( (lv_formulas_2_0= ruleOr ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getLTLFormulaAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	      			
            	    }
            	    // InternalLTLFormula.g:109:4: ( (lv_formulas_2_0= ruleOr ) )
            	    // InternalLTLFormula.g:110:5: (lv_formulas_2_0= ruleOr )
            	    {
            	    // InternalLTLFormula.g:110:5: (lv_formulas_2_0= ruleOr )
            	    // InternalLTLFormula.g:111:6: lv_formulas_2_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLTLFormulaAccess().getFormulasOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_formulas_2_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLTLFormulaRule());
            	      						}
            	      						add(
            	      							current,
            	      							"formulas",
            	      							lv_formulas_2_0,
            	      							"de.cau.cs.kieler.verification.ltl.LTLFormula.Or");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleLTLFormula"


    // $ANTLR start "entryRuleAnd"
    // InternalLTLFormula.g:133:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalLTLFormula.g:133:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalLTLFormula.g:134:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalLTLFormula.g:140:1: ruleAnd returns [EObject current=null] : ( ( (lv_formulas_0_0= ruleLast ) ) (otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formulas_0_0 = null;

        EObject lv_formulas_2_0 = null;



        	enterRule();

        try {
            // InternalLTLFormula.g:146:2: ( ( ( (lv_formulas_0_0= ruleLast ) ) (otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) ) )* ) )
            // InternalLTLFormula.g:147:2: ( ( (lv_formulas_0_0= ruleLast ) ) (otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) ) )* )
            {
            // InternalLTLFormula.g:147:2: ( ( (lv_formulas_0_0= ruleLast ) ) (otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) ) )* )
            // InternalLTLFormula.g:148:3: ( (lv_formulas_0_0= ruleLast ) ) (otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) ) )*
            {
            // InternalLTLFormula.g:148:3: ( (lv_formulas_0_0= ruleLast ) )
            // InternalLTLFormula.g:149:4: (lv_formulas_0_0= ruleLast )
            {
            // InternalLTLFormula.g:149:4: (lv_formulas_0_0= ruleLast )
            // InternalLTLFormula.g:150:5: lv_formulas_0_0= ruleLast
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndAccess().getFormulasLastParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_formulas_0_0=ruleLast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndRule());
              					}
              					add(
              						current,
              						"formulas",
              						lv_formulas_0_0,
              						"de.cau.cs.kieler.verification.ltl.LTLFormula.Last");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLTLFormula.g:167:3: (otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLTLFormula.g:168:4: otherlv_1= '&&' ( (lv_formulas_2_0= ruleLast ) )
            	    {
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_0());
            	      			
            	    }
            	    // InternalLTLFormula.g:172:4: ( (lv_formulas_2_0= ruleLast ) )
            	    // InternalLTLFormula.g:173:5: (lv_formulas_2_0= ruleLast )
            	    {
            	    // InternalLTLFormula.g:173:5: (lv_formulas_2_0= ruleLast )
            	    // InternalLTLFormula.g:174:6: lv_formulas_2_0= ruleLast
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getFormulasLastParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_formulas_2_0=ruleLast();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						add(
            	      							current,
            	      							"formulas",
            	      							lv_formulas_2_0,
            	      							"de.cau.cs.kieler.verification.ltl.LTLFormula.Last");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // InternalLTLFormula.g:196:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalLTLFormula.g:196:43: (iv_ruleOr= ruleOr EOF )
            // InternalLTLFormula.g:197:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalLTLFormula.g:203:1: ruleOr returns [EObject current=null] : ( ( (lv_formulas_0_0= ruleAnd ) ) (otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_formulas_0_0 = null;

        EObject lv_formulas_2_0 = null;



        	enterRule();

        try {
            // InternalLTLFormula.g:209:2: ( ( ( (lv_formulas_0_0= ruleAnd ) ) (otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) ) )* ) )
            // InternalLTLFormula.g:210:2: ( ( (lv_formulas_0_0= ruleAnd ) ) (otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) ) )* )
            {
            // InternalLTLFormula.g:210:2: ( ( (lv_formulas_0_0= ruleAnd ) ) (otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) ) )* )
            // InternalLTLFormula.g:211:3: ( (lv_formulas_0_0= ruleAnd ) ) (otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) ) )*
            {
            // InternalLTLFormula.g:211:3: ( (lv_formulas_0_0= ruleAnd ) )
            // InternalLTLFormula.g:212:4: (lv_formulas_0_0= ruleAnd )
            {
            // InternalLTLFormula.g:212:4: (lv_formulas_0_0= ruleAnd )
            // InternalLTLFormula.g:213:5: lv_formulas_0_0= ruleAnd
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrAccess().getFormulasAndParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_formulas_0_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrRule());
              					}
              					add(
              						current,
              						"formulas",
              						lv_formulas_0_0,
              						"de.cau.cs.kieler.verification.ltl.LTLFormula.And");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLTLFormula.g:230:3: (otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLTLFormula.g:231:4: otherlv_1= '||' ( (lv_formulas_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_0());
            	      			
            	    }
            	    // InternalLTLFormula.g:235:4: ( (lv_formulas_2_0= ruleAnd ) )
            	    // InternalLTLFormula.g:236:5: (lv_formulas_2_0= ruleAnd )
            	    {
            	    // InternalLTLFormula.g:236:5: (lv_formulas_2_0= ruleAnd )
            	    // InternalLTLFormula.g:237:6: lv_formulas_2_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getFormulasAndParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_formulas_2_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						add(
            	      							current,
            	      							"formulas",
            	      							lv_formulas_2_0,
            	      							"de.cau.cs.kieler.verification.ltl.LTLFormula.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleLast"
    // InternalLTLFormula.g:259:1: entryRuleLast returns [EObject current=null] : iv_ruleLast= ruleLast EOF ;
    public final EObject entryRuleLast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLast = null;


        try {
            // InternalLTLFormula.g:259:45: (iv_ruleLast= ruleLast EOF )
            // InternalLTLFormula.g:260:2: iv_ruleLast= ruleLast EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLastRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLast=ruleLast();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLast; 
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
    // $ANTLR end "entryRuleLast"


    // $ANTLR start "ruleLast"
    // InternalLTLFormula.g:266:1: ruleLast returns [EObject current=null] : ( ( ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')' ) | ( ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')' ) | ( ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')' ) | ( ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')' ) | ( (lv_formulas_26_0= ruleVariable ) ) ) ;
    public final EObject ruleLast() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_operator_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_operator_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_operator_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_operator_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_formulas_2_0 = null;

        EObject lv_formulas_6_0 = null;

        EObject lv_formulas_10_0 = null;

        EObject lv_formulas_14_0 = null;

        EObject lv_formulas_17_0 = null;

        EObject lv_formulas_21_0 = null;

        EObject lv_formulas_24_0 = null;

        EObject lv_formulas_26_0 = null;



        	enterRule();

        try {
            // InternalLTLFormula.g:272:2: ( ( ( ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')' ) | ( ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')' ) | ( ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')' ) | ( ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')' ) | ( (lv_formulas_26_0= ruleVariable ) ) ) )
            // InternalLTLFormula.g:273:2: ( ( ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')' ) | ( ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')' ) | ( ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')' ) | ( ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')' ) | ( (lv_formulas_26_0= ruleVariable ) ) )
            {
            // InternalLTLFormula.g:273:2: ( ( ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')' ) | ( ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')' ) | ( ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')' ) | ( ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')' ) | (otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')' ) | ( (lv_formulas_26_0= ruleVariable ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case RULE_ID:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLTLFormula.g:274:3: ( ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')' )
                    {
                    // InternalLTLFormula.g:274:3: ( ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')' )
                    // InternalLTLFormula.g:275:4: ( (lv_operator_0_0= 'G' ) ) otherlv_1= '(' ( (lv_formulas_2_0= ruleLTLFormula ) ) otherlv_3= ')'
                    {
                    // InternalLTLFormula.g:275:4: ( (lv_operator_0_0= 'G' ) )
                    // InternalLTLFormula.g:276:5: (lv_operator_0_0= 'G' )
                    {
                    // InternalLTLFormula.g:276:5: (lv_operator_0_0= 'G' )
                    // InternalLTLFormula.g:277:6: lv_operator_0_0= 'G'
                    {
                    lv_operator_0_0=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_0_0, grammarAccess.getLastAccess().getOperatorGKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLastRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_0_0, "G");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getLastAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalLTLFormula.g:293:4: ( (lv_formulas_2_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:294:5: (lv_formulas_2_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:294:5: (lv_formulas_2_0= ruleLTLFormula )
                    // InternalLTLFormula.g:295:6: lv_formulas_2_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_2_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_2_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLastAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLTLFormula.g:318:3: ( ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')' )
                    {
                    // InternalLTLFormula.g:318:3: ( ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')' )
                    // InternalLTLFormula.g:319:4: ( (lv_operator_4_0= 'F' ) ) otherlv_5= '(' ( (lv_formulas_6_0= ruleLTLFormula ) ) otherlv_7= ')'
                    {
                    // InternalLTLFormula.g:319:4: ( (lv_operator_4_0= 'F' ) )
                    // InternalLTLFormula.g:320:5: (lv_operator_4_0= 'F' )
                    {
                    // InternalLTLFormula.g:320:5: (lv_operator_4_0= 'F' )
                    // InternalLTLFormula.g:321:6: lv_operator_4_0= 'F'
                    {
                    lv_operator_4_0=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_4_0, grammarAccess.getLastAccess().getOperatorFKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLastRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_4_0, "F");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLastAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalLTLFormula.g:337:4: ( (lv_formulas_6_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:338:5: (lv_formulas_6_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:338:5: (lv_formulas_6_0= ruleLTLFormula )
                    // InternalLTLFormula.g:339:6: lv_formulas_6_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_6_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_6_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLastAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLTLFormula.g:362:3: ( ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')' )
                    {
                    // InternalLTLFormula.g:362:3: ( ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')' )
                    // InternalLTLFormula.g:363:4: ( (lv_operator_8_0= 'X' ) ) otherlv_9= '(' ( (lv_formulas_10_0= ruleLTLFormula ) ) otherlv_11= ')'
                    {
                    // InternalLTLFormula.g:363:4: ( (lv_operator_8_0= 'X' ) )
                    // InternalLTLFormula.g:364:5: (lv_operator_8_0= 'X' )
                    {
                    // InternalLTLFormula.g:364:5: (lv_operator_8_0= 'X' )
                    // InternalLTLFormula.g:365:6: lv_operator_8_0= 'X'
                    {
                    lv_operator_8_0=(Token)match(input,18,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_8_0, grammarAccess.getLastAccess().getOperatorXKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLastRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_8_0, "X");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getLastAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalLTLFormula.g:381:4: ( (lv_formulas_10_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:382:5: (lv_formulas_10_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:382:5: (lv_formulas_10_0= ruleLTLFormula )
                    // InternalLTLFormula.g:383:6: lv_formulas_10_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_10_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_10_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getLastAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLTLFormula.g:406:3: ( ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')' )
                    {
                    // InternalLTLFormula.g:406:3: ( ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')' )
                    // InternalLTLFormula.g:407:4: ( (lv_operator_12_0= '!' ) ) otherlv_13= '(' ( (lv_formulas_14_0= ruleLTLFormula ) ) otherlv_15= ')'
                    {
                    // InternalLTLFormula.g:407:4: ( (lv_operator_12_0= '!' ) )
                    // InternalLTLFormula.g:408:5: (lv_operator_12_0= '!' )
                    {
                    // InternalLTLFormula.g:408:5: (lv_operator_12_0= '!' )
                    // InternalLTLFormula.g:409:6: lv_operator_12_0= '!'
                    {
                    lv_operator_12_0=(Token)match(input,19,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_12_0, grammarAccess.getLastAccess().getOperatorExclamationMarkKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLastRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_12_0, "!");
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getLastAccess().getLeftParenthesisKeyword_3_1());
                      			
                    }
                    // InternalLTLFormula.g:425:4: ( (lv_formulas_14_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:426:5: (lv_formulas_14_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:426:5: (lv_formulas_14_0= ruleLTLFormula )
                    // InternalLTLFormula.g:427:6: lv_formulas_14_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_14_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_14_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getLastAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLTLFormula.g:450:3: (otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')' )
                    {
                    // InternalLTLFormula.g:450:3: (otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')' )
                    // InternalLTLFormula.g:451:4: otherlv_16= '(' ( (lv_formulas_17_0= ruleLTLFormula ) ) otherlv_18= ')' ( (lv_operator_19_0= 'U' ) ) otherlv_20= '(' ( (lv_formulas_21_0= ruleLTLFormula ) ) otherlv_22= ')' otherlv_23= '(' ( (lv_formulas_24_0= ruleLTLFormula ) ) otherlv_25= ')'
                    {
                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalLTLFormula.g:455:4: ( (lv_formulas_17_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:456:5: (lv_formulas_17_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:456:5: (lv_formulas_17_0= ruleLTLFormula )
                    // InternalLTLFormula.g:457:6: lv_formulas_17_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_17_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_17_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getLastAccess().getRightParenthesisKeyword_4_2());
                      			
                    }
                    // InternalLTLFormula.g:478:4: ( (lv_operator_19_0= 'U' ) )
                    // InternalLTLFormula.g:479:5: (lv_operator_19_0= 'U' )
                    {
                    // InternalLTLFormula.g:479:5: (lv_operator_19_0= 'U' )
                    // InternalLTLFormula.g:480:6: lv_operator_19_0= 'U'
                    {
                    lv_operator_19_0=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_19_0, grammarAccess.getLastAccess().getOperatorUKeyword_4_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLastRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_19_0, "U");
                      					
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_4());
                      			
                    }
                    // InternalLTLFormula.g:496:4: ( (lv_formulas_21_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:497:5: (lv_formulas_21_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:497:5: (lv_formulas_21_0= ruleLTLFormula )
                    // InternalLTLFormula.g:498:6: lv_formulas_21_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_5_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_21_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_21_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getLastAccess().getRightParenthesisKeyword_4_6());
                      			
                    }
                    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getLastAccess().getLeftParenthesisKeyword_4_7());
                      			
                    }
                    // InternalLTLFormula.g:523:4: ( (lv_formulas_24_0= ruleLTLFormula ) )
                    // InternalLTLFormula.g:524:5: (lv_formulas_24_0= ruleLTLFormula )
                    {
                    // InternalLTLFormula.g:524:5: (lv_formulas_24_0= ruleLTLFormula )
                    // InternalLTLFormula.g:525:6: lv_formulas_24_0= ruleLTLFormula
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLastAccess().getFormulasLTLFormulaParserRuleCall_4_8_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_8);
                    lv_formulas_24_0=ruleLTLFormula();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLastRule());
                      						}
                      						add(
                      							current,
                      							"formulas",
                      							lv_formulas_24_0,
                      							"de.cau.cs.kieler.verification.ltl.LTLFormula.LTLFormula");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getLastAccess().getRightParenthesisKeyword_4_9());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLTLFormula.g:548:3: ( (lv_formulas_26_0= ruleVariable ) )
                    {
                    // InternalLTLFormula.g:548:3: ( (lv_formulas_26_0= ruleVariable ) )
                    // InternalLTLFormula.g:549:4: (lv_formulas_26_0= ruleVariable )
                    {
                    // InternalLTLFormula.g:549:4: (lv_formulas_26_0= ruleVariable )
                    // InternalLTLFormula.g:550:5: lv_formulas_26_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLastAccess().getFormulasVariableParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_formulas_26_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLastRule());
                      					}
                      					add(
                      						current,
                      						"formulas",
                      						lv_formulas_26_0,
                      						"de.cau.cs.kieler.verification.ltl.LTLFormula.Variable");
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
    // $ANTLR end "ruleLast"


    // $ANTLR start "entryRuleVariable"
    // InternalLTLFormula.g:571:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalLTLFormula.g:571:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalLTLFormula.g:572:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalLTLFormula.g:578:1: ruleVariable returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) ) ) | ( ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_operator_1_0=null;
        Token lv_value_2_0=null;
        Token lv_name_3_0=null;
        Token lv_operator_4_0=null;
        Token lv_value_5_0=null;
        Token lv_name_6_0=null;
        Token lv_operator_7_0=null;
        Token lv_value_8_0=null;
        Token lv_name_9_0=null;
        Token lv_operator_10_0=null;
        Token lv_value_11_0=null;
        Token lv_name_12_0=null;
        Token lv_operator_13_0=null;
        Token lv_value_14_0=null;
        Token lv_name_15_0=null;
        Token lv_operator_16_0=null;
        Token lv_value_17_0=null;


        	enterRule();

        try {
            // InternalLTLFormula.g:584:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) ) ) | ( ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) ) ) ) )
            // InternalLTLFormula.g:585:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) ) ) | ( ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) ) ) )
            {
            // InternalLTLFormula.g:585:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) ) ) | ( ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) ) ) | ( ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) ) ) | ( ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) ) ) | ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) ) ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt5=3;
                    }
                    break;
                case 26:
                    {
                    alt5=6;
                    }
                    break;
                case 22:
                    {
                    alt5=2;
                    }
                    break;
                case 21:
                    {
                    alt5=1;
                    }
                    break;
                case 25:
                    {
                    alt5=5;
                    }
                    break;
                case 24:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLTLFormula.g:586:3: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) ) )
                    {
                    // InternalLTLFormula.g:586:3: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) ) )
                    // InternalLTLFormula.g:587:4: ( (lv_name_0_0= RULE_ID ) ) ( (lv_operator_1_0= '==' ) ) ( (lv_value_2_0= RULE_ID ) )
                    {
                    // InternalLTLFormula.g:587:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalLTLFormula.g:588:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:588:5: (lv_name_0_0= RULE_ID )
                    // InternalLTLFormula.g:589:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:605:4: ( (lv_operator_1_0= '==' ) )
                    // InternalLTLFormula.g:606:5: (lv_operator_1_0= '==' )
                    {
                    // InternalLTLFormula.g:606:5: (lv_operator_1_0= '==' )
                    // InternalLTLFormula.g:607:6: lv_operator_1_0= '=='
                    {
                    lv_operator_1_0=(Token)match(input,21,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_1_0, grammarAccess.getVariableAccess().getOperatorEqualsSignEqualsSignKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_1_0, "==");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:619:4: ( (lv_value_2_0= RULE_ID ) )
                    // InternalLTLFormula.g:620:5: (lv_value_2_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:620:5: (lv_value_2_0= RULE_ID )
                    // InternalLTLFormula.g:621:6: lv_value_2_0= RULE_ID
                    {
                    lv_value_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_2_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLTLFormula.g:639:3: ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) ) )
                    {
                    // InternalLTLFormula.g:639:3: ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) ) )
                    // InternalLTLFormula.g:640:4: ( (lv_name_3_0= RULE_ID ) ) ( (lv_operator_4_0= '!=' ) ) ( (lv_value_5_0= RULE_ID ) )
                    {
                    // InternalLTLFormula.g:640:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalLTLFormula.g:641:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:641:5: (lv_name_3_0= RULE_ID )
                    // InternalLTLFormula.g:642:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_3_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:658:4: ( (lv_operator_4_0= '!=' ) )
                    // InternalLTLFormula.g:659:5: (lv_operator_4_0= '!=' )
                    {
                    // InternalLTLFormula.g:659:5: (lv_operator_4_0= '!=' )
                    // InternalLTLFormula.g:660:6: lv_operator_4_0= '!='
                    {
                    lv_operator_4_0=(Token)match(input,22,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_4_0, grammarAccess.getVariableAccess().getOperatorExclamationMarkEqualsSignKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_4_0, "!=");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:672:4: ( (lv_value_5_0= RULE_ID ) )
                    // InternalLTLFormula.g:673:5: (lv_value_5_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:673:5: (lv_value_5_0= RULE_ID )
                    // InternalLTLFormula.g:674:6: lv_value_5_0= RULE_ID
                    {
                    lv_value_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_5_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLTLFormula.g:692:3: ( ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) ) )
                    {
                    // InternalLTLFormula.g:692:3: ( ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) ) )
                    // InternalLTLFormula.g:693:4: ( (lv_name_6_0= RULE_ID ) ) ( (lv_operator_7_0= '>=' ) ) ( (lv_value_8_0= RULE_ID ) )
                    {
                    // InternalLTLFormula.g:693:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalLTLFormula.g:694:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:694:5: (lv_name_6_0= RULE_ID )
                    // InternalLTLFormula.g:695:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_6_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:711:4: ( (lv_operator_7_0= '>=' ) )
                    // InternalLTLFormula.g:712:5: (lv_operator_7_0= '>=' )
                    {
                    // InternalLTLFormula.g:712:5: (lv_operator_7_0= '>=' )
                    // InternalLTLFormula.g:713:6: lv_operator_7_0= '>='
                    {
                    lv_operator_7_0=(Token)match(input,23,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_7_0, grammarAccess.getVariableAccess().getOperatorGreaterThanSignEqualsSignKeyword_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_7_0, ">=");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:725:4: ( (lv_value_8_0= RULE_ID ) )
                    // InternalLTLFormula.g:726:5: (lv_value_8_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:726:5: (lv_value_8_0= RULE_ID )
                    // InternalLTLFormula.g:727:6: lv_value_8_0= RULE_ID
                    {
                    lv_value_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_8_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLTLFormula.g:745:3: ( ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) ) )
                    {
                    // InternalLTLFormula.g:745:3: ( ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) ) )
                    // InternalLTLFormula.g:746:4: ( (lv_name_9_0= RULE_ID ) ) ( (lv_operator_10_0= '<=' ) ) ( (lv_value_11_0= RULE_ID ) )
                    {
                    // InternalLTLFormula.g:746:4: ( (lv_name_9_0= RULE_ID ) )
                    // InternalLTLFormula.g:747:5: (lv_name_9_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:747:5: (lv_name_9_0= RULE_ID )
                    // InternalLTLFormula.g:748:6: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_9_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_9_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:764:4: ( (lv_operator_10_0= '<=' ) )
                    // InternalLTLFormula.g:765:5: (lv_operator_10_0= '<=' )
                    {
                    // InternalLTLFormula.g:765:5: (lv_operator_10_0= '<=' )
                    // InternalLTLFormula.g:766:6: lv_operator_10_0= '<='
                    {
                    lv_operator_10_0=(Token)match(input,24,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_10_0, grammarAccess.getVariableAccess().getOperatorLessThanSignEqualsSignKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_10_0, "<=");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:778:4: ( (lv_value_11_0= RULE_ID ) )
                    // InternalLTLFormula.g:779:5: (lv_value_11_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:779:5: (lv_value_11_0= RULE_ID )
                    // InternalLTLFormula.g:780:6: lv_value_11_0= RULE_ID
                    {
                    lv_value_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_11_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_3_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_11_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLTLFormula.g:798:3: ( ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) ) )
                    {
                    // InternalLTLFormula.g:798:3: ( ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) ) )
                    // InternalLTLFormula.g:799:4: ( (lv_name_12_0= RULE_ID ) ) ( (lv_operator_13_0= '>' ) ) ( (lv_value_14_0= RULE_ID ) )
                    {
                    // InternalLTLFormula.g:799:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalLTLFormula.g:800:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:800:5: (lv_name_12_0= RULE_ID )
                    // InternalLTLFormula.g:801:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_12_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_12_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:817:4: ( (lv_operator_13_0= '>' ) )
                    // InternalLTLFormula.g:818:5: (lv_operator_13_0= '>' )
                    {
                    // InternalLTLFormula.g:818:5: (lv_operator_13_0= '>' )
                    // InternalLTLFormula.g:819:6: lv_operator_13_0= '>'
                    {
                    lv_operator_13_0=(Token)match(input,25,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_13_0, grammarAccess.getVariableAccess().getOperatorGreaterThanSignKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_13_0, ">");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:831:4: ( (lv_value_14_0= RULE_ID ) )
                    // InternalLTLFormula.g:832:5: (lv_value_14_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:832:5: (lv_value_14_0= RULE_ID )
                    // InternalLTLFormula.g:833:6: lv_value_14_0= RULE_ID
                    {
                    lv_value_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_14_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_4_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_14_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLTLFormula.g:851:3: ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) ) )
                    {
                    // InternalLTLFormula.g:851:3: ( ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) ) )
                    // InternalLTLFormula.g:852:4: ( (lv_name_15_0= RULE_ID ) ) ( (lv_operator_16_0= '<' ) ) ( (lv_value_17_0= RULE_ID ) )
                    {
                    // InternalLTLFormula.g:852:4: ( (lv_name_15_0= RULE_ID ) )
                    // InternalLTLFormula.g:853:5: (lv_name_15_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:853:5: (lv_name_15_0= RULE_ID )
                    // InternalLTLFormula.g:854:6: lv_name_15_0= RULE_ID
                    {
                    lv_name_15_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_15_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_5_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_15_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:870:4: ( (lv_operator_16_0= '<' ) )
                    // InternalLTLFormula.g:871:5: (lv_operator_16_0= '<' )
                    {
                    // InternalLTLFormula.g:871:5: (lv_operator_16_0= '<' )
                    // InternalLTLFormula.g:872:6: lv_operator_16_0= '<'
                    {
                    lv_operator_16_0=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_operator_16_0, grammarAccess.getVariableAccess().getOperatorLessThanSignKeyword_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(current, "operator", lv_operator_16_0, "<");
                      					
                    }

                    }


                    }

                    // InternalLTLFormula.g:884:4: ( (lv_value_17_0= RULE_ID ) )
                    // InternalLTLFormula.g:885:5: (lv_value_17_0= RULE_ID )
                    {
                    // InternalLTLFormula.g:885:5: (lv_value_17_0= RULE_ID )
                    // InternalLTLFormula.g:886:6: lv_value_17_0= RULE_ID
                    {
                    lv_value_17_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_17_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_5_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_17_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

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
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000EC010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    }


}