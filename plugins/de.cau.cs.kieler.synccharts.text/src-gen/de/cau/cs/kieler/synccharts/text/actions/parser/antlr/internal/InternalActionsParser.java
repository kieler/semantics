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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'/'", "','", "'('", "')'", "':='", "'input'", "';'", "'output'", "'inputoutput'", "'return'", "':'", "'var'", "'combine'", "'with'", "'@'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'?'", "'pure'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=4;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=9;
    public static final int RULE_HOSTCODE=6;
    public static final int RULE_ML_COMMENT=11;

        public InternalActionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[156+1];
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
        	return "Transition";	
       	}
       	
       	@Override
       	protected ActionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:84:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:85:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:86:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition81);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:93:1: ruleTransition returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:98:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:99:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:100:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTransitionAccess().getTransitionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTransitionAccess().getTransitionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:113:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
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
                    match(input,15,FOLLOW_15_in_ruleTransition146); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_1_0(), "isImmediate"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
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
                int LA2_1 = input.LA(2);

                if ( (LA2_1==42) ) {
                    switch ( input.LA(3) ) {
                        case 42:
                            {
                            switch ( input.LA(4) ) {
                                case 42:
                                    {
                                    int LA2_14 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                                case RULE_INT:
                                    {
                                    int LA2_15 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                                case RULE_FLOAT:
                                    {
                                    int LA2_16 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                                case 18:
                                    {
                                    int LA2_17 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                                case RULE_BOOLEAN:
                                    {
                                    int LA2_18 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                                case 37:
                                    {
                                    int LA2_19 = input.LA(5);

                                    if ( (LA2_19==18) ) {
                                        switch ( input.LA(6) ) {
                                            case 37:
                                                {
                                                int LA2_30 = input.LA(7);

                                                if ( (LA2_30==18) ) {
                                                    int LA2_36 = input.LA(8);

                                                    if ( (synpred2()) ) {
                                                        alt2=1;
                                                    }
                                                }
                                                }
                                                break;
                                            case 45:
                                                {
                                                int LA2_31 = input.LA(7);

                                                if ( (LA2_31==RULE_ID) ) {
                                                    int LA2_37 = input.LA(8);

                                                    if ( (LA2_37==19) ) {
                                                        int LA2_38 = input.LA(9);

                                                        if ( (synpred2()) ) {
                                                            alt2=1;
                                                        }
                                                    }
                                                }
                                                }
                                                break;
                                            case RULE_ID:
                                                {
                                                int LA2_32 = input.LA(7);

                                                if ( (LA2_32==19) ) {
                                                    int LA2_38 = input.LA(8);

                                                    if ( (synpred2()) ) {
                                                        alt2=1;
                                                    }
                                                }
                                                }
                                                break;
                                        }

                                    }
                                    }
                                    break;
                                case 45:
                                    {
                                    int LA2_20 = input.LA(5);

                                    if ( (LA2_20==RULE_ID) ) {
                                        int LA2_26 = input.LA(6);

                                        if ( (synpred2()) ) {
                                            alt2=1;
                                        }
                                    }
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA2_21 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                                case RULE_HOSTCODE:
                                    {
                                    int LA2_22 = input.LA(5);

                                    if ( (synpred2()) ) {
                                        alt2=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case RULE_INT:
                            {
                            int LA2_6 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case RULE_FLOAT:
                            {
                            int LA2_7 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case 18:
                            {
                            int LA2_8 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case RULE_BOOLEAN:
                            {
                            int LA2_9 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case 37:
                            {
                            int LA2_10 = input.LA(4);

                            if ( (LA2_10==18) ) {
                                switch ( input.LA(5) ) {
                                    case 37:
                                        {
                                        int LA2_27 = input.LA(6);

                                        if ( (LA2_27==18) ) {
                                            int LA2_33 = input.LA(7);

                                            if ( (synpred2()) ) {
                                                alt2=1;
                                            }
                                        }
                                        }
                                        break;
                                    case 45:
                                        {
                                        int LA2_28 = input.LA(6);

                                        if ( (LA2_28==RULE_ID) ) {
                                            int LA2_34 = input.LA(7);

                                            if ( (LA2_34==19) ) {
                                                int LA2_35 = input.LA(8);

                                                if ( (synpred2()) ) {
                                                    alt2=1;
                                                }
                                            }
                                        }
                                        }
                                        break;
                                    case RULE_ID:
                                        {
                                        int LA2_29 = input.LA(6);

                                        if ( (LA2_29==19) ) {
                                            int LA2_35 = input.LA(7);

                                            if ( (synpred2()) ) {
                                                alt2=1;
                                            }
                                        }
                                        }
                                        break;
                                }

                            }
                            }
                            break;
                        case 45:
                            {
                            int LA2_11 = input.LA(4);

                            if ( (LA2_11==RULE_ID) ) {
                                int LA2_24 = input.LA(5);

                                if ( (synpred2()) ) {
                                    alt2=1;
                                }
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA2_12 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case RULE_HOSTCODE:
                            {
                            int LA2_13 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }
                            }
                            break;
                    }

                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_INT && LA2_1<=RULE_BOOLEAN)||LA2_1==16||LA2_1==18||LA2_1==37||LA2_1==40||LA2_1==45) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:136:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition177); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_0(), "delay"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
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

            if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_BOOLEAN)||LA3_0==18||LA3_0==37||LA3_0==40||LA3_0==42||LA3_0==45) ) {
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
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleTransition204);
                    lv_trigger_3_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:182:3: ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:182:5: '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    match(input,16,FOLLOW_16_in_ruleTransition216); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:186:1: ( (lv_effects_5_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:187:1: (lv_effects_5_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:187:1: (lv_effects_5_0= ruleEffect )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:188:3: lv_effects_5_0= ruleEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEffect_in_ruleTransition237);
                    lv_effects_5_0=ruleEffect();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:210:2: ( ',' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:210:4: ',' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleTransition248); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:214:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:215:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:215:1: (lv_effects_7_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:216:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleTransition269);
                    	    lv_effects_7_0=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"effects",
                    	      	        		lv_effects_7_0, 
                    	      	        		"Effect", 
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
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:248:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:249:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:250:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect311);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect321); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:257:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:262:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:263:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:263:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||(LA6_1>=17 && LA6_1<=18)) ) {
                    alt6=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("263:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_HOSTCODE) ) {
                alt6=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("263:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:264:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect371);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:277:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect401);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:290:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextEffect_in_ruleEffect431);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:309:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:310:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:311:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission466);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission476); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:318:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:323:6: ( ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:324:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:324:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:324:2: ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:324:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:325:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:325:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:326:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission523); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:341:2: ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:341:4: '(' ( (lv_newValue_2_0= ruleExpression ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleEmission534); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:345:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:346:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:346:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:347:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleEmission555);
                    lv_newValue_2_0=ruleExpression();
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
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleEmission565); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:381:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:382:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:383:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment603);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment613); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:390:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:395:6: ( ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:396:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:396:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:396:2: ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:396:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:397:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:397:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:398:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment660); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,20,FOLLOW_20_in_ruleAssignment670); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:417:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:418:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:418:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:419:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment691);
            lv_expression_2_0=ruleExpression();
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:449:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:450:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:451:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextEffect_in_entryRuleTextEffect727);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextEffect737); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:458:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:463:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:464:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:464:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:464:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:464:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:465:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:465:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:466:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextEffect779); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextEffectAccess().getCodeHOSTCODETerminalRuleCall_0_0(), "code"); 
              		
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
              	        		"HOSTCODE", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:488:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:488:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleTextEffect795); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:492:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:493:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:493:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:494:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextEffect812); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleTextEffect827); if (failed) return current;
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


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:530:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:531:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:532:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression867);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression877); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:539:1: ruleExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:544:6: ( (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:545:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:545:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:546:2: this_BooleanExpression_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleExpression927);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:559:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleExpression957);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:578:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:579:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:580:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression992);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression1002); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:587:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:592:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:594:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleBooleanExpression1051);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:613:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:614:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:615:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1085);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1095); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:622:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:627:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:628:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:628:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:629:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1145);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:640:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:640:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:640:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:641:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:659:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:660:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:660:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:661:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrOperator_in_ruleOrExpression1178);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:683:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:684:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:684:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:685:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1199);
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
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:715:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:716:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:717:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1237);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1247); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:724:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:729:6: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:730:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:730:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:731:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_ruleAndExpression1297);
            this_CompareOperation_0=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:742:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==39) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:742:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:742:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:743:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:761:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:762:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:762:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:763:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleAndExpression1330);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:785:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:786:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:786:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:787:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOperation_in_ruleAndExpression1351);
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
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:817:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:818:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:819:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1389);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation1399); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:826:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:831:6: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 42:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred13()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                switch ( input.LA(2) ) {
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 41:
                case 42:
                case 43:
                case 44:
                    {
                    alt12=1;
                    }
                    break;
                case EOF:
                case 16:
                case 17:
                case 19:
                case 38:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                case 26:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA12_22 = input.LA(4);

                        if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                            alt12=2;
                        }
                        else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                            alt12=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_HOSTCODE:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 18:
                    case 37:
                    case 42:
                    case 45:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 3, input);

                    throw nvae;
                }

                }
                break;
            case 37:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==18) ) {
                    switch ( input.LA(3) ) {
                    case 37:
                        {
                        int LA12_23 = input.LA(4);

                        if ( (LA12_23==18) ) {
                            int LA12_30 = input.LA(5);

                            if ( (synpred13()) ) {
                                alt12=1;
                            }
                            else if ( (true) ) {
                                alt12=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 45:
                        {
                        int LA12_24 = input.LA(4);

                        if ( (LA12_24==RULE_ID) ) {
                            int LA12_31 = input.LA(5);

                            if ( (LA12_31==19) ) {
                                switch ( input.LA(6) ) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                case 26:
                                    {
                                    switch ( input.LA(7) ) {
                                    case 28:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                        {
                                        alt12=2;
                                        }
                                        break;
                                    case RULE_ID:
                                        {
                                        int LA12_22 = input.LA(8);

                                        if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                                            alt12=2;
                                        }
                                        else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                                            alt12=1;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                                            throw nvae;
                                        }
                                        }
                                        break;
                                    case RULE_INT:
                                    case RULE_HOSTCODE:
                                    case RULE_FLOAT:
                                    case RULE_BOOLEAN:
                                    case 18:
                                    case 37:
                                    case 42:
                                    case 45:
                                        {
                                        alt12=1;
                                        }
                                        break;
                                    default:
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                                        throw nvae;
                                    }

                                    }
                                    break;
                                case EOF:
                                case 16:
                                case 17:
                                case 19:
                                case 38:
                                case 39:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 32, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 31, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA12_25 = input.LA(4);

                        if ( (LA12_25==19) ) {
                            switch ( input.LA(5) ) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                                {
                                alt12=1;
                                }
                                break;
                            case 26:
                                {
                                switch ( input.LA(6) ) {
                                case 28:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA12_22 = input.LA(7);

                                    if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                                        alt12=2;
                                    }
                                    else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                                        alt12=1;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case RULE_INT:
                                case RULE_HOSTCODE:
                                case RULE_FLOAT:
                                case RULE_BOOLEAN:
                                case 18:
                                case 37:
                                case 42:
                                case 45:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                                    throw nvae;
                                }

                                }
                                break;
                            case EOF:
                            case 16:
                            case 17:
                            case 19:
                            case 38:
                            case 39:
                                {
                                alt12=2;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 32, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 12, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA12_5 = input.LA(2);

                if ( (LA12_5==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        {
                        alt12=1;
                        }
                        break;
                    case EOF:
                    case 16:
                    case 17:
                    case 19:
                    case 38:
                    case 39:
                        {
                        alt12=2;
                        }
                        break;
                    case 26:
                        {
                        switch ( input.LA(4) ) {
                        case 28:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                            {
                            alt12=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA12_22 = input.LA(5);

                            if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                                alt12=2;
                            }
                            else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                                alt12=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_INT:
                        case RULE_HOSTCODE:
                        case RULE_FLOAT:
                        case RULE_BOOLEAN:
                        case 18:
                        case 37:
                        case 42:
                        case 45:
                            {
                            alt12=1;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 13, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 41:
                case 42:
                case 43:
                case 44:
                    {
                    alt12=1;
                    }
                    break;
                case 26:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA12_22 = input.LA(4);

                        if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                            alt12=2;
                        }
                        else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                            alt12=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_HOSTCODE:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 18:
                    case 37:
                    case 42:
                    case 45:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case 16:
                case 17:
                case 19:
                case 38:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_HOSTCODE:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    int LA12_14 = input.LA(3);

                    if ( (LA12_14==RULE_ID) ) {
                        int LA12_26 = input.LA(4);

                        if ( (LA12_26==19) ) {
                            switch ( input.LA(5) ) {
                            case EOF:
                            case 16:
                            case 17:
                            case 19:
                            case 38:
                            case 39:
                                {
                                alt12=2;
                                }
                                break;
                            case 26:
                                {
                                switch ( input.LA(6) ) {
                                case 28:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    {
                                    alt12=2;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA12_22 = input.LA(7);

                                    if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                                        alt12=2;
                                    }
                                    else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                                        alt12=1;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case RULE_INT:
                                case RULE_HOSTCODE:
                                case RULE_FLOAT:
                                case RULE_BOOLEAN:
                                case 18:
                                case 37:
                                case 42:
                                case 45:
                                    {
                                    alt12=1;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                                    throw nvae;
                                }

                                }
                                break;
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                                {
                                alt12=1;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 33, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 26, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 16:
                case 17:
                case 19:
                case 38:
                case 39:
                    {
                    alt12=2;
                    }
                    break;
                case 26:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        {
                        alt12=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA12_22 = input.LA(4);

                        if ( (LA12_22==EOF||LA12_22==17||LA12_22==22) ) {
                            alt12=2;
                        }
                        else if ( ((LA12_22>=31 && LA12_22<=36)||(LA12_22>=41 && LA12_22<=44)) ) {
                            alt12=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                    case RULE_HOSTCODE:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 18:
                    case 37:
                    case 42:
                    case 45:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 41:
                case 42:
                case 43:
                case 44:
                    {
                    alt12=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 7, input);

                    throw nvae;
                }

                }
                break;
            case 40:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    int LA12_15 = input.LA(3);

                    if ( (synpred13()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    int LA12_16 = input.LA(3);

                    if ( ((LA12_16>=31 && LA12_16<=36)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_16==EOF||(LA12_16>=16 && LA12_16<=17)||LA12_16==19||LA12_16==26||(LA12_16>=38 && LA12_16<=39)) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA12_17 = input.LA(3);

                    if ( (LA12_17==18) ) {
                        switch ( input.LA(4) ) {
                        case 37:
                            {
                            int LA12_34 = input.LA(5);

                            if ( (LA12_34==18) ) {
                                int LA12_38 = input.LA(6);

                                if ( (synpred13()) ) {
                                    alt12=1;
                                }
                                else if ( (true) ) {
                                    alt12=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 38, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 45:
                            {
                            int LA12_35 = input.LA(5);

                            if ( (LA12_35==RULE_ID) ) {
                                int LA12_39 = input.LA(6);

                                if ( (LA12_39==19) ) {
                                    int LA12_40 = input.LA(7);

                                    if ( ((LA12_40>=31 && LA12_40<=36)) ) {
                                        alt12=1;
                                    }
                                    else if ( (LA12_40==EOF||(LA12_40>=16 && LA12_40<=17)||LA12_40==19||LA12_40==26||(LA12_40>=38 && LA12_40<=39)) ) {
                                        alt12=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 40, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 39, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 35, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA12_36 = input.LA(5);

                            if ( (LA12_36==19) ) {
                                int LA12_40 = input.LA(6);

                                if ( ((LA12_40>=31 && LA12_40<=36)) ) {
                                    alt12=1;
                                }
                                else if ( (LA12_40==EOF||(LA12_40>=16 && LA12_40<=17)||LA12_40==19||LA12_40==26||(LA12_40>=38 && LA12_40<=39)) ) {
                                    alt12=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 40, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 36, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 27, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA12_18 = input.LA(3);

                    if ( (LA12_18==RULE_ID) ) {
                        int LA12_28 = input.LA(4);

                        if ( ((LA12_28>=31 && LA12_28<=36)) ) {
                            alt12=1;
                        }
                        else if ( (LA12_28==EOF||(LA12_28>=16 && LA12_28<=17)||LA12_28==19||LA12_28==26||(LA12_28>=38 && LA12_28<=39)) ) {
                            alt12=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 28, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA12_19 = input.LA(3);

                    if ( (LA12_19==EOF||(LA12_19>=16 && LA12_19<=17)||LA12_19==19||LA12_19==26||(LA12_19>=38 && LA12_19<=39)) ) {
                        alt12=2;
                    }
                    else if ( ((LA12_19>=31 && LA12_19<=36)) ) {
                        alt12=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    int LA12_20 = input.LA(3);

                    if ( (synpred13()) ) {
                        alt12=1;
                    }
                    else if ( (true) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HOSTCODE:
                    {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        int LA12_29 = input.LA(4);

                        if ( (LA12_29==RULE_ID) ) {
                            int LA12_37 = input.LA(5);

                            if ( (LA12_37==19) ) {
                                int LA12_41 = input.LA(6);

                                if ( ((LA12_41>=31 && LA12_41<=36)) ) {
                                    alt12=1;
                                }
                                else if ( (LA12_41==EOF||(LA12_41>=16 && LA12_41<=17)||LA12_41==19||LA12_41==26||(LA12_41>=38 && LA12_41<=39)) ) {
                                    alt12=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 41, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 37, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        {
                        alt12=1;
                        }
                        break;
                    case EOF:
                    case 16:
                    case 17:
                    case 19:
                    case 26:
                    case 38:
                    case 39:
                        {
                        alt12=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 21, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("832:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:833:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1450);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:845:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:863:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:864:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:864:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:865:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation1483);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:887:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:888:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:888:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:889:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1504);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:913:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleCompareOperation1537);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:932:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:933:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:934:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1572);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrValuedExpression1582); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:941:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:946:6: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt13=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 42:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                int LA13_2 = input.LA(2);

                if ( (synpred14()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA13_3 = input.LA(2);

                if ( (synpred14()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA13_4 = input.LA(2);

                if ( (LA13_4==18) ) {
                    switch ( input.LA(3) ) {
                    case 37:
                        {
                        int LA13_11 = input.LA(4);

                        if ( (LA13_11==18) ) {
                            int LA13_14 = input.LA(5);

                            if ( (synpred14()) ) {
                                alt13=1;
                            }
                            else if ( (true) ) {
                                alt13=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 45:
                        {
                        int LA13_12 = input.LA(4);

                        if ( (LA13_12==RULE_ID) ) {
                            int LA13_15 = input.LA(5);

                            if ( (LA13_15==19) ) {
                                int LA13_16 = input.LA(6);

                                if ( (synpred14()) ) {
                                    alt13=1;
                                }
                                else if ( (true) ) {
                                    alt13=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA13_13 = input.LA(4);

                        if ( (LA13_13==19) ) {
                            int LA13_16 = input.LA(5);

                            if ( (synpred14()) ) {
                                alt13=1;
                            }
                            else if ( (true) ) {
                                alt13=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 9, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 4, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA13_5 = input.LA(2);

                if ( (LA13_5==RULE_ID) ) {
                    int LA13_10 = input.LA(3);

                    if ( (synpred14()) ) {
                        alt13=1;
                    }
                    else if ( (true) ) {
                        alt13=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA13_6 = input.LA(2);

                if ( (synpred14()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                int LA13_7 = input.LA(2);

                if ( (synpred14()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 7, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt13=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("947:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:948:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression1632);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:961:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1662);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:980:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:981:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:982:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression1697);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression1707); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:989:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:994:6: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:995:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:995:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_HOSTCODE)||LA14_0==RULE_BOOLEAN||LA14_0==18||LA14_0==37||LA14_0==45) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("995:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:995:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:995:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:995:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:995:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:996:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1009:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1010:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1010:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1011:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotOperator_in_ruleNotExpression1766);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1033:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1034:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1034:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1035:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleNotExpression1787);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1059:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleNotExpression1819);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1078:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1079:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1080:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1854);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedExpression1864); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1087:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1092:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1094:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddExpression_in_ruleValuedExpression1913);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1113:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1114:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1115:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression1947);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression1957); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1122:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1127:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1128:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1128:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1129:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression2007);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1140:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1140:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1140:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1141:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1159:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1160:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1160:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1161:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOperator_in_ruleAddExpression2040);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1183:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1184:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1184:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1185:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubExpression_in_ruleAddExpression2061);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1215:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1216:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1217:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSubExpression_in_entryRuleSubExpression2099);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubExpression2109); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1224:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1229:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1230:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1230:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1231:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression2159);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1242:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1242:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1242:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1243:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1261:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1262:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1262:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1263:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSubOperator_in_ruleSubExpression2192);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1285:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1286:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1286:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1287:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultExpression_in_ruleSubExpression2213);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1317:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1318:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1319:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultExpression_in_entryRuleMultExpression2251);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultExpression2261); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1326:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1331:6: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1332:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1332:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1333:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression2311);
            this_DivExpression_0=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1344:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1344:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1344:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1345:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1363:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1364:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1364:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1365:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultExpression2344);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1387:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1388:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1388:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1389:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivExpression_in_ruleMultExpression2365);
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


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1419:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1420:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1421:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivExpression_in_entryRuleDivExpression2403);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivExpression2413); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1428:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1433:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1434:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1434:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1435:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression2463);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                        case EOF:
                            {
                            int LA18_5 = input.LA(4);

                            if ( (LA18_5==EOF) ) {
                                int LA18_53 = input.LA(5);


                            }
                            }
                            break;
                        case 17:
                            {
                            int LA18_6 = input.LA(4);

                            if ( (LA18_6==RULE_ID) ) {
                                int LA18_7 = input.LA(5);

                                if ( (synpred19()) ) {
                                    alt18=1;
                                }
                            }
                            else if ( (LA18_6==RULE_HOSTCODE) ) {
                                alt18=1;
                            }
                            }
                            break;
                        case 16:
                        case 19:
                        case 26:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 38:
                        case 39:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                            {
                            alt18=1;
                            }
                            break;
                    }

                }
                else if ( (LA18_1==RULE_INT||(LA18_1>=RULE_HOSTCODE && LA18_1<=RULE_BOOLEAN)||LA18_1==18||LA18_1==37||LA18_1==42||LA18_1==45) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1447:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1465:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1466:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1466:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1467:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivExpression2496);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1489:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1490:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1490:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1491:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModExpression_in_ruleDivExpression2517);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1521:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1522:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1523:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModExpression_in_entryRuleModExpression2555);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModExpression2565); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1530:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1535:6: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1536:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1536:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1537:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNegExpression_in_ruleModExpression2615);
            this_NegExpression_0=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1548:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1548:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1548:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1549:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1567:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1568:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1568:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1569:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModOperator_in_ruleModExpression2648);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1591:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1592:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1592:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1593:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2669);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1623:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1624:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1625:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNegExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNegExpression_in_entryRuleNegExpression2707);
            iv_ruleNegExpression=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegExpression2717); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1632:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1637:6: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1638:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1638:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_BOOLEAN)||LA20_0==18||LA20_0==37||LA20_0==45) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1638:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1638:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1638:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1638:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1638:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1639:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1652:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1653:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1653:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1654:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubOperator_in_ruleNegExpression2776);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1676:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1677:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1677:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1678:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNegExpression_in_ruleNegExpression2797);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1702:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression2829);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1721:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1722:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1723:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2864);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpression2874); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1730:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_TextExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1735:6: ( (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1736:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1736:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
            case 37:
            case 45:
                {
                alt21=2;
                }
                break;
            case 18:
                {
                alt21=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt21=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1736:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1737:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleAtomicExpression2924);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1750:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2954);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1762:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1762:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1762:8: '(' this_BooleanExpression_3= ruleBooleanExpression ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleAtomicExpression2970); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression2995);
                    this_BooleanExpression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleAtomicExpression3004); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1784:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTextExpression_in_ruleAtomicExpression3036);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1803:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1804:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1805:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3071);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicValuedExpression3081); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1812:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1817:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1818:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1818:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt22=2;
                }
                break;
            case 18:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred27()) ) {
                    alt22=3;
                }
                else if ( (true) ) {
                    alt22=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1818:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 22, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_HOSTCODE:
            case RULE_BOOLEAN:
            case 37:
            case 45:
                {
                alt22=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1818:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1819:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3131);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1832:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3161);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:8: '(' this_ValuedExpression_3= ruleValuedExpression ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleAtomicValuedExpression3177); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3202);
                    this_ValuedExpression_3=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleAtomicValuedExpression3211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1866:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3243);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1885:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1886:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1887:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3278);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3288); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1894:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        EObject lv_subExpressions_7_0 = null;

        EObject this_ValuedObjectReference_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1899:6: ( ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 45:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                alt23=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1900:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:3: () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1900:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1901:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1914:2: ( (lv_operator_1_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1915:1: (lv_operator_1_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1915:1: (lv_operator_1_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1916:3: lv_operator_1_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3347);
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

                    match(input,18,FOLLOW_18_in_ruleValuedObjectTestExpression3357); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1942:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1943:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1943:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1944:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3378);
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

                    match(input,19,FOLLOW_19_in_ruleValuedObjectTestExpression3388); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1971:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1971:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1971:7: () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1971:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1972:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1985:2: ( (lv_operator_6_0= ruleValueTestOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1986:1: (lv_operator_6_0= ruleValueTestOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1986:1: (lv_operator_6_0= ruleValueTestOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1987:3: lv_operator_6_0= ruleValueTestOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression3429);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2009:2: ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2010:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2010:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2011:3: lv_subExpressions_7_0= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3450);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2035:2: this_ValuedObjectReference_8= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3482);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2054:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2055:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2056:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3517);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObjectReference3527); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2063:1: ruleValuedObjectReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2068:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2069:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2069:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2070:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2070:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2071:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuedObjectReference3573); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2094:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2095:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2096:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextExpression_in_entryRuleTextExpression3608);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextExpression3618); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2103:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2108:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2109:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2109:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2109:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2109:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2110:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2110:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2111:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FOLLOW_RULE_HOSTCODE_in_ruleTextExpression3660); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2133:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2133:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleTextExpression3676); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2137:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2138:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2138:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2139:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextExpression3693); if (failed) return current;
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

                    match(input,19,FOLLOW_19_in_ruleTextExpression3708); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2173:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2174:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2175:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue3746);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue3756); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2182:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2187:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2188:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2188:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2189:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2189:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2190:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue3797); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2220:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2221:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2222:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue3837);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue3847); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2229:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2234:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2235:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2235:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2236:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2236:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2237:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue3888); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2267:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2268:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2269:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3928);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3938); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2276:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2281:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2282:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2282:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2283:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2283:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2284:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3979); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2316:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2317:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2318:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration4021);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceDeclaration4031); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2325:1: ruleInterfaceDeclaration returns [EObject current=null] : (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceSignalDecl_0 = null;

        EObject this_InterfaceVariableDecl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2330:6: ( (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2331:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2331:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21||(LA25_0>=23 && LA25_0<=25)) ) {
                alt25=1;
            }
            else if ( (LA25_0==27) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2331:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2332:2: this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceSignalDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration4081);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2345:2: this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceVariableDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration4111);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2364:1: entryRuleISignal returns [EObject current=null] : iv_ruleISignal= ruleISignal EOF ;
    public final EObject entryRuleISignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleISignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2365:2: (iv_ruleISignal= ruleISignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2366:2: iv_ruleISignal= ruleISignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getISignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleISignal_in_entryRuleISignal4146);
            iv_ruleISignal=ruleISignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleISignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleISignal4156); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2373:1: ruleISignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) ;
    public final EObject ruleISignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_channelDescr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2378:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2379:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2379:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2379:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2379:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2380:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2380:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2381:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleISignal4198); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2403:2: ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18||LA26_0==20||LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2404:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2404:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2405:3: lv_channelDescr_1_0= ruleChannelDescription
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getISignalAccess().getChannelDescrChannelDescriptionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleChannelDescription_in_ruleISignal4224);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2435:1: entryRuleInterfaceSignalDecl returns [EObject current=null] : iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF ;
    public final EObject entryRuleInterfaceSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2436:2: (iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2437:2: iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl4261);
            iv_ruleInterfaceSignalDecl=ruleInterfaceSignalDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceSignalDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceSignalDecl4271); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2444:1: ruleInterfaceSignalDecl returns [EObject current=null] : ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) ;
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
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2449:6: ( ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt31=1;
                }
                break;
            case 23:
                {
                alt31=2;
                }
                break;
            case 24:
                {
                alt31=3;
                }
                break;
            case 25:
                {
                alt31=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2450:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:3: () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2450:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2451:2: 
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

                    match(input,21,FOLLOW_21_in_ruleInterfaceSignalDecl4319); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2468:1: ( (lv_signals_2_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2469:1: (lv_signals_2_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2469:1: (lv_signals_2_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2470:3: lv_signals_2_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4340);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2492:2: ( ',' ( (lv_signals_4_0= ruleISignal ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2492:4: ',' ( (lv_signals_4_0= ruleISignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleInterfaceSignalDecl4351); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2496:1: ( (lv_signals_4_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2497:1: (lv_signals_4_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2497:1: (lv_signals_4_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2498:3: lv_signals_4_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4372);
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
                    	    break loop27;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleInterfaceSignalDecl4384); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:7: () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2525:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2526:2: 
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

                    match(input,23,FOLLOW_23_in_ruleInterfaceSignalDecl4414); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2543:1: ( (lv_signals_8_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2544:1: (lv_signals_8_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2544:1: (lv_signals_8_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2545:3: lv_signals_8_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4435);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2567:2: ( ',' ( (lv_signals_10_0= ruleISignal ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2567:4: ',' ( (lv_signals_10_0= ruleISignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleInterfaceSignalDecl4446); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2571:1: ( (lv_signals_10_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2572:1: (lv_signals_10_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2572:1: (lv_signals_10_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2573:3: lv_signals_10_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4467);
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
                    	    break loop28;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleInterfaceSignalDecl4479); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2600:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2600:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2600:7: () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2600:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2601:2: 
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

                    match(input,24,FOLLOW_24_in_ruleInterfaceSignalDecl4509); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2618:1: ( (lv_signals_14_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2619:1: (lv_signals_14_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2619:1: (lv_signals_14_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2620:3: lv_signals_14_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4530);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2642:2: ( ',' ( (lv_signals_16_0= ruleISignal ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==17) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2642:4: ',' ( (lv_signals_16_0= ruleISignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleInterfaceSignalDecl4541); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2646:1: ( (lv_signals_16_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2647:1: (lv_signals_16_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2647:1: (lv_signals_16_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2648:3: lv_signals_16_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4562);
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
                    	    break loop29;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleInterfaceSignalDecl4574); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2675:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2675:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2675:7: () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2675:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2676:2: 
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

                    match(input,25,FOLLOW_25_in_ruleInterfaceSignalDecl4604); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2693:1: ( (lv_signals_20_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2694:1: (lv_signals_20_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2694:1: (lv_signals_20_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2695:3: lv_signals_20_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4625);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2717:2: ( ',' ( (lv_signals_22_0= ruleISignal ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==17) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2717:4: ',' ( (lv_signals_22_0= ruleISignal ) )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleInterfaceSignalDecl4636); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2721:1: ( (lv_signals_22_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2722:1: (lv_signals_22_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2722:1: (lv_signals_22_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2723:3: lv_signals_22_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4657);
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
                    	    break loop30;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_ruleInterfaceSignalDecl4669); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2757:1: entryRuleChannelDescription returns [EObject current=null] : iv_ruleChannelDescription= ruleChannelDescription EOF ;
    public final EObject entryRuleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDescription = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2758:2: (iv_ruleChannelDescription= ruleChannelDescription EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2759:2: iv_ruleChannelDescription= ruleChannelDescription EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getChannelDescriptionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription4706);
            iv_ruleChannelDescription=ruleChannelDescription();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleChannelDescription; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelDescription4716); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2766:1: ruleChannelDescription returns [EObject current=null] : ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) ;
    public final EObject ruleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_type_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2771:6: ( ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2772:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2772:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt32=1;
                }
                break;
            case 18:
                {
                alt32=2;
                }
                break;
            case 20:
                {
                alt32=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2772:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2772:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2772:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2772:4: ':' ( (lv_type_1_0= ruleTypeIdentifier ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleChannelDescription4752); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2776:1: ( (lv_type_1_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2777:1: (lv_type_1_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2777:1: (lv_type_1_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2778:3: lv_type_1_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4773);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2801:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2801:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2801:8: '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleChannelDescription4791); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2805:1: ( (lv_type_3_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2806:1: (lv_type_3_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2806:1: (lv_type_3_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2807:3: lv_type_3_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4812);
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

                    match(input,19,FOLLOW_19_in_ruleChannelDescription4822); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2834:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2834:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2834:8: ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleChannelDescription4840); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2838:1: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2839:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2839:1: (lv_expression_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2840:3: lv_expression_6_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleChannelDescription4861);
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

                    match(input,26,FOLLOW_26_in_ruleChannelDescription4871); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2866:1: ( (lv_type_8_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2867:1: (lv_type_8_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2867:1: (lv_type_8_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2868:3: lv_type_8_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4892);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2898:1: entryRuleInterfaceVariableDecl returns [EObject current=null] : iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF ;
    public final EObject entryRuleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2899:2: (iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2900:2: iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceVariableDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl4929);
            iv_ruleInterfaceVariableDecl=ruleInterfaceVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceVariableDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceVariableDecl4939); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2907:1: ruleInterfaceVariableDecl returns [EObject current=null] : ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) ;
    public final EObject ruleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecls_1_0 = null;

        EObject lv_varDecls_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2912:6: ( ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2913:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2913:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2913:3: 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            {
            match(input,27,FOLLOW_27_in_ruleInterfaceVariableDecl4974); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2917:1: ( (lv_varDecls_1_0= ruleVariableDecl ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2918:1: (lv_varDecls_1_0= ruleVariableDecl )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2918:1: (lv_varDecls_1_0= ruleVariableDecl )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2919:3: lv_varDecls_1_0= ruleVariableDecl
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl4995);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2941:2: ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2941:4: ',' ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleInterfaceVariableDecl5006); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2945:1: ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2946:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2946:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2947:3: lv_varDecls_3_0= ruleVariableDecl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl5027);
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
            	    break loop33;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2977:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2978:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2979:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl5065);
            iv_ruleVariableDecl=ruleVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDecl5075); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2986:1: ruleVariableDecl returns [EObject current=null] : ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2991:6: ( ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2992:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2992:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2992:2: ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2992:2: ( (lv_variables_0_0= ruleIVariable ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2993:1: (lv_variables_0_0= ruleIVariable )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2993:1: (lv_variables_0_0= ruleIVariable )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:2994:3: lv_variables_0_0= ruleIVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleIVariable_in_ruleVariableDecl5121);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3016:2: ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==17) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3016:4: ',' ( (lv_variables_2_0= ruleIVariable ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleVariableDecl5132); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3020:1: ( (lv_variables_2_0= ruleIVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3021:1: (lv_variables_2_0= ruleIVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3021:1: (lv_variables_2_0= ruleIVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3022:3: lv_variables_2_0= ruleIVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIVariable_in_ruleVariableDecl5153);
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
            	    break loop34;
                }
            } while (true);

            match(input,26,FOLLOW_26_in_ruleVariableDecl5165); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3048:1: ( (lv_type_4_0= ruleTypeIdentifier ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3049:1: (lv_type_4_0= ruleTypeIdentifier )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3049:1: (lv_type_4_0= ruleTypeIdentifier )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3050:3: lv_type_4_0= ruleTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getTypeTypeIdentifierParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl5186);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3080:1: entryRuleIVariable returns [EObject current=null] : iv_ruleIVariable= ruleIVariable EOF ;
    public final EObject entryRuleIVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3081:2: (iv_ruleIVariable= ruleIVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3082:2: iv_ruleIVariable= ruleIVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIVariable_in_entryRuleIVariable5222);
            iv_ruleIVariable=ruleIVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIVariable5232); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3089:1: ruleIVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleIVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3094:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3095:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3096:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3096:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3097:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIVariable5274); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3119:2: ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3119:4: ':=' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleIVariable5290); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3123:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3124:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3124:1: (lv_expression_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3125:3: lv_expression_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIVariableAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIVariable5311);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3155:1: entryRuleTypeIdentifier returns [EObject current=null] : iv_ruleTypeIdentifier= ruleTypeIdentifier EOF ;
    public final EObject entryRuleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdentifier = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3156:2: (iv_ruleTypeIdentifier= ruleTypeIdentifier EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3157:2: iv_ruleTypeIdentifier= ruleTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier5349);
            iv_ruleTypeIdentifier=ruleTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeIdentifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdentifier5359); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3164:1: ruleTypeIdentifier returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) ;
    public final EObject ruleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_typeID_1_0=null;
        Token lv_typeID_4_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_type_3_0 = null;

        Enumerator lv_operator_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3169:6: ( ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3170:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3170:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt37=1;
                }
                break;
            case RULE_ID:
                {
                alt37=2;
                }
                break;
            case 28:
                {
                alt37=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3170:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3170:2: ( (lv_type_0_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3170:2: ( (lv_type_0_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3171:1: (lv_type_0_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3171:1: (lv_type_0_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3172:3: lv_type_0_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleTypeIdentifier5405);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3195:6: ( (lv_typeID_1_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3195:6: ( (lv_typeID_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3196:1: (lv_typeID_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3196:1: (lv_typeID_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3197:3: lv_typeID_1_0= RULE_ID
                    {
                    lv_typeID_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeIdentifier5428); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3220:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3220:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3220:8: 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleTypeIdentifier5450); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3224:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=46 && LA36_0<=53)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_ID) ) {
                        alt36=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3224:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3224:2: ( (lv_type_3_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3224:2: ( (lv_type_3_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3225:1: (lv_type_3_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3225:1: (lv_type_3_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3226:3: lv_type_3_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleTypeIdentifier5472);
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3249:6: ( (lv_typeID_4_0= RULE_ID ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3249:6: ( (lv_typeID_4_0= RULE_ID ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3250:1: (lv_typeID_4_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3250:1: (lv_typeID_4_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3251:3: lv_typeID_4_0= RULE_ID
                            {
                            lv_typeID_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeIdentifier5495); if (failed) return current;
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

                    match(input,29,FOLLOW_29_in_ruleTypeIdentifier5511); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3277:1: ( (lv_operator_6_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3278:1: (lv_operator_6_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3278:1: (lv_operator_6_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3279:3: lv_operator_6_0= ruleCombineOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getOperatorCombineOperatorEnumRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier5532);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3311:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3312:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3313:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommentAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5571);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation5581); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3320:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3325:6: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3326:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3326:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3327:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3327:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3328:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5622); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3358:1: entryRuleKeyValueAnnotation returns [EObject current=null] : iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF ;
    public final EObject entryRuleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3359:2: (iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3360:2: iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyValueAnnotationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation5662);
            iv_ruleKeyValueAnnotation=ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyValueAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValueAnnotation5672); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3367:1: ruleKeyValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3372:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3373:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3373:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3373:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            match(input,30,FOLLOW_30_in_ruleKeyValueAnnotation5707); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3377:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3378:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3378:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3379:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyValueAnnotation5724); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3401:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3402:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3402:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3403:3: lv_value_2_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleEString_in_ruleKeyValueAnnotation5750);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3435:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3436:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3437:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString5789);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString5800); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3444:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3449:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3450:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3450:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3450:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3450:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString5840); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3458:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString5866); if (failed) return current;
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


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3473:1: ruleDivOperator returns [Enumerator current=null] : ( ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3477:6: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3478:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3478:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3478:3: ':'
            {
            match(input,26,FOLLOW_26_in_ruleDivOperator5922); if (failed) return current;
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


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3488:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3492:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3493:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3493:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt39=1;
                }
                break;
            case 32:
                {
                alt39=2;
                }
                break;
            case 33:
                {
                alt39=3;
                }
                break;
            case 34:
                {
                alt39=4;
                }
                break;
            case 35:
                {
                alt39=5;
                }
                break;
            case 36:
                {
                alt39=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3493:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3493:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3493:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3493:4: '='
                    {
                    match(input,31,FOLLOW_31_in_ruleCompareOperator5964); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3499:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3499:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3499:8: '<'
                    {
                    match(input,32,FOLLOW_32_in_ruleCompareOperator5979); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3505:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3505:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3505:8: '<='
                    {
                    match(input,33,FOLLOW_33_in_ruleCompareOperator5994); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3511:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3511:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3511:8: '>'
                    {
                    match(input,34,FOLLOW_34_in_ruleCompareOperator6009); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3517:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3517:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3517:8: '>='
                    {
                    match(input,35,FOLLOW_35_in_ruleCompareOperator6024); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3523:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3523:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3523:8: '<>'
                    {
                    match(input,36,FOLLOW_36_in_ruleCompareOperator6039); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3533:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3537:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3538:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3538:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3538:3: 'pre'
            {
            match(input,37,FOLLOW_37_in_rulePreOperator6081); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3548:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3552:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3553:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3553:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3553:3: 'or'
            {
            match(input,38,FOLLOW_38_in_ruleOrOperator6122); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3563:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3567:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3568:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3568:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3568:3: 'and'
            {
            match(input,39,FOLLOW_39_in_ruleAndOperator6163); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3578:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3582:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3583:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3583:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3583:3: 'not'
            {
            match(input,40,FOLLOW_40_in_ruleNotOperator6204); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3593:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3597:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3598:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3598:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3598:3: '+'
            {
            match(input,41,FOLLOW_41_in_ruleAddOperator6245); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3608:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3612:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3613:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3613:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3613:3: '-'
            {
            match(input,42,FOLLOW_42_in_ruleSubOperator6286); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3623:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3627:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3628:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3628:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3628:3: '*'
            {
            match(input,43,FOLLOW_43_in_ruleMultOperator6327); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3638:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3642:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3643:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3643:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3643:3: 'mod'
            {
            match(input,44,FOLLOW_44_in_ruleModOperator6368); if (failed) return current;
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


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3653:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3657:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3658:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3658:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3658:3: '?'
            {
            match(input,45,FOLLOW_45_in_ruleValueTestOperator6409); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3668:1: ruleValueType returns [Enumerator current=null] : ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3672:6: ( ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3673:1: ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3673:1: ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) )
            int alt40=8;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt40=1;
                }
                break;
            case 47:
                {
                alt40=2;
                }
                break;
            case 48:
                {
                alt40=3;
                }
                break;
            case 49:
                {
                alt40=4;
                }
                break;
            case 50:
                {
                alt40=5;
                }
                break;
            case 51:
                {
                alt40=6;
                }
                break;
            case 52:
                {
                alt40=7;
                }
                break;
            case 53:
                {
                alt40=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3673:1: ( ( 'pure' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'double' ) | ( 'string' ) | ( 'host' ) )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3673:2: ( 'pure' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3673:2: ( 'pure' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3673:4: 'pure'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType6451); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3679:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3679:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3679:8: 'boolean'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType6466); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3685:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3685:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3685:8: 'unsigned'
                    {
                    match(input,48,FOLLOW_48_in_ruleValueType6481); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3691:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3691:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3691:8: 'integer'
                    {
                    match(input,49,FOLLOW_49_in_ruleValueType6496); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3697:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3697:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3697:8: 'float'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType6511); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3703:6: ( 'double' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3703:6: ( 'double' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3703:8: 'double'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType6526); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3709:6: ( 'string' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3709:6: ( 'string' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3709:8: 'string'
                    {
                    match(input,52,FOLLOW_52_in_ruleValueType6541); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3715:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3715:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3715:8: 'host'
                    {
                    match(input,53,FOLLOW_53_in_ruleValueType6556); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7(), null); 
                          
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3725:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3729:6: ( ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3730:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3730:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt41=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt41=1;
                }
                break;
            case 41:
                {
                alt41=2;
                }
                break;
            case 43:
                {
                alt41=3;
                }
                break;
            case 55:
                {
                alt41=4;
                }
                break;
            case 56:
                {
                alt41=5;
                }
                break;
            case 38:
                {
                alt41=6;
                }
                break;
            case 39:
                {
                alt41=7;
                }
                break;
            case 53:
                {
                alt41=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3730:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3730:2: ( 'none' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3730:2: ( 'none' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3730:4: 'none'
                    {
                    match(input,54,FOLLOW_54_in_ruleCombineOperator6599); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3736:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3736:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3736:8: '+'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator6614); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3742:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3742:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3742:8: '*'
                    {
                    match(input,43,FOLLOW_43_in_ruleCombineOperator6629); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3748:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3748:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3748:8: 'max'
                    {
                    match(input,55,FOLLOW_55_in_ruleCombineOperator6644); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3754:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3754:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3754:8: 'min'
                    {
                    match(input,56,FOLLOW_56_in_ruleCombineOperator6659); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3760:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3760:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3760:8: 'or'
                    {
                    match(input,38,FOLLOW_38_in_ruleCombineOperator6674); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3766:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3766:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3766:8: 'and'
                    {
                    match(input,39,FOLLOW_39_in_ruleCombineOperator6689); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3772:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3772:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:3772:8: 'host'
                    {
                    match(input,53,FOLLOW_53_in_ruleCombineOperator6704); if (failed) return current;
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
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: ( ( RULE_INT ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: ( RULE_INT )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:135:1: ( RULE_INT )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:136:3: RULE_INT
        {
        match(input,RULE_INT,FOLLOW_RULE_INT_in_synpred2177); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:546:2: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:546:2: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred10927);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:2: ( ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:832:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:833:2: ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred131450);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:1: ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:2: () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:844:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:845:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:863:2: ( ( ruleCompareOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:864:1: ( ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:864:1: ( ruleCompareOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:865:3: ruleCompareOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleCompareOperator_in_synpred131483);
        ruleCompareOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:887:2: ( ( ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:888:1: ( ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:888:1: ( ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:889:3: ruleNotOrValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleNotOrValuedExpression_in_synpred131504);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:948:2: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:948:2: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred141632);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:2: ( () ( ( ruleDivOperator ) ) ( ( ruleModExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:2: () ( ( ruleDivOperator ) ) ( ( ruleModExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1446:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1447:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1465:2: ( ( ruleDivOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1466:1: ( ruleDivOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1466:1: ( ruleDivOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1467:3: ruleDivOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleDivOperator_in_synpred192496);
        ruleDivOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1489:2: ( ( ruleModExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1490:1: ( ruleModExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1490:1: ( ruleModExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1491:3: ruleModExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleModExpression_in_synpred192517);
        ruleModExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/actions/parser/antlr/internal/InternalActions.g:1844:8: '(' ruleValuedExpression ')'
        {
        match(input,18,FOLLOW_18_in_synpred273177); if (failed) return ;
        pushFollow(FOLLOW_ruleValuedExpression_in_synpred273202);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,19,FOLLOW_19_in_synpred273211); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred27

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
    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
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
    public final boolean synpred13() {
        backtracking++;
        int start = input.mark();
        try {
            synpred13_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\u03cf\uffff";
    static final String DFA9_eofS =
        "\2\uffff\2\31\10\uffff\2\31\1\uffff\1\31\2\uffff\2\31\11\uffff\1"+
        "\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\10\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\2\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\3\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\4\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\5\uffff\1\31\6\uffff\2\31\5\uffff\1\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\3\31\1\uffff\2\31\1\uffff\1\31\2\uffff\1\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\5\uffff"+
        "\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\5\uffff\1\31\3\uffff"+
        "\2\31\5\uffff\1\31\3\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\3\uffff\2\31\5\uffff\1\31\3\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\3\uffff"+
        "\1\31\3\uffff\2\31\5\uffff\1\31\3\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\3\uffff"+
        "\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff\2\31\4\uffff\1\31\3\uffff"+
        "\2\31\2\uffff\2\31\6\uffff\2\31\4\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\7\uffff\2\31\4\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\1\31\6\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\6\uffff\2\31\4\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\1\31\6\uffff\1\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\2\31\1\uffff\1\31\2\uffff\2\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\6\uffff\2\31\2\uffff\2\31\1\uffff\1\31\7\uffff\2\31\2\uffff"+
        "\2\31\1\uffff\1\31\7\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\2\uffff\1\31\3\uffff\2\31\2\uffff\2\31\1\uffff"+
        "\1\31\7\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\2\uffff\1\31\3\uffff\2\31\5\uffff\1\31\2\uffff\2\31\1\uffff"+
        "\1\31\2\uffff\2\31\2\uffff\1\31\2\uffff\2\31\1\uffff\1\31\2\uffff"+
        "\2\31\3\uffff\1\31\3\uffff\2\31\6\uffff\2\31\6\uffff\2\31\2\uffff"+
        "\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\2\31\12\uffff"+
        "\2\31\2\uffff\2\31\5\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff"+
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
    static final String DFA9_minS =
        "\2\4\2\21\2\0\1\22\1\5\2\0\1\uffff\1\0\2\21\1\0\1\21\1\22\1\5\2"+
        "\21\5\4\1\uffff\1\5\1\0\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21"+
        "\1\4\2\21\1\0\1\21\1\22\1\5\2\21\1\4\2\21\1\0\1\21\1\22\1\5\2\21"+
        "\1\4\2\21\1\0\1\21\1\22\1\5\2\21\1\4\2\21\1\0\1\21\1\22\1\5\2\21"+
        "\1\22\1\5\1\23\1\22\1\5\2\23\1\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22"+
        "\1\5\2\21\1\4\1\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\2\4\1"+
        "\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\3\4\1\5\1\21\1\5\1\0"+
        "\2\21\1\0\1\21\1\22\1\5\2\21\4\4\1\5\1\21\1\5\1\0\1\23\2\0\1\23"+
        "\2\21\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\22"+
        "\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\3\21\1\4\2\21\1\0"+
        "\1\21\1\22\1\5\1\21\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22"+
        "\1\5\3\21\1\4\2\21\1\0\1\21\1\22\1\5\1\21\1\4\2\21\1\0\1\21\1\22"+
        "\1\5\2\21\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\3\21"+
        "\1\4\2\21\1\0\1\21\1\22\1\5\1\21\1\4\2\21\1\0\1\21\1\22\1\5\2\21"+
        "\1\4\2\21\1\0\1\21\1\22\1\5\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\22"+
        "\1\5\2\23\1\5\1\21\1\5\1\0\1\23\2\21\1\22\1\5\2\23\1\5\1\21\1\5"+
        "\1\4\1\0\2\21\1\0\1\21\1\22\1\5\2\21\1\5\1\21\1\5\1\0\1\23\2\21"+
        "\1\22\1\5\2\23\1\5\1\21\1\5\1\4\1\0\2\21\1\0\1\21\1\22\1\5\2\21"+
        "\1\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\2\4\1\5\1\21\1\5\1"+
        "\0\1\23\2\21\1\22\1\5\2\23\1\5\1\21\1\5\1\4\1\0\2\21\1\0\1\21\1"+
        "\22\1\5\2\21\1\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\2\4\1"+
        "\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\3\4\1\5\1\21\1\5\1\0"+
        "\1\23\2\21\1\0\1\23\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\22\1\5\2"+
        "\23\2\21\1\0\1\21\1\22\1\5\2\21\1\5\1\21\1\5\1\22\1\5\2\23\1\0\1"+
        "\23\2\21\1\22\1\5\2\23\2\21\1\0\1\21\1\22\1\5\2\21\1\5\1\21\1\5"+
        "\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\4\2\21"+
        "\1\0\1\21\1\22\1\5\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\22\1\5\2\23"+
        "\2\21\1\0\1\21\1\22\1\5\2\21\1\5\1\21\1\5\1\22\1\5\2\23\1\5\1\21"+
        "\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\4\2\21\1\0\1\21\1\22\1\5\2\21"+
        "\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\4\2\21"+
        "\1\0\1\21\1\22\1\5\2\21\1\4\2\21\1\0\1\21\1\22\1\5\2\21\1\22\1\5"+
        "\2\23\1\0\1\23\2\21\1\0\1\23\2\21\1\5\1\21\1\5\1\22\1\5\2\23\1\0"+
        "\1\23\2\21\1\0\1\23\2\21\1\5\1\21\1\5\1\22\1\5\2\23\1\0\1\23\2\21"+
        "\1\22\1\5\2\23\1\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\1\4"+
        "\1\5\1\21\1\5\1\0\1\23\2\21\1\0\1\23\2\21\1\5\1\21\1\5\1\22\1\5"+
        "\2\23\1\0\1\23\2\21\1\22\1\5\2\23\1\5\1\21\1\5\1\0\2\21\1\0\1\21"+
        "\1\22\1\5\2\21\1\4\1\5\1\21\1\5\1\0\1\23\2\21\1\22\1\5\2\23\1\5"+
        "\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\1\4\1\5\1\21\1\5\1\0\2"+
        "\21\1\0\1\21\1\22\1\5\2\21\2\4\1\5\1\21\1\5\1\0\1\23\2\21\1\22\1"+
        "\5\2\23\1\0\1\23\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\0\1\23\2\21"+
        "\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\22\1\5"+
        "\2\23\1\22\1\5\2\23\1\0\1\23\2\21\1\0\1\23\2\21\1\22\1\5\2\23\1"+
        "\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\22\1\5\2\23\1\0\1\23\2"+
        "\21\1\22\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\22"+
        "\1\5\2\23\1\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\4\2\21\1\0"+
        "\1\21\1\22\1\5\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\0\1\23\2\21\1"+
        "\0\1\23\2\21\1\22\1\5\2\23\1\5\1\21\1\5\1\0\1\23\2\21\1\0\1\23\2"+
        "\21\1\0\1\23\2\21\1\22\1\5\2\23\1\5\1\21\1\5\1\0\1\23\2\21\1\0\1"+
        "\23\2\21\1\22\1\5\2\23\1\5\1\21\1\5\1\0\1\23\2\21\1\22\1\5\2\23"+
        "\1\5\1\21\1\5\1\0\2\21\1\0\1\21\1\22\1\5\2\21\1\4\1\5\1\21\1\5\1"+
        "\0\1\23\2\21\1\0\1\23\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\22\1\5"+
        "\2\23\1\0\1\23\2\21\1\22\1\5\2\23\1\0\1\23\2\21\1\22\1\5\2\23\1"+
        "\5\1\21\1\5\2\21\1\0\1\21\1\22\1\5\2\21\1\22\1\5\2\23\1\0\1\23\2"+
        "\21\1\0\1\23\2\21\1\0\1\23\2\21\1\0\1\23\2\21\1\22\1\5\2\23\1\5"+
        "\1\21\1\5\1\0\1\23\2\21\1\0\1\23\2\21\1\22\1\5\2\23\1\0\1\23\2\21";
    static final String DFA9_maxS =
        "\2\55\2\54\2\0\1\22\1\5\2\0\1\uffff\1\0\2\54\1\0\1\54\1\22\1\5\2"+
        "\54\1\55\1\65\3\55\1\uffff\1\55\1\0\1\55\1\54\1\5\2\53\1\0\1\53"+
        "\1\22\1\5\2\53\1\55\2\54\1\0\1\54\1\22\1\5\2\54\1\55\2\54\1\0\1"+
        "\54\1\22\1\5\2\54\1\55\2\54\1\0\1\54\1\22\1\5\2\54\1\55\2\54\1\0"+
        "\1\54\1\22\1\5\2\54\1\22\1\5\1\23\1\22\1\5\2\23\1\55\1\53\1\5\1"+
        "\0\2\54\1\0\1\54\1\22\1\5\2\54\2\55\1\54\1\5\1\0\2\54\1\0\1\54\1"+
        "\22\1\5\2\54\1\55\1\65\1\55\1\54\1\5\1\0\2\54\1\0\1\54\1\22\1\5"+
        "\2\54\1\55\1\65\2\55\1\54\1\5\1\0\2\54\1\0\1\54\1\22\1\5\2\54\1"+
        "\55\1\65\3\55\1\54\1\5\1\0\1\23\2\0\1\23\2\54\1\22\1\5\2\23\1\55"+
        "\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\22\1\5\2\23\1\55\1\54\1"+
        "\5\2\53\1\0\1\53\1\22\1\5\2\53\1\54\1\55\2\54\1\0\1\54\1\22\1\5"+
        "\1\54\1\22\1\5\2\23\1\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1"+
        "\54\1\55\2\54\1\0\1\54\1\22\1\5\1\54\1\55\2\54\1\0\1\54\1\22\1\5"+
        "\2\54\1\22\1\5\2\23\1\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1"+
        "\54\1\55\2\54\1\0\1\54\1\22\1\5\1\54\1\55\2\54\1\0\1\54\1\22\1\5"+
        "\2\54\1\55\2\54\1\0\1\54\1\22\1\5\2\54\1\22\1\5\2\23\1\0\1\23\2"+
        "\53\1\22\1\5\2\23\1\55\1\53\1\5\1\0\1\23\2\54\1\22\1\5\2\23\1\55"+
        "\1\53\1\5\1\55\1\0\2\54\1\0\1\54\1\22\1\5\2\54\1\55\1\54\1\5\1\0"+
        "\1\23\2\54\1\22\1\5\2\23\1\55\1\53\1\5\1\55\1\0\2\54\1\0\1\54\1"+
        "\22\1\5\2\54\1\55\1\54\1\5\1\0\2\54\1\0\1\54\1\22\1\5\2\54\1\55"+
        "\1\65\1\55\1\54\1\5\1\0\1\23\2\54\1\22\1\5\2\23\1\55\1\53\1\5\1"+
        "\55\1\0\2\54\1\0\1\54\1\22\1\5\2\54\1\55\1\54\1\5\1\0\2\54\1\0\1"+
        "\54\1\22\1\5\2\54\1\55\1\65\1\55\1\54\1\5\1\0\2\54\1\0\1\54\1\22"+
        "\1\5\2\54\1\55\1\65\2\55\1\54\1\5\1\0\1\23\2\54\1\0\1\23\2\54\1"+
        "\22\1\5\2\23\1\0\1\23\2\54\1\22\1\5\2\23\2\53\1\0\1\53\1\22\1\5"+
        "\2\53\1\55\1\54\1\5\1\22\1\5\2\23\1\0\1\23\2\54\1\22\1\5\2\23\2"+
        "\53\1\0\1\53\1\22\1\5\2\53\1\55\1\54\1\5\1\22\1\5\2\23\1\55\1\54"+
        "\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\55\2\54\1\0\1\54\1\22\1\5\2\54"+
        "\1\22\1\5\2\23\1\0\1\23\2\54\1\22\1\5\2\23\2\53\1\0\1\53\1\22\1"+
        "\5\2\53\1\55\1\54\1\5\1\22\1\5\2\23\1\55\1\54\1\5\2\53\1\0\1\53"+
        "\1\22\1\5\2\53\1\55\2\54\1\0\1\54\1\22\1\5\2\54\1\22\1\5\2\23\1"+
        "\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\55\2\54\1\0\1\54\1\22"+
        "\1\5\2\54\1\55\2\54\1\0\1\54\1\22\1\5\2\54\1\22\1\5\2\23\1\0\1\23"+
        "\2\53\1\0\1\23\2\53\1\55\1\53\1\5\1\22\1\5\2\23\1\0\1\23\2\54\1"+
        "\0\1\23\2\53\1\55\1\53\1\5\1\22\1\5\2\23\1\0\1\23\2\54\1\22\1\5"+
        "\2\23\1\55\1\53\1\5\1\0\2\54\1\0\1\54\1\22\1\5\2\54\2\55\1\54\1"+
        "\5\1\0\1\23\2\54\1\0\1\23\2\53\1\55\1\53\1\5\1\22\1\5\2\23\1\0\1"+
        "\23\2\54\1\22\1\5\2\23\1\55\1\53\1\5\1\0\2\54\1\0\1\54\1\22\1\5"+
        "\2\54\2\55\1\54\1\5\1\0\1\23\2\54\1\22\1\5\2\23\1\55\1\53\1\5\1"+
        "\0\2\54\1\0\1\54\1\22\1\5\2\54\2\55\1\54\1\5\1\0\2\54\1\0\1\54\1"+
        "\22\1\5\2\54\1\55\1\65\1\55\1\54\1\5\1\0\1\23\2\54\1\22\1\5\2\23"+
        "\1\0\1\23\2\54\1\22\1\5\2\23\1\0\1\23\2\54\1\0\1\23\2\54\1\22\1"+
        "\5\2\23\1\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\22\1\5\2\23"+
        "\1\22\1\5\2\23\1\0\1\23\2\54\1\0\1\23\2\54\1\22\1\5\2\23\1\55\1"+
        "\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\22\1\5\2\23\1\0\1\23\2\54"+
        "\1\22\1\5\2\23\1\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\22\1"+
        "\5\2\23\1\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\55\2\54\1\0"+
        "\1\54\1\22\1\5\2\54\1\22\1\5\2\23\1\0\1\23\2\53\1\0\1\23\2\53\1"+
        "\0\1\23\2\53\1\22\1\5\2\23\1\55\1\53\1\5\1\0\1\23\2\54\1\0\1\23"+
        "\2\53\1\0\1\23\2\53\1\22\1\5\2\23\1\55\1\53\1\5\1\0\1\23\2\54\1"+
        "\0\1\23\2\53\1\22\1\5\2\23\1\55\1\53\1\5\1\0\1\23\2\54\1\22\1\5"+
        "\2\23\1\55\1\53\1\5\1\0\2\54\1\0\1\54\1\22\1\5\2\54\2\55\1\54\1"+
        "\5\1\0\1\23\2\54\1\0\1\23\2\54\1\22\1\5\2\23\1\0\1\23\2\54\1\22"+
        "\1\5\2\23\1\0\1\23\2\54\1\22\1\5\2\23\1\0\1\23\2\54\1\22\1\5\2\23"+
        "\1\55\1\54\1\5\2\53\1\0\1\53\1\22\1\5\2\53\1\22\1\5\2\23\1\0\1\23"+
        "\2\53\1\0\1\23\2\53\1\0\1\23\2\53\1\0\1\23\2\53\1\22\1\5\2\23\1"+
        "\55\1\53\1\5\1\0\1\23\2\54\1\0\1\23\2\54\1\22\1\5\2\23\1\0\1\23"+
        "\2\53";
    static final String DFA9_acceptS =
        "\12\uffff\1\1\16\uffff\1\2\u03b5\uffff";
    static final String DFA9_specialS =
        "\4\uffff\1\62\1\46\2\uffff\1\14\1\163\1\uffff\1\66\2\uffff\1\2\14"+
        "\uffff\1\15\5\uffff\1\56\10\uffff\1\22\10\uffff\1\21\10\uffff\1"+
        "\20\10\uffff\1\17\17\uffff\1\65\2\uffff\1\16\11\uffff\1\67\2\uffff"+
        "\1\3\12\uffff\1\70\2\uffff\1\4\13\uffff\1\71\2\uffff\1\5\14\uffff"+
        "\1\63\1\uffff\1\164\1\135\14\uffff\1\35\16\uffff\1\36\11\uffff\1"+
        "\57\15\uffff\1\34\11\uffff\1\55\7\uffff\1\54\16\uffff\1\33\11\uffff"+
        "\1\53\7\uffff\1\52\10\uffff\1\51\11\uffff\1\134\12\uffff\1\133\13"+
        "\uffff\1\100\2\uffff\1\32\10\uffff\1\132\13\uffff\1\77\2\uffff\1"+
        "\31\10\uffff\1\76\2\uffff\1\30\12\uffff\1\131\13\uffff\1\75\2\uffff"+
        "\1\27\10\uffff\1\74\2\uffff\1\26\12\uffff\1\73\2\uffff\1\25\13\uffff"+
        "\1\136\3\uffff\1\137\7\uffff\1\140\11\uffff\1\6\14\uffff\1\141\11"+
        "\uffff\1\7\21\uffff\1\10\10\uffff\1\37\11\uffff\1\142\11\uffff\1"+
        "\11\21\uffff\1\12\10\uffff\1\40\16\uffff\1\13\10\uffff\1\41\10\uffff"+
        "\1\42\11\uffff\1\143\3\uffff\1\144\12\uffff\1\145\3\uffff\1\146"+
        "\12\uffff\1\147\12\uffff\1\101\2\uffff\1\43\11\uffff\1\150\3\uffff"+
        "\1\151\12\uffff\1\152\12\uffff\1\102\2\uffff\1\44\11\uffff\1\153"+
        "\12\uffff\1\103\2\uffff\1\45\11\uffff\1\72\2\uffff\1\23\12\uffff"+
        "\1\154\7\uffff\1\155\7\uffff\1\156\3\uffff\1\157\14\uffff\1\60\15"+
        "\uffff\1\160\3\uffff\1\161\14\uffff\1\61\11\uffff\1\162\14\uffff"+
        "\1\50\16\uffff\1\47\10\uffff\1\1\11\uffff\1\130\3\uffff\1\127\3"+
        "\uffff\1\126\12\uffff\1\125\3\uffff\1\124\3\uffff\1\123\12\uffff"+
        "\1\122\3\uffff\1\121\12\uffff\1\120\12\uffff\1\64\2\uffff\1\0\11"+
        "\uffff\1\117\3\uffff\1\116\7\uffff\1\115\7\uffff\1\114\7\uffff\1"+
        "\113\14\uffff\1\24\11\uffff\1\112\3\uffff\1\111\3\uffff\1\110\3"+
        "\uffff\1\107\12\uffff\1\106\3\uffff\1\105\7\uffff\1\104\3\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\10\1\11\1\3\1\5\11\uffff\1\4\22\uffff\1\6\2\uffff\1\12"+
            "\1\uffff\1\1\2\uffff\1\7",
            "\1\14\1\22\1\23\1\15\1\17\11\uffff\1\16\22\uffff\1\20\4\uffff"+
            "\1\13\2\uffff\1\21",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\uffff",
            "\1\uffff",
            "\1\32",
            "\1\33",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\34",
            "\1\35",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\31\1\36\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1\27"+
            "\1\26\1\24",
            "\1\37\1\45\1\46\1\40\1\42\11\uffff\1\41\22\uffff\1\43\7\uffff"+
            "\1\44",
            "\1\50\1\56\1\57\1\51\1\53\11\uffff\1\52\11\uffff\1\31\10\uffff"+
            "\1\54\4\uffff\1\47\2\uffff\1\55\10\31",
            "\1\61\1\67\1\70\1\62\1\64\11\uffff\1\63\22\uffff\1\65\4\uffff"+
            "\1\60\2\uffff\1\66",
            "\1\72\1\100\1\101\1\73\1\75\11\uffff\1\74\22\uffff\1\76\4\uffff"+
            "\1\71\2\uffff\1\77",
            "\1\103\1\111\1\112\1\104\1\106\11\uffff\1\105\22\uffff\1\107"+
            "\4\uffff\1\102\2\uffff\1\110",
            "",
            "\1\115\37\uffff\1\113\7\uffff\1\114",
            "\1\uffff",
            "\1\120\37\uffff\1\116\7\uffff\1\117",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\121",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\122",
            "\1\123",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\124\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1\27"+
            "\1\26",
            "\1\126\1\134\1\135\1\127\1\131\11\uffff\1\130\22\uffff\1\132"+
            "\4\uffff\1\125\2\uffff\1\133",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\137",
            "\1\140",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\27\1\26\1\136",
            "\1\31\1\141\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1\27"+
            "\1\26\1\136",
            "\1\143\1\151\1\152\1\144\1\146\11\uffff\1\145\22\uffff\1\147"+
            "\4\uffff\1\142\2\uffff\1\150",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\155",
            "\1\156",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\31\1\157\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1\27"+
            "\1\26\1\153",
            "\1\161\1\167\1\170\1\162\1\164\11\uffff\1\163\22\uffff\1\165"+
            "\4\uffff\1\160\2\uffff\1\166",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\174",
            "\1\175",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\31\1\176\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1\27"+
            "\1\173\1\171",
            "\1\u0080\1\u0086\1\u0087\1\u0081\1\u0083\11\uffff\1\u0082\22"+
            "\uffff\1\u0084\4\uffff\1\177\2\uffff\1\u0085",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u008c",
            "\1\u008d",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\31\1\u008e\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0098\37\uffff\1\u0096\7\uffff\1\u0097",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0099",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u009a",
            "\1\u009b",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\u009c\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u009d\1\u00a3\1\u00a4\1\u009e\1\u00a0\11\uffff\1\u009f\22"+
            "\uffff\1\u00a1\7\uffff\1\u00a2",
            "\1\u00a7\37\uffff\1\u00a5\7\uffff\1\u00a6",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u00a8",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u00a9",
            "\1\u00aa",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\31\1\u00ab\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u00ac\1\u00b2\1\u00b3\1\u00ad\1\u00af\11\uffff\1\u00ae\22"+
            "\uffff\1\u00b0\7\uffff\1\u00b1",
            "\1\u00b6\1\u00b4\1\u00bc\1\u00b7\1\u00b9\11\uffff\1\u00b8\11"+
            "\uffff\1\31\10\uffff\1\u00ba\4\uffff\1\u00b5\2\uffff\1\u00bb"+
            "\10\31",
            "\1\u00bf\37\uffff\1\u00bd\7\uffff\1\u00be",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u00c0",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u00c1",
            "\1\u00c2",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\31\1\u00c3\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u00c4\1\u00ca\1\u00cb\1\u00c5\1\u00c7\11\uffff\1\u00c6\22"+
            "\uffff\1\u00c8\7\uffff\1\u00c9",
            "\1\u00ce\1\u00cc\1\u00d4\1\u00cf\1\u00d1\11\uffff\1\u00d0\11"+
            "\uffff\1\31\10\uffff\1\u00d2\4\uffff\1\u00cd\2\uffff\1\u00d3"+
            "\10\31",
            "\1\u00d6\1\u00dc\1\u00dd\1\u00d7\1\u00d9\11\uffff\1\u00d8\22"+
            "\uffff\1\u00da\4\uffff\1\u00d5\2\uffff\1\u00db",
            "\1\u00e0\37\uffff\1\u00de\7\uffff\1\u00df",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u00e1",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u00e2",
            "\1\u00e3",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\31\1\u00e4\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u00e5\1\u00eb\1\u00ec\1\u00e6\1\u00e8\11\uffff\1\u00e7\22"+
            "\uffff\1\u00e9\7\uffff\1\u00ea",
            "\1\u00ef\1\u00ed\1\u00f5\1\u00f0\1\u00f2\11\uffff\1\u00f1\11"+
            "\uffff\1\31\10\uffff\1\u00f3\4\uffff\1\u00ee\2\uffff\1\u00f4"+
            "\10\31",
            "\1\u00f7\1\u00fd\1\u00fe\1\u00f8\1\u00fa\11\uffff\1\u00f9\22"+
            "\uffff\1\u00fb\4\uffff\1\u00f6\2\uffff\1\u00fc",
            "\1\u0100\1\u0106\1\u0107\1\u0101\1\u0103\11\uffff\1\u0102\22"+
            "\uffff\1\u0104\4\uffff\1\u00ff\2\uffff\1\u0105",
            "\1\u010a\37\uffff\1\u0108\7\uffff\1\u0109",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u010b",
            "\1\uffff",
            "\1\u0091",
            "\1\uffff",
            "\1\uffff",
            "\1\u0094",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\24",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0112\37\uffff\1\u0110\7\uffff\1\u0111",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u0113",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0114",
            "\1\u0115",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\u0116\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011d\37\uffff\1\u011b\7\uffff\1\u011c",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u011e",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u011f",
            "\1\u0120",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\u0121\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\27\1\26\1\u0122",
            "\1\u0124\1\u012a\1\u012b\1\u0125\1\u0127\11\uffff\1\u0126\22"+
            "\uffff\1\u0128\4\uffff\1\u0123\2\uffff\1\u0129",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u012c",
            "\1\u012d",
            "\1\31\1\u012e\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0135\37\uffff\1\u0133\7\uffff\1\u0134",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u0136",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0137",
            "\1\u0138",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\u0139\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\27\1\173\1\u013a",
            "\1\u013c\1\u0142\1\u0143\1\u013d\1\u013f\11\uffff\1\u013e\22"+
            "\uffff\1\u0140\4\uffff\1\u013b\2\uffff\1\u0141",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u0144",
            "\1\u0145",
            "\1\31\1\u0146\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u0148\1\u014e\1\u014f\1\u0149\1\u014b\11\uffff\1\u014a\22"+
            "\uffff\1\u014c\4\uffff\1\u0147\2\uffff\1\u014d",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0152",
            "\1\u0153",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\31\1\u0154\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u015b\37\uffff\1\u0159\7\uffff\1\u015a",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u015c",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u015d",
            "\1\u015e",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\u015f\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\u008b\1\u008a\1\u0160",
            "\1\u0162\1\u0168\1\u0169\1\u0163\1\u0165\11\uffff\1\u0164\22"+
            "\uffff\1\u0166\4\uffff\1\u0161\2\uffff\1\u0167",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u016a",
            "\1\u016b",
            "\1\31\1\u016c\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u016e\1\u0174\1\u0175\1\u016f\1\u0171\11\uffff\1\u0170\22"+
            "\uffff\1\u0172\4\uffff\1\u016d\2\uffff\1\u0173",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0178",
            "\1\u0179",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\31\1\u017a\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u017c\1\u0182\1\u0183\1\u017d\1\u017f\11\uffff\1\u017e\22"+
            "\uffff\1\u0180\4\uffff\1\u017b\2\uffff\1\u0181",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0187",
            "\1\u0188",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\31\1\u0189\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\uffff",
            "\1\u010e",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\25\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0194\37\uffff\1\u0192\7\uffff\1\u0193",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0195",
            "\1\uffff",
            "\1\u0119",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019c\37\uffff\1\u019a\7\uffff\1\u019b",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u019d",
            "\1\u019e\1\u01a4\1\u01a5\1\u019f\1\u01a1\11\uffff\1\u01a0\22"+
            "\uffff\1\u01a2\7\uffff\1\u01a3",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u01a6",
            "\1\u01a7",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\u01a8\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u01ab\37\uffff\1\u01a9\7\uffff\1\u01aa",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u01ac",
            "\1\uffff",
            "\1\u0131",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b3\37\uffff\1\u01b1\7\uffff\1\u01b2",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u01b4",
            "\1\u01b5\1\u01bb\1\u01bc\1\u01b6\1\u01b8\11\uffff\1\u01b7\22"+
            "\uffff\1\u01b9\7\uffff\1\u01ba",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u01bd",
            "\1\u01be",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\u01bf\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u01c2\37\uffff\1\u01c0\7\uffff\1\u01c1",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u01c3",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u01c4",
            "\1\u01c5",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\31\1\u01c6\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u01c7\1\u01cd\1\u01ce\1\u01c8\1\u01ca\11\uffff\1\u01c9\22"+
            "\uffff\1\u01cb\7\uffff\1\u01cc",
            "\1\u01d0\1\u01d6\1\u01d7\1\u01d1\1\u01d3\11\uffff\1\u01d2\11"+
            "\uffff\1\31\10\uffff\1\u01d4\4\uffff\1\u01cf\2\uffff\1\u01d5"+
            "\10\31",
            "\1\u01da\37\uffff\1\u01d8\7\uffff\1\u01d9",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u01db",
            "\1\uffff",
            "\1\u0157",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e2\37\uffff\1\u01e0\7\uffff\1\u01e1",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u01e3",
            "\1\u01e4\1\u01ea\1\u01eb\1\u01e5\1\u01e7\11\uffff\1\u01e6\22"+
            "\uffff\1\u01e8\7\uffff\1\u01e9",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u01ec",
            "\1\u01ed",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\u01ee\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u01f1\37\uffff\1\u01ef\7\uffff\1\u01f0",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u01f2",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u01f3",
            "\1\u01f4",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\31\1\u01f5\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u01f6\1\u01fc\1\u01fd\1\u01f7\1\u01f9\11\uffff\1\u01f8\22"+
            "\uffff\1\u01fa\7\uffff\1\u01fb",
            "\1\u01ff\1\u0205\1\u0206\1\u0200\1\u0202\11\uffff\1\u0201\11"+
            "\uffff\1\31\10\uffff\1\u0203\4\uffff\1\u01fe\2\uffff\1\u0204"+
            "\10\31",
            "\1\u0209\37\uffff\1\u0207\7\uffff\1\u0208",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u020a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u020b",
            "\1\u020c",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\31\1\u020d\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u020e\1\u0214\1\u0215\1\u020f\1\u0211\11\uffff\1\u0210\22"+
            "\uffff\1\u0212\7\uffff\1\u0213",
            "\1\u0217\1\u021d\1\u021e\1\u0218\1\u021a\11\uffff\1\u0219\11"+
            "\uffff\1\31\10\uffff\1\u021b\4\uffff\1\u0216\2\uffff\1\u021c"+
            "\10\31",
            "\1\u0220\1\u0226\1\u0227\1\u0221\1\u0223\11\uffff\1\u0222\22"+
            "\uffff\1\u0224\4\uffff\1\u021f\2\uffff\1\u0225",
            "\1\u022a\37\uffff\1\u0228\7\uffff\1\u0229",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u022b",
            "\1\uffff",
            "\1\u018c",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\uffff",
            "\1\u0190",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\136",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\uffff",
            "\1\u0198",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\153",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0234",
            "\1\u0235",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\u0236\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u0239\37\uffff\1\u0237\7\uffff\1\u0238",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\uffff",
            "\1\u01af",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\171",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0243",
            "\1\u0244",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\u0245\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0248\37\uffff\1\u0246\7\uffff\1\u0247",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u0250\37\uffff\1\u024e\7\uffff\1\u024f",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0251",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0252",
            "\1\u0253",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\31\1\u0254\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0256\1\u025c\1\u025d\1\u0257\1\u0259\11\uffff\1\u0258\22"+
            "\uffff\1\u025a\4\uffff\1\u0255\2\uffff\1\u025b",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\27\1\173\1\u025e",
            "\1\31\1\u0261\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\uffff",
            "\1\u01de",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0088",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u026a",
            "\1\u026b",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\u026c\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u026f\37\uffff\1\u026d\7\uffff\1\u026e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0277\37\uffff\1\u0275\7\uffff\1\u0276",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0278",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0279",
            "\1\u027a",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\u027b\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u027d\1\u0283\1\u0284\1\u027e\1\u0280\11\uffff\1\u027f\22"+
            "\uffff\1\u0281\4\uffff\1\u027c\2\uffff\1\u0282",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\u008b\1\u008a\1\u0285",
            "\1\31\1\u0288\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028f\37\uffff\1\u028d\7\uffff\1\u028e",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0290",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0291",
            "\1\u0292",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\31\1\u0293\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0295\1\u029b\1\u029c\1\u0296\1\u0298\11\uffff\1\u0297\22"+
            "\uffff\1\u0299\4\uffff\1\u0294\2\uffff\1\u029a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\u008b\1\u0186\1\u029d",
            "\1\31\1\u02a0\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u02a2\1\u02a8\1\u02a9\1\u02a3\1\u02a5\11\uffff\1\u02a4\22"+
            "\uffff\1\u02a6\4\uffff\1\u02a1\2\uffff\1\u02a7",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02ac",
            "\1\u02ad",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\31\1\u02ae\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\uffff",
            "\1\u022e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\u0232",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\154\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u02b5\37\uffff\1\u02b3\7\uffff\1\u02b4",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\uffff",
            "\1\u023d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\uffff",
            "\1\u0241",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\172\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u02bd\37\uffff\1\u02bb\7\uffff\1\u02bc",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\uffff",
            "\1\u024c",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c9\37\uffff\1\u02c7\7\uffff\1\u02c8",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u02ca",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u02cb",
            "\1\u02cc",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\31\1\u02cd\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u02ce\1\u02d4\1\u02d5\1\u02cf\1\u02d1\11\uffff\1\u02d0\22"+
            "\uffff\1\u02d2\7\uffff\1\u02d3",
            "\1\u02d8\37\uffff\1\u02d6\7\uffff\1\u02d7",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u02d9",
            "\1\uffff",
            "\1\u0264",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\uffff",
            "\1\u0268",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\u0089\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u02dc\37\uffff\1\u02da\7\uffff\1\u02db",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\uffff",
            "\1\u0273",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e8\37\uffff\1\u02e6\7\uffff\1\u02e7",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u02e9",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u02ea",
            "\1\u02eb",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\31\1\u02ec\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u02ed\1\u02f3\1\u02f4\1\u02ee\1\u02f0\11\uffff\1\u02ef\22"+
            "\uffff\1\u02f1\7\uffff\1\u02f2",
            "\1\u02f7\37\uffff\1\u02f5\7\uffff\1\u02f6",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u02f8",
            "\1\uffff",
            "\1\u028b",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02ff\37\uffff\1\u02fd\7\uffff\1\u02fe",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0300",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u0301",
            "\1\u0302",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\31\1\u0303\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u0304\1\u030a\1\u030b\1\u0305\1\u0307\11\uffff\1\u0306\22"+
            "\uffff\1\u0308\7\uffff\1\u0309",
            "\1\u030e\37\uffff\1\u030c\7\uffff\1\u030d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u030f",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0310",
            "\1\u0311",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\31\1\u0312\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0313\1\u0319\1\u031a\1\u0314\1\u0316\11\uffff\1\u0315\22"+
            "\uffff\1\u0317\7\uffff\1\u0318",
            "\1\u031c\1\u0322\1\u0323\1\u031d\1\u031f\11\uffff\1\u031e\11"+
            "\uffff\1\31\10\uffff\1\u0320\4\uffff\1\u031b\2\uffff\1\u0321"+
            "\10\31",
            "\1\u0326\37\uffff\1\u0324\7\uffff\1\u0325",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0327",
            "\1\uffff",
            "\1\u02b1",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\uffff",
            "\1\u02b9",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26\1\u0122",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\uffff",
            "\1\u02c1",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u013a",
            "\1\uffff",
            "\1\u02c5",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173\1\u0150",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0336\37\uffff\1\u0334\7\uffff\1\u0335",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u0337",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0338",
            "\1\u0339",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\u033a\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\uffff",
            "\1\u02e0",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0160",
            "\1\uffff",
            "\1\u02e4",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a\1\u0176",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0349\37\uffff\1\u0347\7\uffff\1\u0348",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u034a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u034b",
            "\1\u034c",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\u034d\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\uffff",
            "\1\u02fb",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u0184",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0358\37\uffff\1\u0356\7\uffff\1\u0357",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u0359",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u035a",
            "\1\u035b",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\u035c\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0363\37\uffff\1\u0361\7\uffff\1\u0362",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u0364",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0365",
            "\1\u0366",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\31\1\u0367\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0369\1\u036f\1\u0370\1\u036a\1\u036c\11\uffff\1\u036b\22"+
            "\uffff\1\u036d\4\uffff\1\u0368\2\uffff\1\u036e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\31\1\uffff\1\31\2\uffff\1\31\3\uffff\1\31\4\uffff\6\12\4"+
            "\uffff\1\30\1\u008b\1\u0186\1\u0371",
            "\1\31\1\u0374\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "\1\u0378",
            "\1\uffff",
            "\1\u032a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\26",
            "\1\uffff",
            "\1\u032e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\u0332",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\u0151\4\uffff\6\12\4\uffff\1\30"+
            "\1\27\1\173",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037f\37\uffff\1\u037d\7\uffff\1\u037e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\u0380",
            "\1\uffff",
            "\1\u033d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\uffff",
            "\1\u0341",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\u0345",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\u0177\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u008a",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0387\37\uffff\1\u0385\7\uffff\1\u0386",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\u0388",
            "\1\uffff",
            "\1\u0350",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\uffff",
            "\1\u0354",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\u0185\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038f\37\uffff\1\u038d\7\uffff\1\u038e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u0390",
            "\1\uffff",
            "\1\u035f",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0397\37\uffff\1\u0395\7\uffff\1\u0396",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u0398",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u0399",
            "\1\u039a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\u039b\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u039c\1\u03a2\1\u03a3\1\u039d\1\u039f\11\uffff\1\u039e\22"+
            "\uffff\1\u03a0\7\uffff\1\u03a1",
            "\1\u03a6\37\uffff\1\u03a4\7\uffff\1\u03a5",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u03a7",
            "\1\uffff",
            "\1\u0377",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\uffff",
            "\1\u037b",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173\1\u025e",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\1\uffff",
            "\1\u0383",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a\1\u0285",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "\1\uffff",
            "\1\u038b",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u029d",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "\1\uffff",
            "\1\u0393",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186\1\u02aa",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03ba\37\uffff\1\u03b8\7\uffff\1\u03b9",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u03bb",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\uffff",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u03bc",
            "\1\u03bd",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\u03be\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "\1\uffff",
            "\1\u03aa",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\27\1\173",
            "\1\uffff",
            "\1\u03ae",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u008a",
            "\1\uffff",
            "\1\u03b2",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\uffff",
            "\1\u03b6",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\u02ab\4\uffff\6\12\4\uffff\1\30"+
            "\1\u008b\1\u0186",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c9\37\uffff\1\u03c7\7\uffff\1\u03c8",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\u03ca",
            "\1\uffff",
            "\1\u03c1",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\uffff",
            "\1\u03c5",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186\1\u0371",
            "\1\u03cb",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\uffff",
            "\1\u03cd",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186",
            "\1\31\1\uffff\1\31\6\uffff\1\31\4\uffff\6\12\4\uffff\1\30\1"+
            "\u008b\1\u0186"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "545:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_875 = input.LA(1);

                         
                        int index9_875 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_875);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_798 = input.LA(1);

                         
                        int index9_798 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_798);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_101 = input.LA(1);

                         
                        int index9_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_101);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_115 = input.LA(1);

                         
                        int index9_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_115);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_130 = input.LA(1);

                         
                        int index9_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_130);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_416 = input.LA(1);

                         
                        int index9_416 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_416);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_439 = input.LA(1);

                         
                        int index9_439 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_439);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_457 = input.LA(1);

                         
                        int index9_457 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_457);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_486 = input.LA(1);

                         
                        int index9_486 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_486);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_504 = input.LA(1);

                         
                        int index9_504 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_504);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_528 = input.LA(1);

                         
                        int index9_528 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_528);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_27 = input.LA(1);

                         
                        int index9_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_27);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_88 = input.LA(1);

                         
                        int index9_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_88);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_69 = input.LA(1);

                         
                        int index9_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_69);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA9_60 = input.LA(1);

                         
                        int index9_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_60);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA9_51 = input.LA(1);

                         
                        int index9_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_51);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA9_42 = input.LA(1);

                         
                        int index9_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_42);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA9_676 = input.LA(1);

                         
                        int index9_676 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_676);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA9_926 = input.LA(1);

                         
                        int index9_926 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_926);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA9_382 = input.LA(1);

                         
                        int index9_382 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_382);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA9_368 = input.LA(1);

                         
                        int index9_368 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_368);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA9_356 = input.LA(1);

                         
                        int index9_356 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_356);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA9_330 = input.LA(1);

                         
                        int index9_330 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_330);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA9_318 = input.LA(1);

                         
                        int index9_318 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_318);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA9_294 = input.LA(1);

                         
                        int index9_294 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_294);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA9_231 = input.LA(1);

                         
                        int index9_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_231);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA9_198 = input.LA(1);

                         
                        int index9_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_198);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA9_159 = input.LA(1);

                         
                        int index9_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_159);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA9_174 = input.LA(1);

                         
                        int index9_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_174);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA9_466 = input.LA(1);

                         
                        int index9_466 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_466);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA9_513 = input.LA(1);

                         
                        int index9_513 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_513);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA9_537 = input.LA(1);

                         
                        int index9_537 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_537);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA9_546 = input.LA(1);

                         
                        int index9_546 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_546);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA9_600 = input.LA(1);

                         
                        int index9_600 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_600);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA9_639 = input.LA(1);

                         
                        int index9_639 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_639);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA9_663 = input.LA(1);

                         
                        int index9_663 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_663);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA9_789 = input.LA(1);

                         
                        int index9_789 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_789);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA9_774 = input.LA(1);

                         
                        int index9_774 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_774);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA9_258 = input.LA(1);

                         
                        int index9_258 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_258);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA9_249 = input.LA(1);

                         
                        int index9_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_249);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA9_241 = input.LA(1);

                         
                        int index9_241 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_241);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA9_216 = input.LA(1);

                         
                        int index9_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_216);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA9_208 = input.LA(1);

                         
                        int index9_208 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_208);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA9_33 = input.LA(1);

                         
                        int index9_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_33);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA9_184 = input.LA(1);

                         
                        int index9_184 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_184);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA9_720 = input.LA(1);

                         
                        int index9_720 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_720);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA9_751 = input.LA(1);

                         
                        int index9_751 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_751);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA9_143 = input.LA(1);

                         
                        int index9_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_143);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA9_872 = input.LA(1);

                         
                        int index9_872 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_872);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA9_85 = input.LA(1);

                         
                        int index9_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_85);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA9_98 = input.LA(1);

                         
                        int index9_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_98);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA9_112 = input.LA(1);

                         
                        int index9_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_112);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA9_127 = input.LA(1);

                         
                        int index9_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_127);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA9_673 = input.LA(1);

                         
                        int index9_673 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_673);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA9_379 = input.LA(1);

                         
                        int index9_379 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_379);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA9_365 = input.LA(1);

                         
                        int index9_365 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_365);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA9_353 = input.LA(1);

                         
                        int index9_353 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_353);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA9_327 = input.LA(1);

                         
                        int index9_327 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_327);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA9_315 = input.LA(1);

                         
                        int index9_315 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_315);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA9_291 = input.LA(1);

                         
                        int index9_291 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_291);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA9_597 = input.LA(1);

                         
                        int index9_597 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_597);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA9_636 = input.LA(1);

                         
                        int index9_636 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_636);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA9_660 = input.LA(1);

                         
                        int index9_660 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_660);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA9_971 = input.LA(1);

                         
                        int index9_971 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_971);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA9_963 = input.LA(1);

                         
                        int index9_963 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_963);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA9_959 = input.LA(1);

                         
                        int index9_959 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_959);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA9_948 = input.LA(1);

                         
                        int index9_948 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_948);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA9_944 = input.LA(1);

                         
                        int index9_944 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_944);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA9_940 = input.LA(1);

                         
                        int index9_940 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_940);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA9_936 = input.LA(1);

                         
                        int index9_936 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_936);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA9_913 = input.LA(1);

                         
                        int index9_913 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_913);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA9_905 = input.LA(1);

                         
                        int index9_905 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_905);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA9_897 = input.LA(1);

                         
                        int index9_897 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_897);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA9_889 = input.LA(1);

                         
                        int index9_889 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_889);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA9_885 = input.LA(1);

                         
                        int index9_885 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_885);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA9_861 = input.LA(1);

                         
                        int index9_861 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_861);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA9_850 = input.LA(1);

                         
                        int index9_850 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_850);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA9_846 = input.LA(1);

                         
                        int index9_846 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_846);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA9_835 = input.LA(1);

                         
                        int index9_835 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_835);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA9_831 = input.LA(1);

                         
                        int index9_831 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_831);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA9_827 = input.LA(1);

                         
                        int index9_827 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_827);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA9_816 = input.LA(1);

                         
                        int index9_816 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_816);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA9_812 = input.LA(1);

                         
                        int index9_812 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_812);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA9_808 = input.LA(1);

                         
                        int index9_808 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_808);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA9_341 = input.LA(1);

                         
                        int index9_341 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_341);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA9_303 = input.LA(1);

                         
                        int index9_303 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_303);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA9_279 = input.LA(1);

                         
                        int index9_279 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_279);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA9_268 = input.LA(1);

                         
                        int index9_268 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_268);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA9_146 = input.LA(1);

                         
                        int index9_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_146);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA9_394 = input.LA(1);

                         
                        int index9_394 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_394);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA9_398 = input.LA(1);

                         
                        int index9_398 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_398);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA9_406 = input.LA(1);

                         
                        int index9_406 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_406);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA9_429 = input.LA(1);

                         
                        int index9_429 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_429);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA9_476 = input.LA(1);

                         
                        int index9_476 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_476);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA9_556 = input.LA(1);

                         
                        int index9_556 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_556);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA9_560 = input.LA(1);

                         
                        int index9_560 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_560);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA9_571 = input.LA(1);

                         
                        int index9_571 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_571);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA9_575 = input.LA(1);

                         
                        int index9_575 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_575);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA9_586 = input.LA(1);

                         
                        int index9_586 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_586);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA9_610 = input.LA(1);

                         
                        int index9_610 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_610);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA9_614 = input.LA(1);

                         
                        int index9_614 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_614);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA9_625 = input.LA(1);

                         
                        int index9_625 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_625);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA9_649 = input.LA(1);

                         
                        int index9_649 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_649);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA9_687 = input.LA(1);

                         
                        int index9_687 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_687);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA9_695 = input.LA(1);

                         
                        int index9_695 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_695);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA9_703 = input.LA(1);

                         
                        int index9_703 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_703);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA9_707 = input.LA(1);

                         
                        int index9_707 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_707);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA9_734 = input.LA(1);

                         
                        int index9_734 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_734);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA9_738 = input.LA(1);

                         
                        int index9_738 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_738);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA9_761 = input.LA(1);

                         
                        int index9_761 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_761);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA9_145 = input.LA(1);

                         
                        int index9_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10()) ) {s = 10;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index9_145);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTransition146 = new BitSet(new long[]{0x00002520000501F2L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition177 = new BitSet(new long[]{0x00002520000501F2L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTransition204 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleTransition216 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTransition237 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTransition248 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTransition269 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission523 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleEmission534 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEmission555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEmission565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment660 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAssignment670 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect779 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleTextEffect795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTextEffect827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1145 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression1178 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1199 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression1297 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression1330 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression1351 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1450 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation1483 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression1572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression1766 = new BitSet(new long[]{0x0000212000040160L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression1854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2007 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression2040 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression2061 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2159 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression2192 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression2213 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2311 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression2344 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression2365 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2463 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression2496 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression2555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModExpression2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression2615 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression2648 = new BitSet(new long[]{0x00002020000401F0L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression2707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression2776 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAtomicExpression2970 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression2995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicExpression3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression3071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAtomicValuedExpression3177 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression3202 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicValuedExpression3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression3278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression3347 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleValuedObjectTestExpression3357 = new BitSet(new long[]{0x0000202000000020L});
    public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression3378 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleValuedObjectTestExpression3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression3429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression3608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression3660 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleTextExpression3676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression3693 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTextExpression3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration4021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleISignal_in_entryRuleISignal4146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleISignal4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleISignal4198 = new BitSet(new long[]{0x0000000004140002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_ruleISignal4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl4261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceSignalDecl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInterfaceSignalDecl4319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4340 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceSignalDecl4351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4372 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceSignalDecl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceSignalDecl4414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4435 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceSignalDecl4446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4467 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceSignalDecl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceSignalDecl4509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4530 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceSignalDecl4541 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4562 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceSignalDecl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInterfaceSignalDecl4604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4625 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceSignalDecl4636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl4657 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceSignalDecl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription4706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelDescription4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleChannelDescription4752 = new BitSet(new long[]{0x003FC00010000020L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleChannelDescription4791 = new BitSet(new long[]{0x003FC00010000020L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChannelDescription4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleChannelDescription4840 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleChannelDescription4861 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleChannelDescription4871 = new BitSet(new long[]{0x003FC00010000020L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl4929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceVariableDecl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInterfaceVariableDecl4974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl4995 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceVariableDecl5006 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl5027 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl5121 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDecl5132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl5153 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleVariableDecl5165 = new BitSet(new long[]{0x003FC00010000020L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIVariable_in_entryRuleIVariable5222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIVariable5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIVariable5274 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleIVariable5290 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIVariable5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier5349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdentifier5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeIdentifier5450 = new BitSet(new long[]{0x003FC00000000020L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier5472 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier5495 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTypeIdentifier5511 = new BitSet(new long[]{0x01E00AC000000000L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation5571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation5662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleKeyValueAnnotation5707 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValueAnnotation5724 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_ruleEString_in_ruleKeyValueAnnotation5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString5789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDivOperator5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCompareOperator5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompareOperator5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCompareOperator5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCompareOperator6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCompareOperator6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompareOperator6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePreOperator6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOrOperator6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAndOperator6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNotOperator6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAddOperator6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSubOperator6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMultOperator6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleModOperator6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValueTestOperator6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueType6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValueType6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValueType6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleValueType6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCombineOperator6599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCombineOperator6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCombineOperator6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCombineOperator6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCombineOperator6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCombineOperator6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCombineOperator6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_synpred2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred131450 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_synpred131483 = new BitSet(new long[]{0x00002520000401F0L});
    public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred131504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred141632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_synpred192496 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleModExpression_in_synpred192517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred273177 = new BitSet(new long[]{0x00002420000401F0L});
    public static final BitSet FOLLOW_ruleValuedExpression_in_synpred273202 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred273211 = new BitSet(new long[]{0x0000000000000002L});

}