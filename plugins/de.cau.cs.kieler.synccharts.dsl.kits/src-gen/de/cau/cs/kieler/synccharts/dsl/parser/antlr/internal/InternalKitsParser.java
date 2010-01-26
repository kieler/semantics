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
import de.cau.cs.kieler.synccharts.dsl.services.KitsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class InternalKitsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "'init'", "'final'", "'state'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'{'", "'||'", "'}'", "'@'", "'with'", "'#'", "'/'", "','", "' history'", "';'", "'var'", "':='", "': '", "'input'", "'output'", "': combine'", "'.'", "'('", "')'", "'NORMAL'", "'cond'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'hostCombineOperator'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'hostType'", "'-->'", "'o->'", "'>->'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'not'", "'pre'", "'or'", "'and'", "'-'", "'mod'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalKitsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[174+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KitsGrammarAccess grammarAccess;
     	
        public InternalKitsParser(TokenStream input, IAstFactory factory, KitsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Region";	
       	} 



    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:79:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:80:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:81:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion81);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRegion


    // $ANTLR start ruleRegion
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ruleRegion returns [EObject current=null] : ( () ( 'region' )? ( (lv_id_2_0= RULE_ID ) )? ( ( (lv_variables_3_0= ruleVariable ) ) | ( (lv_signals_4_0= ruleSignal ) ) )* ( (lv_innerStates_5_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        EObject lv_variables_3_0 = null;

        EObject lv_signals_4_0 = null;

        EObject lv_innerStates_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:93:6: ( ( () ( 'region' )? ( (lv_id_2_0= RULE_ID ) )? ( ( (lv_variables_3_0= ruleVariable ) ) | ( (lv_signals_4_0= ruleSignal ) ) )* ( (lv_innerStates_5_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:1: ( () ( 'region' )? ( (lv_id_2_0= RULE_ID ) )? ( ( (lv_variables_3_0= ruleVariable ) ) | ( (lv_signals_4_0= ruleSignal ) ) )* ( (lv_innerStates_5_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:1: ( () ( 'region' )? ( (lv_id_2_0= RULE_ID ) )? ( ( (lv_variables_3_0= ruleVariable ) ) | ( (lv_signals_4_0= ruleSignal ) ) )* ( (lv_innerStates_5_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: () ( 'region' )? ( (lv_id_2_0= RULE_ID ) )? ( ( (lv_variables_3_0= ruleVariable ) ) | ( (lv_signals_4_0= ruleSignal ) ) )* ( (lv_innerStates_5_0= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:95:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getRegionAccess().getRegionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getRegionAccess().getRegionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:2: ( 'region' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:4: 'region'
                    {
                    match(input,13,FOLLOW_13_in_ruleRegion139); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:3: ( (lv_id_2_0= RULE_ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: (lv_id_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegion158); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_2_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:136:3: ( ( (lv_variables_3_0= ruleVariable ) ) | ( (lv_signals_4_0= ruleSignal ) ) )*
            loop3:
            do {
                int alt3=3;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 31:
                    {
                    alt3=1;
                    }
                    break;
                case 34:
                case 35:
                    {
                    alt3=2;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:136:4: ( (lv_variables_3_0= ruleVariable ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:136:4: ( (lv_variables_3_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:1: (lv_variables_3_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:1: (lv_variables_3_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:138:3: lv_variables_3_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion186);
            	    lv_variables_3_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_3_0, 
            	      	        		"Variable", 
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:161:6: ( (lv_signals_4_0= ruleSignal ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:161:6: ( (lv_signals_4_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:162:1: (lv_signals_4_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:162:1: (lv_signals_4_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:163:3: lv_signals_4_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion213);
            	    lv_signals_4_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_4_0, 
            	      	        		"Signal", 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:185:4: ( (lv_innerStates_5_0= ruleState ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=14 && LA4_0<=16)||(LA4_0>=40 && LA4_0<=43)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:186:1: (lv_innerStates_5_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:186:1: (lv_innerStates_5_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:187:3: lv_innerStates_5_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion236);
            	    lv_innerStates_5_0=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"innerStates",
            	      	        		lv_innerStates_5_0, 
            	      	        		"State", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end ruleRegion


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:217:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:218:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:219:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState273);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState283); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:226:1: ruleState returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_label_5_0= ruleFullStateID ) ) ( (lv_id_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( (lv_outgoingTransitions_22_0= ruleTextualTransition ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_id_6_0=null;
        Token lv_bodyText_7_0=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_label_5_0 = null;

        EObject lv_signals_8_0 = null;

        EObject lv_entryActions_10_0 = null;

        EObject lv_innerActions_12_0 = null;

        EObject lv_exitActions_14_0 = null;

        EObject lv_suspensionTrigger_16_0 = null;

        EObject lv_regions_18_0 = null;

        EObject lv_regions_20_0 = null;

        EObject lv_outgoingTransitions_22_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:231:6: ( ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_label_5_0= ruleFullStateID ) ) ( (lv_id_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( (lv_outgoingTransitions_22_0= ruleTextualTransition ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:232:1: ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_label_5_0= ruleFullStateID ) ) ( (lv_id_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( (lv_outgoingTransitions_22_0= ruleTextualTransition ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:232:1: ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_label_5_0= ruleFullStateID ) ) ( (lv_id_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( (lv_outgoingTransitions_22_0= ruleTextualTransition ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:232:2: () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_label_5_0= ruleFullStateID ) ) ( (lv_id_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( (lv_outgoingTransitions_22_0= ruleTextualTransition ) )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:232:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:233:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getStateAccess().getStateAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getStateAccess().getStateAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:246:2: ( (lv_isInitial_1_0= 'init' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:247:1: (lv_isInitial_1_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:247:1: (lv_isInitial_1_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:248:3: lv_isInitial_1_0= 'init'
                    {
                    lv_isInitial_1_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleState338); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_0(), "isInitial"); 
                          
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


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:267:3: ( (lv_isFinal_2_0= 'final' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:268:1: (lv_isFinal_2_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:268:1: (lv_isFinal_2_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:269:3: lv_isFinal_2_0= 'final'
                    {
                    lv_isFinal_2_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleState370); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_2_0(), "isFinal"); 
                          
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


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:288:3: ( (lv_type_3_0= ruleStateType ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=40 && LA7_0<=43)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:289:1: (lv_type_3_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:289:1: (lv_type_3_0= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:290:3: lv_type_3_0= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState405);
                    lv_type_3_0=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_3_0, 
                      	        		"StateType", 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:312:3: ( 'state' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:312:5: 'state'
                    {
                    match(input,16,FOLLOW_16_in_ruleState417); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_4(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:316:3: ( (lv_label_5_0= ruleFullStateID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:317:1: (lv_label_5_0= ruleFullStateID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:317:1: (lv_label_5_0= ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:318:3: lv_label_5_0= ruleFullStateID
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getLabelFullStateIDParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullStateID_in_ruleState440);
            lv_label_5_0=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"label",
              	        		lv_label_5_0, 
              	        		"FullStateID", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:340:2: ( (lv_id_6_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred10()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:341:1: (lv_id_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:341:1: (lv_id_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:342:3: lv_id_6_0= RULE_STRING
                    {
                    lv_id_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState457); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getIdSTRINGTerminalRuleCall_6_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_6_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:364:3: ( (lv_bodyText_7_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:365:1: (lv_bodyText_7_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:365:1: (lv_bodyText_7_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:366:3: lv_bodyText_7_0= RULE_STRING
                    {
                    lv_bodyText_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState480); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_7_0(), "bodyText"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"bodyText",
                      	        		lv_bodyText_7_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:388:3: ( (lv_signals_8_0= ruleSignal ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred12()) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>=34 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:389:1: (lv_signals_8_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:389:1: (lv_signals_8_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:390:3: lv_signals_8_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_8_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleState507);
            	    lv_signals_8_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_8_0, 
            	      	        		"Signal", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:412:3: ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:412:5: 'onentry' ( (lv_entryActions_10_0= ruleAction ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleState519); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_9_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:1: ( (lv_entryActions_10_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:417:1: (lv_entryActions_10_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:417:1: (lv_entryActions_10_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:418:3: lv_entryActions_10_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_9_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState540);
            	    lv_entryActions_10_0=ruleAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"entryActions",
            	      	        		lv_entryActions_10_0, 
            	      	        		"Action", 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:4: ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:6: 'oninner' ( (lv_innerActions_12_0= ruleAction ) )
            	    {
            	    match(input,18,FOLLOW_18_in_ruleState553); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_10_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:444:1: ( (lv_innerActions_12_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:445:1: (lv_innerActions_12_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:445:1: (lv_innerActions_12_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:446:3: lv_innerActions_12_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_10_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState574);
            	    lv_innerActions_12_0=ruleAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"innerActions",
            	      	        		lv_innerActions_12_0, 
            	      	        		"Action", 
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
            	    break loop13;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:468:4: ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:468:6: 'onexit' ( (lv_exitActions_14_0= ruleAction ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleState587); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_11_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:472:1: ( (lv_exitActions_14_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:473:1: (lv_exitActions_14_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:473:1: (lv_exitActions_14_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:474:3: lv_exitActions_14_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_11_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState608);
            	    lv_exitActions_14_0=ruleAction();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"exitActions",
            	      	        		lv_exitActions_14_0, 
            	      	        		"Action", 
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
            	    break loop14;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:496:4: ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:496:6: 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleState621); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_12_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:500:1: ( (lv_suspensionTrigger_16_0= ruleAction ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:501:1: (lv_suspensionTrigger_16_0= ruleAction )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:501:1: (lv_suspensionTrigger_16_0= ruleAction )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:502:3: lv_suspensionTrigger_16_0= ruleAction
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleState642);
                    lv_suspensionTrigger_16_0=ruleAction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"suspensionTrigger",
                      	        		lv_suspensionTrigger_16_0, 
                      	        		"Action", 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:524:4: ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:524:6: '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}'
                    {
                    match(input,21,FOLLOW_21_in_ruleState655); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_13_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:528:1: ( (lv_regions_18_0= ruleRegion ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:1: (lv_regions_18_0= ruleRegion )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:1: (lv_regions_18_0= ruleRegion )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:530:3: lv_regions_18_0= ruleRegion
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_13_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegion_in_ruleState676);
                    lv_regions_18_0=ruleRegion();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"regions",
                      	        		lv_regions_18_0, 
                      	        		"Region", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:552:2: ( '||' ( (lv_regions_20_0= ruleRegion ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==22) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:552:4: '||' ( (lv_regions_20_0= ruleRegion ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleState687); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_13_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:556:1: ( (lv_regions_20_0= ruleRegion ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:557:1: (lv_regions_20_0= ruleRegion )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:557:1: (lv_regions_20_0= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:558:3: lv_regions_20_0= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_13_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState708);
                    	    lv_regions_20_0=ruleRegion();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"regions",
                    	      	        		lv_regions_20_0, 
                    	      	        		"Region", 
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

                    match(input,23,FOLLOW_23_in_ruleState720); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_13_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:584:3: ( (lv_outgoingTransitions_22_0= ruleTextualTransition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=56 && LA18_0<=58)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:585:1: (lv_outgoingTransitions_22_0= ruleTextualTransition )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:585:1: (lv_outgoingTransitions_22_0= ruleTextualTransition )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:586:3: lv_outgoingTransitions_22_0= ruleTextualTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTextualTransitionParserRuleCall_14_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTextualTransition_in_ruleState743);
            	    lv_outgoingTransitions_22_0=ruleTextualTransition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"outgoingTransitions",
            	      	        		lv_outgoingTransitions_22_0, 
            	      	        		"TextualTransition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


    // $ANTLR start entryRuleFullStateID
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:618:1: entryRuleFullStateID returns [String current=null] : iv_ruleFullStateID= ruleFullStateID EOF ;
    public final String entryRuleFullStateID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullStateID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:2: (iv_ruleFullStateID= ruleFullStateID EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:620:2: iv_ruleFullStateID= ruleFullStateID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullStateIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullStateID_in_entryRuleFullStateID783);
            iv_ruleFullStateID=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullStateID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullStateID794); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFullStateID


    // $ANTLR start ruleFullStateID
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:627:1: ruleFullStateID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFullStateID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:632:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:633:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:633:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:633:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:633:2: (this_ID_0= RULE_ID kw= '@' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==24) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:633:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID835); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleFullStateID853); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFullStateIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID870); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleFullStateID


    // $ANTLR start entryRuleTextualTransition
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:663:1: entryRuleTextualTransition returns [EObject current=null] : iv_ruleTextualTransition= ruleTextualTransition EOF ;
    public final EObject entryRuleTextualTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:664:2: (iv_ruleTextualTransition= ruleTextualTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:665:2: iv_ruleTextualTransition= ruleTextualTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextualTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextualTransition_in_entryRuleTextualTransition917);
            iv_ruleTextualTransition=ruleTextualTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextualTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextualTransition927); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTextualTransition


    // $ANTLR start ruleTextualTransition
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:672:1: ruleTextualTransition returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransitionType ) ) ( (lv_targetStateProxy_1_0= RULE_STRING ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_9_0= ' history' ) )? ';' ) ;
    public final EObject ruleTextualTransition() throws RecognitionException {
        EObject current = null;

        Token lv_targetStateProxy_1_0=null;
        Token lv_isImmediate_3_0=null;
        Token lv_delay_4_0=null;
        Token lv_isHistory_9_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_trigger_5_0 = null;

        EObject lv_effects_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:677:6: ( ( ( (lv_type_0_0= ruleTransitionType ) ) ( (lv_targetStateProxy_1_0= RULE_STRING ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_9_0= ' history' ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:678:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( (lv_targetStateProxy_1_0= RULE_STRING ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_9_0= ' history' ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:678:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( (lv_targetStateProxy_1_0= RULE_STRING ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_9_0= ' history' ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:678:2: ( (lv_type_0_0= ruleTransitionType ) ) ( (lv_targetStateProxy_1_0= RULE_STRING ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_9_0= ' history' ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:678:2: ( (lv_type_0_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:679:1: (lv_type_0_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:679:1: (lv_type_0_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:680:3: lv_type_0_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTypeTransitionTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTextualTransition973);
            lv_type_0_0=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"TransitionType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:2: ( (lv_targetStateProxy_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:703:1: (lv_targetStateProxy_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:703:1: (lv_targetStateProxy_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:704:3: lv_targetStateProxy_1_0= RULE_STRING
            {
            lv_targetStateProxy_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextualTransition990); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextualTransitionAccess().getTargetStateProxySTRINGTerminalRuleCall_1_0(), "targetStateProxy"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"targetStateProxy",
              	        		lv_targetStateProxy_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:2: ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:4: 'with' ( (lv_isImmediate_3_0= '#' ) )? ( (lv_delay_4_0= RULE_INT ) )? ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? )
                    {
                    match(input,25,FOLLOW_25_in_ruleTextualTransition1006); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getWithKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:730:1: ( (lv_isImmediate_3_0= '#' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==26) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:731:1: (lv_isImmediate_3_0= '#' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:731:1: (lv_isImmediate_3_0= '#' )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:732:3: lv_isImmediate_3_0= '#'
                            {
                            lv_isImmediate_3_0=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleTextualTransition1024); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getIsImmediateNumberSignKeyword_2_1_0(), "isImmediate"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:751:3: ( (lv_delay_4_0= RULE_INT ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_INT) ) {
                        int LA21_1 = input.LA(2);

                        if ( ((LA21_1>=RULE_ID && LA21_1<=RULE_FLOAT)||LA21_1==27||(LA21_1>=29 && LA21_1<=30)||LA21_1==38||LA21_1==59||(LA21_1>=65 && LA21_1<=66)) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:752:1: (lv_delay_4_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:752:1: (lv_delay_4_0= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:753:3: lv_delay_4_0= RULE_INT
                            {
                            lv_delay_4_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextualTransition1055); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTextualTransitionAccess().getDelayINTTerminalRuleCall_2_2_0(), "delay"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"delay",
                              	        		lv_delay_4_0, 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:775:3: ( ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )? )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:775:4: ( (lv_trigger_5_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )?
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:775:4: ( (lv_trigger_5_0= ruleBooleanExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_FLOAT)||LA22_0==38||LA22_0==59||(LA22_0>=65 && LA22_0<=66)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:776:1: (lv_trigger_5_0= ruleBooleanExpression )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:776:1: (lv_trigger_5_0= ruleBooleanExpression )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:777:3: lv_trigger_5_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTriggerBooleanExpressionParserRuleCall_2_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleTextualTransition1083);
                            lv_trigger_5_0=ruleBooleanExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"trigger",
                              	        		lv_trigger_5_0, 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:799:3: ( '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==27) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:799:5: '/' ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )*
                            {
                            match(input,27,FOLLOW_27_in_ruleTextualTransition1095); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getSolidusKeyword_2_3_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:803:1: ( ( (lv_effects_7_0= ruleEffect ) ) ( ',' )? )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:803:2: ( (lv_effects_7_0= ruleEffect ) ) ( ',' )?
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:803:2: ( (lv_effects_7_0= ruleEffect ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:804:1: (lv_effects_7_0= ruleEffect )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:804:1: (lv_effects_7_0= ruleEffect )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:805:3: lv_effects_7_0= ruleEffect
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getEffectsEffectParserRuleCall_2_3_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEffect_in_ruleTextualTransition1117);
                            	    lv_effects_7_0=ruleEffect();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
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

                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:827:2: ( ',' )?
                            	    int alt23=2;
                            	    int LA23_0 = input.LA(1);

                            	    if ( (LA23_0==28) ) {
                            	        alt23=1;
                            	    }
                            	    switch (alt23) {
                            	        case 1 :
                            	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:827:4: ','
                            	            {
                            	            match(input,28,FOLLOW_28_in_ruleTextualTransition1128); if (failed) return current;
                            	            if ( backtracking==0 ) {

                            	                      createLeafNode(grammarAccess.getTextualTransitionAccess().getCommaKeyword_2_3_1_1_1(), null); 
                            	                  
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:831:10: ( (lv_isHistory_9_0= ' history' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:832:1: (lv_isHistory_9_0= ' history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:832:1: (lv_isHistory_9_0= ' history' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:833:3: lv_isHistory_9_0= ' history'
                    {
                    lv_isHistory_9_0=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleTextualTransition1155); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getIsHistoryHistoryKeyword_3_0(), "isHistory"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isHistory", true, " history", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_ruleTextualTransition1179); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTextualTransitionAccess().getSemicolonKeyword_4(), null); 
                  
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
    // $ANTLR end ruleTextualTransition


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:868:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:869:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:870:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1219);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1229); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:877:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;

        Enumerator lv_type_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:882:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:3: 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) )
            {
            match(input,31,FOLLOW_31_in_ruleVariable1264); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:887:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:888:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:888:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:889:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1281); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:911:2: ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:911:3: ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:911:3: ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:911:5: ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleVariable1298); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:915:1: ( (lv_initialValue_3_0= ruleVariableSignalValue ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:916:1: (lv_initialValue_3_0= ruleVariableSignalValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:916:1: (lv_initialValue_3_0= ruleVariableSignalValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:917:3: lv_initialValue_3_0= ruleVariableSignalValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getInitialValueVariableSignalValueParserRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableSignalValue_in_ruleVariable1319);
                    lv_initialValue_3_0=ruleVariableSignalValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_3_0, 
                      	        		"VariableSignalValue", 
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

            match(input,33,FOLLOW_33_in_ruleVariable1331); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:943:1: ( (lv_type_5_0= ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:1: (lv_type_5_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:1: (lv_type_5_0= ruleValueType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:945:3: lv_type_5_0= ruleValueType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueType_in_ruleVariable1352);
            lv_type_5_0=ruleValueType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_5_0, 
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


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:975:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:976:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:977:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1389);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1399); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:984:1: ruleSignal returns [EObject current=null] : ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) ) )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_0_0=null;
        Token lv_isOutput_1_0=null;
        Token lv_hostCombineOperator_11_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_4_0 = null;

        Enumerator lv_type_6_0 = null;

        Enumerator lv_type_8_0 = null;

        Enumerator lv_combineOperator_10_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:989:6: ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:990:1: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:990:1: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:990:2: ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ( (lv_name_2_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:990:2: ( (lv_isInput_0_0= 'input' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:991:1: (lv_isInput_0_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:991:1: (lv_isInput_0_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:992:3: lv_isInput_0_0= 'input'
                    {
                    lv_isInput_0_0=(Token)input.LT(1);
                    match(input,34,FOLLOW_34_in_ruleSignal1442); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_0(), "isInput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInput", true, "input", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1011:3: ( (lv_isOutput_1_0= 'output' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:1: (lv_isOutput_1_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:1: (lv_isOutput_1_0= 'output' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1013:3: lv_isOutput_1_0= 'output'
                    {
                    lv_isOutput_1_0=(Token)input.LT(1);
                    match(input,35,FOLLOW_35_in_ruleSignal1474); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_1_0(), "isOutput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isOutput", true, "output", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1032:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1033:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1033:1: (lv_name_2_0= ruleQualifiedName )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1034:3: lv_name_2_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getNameQualifiedNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSignal1509);
            lv_name_2_0=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1056:2: ( ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1056:3: ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1056:3: ( ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1056:5: ':=' ( (lv_initialValue_4_0= ruleVariableSignalValue ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleSignal1521); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_3_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1060:1: ( (lv_initialValue_4_0= ruleVariableSignalValue ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1061:1: (lv_initialValue_4_0= ruleVariableSignalValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1061:1: (lv_initialValue_4_0= ruleVariableSignalValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1062:3: lv_initialValue_4_0= ruleVariableSignalValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getInitialValueVariableSignalValueParserRuleCall_3_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableSignalValue_in_ruleSignal1542);
                    lv_initialValue_4_0=ruleVariableSignalValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_4_0, 
                      	        		"VariableSignalValue", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1084:3: ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==36) ) {
                        alt32=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1084:3: ( ( ': ' ( (lv_type_6_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) ) )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1084:4: ( ': ' ( (lv_type_6_0= ruleValueType ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1084:4: ( ': ' ( (lv_type_6_0= ruleValueType ) ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1084:6: ': ' ( (lv_type_6_0= ruleValueType ) )
                            {
                            match(input,33,FOLLOW_33_in_ruleSignal1555); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_3_1_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1088:1: ( (lv_type_6_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1089:1: (lv_type_6_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1089:1: (lv_type_6_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1090:3: lv_type_6_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_1_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal1576);
                            lv_type_6_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_6_0, 
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


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1113:6: ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1113:6: ( ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1113:8: ': combine' ( (lv_type_8_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) )
                            {
                            match(input,36,FOLLOW_36_in_ruleSignal1594); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_3_1_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1117:1: ( (lv_type_8_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1118:1: (lv_type_8_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1118:1: (lv_type_8_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1119:3: lv_type_8_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_3_1_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal1615);
                            lv_type_8_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_8_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            match(input,25,FOLLOW_25_in_ruleSignal1625); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_3_1_1_2(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1145:1: ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) )
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( ((LA31_0>=44 && LA31_0<=49)) ) {
                                alt31=1;
                            }
                            else if ( (LA31_0==RULE_STRING) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1145:1: ( ( (lv_combineOperator_10_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_11_0= RULE_STRING ) ) )", 31, 0, input);

                                throw nvae;
                            }
                            switch (alt31) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1145:2: ( (lv_combineOperator_10_0= ruleCombineOperator ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1145:2: ( (lv_combineOperator_10_0= ruleCombineOperator ) )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1146:1: (lv_combineOperator_10_0= ruleCombineOperator )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1146:1: (lv_combineOperator_10_0= ruleCombineOperator )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:3: lv_combineOperator_10_0= ruleCombineOperator
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_1_3_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal1647);
                                    lv_combineOperator_10_0=ruleCombineOperator();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"combineOperator",
                                      	        		lv_combineOperator_10_0, 
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
                                    break;
                                case 2 :
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1170:6: ( (lv_hostCombineOperator_11_0= RULE_STRING ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1170:6: ( (lv_hostCombineOperator_11_0= RULE_STRING ) )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1171:1: (lv_hostCombineOperator_11_0= RULE_STRING )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1171:1: (lv_hostCombineOperator_11_0= RULE_STRING )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1172:3: lv_hostCombineOperator_11_0= RULE_STRING
                                    {
                                    lv_hostCombineOperator_11_0=(Token)input.LT(1);
                                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal1670); if (failed) return current;
                                    if ( backtracking==0 ) {

                                      			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_3_1_1_3_1_0(), "hostCombineOperator"); 
                                      		
                                    }
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode, current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"hostCombineOperator",
                                      	        		lv_hostCombineOperator_11_0, 
                                      	        		"STRING", 
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


                            }


                            }
                            break;

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
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleVariableSignalValue
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1202:1: entryRuleVariableSignalValue returns [String current=null] : iv_ruleVariableSignalValue= ruleVariableSignalValue EOF ;
    public final String entryRuleVariableSignalValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableSignalValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1203:2: (iv_ruleVariableSignalValue= ruleVariableSignalValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1204:2: iv_ruleVariableSignalValue= ruleVariableSignalValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableSignalValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableSignalValue_in_entryRuleVariableSignalValue1717);
            iv_ruleVariableSignalValue=ruleVariableSignalValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableSignalValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableSignalValue1728); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableSignalValue


    // $ANTLR start ruleVariableSignalValue
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:1: ruleVariableSignalValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+ ;
    public final AntlrDatatypeRuleToken ruleVariableSignalValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_Boolean_2=null;
        Token this_STRING_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1216:6: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1217:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1217:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+
            int cnt34=0;
            loop34:
            do {
                int alt34=5;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt34=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt34=2;
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    alt34=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt34=4;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1217:6: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariableSignalValue1768); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_INT_0);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getINTTerminalRuleCall_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1225:10: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableSignalValue1794); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getIDTerminalRuleCall_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1233:10: this_Boolean_2= RULE_BOOLEAN
            	    {
            	    this_Boolean_2=(Token)input.LT(1);
            	    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleVariableSignalValue1820); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_Boolean_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getBooleanTerminalRuleCall_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1241:10: this_STRING_3= RULE_STRING
            	    {
            	    this_STRING_3=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableSignalValue1846); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_STRING_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getSTRINGTerminalRuleCall_3(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


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
    // $ANTLR end ruleVariableSignalValue


    // $ANTLR start entryRuleQualifiedName
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1256:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1257:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1258:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1893);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1904); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1265:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1270:6: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1271:1: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1271:1: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1271:2: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1271:2: (this_ID_0= RULE_ID kw= '.' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==37) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1271:7: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1945); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0(), null); 
            	          
            	    }
            	    kw=(Token)input.LT(1);
            	    match(input,37,FOLLOW_37_in_ruleQualifiedName1963); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1980); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1(), null); 
                  
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
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1299:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1300:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1301:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2025);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2035); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1308:1: ruleAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1313:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1314:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1314:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1314:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1314:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1315:2: 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1328:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1329:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1329:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1330:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleAction2090); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1349:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==EOF||(LA37_1>=RULE_ID && LA37_1<=RULE_FLOAT)||(LA37_1>=14 && LA37_1<=23)||LA37_1==27||LA37_1==38||(LA37_1>=40 && LA37_1<=43)||(LA37_1>=56 && LA37_1<=59)||(LA37_1>=65 && LA37_1<=66)) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1350:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1350:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1351:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction2121); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1373:3: ( (lv_trigger_3_0= ruleBooleanExpression ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_FLOAT)||LA38_0==38||LA38_0==59||(LA38_0>=65 && LA38_0<=66)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                int LA38_2 = input.LA(2);

                if ( (synpred42()) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1374:1: (lv_trigger_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1374:1: (lv_trigger_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1375:3: lv_trigger_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction2148);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1397:3: ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1397:5: '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    {
                    match(input,27,FOLLOW_27_in_ruleAction2160); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1401:1: ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_ID) ) {
                            int LA40_2 = input.LA(2);

                            if ( (synpred44()) ) {
                                alt40=1;
                            }


                        }
                        else if ( (LA40_0==RULE_STRING) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1401:2: ( (lv_effects_5_0= ruleEffect ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1401:2: ( (lv_effects_5_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1402:1: (lv_effects_5_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1402:1: (lv_effects_5_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1403:3: lv_effects_5_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction2182);
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

                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1425:2: ( ',' )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==28) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1425:4: ','
                    	            {
                    	            match(input,28,FOLLOW_28_in_ruleAction2193); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_4_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1437:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1438:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1439:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect2235);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect2245); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1446:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1451:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1452:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1452:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==32) ) {
                    alt42=2;
                }
                else if ( (LA42_1==EOF||(LA42_1>=RULE_ID && LA42_1<=RULE_STRING)||(LA42_1>=14 && LA42_1<=23)||(LA42_1>=28 && LA42_1<=30)||LA42_1==38||(LA42_1>=40 && LA42_1<=43)||(LA42_1>=56 && LA42_1<=58)) ) {
                    alt42=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1452:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA42_0==RULE_STRING) ) {
                alt42=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1452:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1453:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect2295);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1466:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect2325);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1479:2: this_HostCode_2= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect2355);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1498:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1500:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission2390);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission2400); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1507:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;

        EObject lv_newValue_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1512:6: ( ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1513:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1513:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1513:2: ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1513:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1514:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1514:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1515:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission2447); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:2: ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                int LA43_1 = input.LA(2);

                if ( (synpred48()) ) {
                    alt43=1;
                }
                else if ( (synpred49()) ) {
                    alt43=2;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:3: ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:3: ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:5: '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleEmission2459); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1534:1: ( (lv_newValue_2_0= ruleValueExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1535:1: (lv_newValue_2_0= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1535:1: (lv_newValue_2_0= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1536:3: lv_newValue_2_0= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleEmission2480);
                    lv_newValue_2_0=ruleValueExpression();
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
                      	        		"ValueExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,39,FOLLOW_39_in_ruleEmission2490); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:8: '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleEmission2508); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1567:1: ( (lv_newValue_5_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:1: (lv_newValue_5_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:1: (lv_newValue_5_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1569:3: lv_newValue_5_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleEmission2529);
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

                    match(input,39,FOLLOW_39_in_ruleEmission2539); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1603:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1604:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1605:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment2578);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment2588); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1612:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1617:6: ( ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1618:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1618:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1618:2: ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1618:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1619:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1619:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1620:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment2635); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,32,FOLLOW_32_in_ruleAssignment2645); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt44=2;
            switch ( input.LA(1) ) {
            case 66:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA44_2 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA44_3 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                int LA44_4 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA44_5 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA44_6 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 6, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA44_7 = input.LA(2);

                if ( (synpred50()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 65:
                {
                alt44=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1639:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:2: ( (lv_expression_2_0= ruleValueExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:2: ( (lv_expression_2_0= ruleValueExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1640:1: (lv_expression_2_0= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1640:1: (lv_expression_2_0= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1641:3: lv_expression_2_0= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleAssignment2667);
                    lv_expression_2_0=ruleValueExpression();
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
                      	        		"ValueExpression", 
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1664:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1664:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1665:1: (lv_expression_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1665:1: (lv_expression_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1666:3: lv_expression_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAssignment2694);
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


    // $ANTLR start entryRuleSignalReference
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1696:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1697:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1698:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference2731);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference2741); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:1: ruleSignalReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1710:6: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1711:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1711:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1712:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1712:1: ( ruleQualifiedName )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1713:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSignalReference2792);
            ruleQualifiedName();
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


    // $ANTLR start entryRuleVariableReference
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1738:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1739:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1740:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference2827);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference2837); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1747:1: ruleVariableReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1752:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1753:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1753:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1754:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1754:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1755:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference2883); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getVariableReferenceAccess().getVariableVariableCrossReference_0(), "variable"); 
              	
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


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1778:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1779:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1780:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue2918);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue2928); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1787:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1792:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1794:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1794:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1795:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue2969); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1825:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1826:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1827:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue3009);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue3019); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1834:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1839:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1841:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1841:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue3060); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1872:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1873:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1874:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3100);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3110); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1881:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1886:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1887:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1887:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1888:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1888:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1889:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3151); if (failed) return current;
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


    // $ANTLR start entryRuleValOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1921:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1922:2: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1923:2: iv_ruleValOperation= ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation3193);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation3203); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:1: ruleValOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1935:6: ( ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1936:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1936:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1936:2: ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1936:2: ( (lv_operator_0_0= ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1937:1: (lv_operator_0_0= ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1937:1: (lv_operator_0_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1938:3: lv_operator_0_0= ruleValOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation3249);
            lv_operator_0_0=ruleValOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"ValOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1960:2: ( (lv_subExpressions_1_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1961:1: (lv_subExpressions_1_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1961:1: (lv_subExpressions_1_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1962:3: lv_subExpressions_1_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation3270);
            lv_subExpressions_1_0=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_1_0, 
              	        		"SignalReference", 
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
    // $ANTLR end ruleValOperation


    // $ANTLR start entryRuleValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1992:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1993:2: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1994:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression3306);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression3316); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2001:1: ruleValueExpression returns [EObject current=null] : this_PlusOperation_0= rulePlusOperation ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOperation_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2006:6: (this_PlusOperation_0= rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2008:2: this_PlusOperation_0= rulePlusOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValueExpression3365);
            this_PlusOperation_0=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PlusOperation_0; 
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
    // $ANTLR end ruleValueExpression


    // $ANTLR start entryRuleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2027:1: entryRuleParanthesedValueExpression returns [EObject current=null] : iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF ;
    public final EObject entryRuleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2028:2: (iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2029:2: iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression3399);
            iv_ruleParanthesedValueExpression=ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValueExpression3409); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParanthesedValueExpression


    // $ANTLR start ruleParanthesedValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2036:1: ruleParanthesedValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) ;
    public final EObject ruleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValOperation_2 = null;

        EObject this_VariableReference_3 = null;

        EObject this_HostCode_4 = null;

        EObject this_PlusOperation_6 = null;

        EObject this_DivOperation_9 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2041:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            int alt45=7;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2043:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression3459);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2056:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression3489);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2069:2: this_ValOperation_2= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression3519);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2082:2: this_VariableReference_3= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression3549);
                    this_VariableReference_3=ruleVariableReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_VariableReference_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2095:2: this_HostCode_4= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getHostCodeParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleParanthesedValueExpression3579);
                    this_HostCode_4=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:8: '(' this_PlusOperation_6= rulePlusOperation ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleParanthesedValueExpression3595); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression3620);
                    this_PlusOperation_6=rulePlusOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PlusOperation_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,39,FOLLOW_39_in_ruleParanthesedValueExpression3629); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2128:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2128:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2128:8: '(' this_DivOperation_9= ruleDivOperation ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleParanthesedValueExpression3647); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleParanthesedValueExpression3672);
                    this_DivOperation_9=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,39,FOLLOW_39_in_ruleParanthesedValueExpression3681); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_6_2(), null); 
                          
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
    // $ANTLR end ruleParanthesedValueExpression


    // $ANTLR start entryRulePlusOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2156:1: entryRulePlusOperation returns [EObject current=null] : iv_rulePlusOperation= rulePlusOperation EOF ;
    public final EObject entryRulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2157:2: (iv_rulePlusOperation= rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2158:2: iv_rulePlusOperation= rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPlusOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation3718);
            iv_rulePlusOperation=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePlusOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation3728); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePlusOperation


    // $ANTLR start rulePlusOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2165:1: rulePlusOperation returns [EObject current=null] : (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) ;
    public final EObject rulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOrDivOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2170:6: ( (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2171:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2171:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2172:2: this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation3778);
            this_MultOrDivOperation_0=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultOrDivOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2183:1: ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==45||LA46_0==69) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2183:2: () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2183:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2184:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getPlusOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2202:2: ( (lv_operator_2_0= rulePlusOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2203:1: (lv_operator_2_0= rulePlusOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2203:1: (lv_operator_2_0= rulePlusOperator )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2204:3: lv_operator_2_0= rulePlusOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOperator_in_rulePlusOperation3811);
            	    lv_operator_2_0=rulePlusOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPlusOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"PlusOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2226:2: ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2227:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2227:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2228:3: lv_subExpressions_3_0= ruleMultOrDivOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation3832);
            	    lv_subExpressions_3_0=ruleMultOrDivOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPlusOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"MultOrDivOperation", 
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
            	    break loop46;
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
    // $ANTLR end rulePlusOperation


    // $ANTLR start entryRuleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2258:1: entryRuleMultOrDivOperation returns [EObject current=null] : iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF ;
    public final EObject entryRuleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2259:2: (iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2260:2: iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOrDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation3870);
            iv_ruleMultOrDivOperation=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOrDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation3880); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultOrDivOperation


    // $ANTLR start ruleMultOrDivOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2267:1: ruleMultOrDivOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) ;
    public final EObject ruleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOperation_0 = null;

        EObject this_DivOperation_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2272:6: ( (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2273:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2273:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==RULE_FLOAT||LA47_0==59||LA47_0==66) ) {
                alt47=1;
            }
            else if ( (LA47_0==38) ) {
                int LA47_7 = input.LA(2);

                if ( (synpred58()) ) {
                    alt47=1;
                }
                else if ( (true) ) {
                    alt47=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2273:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 47, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2273:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2274:2: this_MultOperation_0= ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation3930);
                    this_MultOperation_0=ruleMultOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_MultOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2286:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2286:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2286:8: '(' this_DivOperation_2= ruleDivOperation ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleMultOrDivOperation3946); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation3971);
                    this_DivOperation_2=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,39,FOLLOW_39_in_ruleMultOrDivOperation3980); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMultOrDivOperationAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleMultOrDivOperation


    // $ANTLR start entryRuleMultOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2314:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2315:2: (iv_ruleMultOperation= ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2316:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation4017);
            iv_ruleMultOperation=ruleMultOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation4027); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultOperation


    // $ANTLR start ruleMultOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2323:1: ruleMultOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2328:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2329:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2329:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2330:2: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4077);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2341:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==46||LA48_0==70) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2341:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2341:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2342:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2360:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2361:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2361:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2362:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultOperation4110);
            	    lv_operator_2_0=ruleMultOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultOperationRule().getType().getClassifier());
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2384:2: ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2385:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2385:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2386:3: lv_subExpressions_3_0= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4131);
            	    lv_subExpressions_3_0=rulePreOrNormalValueExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"PreOrNormalValueExpression", 
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
            	    break loop48;
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
    // $ANTLR end ruleMultOperation


    // $ANTLR start entryRuleDivOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2416:1: entryRuleDivOperation returns [EObject current=null] : iv_ruleDivOperation= ruleDivOperation EOF ;
    public final EObject entryRuleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2417:2: (iv_ruleDivOperation= ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2418:2: iv_ruleDivOperation= ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation4169);
            iv_ruleDivOperation=ruleDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation4179); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDivOperation


    // $ANTLR start ruleDivOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2425:1: ruleDivOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) ;
    public final EObject ruleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2430:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2431:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2431:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2432:2: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4229);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2443:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==27) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2443:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2443:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2444:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getDivOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2462:2: ( (lv_operator_2_0= ruleDivOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: (lv_operator_2_0= ruleDivOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: (lv_operator_2_0= ruleDivOperator )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2464:3: lv_operator_2_0= ruleDivOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivOperation4262);
            	    lv_operator_2_0=ruleDivOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDivOperationRule().getType().getClassifier());
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2486:2: ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2487:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2487:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2488:3: lv_subExpressions_3_0= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4283);
            	    lv_subExpressions_3_0=rulePreOrNormalValueExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDivOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"PreOrNormalValueExpression", 
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
            	    break loop49;
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
    // $ANTLR end ruleDivOperation


    // $ANTLR start entryRulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2518:1: entryRulePreArithmOperation returns [EObject current=null] : iv_rulePreArithmOperation= rulePreArithmOperation EOF ;
    public final EObject entryRulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreArithmOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2519:2: (iv_rulePreArithmOperation= rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2520:2: iv_rulePreArithmOperation= rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreArithmOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation4321);
            iv_rulePreArithmOperation=rulePreArithmOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreArithmOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation4331); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePreArithmOperation


    // $ANTLR start rulePreArithmOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2527:1: rulePreArithmOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) ;
    public final EObject rulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2532:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2533:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2533:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2533:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2533:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2535:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation4377);
            lv_operator_0_0=ruleUnaryParanthesedOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreArithmOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"UnaryParanthesedOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,38,FOLLOW_38_in_rulePreArithmOperation4387); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2561:1: ( (lv_subExpressions_2_0= ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2562:1: (lv_subExpressions_2_0= ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2562:1: (lv_subExpressions_2_0= ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2563:3: lv_subExpressions_2_0= ruleValOperation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperation_in_rulePreArithmOperation4408);
            lv_subExpressions_2_0=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPreArithmOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"ValOperation", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,39,FOLLOW_39_in_rulePreArithmOperation4418); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreArithmOperationAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end rulePreArithmOperation


    // $ANTLR start entryRulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2597:1: entryRulePreOrNormalValueExpression returns [EObject current=null] : iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF ;
    public final EObject entryRulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreOrNormalValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2598:2: (iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2599:2: iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreOrNormalValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression4454);
            iv_rulePreOrNormalValueExpression=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreOrNormalValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValueExpression4464); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePreOrNormalValueExpression


    // $ANTLR start rulePreOrNormalValueExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2606:1: rulePreOrNormalValueExpression returns [EObject current=null] : (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) ;
    public final EObject rulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PreArithmOperation_0 = null;

        EObject this_ParanthesedValueExpression_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2611:6: ( (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2612:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2612:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==66) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_INT)||LA50_0==RULE_FLOAT||LA50_0==38||LA50_0==59) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2612:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2613:2: this_PreArithmOperation_0= rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression4514);
                    this_PreArithmOperation_0=rulePreArithmOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PreArithmOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2626:2: this_ParanthesedValueExpression_1= ruleParanthesedValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression4544);
                    this_ParanthesedValueExpression_1=ruleParanthesedValueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedValueExpression_1; 
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
    // $ANTLR end rulePreOrNormalValueExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2645:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2646:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2647:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4579);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation4589); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2654:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2659:6: ( (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2660:1: (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2660:1: (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2661:2: this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation4639);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2672:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2672:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2672:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2673:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2691:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2692:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2692:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2693:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation4672);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2715:2: ( (lv_subExpressions_3_0= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2716:1: (lv_subExpressions_3_0= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2716:1: (lv_subExpressions_3_0= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2717:3: lv_subExpressions_3_0= ruleValueExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation4693);
            lv_subExpressions_3_0=ruleValueExpression();
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
              	        		"ValueExpression", 
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


    // $ANTLR start entryRuleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2747:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2748:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2749:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4730);
            iv_ruleUnaryOperation=ruleUnaryOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation4740); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnaryOperation


    // $ANTLR start ruleUnaryOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2756:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2761:6: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2762:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2762:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2762:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2762:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2763:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2763:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2764:3: lv_operator_0_0= ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation4786);
            lv_operator_0_0=ruleUnaryOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"UnaryOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2786:2: ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2787:1: (lv_subExpressions_1_0= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2787:1: (lv_subExpressions_1_0= ruleParanthesedBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2788:3: lv_subExpressions_1_0= ruleParanthesedBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation4807);
            lv_subExpressions_1_0=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_1_0, 
              	        		"ParanthesedBooleanExpression", 
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
    // $ANTLR end ruleUnaryOperation


    // $ANTLR start entryRuleUnaryParanthesedOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2818:1: entryRuleUnaryParanthesedOperation returns [EObject current=null] : iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF ;
    public final EObject entryRuleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryParanthesedOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2819:2: (iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2820:2: iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryParanthesedOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation4843);
            iv_ruleUnaryParanthesedOperation=ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryParanthesedOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation4853); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnaryParanthesedOperation


    // $ANTLR start ruleUnaryParanthesedOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2827:1: ruleUnaryParanthesedOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) ;
    public final EObject ruleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2832:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2833:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2833:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2833:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2833:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2834:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2834:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2835:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation4899);
            lv_operator_0_0=ruleUnaryParanthesedOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryParanthesedOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_0_0, 
              	        		"UnaryParanthesedOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,38,FOLLOW_38_in_ruleUnaryParanthesedOperation4909); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2861:1: ( (lv_subExpressions_2_0= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2862:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2862:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2863:3: lv_subExpressions_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation4930);
            lv_subExpressions_2_0=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnaryParanthesedOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_2_0, 
              	        		"BooleanExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,39,FOLLOW_39_in_ruleUnaryParanthesedOperation4940); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnaryParanthesedOperationAccess().getRightParenthesisKeyword_3(), null); 
                  
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
    // $ANTLR end ruleUnaryParanthesedOperation


    // $ANTLR start entryRuleUnaryOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2897:1: entryRuleUnaryOrNormalExpression returns [EObject current=null] : iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF ;
    public final EObject entryRuleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2898:2: (iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2899:2: iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOrNormalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression4976);
            iv_ruleUnaryOrNormalExpression=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOrNormalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression4986); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUnaryOrNormalExpression


    // $ANTLR start ruleUnaryOrNormalExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2906:1: ruleUnaryOrNormalExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) ;
    public final EObject ruleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        EObject this_UnaryParanthesedOperation_1 = null;

        EObject this_ParanthesedBooleanExpression_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2911:6: ( (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2912:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2912:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2913:2: this_UnaryOperation_0= ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression5036);
                    this_UnaryOperation_0=ruleUnaryOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_UnaryOperation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2926:2: this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression5066);
                    this_UnaryParanthesedOperation_1=ruleUnaryParanthesedOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_UnaryParanthesedOperation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2939:2: this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression5096);
                    this_ParanthesedBooleanExpression_2=ruleParanthesedBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ParanthesedBooleanExpression_2; 
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
    // $ANTLR end ruleUnaryOrNormalExpression


    // $ANTLR start entryRuleAndOperation
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2958:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2959:2: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2960:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation5131);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation5141); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2967:1: ruleAndOperation returns [EObject current=null] : (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrNormalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2972:6: ( (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2973:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2973:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2974:2: this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5191);
            this_UnaryOrNormalExpression_0=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_UnaryOrNormalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2985:1: ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==68) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2985:2: () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2985:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2986:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3004:2: ( (lv_operator_2_0= ruleOperatorAnd ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3005:1: (lv_operator_2_0= ruleOperatorAnd )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3005:1: (lv_operator_2_0= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3006:3: lv_operator_2_0= ruleOperatorAnd
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation5224);
            	    lv_operator_2_0=ruleOperatorAnd();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OperatorAnd", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3028:2: ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3029:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3029:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3030:3: lv_subExpressions_3_0= ruleUnaryOrNormalExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5245);
            	    lv_subExpressions_3_0=ruleUnaryOrNormalExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"UnaryOrNormalExpression", 
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
            	    break loop52;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3060:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3061:2: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3062:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation5283);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation5293); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3069:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3074:6: ( (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3075:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3075:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3076:2: this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation5343);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3087:1: ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==67) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3087:2: () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3087:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3088:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrOperationAccess().getComplexExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3106:2: ( (lv_operator_2_0= ruleOperatorOr ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3107:1: (lv_operator_2_0= ruleOperatorOr )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3107:1: (lv_operator_2_0= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3108:3: lv_operator_2_0= ruleOperatorOr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation5376);
            	    lv_operator_2_0=ruleOperatorOr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OperatorOr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3130:2: ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3131:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3131:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3132:3: lv_subExpressions_3_0= ruleAndOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation5397);
            	    lv_subExpressions_3_0=ruleAndOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"AndOperation", 
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
            	    break loop53;
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


    // $ANTLR start entryRuleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3162:1: entryRuleParanthesedBooleanExpression returns [EObject current=null] : iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF ;
    public final EObject entryRuleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3163:2: (iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3164:2: iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression5435);
            iv_ruleParanthesedBooleanExpression=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression5445); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParanthesedBooleanExpression


    // $ANTLR start ruleParanthesedBooleanExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3171:1: ruleParanthesedBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) ) ;
    public final EObject ruleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_CompareOperation_1 = null;

        EObject this_SignalReference_2 = null;

        EObject this_HostCode_3 = null;

        EObject this_OrOperation_5 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3176:6: ( (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3177:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3177:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )
            int alt54=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt54=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 59:
            case 66:
                {
                alt54=2;
                }
                break;
            case RULE_ID:
                {
                int LA54_6 = input.LA(2);

                if ( (synpred67()) ) {
                    alt54=2;
                }
                else if ( (synpred68()) ) {
                    alt54=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3177:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 54, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA54_7 = input.LA(2);

                if ( (synpred67()) ) {
                    alt54=2;
                }
                else if ( (synpred69()) ) {
                    alt54=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3177:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 54, 7, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA54_8 = input.LA(2);

                if ( (synpred67()) ) {
                    alt54=2;
                }
                else if ( (true) ) {
                    alt54=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3177:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 54, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3177:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3178:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression5495);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3191:2: this_CompareOperation_1= ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression5525);
                    this_CompareOperation_1=ruleCompareOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CompareOperation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:2: this_SignalReference_2= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression5555);
                    this_SignalReference_2=ruleSignalReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SignalReference_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3217:2: this_HostCode_3= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleParanthesedBooleanExpression5585);
                    this_HostCode_3=ruleHostCode();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_HostCode_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3229:6: ( '(' this_OrOperation_5= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3229:6: ( '(' this_OrOperation_5= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3229:8: '(' this_OrOperation_5= ruleOrOperation ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleParanthesedBooleanExpression5601); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression5626);
                    this_OrOperation_5=ruleOrOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OrOperation_5; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,39,FOLLOW_39_in_ruleParanthesedBooleanExpression5635); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getRightParenthesisKeyword_4_2(), null); 
                          
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
    // $ANTLR end ruleParanthesedBooleanExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3257:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3258:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3259:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression5672);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression5682); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3266:1: ruleBooleanExpression returns [EObject current=null] : this_OrOperation_0= ruleOrOperation ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrOperation_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3271:6: (this_OrOperation_0= ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3273:2: this_OrOperation_0= ruleOrOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression5731);
            this_OrOperation_0=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_OrOperation_0; 
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


    // $ANTLR start entryRuleHostCode
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3292:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3293:2: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3294:2: iv_ruleHostCode= ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode5765);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHostCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode5775); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3301:1: ruleHostCode returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3306:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3307:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3307:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3307:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3307:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3308:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3308:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3309:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode5817); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getHostCodeAccess().getCodeSTRINGTerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3331:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3331:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,38,FOLLOW_38_in_ruleHostCode5833); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3335:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3336:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3336:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3337:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHostCode5850); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getHostCodeAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getHostCodeRule().getType().getClassifier());
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

                    match(input,39,FOLLOW_39_in_ruleHostCode5865); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getRightParenthesisKeyword_1_2(), null); 
                          
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
    // $ANTLR end ruleHostCode


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3371:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3375:6: ( ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3376:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3376:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt56=1;
                }
                break;
            case 41:
                {
                alt56=2;
                }
                break;
            case 42:
                {
                alt56=3;
                }
                break;
            case 43:
                {
                alt56=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3376:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3376:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3376:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3376:4: 'NORMAL'
                    {
                    match(input,40,FOLLOW_40_in_ruleStateType5915); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3382:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3382:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3382:8: 'cond'
                    {
                    match(input,41,FOLLOW_41_in_ruleStateType5930); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3388:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3388:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3388:8: 'ref'
                    {
                    match(input,42,FOLLOW_42_in_ruleStateType5945); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3394:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3394:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3394:8: 'textual'
                    {
                    match(input,43,FOLLOW_43_in_ruleStateType5960); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3(), null); 
                          
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


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3404:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3408:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3409:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3409:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            int alt57=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt57=1;
                }
                break;
            case 45:
                {
                alt57=2;
                }
                break;
            case 46:
                {
                alt57=3;
                }
                break;
            case 47:
                {
                alt57=4;
                }
                break;
            case 48:
                {
                alt57=5;
                }
                break;
            case 49:
                {
                alt57=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3409:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3409:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3409:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3409:4: 'NONE'
                    {
                    match(input,44,FOLLOW_44_in_ruleCombineOperator6003); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3415:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3415:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3415:8: '+'
                    {
                    match(input,45,FOLLOW_45_in_ruleCombineOperator6018); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3421:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3421:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3421:8: '*'
                    {
                    match(input,46,FOLLOW_46_in_ruleCombineOperator6033); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3427:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3427:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3427:8: 'AND'
                    {
                    match(input,47,FOLLOW_47_in_ruleCombineOperator6048); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3433:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3433:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3433:8: 'OR'
                    {
                    match(input,48,FOLLOW_48_in_ruleCombineOperator6063); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3439:6: ( 'hostCombineOperator' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3439:6: ( 'hostCombineOperator' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3439:8: 'hostCombineOperator'
                    {
                    match(input,49,FOLLOW_49_in_ruleCombineOperator6078); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_5(), null); 
                          
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


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3449:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3453:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3454:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3454:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt58=1;
                }
                break;
            case 51:
                {
                alt58=2;
                }
                break;
            case 52:
                {
                alt58=3;
                }
                break;
            case 53:
                {
                alt58=4;
                }
                break;
            case 54:
                {
                alt58=5;
                }
                break;
            case 55:
                {
                alt58=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3454:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3454:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3454:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3454:4: 'PURE'
                    {
                    match(input,50,FOLLOW_50_in_ruleValueType6121); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3460:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3460:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3460:8: 'boolean'
                    {
                    match(input,51,FOLLOW_51_in_ruleValueType6136); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3466:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3466:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3466:8: 'unsigned'
                    {
                    match(input,52,FOLLOW_52_in_ruleValueType6151); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3472:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3472:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3472:8: 'integer'
                    {
                    match(input,53,FOLLOW_53_in_ruleValueType6166); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3478:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3478:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3478:8: 'float'
                    {
                    match(input,54,FOLLOW_54_in_ruleValueType6181); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3484:6: ( 'hostType' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3484:6: ( 'hostType' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3484:8: 'hostType'
                    {
                    match(input,55,FOLLOW_55_in_ruleValueType6196); if (failed) return current;
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


    // $ANTLR start ruleTransitionType
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3494:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3498:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3499:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3499:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt59=1;
                }
                break;
            case 57:
                {
                alt59=2;
                }
                break;
            case 58:
                {
                alt59=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3499:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3499:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3499:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3499:4: '-->'
                    {
                    match(input,56,FOLLOW_56_in_ruleTransitionType6239); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3505:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3505:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3505:8: 'o->'
                    {
                    match(input,57,FOLLOW_57_in_ruleTransitionType6254); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3511:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3511:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3511:8: '>->'
                    {
                    match(input,58,FOLLOW_58_in_ruleTransitionType6269); if (failed) return current;
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


    // $ANTLR start ruleValOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3523:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3527:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3528:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3528:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3528:3: '?'
            {
            match(input,59,FOLLOW_59_in_ruleValOperator6313); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3538:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3542:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3543:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3543:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt60=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt60=1;
                }
                break;
            case 61:
                {
                alt60=2;
                }
                break;
            case 62:
                {
                alt60=3;
                }
                break;
            case 63:
                {
                alt60=4;
                }
                break;
            case 64:
                {
                alt60=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3543:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3543:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3543:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3543:4: '='
                    {
                    match(input,60,FOLLOW_60_in_ruleCompareOperator6355); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3549:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3549:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3549:8: '<'
                    {
                    match(input,61,FOLLOW_61_in_ruleCompareOperator6370); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3555:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3555:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3555:8: '<='
                    {
                    match(input,62,FOLLOW_62_in_ruleCompareOperator6385); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3561:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3561:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3561:8: '>'
                    {
                    match(input,63,FOLLOW_63_in_ruleCompareOperator6400); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3567:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3567:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3567:8: '>='
                    {
                    match(input,64,FOLLOW_64_in_ruleCompareOperator6415); if (failed) return current;
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


    // $ANTLR start ruleUnaryOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3577:1: ruleUnaryOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3581:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3582:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3582:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3582:3: 'not'
            {
            match(input,65,FOLLOW_65_in_ruleUnaryOperator6457); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getUnaryOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleUnaryOperator


    // $ANTLR start ruleUnaryParanthesedOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3592:1: ruleUnaryParanthesedOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator ruleUnaryParanthesedOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3596:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3597:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3597:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3597:3: 'pre'
            {
            match(input,66,FOLLOW_66_in_ruleUnaryParanthesedOperator6498); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getUnaryParanthesedOperatorAccess().getPREEnumLiteralDeclaration(), null); 
                  
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
    // $ANTLR end ruleUnaryParanthesedOperator


    // $ANTLR start ruleOperatorOr
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3607:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3611:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3612:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3612:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3612:3: 'or'
            {
            match(input,67,FOLLOW_67_in_ruleOperatorOr6539); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3622:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3626:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3627:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3627:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3627:3: 'and'
            {
            match(input,68,FOLLOW_68_in_ruleOperatorAnd6580); if (failed) return current;
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


    // $ANTLR start rulePlusOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3639:1: rulePlusOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator rulePlusOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3643:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3644:1: ( ( '+' ) | ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3644:1: ( ( '+' ) | ( '-' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==45) ) {
                alt61=1;
            }
            else if ( (LA61_0==69) ) {
                alt61=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3644:1: ( ( '+' ) | ( '-' ) )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3644:2: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3644:2: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3644:4: '+'
                    {
                    match(input,45,FOLLOW_45_in_rulePlusOperator6624); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3650:6: ( '-' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3650:6: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3650:8: '-'
                    {
                    match(input,69,FOLLOW_69_in_rulePlusOperator6639); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getSUBEnumLiteralDeclaration_1(), null); 
                          
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
    // $ANTLR end rulePlusOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3660:1: ruleMultOperator returns [Enumerator current=null] : ( ( '*' ) | ( 'mod' ) ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3664:6: ( ( ( '*' ) | ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3665:1: ( ( '*' ) | ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3665:1: ( ( '*' ) | ( 'mod' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==46) ) {
                alt62=1;
            }
            else if ( (LA62_0==70) ) {
                alt62=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3665:1: ( ( '*' ) | ( 'mod' ) )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3665:2: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3665:2: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3665:4: '*'
                    {
                    match(input,46,FOLLOW_46_in_ruleMultOperator6682); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3671:6: ( 'mod' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3671:6: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3671:8: 'mod'
                    {
                    match(input,70,FOLLOW_70_in_ruleMultOperator6697); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMODEnumLiteralDeclaration_1(), null); 
                          
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
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3681:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3685:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3686:3: '/'
            {
            match(input,27,FOLLOW_27_in_ruleDivOperator6739); if (failed) return current;
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

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( ( RULE_ID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred2158); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:161:6: ( ( ( ruleSignal ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:161:6: ( ( ruleSignal ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:161:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:162:1: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:162:1: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:163:3: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred4213);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:341:1: ( ( RULE_STRING ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:341:1: ( RULE_STRING )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:341:1: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:342:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred10457); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:389:1: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:389:1: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:389:1: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:390:3: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_8_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred12507);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1374:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1374:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1374:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1375:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred422148);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1401:2: ( ( ( ruleEffect ) ) ( ',' )? )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1401:2: ( ( ruleEffect ) ) ( ',' )?
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1401:2: ( ( ruleEffect ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1402:1: ( ruleEffect )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1402:1: ( ruleEffect )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1403:3: ruleEffect
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred442182);
        ruleEffect();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1425:2: ( ',' )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==28) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1425:4: ','
                {
                match(input,28,FOLLOW_28_in_synpred442193); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred48
    public final void synpred48_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:3: ( ( '(' ( ( ruleValueExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:3: ( '(' ( ( ruleValueExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:3: ( '(' ( ( ruleValueExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1530:5: '(' ( ( ruleValueExpression ) ) ')'
        {
        match(input,38,FOLLOW_38_in_synpred482459); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1534:1: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1535:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1535:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1536:3: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred482480);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,39,FOLLOW_39_in_synpred482490); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred48

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:6: ( ( '(' ( ( ruleBooleanExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:8: '(' ( ( ruleBooleanExpression ) ) ')'
        {
        match(input,38,FOLLOW_38_in_synpred492508); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1567:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1569:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred492529);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,39,FOLLOW_39_in_synpred492539); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:2: ( ( ( ruleValueExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:2: ( ( ruleValueExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:2: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1640:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1640:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1641:3: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred502667);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred56
    public final void synpred56_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:6: ( ( '(' rulePlusOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:6: ( '(' rulePlusOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:6: ( '(' rulePlusOperation ')' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2107:8: '(' rulePlusOperation ')'
        {
        match(input,38,FOLLOW_38_in_synpred563595); if (failed) return ;
        pushFollow(FOLLOW_rulePlusOperation_in_synpred563620);
        rulePlusOperation();
        _fsp--;
        if (failed) return ;
        match(input,39,FOLLOW_39_in_synpred563629); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred56

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2274:2: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2274:2: ruleMultOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred583930);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred67
    public final void synpred67_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3191:2: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3191:2: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred675525);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred67

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:2: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:2: ruleSignalReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred685555);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3217:2: ( ruleHostCode )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3217:2: ruleHostCode
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostCode_in_synpred695585);
        ruleHostCode();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred69

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred69() {
        backtracking++;
        int start = input.mark();
        try {
            synpred69_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred58() {
        backtracking++;
        int start = input.mark();
        try {
            synpred58_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred48() {
        backtracking++;
        int start = input.mark();
        try {
            synpred48_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred56() {
        backtracking++;
        int start = input.mark();
        try {
            synpred56_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred68() {
        backtracking++;
        int start = input.mark();
        try {
            synpred68_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred67() {
        backtracking++;
        int start = input.mark();
        try {
            synpred67_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
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
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
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


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA45_eotS =
        "\33\uffff";
    static final String DFA45_eofS =
        "\33\uffff";
    static final String DFA45_minS =
        "\1\4\5\uffff\1\4\1\46\2\33\1\4\2\33\1\0\1\73\1\uffff\1\0\1\uffff"+
        "\1\33\3\4\1\47\1\45\1\33\1\4\1\33";
    static final String DFA45_maxS =
        "\1\73\5\uffff\1\102\1\46\2\106\1\4\2\106\1\0\1\73\1\uffff\1\0\1"+
        "\uffff\1\106\3\4\2\47\1\106\1\4\1\106";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\11\uffff\1\6\1\uffff\1\7\11\uffff";
    static final String DFA45_specialS =
        "\15\uffff\1\1\2\uffff\1\0\12\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\4\1\5\1\1\1\uffff\1\2\35\uffff\1\6\24\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14\1\10\1\uffff\1\11\35\uffff\1\15\24\uffff\1\12\6\uffff"+
            "\1\7",
            "\1\16",
            "\1\21\13\uffff\1\20\5\uffff\2\17\26\uffff\2\17",
            "\1\21\13\uffff\1\20\5\uffff\2\17\26\uffff\2\17",
            "\1\22",
            "\1\21\13\uffff\1\20\5\uffff\2\17\26\uffff\2\17",
            "\1\21\12\uffff\1\23\1\20\5\uffff\2\17\26\uffff\2\17",
            "\1\uffff",
            "\1\24",
            "",
            "\1\uffff",
            "",
            "\1\21\11\uffff\1\25\1\uffff\1\20\5\uffff\2\17\26\uffff\2\17",
            "\1\26",
            "\1\27",
            "\1\22",
            "\1\30",
            "\1\31\1\uffff\1\32",
            "\1\21\13\uffff\1\20\5\uffff\2\17\26\uffff\2\17",
            "\1\27",
            "\1\21\13\uffff\1\20\5\uffff\2\17\26\uffff\2\17"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2042:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_16 = input.LA(1);

                         
                        int index45_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index45_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56()) ) {s = 15;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\11\uffff";
    static final String DFA51_eofS =
        "\11\uffff";
    static final String DFA51_minS =
        "\1\4\1\uffff\1\46\1\uffff\1\4\1\uffff\1\4\1\45\1\4";
    static final String DFA51_maxS =
        "\1\102\1\uffff\1\46\1\uffff\1\102\1\uffff\1\4\1\106\1\4";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\3\uffff";
    static final String DFA51_specialS =
        "\11\uffff}>";
    static final String[] DFA51_transitionS = {
            "\5\3\35\uffff\1\3\24\uffff\1\3\5\uffff\1\1\1\2",
            "",
            "\1\4",
            "",
            "\5\5\35\uffff\1\5\24\uffff\1\6\5\uffff\2\5",
            "",
            "\1\7",
            "\1\10\1\uffff\1\3\5\uffff\2\5\15\uffff\5\5\4\uffff\2\5",
            "\1\7"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "2912:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRegion139 = new BitSet(new long[]{0x00000F0C8001C010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegion158 = new BitSet(new long[]{0x00000F0C8001C010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion186 = new BitSet(new long[]{0x00000F0C8001C010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion213 = new BitSet(new long[]{0x00000F0C8001C010L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion236 = new BitSet(new long[]{0x00000F000001C012L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleState338 = new BitSet(new long[]{0x00000F0000018010L});
    public static final BitSet FOLLOW_15_in_ruleState370 = new BitSet(new long[]{0x00000F0000010010L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState405 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleState417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState440 = new BitSet(new long[]{0x0700000C003E0032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState457 = new BitSet(new long[]{0x0700000C003E0032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState480 = new BitSet(new long[]{0x0700000C003E0012L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState507 = new BitSet(new long[]{0x0700000C003E0012L});
    public static final BitSet FOLLOW_17_in_ruleState519 = new BitSet(new long[]{0x0F0000400C3E01F2L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState540 = new BitSet(new long[]{0x07000000003E0002L});
    public static final BitSet FOLLOW_18_in_ruleState553 = new BitSet(new long[]{0x0F0000400C3C01F2L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState574 = new BitSet(new long[]{0x07000000003C0002L});
    public static final BitSet FOLLOW_19_in_ruleState587 = new BitSet(new long[]{0x0F0000400C3801F2L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState608 = new BitSet(new long[]{0x0700000000380002L});
    public static final BitSet FOLLOW_20_in_ruleState621 = new BitSet(new long[]{0x0F0000400C2001F2L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState642 = new BitSet(new long[]{0x0700000000200002L});
    public static final BitSet FOLLOW_21_in_ruleState655 = new BitSet(new long[]{0x00000F0C8001E010L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState676 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleState687 = new BitSet(new long[]{0x00000F0C8001E010L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState708 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleState720 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleTextualTransition_in_ruleState743 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_entryRuleFullStateID783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullStateID794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID835 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFullStateID853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextualTransition_in_entryRuleTextualTransition917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextualTransition927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTextualTransition973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextualTransition990 = new BitSet(new long[]{0x0000000062000000L});
    public static final BitSet FOLLOW_25_in_ruleTextualTransition1006 = new BitSet(new long[]{0x080000406C0001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_26_in_ruleTextualTransition1024 = new BitSet(new long[]{0x08000040680001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextualTransition1055 = new BitSet(new long[]{0x08000040680001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTextualTransition1083 = new BitSet(new long[]{0x0000000068000000L});
    public static final BitSet FOLLOW_27_in_ruleTextualTransition1095 = new BitSet(new long[]{0x0000000060000030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTextualTransition1117 = new BitSet(new long[]{0x0000000070000030L});
    public static final BitSet FOLLOW_28_in_ruleTextualTransition1128 = new BitSet(new long[]{0x0000000060000030L});
    public static final BitSet FOLLOW_29_in_ruleTextualTransition1155 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTextualTransition1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVariable1264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1281 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleVariable1298 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariableSignalValue_in_ruleVariable1319 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariable1331 = new BitSet(new long[]{0x00FC000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSignal1442 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleSignal1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSignal1509 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleSignal1521 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariableSignalValue_in_ruleSignal1542 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_33_in_ruleSignal1555 = new BitSet(new long[]{0x00FC000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSignal1594 = new BitSet(new long[]{0x00FC000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal1615 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal1625 = new BitSet(new long[]{0x0003F00000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableSignalValue_in_entryRuleVariableSignalValue1717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableSignalValue1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariableSignalValue1768 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableSignalValue1794 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleVariableSignalValue1820 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableSignalValue1846 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1945 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAction2090 = new BitSet(new long[]{0x08000040080001F2L,0x0000000000000006L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction2121 = new BitSet(new long[]{0x08000040080001F2L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction2148 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAction2160 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction2182 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_28_in_ruleAction2193 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission2447 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleEmission2459 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleEmission2480 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEmission2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEmission2508 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission2529 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleEmission2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment2635 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAssignment2645 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleAssignment2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference2731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSignalReference2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference2827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue2918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation3193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation3249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValueExpression3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression3399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValueExpression3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleParanthesedValueExpression3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleParanthesedValueExpression3595 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression3620 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParanthesedValueExpression3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleParanthesedValueExpression3647 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleParanthesedValueExpression3672 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParanthesedValueExpression3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation3718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation3778 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rulePlusOperation3811 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation3832 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation3870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMultOrDivOperation3946 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation3971 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMultOrDivOperation3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation4017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4077 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultOperation4110 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4131 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation4169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4229 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivOperation4262 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4283 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation4321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation4377 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePreArithmOperation4387 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleValOperation_in_rulePreArithmOperation4408 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePreArithmOperation4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression4454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValueExpression4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation4639 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4672 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation4730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation4786 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation4843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation4899 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleUnaryParanthesedOperation4909 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation4930 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleUnaryParanthesedOperation4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression4976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation5131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation5224 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5245 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation5283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation5343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation5376 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation5397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression5435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleParanthesedBooleanExpression5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleParanthesedBooleanExpression5601 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression5626 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleParanthesedBooleanExpression5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression5672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode5765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode5817 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleHostCode5833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHostCode5850 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleHostCode5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleStateType5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleStateType5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleStateType5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleStateType5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCombineOperator6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCombineOperator6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCombineOperator6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCombineOperator6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCombineOperator6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCombineOperator6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueType6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleValueType6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValueType6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleValueType6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleValueType6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleValueType6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTransitionType6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTransitionType6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTransitionType6269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValOperator6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCompareOperator6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCompareOperator6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCompareOperator6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCompareOperator6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCompareOperator6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUnaryOperator6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUnaryParanthesedOperator6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperatorOr6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperatorAnd6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePlusOperator6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePlusOperator6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultOperator6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleMultOperator6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDivOperator6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred12507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred422148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred442182 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_synpred442193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred482459 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred482480 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred482490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred492508 = new BitSet(new long[]{0x08000040000001F0L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred492529 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred492539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred502667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred563595 = new BitSet(new long[]{0x0800004000000170L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePlusOperation_in_synpred563620 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred563629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred583930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred675525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred685555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_synpred695585 = new BitSet(new long[]{0x0000000000000002L});

}