package de.cau.cs.kieler.synccharts.dsl.parser.antlr.internal; 

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
import de.cau.cs.kieler.synccharts.dsl.services.RetypingSyncchartsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalRetypingSyncchartsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'final'", "'state'", "'{'", "'||'", "'}'", "'onentry'", "'/'", "'onexit'", "'oninner'", "'with'", "'('", "')'", "':='", "'input'", "';'", "'var'", "'PSEUDO'", "'reference'", "'textual'", "'o->'", "'-->'", "'>->'", "'='", "'<'", "'<='", "'>'", "'>='", "'not'", "'and'", "'or'", "'+'", "'-'", "'*'", "'div'", "'mod'", "'?'", "'pre'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalRetypingSyncchartsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[130+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g"; }


     
     	private RetypingSyncchartsGrammarAccess grammarAccess;
     	
        public InternalRetypingSyncchartsParser(TokenStream input, IAstFactory factory, RetypingSyncchartsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "State";	
       	} 



    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:74:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:74:47: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:75:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState79);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState89); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:82:1: ruleState returns [EObject current=null] : ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? (lv_stateKind_2= ruleStateType )? ( 'state' )? (lv_stateName_4= RULE_ID )? (lv_label_5= RULE_STRING )? (lv_stateContent_6= ruleStateContent )? (lv_outgoingTransitions_7= ruleTransition )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isFinal_1=null;
        Token lv_stateName_4=null;
        Token lv_label_5=null;
        Enumerator lv_stateKind_2 = null;

        EObject lv_stateContent_6 = null;

        EObject lv_outgoingTransitions_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:87:6: ( ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? (lv_stateKind_2= ruleStateType )? ( 'state' )? (lv_stateName_4= RULE_ID )? (lv_label_5= RULE_STRING )? (lv_stateContent_6= ruleStateContent )? (lv_outgoingTransitions_7= ruleTransition )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? (lv_stateKind_2= ruleStateType )? ( 'state' )? (lv_stateName_4= RULE_ID )? (lv_label_5= RULE_STRING )? (lv_stateContent_6= ruleStateContent )? (lv_outgoingTransitions_7= ruleTransition )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:1: ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? (lv_stateKind_2= ruleStateType )? ( 'state' )? (lv_stateName_4= RULE_ID )? (lv_label_5= RULE_STRING )? (lv_stateContent_6= ruleStateContent )? (lv_outgoingTransitions_7= ruleTransition )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? (lv_stateKind_2= ruleStateType )? ( 'state' )? (lv_stateName_4= RULE_ID )? (lv_label_5= RULE_STRING )? (lv_stateContent_6= ruleStateContent )? (lv_outgoingTransitions_7= ruleTransition )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:88:2: (lv_isInitial_0= 'init' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                int LA1_1 = input.LA(2);

                if ( (synpred1()) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: lv_isInitial_0= 'init'
                    {
                    lv_isInitial_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState135); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:109:3: (lv_isFinal_1= 'final' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:111:6: lv_isFinal_1= 'final'
                    {
                    lv_isFinal_1=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleState170); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:130:3: (lv_stateKind_2= ruleStateType )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA3_1 = input.LA(2);

                    if ( (synpred3()) ) {
                        alt3=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (synpred3()) ) {
                        alt3=1;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA3_3 = input.LA(2);

                    if ( (synpred3()) ) {
                        alt3=1;
                    }
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:133:6: lv_stateKind_2= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState218);
                    lv_stateKind_2=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateKind", lv_stateKind_2, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:151:3: ( 'state' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:151:4: 'state'
                    {
                    match(input,15,FOLLOW_15_in_ruleState233); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:155:3: (lv_stateName_4= RULE_ID )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred5()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:157:6: lv_stateName_4= RULE_ID
                    {
                    lv_stateName_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState257); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getStateNameIDTerminalRuleCall_4_0(), "stateName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateName", lv_stateName_4, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:175:3: (lv_label_5= RULE_STRING )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred6()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: lv_label_5= RULE_STRING
                    {
                    lv_label_5=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState288); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_5_0(), "label"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "label", lv_label_5, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:195:3: (lv_stateContent_6= ruleStateContent )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred7()) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:198:6: lv_stateContent_6= ruleStateContent
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_6_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateContent_in_ruleState331);
                    lv_stateContent_6=ruleStateContent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stateContent", lv_stateContent_6, "StateContent", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:216:3: (lv_outgoingTransitions_7= ruleTransition )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:219:6: lv_outgoingTransitions_7= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState370);
            	    lv_outgoingTransitions_7=ruleTransition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "outgoingTransitions", lv_outgoingTransitions_7, "Transition", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleStateContent
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:1: entryRuleStateContent returns [EObject current=null] : iv_ruleStateContent= ruleStateContent EOF ;
    public final EObject entryRuleStateContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateContent = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:244:54: (iv_ruleStateContent= ruleStateContent EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:245:2: iv_ruleStateContent= ruleStateContent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateContentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStateContent_in_entryRuleStateContent408);
            iv_ruleStateContent=ruleStateContent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStateContent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateContent418); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStateContent


    // $ANTLR start ruleStateContent
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:252:1: ruleStateContent returns [EObject current=null] : ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) | (lv_signalsAndVariables_4= ruleValuedObject ) | ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* ) )+ '}' ) ;
    public final EObject ruleStateContent() throws RecognitionException {
        EObject current = null;

        EObject lv_exitActions_1 = null;

        EObject lv_entryActions_2 = null;

        EObject lv_innerAction_3 = null;

        EObject lv_signalsAndVariables_4 = null;

        EObject lv_innerStates_5 = null;

        EObject lv_parallelStates_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:257:6: ( ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) | (lv_signalsAndVariables_4= ruleValuedObject ) | ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* ) )+ '}' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:258:1: ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) | (lv_signalsAndVariables_4= ruleValuedObject ) | ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* ) )+ '}' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:258:1: ( '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) | (lv_signalsAndVariables_4= ruleValuedObject ) | ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* ) )+ '}' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:258:2: '{' ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) | (lv_signalsAndVariables_4= ruleValuedObject ) | ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* ) )+ '}'
            {
            match(input,16,FOLLOW_16_in_ruleStateContent452); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateContentAccess().getLeftCurlyBracketKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:262:1: ( (lv_exitActions_1= ruleExitAction ) | (lv_entryActions_2= ruleEntryAction ) | (lv_innerAction_3= ruleInnerAction ) | (lv_signalsAndVariables_4= ruleValuedObject ) | ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=6;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA10_1 = input.LA(2);

                    if ( (synpred14()) ) {
                        alt10=5;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt10=1;
                    }
                    else if ( (synpred14()) ) {
                        alt10=5;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred10()) ) {
                        alt10=2;
                    }
                    else if ( (synpred14()) ) {
                        alt10=5;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred11()) ) {
                        alt10=3;
                    }
                    else if ( (synpred14()) ) {
                        alt10=5;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA10_5 = input.LA(2);

                    if ( (synpred12()) ) {
                        alt10=4;
                    }
                    else if ( (synpred14()) ) {
                        alt10=5;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA10_6 = input.LA(2);

                    if ( (synpred12()) ) {
                        alt10=4;
                    }
                    else if ( (synpred14()) ) {
                        alt10=5;
                    }


                    }
                    break;
                case RULE_ID:
                case RULE_STRING:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    {
                    alt10=5;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:262:2: (lv_exitActions_1= ruleExitAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:262:2: (lv_exitActions_1= ruleExitAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:265:6: lv_exitActions_1= ruleExitAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExitAction_in_ruleStateContent487);
            	    lv_exitActions_1=ruleExitAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "exitActions", lv_exitActions_1, "ExitAction", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:284:6: (lv_entryActions_2= ruleEntryAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:284:6: (lv_entryActions_2= ruleEntryAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:287:6: lv_entryActions_2= ruleEntryAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntryAction_in_ruleStateContent531);
            	    lv_entryActions_2=ruleEntryAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "entryActions", lv_entryActions_2, "EntryAction", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:306:6: (lv_innerAction_3= ruleInnerAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:306:6: (lv_innerAction_3= ruleInnerAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:309:6: lv_innerAction_3= ruleInnerAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInnerAction_in_ruleStateContent575);
            	    lv_innerAction_3=ruleInnerAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerAction", lv_innerAction_3, "InnerAction", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: (lv_signalsAndVariables_4= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: (lv_signalsAndVariables_4= ruleValuedObject )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:331:6: lv_signalsAndVariables_4= ruleValuedObject
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getSignalsAndVariablesValuedObjectParserRuleCall_1_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValuedObject_in_ruleStateContent619);
            	    lv_signalsAndVariables_4=ruleValuedObject();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "signalsAndVariables", lv_signalsAndVariables_4, "ValuedObject", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:6: ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:6: ( (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )* )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:7: (lv_innerStates_5= ruleState ) ( '||' (lv_parallelStates_7= ruleState ) )*
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:7: (lv_innerStates_5= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:353:6: lv_innerStates_5= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getInnerStatesStateParserRuleCall_1_4_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleStateContent664);
            	    lv_innerStates_5=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerStates", lv_innerStates_5, "State", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:2: ( '||' (lv_parallelStates_7= ruleState ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==17) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( (synpred13()) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:3: '||' (lv_parallelStates_7= ruleState )
            	    	    {
            	    	    match(input,17,FOLLOW_17_in_ruleStateContent678); if (failed) return current;
            	    	    if ( backtracking==0 ) {

            	    	              createLeafNode(grammarAccess.getStateContentAccess().getVerticalLineVerticalLineKeyword_1_4_1_0(), null); 
            	    	          
            	    	    }
            	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:375:1: (lv_parallelStates_7= ruleState )
            	    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:378:6: lv_parallelStates_7= ruleState
            	    	    {
            	    	    if ( backtracking==0 ) {
            	    	       
            	    	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_4_1_1_0(), currentNode); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleState_in_ruleStateContent712);
            	    	    lv_parallelStates_7=ruleState();
            	    	    _fsp--;
            	    	    if (failed) return current;
            	    	    if ( backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = factory.create(grammarAccess.getStateContentRule().getType().getClassifier());
            	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	      	        }
            	    	      	        
            	    	      	        try {
            	    	      	       		add(current, "parallelStates", lv_parallelStates_7, "State", currentNode);
            	    	      	        } catch (ValueConverterException vce) {
            	    	      				handleValueConverterException(vce);
            	    	      	        }
            	    	      	        currentNode = currentNode.getParent();
            	    	      	    
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
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(input,18,FOLLOW_18_in_ruleStateContent730); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateContentAccess().getRightCurlyBracketKeyword_2(), null); 
                  
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
    // $ANTLR end ruleStateContent


    // $ANTLR start entryRuleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:407:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:407:53: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:408:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEntryActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEntryAction_in_entryRuleEntryAction763);
            iv_ruleEntryAction=ruleEntryAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntryAction773); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEntryAction


    // $ANTLR start ruleEntryAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:415:1: ruleEntryAction returns [EObject current=null] : ( 'onentry' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? ) ;
    public final EObject ruleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject lv_trigger_1 = null;

        EObject lv_effects_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:420:6: ( ( 'onentry' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:421:1: ( 'onentry' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:421:1: ( 'onentry' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:421:2: 'onentry' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )?
            {
            match(input,19,FOLLOW_19_in_ruleEntryAction807); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEntryActionAccess().getOnentryKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:425:1: (lv_trigger_1= rulePrimaryExpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_BOOLEAN)||LA11_0==24||LA11_0==49) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred15()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:428:6: lv_trigger_1= rulePrimaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEntryActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEntryAction841);
                    lv_trigger_1=rulePrimaryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEntryActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "trigger", lv_trigger_1, "PrimaryExpression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:446:3: ( '/' (lv_effects_3= ruleEffect )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:446:4: '/' (lv_effects_3= ruleEffect )*
                    {
                    match(input,20,FOLLOW_20_in_ruleEntryAction856); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEntryActionAccess().getSolidusKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:450:1: (lv_effects_3= ruleEffect )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            int LA12_2 = input.LA(2);

                            if ( (synpred16()) ) {
                                alt12=1;
                            }


                        }
                        else if ( (LA12_0==RULE_STRING) ) {
                            int LA12_3 = input.LA(2);

                            if ( (synpred16()) ) {
                                alt12=1;
                            }


                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:453:6: lv_effects_3= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleEntryAction890);
                    	    lv_effects_3=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getEntryActionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "effects", lv_effects_3, "Effect", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // $ANTLR end ruleEntryAction


    // $ANTLR start entryRuleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:478:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:478:52: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:479:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExitActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExitAction_in_entryRuleExitAction930);
            iv_ruleExitAction=ruleExitAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExitAction940); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExitAction


    // $ANTLR start ruleExitAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:486:1: ruleExitAction returns [EObject current=null] : ( 'onexit' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? ) ;
    public final EObject ruleExitAction() throws RecognitionException {
        EObject current = null;

        EObject lv_trigger_1 = null;

        EObject lv_effects_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:491:6: ( ( 'onexit' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:492:1: ( 'onexit' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:492:1: ( 'onexit' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:492:2: 'onexit' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )?
            {
            match(input,21,FOLLOW_21_in_ruleExitAction974); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExitActionAccess().getOnexitKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:496:1: (lv_trigger_1= rulePrimaryExpression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_BOOLEAN)||LA14_0==24||LA14_0==49) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                int LA14_2 = input.LA(2);

                if ( (synpred18()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:499:6: lv_trigger_1= rulePrimaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExitActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleExitAction1008);
                    lv_trigger_1=rulePrimaryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExitActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "trigger", lv_trigger_1, "PrimaryExpression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:517:3: ( '/' (lv_effects_3= ruleEffect )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:517:4: '/' (lv_effects_3= ruleEffect )*
                    {
                    match(input,20,FOLLOW_20_in_ruleExitAction1023); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExitActionAccess().getSolidusKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:521:1: (lv_effects_3= ruleEffect )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            int LA15_2 = input.LA(2);

                            if ( (synpred19()) ) {
                                alt15=1;
                            }


                        }
                        else if ( (LA15_0==RULE_STRING) ) {
                            int LA15_3 = input.LA(2);

                            if ( (synpred19()) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:524:6: lv_effects_3= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleExitAction1057);
                    	    lv_effects_3=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getExitActionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "effects", lv_effects_3, "Effect", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
    // $ANTLR end ruleExitAction


    // $ANTLR start entryRuleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:549:1: entryRuleInnerAction returns [EObject current=null] : iv_ruleInnerAction= ruleInnerAction EOF ;
    public final EObject entryRuleInnerAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:549:53: (iv_ruleInnerAction= ruleInnerAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:550:2: iv_ruleInnerAction= ruleInnerAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInnerActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInnerAction_in_entryRuleInnerAction1097);
            iv_ruleInnerAction=ruleInnerAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInnerAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerAction1107); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInnerAction


    // $ANTLR start ruleInnerAction
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:557:1: ruleInnerAction returns [EObject current=null] : ( 'oninner' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? ) ;
    public final EObject ruleInnerAction() throws RecognitionException {
        EObject current = null;

        EObject lv_trigger_1 = null;

        EObject lv_effects_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:562:6: ( ( 'oninner' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:563:1: ( 'oninner' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:563:1: ( 'oninner' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:563:2: 'oninner' (lv_trigger_1= rulePrimaryExpression )? ( '/' (lv_effects_3= ruleEffect )* )?
            {
            match(input,22,FOLLOW_22_in_ruleInnerAction1141); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInnerActionAccess().getOninnerKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:567:1: (lv_trigger_1= rulePrimaryExpression )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_BOOLEAN)||LA17_0==24||LA17_0==49) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( (synpred21()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:570:6: lv_trigger_1= rulePrimaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInnerActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleInnerAction1175);
                    lv_trigger_1=rulePrimaryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInnerActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "trigger", lv_trigger_1, "PrimaryExpression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:588:3: ( '/' (lv_effects_3= ruleEffect )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:588:4: '/' (lv_effects_3= ruleEffect )*
                    {
                    match(input,20,FOLLOW_20_in_ruleInnerAction1190); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInnerActionAccess().getSolidusKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:592:1: (lv_effects_3= ruleEffect )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_ID) ) {
                            int LA18_2 = input.LA(2);

                            if ( (synpred22()) ) {
                                alt18=1;
                            }


                        }
                        else if ( (LA18_0==RULE_STRING) ) {
                            int LA18_3 = input.LA(2);

                            if ( (synpred22()) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:595:6: lv_effects_3= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInnerActionAccess().getEffectsEffectParserRuleCall_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleInnerAction1224);
                    	    lv_effects_3=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInnerActionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "effects", lv_effects_3, "Effect", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
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
    // $ANTLR end ruleInnerAction


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:620:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:620:52: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:621:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1264);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1274); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:628:1: ruleTransition returns [EObject current=null] : ( (lv_sourceStateName_0= RULE_ID )? (lv_transitionType_1= ruleTransitionType ) ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) ) ( 'with' ( RULE_ID ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_sourceStateName_0=null;
        Token lv_targetStateName_2=null;
        Enumerator lv_transitionType_1 = null;

        EObject lv_declaredTargetState_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:633:6: ( ( (lv_sourceStateName_0= RULE_ID )? (lv_transitionType_1= ruleTransitionType ) ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) ) ( 'with' ( RULE_ID ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:634:1: ( (lv_sourceStateName_0= RULE_ID )? (lv_transitionType_1= ruleTransitionType ) ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) ) ( 'with' ( RULE_ID ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:634:1: ( (lv_sourceStateName_0= RULE_ID )? (lv_transitionType_1= ruleTransitionType ) ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) ) ( 'with' ( RULE_ID ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:634:2: (lv_sourceStateName_0= RULE_ID )? (lv_transitionType_1= ruleTransitionType ) ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) ) ( 'with' ( RULE_ID ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:634:2: (lv_sourceStateName_0= RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:636:6: lv_sourceStateName_0= RULE_ID
                    {
                    lv_sourceStateName_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1321); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getSourceStateNameIDTerminalRuleCall_0_0(), "sourceStateName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "sourceStateName", lv_sourceStateName_0, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:654:3: (lv_transitionType_1= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:657:6: lv_transitionType_1= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTransitionTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition1364);
            lv_transitionType_1=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "transitionType", lv_transitionType_1, "TransitionType", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:675:2: ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=13 && LA21_0<=15)) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("675:2: ( (lv_targetStateName_2= RULE_ID ) | (lv_declaredTargetState_3= ruledeclaredTargetState ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:675:3: (lv_targetStateName_2= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:675:3: (lv_targetStateName_2= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:677:6: lv_targetStateName_2= RULE_ID
                    {
                    lv_targetStateName_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1391); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getTargetStateNameIDTerminalRuleCall_2_0_0(), "targetStateName"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "targetStateName", lv_targetStateName_2, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:696:6: (lv_declaredTargetState_3= ruledeclaredTargetState )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:696:6: (lv_declaredTargetState_3= ruledeclaredTargetState )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:699:6: lv_declaredTargetState_3= ruledeclaredTargetState
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getDeclaredTargetStateDeclaredTargetStateParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruledeclaredTargetState_in_ruleTransition1439);
                    lv_declaredTargetState_3=ruledeclaredTargetState();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "declaredTargetState", lv_declaredTargetState_3, "declaredTargetState", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:717:3: ( 'with' ( RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:717:4: 'with' ( RULE_ID )
                    {
                    match(input,23,FOLLOW_23_in_ruleTransition1454); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:721:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:724:3: RULE_ID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1476); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getTransitionLabelActionCrossReference_3_1_0(), "transitionLabel"); 
                      	
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
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuledeclaredTargetState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:744:1: entryRuledeclaredTargetState returns [EObject current=null] : iv_ruledeclaredTargetState= ruledeclaredTargetState EOF ;
    public final EObject entryRuledeclaredTargetState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaredTargetState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:744:61: (iv_ruledeclaredTargetState= ruledeclaredTargetState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:745:2: iv_ruledeclaredTargetState= ruledeclaredTargetState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclaredTargetStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruledeclaredTargetState_in_entryRuledeclaredTargetState1514);
            iv_ruledeclaredTargetState=ruledeclaredTargetState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruledeclaredTargetState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaredTargetState1524); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuledeclaredTargetState


    // $ANTLR start ruledeclaredTargetState
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:752:1: ruledeclaredTargetState returns [EObject current=null] : ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? 'state' (lv_declaredStateType_3= ruleStateType )? (lv_declaredStateName_4= RULE_ID ) ) ;
    public final EObject ruledeclaredTargetState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isFinal_1=null;
        Token lv_declaredStateName_4=null;
        Enumerator lv_declaredStateType_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:757:6: ( ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? 'state' (lv_declaredStateType_3= ruleStateType )? (lv_declaredStateName_4= RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:758:1: ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? 'state' (lv_declaredStateType_3= ruleStateType )? (lv_declaredStateName_4= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:758:1: ( (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? 'state' (lv_declaredStateType_3= ruleStateType )? (lv_declaredStateName_4= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:758:2: (lv_isInitial_0= 'init' )? (lv_isFinal_1= 'final' )? 'state' (lv_declaredStateType_3= ruleStateType )? (lv_declaredStateName_4= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:758:2: (lv_isInitial_0= 'init' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:760:6: lv_isInitial_0= 'init'
                    {
                    lv_isInitial_0=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruledeclaredTargetState1570); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclaredTargetStateAccess().getIsInitialInitKeyword_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeclaredTargetStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:779:3: (lv_isFinal_1= 'final' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:781:6: lv_isFinal_1= 'final'
                    {
                    lv_isFinal_1=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruledeclaredTargetState1605); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclaredTargetStateAccess().getIsFinalFinalKeyword_1_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeclaredTargetStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            match(input,15,FOLLOW_15_in_ruledeclaredTargetState1628); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getDeclaredTargetStateAccess().getStateKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:804:1: (lv_declaredStateType_3= ruleStateType )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=30 && LA25_0<=32)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:807:6: lv_declaredStateType_3= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateTypeStateTypeEnumRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruledeclaredTargetState1662);
                    lv_declaredStateType_3=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeclaredTargetStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "declaredStateType", lv_declaredStateType_3, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:825:3: (lv_declaredStateName_4= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:827:6: lv_declaredStateName_4= RULE_ID
            {
            lv_declaredStateName_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledeclaredTargetState1689); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getDeclaredTargetStateAccess().getDeclaredStateNameIDTerminalRuleCall_4_0(), "declaredStateName"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclaredTargetStateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "declaredStateName", lv_declaredStateName_4, "ID", lastConsumedNode);
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
    // $ANTLR end ruledeclaredTargetState


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:854:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:854:48: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:855:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect1732);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect1742); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:862:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:867:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:868:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:868:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==26) ) {
                    alt26=2;
                }
                else if ( (LA26_1==EOF||(LA26_1>=RULE_ID && LA26_1<=RULE_STRING)||(LA26_1>=13 && LA26_1<=19)||(LA26_1>=21 && LA26_1<=22)||LA26_1==24||LA26_1==27||(LA26_1>=29 && LA26_1<=35)) ) {
                    alt26=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("868:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 26, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("868:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:869:5: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect1789);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:879:5: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect1816);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:889:5: this_HostCode_2= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect1843);
                    this_HostCode_2=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_2; 
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:904:50: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:905:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission1875);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission1885); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:912:1: ruleEmission returns [EObject current=null] : ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:917:6: ( ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:918:1: ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:918:1: ( ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:918:2: ( RULE_ID ) ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:918:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:921:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission1932); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:934:2: ( '(' (lv_newValue_2= rulePrimaryExpression ) ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:934:3: '(' (lv_newValue_2= rulePrimaryExpression ) ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleEmission1945); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:938:1: (lv_newValue_2= rulePrimaryExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:941:6: lv_newValue_2= rulePrimaryExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValuePrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleEmission1979);
                    lv_newValue_2=rulePrimaryExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "newValue", lv_newValue_2, "PrimaryExpression", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,25,FOLLOW_25_in_ruleEmission1992); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:970:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:970:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:971:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment2027);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment2037); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:978:1: ruleAssignment returns [EObject current=null] : ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:983:6: ( ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:1: ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:1: ( ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:2: ( RULE_ID ) ':=' (lv_expression_2= rulePrimaryExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:984:2: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:987:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment2084); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }

            match(input,26,FOLLOW_26_in_ruleAssignment2096); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1004:1: (lv_expression_2= rulePrimaryExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1007:6: lv_expression_2= rulePrimaryExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionPrimaryExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAssignment2130);
            lv_expression_2=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "expression", lv_expression_2, "PrimaryExpression", currentNode);
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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1032:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1032:57: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1033:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference2167);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference2177); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1040:1: ruleSignalReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1045:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1046:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1046:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1049:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getSignalReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalReference2223); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalReferenceAccess().getReferenceSignalCrossReference_0(), "reference"); 
              	
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


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1069:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1069:59: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1070:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference2258);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference2268); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1077:1: ruleVariableReference returns [EObject current=null] : ( RULE_ID ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1082:6: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1083:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1083:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1086:3: RULE_ID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getVariableReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference2314); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableReferenceAccess().getReferenceVariableCrossReference_0(), "reference"); 
              	
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


    // $ANTLR start entryRuleValuedObject
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1106:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1106:54: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1107:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValuedObject_in_entryRuleValuedObject2349);
            iv_ruleValuedObject=ruleValuedObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuedObject2359); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedObject


    // $ANTLR start ruleValuedObject
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1114:1: ruleValuedObject returns [EObject current=null] : (this_Signal_0= ruleSignal | this_Variable_1= ruleVariable ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject this_Signal_0 = null;

        EObject this_Variable_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1119:6: ( (this_Signal_0= ruleSignal | this_Variable_1= ruleVariable ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1120:1: (this_Signal_0= ruleSignal | this_Variable_1= ruleVariable )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1120:1: (this_Signal_0= ruleSignal | this_Variable_1= ruleVariable )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            else if ( (LA28_0==29) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1120:1: (this_Signal_0= ruleSignal | this_Variable_1= ruleVariable )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1121:5: this_Signal_0= ruleSignal
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectAccess().getSignalParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignal_in_ruleValuedObject2406);
                    this_Signal_0=ruleSignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Signal_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1131:5: this_Variable_1= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectAccess().getVariableParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleValuedObject2433);
                    this_Variable_1=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Variable_1; 
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
    // $ANTLR end ruleValuedObject


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1146:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1146:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1147:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal2465);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal2475); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignal


    // $ANTLR start ruleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1154:1: ruleSignal returns [EObject current=null] : ( 'input' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_initialValue_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1159:6: ( ( 'input' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1160:1: ( 'input' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1160:1: ( 'input' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1160:2: 'input' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';'
            {
            match(input,27,FOLLOW_27_in_ruleSignal2509); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getInputKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1164:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1166:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2531); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1184:2: ( ':=' (lv_initialValue_3= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1184:3: ':=' (lv_initialValue_3= RULE_ID )
                    {
                    match(input,26,FOLLOW_26_in_ruleSignal2549); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1188:1: (lv_initialValue_3= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1190:6: lv_initialValue_3= RULE_ID
                    {
                    lv_initialValue_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal2571); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueIDTerminalRuleCall_2_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_3, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_ruleSignal2590); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getSemicolonKeyword_3(), null); 
                  
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
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1219:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1219:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1220:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2623);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2633); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1227:1: ruleVariable returns [EObject current=null] : ( 'var' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_initialValue_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1232:6: ( ( 'var' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1233:1: ( 'var' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1233:1: ( 'var' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1233:2: 'var' (lv_name_1= RULE_ID ) ( ':=' (lv_initialValue_3= RULE_ID ) )? ';'
            {
            match(input,29,FOLLOW_29_in_ruleVariable2667); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1237:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1239:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2689); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1257:2: ( ':=' (lv_initialValue_3= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1257:3: ':=' (lv_initialValue_3= RULE_ID )
                    {
                    match(input,26,FOLLOW_26_in_ruleVariable2707); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1261:1: (lv_initialValue_3= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1263:6: lv_initialValue_3= RULE_ID
                    {
                    lv_initialValue_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2729); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getVariableAccess().getInitialValueIDTerminalRuleCall_2_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_3, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,28,FOLLOW_28_in_ruleVariable2748); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getSemicolonKeyword_3(), null); 
                  
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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1292:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1292:50: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1293:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue2781);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue2791); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1300:1: ruleIntValue returns [EObject current=null] : (lv_value_0= RULE_INT ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1305:6: ( (lv_value_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1306:1: (lv_value_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1306:1: (lv_value_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1308:6: lv_value_0= RULE_INT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue2837); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "value", lv_value_0, "INT", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1333:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1333:52: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1334:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue2877);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue2887); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1341:1: ruleFloatValue returns [EObject current=null] : (lv_value_0= RULE_FLOAT ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1346:6: ( (lv_value_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1347:1: (lv_value_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1347:1: (lv_value_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1349:6: lv_value_0= RULE_FLOAT
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue2933); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0(), "value"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "value", lv_value_0, "Float", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1374:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1374:54: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1375:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2973);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue2983); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1382:1: ruleBooleanValue returns [EObject current=null] : (lv_value_0= RULE_BOOLEAN ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1387:6: ( (lv_value_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1388:1: (lv_value_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1388:1: (lv_value_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1390:6: lv_value_0= RULE_BOOLEAN
            {
            lv_value_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3029); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0(), "value"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "value", lv_value_0, "Boolean", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1417:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1417:50: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1418:2: iv_ruleHostCode= ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode3071);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHostCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode3081); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHostCode


    // $ANTLR start ruleHostCode
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1425:1: ruleHostCode returns [EObject current=null] : (lv_code_0= RULE_STRING ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1430:6: ( (lv_code_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1431:1: (lv_code_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1431:1: (lv_code_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1433:6: lv_code_0= RULE_STRING
            {
            lv_code_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode3127); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0(), "code"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "code", lv_code_0, "STRING", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
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
    // $ANTLR end ruleHostCode


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1460:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1460:54: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1461:2: iv_ruleValOperation= ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation3169);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation3179); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValOperation


    // $ANTLR start ruleValOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1468:1: ruleValOperation returns [EObject current=null] : ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1473:6: ( ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1474:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1474:1: ( (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1474:2: (lv_operator_0= ruleValOperator ) (lv_subExpressions_1= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1474:2: (lv_operator_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1477:6: lv_operator_0= ruleValOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation3238);
            lv_operator_0=ruleValOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "operator", lv_operator_0, "ValOperator", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1495:2: (lv_subExpressions_1= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1498:6: lv_subExpressions_1= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation3276);
            lv_subExpressions_1=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "subExpressions", lv_subExpressions_1, "SignalReference", currentNode);
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
    // $ANTLR end ruleValOperation


    // $ANTLR start entryRuleValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1523:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1523:57: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1524:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression3313);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression3323); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValueExpression


    // $ANTLR start ruleValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1531:1: ruleValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference ) ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1536:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1537:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1537:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt31=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt31=2;
                }
                break;
            case 49:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1537:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1538:5: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValueExpression3370);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1548:5: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleValueExpression3397);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1558:5: this_ValOperation_2= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleValueExpression3424);
                    this_ValOperation_2=ruleValOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1568:5: this_VariableReference_3= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleValueExpression3451);
                    this_VariableReference_3=ruleVariableReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_VariableReference_3; 
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
    // $ANTLR end ruleValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1583:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1583:58: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1584:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3483);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation3493); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1591:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1596:6: ( (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1597:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1597:1: (this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1598:5: this_ValueExpression_0= ruleValueExpression ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation3540);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:1: ( () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:2: () (lv_operator_2= ruleCompareOperator ) (lv_subExpressions_3= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1606:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1607:5: 
            {
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompareOperationAccess().getOperationSubExpressionsAction_1_0().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getOperationSubExpressionsAction_1_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1622:2: (lv_operator_2= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1625:6: lv_operator_2= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation3583);
            lv_operator_2=ruleCompareOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "operator", lv_operator_2, "CompareOperator", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1643:2: (lv_subExpressions_3= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1646:6: lv_subExpressions_3= ruleValueExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation3621);
            lv_subExpressions_3=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "subExpressions", lv_subExpressions_3, "ValueExpression", currentNode);
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
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleNotOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1671:1: entryRuleNotOperation returns [EObject current=null] : iv_ruleNotOperation= ruleNotOperation EOF ;
    public final EObject entryRuleNotOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1671:54: (iv_ruleNotOperation= ruleNotOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1672:2: iv_ruleNotOperation= ruleNotOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotOperation_in_entryRuleNotOperation3659);
            iv_ruleNotOperation=ruleNotOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperation3669); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotOperation


    // $ANTLR start ruleNotOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1679:1: ruleNotOperation returns [EObject current=null] : ( (lv_operators_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) ) ;
    public final EObject ruleNotOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operators_0 = null;

        EObject lv_subExpressions_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1684:6: ( ( (lv_operators_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1685:1: ( (lv_operators_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1685:1: ( (lv_operators_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1685:2: (lv_operators_0= ruleNotOperator ) (lv_subExpressions_1= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1685:2: (lv_operators_0= ruleNotOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1688:6: lv_operators_0= ruleNotOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getOperatorsNotOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNotOperation3728);
            lv_operators_0=ruleNotOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNotOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "operators", lv_operators_0, "NotOperator", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1706:2: (lv_subExpressions_1= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1709:6: lv_subExpressions_1= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNotOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleNotOperation3766);
            lv_subExpressions_1=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNotOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "subExpressions", lv_subExpressions_1, "BooleanExpression", currentNode);
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
    // $ANTLR end ruleNotOperation


    // $ANTLR start entryRuleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1734:1: entryRuleNotOrNormalExpression returns [EObject current=null] : iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF ;
    public final EObject entryRuleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1734:63: (iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1735:2: iv_ruleNotOrNormalExpression= ruleNotOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrNormalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression3803);
            iv_ruleNotOrNormalExpression=ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrNormalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOrNormalExpression3813); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotOrNormalExpression


    // $ANTLR start ruleNotOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1742:1: ruleNotOrNormalExpression returns [EObject current=null] : (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression ) ;
    public final EObject ruleNotOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotOperation_0 = null;

        EObject this_BooleanExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1747:6: ( (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1748:1: (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1748:1: (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID||(LA32_0>=RULE_INT && LA32_0<=RULE_BOOLEAN)||LA32_0==24||LA32_0==49) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1748:1: (this_NotOperation_0= ruleNotOperation | this_BooleanExpression_1= ruleBooleanExpression )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1749:5: this_NotOperation_0= ruleNotOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getNotOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression3860);
                    this_NotOperation_0=ruleNotOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1759:5: this_BooleanExpression_1= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrNormalExpressionAccess().getBooleanExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleNotOrNormalExpression3887);
                    this_BooleanExpression_1=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_1; 
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
    // $ANTLR end ruleNotOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1774:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1774:54: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1775:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation3919);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation3929); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAndOperation


    // $ANTLR start ruleAndOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1782:1: ruleAndOperation returns [EObject current=null] : (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrNormalExpression_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1787:6: ( (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1788:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1788:1: (this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1789:5: this_NotOrNormalExpression_0= ruleNotOrNormalExpression ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getNotOrNormalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation3976);
            this_NotOrNormalExpression_0=ruleNotOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NotOrNormalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1797:1: ( () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==42) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1797:2: () (lv_operator_2= ruleOperatorAnd ) (lv_subExpression_3= ruleNotOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1797:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1798:5: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndOperationAccess().getOperationSubExpressionAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpression", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getOperationSubExpressionAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1813:2: (lv_operator_2= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1816:6: lv_operator_2= ruleOperatorAnd
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation4019);
            	    lv_operator_2=ruleOperatorAnd();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2, "OperatorAnd", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1834:2: (lv_subExpression_3= ruleNotOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1837:6: lv_subExpression_3= ruleNotOrNormalExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionNotOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation4057);
            	    lv_subExpression_3=ruleNotOrNormalExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "subExpression", lv_subExpression_3, "NotOrNormalExpression", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // $ANTLR end ruleAndOperation


    // $ANTLR start entryRuleOrOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1862:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1862:53: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1863:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation4096);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation4106); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOrOperation


    // $ANTLR start ruleOrOperation
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1870:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2 = null;

        EObject lv_subExpressions_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1875:6: ( (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1876:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1876:1: (this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1877:5: this_AndOperation_0= ruleAndOperation ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation4153);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:1: ( () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==43) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:2: () (lv_operator_2= ruleOperatorOr ) (lv_subExpressions_3= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1885:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1886:5: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrOperationAccess().getOperationSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrOperationAccess().getOperationSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1901:2: (lv_operator_2= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1904:6: lv_operator_2= ruleOperatorOr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation4196);
            	    lv_operator_2=ruleOperatorOr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2, "OperatorOr", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1922:2: (lv_subExpressions_3= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1925:6: lv_subExpressions_3= ruleAndOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation4234);
            	    lv_subExpressions_3=ruleAndOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "subExpressions", lv_subExpressions_3, "AndOperation", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // $ANTLR end ruleOrOperation


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1950:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1950:59: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1951:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression4273);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression4283); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1958:1: ruleBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_SignalReference_1 = null;

        EObject this_CompareOperation_2 = null;

        EObject this_OrOperation_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1963:6: ( (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1964:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1964:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt35=1;
                }
                break;
            case RULE_ID:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==EOF||(LA35_2>=RULE_ID && LA35_2<=RULE_STRING)||(LA35_2>=13 && LA35_2<=22)||LA35_2==25||LA35_2==27||(LA35_2>=29 && LA35_2<=35)||(LA35_2>=42 && LA35_2<=43)) ) {
                    alt35=2;
                }
                else if ( ((LA35_2>=36 && LA35_2<=40)) ) {
                    alt35=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1964:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 49:
                {
                alt35=3;
                }
                break;
            case 24:
                {
                alt35=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1964:1: (this_BooleanValue_0= ruleBooleanValue | this_SignalReference_1= ruleSignalReference | this_CompareOperation_2= ruleCompareOperation | ( '(' this_OrOperation_4= ruleOrOperation ')' ) )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1965:5: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleBooleanExpression4330);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1975:5: this_SignalReference_1= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getSignalReferenceParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleBooleanExpression4357);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1985:5: this_CompareOperation_2= ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getCompareOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleBooleanExpression4384);
                    this_CompareOperation_2=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1994:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1994:6: ( '(' this_OrOperation_4= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:1994:7: '(' this_OrOperation_4= ruleOrOperation ')'
                    {
                    match(input,24,FOLLOW_24_in_ruleBooleanExpression4399); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression4421);
                    this_OrOperation_4=ruleOrOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OrOperation_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,25,FOLLOW_25_in_ruleBooleanExpression4429); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getBooleanExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                          
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
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRulePrimaryExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2018:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2018:59: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2019:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4463);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression4473); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2026:1: rulePrimaryExpression returns [EObject current=null] : this_BooleanExpression_0= ruleBooleanExpression ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2031:6: (this_BooleanExpression_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2033:5: this_BooleanExpression_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBooleanExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_rulePrimaryExpression4519);
            this_BooleanExpression_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_BooleanExpression_0; 
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
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2048:1: ruleStateType returns [Enumerator current=null] : ( ( 'PSEUDO' ) | ( 'reference' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2052:6: ( ( ( 'PSEUDO' ) | ( 'reference' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2053:1: ( ( 'PSEUDO' ) | ( 'reference' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2053:1: ( ( 'PSEUDO' ) | ( 'reference' ) | ( 'textual' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt36=1;
                }
                break;
            case 31:
                {
                alt36=2;
                }
                break;
            case 32:
                {
                alt36=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2053:1: ( ( 'PSEUDO' ) | ( 'reference' ) | ( 'textual' ) )", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2053:2: ( 'PSEUDO' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2053:2: ( 'PSEUDO' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2053:4: 'PSEUDO'
                    {
                    match(input,30,FOLLOW_30_in_ruleStateType4564); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2059:6: ( 'reference' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2059:6: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2059:8: 'reference'
                    {
                    match(input,31,FOLLOW_31_in_ruleStateType4579); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2065:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2065:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2065:8: 'textual'
                    {
                    match(input,32,FOLLOW_32_in_ruleStateType4594); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_2(), null); 
                          
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
    // $ANTLR end ruleStateType


    // $ANTLR start ruleTransitionType
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2075:1: ruleTransitionType returns [Enumerator current=null] : ( ( 'o->' ) | ( '-->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2079:6: ( ( ( 'o->' ) | ( '-->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2080:1: ( ( 'o->' ) | ( '-->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2080:1: ( ( 'o->' ) | ( '-->' ) | ( '>->' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt37=1;
                }
                break;
            case 34:
                {
                alt37=2;
                }
                break;
            case 35:
                {
                alt37=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2080:1: ( ( 'o->' ) | ( '-->' ) | ( '>->' ) )", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2080:2: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2080:2: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2080:4: 'o->'
                    {
                    match(input,33,FOLLOW_33_in_ruleTransitionType4637); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2086:6: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2086:6: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2086:8: '-->'
                    {
                    match(input,34,FOLLOW_34_in_ruleTransitionType4652); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2092:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2092:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2092:8: '>->'
                    {
                    match(input,35,FOLLOW_35_in_ruleTransitionType4667); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2(), null); 
                          
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
    // $ANTLR end ruleTransitionType


    // $ANTLR start ruleOperatorKind
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2102:1: ruleOperatorKind returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'not' ) | ( 'and' ) | ( 'or' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) | ( '?' ) | ( 'pre' ) ) ;
    public final Enumerator ruleOperatorKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2106:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'not' ) | ( 'and' ) | ( 'or' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) | ( '?' ) | ( 'pre' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2107:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'not' ) | ( 'and' ) | ( 'or' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) | ( '?' ) | ( 'pre' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2107:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'not' ) | ( 'and' ) | ( 'or' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) | ( '?' ) | ( 'pre' ) )
            int alt38=15;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt38=1;
                }
                break;
            case 37:
                {
                alt38=2;
                }
                break;
            case 38:
                {
                alt38=3;
                }
                break;
            case 39:
                {
                alt38=4;
                }
                break;
            case 40:
                {
                alt38=5;
                }
                break;
            case 41:
                {
                alt38=6;
                }
                break;
            case 42:
                {
                alt38=7;
                }
                break;
            case 43:
                {
                alt38=8;
                }
                break;
            case 44:
                {
                alt38=9;
                }
                break;
            case 45:
                {
                alt38=10;
                }
                break;
            case 46:
                {
                alt38=11;
                }
                break;
            case 47:
                {
                alt38=12;
                }
                break;
            case 48:
                {
                alt38=13;
                }
                break;
            case 49:
                {
                alt38=14;
                }
                break;
            case 50:
                {
                alt38=15;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2107:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( 'not' ) | ( 'and' ) | ( 'or' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( 'div' ) | ( 'mod' ) | ( '?' ) | ( 'pre' ) )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2107:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2107:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2107:4: '='
                    {
                    match(input,36,FOLLOW_36_in_ruleOperatorKind4710); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2113:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2113:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2113:8: '<'
                    {
                    match(input,37,FOLLOW_37_in_ruleOperatorKind4725); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2119:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2119:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2119:8: '<='
                    {
                    match(input,38,FOLLOW_38_in_ruleOperatorKind4740); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2125:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2125:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2125:8: '>'
                    {
                    match(input,39,FOLLOW_39_in_ruleOperatorKind4755); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2131:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2131:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2131:8: '>='
                    {
                    match(input,40,FOLLOW_40_in_ruleOperatorKind4770); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2137:6: ( 'not' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2137:6: ( 'not' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2137:8: 'not'
                    {
                    match(input,41,FOLLOW_41_in_ruleOperatorKind4785); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getNOTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getNOTEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2143:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2143:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2143:8: 'and'
                    {
                    match(input,42,FOLLOW_42_in_ruleOperatorKind4800); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2149:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2149:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2149:8: 'or'
                    {
                    match(input,43,FOLLOW_43_in_ruleOperatorKind4815); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getOREnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getOREnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2155:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2155:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2155:8: '+'
                    {
                    match(input,44,FOLLOW_44_in_ruleOperatorKind4830); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getADDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getADDEnumLiteralDeclaration_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2161:6: ( '-' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2161:6: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2161:8: '-'
                    {
                    match(input,45,FOLLOW_45_in_ruleOperatorKind4845); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getSUBEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getSUBEnumLiteralDeclaration_9(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2167:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2167:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2167:8: '*'
                    {
                    match(input,46,FOLLOW_46_in_ruleOperatorKind4860); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getMULTEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getMULTEnumLiteralDeclaration_10(), null); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:6: ( 'div' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:6: ( 'div' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2173:8: 'div'
                    {
                    match(input,47,FOLLOW_47_in_ruleOperatorKind4875); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getDIVEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getDIVEnumLiteralDeclaration_11(), null); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2179:6: ( 'mod' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2179:6: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2179:8: 'mod'
                    {
                    match(input,48,FOLLOW_48_in_ruleOperatorKind4890); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getMODEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getMODEnumLiteralDeclaration_12(), null); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2185:6: ( '?' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2185:6: ( '?' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2185:8: '?'
                    {
                    match(input,49,FOLLOW_49_in_ruleOperatorKind4905); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getVALEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getVALEnumLiteralDeclaration_13(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:6: ( 'pre' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:6: ( 'pre' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2191:8: 'pre'
                    {
                    match(input,50,FOLLOW_50_in_ruleOperatorKind4920); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getOperatorKindAccess().getPREEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getOperatorKindAccess().getPREEnumLiteralDeclaration_14(), null); 
                          
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
    // $ANTLR end ruleOperatorKind


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2201:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2205:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2206:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2206:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2206:3: '?'
            {
            match(input,49,FOLLOW_49_in_ruleValOperator4962); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getValOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleValOperator


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2216:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2220:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt39=1;
                }
                break;
            case 37:
                {
                alt39=2;
                }
                break;
            case 38:
                {
                alt39=3;
                }
                break;
            case 39:
                {
                alt39=4;
                }
                break;
            case 40:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2221:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2221:4: '='
                    {
                    match(input,36,FOLLOW_36_in_ruleCompareOperator5004); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2227:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2227:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2227:8: '<'
                    {
                    match(input,37,FOLLOW_37_in_ruleCompareOperator5019); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2233:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2233:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2233:8: '<='
                    {
                    match(input,38,FOLLOW_38_in_ruleCompareOperator5034); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2239:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2239:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2239:8: '>'
                    {
                    match(input,39,FOLLOW_39_in_ruleCompareOperator5049); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2245:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2245:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2245:8: '>='
                    {
                    match(input,40,FOLLOW_40_in_ruleCompareOperator5064); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
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


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2255:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2259:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2260:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2260:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2260:3: 'not'
            {
            match(input,41,FOLLOW_41_in_ruleNotOperator5106); if (failed) return current;
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


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2270:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2274:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2275:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2275:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2275:3: 'or'
            {
            match(input,43,FOLLOW_43_in_ruleOperatorOr5147); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorOrAccess().getOREnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorOr


    // $ANTLR start ruleOperatorAnd
    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2285:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2289:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2290:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2290:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:2290:3: 'and'
            {
            match(input,42,FOLLOW_42_in_ruleOperatorAnd5188); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOperatorAndAccess().getANDEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleOperatorAnd

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:90:6: 'init'
        {
        match(input,13,FOLLOW_13_in_synpred1135); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:111:6: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:111:6: 'final'
        {
        match(input,14,FOLLOW_14_in_synpred2170); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:133:6: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:133:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateKindStateTypeEnumRuleCall_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred3218);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:151:4: ( 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:151:4: 'state'
        {
        match(input,15,FOLLOW_15_in_synpred4233); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:157:6: ( RULE_ID )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:157:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred5257); if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:177:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred6288); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:198:6: ( ruleStateContent )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:198:6: ruleStateContent
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getStateContentStateContentParserRuleCall_6_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateContent_in_synpred7331);
        ruleStateContent();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:219:6: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:219:6: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred8370);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:262:2: ( ( ruleExitAction ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:262:2: ( ruleExitAction )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:262:2: ( ruleExitAction )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:265:6: ruleExitAction
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getExitActionsExitActionParserRuleCall_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExitAction_in_synpred9487);
        ruleExitAction();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:284:6: ( ( ruleEntryAction ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:284:6: ( ruleEntryAction )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:284:6: ( ruleEntryAction )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:287:6: ruleEntryAction
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getEntryActionsEntryActionParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEntryAction_in_synpred10531);
        ruleEntryAction();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:306:6: ( ( ruleInnerAction ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:306:6: ( ruleInnerAction )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:306:6: ( ruleInnerAction )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:309:6: ruleInnerAction
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getInnerActionInnerActionParserRuleCall_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleInnerAction_in_synpred11575);
        ruleInnerAction();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ( ruleValuedObject ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ruleValuedObject )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:328:6: ( ruleValuedObject )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:331:6: ruleValuedObject
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getSignalsAndVariablesValuedObjectParserRuleCall_1_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValuedObject_in_synpred12619);
        ruleValuedObject();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:3: ( '||' ( ruleState ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:3: '||' ( ruleState )
        {
        match(input,17,FOLLOW_17_in_synpred13678); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:375:1: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:378:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_4_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred13712);
        ruleState();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:6: ( ( ( ruleState ) ( '||' ( ruleState ) )* ) )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:6: ( ( ruleState ) ( '||' ( ruleState ) )* )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:6: ( ( ruleState ) ( '||' ( ruleState ) )* )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:7: ( ruleState ) ( '||' ( ruleState ) )*
        {
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:350:7: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:353:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getInnerStatesStateParserRuleCall_1_4_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred14664);
        ruleState();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:2: ( '||' ( ruleState ) )*
        loop40:
        do {
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17) ) {
                alt40=1;
            }


            switch (alt40) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:371:3: '||' ( ruleState )
        	    {
        	    match(input,17,FOLLOW_17_in_synpred14678); if (failed) return ;
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:375:1: ( ruleState )
        	    // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:378:6: ruleState
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateContentAccess().getParallelStatesStateParserRuleCall_1_4_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleState_in_synpred14712);
        	    ruleState();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop40;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:428:6: ( rulePrimaryExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:428:6: rulePrimaryExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEntryActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulePrimaryExpression_in_synpred15841);
        rulePrimaryExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:453:6: ( ruleEffect )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:453:6: ruleEffect
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred16890);
        ruleEffect();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:499:6: ( rulePrimaryExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:499:6: rulePrimaryExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExitActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulePrimaryExpression_in_synpred181008);
        rulePrimaryExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:524:6: ( ruleEffect )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:524:6: ruleEffect
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred191057);
        ruleEffect();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:570:6: ( rulePrimaryExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:570:6: rulePrimaryExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInnerActionAccess().getTriggerPrimaryExpressionParserRuleCall_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulePrimaryExpression_in_synpred211175);
        rulePrimaryExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:595:6: ( ruleEffect )
        // ../de.cau.cs.kieler.synccharts.dsl.rtsys/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalRetypingSynccharts.g:595:6: ruleEffect
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getInnerActionAccess().getEffectsEffectParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred221224);
        ruleEffect();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred22

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
    public final boolean synpred18() {
        backtracking++;
        int start = input.mark();
        try {
            synpred18_fragment(); // can never throw exception
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
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
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
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
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
    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
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
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleState135 = new BitSet(new long[]{0x0000000FC001C032L});
    public static final BitSet FOLLOW_14_in_ruleState170 = new BitSet(new long[]{0x0000000FC0018032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState218 = new BitSet(new long[]{0x0000000E00018032L});
    public static final BitSet FOLLOW_15_in_ruleState233 = new BitSet(new long[]{0x0000000E00010032L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState257 = new BitSet(new long[]{0x0000000E00010032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState288 = new BitSet(new long[]{0x0000000E00010012L});
    public static final BitSet FOLLOW_ruleStateContent_in_ruleState331 = new BitSet(new long[]{0x0000000E00000012L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState370 = new BitSet(new long[]{0x0000000E00000012L});
    public static final BitSet FOLLOW_ruleStateContent_in_entryRuleStateContent408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateContent418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStateContent452 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_ruleExitAction_in_ruleStateContent487 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_ruleEntryAction_in_ruleStateContent531 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_ruleInnerAction_in_ruleStateContent575 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_ruleValuedObject_in_ruleStateContent619 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateContent664 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_17_in_ruleStateContent678 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateContent712 = new BitSet(new long[]{0x0000000FE86FE030L});
    public static final BitSet FOLLOW_18_in_ruleStateContent730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEntryAction807 = new BitSet(new long[]{0x00020000011001D2L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEntryAction841 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleEntryAction856 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction890 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExitAction940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExitAction974 = new BitSet(new long[]{0x00020000011001D2L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleExitAction1008 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleExitAction1023 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction1057 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleInnerAction_in_entryRuleInnerAction1097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerAction1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInnerAction1141 = new BitSet(new long[]{0x00020000011001D2L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleInnerAction1175 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleInnerAction1190 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleInnerAction1224 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1321 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition1364 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1391 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruledeclaredTargetState_in_ruleTransition1439 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleTransition1454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaredTargetState_in_entryRuledeclaredTargetState1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaredTargetState1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruledeclaredTargetState1570 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruledeclaredTargetState1605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruledeclaredTargetState1628 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_ruleStateType_in_ruledeclaredTargetState1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledeclaredTargetState1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect1732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission1932 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleEmission1945 = new BitSet(new long[]{0x00020000010001D0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleEmission1979 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEmission1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment2084 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssignment2096 = new BitSet(new long[]{0x00020000010001D0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAssignment2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalReference2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject2349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleValuedObject2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleValuedObject2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSignal2509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2531 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_ruleSignal2549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2571 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSignal2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVariable2667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2689 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_ruleVariable2707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2729 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleVariable2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue2877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode3071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation3238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression3313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValueExpression3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleValueExpression3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleValueExpression3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleValueExpression3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation3540 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation3583 = new BitSet(new long[]{0x00020000000000D0L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_entryRuleNotOperation3659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperation3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotOperation3728 = new BitSet(new long[]{0x00020000010001D0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleNotOperation3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_entryRuleNotOrNormalExpression3803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOrNormalExpression3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperation_in_ruleNotOrNormalExpression3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleNotOrNormalExpression3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation3976 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation4019 = new BitSet(new long[]{0x00020200010001D0L});
    public static final BitSet FOLLOW_ruleNotOrNormalExpression_in_ruleAndOperation4057 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation4096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation4153 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation4196 = new BitSet(new long[]{0x00020200010001D0L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation4234 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression4273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleBooleanExpression4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleBooleanExpression4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleBooleanExpression4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBooleanExpression4399 = new BitSet(new long[]{0x00020200010001D0L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression4421 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBooleanExpression4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression4463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_rulePrimaryExpression4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleStateType4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStateType4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStateType4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTransitionType4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTransitionType4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTransitionType4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOperatorKind4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOperatorKind4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOperatorKind4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperatorKind4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperatorKind4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperatorKind4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperatorKind4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperatorKind4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperatorKind4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOperatorKind4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleOperatorKind4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOperatorKind4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOperatorKind4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOperatorKind4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOperatorKind4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleValOperator4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCompareOperator5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCompareOperator5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCompareOperator5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCompareOperator5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCompareOperator5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNotOperator5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperatorOr5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperatorAnd5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateContent_in_synpred7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExitAction_in_synpred9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntryAction_in_synpred10531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerAction_in_synpred11575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValuedObject_in_synpred12619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred13678 = new BitSet(new long[]{0x0000000FC001E032L});
    public static final BitSet FOLLOW_ruleState_in_synpred13712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_synpred14664 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_synpred14678 = new BitSet(new long[]{0x0000000FC003E032L});
    public static final BitSet FOLLOW_ruleState_in_synpred14712 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_synpred15841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred16890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_synpred181008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred191057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_synpred211175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred221224 = new BitSet(new long[]{0x0000000000000002L});

}