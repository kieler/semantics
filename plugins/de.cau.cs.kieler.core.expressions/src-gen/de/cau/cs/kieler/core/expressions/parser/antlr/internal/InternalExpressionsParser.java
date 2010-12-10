package de.cau.cs.kieler.core.expressions.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.core.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HOSTCODE", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'input'", "','", "';'", "'output'", "'inputoutput'", "'return'", "':'", "':='", "'var'", "'combine'", "'with'", "'@'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'/'", "'?'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=10;
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_HOSTCODE=5;

        public InternalExpressionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[138+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, IAstFactory factory, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleRoot
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:84:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:85:2: (iv_ruleRoot= ruleRoot EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:86:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRootRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot81);
            iv_ruleRoot=ruleRoot();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRoot


    // $ANTLR start ruleRoot
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:93:1: ruleRoot returns [EObject current=null] : (this_Expression_0= ruleExpression | this_InterfaceDeclaration_1= ruleInterfaceDeclaration ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_InterfaceDeclaration_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:98:6: ( (this_Expression_0= ruleExpression | this_InterfaceDeclaration_1= ruleInterfaceDeclaration ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:99:1: (this_Expression_0= ruleExpression | this_InterfaceDeclaration_1= ruleInterfaceDeclaration )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:99:1: (this_Expression_0= ruleExpression | this_InterfaceDeclaration_1= ruleInterfaceDeclaration )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_BOOLEAN)||LA1_0==15||LA1_0==35||LA1_0==38||LA1_0==40||LA1_0==44) ) {
                alt1=1;
            }
            else if ( (LA1_0==17||(LA1_0>=20 && LA1_0<=22)||LA1_0==25) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("99:1: (this_Expression_0= ruleExpression | this_InterfaceDeclaration_1= ruleInterfaceDeclaration )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:100:2: this_Expression_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getRootAccess().getExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleRoot141);
                    this_Expression_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Expression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:113:2: this_InterfaceDeclaration_1= ruleInterfaceDeclaration
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getRootAccess().getInterfaceDeclarationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceDeclaration_in_ruleRoot171);
                    this_InterfaceDeclaration_1=ruleInterfaceDeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceDeclaration_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRoot


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:132:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:133:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:134:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression206);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression216); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:141:1: ruleExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:146:6: ( (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:147:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:147:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:148:2: this_BooleanExpression_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExpression266);
                    this_BooleanExpression_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:161:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression296);
                    this_ValuedExpression_1=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:180:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:181:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:182:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression331);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression341); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:189:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:194:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:196:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression390);
            this_OrExpression_0=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleOrExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:215:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:216:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:217:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression424);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression434); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:224:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:229:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:230:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:230:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:231:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression484);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:242:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:242:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:242:2: ()
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:243:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:261:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:262:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:262:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:263:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrExpression517);
            	    lv_operator_2_0=ruleOrOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OrOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:285:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:286:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:286:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:287:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression538);
            	    lv_subExpressions_3_0=ruleAndExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"AndExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:317:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:318:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:319:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression576);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression586); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:326:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:331:6: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:332:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:332:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:333:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression636);
            this_CompareOperation_0=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:344:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:344:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:344:2: ()
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:345:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:363:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:364:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:364:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:365:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleAndExpression669);
            	    lv_operator_2_0=ruleAndOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"AndOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:387:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:388:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:388:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:389:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression690);
            	    lv_subExpressions_3_0=ruleCompareOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"CompareOperation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:419:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:420:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:421:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation728);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation738); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompareOperation


    // $ANTLR start ruleCompareOperation
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:428:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:433:6: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 40:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred5()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA5_3 = input.LA(2);

                if ( ((LA5_3>=29 && LA5_3<=34)||(LA5_3>=39 && LA5_3<=43)) ) {
                    alt5=1;
                }
                else if ( (LA5_3==EOF||LA5_3==16||LA5_3==18||LA5_3==23||(LA5_3>=36 && LA5_3<=37)) ) {
                    alt5=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==15) ) {
                    switch ( input.LA(3) ) {
                    case 35:
                        {
                        int LA5_21 = input.LA(4);

                        if ( (LA5_21==15) ) {
                            int LA5_28 = input.LA(5);

                            if ( (synpred5()) ) {
                                alt5=1;
                            }
                            else if ( (true) ) {
                                alt5=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 28, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 44:
                        {
                        int LA5_22 = input.LA(4);

                        if ( (LA5_22==RULE_ID) ) {
                            int LA5_29 = input.LA(5);

                            if ( (LA5_29==16) ) {
                                int LA5_30 = input.LA(6);

                                if ( ((LA5_30>=29 && LA5_30<=34)||(LA5_30>=39 && LA5_30<=43)) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_30==EOF||LA5_30==16||LA5_30==18||LA5_30==23||(LA5_30>=36 && LA5_30<=37)) ) {
                                    alt5=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 30, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 29, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA5_23 = input.LA(4);

                        if ( (LA5_23==16) ) {
                            int LA5_30 = input.LA(5);

                            if ( ((LA5_30>=29 && LA5_30<=34)||(LA5_30>=39 && LA5_30<=43)) ) {
                                alt5=1;
                            }
                            else if ( (LA5_30==EOF||LA5_30==16||LA5_30==18||LA5_30==23||(LA5_30>=36 && LA5_30<=37)) ) {
                                alt5=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 11, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA5_5 = input.LA(2);

                if ( (LA5_5==RULE_ID) ) {
                    int LA5_12 = input.LA(3);

                    if ( ((LA5_12>=29 && LA5_12<=34)||(LA5_12>=39 && LA5_12<=43)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_12==EOF||LA5_12==16||LA5_12==18||LA5_12==23||(LA5_12>=36 && LA5_12<=37)) ) {
                        alt5=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA5_6 = input.LA(2);

                if ( (LA5_6==EOF||LA5_6==16||LA5_6==18||LA5_6==23||(LA5_6>=36 && LA5_6<=37)) ) {
                    alt5=2;
                }
                else if ( ((LA5_6>=29 && LA5_6<=34)||(LA5_6>=39 && LA5_6<=43)) ) {
                    alt5=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                switch ( input.LA(2) ) {
                case 15:
                    {
                    int LA5_13 = input.LA(3);

                    if ( (LA5_13==RULE_ID) ) {
                        int LA5_24 = input.LA(4);

                        if ( (LA5_24==16) ) {
                            int LA5_31 = input.LA(5);

                            if ( ((LA5_31>=29 && LA5_31<=34)||(LA5_31>=39 && LA5_31<=43)) ) {
                                alt5=1;
                            }
                            else if ( (LA5_31==EOF||LA5_31==16||LA5_31==18||LA5_31==23||(LA5_31>=36 && LA5_31<=37)) ) {
                                alt5=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 31, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt5=1;
                    }
                    break;
                case EOF:
                case 16:
                case 18:
                case 23:
                case 36:
                case 37:
                    {
                    alt5=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 7, input);

                    throw nvae;
                }

                }
                break;
            case 38:
                {
                switch ( input.LA(2) ) {
                case 38:
                    {
                    int LA5_14 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    else if ( (true) ) {
                        alt5=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    int LA5_15 = input.LA(3);

                    if ( (LA5_15==EOF||LA5_15==16||LA5_15==18||LA5_15==23||(LA5_15>=36 && LA5_15<=37)) ) {
                        alt5=2;
                    }
                    else if ( ((LA5_15>=29 && LA5_15<=34)) ) {
                        alt5=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA5_16 = input.LA(3);

                    if ( (LA5_16==15) ) {
                        switch ( input.LA(4) ) {
                        case 35:
                            {
                            int LA5_32 = input.LA(5);

                            if ( (LA5_32==15) ) {
                                int LA5_36 = input.LA(6);

                                if ( (synpred5()) ) {
                                    alt5=1;
                                }
                                else if ( (true) ) {
                                    alt5=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 36, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 32, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 44:
                            {
                            int LA5_33 = input.LA(5);

                            if ( (LA5_33==RULE_ID) ) {
                                int LA5_37 = input.LA(6);

                                if ( (LA5_37==16) ) {
                                    int LA5_38 = input.LA(7);

                                    if ( ((LA5_38>=29 && LA5_38<=34)) ) {
                                        alt5=1;
                                    }
                                    else if ( (LA5_38==EOF||LA5_38==16||LA5_38==18||LA5_38==23||(LA5_38>=36 && LA5_38<=37)) ) {
                                        alt5=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 38, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 37, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 33, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA5_34 = input.LA(5);

                            if ( (LA5_34==16) ) {
                                int LA5_38 = input.LA(6);

                                if ( ((LA5_38>=29 && LA5_38<=34)) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_38==EOF||LA5_38==16||LA5_38==18||LA5_38==23||(LA5_38>=36 && LA5_38<=37)) ) {
                                    alt5=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 38, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 25, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA5_17 = input.LA(3);

                    if ( (LA5_17==RULE_ID) ) {
                        int LA5_26 = input.LA(4);

                        if ( ((LA5_26>=29 && LA5_26<=34)) ) {
                            alt5=1;
                        }
                        else if ( (LA5_26==EOF||LA5_26==16||LA5_26==18||LA5_26==23||(LA5_26>=36 && LA5_26<=37)) ) {
                            alt5=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 26, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA5_18 = input.LA(3);

                    if ( (LA5_18==EOF||LA5_18==16||LA5_18==18||LA5_18==23||(LA5_18>=36 && LA5_18<=37)) ) {
                        alt5=2;
                    }
                    else if ( ((LA5_18>=29 && LA5_18<=34)) ) {
                        alt5=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 15:
                    {
                    int LA5_19 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    else if ( (true) ) {
                        alt5=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HOSTCODE:
                    {
                    switch ( input.LA(3) ) {
                    case 15:
                        {
                        int LA5_27 = input.LA(4);

                        if ( (LA5_27==RULE_ID) ) {
                            int LA5_35 = input.LA(5);

                            if ( (LA5_35==16) ) {
                                int LA5_39 = input.LA(6);

                                if ( (LA5_39==EOF||LA5_39==16||LA5_39==18||LA5_39==23||(LA5_39>=36 && LA5_39<=37)) ) {
                                    alt5=2;
                                }
                                else if ( ((LA5_39>=29 && LA5_39<=34)) ) {
                                    alt5=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 39, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 35, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 27, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                        {
                        alt5=1;
                        }
                        break;
                    case EOF:
                    case 16:
                    case 18:
                    case 23:
                    case 36:
                    case 37:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 20, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("434:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:435:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation789);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:446:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:446:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:446:2: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:447:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:465:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:466:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:466:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:467:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation822);
                    lv_operator_2_0=ruleCompareOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"CompareOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:489:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:490:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:490:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:491:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation843);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"NotOrValuedExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:515:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation876);
                    this_NotExpression_4=ruleNotExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotExpression_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleNotOrValuedExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:534:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:535:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:536:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression911);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression921); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotOrValuedExpression


    // $ANTLR start ruleNotOrValuedExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:543:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:548:6: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 40:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred6()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred6()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==15) ) {
                    switch ( input.LA(3) ) {
                    case 35:
                        {
                        int LA6_11 = input.LA(4);

                        if ( (LA6_11==15) ) {
                            int LA6_14 = input.LA(5);

                            if ( (synpred6()) ) {
                                alt6=1;
                            }
                            else if ( (true) ) {
                                alt6=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 44:
                        {
                        int LA6_12 = input.LA(4);

                        if ( (LA6_12==RULE_ID) ) {
                            int LA6_15 = input.LA(5);

                            if ( (LA6_15==16) ) {
                                int LA6_16 = input.LA(6);

                                if ( (synpred6()) ) {
                                    alt6=1;
                                }
                                else if ( (true) ) {
                                    alt6=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA6_13 = input.LA(4);

                        if ( (LA6_13==16) ) {
                            int LA6_16 = input.LA(5);

                            if ( (synpred6()) ) {
                                alt6=1;
                            }
                            else if ( (true) ) {
                                alt6=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 9, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==RULE_ID) ) {
                    int LA6_10 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt6=1;
                    }
                    else if ( (true) ) {
                        alt6=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA6_6 = input.LA(2);

                if ( (synpred6()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                int LA6_7 = input.LA(2);

                if ( (synpred6()) ) {
                    alt6=1;
                }
                else if ( (true) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 7, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt6=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("549:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:550:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression971);
                    this_ValuedExpression_0=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:563:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1001);
                    this_NotExpression_1=ruleNotExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOrValuedExpression


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:582:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:583:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:584:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression1036);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression1046); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotExpression


    // $ANTLR start ruleNotExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:591:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:596:6: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:597:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:597:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_HOSTCODE)||LA7_0==RULE_BOOLEAN||LA7_0==15||LA7_0==35||LA7_0==44) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("597:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:597:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:597:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:597:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:597:3: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:598:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:611:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:612:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:612:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:613:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression1105);
                    lv_operator_1_0=ruleNotOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNotExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"NotOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:635:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:636:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:636:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:637:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression1126);
                    lv_subExpressions_2_0=ruleNotExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNotExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_2_0, 
                      	        		"NotExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:661:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression1158);
                    this_AtomicExpression_3=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotExpression


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:680:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:681:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:682:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1193);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression1203); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedExpression


    // $ANTLR start ruleValuedExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:689:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:694:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:696:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression1252);
            this_AddExpression_0=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValuedExpression


    // $ANTLR start entryRuleAddExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:715:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:716:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:717:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression1286);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression1296); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAddExpression


    // $ANTLR start ruleAddExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:724:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:729:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:730:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:730:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:731:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression1346);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:742:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:742:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:742:2: ()
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:743:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:761:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:762:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:762:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:763:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression1379);
            	    lv_operator_2_0=ruleAddOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"AddOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:785:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:786:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:786:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:787:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression1400);
            	    lv_subExpressions_3_0=ruleSubExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"SubExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddExpression


    // $ANTLR start entryRuleSubExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:817:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:818:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:819:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression1438);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression1448); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubExpression


    // $ANTLR start ruleSubExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:826:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:831:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:832:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:832:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:833:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression1498);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:844:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:844:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:844:2: ()
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:845:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:863:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:864:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:864:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:865:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression1531);
            	    lv_operator_2_0=ruleSubOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"SubOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:887:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:888:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:888:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:889:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression1552);
            	    lv_subExpressions_3_0=ruleMultExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"MultExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubExpression


    // $ANTLR start entryRuleMultExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:919:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:920:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:921:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression1590);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression1600); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultExpression


    // $ANTLR start ruleMultExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:928:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:933:6: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:934:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:934:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:935:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression1650);
            this_DivExpression_0=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:946:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:946:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:946:2: ()
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:947:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:965:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:966:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:966:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:967:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression1683);
            	    lv_operator_2_0=ruleMultOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"MultOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:989:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:990:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:990:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:991:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression1704);
            	    lv_subExpressions_3_0=ruleDivExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"DivExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultExpression


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1021:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1022:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1023:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression1742);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression1752); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDivExpression


    // $ANTLR start ruleDivExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1030:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1035:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1036:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1036:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1037:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression1802);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1048:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1048:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1048:2: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1049:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1067:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1068:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1068:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1069:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression1835);
                    lv_operator_2_0=ruleDivOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDivExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"DivOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1091:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1092:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1092:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1093:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression1856);
                    lv_subExpressions_3_0=ruleModExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDivExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"ModExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDivExpression


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1123:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1124:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1125:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression1894);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression1904); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModExpression


    // $ANTLR start ruleModExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1132:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1137:6: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1138:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1138:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1139:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression1954);
            this_NegExpression_0=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1150:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1150:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1150:2: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1151:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1169:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1170:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1170:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1171:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression1987);
                    lv_operator_2_0=ruleModOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"ModOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1193:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1194:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1194:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1195:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2008);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"AtomicValuedExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModExpression


    // $ANTLR start entryRuleNegExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1225:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1226:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1227:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNegExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression2046);
            iv_ruleNegExpression=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression2056); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNegExpression


    // $ANTLR start ruleNegExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1234:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1239:6: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1240:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1240:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_BOOLEAN)||LA13_0==15||LA13_0==35||LA13_0==44) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1240:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1240:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1240:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1240:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1240:3: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1241:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1254:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1255:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1255:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1256:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression2115);
                    lv_operator_1_0=ruleSubOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNegExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"SubOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1278:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1279:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1279:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1280:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression2136);
                    lv_subExpressions_2_0=ruleNegExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNegExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_2_0, 
                      	        		"NegExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1304:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression2168);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNegExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1323:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1324:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1325:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2203);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression2213); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicExpression


    // $ANTLR start ruleAtomicExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1332:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_TextExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1337:6: ( (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1338:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1338:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
            case 35:
            case 44:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt14=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1338:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1339:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleAtomicExpression2263);
                    this_BooleanValue_0=ruleBooleanValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1352:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2293);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedObjectTestExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1364:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1364:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1364:8: '(' this_BooleanExpression_3= ruleBooleanExpression ')'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAtomicExpression2309); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression2334);
                    this_BooleanExpression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicExpression2343); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1386:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression2375);
                    this_TextExpression_5=ruleTextExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextExpression_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicExpression


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1405:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1406:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1407:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression2410);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression2420); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicValuedExpression


    // $ANTLR start ruleAtomicValuedExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1414:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1419:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1420:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1420:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt15=2;
                }
                break;
            case 15:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred19()) ) {
                    alt15=3;
                }
                else if ( (true) ) {
                    alt15=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1420:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_HOSTCODE:
            case RULE_BOOLEAN:
            case 35:
            case 44:
                {
                alt15=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1420:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1421:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression2470);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1434:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression2500);
                    this_FloatValue_1=ruleFloatValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:8: '(' this_ValuedExpression_3= ruleValuedExpression ')'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleAtomicValuedExpression2516); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression2541);
                    this_ValuedExpression_3=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleAtomicValuedExpression2550); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1468:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression2582);
                    this_AtomicExpression_5=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicValuedExpression


    // $ANTLR start entryRuleValuedObjectTestExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1487:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1488:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1489:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression2617);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression2627); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedObjectTestExpression


    // $ANTLR start ruleValuedObjectTestExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1496:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        EObject lv_subExpressions_7_0 = null;

        EObject this_ValuedObjectReference_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1501:6: ( ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1502:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1502:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case 44:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1502:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1502:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1502:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1502:3: () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')'
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1502:3: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1503:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1516:2: ( (lv_operator_1_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1517:1: (lv_operator_1_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1517:1: (lv_operator_1_0= rulePreOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1518:3: lv_operator_1_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression2686);
                    lv_operator_1_0=rulePreOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"PreOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleValuedObjectTestExpression2696); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1544:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1545:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1545:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1546:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression2717);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"ValuedObjectTestExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleValuedObjectTestExpression2727); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1573:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1573:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1573:7: () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1573:7: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1574:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1587:2: ( (lv_operator_6_0= ruleValueTestOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1588:1: (lv_operator_6_0= ruleValueTestOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1588:1: (lv_operator_6_0= ruleValueTestOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1589:3: lv_operator_6_0= ruleValueTestOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression2768);
                    lv_operator_6_0=ruleValueTestOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_6_0, 
                      	        		"ValueTestOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1611:2: ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1612:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1612:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1613:3: lv_subExpressions_7_0= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression2789);
                    lv_subExpressions_7_0=ruleValuedObjectReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_7_0, 
                      	        		"ValuedObjectReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1637:2: this_ValuedObjectReference_8= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression2821);
                    this_ValuedObjectReference_8=ruleValuedObjectReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValuedObjectTestExpression


    // $ANTLR start entryRuleValuedObjectReference
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1656:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1657:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1658:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference2856);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference2866); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedObjectReference


    // $ANTLR start ruleValuedObjectReference
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1665:1: ruleValuedObjectReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1670:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1671:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1671:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1672:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1672:1: ( RULE_ID )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1673:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getValuedObjectReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference2912); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0(), "valuedObject"); 
              	
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValuedObjectReference


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1696:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1697:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1698:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression2947);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression2957); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTextExpression


    // $ANTLR start ruleTextExpression
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1705:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1710:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1711:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1711:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1711:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1711:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1712:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1712:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1713:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression2999); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextExpressionAccess().getCodeHOSTCODETerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"code",
              	        		lv_code_0_0, 
              	        		"HOSTCODE", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1735:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1735:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleTextExpression3015); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1739:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1740:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1740:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1741:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextExpression3032); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleTextExpression3047); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTextExpression


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1775:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1776:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1777:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue3085);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue3095); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1784:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1789:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1790:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1790:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1791:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1791:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1792:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue3136); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1822:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1823:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1824:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue3176);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue3186); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1831:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1836:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1837:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1837:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1838:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1838:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1839:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue3227); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"Float", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1869:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1870:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1871:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3267);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue3277); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1878:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1883:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1884:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1884:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1885:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1885:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1886:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3318); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"Boolean", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleInterfaceDeclaration
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1918:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1919:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1920:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDeclarationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration3360);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDeclaration3370); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceDeclaration


    // $ANTLR start ruleInterfaceDeclaration
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1927:1: ruleInterfaceDeclaration returns [EObject current=null] : (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceSignalDecl_0 = null;

        EObject this_InterfaceVariableDecl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1932:6: ( (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1933:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1933:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17||(LA18_0>=20 && LA18_0<=22)) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1933:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1934:2: this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceSignalDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration3420);
                    this_InterfaceSignalDecl_0=ruleInterfaceSignalDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceSignalDecl_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1947:2: this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceVariableDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration3450);
                    this_InterfaceVariableDecl_1=ruleInterfaceVariableDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceVariableDecl_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterfaceDeclaration


    // $ANTLR start entryRuleISignal
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1966:1: entryRuleISignal returns [EObject current=null] : iv_ruleISignal= ruleISignal EOF ;
    public final EObject entryRuleISignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleISignal = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1967:2: (iv_ruleISignal= ruleISignal EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1968:2: iv_ruleISignal= ruleISignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getISignalRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleISignal_in_entryRuleISignal3485);
            iv_ruleISignal=ruleISignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleISignal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleISignal3495); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleISignal


    // $ANTLR start ruleISignal
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1975:1: ruleISignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) ;
    public final EObject ruleISignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_channelDescr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1980:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1981:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1981:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1981:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1981:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1982:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1982:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1983:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleISignal3537); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getISignalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getISignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2005:2: ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15||(LA19_0>=23 && LA19_0<=24)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2006:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2006:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2007:3: lv_channelDescr_1_0= ruleChannelDescription
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getISignalAccess().getChannelDescrChannelDescriptionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleChannelDescription_in_ruleISignal3563);
                    lv_channelDescr_1_0=ruleChannelDescription();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getISignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"channelDescr",
                      	        		lv_channelDescr_1_0, 
                      	        		"ChannelDescription", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleISignal


    // $ANTLR start entryRuleInterfaceSignalDecl
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2037:1: entryRuleInterfaceSignalDecl returns [EObject current=null] : iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF ;
    public final EObject entryRuleInterfaceSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2038:2: (iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2039:2: iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl3600);
            iv_ruleInterfaceSignalDecl=ruleInterfaceSignalDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceSignalDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceSignalDecl3610); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceSignalDecl


    // $ANTLR start ruleInterfaceSignalDecl
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2046:1: ruleInterfaceSignalDecl returns [EObject current=null] : ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) ;
    public final EObject ruleInterfaceSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_2_0 = null;

        EObject lv_signals_4_0 = null;

        EObject lv_signals_8_0 = null;

        EObject lv_signals_10_0 = null;

        EObject lv_signals_14_0 = null;

        EObject lv_signals_16_0 = null;

        EObject lv_signals_20_0 = null;

        EObject lv_signals_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2051:6: ( ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2052:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2052:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt24=1;
                }
                break;
            case 20:
                {
                alt24=2;
                }
                break;
            case 21:
                {
                alt24=3;
                }
                break;
            case 22:
                {
                alt24=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2052:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2052:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2052:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2052:3: () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2052:3: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2053:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_ruleInterfaceSignalDecl3658); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2070:1: ( (lv_signals_2_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2071:1: (lv_signals_2_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2071:1: (lv_signals_2_0= ruleISignal )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2072:3: lv_signals_2_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3679);
                    lv_signals_2_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_2_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2094:2: ( ',' ( (lv_signals_4_0= ruleISignal ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2094:4: ',' ( (lv_signals_4_0= ruleISignal ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInterfaceSignalDecl3690); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2098:1: ( (lv_signals_4_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2099:1: (lv_signals_4_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2099:1: (lv_signals_4_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2100:3: lv_signals_4_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3711);
                    	    lv_signals_4_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_4_0, 
                    	      	        		"ISignal", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleInterfaceSignalDecl3723); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2127:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2127:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2127:7: () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2127:7: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2128:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleInterfaceSignalDecl3753); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2145:1: ( (lv_signals_8_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2146:1: (lv_signals_8_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2146:1: (lv_signals_8_0= ruleISignal )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2147:3: lv_signals_8_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3774);
                    lv_signals_8_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_8_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2169:2: ( ',' ( (lv_signals_10_0= ruleISignal ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2169:4: ',' ( (lv_signals_10_0= ruleISignal ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInterfaceSignalDecl3785); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2173:1: ( (lv_signals_10_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2174:1: (lv_signals_10_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2174:1: (lv_signals_10_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2175:3: lv_signals_10_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3806);
                    	    lv_signals_10_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_10_0, 
                    	      	        		"ISignal", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleInterfaceSignalDecl3818); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2202:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2202:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2202:7: () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2202:7: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2203:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,21,FollowSets000.FOLLOW_21_in_ruleInterfaceSignalDecl3848); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2220:1: ( (lv_signals_14_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2221:1: (lv_signals_14_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2221:1: (lv_signals_14_0= ruleISignal )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2222:3: lv_signals_14_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3869);
                    lv_signals_14_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_14_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2244:2: ( ',' ( (lv_signals_16_0= ruleISignal ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2244:4: ',' ( (lv_signals_16_0= ruleISignal ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInterfaceSignalDecl3880); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2248:1: ( (lv_signals_16_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2249:1: (lv_signals_16_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2249:1: (lv_signals_16_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2250:3: lv_signals_16_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3901);
                    	    lv_signals_16_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_16_0, 
                    	      	        		"ISignal", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleInterfaceSignalDecl3913); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2277:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2277:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2277:7: () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2277:7: ()
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2278:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,22,FollowSets000.FOLLOW_22_in_ruleInterfaceSignalDecl3943); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2295:1: ( (lv_signals_20_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2296:1: (lv_signals_20_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2296:1: (lv_signals_20_0= ruleISignal )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2297:3: lv_signals_20_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3964);
                    lv_signals_20_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_20_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2319:2: ( ',' ( (lv_signals_22_0= ruleISignal ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2319:4: ',' ( (lv_signals_22_0= ruleISignal ) )
                    	    {
                    	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInterfaceSignalDecl3975); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2323:1: ( (lv_signals_22_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2324:1: (lv_signals_22_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2324:1: (lv_signals_22_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2325:3: lv_signals_22_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3996);
                    	    lv_signals_22_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_22_0, 
                    	      	        		"ISignal", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleInterfaceSignalDecl4008); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_3_4(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterfaceSignalDecl


    // $ANTLR start entryRuleChannelDescription
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2359:1: entryRuleChannelDescription returns [EObject current=null] : iv_ruleChannelDescription= ruleChannelDescription EOF ;
    public final EObject entryRuleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDescription = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2360:2: (iv_ruleChannelDescription= ruleChannelDescription EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2361:2: iv_ruleChannelDescription= ruleChannelDescription EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getChannelDescriptionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription4045);
            iv_ruleChannelDescription=ruleChannelDescription();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleChannelDescription; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChannelDescription4055); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleChannelDescription


    // $ANTLR start ruleChannelDescription
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2368:1: ruleChannelDescription returns [EObject current=null] : ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) ;
    public final EObject ruleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_type_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2373:6: ( ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2374:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2374:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt25=1;
                }
                break;
            case 15:
                {
                alt25=2;
                }
                break;
            case 24:
                {
                alt25=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2374:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2374:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2374:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2374:4: ':' ( (lv_type_1_0= ruleTypeIdentifier ) )
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleChannelDescription4091); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2378:1: ( (lv_type_1_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2379:1: (lv_type_1_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2379:1: (lv_type_1_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2380:3: lv_type_1_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4112);
                    lv_type_1_0=ruleTypeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_1_0, 
                      	        		"TypeIdentifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2403:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2403:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2403:8: '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleChannelDescription4130); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2407:1: ( (lv_type_3_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2408:1: (lv_type_3_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2408:1: (lv_type_3_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2409:3: lv_type_3_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4151);
                    lv_type_3_0=ruleTypeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_3_0, 
                      	        		"TypeIdentifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleChannelDescription4161); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2436:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2436:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2436:8: ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) )
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleChannelDescription4179); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2440:1: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2441:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2441:1: (lv_expression_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2442:3: lv_expression_6_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleChannelDescription4200);
                    lv_expression_6_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_6_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,23,FollowSets000.FOLLOW_23_in_ruleChannelDescription4210); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2468:1: ( (lv_type_8_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2469:1: (lv_type_8_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2469:1: (lv_type_8_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2470:3: lv_type_8_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4231);
                    lv_type_8_0=ruleTypeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_8_0, 
                      	        		"TypeIdentifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleChannelDescription


    // $ANTLR start entryRuleInterfaceVariableDecl
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2500:1: entryRuleInterfaceVariableDecl returns [EObject current=null] : iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF ;
    public final EObject entryRuleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2501:2: (iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2502:2: iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceVariableDeclRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl4268);
            iv_ruleInterfaceVariableDecl=ruleInterfaceVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceVariableDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceVariableDecl4278); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceVariableDecl


    // $ANTLR start ruleInterfaceVariableDecl
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2509:1: ruleInterfaceVariableDecl returns [EObject current=null] : ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) ;
    public final EObject ruleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecls_1_0 = null;

        EObject lv_varDecls_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2514:6: ( ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2515:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2515:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2515:3: 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            {
            match(input,25,FollowSets000.FOLLOW_25_in_ruleInterfaceVariableDecl4313); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2519:1: ( (lv_varDecls_1_0= ruleVariableDecl ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2520:1: (lv_varDecls_1_0= ruleVariableDecl )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2520:1: (lv_varDecls_1_0= ruleVariableDecl )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2521:3: lv_varDecls_1_0= ruleVariableDecl
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl4334);
            lv_varDecls_1_0=ruleVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceVariableDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"varDecls",
              	        		lv_varDecls_1_0, 
              	        		"VariableDecl", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2543:2: ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2543:4: ',' ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    {
            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleInterfaceVariableDecl4345); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2547:1: ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2548:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2548:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2549:3: lv_varDecls_3_0= ruleVariableDecl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl4366);
            	    lv_varDecls_3_0=ruleVariableDecl();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterfaceVariableDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"varDecls",
            	      	        		lv_varDecls_3_0, 
            	      	        		"VariableDecl", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterfaceVariableDecl


    // $ANTLR start entryRuleVariableDecl
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2579:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2580:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2581:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl4404);
            iv_ruleVariableDecl=ruleVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDecl4414); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableDecl


    // $ANTLR start ruleVariableDecl
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2588:1: ruleVariableDecl returns [EObject current=null] : ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2593:6: ( ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2594:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2594:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2594:2: ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2594:2: ( (lv_variables_0_0= ruleIVariable ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2595:1: (lv_variables_0_0= ruleIVariable )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2595:1: (lv_variables_0_0= ruleIVariable )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2596:3: lv_variables_0_0= ruleIVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIVariable_in_ruleVariableDecl4460);
            lv_variables_0_0=ruleIVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"variables",
              	        		lv_variables_0_0, 
              	        		"IVariable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2618:2: ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2618:4: ',' ( (lv_variables_2_0= ruleIVariable ) )
            	    {
            	    match(input,18,FollowSets000.FOLLOW_18_in_ruleVariableDecl4471); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2622:1: ( (lv_variables_2_0= ruleIVariable ) )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2623:1: (lv_variables_2_0= ruleIVariable )
            	    {
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2623:1: (lv_variables_2_0= ruleIVariable )
            	    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2624:3: lv_variables_2_0= ruleIVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIVariable_in_ruleVariableDecl4492);
            	    lv_variables_2_0=ruleIVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_2_0, 
            	      	        		"IVariable", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,23,FollowSets000.FOLLOW_23_in_ruleVariableDecl4504); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2650:1: ( (lv_type_4_0= ruleTypeIdentifier ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2651:1: (lv_type_4_0= ruleTypeIdentifier )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2651:1: (lv_type_4_0= ruleTypeIdentifier )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2652:3: lv_type_4_0= ruleTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getTypeTypeIdentifierParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl4525);
            lv_type_4_0=ruleTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_4_0, 
              	        		"TypeIdentifier", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariableDecl


    // $ANTLR start entryRuleIVariable
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2682:1: entryRuleIVariable returns [EObject current=null] : iv_ruleIVariable= ruleIVariable EOF ;
    public final EObject entryRuleIVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIVariable = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2683:2: (iv_ruleIVariable= ruleIVariable EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2684:2: iv_ruleIVariable= ruleIVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIVariableRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIVariable_in_entryRuleIVariable4561);
            iv_ruleIVariable=ruleIVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIVariable4571); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIVariable


    // $ANTLR start ruleIVariable
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2691:1: ruleIVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleIVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2696:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2697:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2697:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2697:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2697:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2698:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2698:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2699:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIVariable4613); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIVariableAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2721:2: ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2721:4: ':=' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleIVariable4629); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2725:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2726:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2726:1: (lv_expression_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2727:3: lv_expression_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIVariableAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIVariable4650);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_2_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIVariable


    // $ANTLR start entryRuleTypeIdentifier
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2757:1: entryRuleTypeIdentifier returns [EObject current=null] : iv_ruleTypeIdentifier= ruleTypeIdentifier EOF ;
    public final EObject entryRuleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdentifier = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2758:2: (iv_ruleTypeIdentifier= ruleTypeIdentifier EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2759:2: iv_ruleTypeIdentifier= ruleTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier4688);
            iv_ruleTypeIdentifier=ruleTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeIdentifier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeIdentifier4698); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeIdentifier


    // $ANTLR start ruleTypeIdentifier
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2766:1: ruleTypeIdentifier returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) ;
    public final EObject ruleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_typeID_1_0=null;
        Token lv_typeID_4_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_type_3_0 = null;

        Enumerator lv_operator_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2771:6: ( ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2772:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2772:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
                {
                alt30=2;
                }
                break;
            case 26:
                {
                alt30=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2772:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2772:2: ( (lv_type_0_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2772:2: ( (lv_type_0_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2773:1: (lv_type_0_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2773:1: (lv_type_0_0= ruleValueType )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2774:3: lv_type_0_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleTypeIdentifier4744);
                    lv_type_0_0=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_0_0, 
                      	        		"ValueType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2797:6: ( (lv_typeID_1_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2797:6: ( (lv_typeID_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2798:1: (lv_typeID_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2798:1: (lv_typeID_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2799:3: lv_typeID_1_0= RULE_ID
                    {
                    lv_typeID_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeIdentifier4767); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_1_0(), "typeID"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"typeID",
                      	        		lv_typeID_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2822:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2822:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2822:8: 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) )
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleTypeIdentifier4789); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2826:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=45 && LA29_0<=50)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==RULE_ID) ) {
                        alt29=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2826:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2826:2: ( (lv_type_3_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2826:2: ( (lv_type_3_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2827:1: (lv_type_3_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2827:1: (lv_type_3_0= ruleValueType )
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2828:3: lv_type_3_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleTypeIdentifier4811);
                            lv_type_3_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_3_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2851:6: ( (lv_typeID_4_0= RULE_ID ) )
                            {
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2851:6: ( (lv_typeID_4_0= RULE_ID ) )
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2852:1: (lv_typeID_4_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2852:1: (lv_typeID_4_0= RULE_ID )
                            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2853:3: lv_typeID_4_0= RULE_ID
                            {
                            lv_typeID_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeIdentifier4834); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_2_1_1_0(), "typeID"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"typeID",
                              	        		lv_typeID_4_0, 
                              	        		"ID", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleTypeIdentifier4850); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2879:1: ( (lv_operator_6_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2880:1: (lv_operator_6_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2880:1: (lv_operator_6_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2881:3: lv_operator_6_0= ruleCombineOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getOperatorCombineOperatorEnumRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier4871);
                    lv_operator_6_0=ruleCombineOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_6_0, 
                      	        		"CombineOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeIdentifier


    // $ANTLR start entryRuleCommentAnnotation
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2913:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2914:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2915:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommentAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation4910);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation4920); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCommentAnnotation


    // $ANTLR start ruleCommentAnnotation
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2922:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2927:6: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2928:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2928:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2929:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2929:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2930:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation4961); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCommentAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"COMMENT_ANNOTATION", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommentAnnotation


    // $ANTLR start entryRuleKeyValueAnnotation
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2960:1: entryRuleKeyValueAnnotation returns [EObject current=null] : iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF ;
    public final EObject entryRuleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2961:2: (iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2962:2: iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation5001);
            iv_ruleKeyValueAnnotation=ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValueAnnotation5011); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKeyValueAnnotation


    // $ANTLR start ruleKeyValueAnnotation
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2969:1: ruleKeyValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2974:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2975:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2975:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2975:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            match(input,28,FollowSets000.FOLLOW_28_in_ruleKeyValueAnnotation5046); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2979:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2980:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2980:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:2981:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyValueAnnotation5063); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3003:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3004:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3004:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3005:3: lv_value_2_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyValueAnnotation5089);
            lv_value_2_0=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"EString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleKeyValueAnnotation


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3037:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3038:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3039:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString5128);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString5139); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3046:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3051:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3052:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3052:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3052:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3052:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString5179); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3060:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString5205); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEString


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3075:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3079:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3080:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3080:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt32=1;
                }
                break;
            case 30:
                {
                alt32=2;
                }
                break;
            case 31:
                {
                alt32=3;
                }
                break;
            case 32:
                {
                alt32=4;
                }
                break;
            case 33:
                {
                alt32=5;
                }
                break;
            case 34:
                {
                alt32=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3080:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3080:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3080:2: ( '=' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3080:4: '='
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleCompareOperator5262); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3086:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3086:6: ( '<' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3086:8: '<'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleCompareOperator5277); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3092:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3092:6: ( '<=' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3092:8: '<='
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator5292); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3098:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3098:6: ( '>' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3098:8: '>'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleCompareOperator5307); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3104:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3104:6: ( '>=' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3104:8: '>='
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleCompareOperator5322); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3110:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3110:6: ( '<>' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3110:8: '<>'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleCompareOperator5337); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperator


    // $ANTLR start rulePreOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3120:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3124:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3125:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3125:1: ( 'pre' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3125:3: 'pre'
            {
            match(input,35,FollowSets000.FOLLOW_35_in_rulePreOperator5379); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePreOperator


    // $ANTLR start ruleOrOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3135:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3139:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3140:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3140:1: ( 'or' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3140:3: 'or'
            {
            match(input,36,FollowSets000.FOLLOW_36_in_ruleOrOperator5420); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrOperator


    // $ANTLR start ruleAndOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3150:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3154:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3155:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3155:1: ( 'and' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3155:3: 'and'
            {
            match(input,37,FollowSets000.FOLLOW_37_in_ruleAndOperator5461); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAndOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3165:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3169:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3170:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3170:1: ( 'not' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3170:3: 'not'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_ruleNotOperator5502); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleAddOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3180:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3184:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3185:1: ( '+' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3185:1: ( '+' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3185:3: '+'
            {
            match(input,39,FollowSets000.FOLLOW_39_in_ruleAddOperator5543); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddOperator


    // $ANTLR start ruleSubOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3195:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3199:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3200:1: ( '-' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3200:1: ( '-' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3200:3: '-'
            {
            match(input,40,FollowSets000.FOLLOW_40_in_ruleSubOperator5584); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3210:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3214:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3215:1: ( '*' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3215:1: ( '*' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3215:3: '*'
            {
            match(input,41,FollowSets000.FOLLOW_41_in_ruleMultOperator5625); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleModOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3225:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3229:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3230:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3230:1: ( 'mod' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3230:3: 'mod'
            {
            match(input,42,FollowSets000.FOLLOW_42_in_ruleModOperator5666); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3240:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3244:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3245:1: ( '/' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3245:1: ( '/' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3245:3: '/'
            {
            match(input,43,FollowSets000.FOLLOW_43_in_ruleDivOperator5707); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDivOperator


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3255:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3259:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3260:1: ( '?' )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3260:1: ( '?' )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3260:3: '?'
            {
            match(input,44,FollowSets000.FOLLOW_44_in_ruleValueTestOperator5748); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueTestOperator


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3270:1: ruleValueType returns [Enumerator current=null] : ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3274:6: ( ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3275:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3275:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt33=1;
                }
                break;
            case 46:
                {
                alt33=2;
                }
                break;
            case 47:
                {
                alt33=3;
                }
                break;
            case 48:
                {
                alt33=4;
                }
                break;
            case 49:
                {
                alt33=5;
                }
                break;
            case 50:
                {
                alt33=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3275:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3275:2: ( 'pure' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3275:2: ( 'pure' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3275:4: 'pure'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleValueType5790); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3281:6: ( 'bool' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3281:6: ( 'bool' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3281:8: 'bool'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleValueType5805); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3287:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3287:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3287:8: 'unsigned'
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleValueType5820); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3293:6: ( 'int' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3293:6: ( 'int' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3293:8: 'int'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleValueType5835); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3299:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3299:6: ( 'float' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3299:8: 'float'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleValueType5850); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3305:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3305:6: ( 'host' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3305:8: 'host'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleValueType5865); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueType


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3315:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3319:6: ( ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3320:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3320:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt34=1;
                }
                break;
            case 39:
                {
                alt34=2;
                }
                break;
            case 41:
                {
                alt34=3;
                }
                break;
            case 52:
                {
                alt34=4;
                }
                break;
            case 53:
                {
                alt34=5;
                }
                break;
            case 36:
                {
                alt34=6;
                }
                break;
            case 37:
                {
                alt34=7;
                }
                break;
            case 50:
                {
                alt34=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3320:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3320:2: ( 'none' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3320:2: ( 'none' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3320:4: 'none'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleCombineOperator5908); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3326:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3326:6: ( '+' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3326:8: '+'
                    {
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleCombineOperator5923); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3332:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3332:6: ( '*' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3332:8: '*'
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleCombineOperator5938); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3338:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3338:6: ( 'max' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3338:8: 'max'
                    {
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleCombineOperator5953); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3344:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3344:6: ( 'min' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3344:8: 'min'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleCombineOperator5968); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3350:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3350:6: ( 'or' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3350:8: 'or'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleCombineOperator5983); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3356:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3356:6: ( 'and' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3356:8: 'and'
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleCombineOperator5998); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3362:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3362:6: ( 'host' )
                    // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:3362:8: 'host'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleCombineOperator6013); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCombineOperator

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:148:2: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:148:2: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred2266);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:2: ( ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:434:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:435:2: ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred5789);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:446:1: ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:446:2: () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:446:2: ()
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:447:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:465:2: ( ( ruleCompareOperator ) )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:466:1: ( ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:466:1: ( ruleCompareOperator )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:467:3: ruleCompareOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred5822);
        ruleCompareOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:489:2: ( ( ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:490:1: ( ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:490:1: ( ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:491:3: ruleNotOrValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred5843);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:550:2: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:550:2: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred6971);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.core.expressions/src-gen/de/cau/cs/kieler/core/expressions/parser/antlr/internal/InternalExpressions.g:1446:8: '(' ruleValuedExpression ')'
        {
        match(input,15,FollowSets000.FOLLOW_15_in_synpred192516); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred192541);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,16,FollowSets000.FOLLOW_16_in_synpred192550); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred19

    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred19() {
        backtracking++;
        int start = input.mark();
        try {
            synpred19_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\u03cf\uffff";
    static final String DFA2_eofS =
        "\2\uffff\2\31\10\uffff\2\31\1\uffff\1\31\2\uffff\2\31\11\uffff\1"+
        "\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\10\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\2\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\3\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\4\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\5\uffff\1\31\6\uffff\2\31\5\uffff\1\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\5\uffff\1\31\3\uffff"+
        "\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\2\uffff"+
        "\1\31\3\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\2\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\3\uffff"+
        "\1\31\3\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\2\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\3\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\4\uffff\1\31\3\uffff"+
        "\2\31\2\uffff\2\31\6\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\6\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\5\uffff\1\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\6\uffff\2\31\2\uffff\2\31\5\uffff\1\31\3\uffff\2\31\2\uffff"+
        "\2\31\5\uffff\1\31\3\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\2\uffff\1\31\3\uffff\2\31\2\uffff\2\31\5\uffff"+
        "\1\31\3\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\2\uffff\1\31\3\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\2\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\3\uffff\1\31\3\uffff\2\31\2\uffff\2\31\6\uffff\2\31\6\uffff"+
        "\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff"+
        "\2\31\6\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\6\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\2\uffff\2\31\2\uffff"+
        "\2\31\5\uffff\1\31\3\uffff\2\31\2\uffff\2\31\2\uffff\2\31\5\uffff"+
        "\1\31\3\uffff\2\31\2\uffff\2\31\5\uffff\1\31\3\uffff\2\31\5\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\2\uffff\1\31\3\uffff"+
        "\2\31\2\uffff\2\31\6\uffff\2\31\6\uffff\2\31\6\uffff\2\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\2\uffff"+
        "\2\31\2\uffff\2\31\2\uffff\2\31\5\uffff\1\31\3\uffff\2\31\2\uffff"+
        "\2\31\6\uffff\2\31";
    static final String DFA2_minS =
        "\2\4\2\22\2\0\1\17\1\4\2\0\1\uffff\1\0\2\22\1\0\1\22\1\17\1\4\1"+
        "\22\1\17\5\4\1\uffff\1\4\1\0\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4"+
        "\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22"+
        "\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22"+
        "\1\0\1\22\1\17\1\4\1\22\2\17\1\4\1\20\1\17\1\4\2\20\1\4\1\22\1\4"+
        "\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\2\4\1\22\1\4\1\0\2\22\1\0"+
        "\1\22\1\17\1\4\1\22\1\17\3\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4"+
        "\1\22\1\17\4\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\5\4"+
        "\1\22\1\4\1\0\1\20\2\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\2\22"+
        "\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22"+
        "\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20"+
        "\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22"+
        "\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20"+
        "\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22"+
        "\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22"+
        "\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20"+
        "\1\4\1\22\1\4\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\1\0\2\22"+
        "\1\0\1\22\1\17\1\4\1\22\1\17\2\4\1\22\1\4\1\0\1\20\2\22\1\17\1\4"+
        "\2\20\1\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\2\4\1\22"+
        "\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\3\4\1\22\1\4\1\0\1\20"+
        "\2\22\1\17\1\4\2\20\1\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22"+
        "\1\17\2\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\3\4\1\22"+
        "\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\4\4\1\22\1\4\1\0\1\20"+
        "\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20\1"+
        "\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20\1\0\1\20\2"+
        "\22\1\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17"+
        "\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22"+
        "\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20"+
        "\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20\1\4\1\22"+
        "\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4"+
        "\1\22\2\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17"+
        "\1\4\2\22\1\0\1\22\1\17\1\4\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4"+
        "\1\22\2\17\1\4\2\20\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1"+
        "\4\1\22\1\4\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1"+
        "\4\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\1\0\2\22\1\0\1\22\1"+
        "\17\1\4\1\22\1\17\2\4\1\22\1\4\1\0\1\20\2\22\1\0\1\20\2\22\1\17"+
        "\1\4\2\20\1\4\1\22\1\4\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4"+
        "\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\2\4\1\22\1\4\1\0\1\20\2\22"+
        "\1\17\1\4\2\20\1\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17"+
        "\2\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1\22\1\17\3\4\1\22\1\4"+
        "\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1\0\1\20\2\22\1\17\1"+
        "\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1"+
        "\17\1\4\1\22\2\17\1\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20\1\0\1\20"+
        "\2\22\1\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17"+
        "\1\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22"+
        "\1\17\1\4\1\22\2\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4"+
        "\1\22\1\17\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17\1\4\2\20\1\0\1\20"+
        "\2\22\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\1\0"+
        "\1\20\2\22\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1"+
        "\4\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\1\0\1"+
        "\20\2\22\1\17\1\4\2\20\1\4\1\22\1\4\1\0\2\22\1\0\1\22\1\17\1\4\1"+
        "\22\1\17\2\4\1\22\1\4\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4\2\20"+
        "\1\0\1\20\2\22\1\17\1\4\2\20\1\0\1\20\2\22\1\17\1\4\2\20\1\0\1\20"+
        "\2\22\1\17\1\4\2\20\1\4\1\22\1\4\2\22\1\0\1\22\1\17\1\4\1\22\2\17"+
        "\1\4\2\20\1\0\1\20\2\22\1\0\1\20\2\22\1\0\1\20\2\22\1\0\1\20\2\22"+
        "\1\17\1\4\2\20\1\4\1\22\1\4\1\0\1\20\2\22\1\0\1\20\2\22\1\17\1\4"+
        "\2\20\1\0\1\20\2\22";
    static final String DFA2_maxS =
        "\2\54\2\53\2\0\1\17\1\4\2\0\1\uffff\1\0\2\53\1\0\1\53\1\17\1\4\2"+
        "\53\5\54\1\uffff\1\54\1\0\1\54\1\53\1\4\2\53\1\0\1\53\1\17\1\4\2"+
        "\53\1\54\2\52\1\0\1\52\1\17\1\4\2\52\1\54\2\53\1\0\1\53\1\17\1\4"+
        "\2\53\1\54\2\53\1\0\1\53\1\17\1\4\2\53\1\54\2\53\1\0\1\53\1\17\1"+
        "\4\2\53\1\17\1\4\1\20\1\17\1\4\2\20\1\54\1\53\1\4\1\0\2\52\1\0\1"+
        "\52\1\17\1\4\2\52\2\54\1\52\1\4\1\0\2\53\1\0\1\53\1\17\1\4\2\53"+
        "\3\54\1\53\1\4\1\0\2\53\1\0\1\53\1\17\1\4\2\53\4\54\1\53\1\4\1\0"+
        "\2\53\1\0\1\53\1\17\1\4\2\53\5\54\1\53\1\4\1\0\1\20\2\0\1\20\2\53"+
        "\1\17\1\4\2\20\1\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1\17\1"+
        "\4\2\20\1\54\1\53\1\4\2\53\1\0\1\53\1\17\1\4\2\53\1\54\2\52\1\0"+
        "\1\52\1\17\1\4\2\52\1\17\1\4\2\20\1\54\1\53\1\4\2\53\1\0\1\53\1"+
        "\17\1\4\2\53\1\54\2\52\1\0\1\52\1\17\1\4\2\52\1\54\2\53\1\0\1\53"+
        "\1\17\1\4\2\53\1\17\1\4\2\20\1\54\1\53\1\4\2\53\1\0\1\53\1\17\1"+
        "\4\2\53\1\54\2\52\1\0\1\52\1\17\1\4\2\52\1\54\2\53\1\0\1\53\1\17"+
        "\1\4\2\53\1\54\2\53\1\0\1\53\1\17\1\4\2\53\1\17\1\4\2\20\1\0\1\20"+
        "\2\53\1\17\1\4\2\20\1\54\1\51\1\4\1\0\1\20\2\52\1\17\1\4\2\20\1"+
        "\54\1\53\1\4\1\0\2\52\1\0\1\52\1\17\1\4\2\52\2\54\1\52\1\4\1\0\1"+
        "\20\2\53\1\17\1\4\2\20\1\54\1\53\1\4\1\0\2\52\1\0\1\52\1\17\1\4"+
        "\2\52\2\54\1\52\1\4\1\0\2\53\1\0\1\53\1\17\1\4\2\53\3\54\1\53\1"+
        "\4\1\0\1\20\2\53\1\17\1\4\2\20\1\54\1\53\1\4\1\0\2\52\1\0\1\52\1"+
        "\17\1\4\2\52\2\54\1\52\1\4\1\0\2\53\1\0\1\53\1\17\1\4\2\53\3\54"+
        "\1\53\1\4\1\0\2\53\1\0\1\53\1\17\1\4\2\53\4\54\1\53\1\4\1\0\1\20"+
        "\2\53\1\0\1\20\2\52\1\17\1\4\2\20\1\0\1\20\2\53\1\17\1\4\2\20\1"+
        "\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1\17\1\4\2\20\1\0\1\20"+
        "\2\53\1\17\1\4\2\20\1\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1"+
        "\17\1\4\2\20\1\54\1\53\1\4\2\53\1\0\1\53\1\17\1\4\2\53\1\54\2\52"+
        "\1\0\1\52\1\17\1\4\2\52\1\17\1\4\2\20\1\0\1\20\2\53\1\17\1\4\2\20"+
        "\1\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1\17\1\4\2\20\1\54\1"+
        "\53\1\4\2\53\1\0\1\53\1\17\1\4\2\53\1\54\2\52\1\0\1\52\1\17\1\4"+
        "\2\52\1\17\1\4\2\20\1\54\1\53\1\4\2\53\1\0\1\53\1\17\1\4\2\53\1"+
        "\54\2\52\1\0\1\52\1\17\1\4\2\52\1\54\2\53\1\0\1\53\1\17\1\4\2\53"+
        "\1\17\1\4\2\20\1\0\1\20\2\51\1\0\1\20\2\53\1\17\1\4\2\20\1\54\1"+
        "\51\1\4\1\0\1\20\2\52\1\0\1\20\2\53\1\17\1\4\2\20\1\54\1\51\1\4"+
        "\1\0\1\20\2\52\1\17\1\4\2\20\1\54\1\53\1\4\1\0\2\52\1\0\1\52\1\17"+
        "\1\4\2\52\2\54\1\52\1\4\1\0\1\20\2\53\1\0\1\20\2\53\1\17\1\4\2\20"+
        "\1\54\1\51\1\4\1\0\1\20\2\52\1\17\1\4\2\20\1\54\1\53\1\4\1\0\2\52"+
        "\1\0\1\52\1\17\1\4\2\52\2\54\1\52\1\4\1\0\1\20\2\53\1\17\1\4\2\20"+
        "\1\54\1\53\1\4\1\0\2\52\1\0\1\52\1\17\1\4\2\52\2\54\1\52\1\4\1\0"+
        "\2\53\1\0\1\53\1\17\1\4\2\53\3\54\1\53\1\4\1\0\1\20\2\53\1\0\1\20"+
        "\2\52\1\17\1\4\2\20\1\0\1\20\2\52\1\17\1\4\2\20\1\0\1\20\2\53\1"+
        "\17\1\4\2\20\1\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1\17\1\4"+
        "\2\20\1\0\1\20\2\52\1\17\1\4\2\20\1\0\1\20\2\53\1\17\1\4\2\20\1"+
        "\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1\17\1\4\2\20\1\0\1\20"+
        "\2\53\1\17\1\4\2\20\1\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1"+
        "\17\1\4\2\20\1\54\1\53\1\4\2\53\1\0\1\53\1\17\1\4\2\53\1\54\2\52"+
        "\1\0\1\52\1\17\1\4\2\52\1\17\1\4\2\20\1\0\1\20\2\51\1\0\1\20\2\51"+
        "\1\0\1\20\2\53\1\17\1\4\2\20\1\54\1\51\1\4\1\0\1\20\2\52\1\0\1\20"+
        "\2\51\1\0\1\20\2\53\1\17\1\4\2\20\1\54\1\51\1\4\1\0\1\20\2\52\1"+
        "\0\1\20\2\53\1\17\1\4\2\20\1\54\1\51\1\4\1\0\1\20\2\52\1\17\1\4"+
        "\2\20\1\54\1\53\1\4\1\0\2\52\1\0\1\52\1\17\1\4\2\52\2\54\1\52\1"+
        "\4\1\0\1\20\2\53\1\0\1\20\2\52\1\17\1\4\2\20\1\0\1\20\2\52\1\17"+
        "\1\4\2\20\1\0\1\20\2\52\1\17\1\4\2\20\1\0\1\20\2\53\1\17\1\4\2\20"+
        "\1\54\1\52\1\4\2\51\1\0\1\51\1\17\1\4\2\51\1\17\1\4\2\20\1\0\1\20"+
        "\2\51\1\0\1\20\2\51\1\0\1\20\2\51\1\0\1\20\2\53\1\17\1\4\2\20\1"+
        "\54\1\51\1\4\1\0\1\20\2\52\1\0\1\20\2\52\1\17\1\4\2\20\1\0\1\20"+
        "\2\51";
    static final String DFA2_acceptS =
        "\12\uffff\1\1\16\uffff\1\2\u03b5\uffff";
    static final String DFA2_specialS =
        "\4\uffff\1\70\1\15\2\uffff\1\16\1\51\1\uffff\1\11\2\uffff\1\77\14"+
        "\uffff\1\53\5\uffff\1\40\10\uffff\1\41\10\uffff\1\76\10\uffff\1"+
        "\75\10\uffff\1\74\17\uffff\1\23\2\uffff\1\0\11\uffff\1\12\2\uffff"+
        "\1\42\12\uffff\1\13\2\uffff\1\43\13\uffff\1\14\2\uffff\1\44\14\uffff"+
        "\1\52\1\uffff\1\54\1\137\14\uffff\1\1\16\uffff\1\64\10\uffff\1\45"+
        "\16\uffff\1\63\10\uffff\1\37\10\uffff\1\73\16\uffff\1\62\10\uffff"+
        "\1\36\10\uffff\1\72\10\uffff\1\71\11\uffff\1\136\12\uffff\1\135"+
        "\12\uffff\1\22\2\uffff\1\35\11\uffff\1\134\12\uffff\1\21\2\uffff"+
        "\1\34\11\uffff\1\10\2\uffff\1\61\12\uffff\1\133\12\uffff\1\20\2"+
        "\uffff\1\33\11\uffff\1\7\2\uffff\1\60\12\uffff\1\6\2\uffff\1\57"+
        "\13\uffff\1\140\3\uffff\1\141\7\uffff\1\142\14\uffff\1\2\11\uffff"+
        "\1\143\14\uffff\1\3\16\uffff\1\100\10\uffff\1\101\11\uffff\1\144"+
        "\14\uffff\1\4\16\uffff\1\102\10\uffff\1\103\16\uffff\1\104\10\uffff"+
        "\1\105\10\uffff\1\5\11\uffff\1\145\3\uffff\1\146\12\uffff\1\147"+
        "\3\uffff\1\150\12\uffff\1\151\12\uffff\1\24\2\uffff\1\65\11\uffff"+
        "\1\152\3\uffff\1\153\12\uffff\1\154\12\uffff\1\25\2\uffff\1\66\11"+
        "\uffff\1\155\12\uffff\1\26\2\uffff\1\67\11\uffff\1\27\2\uffff\1"+
        "\46\12\uffff\1\156\3\uffff\1\157\7\uffff\1\160\7\uffff\1\161\14"+
        "\uffff\1\47\11\uffff\1\162\7\uffff\1\163\14\uffff\1\50\11\uffff"+
        "\1\164\14\uffff\1\32\16\uffff\1\56\10\uffff\1\31\11\uffff\1\132"+
        "\3\uffff\1\131\3\uffff\1\130\12\uffff\1\127\3\uffff\1\126\3\uffff"+
        "\1\125\12\uffff\1\124\3\uffff\1\123\12\uffff\1\122\12\uffff\1\17"+
        "\2\uffff\1\30\11\uffff\1\121\3\uffff\1\120\7\uffff\1\117\7\uffff"+
        "\1\116\7\uffff\1\115\14\uffff\1\55\11\uffff\1\114\3\uffff\1\113"+
        "\3\uffff\1\112\3\uffff\1\111\12\uffff\1\110\3\uffff\1\107\7\uffff"+
        "\1\106\3\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\1\11\1\2\1\3\1\5\6\uffff\1\4\23\uffff\1\6\2\uffff\1\12"+
            "\1\uffff\1\1\3\uffff\1\7",
            "\1\22\1\23\1\14\1\15\1\17\6\uffff\1\16\23\uffff\1\20\4\uffff"+
            "\1\13\3\uffff\1\21",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\uffff",
            "\1\uffff",
            "\1\32",
            "\1\33",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\34",
            "\1\35",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\36\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24\1\25",
            "\1\45\1\46\1\37\1\40\1\42\6\uffff\1\41\23\uffff\1\43\10\uffff"+
            "\1\44",
            "\1\56\1\57\1\50\1\51\1\53\6\uffff\1\52\23\uffff\1\54\4\uffff"+
            "\1\47\3\uffff\1\55",
            "\1\67\1\70\1\61\1\62\1\64\6\uffff\1\63\23\uffff\1\65\4\uffff"+
            "\1\60\3\uffff\1\66",
            "\1\100\1\101\1\72\1\73\1\75\6\uffff\1\74\23\uffff\1\76\4\uffff"+
            "\1\71\3\uffff\1\77",
            "\1\111\1\112\1\103\1\104\1\106\6\uffff\1\105\23\uffff\1\107"+
            "\4\uffff\1\102\3\uffff\1\110",
            "",
            "\1\115\36\uffff\1\113\10\uffff\1\114",
            "\1\uffff",
            "\1\120\36\uffff\1\116\10\uffff\1\117",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\121",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\122",
            "\1\123",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\124\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\uffff\1\25",
            "\1\134\1\135\1\126\1\127\1\131\6\uffff\1\130\23\uffff\1\132"+
            "\4\uffff\1\125\3\uffff\1\133",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\137",
            "\1\140",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\141\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\151\1\152\1\143\1\144\1\146\6\uffff\1\145\23\uffff\1\147"+
            "\4\uffff\1\142\3\uffff\1\150",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\157\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153\1\154",
            "\1\167\1\170\1\161\1\162\1\164\6\uffff\1\163\23\uffff\1\165"+
            "\4\uffff\1\160\3\uffff\1\166",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\174",
            "\1\175",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\176\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171\1\172",
            "\1\u0086\1\u0087\1\u0080\1\u0081\1\u0083\6\uffff\1\u0082\23"+
            "\uffff\1\u0084\4\uffff\1\177\3\uffff\1\u0085",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u008c",
            "\1\u008d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u008e\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088\1\u0089",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0098\36\uffff\1\u0096\10\uffff\1\u0097",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\u0099",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\u009a",
            "\1\u009b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\u009c\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26\1\136",
            "\1\u00a3\1\u00a4\1\u009d\1\u009e\1\u00a0\6\uffff\1\u009f\23"+
            "\uffff\1\u00a1\10\uffff\1\u00a2",
            "\1\u00a7\36\uffff\1\u00a5\10\uffff\1\u00a6",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\u00a8",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\u00a9",
            "\1\u00aa",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\u00ab\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26\1\153\1\154",
            "\1\u00b2\1\u00b3\1\u00ac\1\u00ad\1\u00af\6\uffff\1\u00ae\23"+
            "\uffff\1\u00b0\10\uffff\1\u00b1",
            "\1\u00bb\1\u00bc\1\u00b5\1\u00b6\1\u00b8\6\uffff\1\u00b7\23"+
            "\uffff\1\u00b9\4\uffff\1\u00b4\3\uffff\1\u00ba",
            "\1\u00bf\36\uffff\1\u00bd\10\uffff\1\u00be",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\u00c0",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\u00c1",
            "\1\u00c2",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\u00c3\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\171\1\172",
            "\1\u00ca\1\u00cb\1\u00c4\1\u00c5\1\u00c7\6\uffff\1\u00c6\23"+
            "\uffff\1\u00c8\10\uffff\1\u00c9",
            "\1\u00d3\1\u00d4\1\u00cd\1\u00ce\1\u00d0\6\uffff\1\u00cf\23"+
            "\uffff\1\u00d1\4\uffff\1\u00cc\3\uffff\1\u00d2",
            "\1\u00dc\1\u00dd\1\u00d6\1\u00d7\1\u00d9\6\uffff\1\u00d8\23"+
            "\uffff\1\u00da\4\uffff\1\u00d5\3\uffff\1\u00db",
            "\1\u00e0\36\uffff\1\u00de\10\uffff\1\u00df",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\u00e1",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u00e2",
            "\1\u00e3",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u00e4\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088\1\u0089",
            "\1\u00eb\1\u00ec\1\u00e5\1\u00e6\1\u00e8\6\uffff\1\u00e7\23"+
            "\uffff\1\u00e9\10\uffff\1\u00ea",
            "\1\u00f4\1\u00f5\1\u00ee\1\u00ef\1\u00f1\6\uffff\1\u00f0\23"+
            "\uffff\1\u00f2\4\uffff\1\u00ed\3\uffff\1\u00f3",
            "\1\u00fd\1\u00fe\1\u00f7\1\u00f8\1\u00fa\6\uffff\1\u00f9\23"+
            "\uffff\1\u00fb\4\uffff\1\u00f6\3\uffff\1\u00fc",
            "\1\u0106\1\u0107\1\u0100\1\u0101\1\u0103\6\uffff\1\u0102\23"+
            "\uffff\1\u0104\4\uffff\1\u00ff\3\uffff\1\u0105",
            "\1\u010a\36\uffff\1\u0108\10\uffff\1\u0109",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u010b",
            "\1\uffff",
            "\1\u0091",
            "\1\uffff",
            "\1\uffff",
            "\1\u0094",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\24"+
            "\1\25",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0112\36\uffff\1\u0110\10\uffff\1\u0111",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\u0113",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\u0114",
            "\1\u0115",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\u0116\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011d\36\uffff\1\u011b\10\uffff\1\u011c",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\u011e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\u011f",
            "\1\u0120",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\u0121\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26\1\uffff\1\154",
            "\1\u0129\1\u012a\1\u0123\1\u0124\1\u0126\6\uffff\1\u0125\23"+
            "\uffff\1\u0127\4\uffff\1\u0122\3\uffff\1\u0128",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u012e\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26\1\u012b",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0135\36\uffff\1\u0133\10\uffff\1\u0134",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\u0136",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\u0137",
            "\1\u0138",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\u0139\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\uffff\1\172",
            "\1\u0141\1\u0142\1\u013b\1\u013c\1\u013e\6\uffff\1\u013d\23"+
            "\uffff\1\u013f\4\uffff\1\u013a\3\uffff\1\u0140",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u0146\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0143",
            "\1\u014e\1\u014f\1\u0148\1\u0149\1\u014b\6\uffff\1\u014a\23"+
            "\uffff\1\u014c\4\uffff\1\u0147\3\uffff\1\u014d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u0154\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150\1\u0151",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u015b\36\uffff\1\u0159\10\uffff\1\u015a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u015c",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\u015d",
            "\1\u015e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\u015f\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\uffff\1\u0089",
            "\1\u0167\1\u0168\1\u0161\1\u0162\1\u0164\6\uffff\1\u0163\23"+
            "\uffff\1\u0165\4\uffff\1\u0160\3\uffff\1\u0166",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u016c\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0169",
            "\1\u0174\1\u0175\1\u016e\1\u016f\1\u0171\6\uffff\1\u0170\23"+
            "\uffff\1\u0172\4\uffff\1\u016d\3\uffff\1\u0173",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u017a\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176\1\u0177",
            "\1\u0182\1\u0183\1\u017c\1\u017d\1\u017f\6\uffff\1\u017e\23"+
            "\uffff\1\u0180\4\uffff\1\u017b\3\uffff\1\u0181",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u0187",
            "\1\u0188",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u0189\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184\1\u0185",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\uffff",
            "\1\u010e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\25",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0194\36\uffff\1\u0192\10\uffff\1\u0193",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\u0195",
            "\1\uffff",
            "\1\u0119",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019c\36\uffff\1\u019a\10\uffff\1\u019b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\u019d",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u019e",
            "\1\u019f",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u01a0\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26\1\u012b",
            "\1\u01a7\1\u01a8\1\u01a1\1\u01a2\1\u01a4\6\uffff\1\u01a3\23"+
            "\uffff\1\u01a5\10\uffff\1\u01a6",
            "\1\u01ab\36\uffff\1\u01a9\10\uffff\1\u01aa",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u01ac",
            "\1\uffff",
            "\1\u0131",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b3\36\uffff\1\u01b1\10\uffff\1\u01b2",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\u01b4",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u01b5",
            "\1\u01b6",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u01b7\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0143",
            "\1\u01be\1\u01bf\1\u01b8\1\u01b9\1\u01bb\6\uffff\1\u01ba\23"+
            "\uffff\1\u01bc\10\uffff\1\u01bd",
            "\1\u01c2\36\uffff\1\u01c0\10\uffff\1\u01c1",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u01c3",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u01c4",
            "\1\u01c5",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u01c6\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150\1\u0151",
            "\1\u01cd\1\u01ce\1\u01c7\1\u01c8\1\u01ca\6\uffff\1\u01c9\23"+
            "\uffff\1\u01cb\10\uffff\1\u01cc",
            "\1\u01d6\1\u01d7\1\u01d0\1\u01d1\1\u01d3\6\uffff\1\u01d2\23"+
            "\uffff\1\u01d4\4\uffff\1\u01cf\3\uffff\1\u01d5",
            "\1\u01da\36\uffff\1\u01d8\10\uffff\1\u01d9",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u01db",
            "\1\uffff",
            "\1\u0157",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e2\36\uffff\1\u01e0\10\uffff\1\u01e1",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\u01e3",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u01e4",
            "\1\u01e5",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u01e6\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0169",
            "\1\u01ed\1\u01ee\1\u01e7\1\u01e8\1\u01ea\6\uffff\1\u01e9\23"+
            "\uffff\1\u01eb\10\uffff\1\u01ec",
            "\1\u01f1\36\uffff\1\u01ef\10\uffff\1\u01f0",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u01f2",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u01f3",
            "\1\u01f4",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u01f5\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176\1\u0177",
            "\1\u01fc\1\u01fd\1\u01f6\1\u01f7\1\u01f9\6\uffff\1\u01f8\23"+
            "\uffff\1\u01fa\10\uffff\1\u01fb",
            "\1\u0205\1\u0206\1\u01ff\1\u0200\1\u0202\6\uffff\1\u0201\23"+
            "\uffff\1\u0203\4\uffff\1\u01fe\3\uffff\1\u0204",
            "\1\u0209\36\uffff\1\u0207\10\uffff\1\u0208",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u020a",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u020b",
            "\1\u020c",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u020d\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184\1\u0185",
            "\1\u0214\1\u0215\1\u020e\1\u020f\1\u0211\6\uffff\1\u0210\23"+
            "\uffff\1\u0212\10\uffff\1\u0213",
            "\1\u021d\1\u021e\1\u0217\1\u0218\1\u021a\6\uffff\1\u0219\23"+
            "\uffff\1\u021b\4\uffff\1\u0216\3\uffff\1\u021c",
            "\1\u0226\1\u0227\1\u0220\1\u0221\1\u0223\6\uffff\1\u0222\23"+
            "\uffff\1\u0224\4\uffff\1\u021f\3\uffff\1\u0225",
            "\1\u022a\36\uffff\1\u0228\10\uffff\1\u0229",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u022b",
            "\1\uffff",
            "\1\u018c",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\uffff",
            "\1\u0190",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\136",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\uffff",
            "\1\u0198",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\153"+
            "\1\154",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0236\36\uffff\1\u0234\10\uffff\1\u0235",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u0237",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\u0238",
            "\1\u0239",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\u023a\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\26",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\uffff",
            "\1\u01af",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\171"+
            "\1\172",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0245\36\uffff\1\u0243\10\uffff\1\u0244",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u0246",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\u0247",
            "\1\u0248",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\u0249\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u0250\36\uffff\1\u024e\10\uffff\1\u024f",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u0251",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\u0252",
            "\1\u0253",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\u0254\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\uffff\1\u0151",
            "\1\u025c\1\u025d\1\u0256\1\u0257\1\u0259\6\uffff\1\u0258\23"+
            "\uffff\1\u025a\4\uffff\1\u0255\3\uffff\1\u025b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u0261\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u025e",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\uffff",
            "\1\u01de",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0088\1\u0089",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026c\36\uffff\1\u026a\10\uffff\1\u026b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u026d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\u026e",
            "\1\u026f",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\u0270\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0277\36\uffff\1\u0275\10\uffff\1\u0276",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u0278",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\u0279",
            "\1\u027a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\u027b\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\uffff\1\u0177",
            "\1\u0283\1\u0284\1\u027d\1\u027e\1\u0280\6\uffff\1\u027f\23"+
            "\uffff\1\u0281\4\uffff\1\u027c\3\uffff\1\u0282",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u0288\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0285",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028f\36\uffff\1\u028d\10\uffff\1\u028e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u0290",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\u0291",
            "\1\u0292",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\u0293\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\uffff\1\u0185",
            "\1\u029b\1\u029c\1\u0295\1\u0296\1\u0298\6\uffff\1\u0297\23"+
            "\uffff\1\u0299\4\uffff\1\u0294\3\uffff\1\u029a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u02a0\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u029d",
            "\1\u02a8\1\u02a9\1\u02a2\1\u02a3\1\u02a5\6\uffff\1\u02a4\23"+
            "\uffff\1\u02a6\4\uffff\1\u02a1\3\uffff\1\u02a7",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u02ae\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa\1\u02ab",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\uffff",
            "\1\u022e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\uffff",
            "\1\u0232",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\uffff"+
            "\1\154",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b9\36\uffff\1\u02b7\10\uffff\1\u02b8",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\u02ba",
            "\1\uffff",
            "\1\u023d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\uffff",
            "\1\u0241",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\172",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02c1\36\uffff\1\u02bf\10\uffff\1\u02c0",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\u02c2",
            "\1\uffff",
            "\1\u024c",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c9\36\uffff\1\u02c7\10\uffff\1\u02c8",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\u02ca",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u02cb",
            "\1\u02cc",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u02cd\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u025e",
            "\1\u02d4\1\u02d5\1\u02ce\1\u02cf\1\u02d1\6\uffff\1\u02d0\23"+
            "\uffff\1\u02d2\10\uffff\1\u02d3",
            "\1\u02d8\36\uffff\1\u02d6\10\uffff\1\u02d7",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u02d9",
            "\1\uffff",
            "\1\u0264",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\uffff",
            "\1\u0268",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0089",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02e0\36\uffff\1\u02de\10\uffff\1\u02df",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\u02e1",
            "\1\uffff",
            "\1\u0273",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e8\36\uffff\1\u02e6\10\uffff\1\u02e7",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\u02e9",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u02ea",
            "\1\u02eb",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u02ec\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0285",
            "\1\u02f3\1\u02f4\1\u02ed\1\u02ee\1\u02f0\6\uffff\1\u02ef\23"+
            "\uffff\1\u02f1\10\uffff\1\u02f2",
            "\1\u02f7\36\uffff\1\u02f5\10\uffff\1\u02f6",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u02f8",
            "\1\uffff",
            "\1\u028b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02ff\36\uffff\1\u02fd\10\uffff\1\u02fe",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\u0300",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u0301",
            "\1\u0302",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u0303\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u029d",
            "\1\u030a\1\u030b\1\u0304\1\u0305\1\u0307\6\uffff\1\u0306\23"+
            "\uffff\1\u0308\10\uffff\1\u0309",
            "\1\u030e\36\uffff\1\u030c\10\uffff\1\u030d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u030f",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u0310",
            "\1\u0311",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u0312\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa\1\u02ab",
            "\1\u0319\1\u031a\1\u0313\1\u0314\1\u0316\6\uffff\1\u0315\23"+
            "\uffff\1\u0317\10\uffff\1\u0318",
            "\1\u0322\1\u0323\1\u031c\1\u031d\1\u031f\6\uffff\1\u031e\23"+
            "\uffff\1\u0320\4\uffff\1\u031b\3\uffff\1\u0321",
            "\1\u0326\36\uffff\1\u0324\10\uffff\1\u0325",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u0327",
            "\1\uffff",
            "\1\u02b1",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\uffff",
            "\1\u02b5",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26\1\u012b",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\uffff",
            "\1\u02bd",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0143",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\uffff",
            "\1\u02c5",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u0150"+
            "\1\u0151",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0336\36\uffff\1\u0334\10\uffff\1\u0335",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u0337",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\u0338",
            "\1\u0339",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\u033a\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\uffff",
            "\1\u02dc",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0169",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\uffff",
            "\1\u02e4",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0176\1\u0177",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0349\36\uffff\1\u0347\10\uffff\1\u0348",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u034a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\u034b",
            "\1\u034c",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\u034d\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\uffff",
            "\1\u02fb",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0184\1\u0185",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0358\36\uffff\1\u0356\10\uffff\1\u0357",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u0359",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\u035a",
            "\1\u035b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\u035c\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0363\36\uffff\1\u0361\10\uffff\1\u0362",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u0364",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\u0365",
            "\1\u0366",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\u0367\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\uffff\1\u02ab",
            "\1\u036f\1\u0370\1\u0369\1\u036a\1\u036c\6\uffff\1\u036b\23"+
            "\uffff\1\u036d\4\uffff\1\u0368\3\uffff\1\u036e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u0374\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0371",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\uffff",
            "\1\u032a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\26",
            "\1\uffff",
            "\1\u032e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\uffff",
            "\1\u0332",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\uffff"+
            "\1\u0151",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037f\36\uffff\1\u037d\10\uffff\1\u037e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\u0380",
            "\1\uffff",
            "\1\u033d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\uffff",
            "\1\u0341",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\uffff",
            "\1\u0345",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\uffff\1\u0177",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0387\36\uffff\1\u0385\10\uffff\1\u0386",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\u0388",
            "\1\uffff",
            "\1\u0350",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\uffff",
            "\1\u0354",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u0185",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038f\36\uffff\1\u038d\10\uffff\1\u038e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\u0390",
            "\1\uffff",
            "\1\u035f",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0397\36\uffff\1\u0395\10\uffff\1\u0396",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\u0398",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u0399",
            "\1\u039a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u039b\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0371",
            "\1\u03a2\1\u03a3\1\u039c\1\u039d\1\u039f\6\uffff\1\u039e\23"+
            "\uffff\1\u03a0\10\uffff\1\u03a1",
            "\1\u03a6\36\uffff\1\u03a4\10\uffff\1\u03a5",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u03a7",
            "\1\uffff",
            "\1\u0377",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\uffff",
            "\1\u037b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173\1\u025e",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\uffff",
            "\1\u0383",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a"+
            "\1\u0285",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\uffff",
            "\1\u038b",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u029d",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "\1\uffff",
            "\1\u0393",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u02aa\1\u02ab",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03ba\36\uffff\1\u03b8\10\uffff\1\u03b9",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u03bb",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\uffff",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\u03bc",
            "\1\u03bd",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\u03be\2\uffff\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "\1\uffff",
            "\1\u03aa",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\27\1\173",
            "\1\uffff",
            "\1\u03ae",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u008a",
            "\1\uffff",
            "\1\u03b2",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\uffff",
            "\1\u03b6",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\uffff\1\u02ab",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c9\36\uffff\1\u03c7\10\uffff\1\u03c8",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\u03ca",
            "\1\uffff",
            "\1\u03c1",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\uffff",
            "\1\u03c5",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"+
            "\1\u0371",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\uffff",
            "\1\u03cd",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186",
            "\1\31\4\uffff\1\31\5\uffff\6\12\4\uffff\1\30\1\u008b\1\u0186"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "147:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_88 = input.LA(1);

                         
                        int index2_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_88);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_159 = input.LA(1);

                         
                        int index2_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_159);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_419 = input.LA(1);

                         
                        int index2_419 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_419);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_442 = input.LA(1);

                         
                        int index2_442 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_442);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_489 = input.LA(1);

                         
                        int index2_489 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_489);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_546 = input.LA(1);

                         
                        int index2_546 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_546);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_379 = input.LA(1);

                         
                        int index2_379 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_379);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_365 = input.LA(1);

                         
                        int index2_365 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_365);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_327 = input.LA(1);

                         
                        int index2_327 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_327);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_11 = input.LA(1);

                         
                        int index2_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_98 = input.LA(1);

                         
                        int index2_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_98);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_112 = input.LA(1);

                         
                        int index2_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_112);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA2_127 = input.LA(1);

                         
                        int index2_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_127);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA2_8 = input.LA(1);

                         
                        int index2_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_8);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA2_872 = input.LA(1);

                         
                        int index2_872 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_872);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA2_352 = input.LA(1);

                         
                        int index2_352 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_352);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA2_314 = input.LA(1);

                         
                        int index2_314 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_314);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA2_290 = input.LA(1);

                         
                        int index2_290 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_290);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA2_85 = input.LA(1);

                         
                        int index2_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_85);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA2_597 = input.LA(1);

                         
                        int index2_597 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_597);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA2_636 = input.LA(1);

                         
                        int index2_636 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_636);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA2_660 = input.LA(1);

                         
                        int index2_660 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_660);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA2_673 = input.LA(1);

                         
                        int index2_673 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_673);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA2_875 = input.LA(1);

                         
                        int index2_875 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_875);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA2_798 = input.LA(1);

                         
                        int index2_798 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_798);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA2_774 = input.LA(1);

                         
                        int index2_774 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_774);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA2_355 = input.LA(1);

                         
                        int index2_355 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_355);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA2_317 = input.LA(1);

                         
                        int index2_317 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_317);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA2_293 = input.LA(1);

                         
                        int index2_293 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_293);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA2_240 = input.LA(1);

                         
                        int index2_240 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_240);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA2_207 = input.LA(1);

                         
                        int index2_207 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_207);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA2_33 = input.LA(1);

                         
                        int index2_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA2_42 = input.LA(1);

                         
                        int index2_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_42);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA2_101 = input.LA(1);

                         
                        int index2_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_101);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA2_115 = input.LA(1);

                         
                        int index2_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_115);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA2_130 = input.LA(1);

                         
                        int index2_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_130);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA2_183 = input.LA(1);

                         
                        int index2_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_183);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA2_676 = input.LA(1);

                         
                        int index2_676 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_676);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA2_720 = input.LA(1);

                         
                        int index2_720 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_720);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA2_751 = input.LA(1);

                         
                        int index2_751 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_751);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_9);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA2_143 = input.LA(1);

                         
                        int index2_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_143);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA2_27 = input.LA(1);

                         
                        int index2_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_27);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA2_145 = input.LA(1);

                         
                        int index2_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_145);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA2_926 = input.LA(1);

                         
                        int index2_926 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_926);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA2_789 = input.LA(1);

                         
                        int index2_789 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_789);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA2_382 = input.LA(1);

                         
                        int index2_382 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_382);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA2_368 = input.LA(1);

                         
                        int index2_368 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_368);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA2_330 = input.LA(1);

                         
                        int index2_330 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_330);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA2_231 = input.LA(1);

                         
                        int index2_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_231);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA2_198 = input.LA(1);

                         
                        int index2_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_198);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA2_174 = input.LA(1);

                         
                        int index2_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_174);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA2_600 = input.LA(1);

                         
                        int index2_600 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_600);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA2_639 = input.LA(1);

                         
                        int index2_639 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_639);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA2_663 = input.LA(1);

                         
                        int index2_663 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_663);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA2_258 = input.LA(1);

                         
                        int index2_258 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_258);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA2_249 = input.LA(1);

                         
                        int index2_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_249);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA2_216 = input.LA(1);

                         
                        int index2_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_216);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA2_69 = input.LA(1);

                         
                        int index2_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_69);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA2_60 = input.LA(1);

                         
                        int index2_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_60);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA2_51 = input.LA(1);

                         
                        int index2_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_51);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA2_14 = input.LA(1);

                         
                        int index2_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_14);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA2_457 = input.LA(1);

                         
                        int index2_457 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_457);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA2_466 = input.LA(1);

                         
                        int index2_466 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_466);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA2_504 = input.LA(1);

                         
                        int index2_504 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_504);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA2_513 = input.LA(1);

                         
                        int index2_513 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_513);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA2_528 = input.LA(1);

                         
                        int index2_528 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_528);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA2_537 = input.LA(1);

                         
                        int index2_537 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_537);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA2_971 = input.LA(1);

                         
                        int index2_971 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_971);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA2_963 = input.LA(1);

                         
                        int index2_963 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_963);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA2_959 = input.LA(1);

                         
                        int index2_959 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_959);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA2_948 = input.LA(1);

                         
                        int index2_948 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_948);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA2_944 = input.LA(1);

                         
                        int index2_944 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_944);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA2_940 = input.LA(1);

                         
                        int index2_940 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_940);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA2_936 = input.LA(1);

                         
                        int index2_936 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_936);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA2_913 = input.LA(1);

                         
                        int index2_913 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_913);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA2_905 = input.LA(1);

                         
                        int index2_905 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_905);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA2_897 = input.LA(1);

                         
                        int index2_897 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_897);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA2_889 = input.LA(1);

                         
                        int index2_889 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_889);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA2_885 = input.LA(1);

                         
                        int index2_885 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_885);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA2_861 = input.LA(1);

                         
                        int index2_861 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_861);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA2_850 = input.LA(1);

                         
                        int index2_850 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_850);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA2_846 = input.LA(1);

                         
                        int index2_846 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_846);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA2_835 = input.LA(1);

                         
                        int index2_835 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_835);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA2_831 = input.LA(1);

                         
                        int index2_831 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_831);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA2_827 = input.LA(1);

                         
                        int index2_827 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_827);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA2_816 = input.LA(1);

                         
                        int index2_816 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_816);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA2_812 = input.LA(1);

                         
                        int index2_812 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_812);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA2_808 = input.LA(1);

                         
                        int index2_808 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_808);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA2_341 = input.LA(1);

                         
                        int index2_341 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_341);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA2_303 = input.LA(1);

                         
                        int index2_303 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_303);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA2_279 = input.LA(1);

                         
                        int index2_279 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_279);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA2_268 = input.LA(1);

                         
                        int index2_268 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_268);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA2_146 = input.LA(1);

                         
                        int index2_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_146);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA2_394 = input.LA(1);

                         
                        int index2_394 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_394);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA2_398 = input.LA(1);

                         
                        int index2_398 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_398);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA2_406 = input.LA(1);

                         
                        int index2_406 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_406);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA2_429 = input.LA(1);

                         
                        int index2_429 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_429);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA2_476 = input.LA(1);

                         
                        int index2_476 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_476);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA2_556 = input.LA(1);

                         
                        int index2_556 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_556);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA2_560 = input.LA(1);

                         
                        int index2_560 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_560);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA2_571 = input.LA(1);

                         
                        int index2_571 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_571);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA2_575 = input.LA(1);

                         
                        int index2_575 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_575);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA2_586 = input.LA(1);

                         
                        int index2_586 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_586);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA2_610 = input.LA(1);

                         
                        int index2_610 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_610);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA2_614 = input.LA(1);

                         
                        int index2_614 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_614);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA2_625 = input.LA(1);

                         
                        int index2_625 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_625);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA2_649 = input.LA(1);

                         
                        int index2_649 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_649);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA2_687 = input.LA(1);

                         
                        int index2_687 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_687);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA2_691 = input.LA(1);

                         
                        int index2_691 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_691);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA2_699 = input.LA(1);

                         
                        int index2_699 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_699);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA2_707 = input.LA(1);

                         
                        int index2_707 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_707);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA2_730 = input.LA(1);

                         
                        int index2_730 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_730);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA2_738 = input.LA(1);

                         
                        int index2_738 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_738);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA2_761 = input.LA(1);

                         
                        int index2_761 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index2_761);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleRoot141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_ruleRoot171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression484 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression517 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression538 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression636 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression669 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression690 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation728 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation789 = new BitSet(new long[]{0x00000007E0000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation822 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression1105 = new BitSet(new long[]{0x0000104800008130L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1286 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression1346 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression1379 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression1400 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression1438 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression1498 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression1531 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression1552 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression1590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression1650 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression1683 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression1704 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression1742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression1802 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression1835 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression1894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression1954 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression1987 = new BitSet(new long[]{0x00001008000081F0L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression2046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression2115 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression2213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAtomicExpression2309 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression2334 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAtomicExpression2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression2410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAtomicValuedExpression2516 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression2541 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAtomicValuedExpression2550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression2617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression2686 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleValuedObjectTestExpression2696 = new BitSet(new long[]{0x0000100800000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression2717 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleValuedObjectTestExpression2727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression2768 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference2856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression2947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression2999 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleTextExpression3015 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression3032 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTextExpression3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3176 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration3360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration3420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleISignal_in_entryRuleISignal3485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleISignal3495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleISignal3537 = new BitSet(new long[]{0x0000000001808002L});
        public static final BitSet FOLLOW_ruleChannelDescription_in_ruleISignal3563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl3600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceSignalDecl3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleInterfaceSignalDecl3658 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3679 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleInterfaceSignalDecl3690 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3711 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleInterfaceSignalDecl3723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleInterfaceSignalDecl3753 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3774 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleInterfaceSignalDecl3785 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3806 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleInterfaceSignalDecl3818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleInterfaceSignalDecl3848 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3869 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleInterfaceSignalDecl3880 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3901 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleInterfaceSignalDecl3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleInterfaceSignalDecl3943 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3964 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleInterfaceSignalDecl3975 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl3996 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleInterfaceSignalDecl4008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription4045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChannelDescription4055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleChannelDescription4091 = new BitSet(new long[]{0x0007E00004000010L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleChannelDescription4130 = new BitSet(new long[]{0x0007E00004000010L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4151 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleChannelDescription4161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleChannelDescription4179 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleChannelDescription4200 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleChannelDescription4210 = new BitSet(new long[]{0x0007E00004000010L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl4268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceVariableDecl4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInterfaceVariableDecl4313 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl4334 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleInterfaceVariableDecl4345 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl4366 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl4404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl4414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl4460 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_18_in_ruleVariableDecl4471 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl4492 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_23_in_ruleVariableDecl4504 = new BitSet(new long[]{0x0007E00004000010L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIVariable_in_entryRuleIVariable4561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIVariable4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIVariable4613 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleIVariable4629 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIVariable4650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier4688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdentifier4698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier4744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier4767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTypeIdentifier4789 = new BitSet(new long[]{0x0007E00000000010L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier4811 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier4834 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTypeIdentifier4850 = new BitSet(new long[]{0x003C02B000000000L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier4871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation4910 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation4961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation5001 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation5011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleKeyValueAnnotation5046 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValueAnnotation5063 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyValueAnnotation5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5128 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString5139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString5205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCompareOperator5262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompareOperator5277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator5292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCompareOperator5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCompareOperator5322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleCompareOperator5337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePreOperator5379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleOrOperator5420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAndOperator5461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNotOperator5502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleAddOperator5543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSubOperator5584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleMultOperator5625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleModOperator5666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleDivOperator5707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleValueTestOperator5748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleValueType5790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleValueType5805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleValueType5820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleValueType5835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleValueType5850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleValueType5865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCombineOperator5908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCombineOperator5923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleCombineOperator5938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCombineOperator5953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCombineOperator5968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleCombineOperator5983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCombineOperator5998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleCombineOperator6013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred5789 = new BitSet(new long[]{0x00000007E0000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred5822 = new BitSet(new long[]{0x00001148000081F0L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred6971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred192516 = new BitSet(new long[]{0x00001108000081F0L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred192541 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_synpred192550 = new BitSet(new long[]{0x0000000000000002L});
    }


}