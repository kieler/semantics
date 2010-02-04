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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "'init'", "'final'", "'state'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'{'", "'||'", "'}'", "'@'", "'with'", "'#'", "'delay:='", "'/'", "','", "' history'", "';'", "'cond'", "'conditional'", "'var'", "':='", "': '", "'input'", "'output'", "'signal'", "': combine'", "'.'", "'('", "')'", "'NORMAL'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'hostCombineOperator'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'hostType'", "'-->'", "'o->'", "'>->'", "'?'", "'='", "'<'", "'<='", "'>'", "'>='", "'not'", "'pre'", "'or'", "'and'", "'-'", "'mod'"
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
            ruleMemo = new HashMap[189+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ruleRegion returns [EObject current=null] : ( () ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        EObject lv_variables_4_0 = null;

        EObject lv_signals_5_0 = null;

        EObject lv_innerStates_6_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:93:6: ( ( () ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:1: ( () ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:1: ( () ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:2: () ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )? ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )* ( (lv_innerStates_6_0= ruleState ) )+
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:2: ( ( 'region' ( (lv_id_2_0= RULE_ID ) ) ) | 'region' )?
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_3 = input.LA(3);

                    if ( (synpred1()) ) {
                        alt1=1;
                    }
                    else if ( (synpred2()) ) {
                        alt1=2;
                    }
                }
                else if ( ((LA1_1>=14 && LA1_1<=16)||LA1_1==32||LA1_1==34||(LA1_1>=37 && LA1_1<=39)||(LA1_1>=44 && LA1_1<=46)) ) {
                    alt1=2;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( 'region' ( (lv_id_2_0= RULE_ID ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( 'region' ( (lv_id_2_0= RULE_ID ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:5: 'region' ( (lv_id_2_0= RULE_ID ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleRegion140); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:1: ( (lv_id_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: (lv_id_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegion157); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_1_0_1_0(), "id"); 
                      		
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


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: 'region'
                    {
                    match(input,13,FOLLOW_13_in_ruleRegion179); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:3: ( ( (lv_variables_4_0= ruleVariable ) ) | ( (lv_signals_5_0= ruleSignal ) ) )*
            loop2:
            do {
                int alt2=3;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==31||LA2_2==35||LA2_2==41) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 34:
                    {
                    alt2=1;
                    }
                    break;
                case 37:
                case 38:
                case 39:
                    {
                    alt2=2;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:4: ( (lv_variables_4_0= ruleVariable ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:4: ( (lv_variables_4_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:142:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:142:1: (lv_variables_4_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:143:3: lv_variables_4_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_2_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion203);
            	    lv_variables_4_0=ruleVariable();
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
            	      	        		lv_variables_4_0, 
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
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:166:6: ( (lv_signals_5_0= ruleSignal ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:166:6: ( (lv_signals_5_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:167:1: (lv_signals_5_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:167:1: (lv_signals_5_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:168:3: lv_signals_5_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion230);
            	    lv_signals_5_0=ruleSignal();
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
            	      	        		lv_signals_5_0, 
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
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:190:4: ( (lv_innerStates_6_0= ruleState ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=14 && LA3_0<=16)||LA3_0==32||(LA3_0>=44 && LA3_0<=46)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:191:1: (lv_innerStates_6_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:191:1: (lv_innerStates_6_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:192:3: lv_innerStates_6_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion253);
            	    lv_innerStates_6_0=ruleState();
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
            	      	        		lv_innerStates_6_0, 
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
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:222:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:223:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:224:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState290);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState300); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:231:1: ruleState returns [EObject current=null] : ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_id_5_0= ruleFullStateID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_label_6_0=null;
        Token lv_bodyText_7_0=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_signals_8_0 = null;

        EObject lv_entryActions_10_0 = null;

        EObject lv_innerActions_12_0 = null;

        EObject lv_exitActions_14_0 = null;

        EObject lv_suspensionTrigger_16_0 = null;

        EObject lv_regions_18_0 = null;

        EObject lv_regions_20_0 = null;

        EObject lv_outgoingTransitions_22_1 = null;

        EObject lv_outgoingTransitions_22_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:236:6: ( ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_id_5_0= ruleFullStateID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:237:1: ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_id_5_0= ruleFullStateID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:237:1: ( () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_id_5_0= ruleFullStateID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:237:2: () ( (lv_isInitial_1_0= 'init' ) )? ( (lv_isFinal_2_0= 'final' ) )? ( (lv_type_3_0= ruleStateType ) )? ( 'state' )? ( (lv_id_5_0= ruleFullStateID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (lv_bodyText_7_0= RULE_STRING ) )? ( (lv_signals_8_0= ruleSignal ) )* ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )* ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )* ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )* ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )? ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )? ( ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) ) )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:237:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:238:2: 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:251:2: ( (lv_isInitial_1_0= 'init' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:252:1: (lv_isInitial_1_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:252:1: (lv_isInitial_1_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:253:3: lv_isInitial_1_0= 'init'
                    {
                    lv_isInitial_1_0=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleState355); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:272:3: ( (lv_isFinal_2_0= 'final' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:273:1: (lv_isFinal_2_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:273:1: (lv_isFinal_2_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:274:3: lv_isFinal_2_0= 'final'
                    {
                    lv_isFinal_2_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleState387); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:293:3: ( (lv_type_3_0= ruleStateType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32||(LA6_0>=44 && LA6_0<=46)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:294:1: (lv_type_3_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:294:1: (lv_type_3_0= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:295:3: lv_type_3_0= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState422);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:317:3: ( 'state' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:317:5: 'state'
                    {
                    match(input,16,FOLLOW_16_in_ruleState434); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_4(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:321:3: ( (lv_id_5_0= ruleFullStateID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:1: (lv_id_5_0= ruleFullStateID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:322:1: (lv_id_5_0= ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:323:3: lv_id_5_0= ruleFullStateID
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullStateID_in_ruleState457);
            lv_id_5_0=ruleFullStateID();
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
              	       			"id",
              	        		lv_id_5_0, 
              	        		"FullStateID", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:345:2: ( (lv_label_6_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred10()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:346:1: (lv_label_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:346:1: (lv_label_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState474); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_6_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_6_0, 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:369:3: ( (lv_bodyText_7_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:370:1: (lv_bodyText_7_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:370:1: (lv_bodyText_7_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:371:3: lv_bodyText_7_0= RULE_STRING
                    {
                    lv_bodyText_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState497); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:393:3: ( (lv_signals_8_0= ruleSignal ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==31||LA10_2==35||LA10_2==41) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>=37 && LA10_0<=39)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:394:1: (lv_signals_8_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:394:1: (lv_signals_8_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:395:3: lv_signals_8_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_8_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleState524);
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
            	    break loop10;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:417:3: ( 'onentry' ( (lv_entryActions_10_0= ruleAction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:417:5: 'onentry' ( (lv_entryActions_10_0= ruleAction ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleState536); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_9_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:1: ( (lv_entryActions_10_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:422:1: (lv_entryActions_10_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:422:1: (lv_entryActions_10_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:423:3: lv_entryActions_10_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_9_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState557);
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
            	    break loop11;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:445:4: ( 'oninner' ( (lv_innerActions_12_0= ruleAction ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:445:6: 'oninner' ( (lv_innerActions_12_0= ruleAction ) )
            	    {
            	    match(input,18,FOLLOW_18_in_ruleState570); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_10_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:449:1: ( (lv_innerActions_12_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:450:1: (lv_innerActions_12_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:450:1: (lv_innerActions_12_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:451:3: lv_innerActions_12_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_10_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState591);
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
            	    break loop12;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:473:4: ( 'onexit' ( (lv_exitActions_14_0= ruleAction ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:473:6: 'onexit' ( (lv_exitActions_14_0= ruleAction ) )
            	    {
            	    match(input,19,FOLLOW_19_in_ruleState604); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_11_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:477:1: ( (lv_exitActions_14_0= ruleAction ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:478:1: (lv_exitActions_14_0= ruleAction )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:478:1: (lv_exitActions_14_0= ruleAction )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:479:3: lv_exitActions_14_0= ruleAction
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_11_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAction_in_ruleState625);
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
            	    break loop13;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:501:4: ( 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:501:6: 'suspension' ( (lv_suspensionTrigger_16_0= ruleAction ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleState638); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_12_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:505:1: ( (lv_suspensionTrigger_16_0= ruleAction ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:506:1: (lv_suspensionTrigger_16_0= ruleAction )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:506:1: (lv_suspensionTrigger_16_0= ruleAction )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:507:3: lv_suspensionTrigger_16_0= ruleAction
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleState659);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:4: ( '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:6: '{' ( (lv_regions_18_0= ruleRegion ) ) ( '||' ( (lv_regions_20_0= ruleRegion ) ) )* '}'
                    {
                    match(input,21,FOLLOW_21_in_ruleState672); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_13_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:533:1: ( (lv_regions_18_0= ruleRegion ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:534:1: (lv_regions_18_0= ruleRegion )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:534:1: (lv_regions_18_0= ruleRegion )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:535:3: lv_regions_18_0= ruleRegion
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_13_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRegion_in_ruleState693);
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:557:2: ( '||' ( (lv_regions_20_0= ruleRegion ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:557:4: '||' ( (lv_regions_20_0= ruleRegion ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleState704); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_13_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:561:1: ( (lv_regions_20_0= ruleRegion ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:1: (lv_regions_20_0= ruleRegion )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:562:1: (lv_regions_20_0= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:563:3: lv_regions_20_0= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_13_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState725);
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
                    	    break loop15;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleState737); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_13_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:589:3: ( ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=59 && LA18_0<=61)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:590:1: ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:590:1: ( (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:591:1: (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:591:1: (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition )
            	    int alt17=2;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        int LA17_1 = input.LA(2);

            	        if ( (synpred19()) ) {
            	            alt17=1;
            	        }
            	        else if ( (true) ) {
            	            alt17=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("591:1: (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition )", 17, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 60:
            	        {
            	        int LA17_2 = input.LA(2);

            	        if ( (synpred19()) ) {
            	            alt17=1;
            	        }
            	        else if ( (true) ) {
            	            alt17=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("591:1: (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition )", 17, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 61:
            	        {
            	        int LA17_3 = input.LA(2);

            	        if ( (synpred19()) ) {
            	            alt17=1;
            	        }
            	        else if ( (true) ) {
            	            alt17=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("591:1: (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition )", 17, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("591:1: (lv_outgoingTransitions_22_1= ruleTransition | lv_outgoingTransitions_22_2= ruleTextualTransition )", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:592:3: lv_outgoingTransitions_22_1= ruleTransition
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_14_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTransition_in_ruleState762);
            	            lv_outgoingTransitions_22_1=ruleTransition();
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
            	              	        		lv_outgoingTransitions_22_1, 
            	              	        		"Transition", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:613:8: lv_outgoingTransitions_22_2= ruleTextualTransition
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTextualTransitionParserRuleCall_14_0_1(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleTextualTransition_in_ruleState781);
            	            lv_outgoingTransitions_22_2=ruleTextualTransition();
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
            	              	        		lv_outgoingTransitions_22_2, 
            	              	        		"TextualTransition", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }
            	            break;

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:647:1: entryRuleFullStateID returns [String current=null] : iv_ruleFullStateID= ruleFullStateID EOF ;
    public final String entryRuleFullStateID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullStateID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:648:2: (iv_ruleFullStateID= ruleFullStateID EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:649:2: iv_ruleFullStateID= ruleFullStateID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullStateIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullStateID_in_entryRuleFullStateID824);
            iv_ruleFullStateID=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullStateID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullStateID835); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:656:1: ruleFullStateID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFullStateID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:2: (this_ID_0= RULE_ID kw= '@' )?
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:662:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID876); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleFullStateID894); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFullStateIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID911); if (failed) return current;
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


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:690:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:691:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:692:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition956);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition966); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:699:1: ruleTransition returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_10_0= ' history' ) )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_3_0=null;
        Token lv_delay_5_0=null;
        Token lv_isHistory_10_0=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_trigger_6_0 = null;

        EObject lv_effects_8_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:704:6: ( ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_10_0= ' history' ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:705:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_10_0= ' history' ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:705:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_10_0= ' history' ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:705:2: ( (lv_type_0_0= ruleTransitionType ) ) ( ( ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_10_0= ' history' ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:705:2: ( (lv_type_0_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:706:1: (lv_type_0_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:706:1: (lv_type_0_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:707:3: lv_type_0_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition1012);
            lv_type_0_0=ruleTransitionType();
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:729:2: ( ( ruleFullStateID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:730:1: ( ruleFullStateID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:730:1: ( ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:731:3: ruleFullStateID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition1039);
            ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:748:2: ( 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:748:4: 'with' ( (lv_isImmediate_3_0= '#' ) )? ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )? ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? )
                    {
                    match(input,25,FOLLOW_25_in_ruleTransition1050); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:752:1: ( (lv_isImmediate_3_0= '#' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==26) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:753:1: (lv_isImmediate_3_0= '#' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:753:1: (lv_isImmediate_3_0= '#' )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:754:3: lv_isImmediate_3_0= '#'
                            {
                            lv_isImmediate_3_0=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleTransition1068); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_2_1_0(), "isImmediate"); 
                                  
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:773:3: ( 'delay:=' ( (lv_delay_5_0= RULE_INT ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==27) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:773:5: 'delay:=' ( (lv_delay_5_0= RULE_INT ) )
                            {
                            match(input,27,FOLLOW_27_in_ruleTransition1093); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getDelayKeyword_2_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:777:1: ( (lv_delay_5_0= RULE_INT ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:778:1: (lv_delay_5_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:778:1: (lv_delay_5_0= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:779:3: lv_delay_5_0= RULE_INT
                            {
                            lv_delay_5_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition1110); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_2_2_1_0(), "delay"); 
                              		
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
                              	        		lv_delay_5_0, 
                              	        		"INT", 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:801:4: ( ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )? )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:801:5: ( (lv_trigger_6_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )?
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:801:5: ( (lv_trigger_6_0= ruleBooleanExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_FLOAT)||LA22_0==42||LA22_0==62||(LA22_0>=68 && LA22_0<=69)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:802:1: (lv_trigger_6_0= ruleBooleanExpression )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:802:1: (lv_trigger_6_0= ruleBooleanExpression )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:803:3: lv_trigger_6_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_2_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleTransition1139);
                            lv_trigger_6_0=ruleBooleanExpression();
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
                              	        		lv_trigger_6_0, 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:825:3: ( '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:825:5: '/' ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )*
                            {
                            match(input,28,FOLLOW_28_in_ruleTransition1151); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTransitionAccess().getSolidusKeyword_2_3_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:829:1: ( ( (lv_effects_8_0= ruleEffect ) ) ( ',' )? )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:829:2: ( (lv_effects_8_0= ruleEffect ) ) ( ',' )?
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:829:2: ( (lv_effects_8_0= ruleEffect ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:830:1: (lv_effects_8_0= ruleEffect )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:830:1: (lv_effects_8_0= ruleEffect )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:831:3: lv_effects_8_0= ruleEffect
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_2_3_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEffect_in_ruleTransition1173);
                            	    lv_effects_8_0=ruleEffect();
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
                            	      	        		lv_effects_8_0, 
                            	      	        		"Effect", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:853:2: ( ',' )?
                            	    int alt23=2;
                            	    int LA23_0 = input.LA(1);

                            	    if ( (LA23_0==29) ) {
                            	        alt23=1;
                            	    }
                            	    switch (alt23) {
                            	        case 1 :
                            	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:853:4: ','
                            	            {
                            	            match(input,29,FOLLOW_29_in_ruleTransition1184); if (failed) return current;
                            	            if ( backtracking==0 ) {

                            	                      createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_2_3_1_1_1(), null); 
                            	                  
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:857:10: ( (lv_isHistory_10_0= ' history' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:858:1: (lv_isHistory_10_0= ' history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:858:1: (lv_isHistory_10_0= ' history' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:3: lv_isHistory_10_0= ' history'
                    {
                    lv_isHistory_10_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleTransition1211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_3_0(), "isHistory"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
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

            match(input,31,FOLLOW_31_in_ruleTransition1235); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_4(), null); 
                  
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


    // $ANTLR start entryRuleTextualTransition
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:890:1: entryRuleTextualTransition returns [EObject current=null] : iv_ruleTextualTransition= ruleTextualTransition EOF ;
    public final EObject entryRuleTextualTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:891:2: (iv_ruleTextualTransition= ruleTextualTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:892:2: iv_ruleTextualTransition= ruleTextualTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextualTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTextualTransition_in_entryRuleTextualTransition1271);
            iv_ruleTextualTransition=ruleTextualTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextualTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextualTransition1281); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:899:1: ruleTextualTransition returns [EObject current=null] : ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) ) )? ( (lv_makeFinal_2_0= 'final' ) )? ( (lv_targetStateProxy_3_0= ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_12_0= ' history' ) )? ';' ) ;
    public final EObject ruleTextualTransition() throws RecognitionException {
        EObject current = null;

        Token lv_makeConditional_1_1=null;
        Token lv_makeConditional_1_2=null;
        Token lv_makeFinal_2_0=null;
        Token lv_isImmediate_5_0=null;
        Token lv_delay_7_0=null;
        Token lv_isHistory_12_0=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_targetStateProxy_3_0 = null;

        EObject lv_trigger_8_0 = null;

        EObject lv_effects_10_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:904:6: ( ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) ) )? ( (lv_makeFinal_2_0= 'final' ) )? ( (lv_targetStateProxy_3_0= ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_12_0= ' history' ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:905:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) ) )? ( (lv_makeFinal_2_0= 'final' ) )? ( (lv_targetStateProxy_3_0= ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_12_0= ' history' ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:905:1: ( ( (lv_type_0_0= ruleTransitionType ) ) ( ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) ) )? ( (lv_makeFinal_2_0= 'final' ) )? ( (lv_targetStateProxy_3_0= ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_12_0= ' history' ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:905:2: ( (lv_type_0_0= ruleTransitionType ) ) ( ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) ) )? ( (lv_makeFinal_2_0= 'final' ) )? ( (lv_targetStateProxy_3_0= ruleFullStateID ) ) ( 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? ) )? ( (lv_isHistory_12_0= ' history' ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:905:2: ( (lv_type_0_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:906:1: (lv_type_0_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:906:1: (lv_type_0_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:907:3: lv_type_0_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTypeTransitionTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTextualTransition1327);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:929:2: ( ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=32 && LA29_0<=33)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:930:1: ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:930:1: ( (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:931:1: (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:931:1: (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==32) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==33) ) {
                        alt28=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("931:1: (lv_makeConditional_1_1= 'cond' | lv_makeConditional_1_2= 'conditional' )", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:932:3: lv_makeConditional_1_1= 'cond'
                            {
                            lv_makeConditional_1_1=(Token)input.LT(1);
                            match(input,32,FOLLOW_32_in_ruleTextualTransition1347); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getMakeConditionalCondKeyword_1_0_0(), "makeConditional"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "makeConditional", true, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:950:8: lv_makeConditional_1_2= 'conditional'
                            {
                            lv_makeConditional_1_2=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleTextualTransition1376); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getMakeConditionalConditionalKeyword_1_0_1(), "makeConditional"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "makeConditional", true, null, lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:971:3: ( (lv_makeFinal_2_0= 'final' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:972:1: (lv_makeFinal_2_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:972:1: (lv_makeFinal_2_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:973:3: lv_makeFinal_2_0= 'final'
                    {
                    lv_makeFinal_2_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleTextualTransition1411); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getMakeFinalFinalKeyword_2_0(), "makeFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextualTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "makeFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:992:3: ( (lv_targetStateProxy_3_0= ruleFullStateID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:993:1: (lv_targetStateProxy_3_0= ruleFullStateID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:993:1: (lv_targetStateProxy_3_0= ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:994:3: lv_targetStateProxy_3_0= ruleFullStateID
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTargetStateProxyFullStateIDParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullStateID_in_ruleTextualTransition1446);
            lv_targetStateProxy_3_0=ruleFullStateID();
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
              	       			"targetStateProxy",
              	        		lv_targetStateProxy_3_0, 
              	        		"FullStateID", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1016:2: ( 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1016:4: 'with' ( (lv_isImmediate_5_0= '#' ) )? ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )? ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? )
                    {
                    match(input,25,FOLLOW_25_in_ruleTextualTransition1457); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getWithKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1020:1: ( (lv_isImmediate_5_0= '#' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==26) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1021:1: (lv_isImmediate_5_0= '#' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1021:1: (lv_isImmediate_5_0= '#' )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1022:3: lv_isImmediate_5_0= '#'
                            {
                            lv_isImmediate_5_0=(Token)input.LT(1);
                            match(input,26,FOLLOW_26_in_ruleTextualTransition1475); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getIsImmediateNumberSignKeyword_4_1_0(), "isImmediate"); 
                                  
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1041:3: ( 'delay:=' ( (lv_delay_7_0= RULE_INT ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==27) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1041:5: 'delay:=' ( (lv_delay_7_0= RULE_INT ) )
                            {
                            match(input,27,FOLLOW_27_in_ruleTextualTransition1500); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getDelayKeyword_4_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1045:1: ( (lv_delay_7_0= RULE_INT ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1046:1: (lv_delay_7_0= RULE_INT )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1046:1: (lv_delay_7_0= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1047:3: lv_delay_7_0= RULE_INT
                            {
                            lv_delay_7_0=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextualTransition1517); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTextualTransitionAccess().getDelayINTTerminalRuleCall_4_2_1_0(), "delay"); 
                              		
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
                              	        		lv_delay_7_0, 
                              	        		"INT", 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1069:4: ( ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )? )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1069:5: ( (lv_trigger_8_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )?
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1069:5: ( (lv_trigger_8_0= ruleBooleanExpression ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_FLOAT)||LA33_0==42||LA33_0==62||(LA33_0>=68 && LA33_0<=69)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1070:1: (lv_trigger_8_0= ruleBooleanExpression )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1070:1: (lv_trigger_8_0= ruleBooleanExpression )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1071:3: lv_trigger_8_0= ruleBooleanExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getTriggerBooleanExpressionParserRuleCall_4_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleTextualTransition1546);
                            lv_trigger_8_0=ruleBooleanExpression();
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
                              	        		lv_trigger_8_0, 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1093:3: ( '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==28) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1093:5: '/' ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )*
                            {
                            match(input,28,FOLLOW_28_in_ruleTextualTransition1558); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTextualTransitionAccess().getSolidusKeyword_4_3_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1097:1: ( ( (lv_effects_10_0= ruleEffect ) ) ( ',' )? )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1097:2: ( (lv_effects_10_0= ruleEffect ) ) ( ',' )?
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1097:2: ( (lv_effects_10_0= ruleEffect ) )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1098:1: (lv_effects_10_0= ruleEffect )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1098:1: (lv_effects_10_0= ruleEffect )
                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1099:3: lv_effects_10_0= ruleEffect
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getTextualTransitionAccess().getEffectsEffectParserRuleCall_4_3_1_1_0_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleEffect_in_ruleTextualTransition1580);
                            	    lv_effects_10_0=ruleEffect();
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
                            	      	        		lv_effects_10_0, 
                            	      	        		"Effect", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }

                            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1121:2: ( ',' )?
                            	    int alt34=2;
                            	    int LA34_0 = input.LA(1);

                            	    if ( (LA34_0==29) ) {
                            	        alt34=1;
                            	    }
                            	    switch (alt34) {
                            	        case 1 :
                            	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1121:4: ','
                            	            {
                            	            match(input,29,FOLLOW_29_in_ruleTextualTransition1591); if (failed) return current;
                            	            if ( backtracking==0 ) {

                            	                      createLeafNode(grammarAccess.getTextualTransitionAccess().getCommaKeyword_4_3_1_1_1(), null); 
                            	                  
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1125:10: ( (lv_isHistory_12_0= ' history' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1126:1: (lv_isHistory_12_0= ' history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1126:1: (lv_isHistory_12_0= ' history' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1127:3: lv_isHistory_12_0= ' history'
                    {
                    lv_isHistory_12_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleTextualTransition1618); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualTransitionAccess().getIsHistoryHistoryKeyword_5_0(), "isHistory"); 
                          
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

            match(input,31,FOLLOW_31_in_ruleTextualTransition1642); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTextualTransitionAccess().getSemicolonKeyword_6(), null); 
                  
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1162:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1163:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1164:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1682);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1692); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1171:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;

        Enumerator lv_type_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1176:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1177:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1177:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1177:3: 'var' ( (lv_name_1_0= RULE_ID ) ) ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) ) ';'
            {
            match(input,34,FOLLOW_34_in_ruleVariable1727); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1181:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1182:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1182:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1183:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1744); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1205:2: ( ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1205:3: ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )? ': ' ( (lv_type_5_0= ruleValueType ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1205:3: ( ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1205:5: ':=' ( (lv_initialValue_3_0= ruleVariableSignalValue ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleVariable1761); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1209:1: ( (lv_initialValue_3_0= ruleVariableSignalValue ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1210:1: (lv_initialValue_3_0= ruleVariableSignalValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1210:1: (lv_initialValue_3_0= ruleVariableSignalValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:3: lv_initialValue_3_0= ruleVariableSignalValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getInitialValueVariableSignalValueParserRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableSignalValue_in_ruleVariable1782);
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

            match(input,36,FOLLOW_36_in_ruleVariable1794); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1237:1: ( (lv_type_5_0= ruleValueType ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1238:1: (lv_type_5_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1238:1: (lv_type_5_0= ruleValueType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1239:3: lv_type_5_0= ruleValueType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueType_in_ruleVariable1815);
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

            match(input,31,FOLLOW_31_in_ruleVariable1826); if (failed) return current;
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


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1273:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1274:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1275:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal1862);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal1872); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1282:1: ruleSignal returns [EObject current=null] : ( ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_0_0=null;
        Token lv_isOutput_1_0=null;
        Token lv_hostCombineOperator_12_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_5_0 = null;

        Enumerator lv_type_7_0 = null;

        Enumerator lv_type_9_0 = null;

        Enumerator lv_combineOperator_11_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1287:6: ( ( ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:1: ( ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:1: ( ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:2: ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:2: ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=37 && LA42_0<=38)) ) {
                alt42=1;
            }
            else if ( (LA42_0==39) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1288:2: ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? ) | 'signal' )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:3: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:3: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:4: ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1288:4: ( (lv_isInput_0_0= 'input' ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==37) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1289:1: (lv_isInput_0_0= 'input' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1289:1: (lv_isInput_0_0= 'input' )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1290:3: lv_isInput_0_0= 'input'
                            {
                            lv_isInput_0_0=(Token)input.LT(1);
                            match(input,37,FOLLOW_37_in_ruleSignal1917); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_0_0_0(), "isInput"); 
                                  
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1309:3: ( (lv_isOutput_1_0= 'output' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==38) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1310:1: (lv_isOutput_1_0= 'output' )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1310:1: (lv_isOutput_1_0= 'output' )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1311:3: lv_isOutput_1_0= 'output'
                            {
                            lv_isOutput_1_0=(Token)input.LT(1);
                            match(input,38,FOLLOW_38_in_ruleSignal1949); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_0_0_1_0(), "isOutput"); 
                                  
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


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1331:7: 'signal'
                    {
                    match(input,39,FOLLOW_39_in_ruleSignal1980); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getSignalKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1335:2: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1336:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1336:1: (lv_name_3_0= ruleQualifiedName )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1337:3: lv_name_3_0= ruleQualifiedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getNameQualifiedNameParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSignal2002);
            lv_name_3_0=ruleQualifiedName();
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
              	        		lv_name_3_0, 
              	        		"QualifiedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1359:2: ( ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1359:3: ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) ) ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1359:3: ( ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1359:5: ':=' ( (lv_initialValue_5_0= ruleVariableSignalValue ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleSignal2014); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1363:1: ( (lv_initialValue_5_0= ruleVariableSignalValue ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1364:1: (lv_initialValue_5_0= ruleVariableSignalValue )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1364:1: (lv_initialValue_5_0= ruleVariableSignalValue )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1365:3: lv_initialValue_5_0= ruleVariableSignalValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getInitialValueVariableSignalValueParserRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableSignalValue_in_ruleSignal2035);
                    lv_initialValue_5_0=ruleVariableSignalValue();
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
                      	        		lv_initialValue_5_0, 
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:3: ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==36) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==40) ) {
                        alt44=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1387:3: ( ( ': ' ( (lv_type_7_0= ruleValueType ) ) ) | ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) ) )", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:4: ( ': ' ( (lv_type_7_0= ruleValueType ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:4: ( ': ' ( (lv_type_7_0= ruleValueType ) ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:6: ': ' ( (lv_type_7_0= ruleValueType ) )
                            {
                            match(input,36,FOLLOW_36_in_ruleSignal2048); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_1_0_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1391:1: ( (lv_type_7_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1392:1: (lv_type_7_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1392:1: (lv_type_7_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1393:3: lv_type_7_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_0_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal2069);
                            lv_type_7_0=ruleValueType();
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
                              	        		lv_type_7_0, 
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
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1416:6: ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1416:6: ( ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1416:8: ': combine' ( (lv_type_9_0= ruleValueType ) ) 'with' ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) )
                            {
                            match(input,40,FOLLOW_40_in_ruleSignal2087); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_1_1_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1420:1: ( (lv_type_9_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1421:1: (lv_type_9_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1421:1: (lv_type_9_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1422:3: lv_type_9_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValueType_in_ruleSignal2108);
                            lv_type_9_0=ruleValueType();
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
                              	        		lv_type_9_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            match(input,25,FOLLOW_25_in_ruleSignal2118); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_1_1_2(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1448:1: ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) )
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( ((LA43_0>=47 && LA43_0<=52)) ) {
                                alt43=1;
                            }
                            else if ( (LA43_0==RULE_STRING) ) {
                                alt43=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1448:1: ( ( (lv_combineOperator_11_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_12_0= RULE_STRING ) ) )", 43, 0, input);

                                throw nvae;
                            }
                            switch (alt43) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1448:2: ( (lv_combineOperator_11_0= ruleCombineOperator ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1448:2: ( (lv_combineOperator_11_0= ruleCombineOperator ) )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1449:1: (lv_combineOperator_11_0= ruleCombineOperator )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1449:1: (lv_combineOperator_11_0= ruleCombineOperator )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1450:3: lv_combineOperator_11_0= ruleCombineOperator
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_1_3_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal2140);
                                    lv_combineOperator_11_0=ruleCombineOperator();
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
                                      	        		lv_combineOperator_11_0, 
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
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1473:6: ( (lv_hostCombineOperator_12_0= RULE_STRING ) )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1473:6: ( (lv_hostCombineOperator_12_0= RULE_STRING ) )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1474:1: (lv_hostCombineOperator_12_0= RULE_STRING )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1474:1: (lv_hostCombineOperator_12_0= RULE_STRING )
                                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1475:3: lv_hostCombineOperator_12_0= RULE_STRING
                                    {
                                    lv_hostCombineOperator_12_0=(Token)input.LT(1);
                                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal2163); if (failed) return current;
                                    if ( backtracking==0 ) {

                                      			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_2_1_1_3_1_0(), "hostCombineOperator"); 
                                      		
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
                                      	        		lv_hostCombineOperator_12_0, 
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

            match(input,31,FOLLOW_31_in_ruleSignal2183); if (failed) return current;
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


    // $ANTLR start entryRuleVariableSignalValue
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1509:1: entryRuleVariableSignalValue returns [String current=null] : iv_ruleVariableSignalValue= ruleVariableSignalValue EOF ;
    public final String entryRuleVariableSignalValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableSignalValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1510:2: (iv_ruleVariableSignalValue= ruleVariableSignalValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1511:2: iv_ruleVariableSignalValue= ruleVariableSignalValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableSignalValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableSignalValue_in_entryRuleVariableSignalValue2220);
            iv_ruleVariableSignalValue=ruleVariableSignalValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableSignalValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableSignalValue2231); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1518:1: ruleVariableSignalValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+ ;
    public final AntlrDatatypeRuleToken ruleVariableSignalValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        Token this_Boolean_2=null;
        Token this_STRING_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:6: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1524:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1524:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= RULE_BOOLEAN | this_STRING_3= RULE_STRING )+
            int cnt46=0;
            loop46:
            do {
                int alt46=5;
                switch ( input.LA(1) ) {
                case RULE_INT:
                    {
                    alt46=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt46=2;
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    alt46=3;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt46=4;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1524:6: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariableSignalValue2271); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_INT_0);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getINTTerminalRuleCall_0(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1532:10: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableSignalValue2297); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_1);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getIDTerminalRuleCall_1(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1540:10: this_Boolean_2= RULE_BOOLEAN
            	    {
            	    this_Boolean_2=(Token)input.LT(1);
            	    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleVariableSignalValue2323); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_Boolean_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getBooleanTerminalRuleCall_2(), null); 
            	          
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1548:10: this_STRING_3= RULE_STRING
            	    {
            	    this_STRING_3=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableSignalValue2349); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_STRING_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getVariableSignalValueAccess().getSTRINGTerminalRuleCall_3(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1563:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1564:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1565:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2396);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2407); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1572:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1577:6: ( ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1578:1: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1578:1: ( (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1578:2: (this_ID_0= RULE_ID kw= '.' )* this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1578:2: (this_ID_0= RULE_ID kw= '.' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==41) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1578:7: this_ID_0= RULE_ID kw= '.'
            	    {
            	    this_ID_0=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2448); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0(), null); 
            	          
            	    }
            	    kw=(Token)input.LT(1);
            	    match(input,41,FOLLOW_41_in_ruleQualifiedName2466); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_0_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2483); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1606:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1607:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1608:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2528);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2538); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1615:1: ruleAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1620:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1621:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1621:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1621:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1621:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1622:2: 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1635:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1636:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1636:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1637:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleAction2593); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1656:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==EOF||(LA49_1>=RULE_ID && LA49_1<=RULE_FLOAT)||(LA49_1>=14 && LA49_1<=23)||LA49_1==28||LA49_1==32||LA49_1==42||(LA49_1>=44 && LA49_1<=46)||(LA49_1>=59 && LA49_1<=62)||(LA49_1>=68 && LA49_1<=69)) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1657:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1657:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction2624); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1680:3: ( (lv_trigger_3_0= ruleBooleanExpression ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_FLOAT)||LA50_0==42||LA50_0==62||(LA50_0>=68 && LA50_0<=69)) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID) ) {
                int LA50_2 = input.LA(2);

                if ( (synpred55()) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1681:1: (lv_trigger_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1681:1: (lv_trigger_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:3: lv_trigger_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAction2651);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1704:3: ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==28) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1704:5: '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    {
                    match(input,28,FOLLOW_28_in_ruleAction2663); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1708:1: ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==RULE_ID) ) {
                            int LA52_2 = input.LA(2);

                            if ( (synpred57()) ) {
                                alt52=1;
                            }


                        }
                        else if ( (LA52_0==RULE_STRING) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1708:2: ( (lv_effects_5_0= ruleEffect ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1708:2: ( (lv_effects_5_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1709:1: (lv_effects_5_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1709:1: (lv_effects_5_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1710:3: lv_effects_5_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEffect_in_ruleAction2685);
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

                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1732:2: ( ',' )?
                    	    int alt51=2;
                    	    int LA51_0 = input.LA(1);

                    	    if ( (LA51_0==29) ) {
                    	        alt51=1;
                    	    }
                    	    switch (alt51) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1732:4: ','
                    	            {
                    	            match(input,29,FOLLOW_29_in_ruleAction2696); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_4_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1744:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1745:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1746:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEffect_in_entryRuleEffect2738);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEffect2748); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1753:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_HostCode_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1758:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1759:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1759:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==35) ) {
                    alt54=2;
                }
                else if ( (LA54_1==EOF||(LA54_1>=RULE_ID && LA54_1<=RULE_STRING)||(LA54_1>=14 && LA54_1<=23)||(LA54_1>=29 && LA54_1<=32)||LA54_1==42||(LA54_1>=44 && LA54_1<=46)||(LA54_1>=59 && LA54_1<=61)) ) {
                    alt54=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1759:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_STRING) ) {
                alt54=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1759:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_HostCode_2= ruleHostCode )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1760:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmission_in_ruleEffect2798);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1773:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleEffect2828);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1786:2: this_HostCode_2= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getHostCodeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleEffect2858);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1805:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1806:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1807:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEmission_in_entryRuleEmission2893);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmission2903); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1814:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;

        EObject lv_newValue_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1819:6: ( ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1820:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1820:1: ( ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1820:2: ( ( RULE_ID ) ) ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1820:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1821:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1821:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1822:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmission2950); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:2: ( ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' ) | ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' ) )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                int LA55_1 = input.LA(2);

                if ( (synpred61()) ) {
                    alt55=1;
                }
                else if ( (synpred62()) ) {
                    alt55=2;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:3: ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:3: ( '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:5: '(' ( (lv_newValue_2_0= ruleValueExpression ) ) ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleEmission2962); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1841:1: ( (lv_newValue_2_0= ruleValueExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:1: (lv_newValue_2_0= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:1: (lv_newValue_2_0= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1843:3: lv_newValue_2_0= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleEmission2983);
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

                    match(input,43,FOLLOW_43_in_ruleEmission2993); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:6: ( '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:8: '(' ( (lv_newValue_5_0= ruleBooleanExpression ) ) ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleEmission3011); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1874:1: ( (lv_newValue_5_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1875:1: (lv_newValue_5_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1875:1: (lv_newValue_5_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1876:3: lv_newValue_5_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleEmission3032);
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

                    match(input,43,FOLLOW_43_in_ruleEmission3042); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1910:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1911:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1912:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3081);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3091); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1919:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject lv_expression_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1924:6: ( ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1925:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1925:1: ( ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1925:2: ( ( RULE_ID ) ) ':=' ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1925:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1926:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1926:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1927:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment3138); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,35,FOLLOW_35_in_ruleAssignment3148); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )
            int alt56=2;
            switch ( input.LA(1) ) {
            case 69:
                {
                int LA56_1 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA56_2 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA56_3 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 3, input);

                    throw nvae;
                }
                }
                break;
            case 62:
                {
                int LA56_4 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA56_5 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA56_6 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 6, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA56_7 = input.LA(2);

                if ( (synpred63()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
            case 68:
                {
                alt56=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1946:1: ( ( (lv_expression_2_0= ruleValueExpression ) ) | ( (lv_expression_3_0= ruleBooleanExpression ) ) )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1946:2: ( (lv_expression_2_0= ruleValueExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1946:2: ( (lv_expression_2_0= ruleValueExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1947:1: (lv_expression_2_0= ruleValueExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1947:1: (lv_expression_2_0= ruleValueExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1948:3: lv_expression_2_0= ruleValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueExpression_in_ruleAssignment3170);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( (lv_expression_3_0= ruleBooleanExpression ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1972:1: (lv_expression_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1972:1: (lv_expression_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:3: lv_expression_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAssignment3197);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2003:1: entryRuleSignalReference returns [EObject current=null] : iv_ruleSignalReference= ruleSignalReference EOF ;
    public final EObject entryRuleSignalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2004:2: (iv_ruleSignalReference= ruleSignalReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2005:2: iv_ruleSignalReference= ruleSignalReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignalReference_in_entryRuleSignalReference3234);
            iv_ruleSignalReference=ruleSignalReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalReference3244); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2012:1: ruleSignalReference returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleSignalReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2017:6: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2019:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2019:1: ( ruleQualifiedName )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2020:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSignalReference3295);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2045:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2046:2: (iv_ruleVariableReference= ruleVariableReference EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2047:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableReferenceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableReference_in_entryRuleVariableReference3330);
            iv_ruleVariableReference=ruleVariableReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableReference3340); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2054:1: ruleVariableReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2059:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2060:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2060:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2061:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2061:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2062:3: RULE_ID
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableReference3386); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2085:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2086:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2087:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue3421);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue3431); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2094:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2099:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2100:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2100:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2101:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2101:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2102:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue3472); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2132:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2134:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue3512);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue3522); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2141:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2146:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2147:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2147:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2148:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2148:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2149:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatValue3563); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2179:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2180:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2181:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3603);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue3613); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2188:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2193:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2194:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2194:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2195:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2195:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2196:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3654); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2228:1: entryRuleValOperation returns [EObject current=null] : iv_ruleValOperation= ruleValOperation EOF ;
    public final EObject entryRuleValOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:2: (iv_ruleValOperation= ruleValOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2230:2: iv_ruleValOperation= ruleValOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValOperation_in_entryRuleValOperation3696);
            iv_ruleValOperation=ruleValOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValOperation3706); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2237:1: ruleValOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) ;
    public final EObject ruleValOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2242:6: ( ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2243:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2243:1: ( ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2243:2: ( (lv_operator_0_0= ruleValOperator ) ) ( (lv_subExpressions_1_0= ruleSignalReference ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2243:2: ( (lv_operator_0_0= ruleValOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2244:1: (lv_operator_0_0= ruleValOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2244:1: (lv_operator_0_0= ruleValOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2245:3: lv_operator_0_0= ruleValOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getOperatorValOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperator_in_ruleValOperation3752);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2267:2: ( (lv_subExpressions_1_0= ruleSignalReference ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2268:1: (lv_subExpressions_1_0= ruleSignalReference )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2268:1: (lv_subExpressions_1_0= ruleSignalReference )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2269:3: lv_subExpressions_1_0= ruleSignalReference
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValOperationAccess().getSubExpressionsSignalReferenceParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSignalReference_in_ruleValOperation3773);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2299:1: entryRuleValueExpression returns [EObject current=null] : iv_ruleValueExpression= ruleValueExpression EOF ;
    public final EObject entryRuleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2300:2: (iv_ruleValueExpression= ruleValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2301:2: iv_ruleValueExpression= ruleValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValueExpression_in_entryRuleValueExpression3809);
            iv_ruleValueExpression=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpression3819); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2308:1: ruleValueExpression returns [EObject current=null] : this_PlusOperation_0= rulePlusOperation ;
    public final EObject ruleValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOperation_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2313:6: (this_PlusOperation_0= rulePlusOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2315:2: this_PlusOperation_0= rulePlusOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getPlusOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePlusOperation_in_ruleValueExpression3868);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2334:1: entryRuleParanthesedValueExpression returns [EObject current=null] : iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF ;
    public final EObject entryRuleParanthesedValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2335:2: (iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:2: iv_ruleParanthesedValueExpression= ruleParanthesedValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression3902);
            iv_ruleParanthesedValueExpression=ruleParanthesedValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedValueExpression3912); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2343:1: ruleParanthesedValueExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) ;
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2348:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2349:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2349:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )
            int alt57=7;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2350:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression3962);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2363:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression3992);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2376:2: this_ValOperation_2= ruleValOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getValOperationParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression4022);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2389:2: this_VariableReference_3= ruleVariableReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getVariableReferenceParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression4052);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2402:2: this_HostCode_4= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getHostCodeParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleParanthesedValueExpression4082);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:6: ( '(' this_PlusOperation_6= rulePlusOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:8: '(' this_PlusOperation_6= rulePlusOperation ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleParanthesedValueExpression4098); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getPlusOperationParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression4123);
                    this_PlusOperation_6=rulePlusOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PlusOperation_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,43,FOLLOW_43_in_ruleParanthesedValueExpression4132); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getRightParenthesisKeyword_5_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2435:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2435:6: ( '(' this_DivOperation_9= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2435:8: '(' this_DivOperation_9= ruleDivOperation ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleParanthesedValueExpression4150); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedValueExpressionAccess().getLeftParenthesisKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedValueExpressionAccess().getDivOperationParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleParanthesedValueExpression4175);
                    this_DivOperation_9=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_9; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,43,FOLLOW_43_in_ruleParanthesedValueExpression4184); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2463:1: entryRulePlusOperation returns [EObject current=null] : iv_rulePlusOperation= rulePlusOperation EOF ;
    public final EObject entryRulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2464:2: (iv_rulePlusOperation= rulePlusOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2465:2: iv_rulePlusOperation= rulePlusOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPlusOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePlusOperation_in_entryRulePlusOperation4221);
            iv_rulePlusOperation=rulePlusOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePlusOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOperation4231); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2472:1: rulePlusOperation returns [EObject current=null] : (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) ;
    public final EObject rulePlusOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOrDivOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2477:6: ( (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2478:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2478:1: (this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2479:2: this_MultOrDivOperation_0= ruleMultOrDivOperation ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getMultOrDivOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4281);
            this_MultOrDivOperation_0=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultOrDivOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2490:1: ( () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==48||LA58_0==72) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2490:2: () ( (lv_operator_2_0= rulePlusOperator ) ) ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2490:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2491:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2509:2: ( (lv_operator_2_0= rulePlusOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2510:1: (lv_operator_2_0= rulePlusOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2510:1: (lv_operator_2_0= rulePlusOperator )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2511:3: lv_operator_2_0= rulePlusOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getOperatorPlusOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOperator_in_rulePlusOperation4314);
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2533:2: ( (lv_subExpressions_3_0= ruleMultOrDivOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2534:1: (lv_subExpressions_3_0= ruleMultOrDivOperation )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2535:3: lv_subExpressions_3_0= ruleMultOrDivOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPlusOperationAccess().getSubExpressionsMultOrDivOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4335);
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
            	    break loop58;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2565:1: entryRuleMultOrDivOperation returns [EObject current=null] : iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF ;
    public final EObject entryRuleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2566:2: (iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2567:2: iv_ruleMultOrDivOperation= ruleMultOrDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOrDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation4373);
            iv_ruleMultOrDivOperation=ruleMultOrDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOrDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOrDivOperation4383); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2574:1: ruleMultOrDivOperation returns [EObject current=null] : (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) ;
    public final EObject ruleMultOrDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_MultOperation_0 = null;

        EObject this_DivOperation_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2579:6: ( (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2580:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2580:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_ID && LA59_0<=RULE_INT)||LA59_0==RULE_FLOAT||LA59_0==62||LA59_0==69) ) {
                alt59=1;
            }
            else if ( (LA59_0==42) ) {
                int LA59_7 = input.LA(2);

                if ( (synpred71()) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2580:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 59, 7, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2580:1: (this_MultOperation_0= ruleMultOperation | ( '(' this_DivOperation_2= ruleDivOperation ')' ) )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2581:2: this_MultOperation_0= ruleMultOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getMultOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation4433);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2593:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2593:6: ( '(' this_DivOperation_2= ruleDivOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2593:8: '(' this_DivOperation_2= ruleDivOperation ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleMultOrDivOperation4449); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMultOrDivOperationAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getMultOrDivOperationAccess().getDivOperationParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation4474);
                    this_DivOperation_2=ruleDivOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivOperation_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,43,FOLLOW_43_in_ruleMultOrDivOperation4483); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2621:1: entryRuleMultOperation returns [EObject current=null] : iv_ruleMultOperation= ruleMultOperation EOF ;
    public final EObject entryRuleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2622:2: (iv_ruleMultOperation= ruleMultOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2623:2: iv_ruleMultOperation= ruleMultOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultOperation_in_entryRuleMultOperation4520);
            iv_ruleMultOperation=ruleMultOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultOperation4530); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2630:1: ruleMultOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) ;
    public final EObject ruleMultOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2635:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2636:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2636:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2637:2: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4580);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2648:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==49||LA60_0==73) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2648:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2648:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2649:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2667:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2668:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2668:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2669:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultOperator_in_ruleMultOperation4613);
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2691:2: ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2692:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2692:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2693:3: lv_subExpressions_3_0= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4634);
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
            	    break loop60;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2723:1: entryRuleDivOperation returns [EObject current=null] : iv_ruleDivOperation= ruleDivOperation EOF ;
    public final EObject entryRuleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2724:2: (iv_ruleDivOperation= ruleDivOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2725:2: iv_ruleDivOperation= ruleDivOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDivOperation_in_entryRuleDivOperation4672);
            iv_ruleDivOperation=ruleDivOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivOperation4682); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2732:1: ruleDivOperation returns [EObject current=null] : (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) ;
    public final EObject ruleDivOperation() throws RecognitionException {
        EObject current = null;

        EObject this_PreOrNormalValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2737:6: ( (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2738:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2738:1: (this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2739:2: this_PreOrNormalValueExpression_0= rulePreOrNormalValueExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getPreOrNormalValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4732);
            this_PreOrNormalValueExpression_0=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PreOrNormalValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2750:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==28) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2750:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2750:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2751:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2769:2: ( (lv_operator_2_0= ruleDivOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2770:1: (lv_operator_2_0= ruleDivOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2770:1: (lv_operator_2_0= ruleDivOperator )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2771:3: lv_operator_2_0= ruleDivOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDivOperator_in_ruleDivOperation4765);
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2793:2: ( (lv_subExpressions_3_0= rulePreOrNormalValueExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2794:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2794:1: (lv_subExpressions_3_0= rulePreOrNormalValueExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2795:3: lv_subExpressions_3_0= rulePreOrNormalValueExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDivOperationAccess().getSubExpressionsPreOrNormalValueExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4786);
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
            	    break loop61;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2825:1: entryRulePreArithmOperation returns [EObject current=null] : iv_rulePreArithmOperation= rulePreArithmOperation EOF ;
    public final EObject entryRulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreArithmOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2826:2: (iv_rulePreArithmOperation= rulePreArithmOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2827:2: iv_rulePreArithmOperation= rulePreArithmOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreArithmOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation4824);
            iv_rulePreArithmOperation=rulePreArithmOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreArithmOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreArithmOperation4834); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2834:1: rulePreArithmOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) ;
    public final EObject rulePreArithmOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2839:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2840:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2840:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2840:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleValOperation ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2840:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2841:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2841:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2842:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation4880);
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

            match(input,42,FOLLOW_42_in_rulePreArithmOperation4890); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPreArithmOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2868:1: ( (lv_subExpressions_2_0= ruleValOperation ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2869:1: (lv_subExpressions_2_0= ruleValOperation )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2869:1: (lv_subExpressions_2_0= ruleValOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2870:3: lv_subExpressions_2_0= ruleValOperation
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPreArithmOperationAccess().getSubExpressionsValOperationParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValOperation_in_rulePreArithmOperation4911);
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

            match(input,43,FOLLOW_43_in_rulePreArithmOperation4921); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2904:1: entryRulePreOrNormalValueExpression returns [EObject current=null] : iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF ;
    public final EObject entryRulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreOrNormalValueExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2905:2: (iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2906:2: iv_rulePreOrNormalValueExpression= rulePreOrNormalValueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPreOrNormalValueExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression4957);
            iv_rulePreOrNormalValueExpression=rulePreOrNormalValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePreOrNormalValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePreOrNormalValueExpression4967); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2913:1: rulePreOrNormalValueExpression returns [EObject current=null] : (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) ;
    public final EObject rulePreOrNormalValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PreArithmOperation_0 = null;

        EObject this_ParanthesedValueExpression_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2918:6: ( (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2919:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2919:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==69) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_INT)||LA62_0==RULE_FLOAT||LA62_0==42||LA62_0==62) ) {
                alt62=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2919:1: (this_PreArithmOperation_0= rulePreArithmOperation | this_ParanthesedValueExpression_1= ruleParanthesedValueExpression )", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2920:2: this_PreArithmOperation_0= rulePreArithmOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getPreArithmOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression5017);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2933:2: this_ParanthesedValueExpression_1= ruleParanthesedValueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPreOrNormalValueExpressionAccess().getParanthesedValueExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression5047);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2952:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2953:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2954:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5082);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperation5092); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2961:1: ruleCompareOperation returns [EObject current=null] : (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2966:6: ( (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2967:1: (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2967:1: (this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2968:2: this_ValueExpression_0= ruleValueExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getValueExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation5142);
            this_ValueExpression_0=ruleValueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ValueExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2979:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2979:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleValueExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2979:2: ()
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2980:2: 
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2998:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2999:1: (lv_operator_2_0= ruleCompareOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2999:1: (lv_operator_2_0= ruleCompareOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3000:3: lv_operator_2_0= ruleCompareOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperator_in_ruleCompareOperation5175);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3022:2: ( (lv_subExpressions_3_0= ruleValueExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3023:1: (lv_subExpressions_3_0= ruleValueExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3023:1: (lv_subExpressions_3_0= ruleValueExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3024:3: lv_subExpressions_3_0= ruleValueExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsValueExpressionParserRuleCall_1_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpression_in_ruleCompareOperation5196);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3054:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3055:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3056:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation5233);
            iv_ruleUnaryOperation=ruleUnaryOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOperation5243); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3063:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3068:6: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3069:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3069:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3069:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3069:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3070:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3070:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3071:3: lv_operator_0_0= ruleUnaryOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation5289);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3093:2: ( (lv_subExpressions_1_0= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3094:1: (lv_subExpressions_1_0= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3094:1: (lv_subExpressions_1_0= ruleParanthesedBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3095:3: lv_subExpressions_1_0= ruleParanthesedBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryOperationAccess().getSubExpressionsParanthesedBooleanExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation5310);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3125:1: entryRuleUnaryParanthesedOperation returns [EObject current=null] : iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF ;
    public final EObject entryRuleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryParanthesedOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3126:2: (iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3127:2: iv_ruleUnaryParanthesedOperation= ruleUnaryParanthesedOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryParanthesedOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation5346);
            iv_ruleUnaryParanthesedOperation=ruleUnaryParanthesedOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryParanthesedOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation5356); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3134:1: ruleUnaryParanthesedOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) ;
    public final EObject ruleUnaryParanthesedOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_subExpressions_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3139:6: ( ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3140:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3140:1: ( ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3140:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) ) '(' ( (lv_subExpressions_2_0= ruleBooleanExpression ) ) ')'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3140:2: ( (lv_operator_0_0= ruleUnaryParanthesedOperator ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3141:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3141:1: (lv_operator_0_0= ruleUnaryParanthesedOperator )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3142:3: lv_operator_0_0= ruleUnaryParanthesedOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getOperatorUnaryParanthesedOperatorEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation5402);
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

            match(input,42,FOLLOW_42_in_ruleUnaryParanthesedOperation5412); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnaryParanthesedOperationAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3168:1: ( (lv_subExpressions_2_0= ruleBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3169:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3169:1: (lv_subExpressions_2_0= ruleBooleanExpression )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3170:3: lv_subExpressions_2_0= ruleBooleanExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUnaryParanthesedOperationAccess().getSubExpressionsBooleanExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation5433);
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

            match(input,43,FOLLOW_43_in_ruleUnaryParanthesedOperation5443); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:1: entryRuleUnaryOrNormalExpression returns [EObject current=null] : iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF ;
    public final EObject entryRuleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOrNormalExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3205:2: (iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3206:2: iv_ruleUnaryOrNormalExpression= ruleUnaryOrNormalExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryOrNormalExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression5479);
            iv_ruleUnaryOrNormalExpression=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryOrNormalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression5489); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3213:1: ruleUnaryOrNormalExpression returns [EObject current=null] : (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) ;
    public final EObject ruleUnaryOrNormalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOperation_0 = null;

        EObject this_UnaryParanthesedOperation_1 = null;

        EObject this_ParanthesedBooleanExpression_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3218:6: ( (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3219:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3219:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )
            int alt63=3;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3220:2: this_UnaryOperation_0= ruleUnaryOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryOperationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression5539);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3233:2: this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getUnaryParanthesedOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression5569);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3246:2: this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryOrNormalExpressionAccess().getParanthesedBooleanExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression5599);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3265:1: entryRuleAndOperation returns [EObject current=null] : iv_ruleAndOperation= ruleAndOperation EOF ;
    public final EObject entryRuleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3266:2: (iv_ruleAndOperation= ruleAndOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3267:2: iv_ruleAndOperation= ruleAndOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAndOperation_in_entryRuleAndOperation5634);
            iv_ruleAndOperation=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperation5644); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3274:1: ruleAndOperation returns [EObject current=null] : (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) ;
    public final EObject ruleAndOperation() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryOrNormalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3279:6: ( (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3280:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3280:1: (this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3281:2: this_UnaryOrNormalExpression_0= ruleUnaryOrNormalExpression ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getUnaryOrNormalExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5694);
            this_UnaryOrNormalExpression_0=ruleUnaryOrNormalExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_UnaryOrNormalExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3292:1: ( () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==71) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3292:2: () ( (lv_operator_2_0= ruleOperatorAnd ) ) ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3292:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3293:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3311:2: ( (lv_operator_2_0= ruleOperatorAnd ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3312:1: (lv_operator_2_0= ruleOperatorAnd )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3312:1: (lv_operator_2_0= ruleOperatorAnd )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3313:3: lv_operator_2_0= ruleOperatorAnd
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getOperatorOperatorAndEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorAnd_in_ruleAndOperation5727);
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3335:2: ( (lv_subExpressions_3_0= ruleUnaryOrNormalExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3336:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3336:1: (lv_subExpressions_3_0= ruleUnaryOrNormalExpression )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3337:3: lv_subExpressions_3_0= ruleUnaryOrNormalExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndOperationAccess().getSubExpressionsUnaryOrNormalExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5748);
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
            	    break loop64;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3367:1: entryRuleOrOperation returns [EObject current=null] : iv_ruleOrOperation= ruleOrOperation EOF ;
    public final EObject entryRuleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3368:2: (iv_ruleOrOperation= ruleOrOperation EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3369:2: iv_ruleOrOperation= ruleOrOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOrOperation_in_entryRuleOrOperation5786);
            iv_ruleOrOperation=ruleOrOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperation5796); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3376:1: ruleOrOperation returns [EObject current=null] : (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) ;
    public final EObject ruleOrOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AndOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3381:6: ( (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3382:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3382:1: (this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3383:2: this_AndOperation_0= ruleAndOperation ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getAndOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation5846);
            this_AndOperation_0=ruleAndOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3394:1: ( () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==70) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3394:2: () ( (lv_operator_2_0= ruleOperatorOr ) ) ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3394:2: ()
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3395:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3413:2: ( (lv_operator_2_0= ruleOperatorOr ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3414:1: (lv_operator_2_0= ruleOperatorOr )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3414:1: (lv_operator_2_0= ruleOperatorOr )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3415:3: lv_operator_2_0= ruleOperatorOr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getOperatorOperatorOrEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperatorOr_in_ruleOrOperation5879);
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

            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3437:2: ( (lv_subExpressions_3_0= ruleAndOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3438:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3438:1: (lv_subExpressions_3_0= ruleAndOperation )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3439:3: lv_subExpressions_3_0= ruleAndOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrOperationAccess().getSubExpressionsAndOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperation_in_ruleOrOperation5900);
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
            	    break loop65;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3469:1: entryRuleParanthesedBooleanExpression returns [EObject current=null] : iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF ;
    public final EObject entryRuleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParanthesedBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3470:2: (iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3471:2: iv_ruleParanthesedBooleanExpression= ruleParanthesedBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParanthesedBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression5938);
            iv_ruleParanthesedBooleanExpression=ruleParanthesedBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleParanthesedBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression5948); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3478:1: ruleParanthesedBooleanExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) ) ;
    public final EObject ruleParanthesedBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_CompareOperation_1 = null;

        EObject this_SignalReference_2 = null;

        EObject this_HostCode_3 = null;

        EObject this_OrOperation_5 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3483:6: ( (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3484:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3484:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )
            int alt66=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt66=1;
                }
                break;
            case RULE_INT:
            case RULE_FLOAT:
            case 62:
            case 69:
                {
                alt66=2;
                }
                break;
            case RULE_ID:
                {
                int LA66_6 = input.LA(2);

                if ( (synpred80()) ) {
                    alt66=2;
                }
                else if ( (synpred81()) ) {
                    alt66=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3484:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 66, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA66_7 = input.LA(2);

                if ( (synpred80()) ) {
                    alt66=2;
                }
                else if ( (synpred82()) ) {
                    alt66=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3484:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 66, 7, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                int LA66_8 = input.LA(2);

                if ( (synpred80()) ) {
                    alt66=2;
                }
                else if ( (true) ) {
                    alt66=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3484:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 66, 8, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3484:1: (this_BooleanValue_0= ruleBooleanValue | this_CompareOperation_1= ruleCompareOperation | this_SignalReference_2= ruleSignalReference | this_HostCode_3= ruleHostCode | ( '(' this_OrOperation_5= ruleOrOperation ')' ) )", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3485:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression5998);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3498:2: this_CompareOperation_1= ruleCompareOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getCompareOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression6028);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3511:2: this_SignalReference_2= ruleSignalReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getSignalReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression6058);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3524:2: this_HostCode_3= ruleHostCode
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getHostCodeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostCode_in_ruleParanthesedBooleanExpression6088);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3536:6: ( '(' this_OrOperation_5= ruleOrOperation ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3536:6: ( '(' this_OrOperation_5= ruleOrOperation ')' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3536:8: '(' this_OrOperation_5= ruleOrOperation ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleParanthesedBooleanExpression6104); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getParanthesedBooleanExpressionAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getParanthesedBooleanExpressionAccess().getOrOperationParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression6129);
                    this_OrOperation_5=ruleOrOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_OrOperation_5; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,43,FOLLOW_43_in_ruleParanthesedBooleanExpression6138); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3564:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3565:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3566:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6175);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression6185); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3573:1: ruleBooleanExpression returns [EObject current=null] : this_OrOperation_0= ruleOrOperation ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrOperation_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3578:6: (this_OrOperation_0= ruleOrOperation )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3580:2: this_OrOperation_0= ruleOrOperation
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrOperationParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleOrOperation_in_ruleBooleanExpression6234);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3599:1: entryRuleHostCode returns [EObject current=null] : iv_ruleHostCode= ruleHostCode EOF ;
    public final EObject entryRuleHostCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3600:2: (iv_ruleHostCode= ruleHostCode EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3601:2: iv_ruleHostCode= ruleHostCode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHostCodeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHostCode_in_entryRuleHostCode6268);
            iv_ruleHostCode=ruleHostCode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHostCode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostCode6278); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3608:1: ruleHostCode returns [EObject current=null] : ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleHostCode() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3613:6: ( ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3614:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3614:1: ( ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3614:2: ( (lv_code_0_0= RULE_STRING ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3614:2: ( (lv_code_0_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3615:1: (lv_code_0_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3615:1: (lv_code_0_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3616:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHostCode6320); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3638:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==42) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3638:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,42,FOLLOW_42_in_ruleHostCode6336); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getHostCodeAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3642:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3643:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3643:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3644:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHostCode6353); if (failed) return current;
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

                    match(input,43,FOLLOW_43_in_ruleHostCode6368); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3678:1: ruleStateType returns [Enumerator current=null] : ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3682:6: ( ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3683:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3683:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt68=1;
                }
                break;
            case 32:
                {
                alt68=2;
                }
                break;
            case 45:
                {
                alt68=3;
                }
                break;
            case 46:
                {
                alt68=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3683:1: ( ( 'NORMAL' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3683:2: ( 'NORMAL' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3683:2: ( 'NORMAL' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3683:4: 'NORMAL'
                    {
                    match(input,44,FOLLOW_44_in_ruleStateType6418); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3689:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3689:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3689:8: 'cond'
                    {
                    match(input,32,FOLLOW_32_in_ruleStateType6433); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3695:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3695:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3695:8: 'ref'
                    {
                    match(input,45,FOLLOW_45_in_ruleStateType6448); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3701:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3701:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3701:8: 'textual'
                    {
                    match(input,46,FOLLOW_46_in_ruleStateType6463); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3711:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3715:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3716:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3716:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            int alt69=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt69=1;
                }
                break;
            case 48:
                {
                alt69=2;
                }
                break;
            case 49:
                {
                alt69=3;
                }
                break;
            case 50:
                {
                alt69=4;
                }
                break;
            case 51:
                {
                alt69=5;
                }
                break;
            case 52:
                {
                alt69=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3716:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3716:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3716:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3716:4: 'NONE'
                    {
                    match(input,47,FOLLOW_47_in_ruleCombineOperator6506); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3722:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3722:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3722:8: '+'
                    {
                    match(input,48,FOLLOW_48_in_ruleCombineOperator6521); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3728:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3728:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3728:8: '*'
                    {
                    match(input,49,FOLLOW_49_in_ruleCombineOperator6536); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3734:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3734:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3734:8: 'AND'
                    {
                    match(input,50,FOLLOW_50_in_ruleCombineOperator6551); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3740:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3740:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3740:8: 'OR'
                    {
                    match(input,51,FOLLOW_51_in_ruleCombineOperator6566); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3746:6: ( 'hostCombineOperator' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3746:6: ( 'hostCombineOperator' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3746:8: 'hostCombineOperator'
                    {
                    match(input,52,FOLLOW_52_in_ruleCombineOperator6581); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3756:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3760:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3761:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3761:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            int alt70=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt70=1;
                }
                break;
            case 54:
                {
                alt70=2;
                }
                break;
            case 55:
                {
                alt70=3;
                }
                break;
            case 56:
                {
                alt70=4;
                }
                break;
            case 57:
                {
                alt70=5;
                }
                break;
            case 58:
                {
                alt70=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3761:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3761:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3761:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3761:4: 'PURE'
                    {
                    match(input,53,FOLLOW_53_in_ruleValueType6624); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3767:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3767:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3767:8: 'boolean'
                    {
                    match(input,54,FOLLOW_54_in_ruleValueType6639); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3773:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3773:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3773:8: 'unsigned'
                    {
                    match(input,55,FOLLOW_55_in_ruleValueType6654); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3779:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3779:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3779:8: 'integer'
                    {
                    match(input,56,FOLLOW_56_in_ruleValueType6669); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3785:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3785:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3785:8: 'float'
                    {
                    match(input,57,FOLLOW_57_in_ruleValueType6684); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3791:6: ( 'hostType' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3791:6: ( 'hostType' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3791:8: 'hostType'
                    {
                    match(input,58,FOLLOW_58_in_ruleValueType6699); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3801:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3805:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3806:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3806:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt71=1;
                }
                break;
            case 60:
                {
                alt71=2;
                }
                break;
            case 61:
                {
                alt71=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3806:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3806:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3806:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3806:4: '-->'
                    {
                    match(input,59,FOLLOW_59_in_ruleTransitionType6742); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3812:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3812:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3812:8: 'o->'
                    {
                    match(input,60,FOLLOW_60_in_ruleTransitionType6757); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3818:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3818:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3818:8: '>->'
                    {
                    match(input,61,FOLLOW_61_in_ruleTransitionType6772); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3830:1: ruleValOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3834:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3835:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3835:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3835:3: '?'
            {
            match(input,62,FOLLOW_62_in_ruleValOperator6816); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3845:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3849:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3850:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3850:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt72=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt72=1;
                }
                break;
            case 64:
                {
                alt72=2;
                }
                break;
            case 65:
                {
                alt72=3;
                }
                break;
            case 66:
                {
                alt72=4;
                }
                break;
            case 67:
                {
                alt72=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3850:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3850:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3850:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3850:4: '='
                    {
                    match(input,63,FOLLOW_63_in_ruleCompareOperator6858); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3856:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3856:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3856:8: '<'
                    {
                    match(input,64,FOLLOW_64_in_ruleCompareOperator6873); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3862:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3862:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3862:8: '<='
                    {
                    match(input,65,FOLLOW_65_in_ruleCompareOperator6888); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3868:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3868:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3868:8: '>'
                    {
                    match(input,66,FOLLOW_66_in_ruleCompareOperator6903); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3874:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3874:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3874:8: '>='
                    {
                    match(input,67,FOLLOW_67_in_ruleCompareOperator6918); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3884:1: ruleUnaryOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3888:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3889:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3889:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3889:3: 'not'
            {
            match(input,68,FOLLOW_68_in_ruleUnaryOperator6960); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3899:1: ruleUnaryParanthesedOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator ruleUnaryParanthesedOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3903:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3904:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3904:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3904:3: 'pre'
            {
            match(input,69,FOLLOW_69_in_ruleUnaryParanthesedOperator7001); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3914:1: ruleOperatorOr returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3918:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3919:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3919:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3919:3: 'or'
            {
            match(input,70,FOLLOW_70_in_ruleOperatorOr7042); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3929:1: ruleOperatorAnd returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3933:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3934:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3934:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3934:3: 'and'
            {
            match(input,71,FOLLOW_71_in_ruleOperatorAnd7083); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3946:1: rulePlusOperator returns [Enumerator current=null] : ( ( '+' ) | ( '-' ) ) ;
    public final Enumerator rulePlusOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3950:6: ( ( ( '+' ) | ( '-' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3951:1: ( ( '+' ) | ( '-' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3951:1: ( ( '+' ) | ( '-' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==48) ) {
                alt73=1;
            }
            else if ( (LA73_0==72) ) {
                alt73=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3951:1: ( ( '+' ) | ( '-' ) )", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3951:2: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3951:2: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3951:4: '+'
                    {
                    match(input,48,FOLLOW_48_in_rulePlusOperator7127); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getPlusOperatorAccess().getADDEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3957:6: ( '-' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3957:6: ( '-' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3957:8: '-'
                    {
                    match(input,72,FOLLOW_72_in_rulePlusOperator7142); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3967:1: ruleMultOperator returns [Enumerator current=null] : ( ( '*' ) | ( 'mod' ) ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3971:6: ( ( ( '*' ) | ( 'mod' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3972:1: ( ( '*' ) | ( 'mod' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3972:1: ( ( '*' ) | ( 'mod' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==49) ) {
                alt74=1;
            }
            else if ( (LA74_0==73) ) {
                alt74=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3972:1: ( ( '*' ) | ( 'mod' ) )", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3972:2: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3972:2: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3972:4: '*'
                    {
                    match(input,49,FOLLOW_49_in_ruleMultOperator7185); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3978:6: ( 'mod' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3978:6: ( 'mod' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3978:8: 'mod'
                    {
                    match(input,73,FOLLOW_73_in_ruleMultOperator7200); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3988:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3992:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3993:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3993:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3993:3: '/'
            {
            match(input,28,FOLLOW_28_in_ruleDivOperator7242); if (failed) return current;
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

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( ( 'region' ( ( RULE_ID ) ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( 'region' ( ( RULE_ID ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:3: ( 'region' ( ( RULE_ID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:108:5: 'region' ( ( RULE_ID ) )
        {
        match(input,13,FOLLOW_13_in_synpred1140); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:1: ( ( RULE_ID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:113:1: ( RULE_ID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:114:3: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1157); if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: ( 'region' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:7: 'region'
        {
        match(input,13,FOLLOW_13_in_synpred2179); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:346:1: ( ( RULE_STRING ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:346:1: ( RULE_STRING )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:346:1: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:347:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred10474); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:592:3: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:592:3: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_14_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred19762);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1681:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1681:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1681:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred552651);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred57
    public final void synpred57_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1708:2: ( ( ( ruleEffect ) ) ( ',' )? )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1708:2: ( ( ruleEffect ) ) ( ',' )?
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1708:2: ( ( ruleEffect ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1709:1: ( ruleEffect )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1709:1: ( ruleEffect )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1710:3: ruleEffect
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEffect_in_synpred572685);
        ruleEffect();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1732:2: ( ',' )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( (LA99_0==29) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1732:4: ','
                {
                match(input,29,FOLLOW_29_in_synpred572696); if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred57

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:3: ( ( '(' ( ( ruleValueExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:3: ( '(' ( ( ruleValueExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:3: ( '(' ( ( ruleValueExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:5: '(' ( ( ruleValueExpression ) ) ')'
        {
        match(input,42,FOLLOW_42_in_synpred612962); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1841:1: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1843:3: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueValueExpressionParserRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred612983);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,43,FOLLOW_43_in_synpred612993); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:6: ( ( '(' ( ( ruleBooleanExpression ) ) ')' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:6: ( '(' ( ( ruleBooleanExpression ) ) ')' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1870:8: '(' ( ( ruleBooleanExpression ) ) ')'
        {
        match(input,42,FOLLOW_42_in_synpred623011); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1874:1: ( ( ruleBooleanExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1875:1: ( ruleBooleanExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1875:1: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1876:3: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueBooleanExpressionParserRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleBooleanExpression_in_synpred623032);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,43,FOLLOW_43_in_synpred623042); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred63
    public final void synpred63_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1946:2: ( ( ( ruleValueExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1946:2: ( ( ruleValueExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1946:2: ( ( ruleValueExpression ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1947:1: ( ruleValueExpression )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1947:1: ( ruleValueExpression )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1948:3: ruleValueExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionValueExpressionParserRuleCall_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleValueExpression_in_synpred633170);
        ruleValueExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred63

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:6: ( ( '(' rulePlusOperation ')' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:6: ( '(' rulePlusOperation ')' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:6: ( '(' rulePlusOperation ')' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2414:8: '(' rulePlusOperation ')'
        {
        match(input,42,FOLLOW_42_in_synpred694098); if (failed) return ;
        pushFollow(FOLLOW_rulePlusOperation_in_synpred694123);
        rulePlusOperation();
        _fsp--;
        if (failed) return ;
        match(input,43,FOLLOW_43_in_synpred694132); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred69

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2581:2: ( ruleMultOperation )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2581:2: ruleMultOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleMultOperation_in_synpred714433);
        ruleMultOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred71

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3498:2: ( ruleCompareOperation )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3498:2: ruleCompareOperation
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompareOperation_in_synpred806028);
        ruleCompareOperation();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred81
    public final void synpred81_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3511:2: ( ruleSignalReference )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3511:2: ruleSignalReference
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSignalReference_in_synpred816058);
        ruleSignalReference();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred81

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3524:2: ( ruleHostCode )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3524:2: ruleHostCode
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostCode_in_synpred826088);
        ruleHostCode();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred82

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
    public final boolean synpred71() {
        backtracking++;
        int start = input.mark();
        try {
            synpred71_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred80() {
        backtracking++;
        int start = input.mark();
        try {
            synpred80_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred81() {
        backtracking++;
        int start = input.mark();
        try {
            synpred81_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
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
    public final boolean synpred57() {
        backtracking++;
        int start = input.mark();
        try {
            synpred57_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred63() {
        backtracking++;
        int start = input.mark();
        try {
            synpred63_fragment(); // can never throw exception
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


    protected DFA57 dfa57 = new DFA57(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA57_eotS =
        "\33\uffff";
    static final String DFA57_eofS =
        "\33\uffff";
    static final String DFA57_minS =
        "\1\4\5\uffff\1\4\1\52\2\34\1\4\2\34\1\0\1\76\1\uffff\1\0\1\uffff"+
        "\1\34\3\4\1\53\1\51\1\34\1\4\1\34";
    static final String DFA57_maxS =
        "\1\76\5\uffff\1\105\1\52\2\111\1\4\2\111\1\0\1\76\1\uffff\1\0\1"+
        "\uffff\1\111\3\4\2\53\1\111\1\4\1\111";
    static final String DFA57_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\11\uffff\1\7\1\uffff\1\6\11\uffff";
    static final String DFA57_specialS =
        "\15\uffff\1\0\2\uffff\1\1\12\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\4\1\5\1\1\1\uffff\1\2\41\uffff\1\6\23\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14\1\10\1\uffff\1\11\41\uffff\1\15\23\uffff\1\12\6\uffff"+
            "\1\7",
            "\1\16",
            "\1\17\16\uffff\1\20\4\uffff\2\21\26\uffff\2\21",
            "\1\17\16\uffff\1\20\4\uffff\2\21\26\uffff\2\21",
            "\1\22",
            "\1\17\16\uffff\1\20\4\uffff\2\21\26\uffff\2\21",
            "\1\17\15\uffff\1\23\1\20\4\uffff\2\21\26\uffff\2\21",
            "\1\uffff",
            "\1\24",
            "",
            "\1\uffff",
            "",
            "\1\17\14\uffff\1\25\1\uffff\1\20\4\uffff\2\21\26\uffff\2\21",
            "\1\26",
            "\1\27",
            "\1\22",
            "\1\30",
            "\1\31\1\uffff\1\32",
            "\1\17\16\uffff\1\20\4\uffff\2\21\26\uffff\2\21",
            "\1\27",
            "\1\17\16\uffff\1\20\4\uffff\2\21\26\uffff\2\21"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "2349:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_ValOperation_2= ruleValOperation | this_VariableReference_3= ruleVariableReference | this_HostCode_4= ruleHostCode | ( '(' this_PlusOperation_6= rulePlusOperation ')' ) | ( '(' this_DivOperation_9= ruleDivOperation ')' ) )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_13 = input.LA(1);

                         
                        int index57_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_13);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_16 = input.LA(1);

                         
                        int index57_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69()) ) {s = 17;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index57_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA63_eotS =
        "\11\uffff";
    static final String DFA63_eofS =
        "\11\uffff";
    static final String DFA63_minS =
        "\1\4\1\uffff\1\52\1\uffff\2\4\1\uffff\1\51\1\4";
    static final String DFA63_maxS =
        "\1\105\1\uffff\1\52\1\uffff\1\105\1\4\1\uffff\1\111\1\4";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\2\uffff";
    static final String DFA63_specialS =
        "\11\uffff}>";
    static final String[] DFA63_transitionS = {
            "\5\3\41\uffff\1\3\23\uffff\1\3\5\uffff\1\1\1\2",
            "",
            "\1\4",
            "",
            "\5\6\41\uffff\1\6\23\uffff\1\5\5\uffff\2\6",
            "\1\7",
            "",
            "\1\10\1\uffff\1\3\4\uffff\2\6\15\uffff\5\6\4\uffff\2\6",
            "\1\7"
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "3219:1: (this_UnaryOperation_0= ruleUnaryOperation | this_UnaryParanthesedOperation_1= ruleUnaryParanthesedOperation | this_ParanthesedBooleanExpression_2= ruleParanthesedBooleanExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRegion140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegion157 = new BitSet(new long[]{0x000070E50001C010L});
    public static final BitSet FOLLOW_13_in_ruleRegion179 = new BitSet(new long[]{0x000070E50001C010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion203 = new BitSet(new long[]{0x000070E50001C010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion230 = new BitSet(new long[]{0x000070E50001C010L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion253 = new BitSet(new long[]{0x000070010001C012L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleState355 = new BitSet(new long[]{0x0000700100018010L});
    public static final BitSet FOLLOW_15_in_ruleState387 = new BitSet(new long[]{0x0000700100010010L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState422 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleState434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState457 = new BitSet(new long[]{0x380000E0003E0032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState474 = new BitSet(new long[]{0x380000E0003E0032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState497 = new BitSet(new long[]{0x380000E0003E0012L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState524 = new BitSet(new long[]{0x380000E0003E0012L});
    public static final BitSet FOLLOW_17_in_ruleState536 = new BitSet(new long[]{0x78000400143E01F2L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState557 = new BitSet(new long[]{0x38000000003E0002L});
    public static final BitSet FOLLOW_18_in_ruleState570 = new BitSet(new long[]{0x78000400143C01F2L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState591 = new BitSet(new long[]{0x38000000003C0002L});
    public static final BitSet FOLLOW_19_in_ruleState604 = new BitSet(new long[]{0x78000400143801F2L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState625 = new BitSet(new long[]{0x3800000000380002L});
    public static final BitSet FOLLOW_20_in_ruleState638 = new BitSet(new long[]{0x78000400142001F2L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState659 = new BitSet(new long[]{0x3800000000200002L});
    public static final BitSet FOLLOW_21_in_ruleState672 = new BitSet(new long[]{0x000070E50001E010L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState693 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleState704 = new BitSet(new long[]{0x000070E50001E010L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState725 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleState737 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState762 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_ruleTextualTransition_in_ruleState781 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_entryRuleFullStateID824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullStateID835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID876 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFullStateID894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition1012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition1039 = new BitSet(new long[]{0x00000000C2000000L});
    public static final BitSet FOLLOW_25_in_ruleTransition1050 = new BitSet(new long[]{0x40000400DC0001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_26_in_ruleTransition1068 = new BitSet(new long[]{0x40000400D80001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_27_in_ruleTransition1093 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition1110 = new BitSet(new long[]{0x40000400D00001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTransition1139 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_28_in_ruleTransition1151 = new BitSet(new long[]{0x00000000C0000030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTransition1173 = new BitSet(new long[]{0x00000000E0000030L});
    public static final BitSet FOLLOW_29_in_ruleTransition1184 = new BitSet(new long[]{0x00000000C0000030L});
    public static final BitSet FOLLOW_30_in_ruleTransition1211 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransition1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextualTransition_in_entryRuleTextualTransition1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextualTransition1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTextualTransition1327 = new BitSet(new long[]{0x0000000300008010L});
    public static final BitSet FOLLOW_32_in_ruleTextualTransition1347 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_33_in_ruleTextualTransition1376 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleTextualTransition1411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTextualTransition1446 = new BitSet(new long[]{0x00000000C2000000L});
    public static final BitSet FOLLOW_25_in_ruleTextualTransition1457 = new BitSet(new long[]{0x40000400DC0001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_26_in_ruleTextualTransition1475 = new BitSet(new long[]{0x40000400D80001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_27_in_ruleTextualTransition1500 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextualTransition1517 = new BitSet(new long[]{0x40000400D00001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTextualTransition1546 = new BitSet(new long[]{0x00000000D0000000L});
    public static final BitSet FOLLOW_28_in_ruleTextualTransition1558 = new BitSet(new long[]{0x00000000C0000030L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleTextualTransition1580 = new BitSet(new long[]{0x00000000E0000030L});
    public static final BitSet FOLLOW_29_in_ruleTextualTransition1591 = new BitSet(new long[]{0x00000000C0000030L});
    public static final BitSet FOLLOW_30_in_ruleTextualTransition1618 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTextualTransition1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleVariable1727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1744 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleVariable1761 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariableSignalValue_in_ruleVariable1782 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVariable1794 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable1815 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleVariable1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSignal1917 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_38_in_ruleSignal1949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_39_in_ruleSignal1980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSignal2002 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_35_in_ruleSignal2014 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleVariableSignalValue_in_ruleSignal2035 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_ruleSignal2048 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2069 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_40_in_ruleSignal2087 = new BitSet(new long[]{0x07E0000000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2108 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal2118 = new BitSet(new long[]{0x001F800000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2140 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2163 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSignal2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableSignalValue_in_entryRuleVariableSignalValue2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableSignalValue2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariableSignalValue2271 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableSignalValue2297 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleVariableSignalValue2323 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableSignalValue2349 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2448 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedName2466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAction2593 = new BitSet(new long[]{0x40000400100001F2L,0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction2624 = new BitSet(new long[]{0x40000400100001F2L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction2651 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAction2663 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_ruleAction2685 = new BitSet(new long[]{0x0000000020000032L});
    public static final BitSet FOLLOW_29_in_ruleAction2696 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEffect2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleEffect2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission2893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmission2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmission2950 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleEmission2962 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleEmission2983 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEmission2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEmission3011 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleEmission3032 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEmission3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3138 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAssignment3148 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleAssignment3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAssignment3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_entryRuleSignalReference3234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalReference3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSignalReference3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_entryRuleVariableReference3330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableReference3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableReference3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue3421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue3512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue3603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_entryRuleValOperation3696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValOperation3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperator_in_ruleValOperation3752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleValOperation3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_entryRuleValueExpression3809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpression3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleValueExpression3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_entryRuleParanthesedValueExpression3902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedValueExpression3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleParanthesedValueExpression3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_ruleParanthesedValueExpression3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValOperation_in_ruleParanthesedValueExpression4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableReference_in_ruleParanthesedValueExpression4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleParanthesedValueExpression4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleParanthesedValueExpression4098 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulePlusOperation_in_ruleParanthesedValueExpression4123 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleParanthesedValueExpression4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleParanthesedValueExpression4150 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleParanthesedValueExpression4175 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleParanthesedValueExpression4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOperation_in_entryRulePlusOperation4221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOperation4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4281 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_rulePlusOperator_in_rulePlusOperation4314 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_rulePlusOperation4335 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleMultOrDivOperation_in_entryRuleMultOrDivOperation4373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOrDivOperation4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_ruleMultOrDivOperation4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMultOrDivOperation4449 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDivOperation_in_ruleMultOrDivOperation4474 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMultOrDivOperation4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_entryRuleMultOperation4520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultOperation4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4580 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultOperation4613 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleMultOperation4634 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDivOperation_in_entryRuleDivOperation4672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivOperation4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4732 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivOperation4765 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_ruleDivOperation4786 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_entryRulePreArithmOperation4824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreArithmOperation4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_rulePreArithmOperation4880 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulePreArithmOperation4890 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleValOperation_in_rulePreArithmOperation4911 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rulePreArithmOperation4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreOrNormalValueExpression_in_entryRulePreOrNormalValueExpression4957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreOrNormalValueExpression4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreArithmOperation_in_rulePreOrNormalValueExpression5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedValueExpression_in_rulePreOrNormalValueExpression5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation5142 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation5175 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueExpression_in_ruleCompareOperation5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation5233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation5289 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOperation5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_entryRuleUnaryParanthesedOperation5346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryParanthesedOperation5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperator_in_ruleUnaryParanthesedOperation5402 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleUnaryParanthesedOperation5412 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleUnaryParanthesedOperation5433 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleUnaryParanthesedOperation5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_entryRuleUnaryOrNormalExpression5479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOrNormalExpression5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleUnaryOrNormalExpression5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryParanthesedOperation_in_ruleUnaryOrNormalExpression5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_ruleUnaryOrNormalExpression5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_entryRuleAndOperation5634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperation5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleOperatorAnd_in_ruleAndOperation5727 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleUnaryOrNormalExpression_in_ruleAndOperation5748 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleOrOperation_in_entryRuleOrOperation5786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperation5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation5846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOperatorOr_in_ruleOrOperation5879 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAndOperation_in_ruleOrOperation5900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleParanthesedBooleanExpression_in_entryRuleParanthesedBooleanExpression5938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParanthesedBooleanExpression5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleParanthesedBooleanExpression5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_ruleParanthesedBooleanExpression6028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_ruleParanthesedBooleanExpression6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_ruleParanthesedBooleanExpression6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleParanthesedBooleanExpression6104 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleParanthesedBooleanExpression6129 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleParanthesedBooleanExpression6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperation_in_ruleBooleanExpression6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_entryRuleHostCode6268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostCode6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHostCode6320 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleHostCode6336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHostCode6353 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleHostCode6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStateType6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStateType6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleStateType6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStateType6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCombineOperator6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCombineOperator6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCombineOperator6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCombineOperator6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCombineOperator6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCombineOperator6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleValueType6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleValueType6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleValueType6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleValueType6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValueType6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValueType6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTransitionType6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTransitionType6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTransitionType6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleValOperator6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCompareOperator6858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCompareOperator6873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCompareOperator6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCompareOperator6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCompareOperator6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleUnaryOperator6960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleUnaryParanthesedOperator7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperatorOr7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOperatorAnd7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePlusOperator7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rulePlusOperator7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMultOperator7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleMultOperator7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDivOperator7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred10474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred19762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred552651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEffect_in_synpred572685 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_synpred572696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred612962 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred612983 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_synpred612993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred623011 = new BitSet(new long[]{0x40000400000001F0L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred623032 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_synpred623042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpression_in_synpred633170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred694098 = new BitSet(new long[]{0x4000040000000170L,0x0000000000000020L});
    public static final BitSet FOLLOW_rulePlusOperation_in_synpred694123 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_synpred694132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultOperation_in_synpred714433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperation_in_synpred806028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalReference_in_synpred816058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostCode_in_synpred826088 = new BitSet(new long[]{0x0000000000000002L});

}