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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "'init'", "'final'", "'state'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'||'", "'}'", "'#'", "';'", "'var'", "': '", "':='", "'input'", "'output'", "': combine'", "'with'", "' history'", "'@'", "'cond'", "'ref'", "'textual'", "'NONE'", "'+'", "'*'", "'AND'", "'OR'", "'hostCombineOperator'", "'PURE'", "'boolean'", "'unsigned'", "'integer'", "'float'", "'hostType'", "'-->'", "'o->'", "'>->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalKitsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[101+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g"; }


     
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:74:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:74:48: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:75:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRegion_in_entryRuleRegion79);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegion89); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:82:1: ruleRegion returns [EObject current=null] : ( ( 'region' (lv_id_1= RULE_ID ) )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_1=null;
        EObject lv_variables_2 = null;

        EObject lv_signals_3 = null;

        EObject lv_innerStates_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:87:6: ( ( ( 'region' (lv_id_1= RULE_ID ) )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ( ( 'region' (lv_id_1= RULE_ID ) )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ( ( 'region' (lv_id_1= RULE_ID ) )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:2: ( 'region' (lv_id_1= RULE_ID ) )? ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:2: ( 'region' (lv_id_1= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:3: 'region' (lv_id_1= RULE_ID )
                    {
                    match(input,11,FOLLOW_11_in_ruleRegion124); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:92:1: (lv_id_1= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:94:6: lv_id_1= RULE_ID
                    {
                    lv_id_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegion146); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_0_1_0(), "id"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_1, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:4: ( (lv_variables_2= ruleVariable ) | (lv_signals_3= ruleSignal ) | (lv_innerStates_4= ruleState ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (synpred3()) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (synpred3()) ) {
                        alt2=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA2_4 = input.LA(2);

                    if ( (synpred2()) ) {
                        alt2=1;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA2_5 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;
                case 13:
                    {
                    int LA2_6 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA2_7 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA2_8 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA2_9 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA2_10 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_11 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt2=3;
                    }


                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:5: (lv_variables_2= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:5: (lv_variables_2= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:115:6: lv_variables_2= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleRegion191);
            	    lv_variables_2=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "variables", lv_variables_2, "Variable", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:134:6: (lv_signals_3= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:134:6: (lv_signals_3= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:6: lv_signals_3= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignal_in_ruleRegion235);
            	    lv_signals_3=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "signals", lv_signals_3, "Signal", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:156:6: (lv_innerStates_4= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:156:6: (lv_innerStates_4= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:159:6: lv_innerStates_4= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleRegion279);
            	    lv_innerStates_4=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "innerStates", lv_innerStates_4, "State", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:184:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:184:47: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:185:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState318);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState328); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:192:1: ruleState returns [EObject current=null] : ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? (lv_bodyText_110= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_125= ruleTransition )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_0=null;
        Token lv_isFinal_1=null;
        Token lv_isInitial_5=null;
        Token lv_isFinal_6=null;
        Token lv_isInitial_9=null;
        Token lv_isFinal_10=null;
        Token lv_isInitial_13=null;
        Token lv_isFinal_14=null;
        Token lv_isInitial_17=null;
        Token lv_isFinal_18=null;
        Token lv_isInitial_20=null;
        Token lv_isFinal_21=null;
        Token lv_isInitial_23=null;
        Token lv_isFinal_24=null;
        Token lv_isInitial_26=null;
        Token lv_isFinal_27=null;
        Token lv_isFinal_28=null;
        Token lv_isInitial_29=null;
        Token lv_isFinal_33=null;
        Token lv_isInitial_34=null;
        Token lv_isFinal_37=null;
        Token lv_isInitial_38=null;
        Token lv_isFinal_41=null;
        Token lv_isInitial_42=null;
        Token lv_isFinal_45=null;
        Token lv_isInitial_46=null;
        Token lv_isFinal_48=null;
        Token lv_isInitial_49=null;
        Token lv_isFinal_51=null;
        Token lv_isInitial_52=null;
        Token lv_isFinal_54=null;
        Token lv_isInitial_55=null;
        Token lv_isInitial_56=null;
        Token lv_isInitial_60=null;
        Token lv_isInitial_63=null;
        Token lv_isInitial_66=null;
        Token lv_isInitial_69=null;
        Token lv_isInitial_71=null;
        Token lv_isInitial_73=null;
        Token lv_isInitial_75=null;
        Token lv_isFinal_76=null;
        Token lv_isFinal_80=null;
        Token lv_isFinal_83=null;
        Token lv_isFinal_86=null;
        Token lv_isFinal_89=null;
        Token lv_isFinal_91=null;
        Token lv_isFinal_94=null;
        Token lv_isFinal_96=null;
        Token lv_label_109=null;
        Token lv_bodyText_110=null;
        Enumerator lv_type_2 = null;

        AntlrDatatypeRuleToken lv_name_4 = null;

        Enumerator lv_type_7 = null;

        Enumerator lv_type_11 = null;

        AntlrDatatypeRuleToken lv_name_12 = null;

        AntlrDatatypeRuleToken lv_name_16 = null;

        Enumerator lv_type_19 = null;

        AntlrDatatypeRuleToken lv_name_25 = null;

        Enumerator lv_type_30 = null;

        AntlrDatatypeRuleToken lv_name_32 = null;

        Enumerator lv_type_35 = null;

        Enumerator lv_type_39 = null;

        AntlrDatatypeRuleToken lv_name_40 = null;

        AntlrDatatypeRuleToken lv_name_44 = null;

        Enumerator lv_type_47 = null;

        AntlrDatatypeRuleToken lv_name_53 = null;

        Enumerator lv_type_57 = null;

        AntlrDatatypeRuleToken lv_name_59 = null;

        Enumerator lv_type_61 = null;

        Enumerator lv_type_64 = null;

        AntlrDatatypeRuleToken lv_name_65 = null;

        AntlrDatatypeRuleToken lv_name_68 = null;

        Enumerator lv_type_70 = null;

        AntlrDatatypeRuleToken lv_name_74 = null;

        Enumerator lv_type_77 = null;

        AntlrDatatypeRuleToken lv_name_79 = null;

        Enumerator lv_type_81 = null;

        Enumerator lv_type_84 = null;

        AntlrDatatypeRuleToken lv_name_85 = null;

        AntlrDatatypeRuleToken lv_name_88 = null;

        Enumerator lv_type_90 = null;

        AntlrDatatypeRuleToken lv_name_93 = null;

        AntlrDatatypeRuleToken lv_name_95 = null;

        Enumerator lv_type_97 = null;

        AntlrDatatypeRuleToken lv_name_99 = null;

        Enumerator lv_type_100 = null;

        Enumerator lv_type_102 = null;

        AntlrDatatypeRuleToken lv_name_103 = null;

        Enumerator lv_type_104 = null;

        AntlrDatatypeRuleToken lv_name_106 = null;

        AntlrDatatypeRuleToken lv_name_108 = null;

        EObject lv_entryActions_113 = null;

        EObject lv_innerActions_115 = null;

        EObject lv_exitActions_117 = null;

        EObject lv_suspensionTrigger_119 = null;

        EObject lv_signals_120 = null;

        EObject lv_regions_121 = null;

        EObject lv_regions_123 = null;

        EObject lv_outgoingTransitions_125 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:197:6: ( ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? (lv_bodyText_110= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_125= ruleTransition )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? (lv_bodyText_110= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_125= ruleTransition )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:1: ( ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? (lv_bodyText_110= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_125= ruleTransition )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) ) (lv_label_109= RULE_STRING )? (lv_bodyText_110= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_125= ruleTransition )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )
            int alt3=39;
            switch ( input.LA(1) ) {
            case 12:
                {
                switch ( input.LA(2) ) {
                case 13:
                    {
                    int LA3_8 = input.LA(3);

                    if ( (LA3_8==14) ) {
                        int LA3_29 = input.LA(4);

                        if ( (LA3_29==RULE_ID) ) {
                            int LA3_57 = input.LA(5);

                            if ( (synpred7()) ) {
                                alt3=3;
                            }
                            else if ( (synpred8()) ) {
                                alt3=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 57, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_29==14) ) {
                            int LA3_58 = input.LA(5);

                            if ( (LA3_58==RULE_ID) ) {
                                int LA3_80 = input.LA(6);

                                if ( (synpred5()) ) {
                                    alt3=1;
                                }
                                else if ( (synpred6()) ) {
                                    alt3=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 80, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA3_58==EOF||LA3_58==RULE_STRING||(LA3_58>=11 && LA3_58<=21)||LA3_58==24||(LA3_58>=27 && LA3_58<=28)||(LA3_58>=33 && LA3_58<=35)||(LA3_58>=48 && LA3_58<=50)) ) {
                                alt3=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (synpred9()) ) {
                            alt3=5;
                        }
                        else if ( (synpred10()) ) {
                            alt3=6;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_8==33) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA3_61 = input.LA(5);

                            if ( (synpred7()) ) {
                                alt3=3;
                            }
                            else if ( (synpred9()) ) {
                                alt3=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 61, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                            {
                            int LA3_62 = input.LA(5);

                            if ( (LA3_62==RULE_ID) ) {
                                alt3=1;
                            }
                            else if ( (synpred6()) ) {
                                alt3=2;
                            }
                            else if ( (synpred9()) ) {
                                alt3=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 62, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 27:
                        case 28:
                        case 33:
                        case 34:
                        case 35:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt3=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 30, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA3_8==34) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA3_62 = input.LA(5);

                            if ( (LA3_62==RULE_ID) ) {
                                alt3=1;
                            }
                            else if ( (synpred6()) ) {
                                alt3=2;
                            }
                            else if ( (synpred9()) ) {
                                alt3=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 62, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 27:
                        case 28:
                        case 33:
                        case 34:
                        case 35:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt3=5;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA3_61 = input.LA(5);

                            if ( (synpred7()) ) {
                                alt3=3;
                            }
                            else if ( (synpred9()) ) {
                                alt3=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 61, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 31, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA3_8==35) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA3_61 = input.LA(5);

                            if ( (synpred7()) ) {
                                alt3=3;
                            }
                            else if ( (synpred9()) ) {
                                alt3=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 61, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                            {
                            int LA3_62 = input.LA(5);

                            if ( (LA3_62==RULE_ID) ) {
                                alt3=1;
                            }
                            else if ( (synpred6()) ) {
                                alt3=2;
                            }
                            else if ( (synpred9()) ) {
                                alt3=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 62, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 27:
                        case 28:
                        case 33:
                        case 34:
                        case 35:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt3=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 32, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA3_8==RULE_ID) ) {
                        alt3=7;
                    }
                    else if ( (synpred12()) ) {
                        alt3=8;
                    }
                    else if ( (synpred28()) ) {
                        alt3=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA3_9 = input.LA(3);

                    if ( (LA3_9==RULE_ID) ) {
                        int LA3_35 = input.LA(4);

                        if ( (synpred23()) ) {
                            alt3=19;
                        }
                        else if ( (synpred24()) ) {
                            alt3=20;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 35, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_9==14) ) {
                        int LA3_36 = input.LA(4);

                        if ( (LA3_36==RULE_ID) ) {
                            int LA3_65 = input.LA(5);

                            if ( (synpred21()) ) {
                                alt3=17;
                            }
                            else if ( (synpred22()) ) {
                                alt3=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_36==EOF||LA3_36==RULE_STRING||(LA3_36>=11 && LA3_36<=21)||LA3_36==24||(LA3_36>=27 && LA3_36<=28)||(LA3_36>=33 && LA3_36<=35)||(LA3_36>=48 && LA3_36<=50)) ) {
                            alt3=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 36, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred25()) ) {
                        alt3=21;
                    }
                    else if ( (synpred26()) ) {
                        alt3=22;
                    }
                    else if ( (synpred28()) ) {
                        alt3=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA3_10 = input.LA(3);

                    if ( (LA3_10==14) ) {
                        int LA3_36 = input.LA(4);

                        if ( (LA3_36==RULE_ID) ) {
                            int LA3_65 = input.LA(5);

                            if ( (synpred21()) ) {
                                alt3=17;
                            }
                            else if ( (synpred22()) ) {
                                alt3=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_36==EOF||LA3_36==RULE_STRING||(LA3_36>=11 && LA3_36<=21)||LA3_36==24||(LA3_36>=27 && LA3_36<=28)||(LA3_36>=33 && LA3_36<=35)||(LA3_36>=48 && LA3_36<=50)) ) {
                            alt3=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 36, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_10==RULE_ID) ) {
                        alt3=19;
                    }
                    else if ( (synpred25()) ) {
                        alt3=21;
                    }
                    else if ( (synpred28()) ) {
                        alt3=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA3_11 = input.LA(3);

                    if ( (LA3_11==RULE_ID) ) {
                        alt3=19;
                    }
                    else if ( (LA3_11==14) ) {
                        int LA3_36 = input.LA(4);

                        if ( (LA3_36==RULE_ID) ) {
                            int LA3_65 = input.LA(5);

                            if ( (synpred21()) ) {
                                alt3=17;
                            }
                            else if ( (synpred22()) ) {
                                alt3=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_36==EOF||LA3_36==RULE_STRING||(LA3_36>=11 && LA3_36<=21)||LA3_36==24||(LA3_36>=27 && LA3_36<=28)||(LA3_36>=33 && LA3_36<=35)||(LA3_36>=48 && LA3_36<=50)) ) {
                            alt3=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 36, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred25()) ) {
                        alt3=21;
                    }
                    else if ( (synpred28()) ) {
                        alt3=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA3_12 = input.LA(3);

                    if ( (LA3_12==RULE_ID) ) {
                        alt3=19;
                    }
                    else if ( (LA3_12==14) ) {
                        int LA3_36 = input.LA(4);

                        if ( (LA3_36==RULE_ID) ) {
                            int LA3_65 = input.LA(5);

                            if ( (synpred21()) ) {
                                alt3=17;
                            }
                            else if ( (synpred22()) ) {
                                alt3=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 65, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_36==EOF||LA3_36==RULE_STRING||(LA3_36>=11 && LA3_36<=21)||LA3_36==24||(LA3_36>=27 && LA3_36<=28)||(LA3_36>=33 && LA3_36<=35)||(LA3_36>=48 && LA3_36<=50)) ) {
                            alt3=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 36, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred25()) ) {
                        alt3=21;
                    }
                    else if ( (synpred28()) ) {
                        alt3=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_13 = input.LA(3);

                    if ( (synpred27()) ) {
                        alt3=23;
                    }
                    else if ( (synpred28()) ) {
                        alt3=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt3=24;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 12:
                    {
                    int LA3_15 = input.LA(3);

                    if ( (LA3_15==14) ) {
                        int LA3_41 = input.LA(4);

                        if ( (LA3_41==14) ) {
                            int LA3_67 = input.LA(5);

                            if ( (LA3_67==RULE_ID) ) {
                                int LA3_84 = input.LA(6);

                                if ( (synpred13()) ) {
                                    alt3=9;
                                }
                                else if ( (synpred14()) ) {
                                    alt3=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 84, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA3_67==EOF||LA3_67==RULE_STRING||(LA3_67>=11 && LA3_67<=21)||LA3_67==24||(LA3_67>=27 && LA3_67<=28)||(LA3_67>=33 && LA3_67<=35)||(LA3_67>=48 && LA3_67<=50)) ) {
                                alt3=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 67, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_41==RULE_ID) ) {
                            int LA3_68 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt3=11;
                            }
                            else if ( (synpred16()) ) {
                                alt3=12;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 68, input);

                                throw nvae;
                            }
                        }
                        else if ( (synpred17()) ) {
                            alt3=13;
                        }
                        else if ( (synpred18()) ) {
                            alt3=14;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 41, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_15==RULE_ID) ) {
                        alt3=15;
                    }
                    else if ( (LA3_15==33) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA3_71 = input.LA(5);

                            if ( (LA3_71==RULE_ID) ) {
                                alt3=9;
                            }
                            else if ( (synpred14()) ) {
                                alt3=10;
                            }
                            else if ( (synpred17()) ) {
                                alt3=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 71, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA3_72 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt3=11;
                            }
                            else if ( (synpred17()) ) {
                                alt3=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 72, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 27:
                        case 28:
                        case 33:
                        case 34:
                        case 35:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt3=13;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 43, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA3_15==34) ) {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA3_71 = input.LA(5);

                            if ( (LA3_71==RULE_ID) ) {
                                alt3=9;
                            }
                            else if ( (synpred14()) ) {
                                alt3=10;
                            }
                            else if ( (synpred17()) ) {
                                alt3=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 71, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA3_72 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt3=11;
                            }
                            else if ( (synpred17()) ) {
                                alt3=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 72, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 27:
                        case 28:
                        case 33:
                        case 34:
                        case 35:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt3=13;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 44, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA3_15==35) ) {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                            {
                            int LA3_72 = input.LA(5);

                            if ( (synpred15()) ) {
                                alt3=11;
                            }
                            else if ( (synpred17()) ) {
                                alt3=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 72, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 12:
                        case 13:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 27:
                        case 28:
                        case 33:
                        case 34:
                        case 35:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt3=13;
                            }
                            break;
                        case 14:
                            {
                            int LA3_71 = input.LA(5);

                            if ( (LA3_71==RULE_ID) ) {
                                alt3=9;
                            }
                            else if ( (synpred14()) ) {
                                alt3=10;
                            }
                            else if ( (synpred17()) ) {
                                alt3=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 71, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 45, input);

                            throw nvae;
                        }

                    }
                    else if ( (synpred20()) ) {
                        alt3=16;
                    }
                    else if ( (synpred36()) ) {
                        alt3=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA3_16 = input.LA(3);

                    if ( (LA3_16==14) ) {
                        int LA3_47 = input.LA(4);

                        if ( (LA3_47==RULE_ID) ) {
                            int LA3_74 = input.LA(5);

                            if ( (synpred29()) ) {
                                alt3=25;
                            }
                            else if ( (synpred30()) ) {
                                alt3=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 74, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_47==EOF||LA3_47==RULE_STRING||(LA3_47>=11 && LA3_47<=21)||LA3_47==24||(LA3_47>=27 && LA3_47<=28)||(LA3_47>=33 && LA3_47<=35)||(LA3_47>=48 && LA3_47<=50)) ) {
                            alt3=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 47, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_16==RULE_ID) ) {
                        int LA3_48 = input.LA(4);

                        if ( (synpred31()) ) {
                            alt3=27;
                        }
                        else if ( (synpred32()) ) {
                            alt3=28;
                        }
                        else if ( (synpred34()) ) {
                            alt3=30;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 48, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred33()) ) {
                        alt3=29;
                    }
                    else if ( (synpred36()) ) {
                        alt3=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA3_17 = input.LA(3);

                    if ( (LA3_17==RULE_ID) ) {
                        alt3=27;
                    }
                    else if ( (LA3_17==14) ) {
                        int LA3_47 = input.LA(4);

                        if ( (LA3_47==RULE_ID) ) {
                            int LA3_74 = input.LA(5);

                            if ( (synpred29()) ) {
                                alt3=25;
                            }
                            else if ( (synpred30()) ) {
                                alt3=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 74, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_47==EOF||LA3_47==RULE_STRING||(LA3_47>=11 && LA3_47<=21)||LA3_47==24||(LA3_47>=27 && LA3_47<=28)||(LA3_47>=33 && LA3_47<=35)||(LA3_47>=48 && LA3_47<=50)) ) {
                            alt3=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 47, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred33()) ) {
                        alt3=29;
                    }
                    else if ( (synpred36()) ) {
                        alt3=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA3_18 = input.LA(3);

                    if ( (LA3_18==RULE_ID) ) {
                        alt3=27;
                    }
                    else if ( (LA3_18==14) ) {
                        int LA3_47 = input.LA(4);

                        if ( (LA3_47==RULE_ID) ) {
                            int LA3_74 = input.LA(5);

                            if ( (synpred29()) ) {
                                alt3=25;
                            }
                            else if ( (synpred30()) ) {
                                alt3=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 74, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_47==EOF||LA3_47==RULE_STRING||(LA3_47>=11 && LA3_47<=21)||LA3_47==24||(LA3_47>=27 && LA3_47<=28)||(LA3_47>=33 && LA3_47<=35)||(LA3_47>=48 && LA3_47<=50)) ) {
                            alt3=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 47, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred33()) ) {
                        alt3=29;
                    }
                    else if ( (synpred36()) ) {
                        alt3=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA3_19 = input.LA(3);

                    if ( (LA3_19==RULE_ID) ) {
                        alt3=27;
                    }
                    else if ( (LA3_19==14) ) {
                        int LA3_47 = input.LA(4);

                        if ( (LA3_47==RULE_ID) ) {
                            int LA3_74 = input.LA(5);

                            if ( (synpred29()) ) {
                                alt3=25;
                            }
                            else if ( (synpred30()) ) {
                                alt3=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 74, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA3_47==EOF||LA3_47==RULE_STRING||(LA3_47>=11 && LA3_47<=21)||LA3_47==24||(LA3_47>=27 && LA3_47<=28)||(LA3_47>=33 && LA3_47<=35)||(LA3_47>=48 && LA3_47<=50)) ) {
                            alt3=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 47, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred33()) ) {
                        alt3=29;
                    }
                    else if ( (synpred36()) ) {
                        alt3=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_20 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt3=31;
                    }
                    else if ( (synpred36()) ) {
                        alt3=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt3=32;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 2, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==14) ) {
                    int LA3_22 = input.LA(3);

                    if ( (LA3_22==RULE_ID) ) {
                        int LA3_52 = input.LA(4);

                        if ( (synpred37()) ) {
                            alt3=33;
                        }
                        else if ( (synpred38()) ) {
                            alt3=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 52, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA3_22==EOF||LA3_22==RULE_STRING||(LA3_22>=11 && LA3_22<=21)||LA3_22==24||(LA3_22>=27 && LA3_22<=28)||(LA3_22>=33 && LA3_22<=35)||(LA3_22>=48 && LA3_22<=50)) ) {
                        alt3=34;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 22, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_3==RULE_ID) ) {
                    int LA3_23 = input.LA(3);

                    if ( (synpred39()) ) {
                        alt3=35;
                    }
                    else if ( (synpred41()) ) {
                        alt3=37;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 23, input);

                        throw nvae;
                    }
                }
                else if ( (synpred40()) ) {
                    alt3=36;
                }
                else if ( (synpred42()) ) {
                    alt3=38;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA3_26 = input.LA(3);

                    if ( (synpred39()) ) {
                        alt3=35;
                    }
                    else if ( (synpred40()) ) {
                        alt3=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA3_27 = input.LA(3);

                    if ( (LA3_27==RULE_ID) ) {
                        alt3=33;
                    }
                    else if ( (synpred38()) ) {
                        alt3=34;
                    }
                    else if ( (synpred40()) ) {
                        alt3=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 27:
                case 28:
                case 33:
                case 34:
                case 35:
                case 48:
                case 49:
                case 50:
                    {
                    alt3=36;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 4, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 27:
                case 28:
                case 33:
                case 34:
                case 35:
                case 48:
                case 49:
                case 50:
                    {
                    alt3=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_26 = input.LA(3);

                    if ( (synpred39()) ) {
                        alt3=35;
                    }
                    else if ( (synpred40()) ) {
                        alt3=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA3_27 = input.LA(3);

                    if ( (LA3_27==RULE_ID) ) {
                        alt3=33;
                    }
                    else if ( (synpred38()) ) {
                        alt3=34;
                    }
                    else if ( (synpred40()) ) {
                        alt3=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 5, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    int LA3_27 = input.LA(3);

                    if ( (LA3_27==RULE_ID) ) {
                        alt3=33;
                    }
                    else if ( (synpred38()) ) {
                        alt3=34;
                    }
                    else if ( (synpred40()) ) {
                        alt3=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 27, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 27:
                case 28:
                case 33:
                case 34:
                case 35:
                case 48:
                case 49:
                case 50:
                    {
                    alt3=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_26 = input.LA(3);

                    if ( (synpred39()) ) {
                        alt3=35;
                    }
                    else if ( (synpred40()) ) {
                        alt3=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt3=39;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("198:2: ( ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) ) | ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' ) | ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) ) | ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) ) | ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) ) | ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' ) | ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) ) | ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) ) | ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) ) | ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' ) | ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) ) | ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) ) | ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) ) | ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' ) | ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) ) | ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) ) | ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) ) | ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' ) | ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) ) | ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) ) | ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) ) | ( (lv_isInitial_71= 'init' ) 'state' ) | ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) ) | (lv_isInitial_75= 'init' ) | ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) ) | ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' ) | ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) ) | ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) ) | ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) ) | ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) ) | ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) ) | (lv_isFinal_96= 'final' ) | ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) ) | ( (lv_type_100= ruleStateType ) 'state' ) | ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) ) | (lv_type_104= ruleStateType ) | ( 'state' (lv_name_106= ruleFullStateID ) ) | 'state' | (lv_name_108= ruleFullStateID ) )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:3: ( ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) ) (lv_type_2= ruleStateType ) 'state' (lv_name_4= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:4: ( (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:5: (lv_isInitial_0= 'init' ) (lv_isFinal_1= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:5: (lv_isInitial_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:200:6: lv_isInitial_0= 'init'
                    {
                    lv_isInitial_0=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState377); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_0_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:219:2: (lv_isFinal_1= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:221:6: lv_isFinal_1= 'final'
                    {
                    lv_isFinal_1=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState411); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_0_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:240:3: (lv_type_2= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:243:6: lv_type_2= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState459);
                    lv_type_2=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_2, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState472); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:265:1: (lv_name_4= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:268:6: lv_name_4= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState506);
                    lv_name_4=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_4, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:6: ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:6: ( ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:7: ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) ) (lv_type_7= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:7: ( (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:8: (lv_isInitial_5= 'init' ) (lv_isFinal_6= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:8: (lv_isInitial_5= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:289:6: lv_isInitial_5= 'init'
                    {
                    lv_isInitial_5=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState540); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_1_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:308:2: (lv_isFinal_6= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:310:6: lv_isFinal_6= 'final'
                    {
                    lv_isFinal_6=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState574); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_1_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:329:3: (lv_type_7= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:332:6: lv_type_7= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState622);
                    lv_type_7=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_7, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState635); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:6: ( ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) ) (lv_type_11= ruleStateType ) (lv_name_12= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:7: ( (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:8: (lv_isInitial_9= 'init' ) (lv_isFinal_10= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:8: (lv_isInitial_9= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:357:6: lv_isInitial_9= 'init'
                    {
                    lv_isInitial_9=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState665); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_2_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:376:2: (lv_isFinal_10= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:378:6: lv_isFinal_10= 'final'
                    {
                    lv_isFinal_10=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState699); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_2_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:3: (lv_type_11= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:400:6: lv_type_11= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState747);
                    lv_type_11=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_11, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:418:2: (lv_name_12= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: lv_name_12= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState785);
                    lv_name_12=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_12, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:6: ( ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) ) 'state' (lv_name_16= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:7: ( (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:8: (lv_isInitial_13= 'init' ) (lv_isFinal_14= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:8: (lv_isInitial_13= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:442:6: lv_isInitial_13= 'init'
                    {
                    lv_isInitial_13=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState819); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_3_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:461:2: (lv_isFinal_14= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:6: lv_isFinal_14= 'final'
                    {
                    lv_isFinal_14=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState853); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_3_0_1_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState876); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:486:1: (lv_name_16= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:6: lv_name_16= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState910);
                    lv_name_16=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_16, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:6: ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:6: ( ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:7: ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) ) (lv_type_19= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:7: ( (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:8: (lv_isInitial_17= 'init' ) (lv_isFinal_18= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:8: (lv_isInitial_17= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:510:6: lv_isInitial_17= 'init'
                    {
                    lv_isInitial_17=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState944); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_4_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:2: (lv_isFinal_18= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:531:6: lv_isFinal_18= 'final'
                    {
                    lv_isFinal_18=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState978); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_4_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:550:3: (lv_type_19= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:553:6: lv_type_19= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1026);
                    lv_type_19=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_19, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:6: ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:6: ( ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:7: ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:7: ( (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:8: (lv_isInitial_20= 'init' ) (lv_isFinal_21= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:8: (lv_isInitial_20= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:574:6: lv_isInitial_20= 'init'
                    {
                    lv_isInitial_20=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1060); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_5_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:593:2: (lv_isFinal_21= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: lv_isFinal_21= 'final'
                    {
                    lv_isFinal_21=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1094); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_5_0_1_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState1117); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:6: ( ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) ) (lv_name_25= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:7: ( (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:8: (lv_isInitial_23= 'init' ) (lv_isFinal_24= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:619:8: (lv_isInitial_23= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:621:6: lv_isInitial_23= 'init'
                    {
                    lv_isInitial_23=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1147); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_6_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:640:2: (lv_isFinal_24= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:642:6: lv_isFinal_24= 'final'
                    {
                    lv_isFinal_24=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1181); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_6_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:3: (lv_name_25= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:664:6: lv_name_25= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1229);
                    lv_name_25=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_25, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:6: ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:6: ( (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:7: (lv_isInitial_26= 'init' ) (lv_isFinal_27= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:7: (lv_isInitial_26= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:685:6: lv_isInitial_26= 'init'
                    {
                    lv_isInitial_26=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1262); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_7_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:704:2: (lv_isFinal_27= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:706:6: lv_isFinal_27= 'final'
                    {
                    lv_isFinal_27=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1296); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_7_1_0(), "isFinal"); 
                          
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


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:6: ( ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) ) (lv_type_30= ruleStateType ) 'state' (lv_name_32= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:7: ( (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:8: (lv_isFinal_28= 'final' ) (lv_isInitial_29= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:8: (lv_isFinal_28= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:728:6: lv_isFinal_28= 'final'
                    {
                    lv_isFinal_28=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1339); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_8_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:747:2: (lv_isInitial_29= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:749:6: lv_isInitial_29= 'init'
                    {
                    lv_isInitial_29=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1373); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_8_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:768:3: (lv_type_30= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:771:6: lv_type_30= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1421);
                    lv_type_30=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_30, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState1434); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_8_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:793:1: (lv_name_32= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:796:6: lv_name_32= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_8_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1468);
                    lv_name_32=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_32, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:6: ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:6: ( ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:7: ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) ) (lv_type_35= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:7: ( (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:8: (lv_isFinal_33= 'final' ) (lv_isInitial_34= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:8: (lv_isFinal_33= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:817:6: lv_isFinal_33= 'final'
                    {
                    lv_isFinal_33=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1502); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_9_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:836:2: (lv_isInitial_34= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:838:6: lv_isInitial_34= 'init'
                    {
                    lv_isInitial_34=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1536); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_9_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:857:3: (lv_type_35= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:860:6: lv_type_35= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_9_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1584);
                    lv_type_35=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_35, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState1597); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_9_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:6: ( ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) ) (lv_type_39= ruleStateType ) (lv_name_40= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:7: ( (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:8: (lv_isFinal_37= 'final' ) (lv_isInitial_38= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:8: (lv_isFinal_37= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:885:6: lv_isFinal_37= 'final'
                    {
                    lv_isFinal_37=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1627); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_10_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:904:2: (lv_isInitial_38= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:906:6: lv_isInitial_38= 'init'
                    {
                    lv_isInitial_38=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1661); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_10_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:925:3: (lv_type_39= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:928:6: lv_type_39= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1709);
                    lv_type_39=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_39, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:946:2: (lv_name_40= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:949:6: lv_name_40= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1747);
                    lv_name_40=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_40, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) ) 'state' (lv_name_44= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:7: ( (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:8: (lv_isFinal_41= 'final' ) (lv_isInitial_42= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:8: (lv_isFinal_41= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:970:6: lv_isFinal_41= 'final'
                    {
                    lv_isFinal_41=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_11_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:989:2: (lv_isInitial_42= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:991:6: lv_isInitial_42= 'init'
                    {
                    lv_isInitial_42=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1815); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_11_0_1_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState1838); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_11_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1014:1: (lv_name_44= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1017:6: lv_name_44= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1872);
                    lv_name_44=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_44, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:6: ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:6: ( ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:7: ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) ) (lv_type_47= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:7: ( (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:8: (lv_isFinal_45= 'final' ) (lv_isInitial_46= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:8: (lv_isFinal_45= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1038:6: lv_isFinal_45= 'final'
                    {
                    lv_isFinal_45=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1906); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_12_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1057:2: (lv_isInitial_46= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1059:6: lv_isInitial_46= 'init'
                    {
                    lv_isInitial_46=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1940); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_12_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1078:3: (lv_type_47= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1081:6: lv_type_47= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1988);
                    lv_type_47=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_47, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:6: ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:6: ( ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:7: ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:7: ( (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:8: (lv_isFinal_48= 'final' ) (lv_isInitial_49= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:8: (lv_isFinal_48= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1102:6: lv_isFinal_48= 'final'
                    {
                    lv_isFinal_48=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2022); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_13_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1121:2: (lv_isInitial_49= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: lv_isInitial_49= 'init'
                    {
                    lv_isInitial_49=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2056); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_13_0_1_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState2079); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_13_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:6: ( ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) ) (lv_name_53= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:7: ( (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:8: (lv_isFinal_51= 'final' ) (lv_isInitial_52= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1147:8: (lv_isFinal_51= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1149:6: lv_isFinal_51= 'final'
                    {
                    lv_isFinal_51=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2109); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_14_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1168:2: (lv_isInitial_52= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1170:6: lv_isInitial_52= 'init'
                    {
                    lv_isInitial_52=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2143); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_14_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1189:3: (lv_name_53= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1192:6: lv_name_53= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2191);
                    lv_name_53=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_53, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:6: ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:6: ( (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:7: (lv_isFinal_54= 'final' ) (lv_isInitial_55= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:7: (lv_isFinal_54= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1213:6: lv_isFinal_54= 'final'
                    {
                    lv_isFinal_54=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2224); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_15_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1232:2: (lv_isInitial_55= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1234:6: lv_isInitial_55= 'init'
                    {
                    lv_isInitial_55=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2258); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_15_1_0(), "isInitial"); 
                          
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


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: ( (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:7: (lv_isInitial_56= 'init' ) (lv_type_57= ruleStateType ) 'state' (lv_name_59= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:7: (lv_isInitial_56= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1256:6: lv_isInitial_56= 'init'
                    {
                    lv_isInitial_56=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2300); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_16_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1275:2: (lv_type_57= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1278:6: lv_type_57= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_16_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2347);
                    lv_type_57=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_57, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState2360); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_16_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1300:1: (lv_name_59= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1303:6: lv_name_59= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_16_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2394);
                    lv_name_59=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_59, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: ( (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:7: (lv_isInitial_60= 'init' ) (lv_type_61= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:7: (lv_isInitial_60= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1324:6: lv_isInitial_60= 'init'
                    {
                    lv_isInitial_60=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2427); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_17_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1343:2: (lv_type_61= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1346:6: lv_type_61= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_17_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2474);
                    lv_type_61=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_61, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState2487); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_17_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: ( (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:7: (lv_isInitial_63= 'init' ) (lv_type_64= ruleStateType ) (lv_name_65= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:7: (lv_isInitial_63= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1371:6: lv_isInitial_63= 'init'
                    {
                    lv_isInitial_63=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2516); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_18_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1390:2: (lv_type_64= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1393:6: lv_type_64= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_18_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2563);
                    lv_type_64=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_64, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1411:2: (lv_name_65= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1414:6: lv_name_65= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_18_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2601);
                    lv_name_65=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_65, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:6: ( (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:7: (lv_isInitial_66= 'init' ) 'state' (lv_name_68= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:7: (lv_isInitial_66= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1435:6: lv_isInitial_66= 'init'
                    {
                    lv_isInitial_66=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2634); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_19_0_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState2656); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_19_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1458:1: (lv_name_68= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1461:6: lv_name_68= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_19_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2690);
                    lv_name_68=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_68, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: ( (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:7: (lv_isInitial_69= 'init' ) (lv_type_70= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:7: (lv_isInitial_69= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1482:6: lv_isInitial_69= 'init'
                    {
                    lv_isInitial_69=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2723); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_20_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1501:2: (lv_type_70= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1504:6: lv_type_70= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_20_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2770);
                    lv_type_70=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_70, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:6: ( (lv_isInitial_71= 'init' ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:6: ( (lv_isInitial_71= 'init' ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:7: (lv_isInitial_71= 'init' ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:7: (lv_isInitial_71= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: lv_isInitial_71= 'init'
                    {
                    lv_isInitial_71=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2803); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_21_0_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState2825); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_21_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: ( (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:7: (lv_isInitial_73= 'init' ) (lv_name_74= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:7: (lv_isInitial_73= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1551:6: lv_isInitial_73= 'init'
                    {
                    lv_isInitial_73=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2854); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_22_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1570:2: (lv_name_74= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1573:6: lv_name_74= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_22_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2901);
                    lv_name_74=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_74, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: (lv_isInitial_75= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: (lv_isInitial_75= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1594:6: lv_isInitial_75= 'init'
                    {
                    lv_isInitial_75=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2933); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_0_23_0(), "isInitial"); 
                          
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
                case 25 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: ( (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:7: (lv_isFinal_76= 'final' ) (lv_type_77= ruleStateType ) 'state' (lv_name_79= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:7: (lv_isFinal_76= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1616:6: lv_isFinal_76= 'final'
                    {
                    lv_isFinal_76=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2974); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_24_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1635:2: (lv_type_77= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1638:6: lv_type_77= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_24_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3021);
                    lv_type_77=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_77, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3034); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_24_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1660:1: (lv_name_79= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1663:6: lv_name_79= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_24_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3068);
                    lv_name_79=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_79, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: ( (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:7: (lv_isFinal_80= 'final' ) (lv_type_81= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:7: (lv_isFinal_80= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1684:6: lv_isFinal_80= 'final'
                    {
                    lv_isFinal_80=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3101); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_25_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1703:2: (lv_type_81= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1706:6: lv_type_81= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_25_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3148);
                    lv_type_81=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_81, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3161); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_25_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: ( (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:7: (lv_isFinal_83= 'final' ) (lv_type_84= ruleStateType ) (lv_name_85= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:7: (lv_isFinal_83= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1731:6: lv_isFinal_83= 'final'
                    {
                    lv_isFinal_83=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3190); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_26_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1750:2: (lv_type_84= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1753:6: lv_type_84= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_26_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3237);
                    lv_type_84=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_84, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1771:2: (lv_name_85= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1774:6: lv_name_85= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_26_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3275);
                    lv_name_85=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_85, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 28 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:6: ( (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:7: (lv_isFinal_86= 'final' ) 'state' (lv_name_88= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:7: (lv_isFinal_86= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1795:6: lv_isFinal_86= 'final'
                    {
                    lv_isFinal_86=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3308); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_27_0_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState3330); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_27_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1818:1: (lv_name_88= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1821:6: lv_name_88= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_27_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3364);
                    lv_name_88=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_88, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 29 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: ( (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:7: (lv_isFinal_89= 'final' ) (lv_type_90= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:7: (lv_isFinal_89= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:6: lv_isFinal_89= 'final'
                    {
                    lv_isFinal_89=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3397); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_28_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1861:2: (lv_type_90= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1864:6: lv_type_90= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_28_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3444);
                    lv_type_90=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_90, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 30 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:6: ( (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:7: (lv_isFinal_91= 'final' ) 'state' (lv_name_93= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:7: (lv_isFinal_91= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1885:6: lv_isFinal_91= 'final'
                    {
                    lv_isFinal_91=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3477); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_29_0_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState3499); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_29_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1908:1: (lv_name_93= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1911:6: lv_name_93= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_29_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3533);
                    lv_name_93=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_93, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 31 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: ( (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:7: (lv_isFinal_94= 'final' ) (lv_name_95= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:7: (lv_isFinal_94= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1932:6: lv_isFinal_94= 'final'
                    {
                    lv_isFinal_94=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3566); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_30_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1951:2: (lv_name_95= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1954:6: lv_name_95= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_30_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3613);
                    lv_name_95=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_95, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 32 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:6: (lv_isFinal_96= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:6: (lv_isFinal_96= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1975:6: lv_isFinal_96= 'final'
                    {
                    lv_isFinal_96=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3645); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_0_31_0(), "isFinal"); 
                          
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
                case 33 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:6: ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:6: ( (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:7: (lv_type_97= ruleStateType ) 'state' (lv_name_99= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:7: (lv_type_97= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1998:6: lv_type_97= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_32_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3699);
                    lv_type_97=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_97, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3712); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_32_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2020:1: (lv_name_99= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2023:6: lv_name_99= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_32_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3746);
                    lv_name_99=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_99, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 34 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:6: ( (lv_type_100= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:6: ( (lv_type_100= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:7: (lv_type_100= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:7: (lv_type_100= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2045:6: lv_type_100= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_33_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3792);
                    lv_type_100=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_100, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3805); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_33_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: ( (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:7: (lv_type_102= ruleStateType ) (lv_name_103= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:7: (lv_type_102= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2071:6: lv_type_102= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_34_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3847);
                    lv_type_102=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_102, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2089:2: (lv_name_103= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2092:6: lv_name_103= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_34_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3885);
                    lv_name_103=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_103, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 36 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2111:6: (lv_type_104= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2111:6: (lv_type_104= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2114:6: lv_type_104= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_35_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3930);
                    lv_type_104=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_104, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:6: ( 'state' (lv_name_106= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:6: ( 'state' (lv_name_106= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:7: 'state' (lv_name_106= ruleFullStateID )
                    {
                    match(input,14,FOLLOW_14_in_ruleState3950); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_36_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2137:1: (lv_name_106= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2140:6: lv_name_106= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_36_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3984);
                    lv_name_106=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_106, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 38 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2159:6: 'state'
                    {
                    match(input,14,FOLLOW_14_in_ruleState4004); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_0_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2164:6: (lv_name_108= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2164:6: (lv_name_108= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2167:6: lv_name_108= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_38_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState4044);
                    lv_name_108=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "name", lv_name_108, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2185:3: (lv_label_109= RULE_STRING )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred43()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2187:6: lv_label_109= RULE_STRING
                    {
                    lv_label_109=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState4071); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_1_0(), "label"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "label", lv_label_109, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2205:3: (lv_bodyText_110= RULE_STRING )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2207:6: lv_bodyText_110= RULE_STRING
                    {
                    lv_bodyText_110=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState4102); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_2_0(), "bodyText"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "bodyText", lv_bodyText_110, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2225:3: ( '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2225:4: '{' ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+ '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleState4121); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:1: ( ( 'onentry' (lv_entryActions_113= ruleAction ) ) | ( 'oninner' (lv_innerActions_115= ruleAction ) ) | ( 'onexit' (lv_exitActions_117= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) ) | (lv_signals_120= ruleSignal ) | ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=7;
                        switch ( input.LA(1) ) {
                        case 16:
                            {
                            alt7=1;
                            }
                            break;
                        case 17:
                            {
                            alt7=2;
                            }
                            break;
                        case 18:
                            {
                            alt7=3;
                            }
                            break;
                        case 19:
                            {
                            alt7=4;
                            }
                            break;
                        case 27:
                            {
                            int LA7_6 = input.LA(2);

                            if ( (LA7_6==RULE_ID) ) {
                                int LA7_9 = input.LA(3);

                                if ( (synpred49()) ) {
                                    alt7=5;
                                }
                                else if ( (synpred51()) ) {
                                    alt7=6;
                                }


                            }


                            }
                            break;
                        case 28:
                            {
                            int LA7_7 = input.LA(2);

                            if ( (LA7_7==RULE_ID) ) {
                                int LA7_9 = input.LA(3);

                                if ( (synpred49()) ) {
                                    alt7=5;
                                }
                                else if ( (synpred51()) ) {
                                    alt7=6;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 24:
                        case 33:
                        case 34:
                        case 35:
                            {
                            alt7=6;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:2: ( 'onentry' (lv_entryActions_113= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:2: ( 'onentry' (lv_entryActions_113= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2229:3: 'onentry' (lv_entryActions_113= ruleAction )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleState4132); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_3_1_0_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2233:1: (lv_entryActions_113= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2236:6: lv_entryActions_113= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_3_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4166);
                    	    lv_entryActions_113=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "entryActions", lv_entryActions_113, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2255:6: ( 'oninner' (lv_innerActions_115= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2255:6: ( 'oninner' (lv_innerActions_115= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2255:7: 'oninner' (lv_innerActions_115= ruleAction )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleState4187); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_3_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2259:1: (lv_innerActions_115= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2262:6: lv_innerActions_115= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_3_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4221);
                    	    lv_innerActions_115=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "innerActions", lv_innerActions_115, "Action", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2281:6: ( 'onexit' (lv_exitActions_117= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2281:6: ( 'onexit' (lv_exitActions_117= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2281:7: 'onexit' (lv_exitActions_117= ruleAction )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleState4242); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_3_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2285:1: (lv_exitActions_117= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2288:6: lv_exitActions_117= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_3_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4276);
                    	    lv_exitActions_117=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "exitActions", lv_exitActions_117, "Action", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2307:6: ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2307:6: ( 'suspension' (lv_suspensionTrigger_119= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2307:7: 'suspension' (lv_suspensionTrigger_119= ruleAction )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleState4297); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_3_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2311:1: (lv_suspensionTrigger_119= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2314:6: lv_suspensionTrigger_119= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_3_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4331);
                    	    lv_suspensionTrigger_119=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		set(current, "suspensionTrigger", lv_suspensionTrigger_119, "Action", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2333:6: (lv_signals_120= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2333:6: (lv_signals_120= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:6: lv_signals_120= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_3_1_4_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleState4376);
                    	    lv_signals_120=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "signals", lv_signals_120, "Signal", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:6: ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:6: ( (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )* )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:7: (lv_regions_121= ruleRegion ) ( '||' (lv_regions_123= ruleRegion ) )*
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:7: (lv_regions_121= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2358:6: lv_regions_121= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_3_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4421);
                    	    lv_regions_121=ruleRegion();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "regions", lv_regions_121, "Region", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2376:2: ( '||' (lv_regions_123= ruleRegion ) )*
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        int LA6_0 = input.LA(1);

                    	        if ( (LA6_0==20) ) {
                    	            alt6=1;
                    	        }


                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2376:3: '||' (lv_regions_123= ruleRegion )
                    	    	    {
                    	    	    match(input,20,FOLLOW_20_in_ruleState4435); if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_3_1_5_1_0(), null); 
                    	    	          
                    	    	    }
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2380:1: (lv_regions_123= ruleRegion )
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2383:6: lv_regions_123= ruleRegion
                    	    	    {
                    	    	    if ( backtracking==0 ) {
                    	    	       
                    	    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_3_1_5_1_1_0(), currentNode); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4469);
                    	    	    lv_regions_123=ruleRegion();
                    	    	    _fsp--;
                    	    	    if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	      	        }
                    	    	      	        
                    	    	      	        try {
                    	    	      	       		add(current, "regions", lv_regions_123, "Region", currentNode);
                    	    	      	        } catch (ValueConverterException vce) {
                    	    	      				handleValueConverterException(vce);
                    	    	      	        }
                    	    	      	        currentNode = currentNode.getParent();
                    	    	      	    
                    	    	    }

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop6;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleState4487); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2405:3: (lv_outgoingTransitions_125= ruleTransition )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred53()) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>=48 && LA9_0<=50)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2408:6: lv_outgoingTransitions_125= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState4523);
            	    lv_outgoingTransitions_125=ruleTransition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "outgoingTransitions", lv_outgoingTransitions_125, "Transition", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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
    // $ANTLR end ruleState


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2433:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2433:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2434:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4561);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4571); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2441:1: ruleAction returns [EObject current=null] : ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        Token lv_triggersAndEffects_3=null;
        EObject this_Transition_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2446:6: ( ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2447:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2447:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||(LA12_0>=48 && LA12_0<=50)) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2447:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2447:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2447:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2447:3: (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2447:3: (lv_isImmediate_0= '#' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2449:6: lv_isImmediate_0= '#'
                            {
                            lv_isImmediate_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleAction4618); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_0_0_0(), "isImmediate"); 
                                  
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
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2468:3: ( (lv_delay_1= RULE_INT ) ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2468:4: (lv_delay_1= RULE_INT ) ';'
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2468:4: (lv_delay_1= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2470:6: lv_delay_1= RULE_INT
                            {
                            lv_delay_1=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction4655); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_0_1_0_0(), "delay"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "delay", lv_delay_1, "INT", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }

                            match(input,23,FOLLOW_23_in_ruleAction4672); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_0_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2492:3: (lv_triggersAndEffects_3= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2494:6: lv_triggersAndEffects_3= RULE_STRING
                    {
                    lv_triggersAndEffects_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction4696); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getActionAccess().getTriggersAndEffectsSTRINGTerminalRuleCall_0_2_0(), "triggersAndEffects"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "triggersAndEffects", lv_triggersAndEffects_3, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2514:5: this_Transition_4= ruleTransition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getActionAccess().getTransitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleAction4733);
                    this_Transition_4=ruleTransition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Transition_4; 
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
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2531:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2531:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2532:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable4767);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable4777); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2539:1: ruleVariable returns [EObject current=null] : ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_initialValue_5=null;
        Enumerator lv_type_3 = null;

        Enumerator lv_type_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2544:6: ( ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:1: ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:1: ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:2: 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) )
            {
            match(input,24,FOLLOW_24_in_ruleVariable4811); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2549:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2551:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4833); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2569:2: ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2569:2: ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2569:3: ( ': ' (lv_type_3= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2569:3: ( ': ' (lv_type_3= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2569:4: ': ' (lv_type_3= ruleValueType )
                    {
                    match(input,25,FOLLOW_25_in_ruleVariable4852); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2573:1: (lv_type_3= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2576:6: lv_type_3= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable4886);
                    lv_type_3=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_3, "ValueType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2595:6: ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2595:6: ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2595:7: ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType )
                    {
                    match(input,26,FOLLOW_26_in_ruleVariable4907); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2599:1: (lv_initialValue_5= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2601:6: lv_initialValue_5= RULE_ID
                    {
                    lv_initialValue_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4929); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getVariableAccess().getInitialValueIDTerminalRuleCall_2_1_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_5, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,25,FOLLOW_25_in_ruleVariable4946); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2623:1: (lv_type_7= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2626:6: lv_type_7= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable4980);
                    lv_type_7=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_7, "ValueType", lastConsumedNode);
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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2651:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2651:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2652:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal5019);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal5029); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2659:1: ruleSignal returns [EObject current=null] : ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_0=null;
        Token lv_isOutput_1=null;
        Token lv_name_2=null;
        Token lv_hostCombineOperator_9=null;
        Token lv_initialValue_11=null;
        Token lv_initialValue_15=null;
        Token lv_hostCombineOperator_20=null;
        Enumerator lv_type_4 = null;

        Enumerator lv_type_6 = null;

        Enumerator lv_combineOperator_8 = null;

        Enumerator lv_type_13 = null;

        Enumerator lv_type_17 = null;

        Enumerator lv_combineOperator_19 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2664:6: ( ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:1: ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:1: ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:2: ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:2: ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2665:2: ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:3: (lv_isInput_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:3: (lv_isInput_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2667:6: lv_isInput_0= 'input'
                    {
                    lv_isInput_0=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleSignal5076); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_0_0(), "isInput"); 
                          
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
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2687:6: (lv_isOutput_1= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2687:6: (lv_isOutput_1= 'output' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2689:6: lv_isOutput_1= 'output'
                    {
                    lv_isOutput_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleSignal5116); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_0_1_0(), "isOutput"); 
                          
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2708:3: (lv_name_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2710:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5152); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "name", lv_name_2, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2728:2: ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )?
            int alt17=5;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    alt17=1;
                    }
                    break;
                case 29:
                    {
                    alt17=2;
                    }
                    break;
                case 26:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==RULE_ID) ) {
                        int LA17_5 = input.LA(3);

                        if ( (LA17_5==25) ) {
                            alt17=3;
                        }
                        else if ( (LA17_5==29) ) {
                            alt17=4;
                        }
                    }
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2728:3: ( ': ' (lv_type_4= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2728:3: ( ': ' (lv_type_4= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2728:4: ': ' (lv_type_4= ruleValueType )
                    {
                    match(input,25,FOLLOW_25_in_ruleSignal5171); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2732:1: (lv_type_4= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2735:6: lv_type_4= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5205);
                    lv_type_4=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_4, "ValueType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2754:6: ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2754:6: ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2754:7: ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleSignal5226); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2758:1: (lv_type_6= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2761:6: lv_type_6= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5260);
                    lv_type_6=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_6, "ValueType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,30,FOLLOW_30_in_ruleSignal5273); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2783:1: ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=36 && LA15_0<=41)) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_STRING) ) {
                        alt15=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2783:1: ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2783:2: (lv_combineOperator_8= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2783:2: (lv_combineOperator_8= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2786:6: lv_combineOperator_8= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal5308);
                            lv_combineOperator_8=ruleCombineOperator();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "combineOperator", lv_combineOperator_8, "CombineOperator", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2805:6: (lv_hostCombineOperator_9= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2805:6: (lv_hostCombineOperator_9= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2807:6: lv_hostCombineOperator_9= RULE_STRING
                            {
                            lv_hostCombineOperator_9=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5340); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_2_1_3_1_0(), "hostCombineOperator"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostCombineOperator", lv_hostCombineOperator_9, "STRING", lastConsumedNode);
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
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2826:6: ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2826:6: ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2826:7: ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType )
                    {
                    match(input,26,FOLLOW_26_in_ruleSignal5366); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2830:1: (lv_initialValue_11= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2832:6: lv_initialValue_11= RULE_ID
                    {
                    lv_initialValue_11=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5388); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueIDTerminalRuleCall_2_2_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_11, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,25,FOLLOW_25_in_ruleSignal5405); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2854:1: (lv_type_13= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2857:6: lv_type_13= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5439);
                    lv_type_13=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_13, "ValueType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2876:6: ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2876:6: ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2876:7: ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleSignal5460); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2880:1: (lv_initialValue_15= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2882:6: lv_initialValue_15= RULE_ID
                    {
                    lv_initialValue_15=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5482); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSignalAccess().getInitialValueIDTerminalRuleCall_2_3_1_0(), "initialValue"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "initialValue", lv_initialValue_15, "ID", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }

                    match(input,29,FOLLOW_29_in_ruleSignal5499); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_3_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2904:1: (lv_type_17= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2907:6: lv_type_17= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_3_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5533);
                    lv_type_17=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_17, "ValueType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,30,FOLLOW_30_in_ruleSignal5546); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_3_4(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2929:1: ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=36 && LA16_0<=41)) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_STRING) ) {
                        alt16=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2929:1: ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2929:2: (lv_combineOperator_19= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2929:2: (lv_combineOperator_19= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2932:6: lv_combineOperator_19= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_3_5_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal5581);
                            lv_combineOperator_19=ruleCombineOperator();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "combineOperator", lv_combineOperator_19, "CombineOperator", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2951:6: (lv_hostCombineOperator_20= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2951:6: (lv_hostCombineOperator_20= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2953:6: lv_hostCombineOperator_20= RULE_STRING
                            {
                            lv_hostCombineOperator_20=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5613); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_2_3_5_1_0(), "hostCombineOperator"); 
                              	
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "hostCombineOperator", lv_hostCombineOperator_20, "STRING", lastConsumedNode);
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


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2978:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2978:52: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2979:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition5658);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition5668); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2986:1: ruleTransition returns [EObject current=null] : ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_triggersAndEffects_4=null;
        Token lv_isHistory_5=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2991:6: ( ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2992:1: ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2992:1: ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2992:2: ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2992:2: ( ruleFullStateID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2995:3: ruleFullStateID
                    {
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getSourceStateStateCrossReference_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition5720);
                    ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3010:3: (lv_type_1= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3013:6: lv_type_1= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition5758);
            lv_type_1=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		set(current, "type", lv_type_1, "TransitionType", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3031:2: ( ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3034:3: ruleFullStateID
            {
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition5789);
            ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3049:2: ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3049:3: 'with' (lv_triggersAndEffects_4= RULE_STRING )
                    {
                    match(input,30,FOLLOW_30_in_ruleTransition5802); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3053:1: (lv_triggersAndEffects_4= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3055:6: lv_triggersAndEffects_4= RULE_STRING
                    {
                    lv_triggersAndEffects_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition5824); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTransitionAccess().getTriggersAndEffectsSTRINGTerminalRuleCall_3_1_0(), "triggersAndEffects"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "triggersAndEffects", lv_triggersAndEffects_4, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3073:4: (lv_isHistory_5= ' history' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3075:6: lv_isHistory_5= ' history'
                    {
                    lv_isHistory_5=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleTransition5855); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_4_0(), "isHistory"); 
                          
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
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleTransition5878); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTransitionAccess().getSemicolonKeyword_5(), null); 
                  
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


    // $ANTLR start entryRuleFullStateID
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3105:1: entryRuleFullStateID returns [String current=null] : iv_ruleFullStateID= ruleFullStateID EOF ;
    public final String entryRuleFullStateID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullStateID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3105:52: (iv_ruleFullStateID= ruleFullStateID EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3106:2: iv_ruleFullStateID= ruleFullStateID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullStateIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullStateID_in_entryRuleFullStateID5912);
            iv_ruleFullStateID=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullStateID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullStateID5923); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3113:1: ruleFullStateID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFullStateID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3119:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3120:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3120:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3120:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3120:2: (this_ID_0= RULE_ID kw= '@' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==32) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3120:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID5964); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleFullStateID5982); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFullStateIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID5999); if (failed) return current;
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
              	    lastConsumedDatatypeToken = current;
                  
            }
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


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3148:1: ruleStateType returns [Enumerator current=null] : ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3152:6: ( ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3153:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3153:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt22=1;
                }
                break;
            case 33:
                {
                alt22=2;
                }
                break;
            case 34:
                {
                alt22=3;
                }
                break;
            case 35:
                {
                alt22=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3153:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3153:2: ( 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3153:2: ( 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3153:4: 'state'
                    {
                    match(input,14,FOLLOW_14_in_ruleStateType6056); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3159:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3159:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3159:8: 'cond'
                    {
                    match(input,33,FOLLOW_33_in_ruleStateType6071); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3165:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3165:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3165:8: 'ref'
                    {
                    match(input,34,FOLLOW_34_in_ruleStateType6086); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3171:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3171:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3171:8: 'textual'
                    {
                    match(input,35,FOLLOW_35_in_ruleStateType6101); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3181:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3185:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt23=1;
                }
                break;
            case 37:
                {
                alt23=2;
                }
                break;
            case 38:
                {
                alt23=3;
                }
                break;
            case 39:
                {
                alt23=4;
                }
                break;
            case 40:
                {
                alt23=5;
                }
                break;
            case 41:
                {
                alt23=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3186:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:4: 'NONE'
                    {
                    match(input,36,FOLLOW_36_in_ruleCombineOperator6144); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3192:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3192:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3192:8: '+'
                    {
                    match(input,37,FOLLOW_37_in_ruleCombineOperator6159); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3198:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3198:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3198:8: '*'
                    {
                    match(input,38,FOLLOW_38_in_ruleCombineOperator6174); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3204:8: 'AND'
                    {
                    match(input,39,FOLLOW_39_in_ruleCombineOperator6189); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3210:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3210:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3210:8: 'OR'
                    {
                    match(input,40,FOLLOW_40_in_ruleCombineOperator6204); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3216:6: ( 'hostCombineOperator' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3216:6: ( 'hostCombineOperator' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3216:8: 'hostCombineOperator'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator6219); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3226:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3230:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt24=1;
                }
                break;
            case 43:
                {
                alt24=2;
                }
                break;
            case 44:
                {
                alt24=3;
                }
                break;
            case 45:
                {
                alt24=4;
                }
                break;
            case 46:
                {
                alt24=5;
                }
                break;
            case 47:
                {
                alt24=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3231:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:4: 'PURE'
                    {
                    match(input,42,FOLLOW_42_in_ruleValueType6262); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3237:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3237:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3237:8: 'boolean'
                    {
                    match(input,43,FOLLOW_43_in_ruleValueType6277); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3243:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3243:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3243:8: 'unsigned'
                    {
                    match(input,44,FOLLOW_44_in_ruleValueType6292); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3249:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3249:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3249:8: 'integer'
                    {
                    match(input,45,FOLLOW_45_in_ruleValueType6307); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3255:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3255:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3255:8: 'float'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType6322); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3261:6: ( 'hostType' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3261:6: ( 'hostType' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3261:8: 'hostType'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType6337); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3271:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3275:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3276:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3276:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 50:
                {
                alt25=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3276:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3276:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3276:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3276:4: '-->'
                    {
                    match(input,48,FOLLOW_48_in_ruleTransitionType6380); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3282:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3282:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3282:8: 'o->'
                    {
                    match(input,49,FOLLOW_49_in_ruleTransitionType6395); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3288:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3288:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3288:8: '>->'
                    {
                    match(input,50,FOLLOW_50_in_ruleTransitionType6410); if (failed) return current;
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

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:5: ( ( ruleVariable ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:5: ( ruleVariable )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:5: ( ruleVariable )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:115:6: ruleVariable
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleVariable_in_synpred2191);
        ruleVariable();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:134:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:134:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:134:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:137:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred3235);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:156:6: ( ( ruleState ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:156:6: ( ruleState )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:156:6: ( ruleState )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:159:6: ruleState
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleState_in_synpred4279);
        ruleState();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:3: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:4: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:4: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:5: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:198:5: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:200:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred5377); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:219:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:221:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred5411); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:240:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:243:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred5459);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred5472); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:265:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:268:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_0_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred5506);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:287:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:289:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred6540); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:308:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:310:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred6574); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:329:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:332:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred6622);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred6635); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:355:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:357:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred7665); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:376:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:378:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred7699); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:400:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred7747);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:418:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:421:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred7785);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:7: ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:440:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:442:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred8819); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:461:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:463:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred8853); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred8876); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:486:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:489:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_3_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred8910);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:508:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:510:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred9944); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:531:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred9978); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:550:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:553:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred91026);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:7: ( ( 'init' ) ( 'final' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:572:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:574:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred101060); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:593:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred101094); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred101117); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:6: ( ( ( 'init' ) ( 'final' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:6: ( ( 'init' ) ( 'final' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:6: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:7: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:683:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:685:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred121262); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:704:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:706:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred121296); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:726:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:728:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred131339); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:747:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:749:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred131373); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:768:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:771:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_8_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred131421);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred131434); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:793:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:796:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_8_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred131468);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:815:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:817:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred141502); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:836:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:838:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred141536); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:857:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:860:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_9_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred141584);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred141597); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:883:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:885:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred151627); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:904:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:906:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred151661); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:925:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:928:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_10_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred151709);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:946:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:949:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_10_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred151747);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:7: ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:968:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:970:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred161781); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:989:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:991:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred161815); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred161838); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1014:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1017:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_11_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred161872);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1036:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1038:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred171906); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1057:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1059:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred171940); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1078:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1081:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_12_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred171988);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:7: ( ( 'final' ) ( 'init' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1100:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1102:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred182022); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1121:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred182056); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred182079); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:6: ( ( ( 'final' ) ( 'init' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:6: ( ( 'final' ) ( 'init' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:6: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:7: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1211:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1213:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred202224); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1232:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1234:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred202258); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:7: ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1256:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred212300); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1275:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1278:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_16_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred212347);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred212360); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1300:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1303:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_16_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred212394);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:7: ( 'init' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1324:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred222427); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1343:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1346:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_17_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred222474);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred222487); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: ( ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:7: ( 'init' ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1371:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred232516); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1390:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1393:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_18_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred232563);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1411:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1414:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_18_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred232601);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:6: ( ( ( 'init' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:6: ( ( 'init' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:6: ( ( 'init' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:7: ( 'init' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1433:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1435:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred242634); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred242656); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1458:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1461:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_19_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred242690);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: ( ( ( 'init' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: ( ( 'init' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: ( ( 'init' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:7: ( 'init' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1482:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred252723); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1501:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1504:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_20_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred252770);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:6: ( ( ( 'init' ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:6: ( ( 'init' ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:6: ( ( 'init' ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:7: ( 'init' ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1523:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred262803); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred262825); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: ( ( ( 'init' ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: ( ( 'init' ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: ( ( 'init' ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:7: ( 'init' ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1551:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred272854); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1570:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1573:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_22_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred272901);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred28
    public final void synpred28_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: ( ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1594:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred282933); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:7: ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1616:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred292974); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1635:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1638:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_24_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred293021);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred293034); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1660:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1663:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_24_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred293068);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:7: ( 'final' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1684:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred303101); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1703:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1706:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_25_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred303148);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred303161); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: ( ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:7: ( 'final' ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1731:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred313190); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1750:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1753:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_26_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred313237);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1771:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1774:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_26_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred313275);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred32
    public final void synpred32_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:6: ( ( ( 'final' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:7: ( 'final' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1793:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1795:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred323308); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred323330); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1818:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1821:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_27_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred323364);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: ( ( ( 'final' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: ( ( 'final' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: ( ( 'final' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:7: ( 'final' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1842:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred333397); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1861:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1864:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_28_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred333444);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:6: ( ( ( 'final' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:7: ( 'final' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1883:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1885:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred343477); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred343499); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1908:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1911:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_29_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred343533);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: ( ( ( 'final' ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: ( ( 'final' ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: ( ( 'final' ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:7: ( 'final' ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1932:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred353566); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1951:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1954:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_30_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred353613);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:6: ( ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:6: ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1973:6: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1975:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred363645); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:6: ( ( ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:6: ( ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:6: ( ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:7: ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1995:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1998:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_32_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred373699);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred373712); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2020:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2023:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_32_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred373746);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:6: ( ( ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:6: ( ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:6: ( ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:7: ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2042:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2045:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_33_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred383792);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred383805); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: ( ( ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: ( ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: ( ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:7: ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2071:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_34_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred393847);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2089:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2092:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_34_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred393885);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2111:6: ( ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2111:6: ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2111:6: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2114:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_35_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred403930);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:6: ( ( 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:6: ( 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:6: ( 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2133:7: 'state' ( ruleFullStateID )
        {
        match(input,14,FOLLOW_14_in_synpred413950); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2137:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2140:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getNameFullStateIDParserRuleCall_0_36_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred413984);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2159:6: ( 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2159:6: 'state'
        {
        match(input,14,FOLLOW_14_in_synpred424004); if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2187:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2187:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred434071); if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2333:6: ( ( ruleSignal ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2333:6: ( ruleSignal )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2333:6: ( ruleSignal )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2336:6: ruleSignal
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_3_1_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleSignal_in_synpred494376);
        ruleSignal();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:6: ( ( ( ruleRegion ) ( '||' ( ruleRegion ) )* ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:6: ( ( ruleRegion ) ( '||' ( ruleRegion ) )* )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:6: ( ( ruleRegion ) ( '||' ( ruleRegion ) )* )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:7: ( ruleRegion ) ( '||' ( ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2355:7: ( ruleRegion )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2358:6: ruleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_3_1_5_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRegion_in_synpred514421);
        ruleRegion();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2376:2: ( '||' ( ruleRegion ) )*
        loop26:
        do {
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }


            switch (alt26) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2376:3: '||' ( ruleRegion )
        	    {
        	    match(input,20,FOLLOW_20_in_synpred514435); if (failed) return ;
        	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2380:1: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2383:6: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_3_1_5_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleRegion_in_synpred514469);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop26;
            }
        } while (true);


        }


        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2408:6: ( ruleTransition )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2408:6: ruleTransition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_4_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleTransition_in_synpred534523);
        ruleTransition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
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
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
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
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred20() {
        backtracking++;
        int start = input.mark();
        try {
            synpred20_fragment(); // can never throw exception
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
    public final boolean synpred28() {
        backtracking++;
        int start = input.mark();
        try {
            synpred28_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
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
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
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
    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred34() {
        backtracking++;
        int start = input.mark();
        try {
            synpred34_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred33() {
        backtracking++;
        int start = input.mark();
        try {
            synpred33_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred32() {
        backtracking++;
        int start = input.mark();
        try {
            synpred32_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
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
    public final boolean synpred37() {
        backtracking++;
        int start = input.mark();
        try {
            synpred37_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
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
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
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
    public final boolean synpred31() {
        backtracking++;
        int start = input.mark();
        try {
            synpred31_fragment(); // can never throw exception
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
    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegion89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRegion124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegion146 = new BitSet(new long[]{0x0000000E19007010L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleRegion191 = new BitSet(new long[]{0x0000000E19007012L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRegion235 = new BitSet(new long[]{0x0000000E19007012L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion279 = new BitSet(new long[]{0x0000000E19007012L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleState377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState411 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState459 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState506 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState574 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState622 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState635 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState665 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState699 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState785 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState819 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState910 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState978 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1026 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState1060 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1094 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1117 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState1147 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1229 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState1262 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1296 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1339 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1373 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1468 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1502 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1536 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1597 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1627 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1661 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1747 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1781 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1815 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1872 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1906 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1940 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1988 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2022 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState2056 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2079 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2109 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState2143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2191 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState2258 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2300 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2394 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2427 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2487 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2516 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2601 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2690 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2723 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2770 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2803 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2825 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2901 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2933 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2974 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3021 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3068 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3101 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3148 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3161 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3190 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3275 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3364 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3397 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3444 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3533 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3613 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3645 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3699 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3746 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3792 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3805 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3885 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3930 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_14_in_ruleState3950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3984 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_14_in_ruleState4004 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState4044 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState4071 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState4102 = new BitSet(new long[]{0x0007000000008012L});
    public static final BitSet FOLLOW_15_in_ruleState4121 = new BitSet(new long[]{0x0000000E190F7810L});
    public static final BitSet FOLLOW_16_in_ruleState4132 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4166 = new BitSet(new long[]{0x0000000E192F7810L});
    public static final BitSet FOLLOW_17_in_ruleState4187 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4221 = new BitSet(new long[]{0x0000000E192F7810L});
    public static final BitSet FOLLOW_18_in_ruleState4242 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4276 = new BitSet(new long[]{0x0000000E192F7810L});
    public static final BitSet FOLLOW_19_in_ruleState4297 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4331 = new BitSet(new long[]{0x0000000E192F7810L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState4376 = new BitSet(new long[]{0x0000000E192F7810L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4421 = new BitSet(new long[]{0x0000000E193F7810L});
    public static final BitSet FOLLOW_20_in_ruleState4435 = new BitSet(new long[]{0x0000000E19007810L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4469 = new BitSet(new long[]{0x0000000E193F7810L});
    public static final BitSet FOLLOW_21_in_ruleState4487 = new BitSet(new long[]{0x0007000000000012L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState4523 = new BitSet(new long[]{0x0007000000000012L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAction4618 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction4655 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAction4672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAction4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVariable4811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4833 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable4852 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVariable4907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4929 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable4946 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal5019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSignal5076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleSignal5116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5152 = new BitSet(new long[]{0x0000000026000002L});
    public static final BitSet FOLLOW_25_in_ruleSignal5171 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSignal5226 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5260 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSignal5273 = new BitSet(new long[]{0x000003F000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignal5366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5388 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal5405 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignal5460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5482 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSignal5499 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5533 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSignal5546 = new BitSet(new long[]{0x000003F000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition5658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition5720 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition5758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition5789 = new BitSet(new long[]{0x00000000C0800000L});
    public static final BitSet FOLLOW_30_in_ruleTransition5802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition5824 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_ruleTransition5855 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransition5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_entryRuleFullStateID5912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullStateID5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID5964 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFullStateID5982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStateType6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateType6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateType6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStateType6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCombineOperator6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCombineOperator6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCombineOperator6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCombineOperator6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCombineOperator6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleValueType6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleValueType6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleValueType6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValueType6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTransitionType6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTransitionType6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTransitionType6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_synpred2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_synpred4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred5377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred5411 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred5459 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred5472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred6540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred6574 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred6622 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred7665 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred7699 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred7747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred8819 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred8853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred8876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred9944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred9978 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred91026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred101060 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred101094 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred101117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred121262 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred121296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred131339 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred131373 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred131421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred131434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred131468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred141502 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred141536 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred141584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred141597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred151627 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred151661 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred151709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred151747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred161781 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred161815 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred161838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred161872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred171906 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred171940 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred171988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred182022 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred182056 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred182079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred202224 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred202258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred212300 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred212347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred212360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred212394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred222427 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred222474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred222487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred232516 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred232563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred232601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred242634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred242656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred242690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred252723 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred252770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred262803 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred262825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred272854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred272901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred282933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred292974 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred293021 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred293034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred293068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred303101 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred303148 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred303161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred313190 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred313237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred313275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred323308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred323330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred323364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred333397 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred333444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred343477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred343499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred343533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred353566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred353613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred363645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred373699 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred373712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred373746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred383792 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred383805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred393847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred393885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred403930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred413950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred413984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred424004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred434071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_synpred494376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred514421 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_synpred514435 = new BitSet(new long[]{0x0000000E19007810L});
    public static final BitSet FOLLOW_ruleRegion_in_synpred514469 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleTransition_in_synpred534523 = new BitSet(new long[]{0x0000000000000002L});

}