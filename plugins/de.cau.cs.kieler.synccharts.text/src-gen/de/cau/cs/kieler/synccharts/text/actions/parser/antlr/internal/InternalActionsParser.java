package de.cau.cs.kieler.synccharts.text.actions.parser.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.text.actions.services.ActionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalActionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'/'", "','", "'('", "')'", "':='", "'-'", "'.'", "'E'", "'e'", "'true'", "'false'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'*'", "'mod'", "'?'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[115+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ActionsGrammarAccess grammarAccess;
     	
        public InternalActionsParser(TokenStream input, IAstFactory factory, ActionsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Action";	
       	}
       	
       	@Override
       	protected ActionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:84:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:85:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:86:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction81);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:93:1: ruleAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:98:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:100:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getActionAccess().getActionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getActionAccess().getActionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:113:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:114:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:114:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:115:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleAction146); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0(), "isImmediate"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isImmediate", true, "#", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:134:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:136:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction177); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0(), "delay"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"delay",
                      	        		lv_delay_2_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:158:3: ( (lv_trigger_3_0= ruleBooleanExpression ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==14||(LA3_0>=21 && LA3_0<=22)||LA3_0==29||LA3_0==32) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:159:1: (lv_trigger_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:159:1: (lv_trigger_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:160:3: lv_trigger_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction204);
                    lv_trigger_3_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"trigger",
                      	        		lv_trigger_3_0, 
                      	        		"BooleanExpression", 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:182:3: ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:182:5: '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    {
                    match(input,12,FOLLOW_12_in_ruleAction216); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:186:1: ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:186:2: ( (lv_effects_5_0= ruleEffect ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:186:2: ( (lv_effects_5_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:187:1: (lv_effects_5_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:187:1: (lv_effects_5_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:188:3: lv_effects_5_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction238);
                    	    lv_effects_5_0=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"effects",
                    	      	        		lv_effects_5_0, 
                    	      	        		"Effect", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:210:2: ( ',' )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==13) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:210:4: ','
                    	            {
                    	            match(input,13,FOLLOW_13_in_ruleAction249); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_4_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:222:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:223:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:224:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect291);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect301); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEffect


    // $ANTLR start ruleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:231:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:236:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:237:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:237:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==16) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=RULE_ID && LA7_1<=RULE_STRING)||(LA7_1>=13 && LA7_1<=14)) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("237:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("237:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:238:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect351);
                    this_Emission_0=ruleEmission();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Emission_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:251:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect381);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:264:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect411);
                    this_TextEffect_2=ruleTextEffect();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextEffect_2; 
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
    // $ANTLR end ruleEffect


    // $ANTLR start entryRuleEmission
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:283:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:284:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:285:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission446);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission456); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmission


    // $ANTLR start ruleEmission
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:292:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;

        EObject lv_newValue_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:297:6: ( ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:298:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:298:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:298:2: ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:298:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:299:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:299:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:300:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission503); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:2: ( ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                switch ( input.LA(2) ) {
                    case RULE_INT:
                    case 17:
                    case 18:
                    case 36:
                        {
                        alt8=1;
                        }
                        break;
                    case RULE_STRING:
                        {
                        switch ( input.LA(3) ) {
                            case 14:
                            case 17:
                            case 33:
                            case 34:
                            case 35:
                                {
                                alt8=1;
                                }
                                break;
                            case 15:
                                {
                                int LA8_9 = input.LA(4);

                                if ( (synpred9()) ) {
                                    alt8=1;
                                }
                                else if ( (synpred10()) ) {
                                    alt8=2;
                                }
                                }
                                break;
                            case 30:
                            case 31:
                                {
                                alt8=2;
                                }
                                break;
                        }

                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(3) ) {
                            case 17:
                            case 33:
                            case 34:
                            case 35:
                                {
                                alt8=1;
                                }
                                break;
                            case 15:
                                {
                                int LA8_9 = input.LA(4);

                                if ( (synpred9()) ) {
                                    alt8=1;
                                }
                                else if ( (synpred10()) ) {
                                    alt8=2;
                                }
                                }
                                break;
                            case 30:
                            case 31:
                                {
                                alt8=2;
                                }
                                break;
                        }

                        }
                        break;
                    case 29:
                        {
                        int LA8_6 = input.LA(3);

                        if ( (LA8_6==14) ) {
                            int LA8_10 = input.LA(4);

                            if ( ((LA8_10>=RULE_ID && LA8_10<=RULE_STRING)) ) {
                                alt8=2;
                            }
                            else if ( (LA8_10==36) ) {
                                alt8=1;
                            }
                        }
                        }
                        break;
                    case 14:
                        {
                        int LA8_7 = input.LA(3);

                        if ( (synpred9()) ) {
                            alt8=1;
                        }
                        else if ( (synpred10()) ) {
                            alt8=2;
                        }
                        }
                        break;
                    case 21:
                    case 22:
                    case 32:
                        {
                        alt8=2;
                        }
                        break;
                }

            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:3: ( '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:5: '(' ( (lv_newValue_2_0= ruleValuedExpression ) ) ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleEmission515); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:319:1: ( (lv_newValue_2_0= ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:320:1: (lv_newValue_2_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:320:1: (lv_newValue_2_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:321:3: lv_newValue_2_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleEmission536);
                    lv_newValue_2_0=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newValue",
                      	        		lv_newValue_2_0, 
                      	        		"ValuedExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,15,FOLLOW_15_in_ruleEmission546); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:8: '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleEmission564); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:352:1: ( (lv_newValue_5_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:353:1: (lv_newValue_5_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:353:1: (lv_newValue_5_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:354:3: lv_newValue_5_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleEmission585);
                    lv_newValue_5_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newValue",
                      	        		lv_newValue_5_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,15,FOLLOW_15_in_ruleEmission595); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_1_2(), null); 
                          
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
    // $ANTLR end ruleEmission


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:388:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:389:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:390:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment634);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment644); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:397:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:402:6: ( ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:403:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:403:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:403:2: ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:403:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:404:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:404:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:405:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment691); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,16,FOLLOW_16_in_ruleAssignment701); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 17:
            case 18:
            case 36:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case 29:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==14) ) {
                    int LA9_7 = input.LA(3);

                    if ( (LA9_7==36) ) {
                        alt9=1;
                    }
                    else if ( ((LA9_7>=RULE_ID && LA9_7<=RULE_STRING)) ) {
                        alt9=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 9, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA9_5 = input.LA(2);

                if ( (synpred11()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case 21:
            case 22:
            case 32:
                {
                alt9=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("424:1: ( ( (lv_expression_2_0= ruleValuedExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:424:2: ( (lv_expression_2_0= ruleValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:424:2: ( (lv_expression_2_0= ruleValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:425:1: (lv_expression_2_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:425:1: (lv_expression_2_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:426:3: lv_expression_2_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAssignment723);
                    lv_expression_2_0=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_2_0, 
                      	        		"ValuedExpression", 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:449:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:449:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:450:1: (lv_expression_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:450:1: (lv_expression_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:451:3: lv_expression_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAssignment750);
                    lv_expression_3_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_3_0, 
                      	        		"BooleanExpression", 
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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleTextEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:481:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:482:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:483:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect787);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect797); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTextEffect


    // $ANTLR start ruleTextEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:490:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:495:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:496:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:496:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:496:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:496:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:497:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:497:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:498:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextEffect839); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextEffectAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextEffectRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"code",
              	        		lv_code_0_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:520:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:520:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleTextEffect855); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:524:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:525:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:525:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:526:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextEffect872); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextEffectRule().getType().getClassifier());
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

                    match(input,15,FOLLOW_15_in_ruleTextEffect887); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleTextEffect


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:562:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:563:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:564:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression927);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression937); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:571:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:576:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:578:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBooleanExpression986);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:597:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:598:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:599:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1020);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1030); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:606:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:611:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:612:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:612:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:613:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1080);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:624:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:624:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:624:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:625:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:643:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:644:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:644:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:645:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrOperator_in_ruleOrExpression1113);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:667:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:668:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:668:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:669:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1134);
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
            	    break loop11;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:699:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:700:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:701:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1172);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1182); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:708:1: ruleAndExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:713:6: ( (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:714:1: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:714:1: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:715:2: this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNotExpression_in_ruleAndExpression1232);
            this_NotExpression_0=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NotExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:726:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:726:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleNotExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:726:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:727:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:745:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:746:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:746:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:747:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndExpression1265);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:769:2: ( (lv_subExpressions_3_0= ruleNotExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:770:1: (lv_subExpressions_3_0= ruleNotExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:770:1: (lv_subExpressions_3_0= ruleNotExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:771:3: lv_subExpressions_3_0= ruleNotExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotExpression_in_ruleAndExpression1286);
            	    lv_subExpressions_3_0=ruleNotExpression();
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
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:801:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:802:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:803:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression1324);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression1334); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:810:1: ruleNotExpression returns [EObject current=null] : (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:815:6: ( (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:816:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:816:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==14||(LA13_0>=21 && LA13_0<=22)||LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("816:1: (this_AtomicExpression_0= ruleAtomicExpression | ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:817:2: this_AtomicExpression_0= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression1384);
                    this_AtomicExpression_0=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:829:6: ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:829:6: ( () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:829:7: () ( (lv_operator_2_0= ruleNotOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:829:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:830:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:843:2: ( (lv_operator_2_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:1: (lv_operator_2_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:1: (lv_operator_2_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:845:3: lv_operator_2_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression1423);
                    lv_operator_2_0=ruleNotOperator();
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
                      	        		lv_operator_2_0, 
                      	        		"NotOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:867:2: ( (lv_subExpressions_3_0= ruleAtomicExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:868:1: (lv_subExpressions_3_0= ruleAtomicExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:868:1: (lv_subExpressions_3_0= ruleAtomicExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:869:3: lv_subExpressions_3_0= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsAtomicExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression1444);
                    lv_subExpressions_3_0=ruleAtomicExpression();
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
                      	        		lv_subExpressions_3_0, 
                      	        		"AtomicExpression", 
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
    // $ANTLR end ruleNotExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:899:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:900:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:901:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1481);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression1491); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:908:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_SignalReference_1 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_subExpressions_5_0 = null;

        EObject this_CompareOperation_8 = null;

        EObject this_BooleanExpression_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:913:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case RULE_INT:
                case 17:
                case 18:
                case 36:
                    {
                    alt14=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA14_6 = input.LA(3);

                    if ( (LA14_6==15||(LA14_6>=30 && LA14_6<=31)) ) {
                        alt14=5;
                    }
                    else if ( (LA14_6==14||LA14_6==17||(LA14_6>=23 && LA14_6<=28)||(LA14_6>=33 && LA14_6<=35)) ) {
                        alt14=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA14_7 = input.LA(3);

                    if ( (LA14_7==15||(LA14_7>=30 && LA14_7<=31)) ) {
                        alt14=5;
                    }
                    else if ( (LA14_7==17||(LA14_7>=23 && LA14_7<=28)||(LA14_7>=33 && LA14_7<=35)) ) {
                        alt14=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    int LA14_8 = input.LA(3);

                    if ( (LA14_8==14) ) {
                        int LA14_11 = input.LA(4);

                        if ( ((LA14_11>=RULE_ID && LA14_11<=RULE_STRING)) ) {
                            alt14=5;
                        }
                        else if ( (LA14_11==36) ) {
                            alt14=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 11, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA14_9 = input.LA(3);

                    if ( (synpred19()) ) {
                        alt14=4;
                    }
                    else if ( (true) ) {
                        alt14=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                case 22:
                case 32:
                    {
                    alt14=5;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("914:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' ) | ( '(' this_CompareOperation_8= ruleCompareOperation ')' ) | ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:915:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleAtomicExpression1541);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:928:2: this_SignalReference_1= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleAtomicExpression1571);
                    this_SignalReference_1=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignalReference_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:940:6: ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:940:6: ( () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:940:7: () ( (lv_operator_3_0= rulePreOperator ) ) '(' ( (lv_subExpressions_5_0= ruleSignalReference ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:940:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:941:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicExpressionAccess().getOperatorExpressionAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:954:2: ( (lv_operator_3_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:955:1: (lv_operator_3_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:955:1: (lv_operator_3_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:956:3: lv_operator_3_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getOperatorPreOperatorEnumRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreOperator_in_ruleAtomicExpression1610);
                    lv_operator_3_0=rulePreOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAtomicExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_3_0, 
                      	        		"PreOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleAtomicExpression1620); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:982:1: ( (lv_subExpressions_5_0= ruleSignalReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:983:1: (lv_subExpressions_5_0= ruleSignalReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:983:1: (lv_subExpressions_5_0= ruleSignalReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:984:3: lv_subExpressions_5_0= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleAtomicExpression1641);
                    lv_subExpressions_5_0=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAtomicExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_5_0, 
                      	        		"SignalReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,15,FOLLOW_15_in_ruleAtomicExpression1651); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:6: ( '(' this_CompareOperation_8= ruleCompareOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:6: ( '(' this_CompareOperation_8= ruleCompareOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:8: '(' this_CompareOperation_8= ruleCompareOperation ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleAtomicExpression1669); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getCompareOperationParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleAtomicExpression1694);
                    this_CompareOperation_8=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_8; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_ruleAtomicExpression1703); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1032:6: ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1032:6: ( '(' this_BooleanExpression_11= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1032:8: '(' this_BooleanExpression_11= ruleBooleanExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleAtomicExpression1721); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression1746);
                    this_BooleanExpression_11=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_11; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_ruleAtomicExpression1755); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_4_2(), null); 
                          
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
    // $ANTLR end ruleAtomicExpression


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1060:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1061:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1062:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference1792);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference1802); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignalReference


    // $ANTLR start ruleSignalReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1069:1: ruleSignalReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1074:6: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1075:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1075:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1076:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1076:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1077:3: ruleEString
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalReferenceAccess().getSignalSignalCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleSignalReference1853);
            ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end ruleSignalReference


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1102:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1103:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1104:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1888);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1898); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1111:1: ruleCompareOperation returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1116:6: ( (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1117:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1117:1: (this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1118:2: this_ValuedExpression_0= ruleValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_ruleCompareOperation1948);
            this_ValuedExpression_0=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1129:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1129:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1129:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1130:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1148:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1149:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1149:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1150:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation1981);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1172:2: ( (lv_subExpressions_3_0= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1173:1: (lv_subExpressions_3_0= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1173:1: (lv_subExpressions_3_0= ruleValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1174:3: lv_subExpressions_3_0= ruleValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValuedExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_ruleCompareOperation2002);
            lv_subExpressions_3_0=ruleValuedExpression();
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
              	        		"ValuedExpression", 
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


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1204:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1205:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1206:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2039);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression2049); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1213:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1218:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1220:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression2098);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1239:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1240:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1241:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression2132);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression2142); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1248:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1253:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1254:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1254:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1255:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression2192);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1266:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1266:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1266:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1267:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1285:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1286:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1286:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1287:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression2225);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1309:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1310:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1310:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1311:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression2246);
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
            	    break loop15;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1341:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1342:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1343:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression2284);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression2294); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1350:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1355:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1356:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1356:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1357:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression2344);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1368:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1368:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1368:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1369:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1387:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1388:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1388:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1389:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression2377);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1411:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1412:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1412:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1413:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression2398);
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
            	    break loop16;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1443:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1444:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1445:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression2436);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression2446); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1452:1: ruleMultExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1457:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1458:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1458:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1459:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleMultExpression2496);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1470:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1470:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1470:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1471:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1489:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1490:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1490:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1491:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression2529);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1513:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1514:1: (lv_subExpressions_3_0= ruleModExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1514:1: (lv_subExpressions_3_0= ruleModExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1515:3: lv_subExpressions_3_0= ruleModExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModExpression_in_ruleMultExpression2550);
            	    lv_subExpressions_3_0=ruleModExpression();
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

            	default :
            	    break loop17;
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


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1545:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1546:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1547:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression2588);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression2598); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1554:1: ruleModExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1559:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1560:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1560:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1561:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2648);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1572:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1572:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1572:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1573:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1591:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1592:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1592:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1593:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression2681);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1615:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1616:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1616:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1617:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2702);
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


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1647:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1648:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1649:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression2740);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression2750); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1656:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_VariableReference_2 = null;

        EObject this_ValueTestExpression_3 = null;

        EObject this_PreValueTestExpression_4 = null;

        EObject this_DivExpression_6 = null;

        EObject this_ValuedExpression_9 = null;

        EObject this_TextExpression_11 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1661:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_INT) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==18) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==EOF||(LA19_2>=RULE_ID && LA19_2<=RULE_STRING)||(LA19_2>=12 && LA19_2<=13)||LA19_2==15||LA19_2==17||(LA19_2>=23 && LA19_2<=28)||(LA19_2>=33 && LA19_2<=35)) ) {
                        alt19=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA19_1==18) ) {
                    alt19=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==18) ) {
                    alt19=2;
                }
                else if ( (LA19_2==EOF||(LA19_2>=RULE_ID && LA19_2<=RULE_STRING)||(LA19_2>=12 && LA19_2<=13)||LA19_2==15||LA19_2==17||(LA19_2>=23 && LA19_2<=28)||(LA19_2>=33 && LA19_2<=35)) ) {
                    alt19=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                int LA19_4 = input.LA(2);

                if ( (synpred26()) ) {
                    alt19=3;
                }
                else if ( (true) ) {
                    alt19=8;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            case 36:
                {
                alt19=4;
                }
                break;
            case 29:
                {
                alt19=5;
                }
                break;
            case 14:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    int LA19_11 = input.LA(3);

                    if ( (LA19_11==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 18:
                            {
                            int LA19_13 = input.LA(5);

                            if ( (LA19_13==RULE_INT) ) {
                                switch ( input.LA(6) ) {
                                case 19:
                                    {
                                    int LA19_25 = input.LA(7);

                                    if ( (LA19_25==17) ) {
                                        int LA19_31 = input.LA(8);

                                        if ( (LA19_31==RULE_INT) ) {
                                            int LA19_32 = input.LA(9);

                                            if ( (LA19_32==12) ) {
                                                alt19=6;
                                            }
                                            else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                                alt19=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA19_25==RULE_INT) ) {
                                        int LA19_32 = input.LA(8);

                                        if ( (LA19_32==12) ) {
                                            alt19=6;
                                        }
                                        else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                            alt19=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 25, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 20:
                                    {
                                    int LA19_26 = input.LA(7);

                                    if ( (LA19_26==17) ) {
                                        int LA19_31 = input.LA(8);

                                        if ( (LA19_31==RULE_INT) ) {
                                            int LA19_32 = input.LA(9);

                                            if ( (LA19_32==12) ) {
                                                alt19=6;
                                            }
                                            else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                                alt19=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                            throw nvae;
                                        }
                                    }
                                    else if ( (LA19_26==RULE_INT) ) {
                                        int LA19_32 = input.LA(8);

                                        if ( (LA19_32==12) ) {
                                            alt19=6;
                                        }
                                        else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                            alt19=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 26, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 12:
                                    {
                                    alt19=6;
                                    }
                                    break;
                                case 15:
                                case 17:
                                case 33:
                                case 34:
                                case 35:
                                    {
                                    alt19=7;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 21, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 13, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 12:
                            {
                            alt19=6;
                            }
                            break;
                        case 15:
                        case 17:
                        case 33:
                        case 34:
                        case 35:
                            {
                            alt19=7;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 12, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA19_11==18) ) {
                        int LA19_13 = input.LA(4);

                        if ( (LA19_13==RULE_INT) ) {
                            switch ( input.LA(5) ) {
                            case 19:
                                {
                                int LA19_25 = input.LA(6);

                                if ( (LA19_25==17) ) {
                                    int LA19_31 = input.LA(7);

                                    if ( (LA19_31==RULE_INT) ) {
                                        int LA19_32 = input.LA(8);

                                        if ( (LA19_32==12) ) {
                                            alt19=6;
                                        }
                                        else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                            alt19=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA19_25==RULE_INT) ) {
                                    int LA19_32 = input.LA(7);

                                    if ( (LA19_32==12) ) {
                                        alt19=6;
                                    }
                                    else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                        alt19=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 25, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 20:
                                {
                                int LA19_26 = input.LA(6);

                                if ( (LA19_26==17) ) {
                                    int LA19_31 = input.LA(7);

                                    if ( (LA19_31==RULE_INT) ) {
                                        int LA19_32 = input.LA(8);

                                        if ( (LA19_32==12) ) {
                                            alt19=6;
                                        }
                                        else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                            alt19=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA19_26==RULE_INT) ) {
                                    int LA19_32 = input.LA(7);

                                    if ( (LA19_32==12) ) {
                                        alt19=6;
                                    }
                                    else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                        alt19=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 26, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 12:
                                {
                                alt19=6;
                                }
                                break;
                            case 15:
                            case 17:
                            case 33:
                            case 34:
                            case 35:
                                {
                                alt19=7;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 21, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 13, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        int LA19_13 = input.LA(4);

                        if ( (LA19_13==RULE_INT) ) {
                            switch ( input.LA(5) ) {
                            case 19:
                                {
                                int LA19_25 = input.LA(6);

                                if ( (LA19_25==17) ) {
                                    int LA19_31 = input.LA(7);

                                    if ( (LA19_31==RULE_INT) ) {
                                        int LA19_32 = input.LA(8);

                                        if ( (LA19_32==12) ) {
                                            alt19=6;
                                        }
                                        else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                            alt19=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA19_25==RULE_INT) ) {
                                    int LA19_32 = input.LA(7);

                                    if ( (LA19_32==12) ) {
                                        alt19=6;
                                    }
                                    else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                        alt19=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 25, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 20:
                                {
                                int LA19_26 = input.LA(6);

                                if ( (LA19_26==17) ) {
                                    int LA19_31 = input.LA(7);

                                    if ( (LA19_31==RULE_INT) ) {
                                        int LA19_32 = input.LA(8);

                                        if ( (LA19_32==12) ) {
                                            alt19=6;
                                        }
                                        else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                            alt19=7;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA19_26==RULE_INT) ) {
                                    int LA19_32 = input.LA(7);

                                    if ( (LA19_32==12) ) {
                                        alt19=6;
                                    }
                                    else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                        alt19=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 26, input);

                                    throw nvae;
                                }
                                }
                                break;
                            case 12:
                                {
                                alt19=6;
                                }
                                break;
                            case 15:
                            case 17:
                            case 33:
                            case 34:
                            case 35:
                                {
                                alt19=7;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 21, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 12:
                        {
                        alt19=6;
                        }
                        break;
                    case 15:
                    case 17:
                    case 33:
                    case 34:
                    case 35:
                        {
                        alt19=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 12, input);

                        throw nvae;
                    }

                    }
                    break;
                case 18:
                    {
                    int LA19_13 = input.LA(3);

                    if ( (LA19_13==RULE_INT) ) {
                        switch ( input.LA(4) ) {
                        case 19:
                            {
                            int LA19_25 = input.LA(5);

                            if ( (LA19_25==17) ) {
                                int LA19_31 = input.LA(6);

                                if ( (LA19_31==RULE_INT) ) {
                                    int LA19_32 = input.LA(7);

                                    if ( (LA19_32==12) ) {
                                        alt19=6;
                                    }
                                    else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                        alt19=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA19_25==RULE_INT) ) {
                                int LA19_32 = input.LA(6);

                                if ( (LA19_32==12) ) {
                                    alt19=6;
                                }
                                else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                    alt19=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 25, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 20:
                            {
                            int LA19_26 = input.LA(5);

                            if ( (LA19_26==17) ) {
                                int LA19_31 = input.LA(6);

                                if ( (LA19_31==RULE_INT) ) {
                                    int LA19_32 = input.LA(7);

                                    if ( (LA19_32==12) ) {
                                        alt19=6;
                                    }
                                    else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                        alt19=7;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 31, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA19_26==RULE_INT) ) {
                                int LA19_32 = input.LA(6);

                                if ( (LA19_32==12) ) {
                                    alt19=6;
                                }
                                else if ( (LA19_32==15||LA19_32==17||(LA19_32>=33 && LA19_32<=35)) ) {
                                    alt19=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 32, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 26, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 12:
                            {
                            alt19=6;
                            }
                            break;
                        case 15:
                        case 17:
                        case 33:
                        case 34:
                        case 35:
                            {
                            alt19=7;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 21, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        int LA19_22 = input.LA(4);

                        if ( (LA19_22==RULE_ID) ) {
                            int LA19_27 = input.LA(5);

                            if ( (LA19_27==15) ) {
                                int LA19_33 = input.LA(6);

                                if ( (LA19_33==12) ) {
                                    alt19=6;
                                }
                                else if ( (LA19_33==15||LA19_33==17||(LA19_33>=33 && LA19_33<=35)) ) {
                                    alt19=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 33, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 27, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 12:
                        {
                        alt19=6;
                        }
                        break;
                    case 15:
                    case 17:
                    case 33:
                    case 34:
                    case 35:
                        {
                        alt19=7;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 14, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    int LA19_15 = input.LA(3);

                    if ( (LA19_15==12) ) {
                        alt19=6;
                    }
                    else if ( (LA19_15==15||LA19_15==17||(LA19_15>=33 && LA19_15<=35)) ) {
                        alt19=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA19_16 = input.LA(3);

                    if ( (LA19_16==14) ) {
                        int LA19_23 = input.LA(4);

                        if ( (LA19_23==RULE_STRING) ) {
                            int LA19_28 = input.LA(5);

                            if ( (LA19_28==15) ) {
                                int LA19_34 = input.LA(6);

                                if ( (LA19_34==12) ) {
                                    alt19=6;
                                }
                                else if ( (LA19_34==15||LA19_34==17||(LA19_34>=33 && LA19_34<=35)) ) {
                                    alt19=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 34, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 28, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA19_23==RULE_ID) ) {
                            int LA19_29 = input.LA(5);

                            if ( (LA19_29==15) ) {
                                int LA19_34 = input.LA(6);

                                if ( (LA19_34==12) ) {
                                    alt19=6;
                                }
                                else if ( (LA19_34==15||LA19_34==17||(LA19_34>=33 && LA19_34<=35)) ) {
                                    alt19=7;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 34, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 29, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 23, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 29:
                    {
                    int LA19_17 = input.LA(3);

                    if ( (LA19_17==14) ) {
                        int LA19_24 = input.LA(4);

                        if ( (LA19_24==36) ) {
                            int LA19_30 = input.LA(5);

                            if ( (LA19_30==14) ) {
                                int LA19_35 = input.LA(6);

                                if ( (LA19_35==RULE_STRING) ) {
                                    int LA19_36 = input.LA(7);

                                    if ( (LA19_36==15) ) {
                                        int LA19_38 = input.LA(8);

                                        if ( (LA19_38==15) ) {
                                            int LA19_39 = input.LA(9);

                                            if ( (LA19_39==12) ) {
                                                alt19=6;
                                            }
                                            else if ( (LA19_39==15||LA19_39==17||(LA19_39>=33 && LA19_39<=35)) ) {
                                                alt19=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 38, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 36, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA19_35==RULE_ID) ) {
                                    int LA19_37 = input.LA(7);

                                    if ( (LA19_37==15) ) {
                                        int LA19_38 = input.LA(8);

                                        if ( (LA19_38==15) ) {
                                            int LA19_39 = input.LA(9);

                                            if ( (LA19_39==12) ) {
                                                alt19=6;
                                            }
                                            else if ( (LA19_39==15||LA19_39==17||(LA19_39>=33 && LA19_39<=35)) ) {
                                                alt19=7;
                                            }
                                            else {
                                                if (backtracking>0) {failed=true; return current;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 39, input);

                                                throw nvae;
                                            }
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 38, input);

                                            throw nvae;
                                        }
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 37, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 35, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA19_18 = input.LA(3);

                    if ( (synpred29()) ) {
                        alt19=6;
                    }
                    else if ( (synpred30()) ) {
                        alt19=7;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1662:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_VariableReference_2= ruleVariableReference | this_ValueTestExpression_3= ruleValueTestExpression | this_PreValueTestExpression_4= rulePreValueTestExpression | ( '(' this_DivExpression_6= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_9= ruleValuedExpression ')' ) | this_TextExpression_11= ruleTextExpression )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1663:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression2800);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1676:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression2830);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1689:2: this_VariableReference_2= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getVariableReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleAtomicValuedExpression2860);
                    this_VariableReference_2=ruleVariableReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_VariableReference_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1702:2: this_ValueTestExpression_3= ruleValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValueTestExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueTestExpression_in_ruleAtomicValuedExpression2890);
                    this_ValueTestExpression_3=ruleValueTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValueTestExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1715:2: this_PreValueTestExpression_4= rulePreValueTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getPreValueTestExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreValueTestExpression_in_ruleAtomicValuedExpression2920);
                    this_PreValueTestExpression_4=rulePreValueTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PreValueTestExpression_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:6: ( '(' this_DivExpression_6= ruleDivExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:6: ( '(' this_DivExpression_6= ruleDivExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:8: '(' this_DivExpression_6= ruleDivExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleAtomicValuedExpression2936); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression2961);
                    this_DivExpression_6=ruleDivExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivExpression_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_ruleAtomicValuedExpression2970); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:6: ( '(' this_ValuedExpression_9= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:6: ( '(' this_ValuedExpression_9= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:8: '(' this_ValuedExpression_9= ruleValuedExpression ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleAtomicValuedExpression2988); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3013);
                    this_ValuedExpression_9=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_ruleAtomicValuedExpression3022); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_6_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1770:2: this_TextExpression_11= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getTextExpressionParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicValuedExpression3054);
                    this_TextExpression_11=ruleTextExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextExpression_11; 
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


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1789:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1790:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1791:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression3089);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression3099); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1798:1: ruleDivExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1803:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1804:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1804:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1805:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression3149);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1816:1: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1817:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1835:2: ( (lv_operator_2_0= ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1836:1: (lv_operator_2_0= ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1836:1: (lv_operator_2_0= ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1837:3: lv_operator_2_0= ruleDivOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression3181);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1859:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1860:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1860:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1861:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression3202);
            lv_subExpressions_3_0=ruleAtomicValuedExpression();
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


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1891:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1892:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1893:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference3238);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference3248); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableReference


    // $ANTLR start ruleVariableReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:1: ruleVariableReference returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1905:6: ( ( ( ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1906:1: ( ( ruleEString ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1906:1: ( ( ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1907:1: ( ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1907:1: ( ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1908:3: ruleEString
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleVariableReference3299);
            ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
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
    // $ANTLR end ruleVariableReference


    // $ANTLR start entryRuleValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1933:1: entryRuleValueTestExpression returns [EObject current=null] : iv_ruleValueTestExpression= ruleValueTestExpression EOF ;
    public final EObject entryRuleValueTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1934:2: (iv_ruleValueTestExpression= ruleValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1935:2: iv_ruleValueTestExpression= ruleValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueTestExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression3334);
            iv_ruleValueTestExpression=ruleValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueTestExpression3344); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValueTestExpression


    // $ANTLR start ruleValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1942:1: ruleValueTestExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' ) ;
    public final EObject ruleValueTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1947:6: ( ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1948:1: ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1948:1: ( ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1948:2: ( (lv_operator_0_0= ruleValueTestOperator ) ) '(' ( (lv_subExpressions_2_0= ruleSignalReference ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1948:2: ( (lv_operator_0_0= ruleValueTestOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1949:1: (lv_operator_0_0= ruleValueTestOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1949:1: (lv_operator_0_0= ruleValueTestOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1950:3: lv_operator_0_0= ruleValueTestOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueTestOperator_in_ruleValueTestExpression3390);
            lv_operator_0_0=ruleValueTestOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"ValueTestOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,14,FOLLOW_14_in_ruleValueTestExpression3400); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getValueTestExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1976:1: ( (lv_subExpressions_2_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1977:1: (lv_subExpressions_2_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1977:1: (lv_subExpressions_2_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1978:3: lv_subExpressions_2_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueTestExpressionAccess().getSubExpressionsSignalReferenceParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValueTestExpression3421);
            lv_subExpressions_2_0=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"SignalReference", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,15,FOLLOW_15_in_ruleValueTestExpression3431); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getValueTestExpressionAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end ruleValueTestExpression


    // $ANTLR start entryRulePreValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2012:1: entryRulePreValueTestExpression returns [EObject current=null] : iv_rulePreValueTestExpression= rulePreValueTestExpression EOF ;
    public final EObject entryRulePreValueTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreValueTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2013:2: (iv_rulePreValueTestExpression= rulePreValueTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2014:2: iv_rulePreValueTestExpression= rulePreValueTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreValueTestExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression3467);
            iv_rulePreValueTestExpression=rulePreValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreValueTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreValueTestExpression3477); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePreValueTestExpression


    // $ANTLR start rulePreValueTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2021:1: rulePreValueTestExpression returns [EObject current=null] : ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' ) ;
    public final EObject rulePreValueTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2026:6: ( ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2027:1: ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2027:1: ( ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2027:2: ( (lv_operator_0_0= rulePreOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValueTestExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2027:2: ( (lv_operator_0_0= rulePreOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2028:1: (lv_operator_0_0= rulePreOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2028:1: (lv_operator_0_0= rulePreOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2029:3: lv_operator_0_0= rulePreOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreValueTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePreOperator_in_rulePreValueTestExpression3523);
            lv_operator_0_0=rulePreOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"PreOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,14,FOLLOW_14_in_rulePreValueTestExpression3533); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreValueTestExpressionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2055:1: ( (lv_subExpressions_2_0= ruleValueTestExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2056:1: (lv_subExpressions_2_0= ruleValueTestExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2056:1: (lv_subExpressions_2_0= ruleValueTestExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2057:3: lv_subExpressions_2_0= ruleValueTestExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreValueTestExpressionAccess().getSubExpressionsValueTestExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueTestExpression_in_rulePreValueTestExpression3554);
            lv_subExpressions_2_0=ruleValueTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreValueTestExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"ValueTestExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,15,FOLLOW_15_in_rulePreValueTestExpression3564); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreValueTestExpressionAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end rulePreValueTestExpression


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2091:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2092:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2093:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression3600);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression3610); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2100:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2105:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2106:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2106:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2106:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2106:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2107:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2107:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2108:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextExpression3652); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextExpressionAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              		
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
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2130:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2130:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,14,FOLLOW_14_in_ruleTextExpression3668); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2134:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2135:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2135:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2136:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextExpression3685); if (failed) return current;
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

                    match(input,15,FOLLOW_15_in_ruleTextExpression3700); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2170:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2171:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2172:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue3738);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue3748); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2179:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= ruleEIntegerObject ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2184:6: ( ( (lv_value_0_0= ruleEIntegerObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2185:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2185:1: ( (lv_value_0_0= ruleEIntegerObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2186:1: (lv_value_0_0= ruleEIntegerObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2186:1: (lv_value_0_0= ruleEIntegerObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2187:3: lv_value_0_0= ruleEIntegerObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getIntValueAccess().getValueEIntegerObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_ruleIntValue3793);
            lv_value_0_0=ruleEIntegerObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"EIntegerObject", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2217:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2218:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2219:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue3828);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue3838); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2226:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloatObject ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2231:6: ( ( (lv_value_0_0= ruleEFloatObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2232:1: ( (lv_value_0_0= ruleEFloatObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2232:1: ( (lv_value_0_0= ruleEFloatObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2233:1: (lv_value_0_0= ruleEFloatObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2233:1: (lv_value_0_0= ruleEFloatObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2234:3: lv_value_0_0= ruleEFloatObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFloatValueAccess().getValueEFloatObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_ruleFloatValue3883);
            lv_value_0_0=ruleEFloatObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"EFloatObject", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2264:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2265:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2266:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3918);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3928); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2273:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBooleanObject ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2278:6: ( ( (lv_value_0_0= ruleEBooleanObject ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2279:1: ( (lv_value_0_0= ruleEBooleanObject ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2279:1: ( (lv_value_0_0= ruleEBooleanObject ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2280:1: (lv_value_0_0= ruleEBooleanObject )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2280:1: (lv_value_0_0= ruleEBooleanObject )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2281:3: lv_value_0_0= ruleEBooleanObject
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanObjectParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_ruleBooleanValue3973);
            lv_value_0_0=ruleEBooleanObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"EBooleanObject", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
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


    // $ANTLR start entryRuleEIntegerObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2311:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2312:2: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2313:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEIntegerObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject4009);
            iv_ruleEIntegerObject=ruleEIntegerObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEIntegerObject.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEIntegerObject4020); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEIntegerObject


    // $ANTLR start ruleEIntegerObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2320:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2325:6: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2326:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2326:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2326:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2326:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2327:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleEIntegerObject4059); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEIntegerObject4076); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleEIntegerObject


    // $ANTLR start entryRuleEFloatObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2347:1: entryRuleEFloatObject returns [String current=null] : iv_ruleEFloatObject= ruleEFloatObject EOF ;
    public final String entryRuleEFloatObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloatObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2348:2: (iv_ruleEFloatObject= ruleEFloatObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2349:2: iv_ruleEFloatObject= ruleEFloatObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEFloatObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject4122);
            iv_ruleEFloatObject=ruleEFloatObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEFloatObject.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEFloatObject4133); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEFloatObject


    // $ANTLR start ruleEFloatObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2356:1: ruleEFloatObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloatObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2361:6: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2362:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2362:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2362:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2362:2: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2363:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleEFloatObject4172); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2368:3: (this_INT_1= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2368:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject4190); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_ruleEFloatObject4210); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getEFloatObjectAccess().getFullStopKeyword_2(), null); 
                  
            }
            this_INT_3=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject4225); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_3);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2388:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=19 && LA26_0<=20)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2388:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2388:2: (kw= 'E' | kw= 'e' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==19) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==20) ) {
                        alt24=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2388:2: (kw= 'E' | kw= 'e' )", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2389:2: kw= 'E'
                            {
                            kw=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleEFloatObject4245); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2396:2: kw= 'e'
                            {
                            kw=(Token)input.LT(1);
                            match(input,20,FOLLOW_20_in_ruleEFloatObject4264); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getEKeyword_4_0_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2401:2: (kw= '-' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==17) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2402:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleEFloatObject4279); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getEFloatObjectAccess().getHyphenMinusKeyword_4_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEFloatObject4296); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_7);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEFloatObjectAccess().getINTTerminalRuleCall_4_2(), null); 
                          
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
    // $ANTLR end ruleEFloatObject


    // $ANTLR start entryRuleEBooleanObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2422:1: entryRuleEBooleanObject returns [String current=null] : iv_ruleEBooleanObject= ruleEBooleanObject EOF ;
    public final String entryRuleEBooleanObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBooleanObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2423:2: (iv_ruleEBooleanObject= ruleEBooleanObject EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2424:2: iv_ruleEBooleanObject= ruleEBooleanObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEBooleanObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject4344);
            iv_ruleEBooleanObject=ruleEBooleanObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEBooleanObject.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEBooleanObject4355); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEBooleanObject


    // $ANTLR start ruleEBooleanObject
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2431:1: ruleEBooleanObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBooleanObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2436:6: ( (kw= 'true' | kw= 'false' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2437:1: (kw= 'true' | kw= 'false' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2437:1: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            else if ( (LA27_0==22) ) {
                alt27=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2437:1: (kw= 'true' | kw= 'false' )", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2438:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleEBooleanObject4393); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEBooleanObjectAccess().getTrueKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2445:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleEBooleanObject4412); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEBooleanObjectAccess().getFalseKeyword_1(), null); 
                          
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
    // $ANTLR end ruleEBooleanObject


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2458:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2459:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2460:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString4453);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString4464); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2467:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2472:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2473:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2473:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2473:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2473:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString4504); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2481:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString4530); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2496:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2500:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2501:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2501:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt29=1;
                }
                break;
            case 24:
                {
                alt29=2;
                }
                break;
            case 25:
                {
                alt29=3;
                }
                break;
            case 26:
                {
                alt29=4;
                }
                break;
            case 27:
                {
                alt29=5;
                }
                break;
            case 28:
                {
                alt29=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2501:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2501:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2501:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2501:4: '='
                    {
                    match(input,23,FOLLOW_23_in_ruleCompareOperator4587); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2507:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2507:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2507:8: '<'
                    {
                    match(input,24,FOLLOW_24_in_ruleCompareOperator4602); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2513:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2513:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2513:8: '<='
                    {
                    match(input,25,FOLLOW_25_in_ruleCompareOperator4617); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2519:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2519:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2519:8: '>'
                    {
                    match(input,26,FOLLOW_26_in_ruleCompareOperator4632); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:8: '>='
                    {
                    match(input,27,FOLLOW_27_in_ruleCompareOperator4647); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2531:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2531:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2531:8: '<>'
                    {
                    match(input,28,FOLLOW_28_in_ruleCompareOperator4662); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2541:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2545:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2546:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2546:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2546:3: 'pre'
            {
            match(input,29,FOLLOW_29_in_rulePreOperator4704); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2556:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2560:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2561:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2561:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2561:3: 'or'
            {
            match(input,30,FOLLOW_30_in_ruleOrOperator4745); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2571:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2575:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2576:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2576:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2576:3: 'and'
            {
            match(input,31,FOLLOW_31_in_ruleAndOperator4786); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2586:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2590:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2591:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2591:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2591:3: 'not'
            {
            match(input,32,FOLLOW_32_in_ruleNotOperator4827); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2601:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2605:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2606:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2606:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2606:3: '+'
            {
            match(input,33,FOLLOW_33_in_ruleAddOperator4868); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2616:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2620:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2621:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2621:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2621:3: '-'
            {
            match(input,17,FOLLOW_17_in_ruleSubOperator4909); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2631:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2635:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2636:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2636:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2636:3: '*'
            {
            match(input,34,FOLLOW_34_in_ruleMultOperator4950); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2646:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2650:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2651:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2651:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2651:3: 'mod'
            {
            match(input,35,FOLLOW_35_in_ruleModOperator4991); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2661:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2665:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2666:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2666:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2666:3: '/'
            {
            match(input,12,FOLLOW_12_in_ruleDivOperator5032); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2676:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2680:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2681:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2681:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2681:3: '?'
            {
            match(input,36,FOLLOW_36_in_ruleValueTestOperator5073); if (failed) return current;
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

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:3: ( ( '(' ( ( ruleValuedExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:3: ( '(' ( ( ruleValuedExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:3: ( '(' ( ( ruleValuedExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:315:5: '(' ( ( ruleValuedExpression ) ) ')'
        {
        match(input,14,FOLLOW_14_in_synpred9515); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:319:1: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:320:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:320:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:321:3: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValuedExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred9536);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,15,FOLLOW_15_in_synpred9546); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:6: ( ( '(' ( ( ruleBooleanExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:348:8: '(' ( ( ruleBooleanExpression ) ) ')'
        {
        match(input,14,FOLLOW_14_in_synpred10564); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:352:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:353:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:353:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:354:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred10585);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,15,FOLLOW_15_in_synpred10595); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:424:2: ( ( ( ruleValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:424:2: ( ( ruleValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:424:2: ( ( ruleValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:425:1: ( ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:425:1: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:426:3: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValuedExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred11723);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:6: ( ( '(' ruleCompareOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:6: ( '(' ruleCompareOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:6: ( '(' ruleCompareOperation ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:8: '(' ruleCompareOperation ')'
        {
        match(input,14,FOLLOW_14_in_synpred191669); if (failed) return ;
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred191694);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;
        match(input,15,FOLLOW_15_in_synpred191703); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1689:2: ( ruleVariableReference )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1689:2: ruleVariableReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleVariableReference_in_synpred262860);
        ruleVariableReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:6: ( ( '(' ruleDivExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:6: ( '(' ruleDivExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:6: ( '(' ruleDivExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1727:8: '(' ruleDivExpression ')'
        {
        match(input,14,FOLLOW_14_in_synpred292936); if (failed) return ;
        pushFollow(FOLLOW_ruleDivExpression_in_synpred292961);
        ruleDivExpression();
        _fsp--;
        if (failed) return ;
        match(input,15,FOLLOW_15_in_synpred292970); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1748:8: '(' ruleValuedExpression ')'
        {
        match(input,14,FOLLOW_14_in_synpred302988); if (failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred303013);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,15,FOLLOW_15_in_synpred303022); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred30

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
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred30() {
        backtracking++;
        int start = input.mark();
        try {
            synpred30_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAction146 = new BitSet(new long[]{0x0000000120605072L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction177 = new BitSet(new long[]{0x0000000120605062L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction204 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleAction216 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction238 = new BitSet(new long[]{0x0000000000002062L});
    public static final BitSet FOLLOW_13_in_ruleAction249 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission503 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleEmission515 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleEmission536 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEmission546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEmission564 = new BitSet(new long[]{0x0000000120604060L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEmission595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment691 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssignment701 = new BitSet(new long[]{0x0000001120664070L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAssignment723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextEffect839 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTextEffect855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect872 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTextEffect887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1080 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression1113 = new BitSet(new long[]{0x0000000120604060L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1134 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleAndExpression1232 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression1265 = new BitSet(new long[]{0x0000000120604060L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleAndExpression1286 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression1423 = new BitSet(new long[]{0x0000000020604060L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleAtomicExpression1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleAtomicExpression1610 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpression1620 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleAtomicExpression1641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicExpression1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpression1669 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAtomicExpression1694 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicExpression1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtomicExpression1721 = new BitSet(new long[]{0x0000000120604060L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression1746 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicExpression1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSignalReference1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation1948 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1981 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleCompareOperation2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2192 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2225 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2246 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2344 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2377 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2398 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression2496 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2529 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression2550 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2648 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression2681 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression2740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleAtomicValuedExpression2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_ruleAtomicValuedExpression2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_ruleAtomicValuedExpression2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtomicValuedExpression2936 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression2961 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicValuedExpression2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAtomicValuedExpression2988 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3013 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicValuedExpression3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicValuedExpression3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression3149 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression3181 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleVariableReference3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_entryRuleValueTestExpression3334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueTestExpression3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValueTestExpression3390 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleValueTestExpression3400 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValueTestExpression3421 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValueTestExpression3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreValueTestExpression_in_entryRulePreValueTestExpression3467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreValueTestExpression3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_rulePreValueTestExpression3523 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePreValueTestExpression3533 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValueTestExpression_in_rulePreValueTestExpression3554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePreValueTestExpression3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression3600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextExpression3652 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTextExpression3668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression3685 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTextExpression3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_ruleIntValue3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_ruleFloatValue3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_ruleBooleanValue3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEIntegerObject_in_entryRuleEIntegerObject4009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEIntegerObject4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEIntegerObject4059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEIntegerObject4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEFloatObject_in_entryRuleEFloatObject4122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEFloatObject4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEFloatObject4172 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject4190 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEFloatObject4210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject4225 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleEFloatObject4245 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_20_in_ruleEFloatObject4264 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleEFloatObject4279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEFloatObject4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEBooleanObject_in_entryRuleEBooleanObject4344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEBooleanObject4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEBooleanObject4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEBooleanObject4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString4453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompareOperator4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompareOperator4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCompareOperator4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompareOperator4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompareOperator4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCompareOperator4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePreOperator4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOrOperator4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAndOperator4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleNotOperator4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAddOperator4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSubOperator4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMultOperator4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleModOperator4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDivOperator5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleValueTestOperator5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred9515 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred9536 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred10564 = new BitSet(new long[]{0x0000000120604060L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred10585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred10595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred191669 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred191694 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred191703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_synpred262860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred292936 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleDivExpression_in_synpred292961 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred292970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred302988 = new BitSet(new long[]{0x0000001020064070L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred303013 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred303022 = new BitSet(new long[]{0x0000000000000002L});

}