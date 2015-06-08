package de.cau.cs.kieler.core.kexpressions.parser.antlr.internal; 

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
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_STRING", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'['", "']'", "'<'", "','", "'()'", "'>'", "'&'", "'@'", "'.'", "'-'", "'=='", "'<='", "'>='", "'!='", "'pre'", "'|'", "'!'", "'+'", "'*'", "'%'", "'/'", "'val'", "'||'", "'&&'", "'++'", "'--'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=12;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=5;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalKExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g"; }



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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:74:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:75:2: (iv_ruleRoot= ruleRoot EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:76:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot81);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot91); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:83:1: ruleRoot returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:86:28: (this_Expression_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:88:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRootAccess().getExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleRoot140);
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:107:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:108:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:109:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression174);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression184); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:116:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:119:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:120:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:120:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:121:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression234);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:134:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression264);
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:153:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:154:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:155:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression299);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression309); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:162:1: ruleBoolExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:165:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:167:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression358);
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:186:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:187:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:188:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression392);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression402); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:195:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:198:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:199:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:199:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:200:2: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression452);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:211:1: ( () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:211:2: () ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:211:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:212:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:220:2: ( ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==40) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:220:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) ) ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:220:3: ( (lv_operator_2_0= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:221:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:221:1: (lv_operator_2_0= ruleLogicalOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:222:3: lv_operator_2_0= ruleLogicalOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression486);
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
                    	              		"LogicalOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:238:2: ( (lv_subExpressions_3_0= ruleLogicalAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:239:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:239:1: (lv_subExpressions_3_0= ruleLogicalAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:240:3: lv_subExpressions_3_0= ruleLogicalAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getSubExpressionsLogicalAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression507);
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
                    	              		"LogicalAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:264:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:265:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:266:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression547);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression557); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:273:1: ruleLogicalAndExpression returns [EObject current=null] : (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseOrExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:276:28: ( (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:277:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:277:1: (this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:278:2: this_BitwiseOrExpression_0= ruleBitwiseOrExpression ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getBitwiseOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression607);
            this_BitwiseOrExpression_0=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:289:1: ( () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:289:2: () ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:289:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:290:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:298:2: ( ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==41) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:298:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:298:3: ( (lv_operator_2_0= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:299:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:299:1: (lv_operator_2_0= ruleLogicalAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:300:3: lv_operator_2_0= ruleLogicalAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression641);
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
                    	              		"LogicalAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:316:2: ( (lv_subExpressions_3_0= ruleBitwiseOrExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:317:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:317:1: (lv_subExpressions_3_0= ruleBitwiseOrExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:318:3: lv_subExpressions_3_0= ruleBitwiseOrExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getSubExpressionsBitwiseOrExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression662);
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
                    	              		"BitwiseOrExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:342:1: entryRuleBitwiseOrExpression returns [EObject current=null] : iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF ;
    public final EObject entryRuleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:343:2: (iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:344:2: iv_ruleBitwiseOrExpression= ruleBitwiseOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression702);
            iv_ruleBitwiseOrExpression=ruleBitwiseOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseOrExpression712); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:351:1: ruleBitwiseOrExpression returns [EObject current=null] : (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) ;
    public final EObject ruleBitwiseOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BitwiseAndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:354:28: ( (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:355:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:355:1: (this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:356:2: this_BitwiseAndExpression_0= ruleBitwiseAndExpression ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getBitwiseAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression762);
            this_BitwiseAndExpression_0=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BitwiseAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:367:1: ( () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:367:2: () ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:367:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:368:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:376:2: ( ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==33) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:376:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) ) ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:376:3: ( (lv_operator_2_0= ruleBitwiseOrOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:377:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:377:1: (lv_operator_2_0= ruleBitwiseOrOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:378:3: lv_operator_2_0= ruleBitwiseOrOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getOperatorBitwiseOrOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression796);
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
                    	              		"BitwiseOrOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:394:2: ( (lv_subExpressions_3_0= ruleBitwiseAndExpression ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:395:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:395:1: (lv_subExpressions_3_0= ruleBitwiseAndExpression )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:396:3: lv_subExpressions_3_0= ruleBitwiseAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseOrExpressionAccess().getSubExpressionsBitwiseAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression817);
                    	    lv_subExpressions_3_0=ruleBitwiseAndExpression();

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
                    	              		"BitwiseAndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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


    // $ANTLR start "entryRuleBitwiseAndExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:420:1: entryRuleBitwiseAndExpression returns [EObject current=null] : iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF ;
    public final EObject entryRuleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:421:2: (iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:422:2: iv_ruleBitwiseAndExpression= ruleBitwiseAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBitwiseAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression857);
            iv_ruleBitwiseAndExpression=ruleBitwiseAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBitwiseAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBitwiseAndExpression867); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:429:1: ruleBitwiseAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) ;
    public final EObject ruleBitwiseAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:432:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:433:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:433:1: (this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:434:2: this_CompareOperation_0= ruleCompareOperation ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression917);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:445:1: ( () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:445:2: () ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:445:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:446:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:454:2: ( ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==24) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:454:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:454:3: ( (lv_operator_2_0= ruleBitwiseAndOperator ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:455:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:455:1: (lv_operator_2_0= ruleBitwiseAndOperator )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:456:3: lv_operator_2_0= ruleBitwiseAndOperator
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getOperatorBitwiseAndOperatorEnumRuleCall_1_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression951);
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
                    	              		"BitwiseAndOperator");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:472:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:473:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:473:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:474:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBitwiseAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression972);
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
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:498:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:499:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:500:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1012);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation1022); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:507:1: ruleCompareOperation returns [EObject current=null] : (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:510:28: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:511:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:511:1: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:512:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1072);
            this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NotOrValuedExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:523:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20||LA10_0==23||(LA10_0>=28 && LA10_0<=31)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:523:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:523:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:524:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:532:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:533:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:533:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:534:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation1105);
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
                              		"CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:550:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:551:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:551:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:552:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1126);
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
                              		"NotOrValuedExpression");
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:576:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:577:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:578:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1164);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression1174); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:585:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:588:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:589:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:589:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:590:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression1224);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:603:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1254);
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


    // $ANTLR start "entryRuleNotExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:622:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:623:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:624:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression1289);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression1299); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:631:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:634:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:635:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:635:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_HOSTCODE)||LA12_0==RULE_BOOLEAN||LA12_0==16||LA12_0==20||LA12_0==32||LA12_0==39) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:635:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:635:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:635:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:635:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:636:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:644:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:645:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:645:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:646:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression1358);
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
                              		"NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:662:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:663:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:663:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:664:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression1379);
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
                              		"NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:682:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression1411);
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleValuedExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:701:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:702:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:703:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1446);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression1456); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:710:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:713:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:715:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression1505);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExpression_0; 
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


    // $ANTLR start "entryRuleAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:734:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:735:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:736:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression1539);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression1549); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:743:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:746:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:747:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:747:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:748:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression1599);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:759:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:759:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:759:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:760:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:768:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:769:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:769:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:770:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression1632);
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
            	              		"AddOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:786:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:787:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:787:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:788:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression1653);
            	    lv_subExpressions_3_0=ruleSubExpression();

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
            	              		"SubExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:812:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:813:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:814:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression1691);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression1701); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:821:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:824:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:825:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:825:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:826:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression1751);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:837:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:837:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:837:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:838:2: 
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

            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:846:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:847:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:847:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:848:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression1784);
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
            	              		"SubOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:864:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:865:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:865:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:866:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression1805);
            	    lv_subExpressions_3_0=ruleMultExpression();

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
            	              		"MultExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleSubExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:890:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:891:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:892:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression1843);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression1853); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:899:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:902:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:903:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:903:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:904:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression1903);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:915:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:915:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:915:2: ()
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:916:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:924:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:925:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:925:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:926:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression1936);
            	    lv_operator_2_0=ruleMultOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MultOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:942:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:943:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:943:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:944:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression1957);
            	    lv_subExpressions_3_0=ruleDivExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"DivExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:968:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:969:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:970:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression1995);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression2005); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivExpression"


    // $ANTLR start "ruleDivExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:977:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:980:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:981:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:981:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:982:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2055);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:993:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:993:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:993:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:994:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1002:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1003:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1003:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1004:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression2088);
                    lv_operator_2_0=ruleDivOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1020:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1021:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1021:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1022:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression2109);
                    lv_subExpressions_3_0=ruleModExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDivExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"ModExpression");
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1046:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1047:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1048:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression2147);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression2157); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModExpression"


    // $ANTLR start "ruleModExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1055:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1058:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1059:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1059:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1060:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression2207);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1071:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1071:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1071:2: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1072:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1080:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1081:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1081:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1082:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression2240);
                    lv_operator_2_0=ruleModOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1098:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1099:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1099:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1100:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2261);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_3_0, 
                              		"AtomicValuedExpression");
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1124:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1125:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1126:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression2299);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression2309); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1133:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_PostfixAddExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1136:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1137:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1137:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_PostfixAddExpression_3= rulePostfixAddExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==16||LA18_0==20||LA18_0==32||LA18_0==39||(LA18_0>=42 && LA18_0<=43)) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1137:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1137:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1137:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1137:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1138:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1146:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1147:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1147:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1148:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression2368);
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
                              		"SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1164:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1165:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1165:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1166:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression2389);
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
                              		"NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1184:2: this_PostfixAddExpression_3= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getPostfixAddExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_ruleNegExpression2421);
                    this_PostfixAddExpression_3=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixAddExpression_3; 
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


    // $ANTLR start "entryRulePostfixAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1203:1: entryRulePostfixAddExpression returns [EObject current=null] : iv_rulePostfixAddExpression= rulePostfixAddExpression EOF ;
    public final EObject entryRulePostfixAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1204:2: (iv_rulePostfixAddExpression= rulePostfixAddExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1205:2: iv_rulePostfixAddExpression= rulePostfixAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_entryRulePostfixAddExpression2456);
            iv_rulePostfixAddExpression=rulePostfixAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePostfixAddExpression2466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixAddExpression"


    // $ANTLR start "rulePostfixAddExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1212:1: rulePostfixAddExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression ) ;
    public final EObject rulePostfixAddExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_PostfixSubExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1215:28: ( ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1216:1: ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1216:1: ( ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) ) | this_PostfixSubExpression_3= rulePostfixSubExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==16||LA19_0==20||LA19_0==32||LA19_0==39||LA19_0==43) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1216:2: ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1216:2: ( () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1216:3: () ( (lv_operator_1_0= rulePostfixAdd ) ) ( (lv_subExpressions_2_0= rulePostfixAddExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1216:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1217:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixAddExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1225:2: ( (lv_operator_1_0= rulePostfixAdd ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1226:1: (lv_operator_1_0= rulePostfixAdd )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1226:1: (lv_operator_1_0= rulePostfixAdd )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1227:3: lv_operator_1_0= rulePostfixAdd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getOperatorPostfixAddEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAdd_in_rulePostfixAddExpression2525);
                    lv_operator_1_0=rulePostfixAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixAddExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"PostfixAdd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1243:2: ( (lv_subExpressions_2_0= rulePostfixAddExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1244:1: (lv_subExpressions_2_0= rulePostfixAddExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1244:1: (lv_subExpressions_2_0= rulePostfixAddExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1245:3: lv_subExpressions_2_0= rulePostfixAddExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getSubExpressionsPostfixAddExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixAddExpression_in_rulePostfixAddExpression2546);
                    lv_subExpressions_2_0=rulePostfixAddExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixAddExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"PostfixAddExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1263:2: this_PostfixSubExpression_3= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixAddExpressionAccess().getPostfixSubExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_rulePostfixAddExpression2578);
                    this_PostfixSubExpression_3=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixSubExpression_3; 
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
    // $ANTLR end "rulePostfixAddExpression"


    // $ANTLR start "entryRulePostfixSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1282:1: entryRulePostfixSubExpression returns [EObject current=null] : iv_rulePostfixSubExpression= rulePostfixSubExpression EOF ;
    public final EObject entryRulePostfixSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1283:2: (iv_rulePostfixSubExpression= rulePostfixSubExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1284:2: iv_rulePostfixSubExpression= rulePostfixSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_entryRulePostfixSubExpression2613);
            iv_rulePostfixSubExpression=rulePostfixSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePostfixSubExpression2623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixSubExpression"


    // $ANTLR start "rulePostfixSubExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1291:1: rulePostfixSubExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject rulePostfixSubExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1294:28: ( ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1295:1: ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1295:1: ( ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==16||LA20_0==20||LA20_0==32||LA20_0==39) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1295:2: ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1295:2: ( () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1295:3: () ( (lv_operator_1_0= rulePostfixSub ) ) ( (lv_subExpressions_2_0= rulePostfixSubExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1295:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1296:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixSubExpressionAccess().getOperatorExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1304:2: ( (lv_operator_1_0= rulePostfixSub ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1305:1: (lv_operator_1_0= rulePostfixSub )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1305:1: (lv_operator_1_0= rulePostfixSub )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1306:3: lv_operator_1_0= rulePostfixSub
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getOperatorPostfixSubEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSub_in_rulePostfixSubExpression2682);
                    lv_operator_1_0=rulePostfixSub();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixSubExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"PostfixSub");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1322:2: ( (lv_subExpressions_2_0= rulePostfixSubExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1323:1: (lv_subExpressions_2_0= rulePostfixSubExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1323:1: (lv_subExpressions_2_0= rulePostfixSubExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1324:3: lv_subExpressions_2_0= rulePostfixSubExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getSubExpressionsPostfixSubExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePostfixSubExpression_in_rulePostfixSubExpression2703);
                    lv_subExpressions_2_0=rulePostfixSubExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixSubExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"subExpressions",
                              		lv_subExpressions_2_0, 
                              		"PostfixSubExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1342:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixSubExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_rulePostfixSubExpression2735);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
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
    // $ANTLR end "rulePostfixSubExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1361:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1362:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1363:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2770);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression2780); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1370:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_FunctionCall_5 = null;

        EObject this_TextExpression_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1373:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1374:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1374:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_FunctionCall_5= ruleFunctionCall | this_TextExpression_6= ruleTextExpression )
            int alt21=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
            case 32:
            case 39:
                {
                alt21=2;
                }
                break;
            case 16:
                {
                alt21=3;
                }
                break;
            case 20:
                {
                alt21=4;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1375:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression2830);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1388:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2860);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1400:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1400:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1400:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicExpression2878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression2903);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicExpression2914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1422:2: this_FunctionCall_5= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_ruleAtomicExpression2946);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1435:2: this_TextExpression_6= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression2976);
                    this_TextExpression_6=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_6; 
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1454:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1455:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1456:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3011);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression3021); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1463:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1466:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1467:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1467:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1468:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3071);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1481:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3101);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1494:2: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getStringValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3131);
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
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicValuedExpression3149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3174);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAtomicValuedExpression3185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1528:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3217);
                    this_AtomicExpression_6=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_6; 
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1547:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1548:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1549:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3252);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3262); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1556:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_operator_1_1 = null;

        Enumerator lv_operator_1_2 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_ValuedObjectReference_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1559:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1560:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1560:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32||LA24_0==39) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1560:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1560:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1560:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1560:3: ()
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1561:2: 
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

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1569:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1570:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1570:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1571:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1571:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==39) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1572:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3323);
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
                                      		"PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1587:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3342);
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
                                      		"ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleValuedObjectTestExpression3357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1609:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1610:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1610:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1611:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3378);
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
                              		"ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleValuedObjectTestExpression3390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1633:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3422);
                    this_ValuedObjectReference_5=ruleValuedObjectReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_5; 
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


    // $ANTLR start "entryRuleValuedObjectReference"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1652:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1653:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1654:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3457);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference3467); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1661:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1664:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1665:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1665:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1665:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1665:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1666:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1666:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1667:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference3516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1681:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1681:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleValuedObjectReference3529); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1685:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1686:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1686:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1687:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference3550);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleValuedObjectReference3562); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleFunctionCall"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1715:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1716:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1717:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall3600);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionCall3610); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1724:1: ruleFunctionCall returns [EObject current=null] : (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_functionName_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1727:28: ( (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1728:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1728:1: (otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1728:3: otherlv_0= '<' ( (lv_functionName_1_0= ruleExtendedID ) ) ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )? otherlv_8= '>'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionCall3647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getLessThanSignKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1732:1: ( (lv_functionName_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1733:1: (lv_functionName_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1733:1: (lv_functionName_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1734:3: lv_functionName_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getFunctionNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleFunctionCall3668);
            lv_functionName_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"functionName",
                      		lv_functionName_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1750:2: ( (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) | otherlv_7= '()' )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            else if ( (LA27_0==22) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1750:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1750:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1750:5: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionCall3682); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1754:1: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1755:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1755:1: (lv_parameters_3_0= ruleParameter )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1756:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall3703);
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
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1772:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1772:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFunctionCall3716); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_0_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1776:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1777:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1777:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1778:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersParameterParserRuleCall_2_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleFunctionCall3737);
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
                    	              		"Parameter");
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

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFunctionCall3751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_2_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1799:7: otherlv_7= '()'
                    {
                    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionCall3770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionCallAccess().getLeftParenthesisRightParenthesisKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFunctionCall3784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionCallAccess().getGreaterThanSignKeyword_3());
                  
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1815:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1816:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1817:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter3820);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter3830); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1824:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_callByReference_0_0=null;
        Token lv_pureOutput_1_0=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1827:28: ( ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1828:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1828:1: ( ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1828:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )? ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1828:2: ( ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1828:3: ( (lv_callByReference_0_0= '&' ) ) ( (lv_pureOutput_1_0= '&' ) )?
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1828:3: ( (lv_callByReference_0_0= '&' ) )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1829:1: (lv_callByReference_0_0= '&' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1829:1: (lv_callByReference_0_0= '&' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1830:3: lv_callByReference_0_0= '&'
                    {
                    lv_callByReference_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter3874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_callByReference_0_0, grammarAccess.getParameterAccess().getCallByReferenceAmpersandKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterRule());
                      	        }
                             		setWithLastConsumed(current, "callByReference", true, "&");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1843:2: ( (lv_pureOutput_1_0= '&' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==24) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1844:1: (lv_pureOutput_1_0= '&' )
                            {
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1844:1: (lv_pureOutput_1_0= '&' )
                            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1845:3: lv_pureOutput_1_0= '&'
                            {
                            lv_pureOutput_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameter3905); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_pureOutput_1_0, grammarAccess.getParameterAccess().getPureOutputAmpersandKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getParameterRule());
                              	        }
                                     		setWithLastConsumed(current, "pureOutput", true, "&");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1858:5: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1859:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1859:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1860:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleParameter3942);
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
                      		"Expression");
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1884:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1885:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1886:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression3978);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression3988); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1893:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1896:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1897:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1897:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1898:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1898:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1899:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextExpressionAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"HOSTCODE");
              	    
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1923:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1924:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1925:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue4069);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue4079); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1932:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1935:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1936:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1936:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1937:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1937:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1938:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue4120); if (state.failed) return current;
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
                      		"INT");
              	    
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1962:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1963:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1964:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue4160);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue4170); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1971:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1974:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1975:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1975:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1976:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1976:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1977:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue4211); if (state.failed) return current;
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
                      		"FLOAT");
              	    
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2001:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2002:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2003:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue4251);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue4261); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2010:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2013:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2014:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2014:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2015:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2015:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2016:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue4302); if (state.failed) return current;
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
                      		"BOOLEAN");
              	    
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2040:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2041:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2042:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringValue_in_entryRuleStringValue4342);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringValue4352); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2049:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2052:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2053:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2053:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2054:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2054:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2055:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringValue4393); if (state.failed) return current;
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
                      		"STRING");
              	    
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2085:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2086:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2087:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation4439);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation4449); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2094:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_values_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2097:28: ( ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2098:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2098:1: ( (lv_values_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2099:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2099:1: (lv_values_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2100:3: lv_values_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_values_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation4490); if (state.failed) return current;
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
                      		"COMMENT_ANNOTATION");
              	    
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2124:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2125:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2126:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation4530);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation4540); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2133:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2136:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2137:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2137:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2137:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTagAnnotation4577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2141:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2142:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2142:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2143:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation4598);
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
                      		"ExtendedID");
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


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2167:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2168:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2169:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation4634);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation4644); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2176:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2179:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2180:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2180:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+ )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2180:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_values_2_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyStringValueAnnotation4681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2184:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2185:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2185:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2186:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation4702);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2202:2: ( (lv_values_2_0= ruleEString ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2203:1: (lv_values_2_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2203:1: (lv_values_2_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2204:3: lv_values_2_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation4723);
            	    lv_values_2_0=ruleEString();

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
            	              		"EString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2228:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2229:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2230:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation4760);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation4770); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2237:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2240:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2241:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2241:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+ )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2241:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_values_5_0= ruleEString ) )+
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTypedKeyStringValueAnnotation4807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2245:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2246:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2246:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2247:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4828);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypedKeyStringValueAnnotation4840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2267:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2268:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2268:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2269:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4861);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedKeyStringValueAnnotation4873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2289:1: ( (lv_values_5_0= ruleEString ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2290:1: (lv_values_5_0= ruleEString )
            	    {
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2290:1: (lv_values_5_0= ruleEString )
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2291:3: lv_values_5_0= ruleEString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValuesEStringParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation4894);
            	    lv_values_5_0=ruleEString();

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
            	              		"EString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2315:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2316:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2317:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation4931);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation4941); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2324:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2327:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2328:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2328:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2328:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyBooleanValueAnnotation4978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2332:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2333:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2333:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2334:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation4999);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2350:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2351:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2351:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2352:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyBooleanValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"BOOLEAN");
              	    
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
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2376:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2377:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2378:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5057);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5067); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2385:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2388:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2389:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2389:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2389:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleInteger ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyIntValueAnnotation5104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2393:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2394:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2394:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2395:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5125);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2411:2: ( (lv_value_2_0= ruleInteger ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2412:1: (lv_value_2_0= ruleInteger )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2412:1: (lv_value_2_0= ruleInteger )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2413:3: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getValueIntegerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation5146);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Integer");
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2437:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2438:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2439:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation5182);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation5192); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2446:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2449:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2450:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2450:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2450:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleFloateger ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleKeyFloatValueAnnotation5229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2454:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2455:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2455:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2456:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation5250);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2472:2: ( (lv_value_2_0= ruleFloateger ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2473:1: (lv_value_2_0= ruleFloateger )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2473:1: (lv_value_2_0= ruleFloateger )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2474:3: lv_value_2_0= ruleFloateger
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFloategerParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation5271);
            lv_value_2_0=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Floateger");
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2500:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2501:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2502:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString5310);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2509:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2512:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2513:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2513:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2513:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2521:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2536:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2537:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2538:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID5433);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID5444); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2545:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2548:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2549:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2549:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2549:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID5484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2556:1: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2557:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExtendedID5503); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID5518); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleInteger"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2577:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2578:2: (iv_ruleInteger= ruleInteger EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2579:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInteger_in_entryRuleInteger5566);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteger5577); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2586:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2589:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2590:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2590:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2590:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2590:2: (kw= '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2591:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInteger5616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleInteger5633); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2611:1: entryRuleFloateger returns [String current=null] : iv_ruleFloateger= ruleFloateger EOF ;
    public final String entryRuleFloateger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloateger = null;


        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2612:2: (iv_ruleFloateger= ruleFloateger EOF )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2613:2: iv_ruleFloateger= ruleFloateger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloategerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloateger_in_entryRuleFloateger5679);
            iv_ruleFloateger=ruleFloateger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloateger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloateger5690); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2620:1: ruleFloateger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleFloateger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FLOAT_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2623:28: ( ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2624:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2624:1: ( (kw= '-' )? this_FLOAT_1= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2624:2: (kw= '-' )? this_FLOAT_1= RULE_FLOAT
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2624:2: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2625:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFloateger5729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloategerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_FLOAT_1=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloateger5746); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2645:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2647:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2648:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2648:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '!=' ) )
            int alt36=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt36=1;
                }
                break;
            case 20:
                {
                alt36=2;
                }
                break;
            case 29:
                {
                alt36=3;
                }
                break;
            case 23:
                {
                alt36=4;
                }
                break;
            case 30:
                {
                alt36=5;
                }
                break;
            case 31:
                {
                alt36=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2648:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2648:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2648:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCompareOperator5805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2654:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2654:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2654:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCompareOperator5822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2660:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2660:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2660:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCompareOperator5839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2666:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2666:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2666:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompareOperator5856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2672:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2672:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2672:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCompareOperator5873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:6: (enumLiteral_5= '!=' )
                    {
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:6: (enumLiteral_5= '!=' )
                    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2678:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator5890); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2688:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2690:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2691:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2691:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2691:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePreOperator5934); if (state.failed) return current;
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


    // $ANTLR start "ruleBitwiseOrOperator"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2701:1: ruleBitwiseOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleBitwiseOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2703:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2704:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2704:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2704:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleBitwiseOrOperator5977); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2714:1: ruleBitwiseAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleBitwiseAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2716:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2717:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2717:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2717:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleBitwiseAndOperator6020); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2727:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2729:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2730:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2730:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2730:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleNotOperator6063); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2740:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2742:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2743:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2743:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2743:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAddOperator6106); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2753:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2755:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2756:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2756:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2756:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubOperator6149); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2766:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2768:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2769:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2769:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2769:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultOperator6192); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2779:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2781:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2782:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2782:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2782:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleModOperator6235); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2792:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2794:28: ( (enumLiteral_0= '/' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2795:1: (enumLiteral_0= '/' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2795:1: (enumLiteral_0= '/' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2795:3: enumLiteral_0= '/'
            {
            enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDivOperator6278); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2805:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2807:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2808:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2808:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2808:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleValOperator6321); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2818:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2820:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2821:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2821:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2821:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleLogicalOrOperator6364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
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
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2831:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2833:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2834:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2834:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2834:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleLogicalAndOperator6407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
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


    // $ANTLR start "rulePostfixAdd"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2844:1: rulePostfixAdd returns [Enumerator current=null] : (enumLiteral_0= '++' ) ;
    public final Enumerator rulePostfixAdd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2846:28: ( (enumLiteral_0= '++' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2847:1: (enumLiteral_0= '++' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2847:1: (enumLiteral_0= '++' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2847:3: enumLiteral_0= '++'
            {
            enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_rulePostfixAdd6450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixAddAccess().getPOSTFIX_ADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixAddAccess().getPOSTFIX_ADDEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "rulePostfixAdd"


    // $ANTLR start "rulePostfixSub"
    // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2857:1: rulePostfixSub returns [Enumerator current=null] : (enumLiteral_0= '--' ) ;
    public final Enumerator rulePostfixSub() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2859:28: ( (enumLiteral_0= '--' ) )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2860:1: (enumLiteral_0= '--' )
            {
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2860:1: (enumLiteral_0= '--' )
            // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:2860:3: enumLiteral_0= '--'
            {
            enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePostfixSub6493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixSubAccess().getPOSTFIX_SUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixSubAccess().getPOSTFIX_SUBEnumLiteralDeclaration()); 
                  
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
    // $ANTLR end "rulePostfixSub"

    // $ANTLR start synpred1_InternalKExpressions
    public final void synpred1_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:121:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:121:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred1_InternalKExpressions234);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalKExpressions

    // $ANTLR start synpred11_InternalKExpressions
    public final void synpred11_InternalKExpressions_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:590:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:590:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred11_InternalKExpressions1224);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalKExpressions

    // $ANTLR start synpred28_InternalKExpressions
    public final void synpred28_InternalKExpressions_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:6: ( (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:6: (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.core.kexpressions/src-gen/de/cau/cs/kieler/core/kexpressions/parser/antlr/internal/InternalKExpressions.g:1506:8: otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred28_InternalKExpressions3149); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred28_InternalKExpressions3174);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred28_InternalKExpressions3185); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalKExpressions

    // Delegated rules

    public final boolean synpred11_InternalKExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalKExpressions_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA1_eotS =
        "\20\uffff";
    static final String DFA1_eofS =
        "\20\uffff";
    static final String DFA1_minS =
        "\1\4\15\0\2\uffff";
    static final String DFA1_maxS =
        "\1\53\15\0\2\uffff";
    static final String DFA1_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\2\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\13\1\15\1\4\1\5\1\10\1\6\6\uffff\1\7\3\uffff\1\14\6\uffff"+
            "\1\1\4\uffff\1\11\1\uffff\1\16\4\uffff\1\12\2\uffff\1\2\1\3",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "120:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
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
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA1_5 = input.LA(1);

                         
                        int index1_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA1_6 = input.LA(1);

                         
                        int index1_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA1_7 = input.LA(1);

                         
                        int index1_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA1_8 = input.LA(1);

                         
                        int index1_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA1_10 = input.LA(1);

                         
                        int index1_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA1_11 = input.LA(1);

                         
                        int index1_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA1_12 = input.LA(1);

                         
                        int index1_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA1_13 = input.LA(1);

                         
                        int index1_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalKExpressions()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index1_13);
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
    static final String DFA11_eotS =
        "\17\uffff";
    static final String DFA11_eofS =
        "\17\uffff";
    static final String DFA11_minS =
        "\1\4\6\uffff\7\0\1\uffff";
    static final String DFA11_maxS =
        "\1\53\6\uffff\7\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\14\uffff\1\2";
    static final String DFA11_specialS =
        "\7\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\13\1\15\2\1\1\10\1\1\6\uffff\1\7\3\uffff\1\14\6\uffff\1"+
            "\1\4\uffff\1\11\1\uffff\1\16\4\uffff\1\12\2\uffff\2\1",
            "",
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
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "589:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalKExpressions()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\4\3\uffff\1\0\7\uffff";
    static final String DFA22_maxS =
        "\1\47\3\uffff\1\0\7\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\5\uffff\1\4";
    static final String DFA22_specialS =
        "\4\uffff\1\0\7\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\5\1\1\1\2\1\5\1\3\6\uffff\1\4\3\uffff\1\5\13\uffff\1\5\6"+
            "\uffff\1\5",
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
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1467:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_StringValue_2= ruleStringValue | (otherlv_3= '(' this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalKExpressions()) ) {s = 11;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index22_4);
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
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRoot140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleBoolExpression358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression392 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression452 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleLogicalOrExpression486 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression507 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression607 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleLogicalAndExpression641 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_ruleLogicalAndExpression662 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrExpression_in_entryRuleBitwiseOrExpression702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOrExpression712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression762 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleBitwiseOrOperator_in_ruleBitwiseOrExpression796 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_ruleBitwiseOrExpression817 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndExpression_in_entryRuleBitwiseAndExpression857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseAndExpression867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression917 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleBitwiseAndOperator_in_ruleBitwiseAndExpression951 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBitwiseAndExpression972 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1072 = new BitSet(new long[]{0x00000000F0900002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1105 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression1358 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression1379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression1599 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression1632 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression1653 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression1691 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression1701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression1751 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression1784 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression1805 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression1843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression1853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression1903 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression1936 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression1957 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression1995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2055 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression2088 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression2147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression2157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression2207 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression2240 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression2299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression2368 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_ruleNegExpression2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_entryRulePostfixAddExpression2456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePostfixAddExpression2466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixAdd_in_rulePostfixAddExpression2525 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_rulePostfixAddExpression_in_rulePostfixAddExpression2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_rulePostfixAddExpression2578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_entryRulePostfixSubExpression2613 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePostfixSubExpression2623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePostfixSub_in_rulePostfixSubExpression2682 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_rulePostfixSubExpression_in_rulePostfixSubExpression2703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_rulePostfixSubExpression2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression2830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicExpression2878 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression2903 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicExpression2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_ruleAtomicExpression2946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_ruleAtomicValuedExpression3131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAtomicValuedExpression3149 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3174 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAtomicValuedExpression3185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3323 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression3342 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleValuedObjectTestExpression3357 = new BitSet(new long[]{0x0000008100000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3378 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleValuedObjectTestExpression3390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3457 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference3516 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleValuedObjectReference3529 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference3550 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleValuedObjectReference3562 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall3600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFunctionCall3647 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleFunctionCall3668 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionCall3682 = new BitSet(new long[]{0x00000C85091103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall3703 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleFunctionCall3716 = new BitSet(new long[]{0x00000C85091103F0L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionCall3737 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleFunctionCall3751 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleFunctionCall3770 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFunctionCall3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleParameter3874 = new BitSet(new long[]{0x00000C85091103F0L});
        public static final BitSet FOLLOW_24_in_ruleParameter3905 = new BitSet(new long[]{0x00000C85081103F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleParameter3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression3978 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression4029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue4069 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue4079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue4120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue4160 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue4170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue4211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue4251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue4261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue4302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue4342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringValue4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue4393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation4439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation4449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation4530 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation4540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTagAnnotation4577 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation4634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation4644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyStringValueAnnotation4681 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation4702 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation4723 = new BitSet(new long[]{0x0000000000000212L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation4760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation4770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTypedKeyStringValueAnnotation4807 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4828 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypedKeyStringValueAnnotation4840 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation4861 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTypedKeyStringValueAnnotation4873 = new BitSet(new long[]{0x0000000000000210L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation4894 = new BitSet(new long[]{0x0000000000000212L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation4931 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation4941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyBooleanValueAnnotation4978 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation4999 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation5016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation5057 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyIntValueAnnotation5104 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation5125 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleInteger_in_ruleKeyIntValueAnnotation5146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation5182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation5192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleKeyFloatValueAnnotation5229 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation5250 = new BitSet(new long[]{0x0000000008000080L});
        public static final BitSet FOLLOW_ruleFloateger_in_ruleKeyFloatValueAnnotation5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID5433 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID5444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5484 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleExtendedID5503 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID5518 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger5566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteger5577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleInteger5616 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleInteger5633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloateger_in_entryRuleFloateger5679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloateger5690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleFloateger5729 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloateger5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCompareOperator5805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleCompareOperator5822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCompareOperator5839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCompareOperator5856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompareOperator5873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator5890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rulePreOperator5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleBitwiseOrOperator5977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleBitwiseAndOperator6020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleNotOperator6063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAddOperator6106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSubOperator6149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleMultOperator6192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleModOperator6235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDivOperator6278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleValOperator6321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleLogicalOrOperator6364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleLogicalAndOperator6407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rulePostfixAdd6450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePostfixSub6493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred1_InternalKExpressions234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred11_InternalKExpressions1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_synpred28_InternalKExpressions3149 = new BitSet(new long[]{0x00000C81081103F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred28_InternalKExpressions3174 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred28_InternalKExpressions3185 = new BitSet(new long[]{0x0000000000000002L});
    }


}