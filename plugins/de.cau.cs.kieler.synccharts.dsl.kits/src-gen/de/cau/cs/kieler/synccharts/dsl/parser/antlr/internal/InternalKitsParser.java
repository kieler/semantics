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
            ruleMemo = new HashMap[97+1];
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:82:1: ruleRegion returns [EObject current=null] : ( ( 'region' (lv_id_1= RULE_ID ) ) (lv_innerStates_2= ruleState ) ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_1=null;
        EObject lv_innerStates_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:87:6: ( ( ( 'region' (lv_id_1= RULE_ID ) ) (lv_innerStates_2= ruleState ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ( ( 'region' (lv_id_1= RULE_ID ) ) (lv_innerStates_2= ruleState ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:1: ( ( 'region' (lv_id_1= RULE_ID ) ) (lv_innerStates_2= ruleState ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:2: ( 'region' (lv_id_1= RULE_ID ) ) (lv_innerStates_2= ruleState )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:88:2: ( 'region' (lv_id_1= RULE_ID ) )
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:112:3: (lv_innerStates_2= ruleState )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:115:6: lv_innerStates_2= ruleState
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getInnerStatesStateParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleState_in_ruleRegion189);
            lv_innerStates_2=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        
              	        try {
              	       		add(current, "innerStates", lv_innerStates_2, "State", currentNode);
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
    // $ANTLR end ruleRegion


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:140:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:140:47: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:141:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState226);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState236); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:148:1: ruleState returns [EObject current=null] : ( (lv_id_0= RULE_ID ) ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) ) (lv_label_110= RULE_STRING )? (lv_bodyText_111= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_126= ruleTransition )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_id_0=null;
        Token lv_isInitial_1=null;
        Token lv_isFinal_2=null;
        Token lv_isInitial_6=null;
        Token lv_isFinal_7=null;
        Token lv_isInitial_10=null;
        Token lv_isFinal_11=null;
        Token lv_isInitial_14=null;
        Token lv_isFinal_15=null;
        Token lv_isInitial_18=null;
        Token lv_isFinal_19=null;
        Token lv_isInitial_21=null;
        Token lv_isFinal_22=null;
        Token lv_isInitial_24=null;
        Token lv_isFinal_25=null;
        Token lv_isInitial_27=null;
        Token lv_isFinal_28=null;
        Token lv_isFinal_29=null;
        Token lv_isInitial_30=null;
        Token lv_isFinal_34=null;
        Token lv_isInitial_35=null;
        Token lv_isFinal_38=null;
        Token lv_isInitial_39=null;
        Token lv_isFinal_42=null;
        Token lv_isInitial_43=null;
        Token lv_isFinal_46=null;
        Token lv_isInitial_47=null;
        Token lv_isFinal_49=null;
        Token lv_isInitial_50=null;
        Token lv_isFinal_52=null;
        Token lv_isInitial_53=null;
        Token lv_isFinal_55=null;
        Token lv_isInitial_56=null;
        Token lv_isInitial_57=null;
        Token lv_isInitial_61=null;
        Token lv_isInitial_64=null;
        Token lv_isInitial_67=null;
        Token lv_isInitial_70=null;
        Token lv_isInitial_72=null;
        Token lv_isInitial_74=null;
        Token lv_isInitial_76=null;
        Token lv_isFinal_77=null;
        Token lv_isFinal_81=null;
        Token lv_isFinal_84=null;
        Token lv_isFinal_87=null;
        Token lv_isFinal_90=null;
        Token lv_isFinal_92=null;
        Token lv_isFinal_95=null;
        Token lv_isFinal_97=null;
        Token lv_label_110=null;
        Token lv_bodyText_111=null;
        Enumerator lv_type_3 = null;

        AntlrDatatypeRuleToken lv_id_5 = null;

        Enumerator lv_type_8 = null;

        Enumerator lv_type_12 = null;

        AntlrDatatypeRuleToken lv_id_13 = null;

        AntlrDatatypeRuleToken lv_id_17 = null;

        Enumerator lv_type_20 = null;

        AntlrDatatypeRuleToken lv_id_26 = null;

        Enumerator lv_type_31 = null;

        AntlrDatatypeRuleToken lv_id_33 = null;

        Enumerator lv_type_36 = null;

        Enumerator lv_type_40 = null;

        AntlrDatatypeRuleToken lv_id_41 = null;

        AntlrDatatypeRuleToken lv_id_45 = null;

        Enumerator lv_type_48 = null;

        AntlrDatatypeRuleToken lv_id_54 = null;

        Enumerator lv_type_58 = null;

        AntlrDatatypeRuleToken lv_id_60 = null;

        Enumerator lv_type_62 = null;

        Enumerator lv_type_65 = null;

        AntlrDatatypeRuleToken lv_id_66 = null;

        AntlrDatatypeRuleToken lv_id_69 = null;

        Enumerator lv_type_71 = null;

        AntlrDatatypeRuleToken lv_id_75 = null;

        Enumerator lv_type_78 = null;

        AntlrDatatypeRuleToken lv_id_80 = null;

        Enumerator lv_type_82 = null;

        Enumerator lv_type_85 = null;

        AntlrDatatypeRuleToken lv_id_86 = null;

        AntlrDatatypeRuleToken lv_id_89 = null;

        Enumerator lv_type_91 = null;

        AntlrDatatypeRuleToken lv_id_94 = null;

        AntlrDatatypeRuleToken lv_id_96 = null;

        Enumerator lv_type_98 = null;

        AntlrDatatypeRuleToken lv_id_100 = null;

        Enumerator lv_type_101 = null;

        Enumerator lv_type_103 = null;

        AntlrDatatypeRuleToken lv_id_104 = null;

        Enumerator lv_type_105 = null;

        AntlrDatatypeRuleToken lv_id_107 = null;

        AntlrDatatypeRuleToken lv_id_109 = null;

        EObject lv_entryActions_114 = null;

        EObject lv_innerActions_116 = null;

        EObject lv_exitActions_118 = null;

        EObject lv_suspensionTrigger_120 = null;

        EObject lv_signals_121 = null;

        EObject lv_regions_122 = null;

        EObject lv_regions_124 = null;

        EObject lv_outgoingTransitions_126 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:153:6: ( ( (lv_id_0= RULE_ID ) ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) ) (lv_label_110= RULE_STRING )? (lv_bodyText_111= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_126= ruleTransition )* ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:154:1: ( (lv_id_0= RULE_ID ) ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) ) (lv_label_110= RULE_STRING )? (lv_bodyText_111= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_126= ruleTransition )* )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:154:1: ( (lv_id_0= RULE_ID ) ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) ) (lv_label_110= RULE_STRING )? (lv_bodyText_111= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_126= ruleTransition )* )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:154:2: (lv_id_0= RULE_ID ) ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) ) (lv_label_110= RULE_STRING )? (lv_bodyText_111= RULE_STRING )? ( '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}' )? (lv_outgoingTransitions_126= ruleTransition )*
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:154:2: (lv_id_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:156:6: lv_id_0= RULE_ID
            {
            lv_id_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState283); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
              	
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "id", lv_id_0, "ID", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )
            int alt1=39;
            switch ( input.LA(1) ) {
            case 12:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    int LA1_8 = input.LA(3);

                    if ( (LA1_8==RULE_ID) ) {
                        int LA1_28 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt1=19;
                        }
                        else if ( (synpred20()) ) {
                            alt1=20;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 28, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA1_8==14) ) {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||LA1_29==11||(LA1_29>=15 && LA1_29<=21)||(LA1_29>=27 && LA1_29<=28)||(LA1_29>=48 && LA1_29<=50)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                    }
                    else if ( (synpred21()) ) {
                        alt1=21;
                    }
                    else if ( (synpred22()) ) {
                        alt1=22;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 13:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        int LA1_32 = input.LA(4);

                        if ( (LA1_32==14) ) {
                            int LA1_60 = input.LA(5);

                            if ( (LA1_60==EOF||LA1_60==RULE_STRING||LA1_60==11||(LA1_60>=15 && LA1_60<=21)||(LA1_60>=27 && LA1_60<=28)||(LA1_60>=48 && LA1_60<=50)) ) {
                                alt1=2;
                            }
                            else if ( (LA1_60==RULE_ID) ) {
                                int LA1_84 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 84, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 60, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_32==RULE_ID) ) {
                            int LA1_61 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred4()) ) {
                                alt1=4;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 61, input);

                                throw nvae;
                            }
                        }
                        else if ( (synpred5()) ) {
                            alt1=5;
                        }
                        else if ( (synpred6()) ) {
                            alt1=6;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 32, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_33 = input.LA(4);

                        if ( (synpred7()) ) {
                            alt1=7;
                        }
                        else if ( (synpred8()) ) {
                            alt1=8;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 33, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=8;
                        }
                        break;
                    case 33:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 27:
                        case 28:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt1=5;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_66 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                            {
                            int LA1_60 = input.LA(5);

                            if ( (LA1_60==EOF||LA1_60==RULE_STRING||LA1_60==11||(LA1_60>=15 && LA1_60<=21)||(LA1_60>=27 && LA1_60<=28)||(LA1_60>=48 && LA1_60<=50)) ) {
                                alt1=2;
                            }
                            else if ( (LA1_60==RULE_ID) ) {
                                int LA1_84 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 84, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 60, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 35, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 34:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 27:
                        case 28:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt1=5;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_66 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 14:
                            {
                            int LA1_60 = input.LA(5);

                            if ( (LA1_60==EOF||LA1_60==RULE_STRING||LA1_60==11||(LA1_60>=15 && LA1_60<=21)||(LA1_60>=27 && LA1_60<=28)||(LA1_60>=48 && LA1_60<=50)) ) {
                                alt1=2;
                            }
                            else if ( (LA1_60==RULE_ID) ) {
                                int LA1_84 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 84, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 60, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 36, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 35:
                        {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_60 = input.LA(5);

                            if ( (LA1_60==EOF||LA1_60==RULE_STRING||LA1_60==11||(LA1_60>=15 && LA1_60<=21)||(LA1_60>=27 && LA1_60<=28)||(LA1_60>=48 && LA1_60<=50)) ) {
                                alt1=2;
                            }
                            else if ( (LA1_60==RULE_ID) ) {
                                int LA1_84 = input.LA(6);

                                if ( (synpred1()) ) {
                                    alt1=1;
                                }
                                else if ( (synpred2()) ) {
                                    alt1=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 84, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 60, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_66 = input.LA(5);

                            if ( (synpred3()) ) {
                                alt1=3;
                            }
                            else if ( (synpred5()) ) {
                                alt1=5;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 66, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 27:
                        case 28:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt1=5;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 37, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 9, input);

                        throw nvae;
                    }

                    }
                    break;
                case 33:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA1_38 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt1=19;
                        }
                        else if ( (synpred21()) ) {
                            alt1=21;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||LA1_29==11||(LA1_29>=15 && LA1_29<=21)||(LA1_29>=27 && LA1_29<=28)||(LA1_29>=48 && LA1_29<=50)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=21;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 10, input);

                        throw nvae;
                    }

                    }
                    break;
                case 34:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=21;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_38 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt1=19;
                        }
                        else if ( (synpred21()) ) {
                            alt1=21;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||LA1_29==11||(LA1_29>=15 && LA1_29<=21)||(LA1_29>=27 && LA1_29<=28)||(LA1_29>=48 && LA1_29<=50)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 11, input);

                        throw nvae;
                    }

                    }
                    break;
                case 35:
                    {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=21;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_38 = input.LA(4);

                        if ( (synpred19()) ) {
                            alt1=19;
                        }
                        else if ( (synpred21()) ) {
                            alt1=21;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 38, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 14:
                        {
                        int LA1_29 = input.LA(4);

                        if ( (LA1_29==RULE_ID) ) {
                            int LA1_58 = input.LA(5);

                            if ( (synpred17()) ) {
                                alt1=17;
                            }
                            else if ( (synpred18()) ) {
                                alt1=18;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 58, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_29==EOF||LA1_29==RULE_STRING||LA1_29==11||(LA1_29>=15 && LA1_29<=21)||(LA1_29>=27 && LA1_29<=28)||(LA1_29>=48 && LA1_29<=50)) ) {
                            alt1=18;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 12, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_13 = input.LA(3);

                    if ( (synpred23()) ) {
                        alt1=23;
                    }
                    else if ( (synpred24()) ) {
                        alt1=24;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt1=24;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA1_41 = input.LA(4);

                        if ( (synpred27()) ) {
                            alt1=27;
                        }
                        else if ( (synpred28()) ) {
                            alt1=28;
                        }
                        else if ( (synpred29()) ) {
                            alt1=29;
                        }
                        else if ( (synpred30()) ) {
                            alt1=30;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 41, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=29;
                        }
                        break;
                    case 14:
                        {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_71 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 71, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||LA1_43==11||(LA1_43>=15 && LA1_43<=21)||(LA1_43>=27 && LA1_43<=28)||(LA1_43>=48 && LA1_43<=50)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 15, input);

                        throw nvae;
                    }

                    }
                    break;
                case 12:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        int LA1_44 = input.LA(4);

                        if ( (LA1_44==RULE_ID) ) {
                            int LA1_73 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred12()) ) {
                                alt1=12;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 73, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_44==14) ) {
                            int LA1_74 = input.LA(5);

                            if ( (LA1_74==RULE_ID) ) {
                                int LA1_91 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 91, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_74==EOF||LA1_74==RULE_STRING||LA1_74==11||(LA1_74>=15 && LA1_74<=21)||(LA1_74>=27 && LA1_74<=28)||(LA1_74>=48 && LA1_74<=50)) ) {
                                alt1=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 74, input);

                                throw nvae;
                            }
                        }
                        else if ( (synpred13()) ) {
                            alt1=13;
                        }
                        else if ( (synpred14()) ) {
                            alt1=14;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 44, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 33:
                        {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_74 = input.LA(5);

                            if ( (LA1_74==RULE_ID) ) {
                                int LA1_91 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 91, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_74==EOF||LA1_74==RULE_STRING||LA1_74==11||(LA1_74>=15 && LA1_74<=21)||(LA1_74>=27 && LA1_74<=28)||(LA1_74>=48 && LA1_74<=50)) ) {
                                alt1=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 74, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_77 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 77, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 27:
                        case 28:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt1=13;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 45, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 34:
                        {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_74 = input.LA(5);

                            if ( (LA1_74==RULE_ID) ) {
                                int LA1_91 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 91, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_74==EOF||LA1_74==RULE_STRING||LA1_74==11||(LA1_74>=15 && LA1_74<=21)||(LA1_74>=27 && LA1_74<=28)||(LA1_74>=48 && LA1_74<=50)) ) {
                                alt1=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 74, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_77 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 77, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 27:
                        case 28:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt1=13;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 46, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 35:
                        {
                        switch ( input.LA(4) ) {
                        case 14:
                            {
                            int LA1_74 = input.LA(5);

                            if ( (LA1_74==RULE_ID) ) {
                                int LA1_91 = input.LA(6);

                                if ( (synpred9()) ) {
                                    alt1=9;
                                }
                                else if ( (synpred10()) ) {
                                    alt1=10;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 91, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA1_74==EOF||LA1_74==RULE_STRING||LA1_74==11||(LA1_74>=15 && LA1_74<=21)||(LA1_74>=27 && LA1_74<=28)||(LA1_74>=48 && LA1_74<=50)) ) {
                                alt1=10;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 74, input);

                                throw nvae;
                            }
                            }
                            break;
                        case EOF:
                        case RULE_STRING:
                        case 11:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 27:
                        case 28:
                        case 48:
                        case 49:
                        case 50:
                            {
                            alt1=13;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA1_77 = input.LA(5);

                            if ( (synpred11()) ) {
                                alt1=11;
                            }
                            else if ( (synpred13()) ) {
                                alt1=13;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 77, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 47, input);

                            throw nvae;
                        }

                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=16;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_49 = input.LA(4);

                        if ( (synpred15()) ) {
                            alt1=15;
                        }
                        else if ( (synpred16()) ) {
                            alt1=16;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 16, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_17 = input.LA(3);

                    if ( (synpred31()) ) {
                        alt1=31;
                    }
                    else if ( (synpred32()) ) {
                        alt1=32;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 33:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_71 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 71, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||LA1_43==11||(LA1_43>=15 && LA1_43<=21)||(LA1_43>=27 && LA1_43<=28)||(LA1_43>=48 && LA1_43<=50)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_51 = input.LA(4);

                        if ( (synpred27()) ) {
                            alt1=27;
                        }
                        else if ( (synpred29()) ) {
                            alt1=29;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=29;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 18, input);

                        throw nvae;
                    }

                    }
                    break;
                case 34:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_71 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 71, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||LA1_43==11||(LA1_43>=15 && LA1_43<=21)||(LA1_43>=27 && LA1_43<=28)||(LA1_43>=48 && LA1_43<=50)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_51 = input.LA(4);

                        if ( (synpred27()) ) {
                            alt1=27;
                        }
                        else if ( (synpred29()) ) {
                            alt1=29;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=29;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 19, input);

                        throw nvae;
                    }

                    }
                    break;
                case 35:
                    {
                    switch ( input.LA(3) ) {
                    case 14:
                        {
                        int LA1_43 = input.LA(4);

                        if ( (LA1_43==RULE_ID) ) {
                            int LA1_71 = input.LA(5);

                            if ( (synpred25()) ) {
                                alt1=25;
                            }
                            else if ( (synpred26()) ) {
                                alt1=26;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 71, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA1_43==EOF||LA1_43==RULE_STRING||LA1_43==11||(LA1_43>=15 && LA1_43<=21)||(LA1_43>=27 && LA1_43<=28)||(LA1_43>=48 && LA1_43<=50)) ) {
                            alt1=26;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 43, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA1_51 = input.LA(4);

                        if ( (synpred27()) ) {
                            alt1=27;
                        }
                        else if ( (synpred29()) ) {
                            alt1=29;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_STRING:
                    case 11:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 27:
                    case 28:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt1=29;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 20, input);

                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt1=32;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==RULE_ID) ) {
                    int LA1_22 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred37()) ) {
                        alt1=37;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 22, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_3==14) ) {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==EOF||LA1_23==RULE_STRING||LA1_23==11||(LA1_23>=15 && LA1_23<=21)||(LA1_23>=27 && LA1_23<=28)||(LA1_23>=48 && LA1_23<=50)) ) {
                        alt1=34;
                    }
                    else if ( (LA1_23==RULE_ID) ) {
                        int LA1_55 = input.LA(4);

                        if ( (synpred33()) ) {
                            alt1=33;
                        }
                        else if ( (synpred34()) ) {
                            alt1=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 55, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 23, input);

                        throw nvae;
                    }
                }
                else if ( (synpred36()) ) {
                    alt1=36;
                }
                else if ( (synpred38()) ) {
                    alt1=38;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA1_26 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt1=36;
                    }
                    break;
                case 14:
                    {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==EOF||LA1_23==RULE_STRING||LA1_23==11||(LA1_23>=15 && LA1_23<=21)||(LA1_23>=27 && LA1_23<=28)||(LA1_23>=48 && LA1_23<=50)) ) {
                        alt1=34;
                    }
                    else if ( (LA1_23==RULE_ID) ) {
                        int LA1_55 = input.LA(4);

                        if ( (synpred33()) ) {
                            alt1=33;
                        }
                        else if ( (synpred34()) ) {
                            alt1=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 55, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 23, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 4, input);

                    throw nvae;
                }

                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==EOF||LA1_23==RULE_STRING||LA1_23==11||(LA1_23>=15 && LA1_23<=21)||(LA1_23>=27 && LA1_23<=28)||(LA1_23>=48 && LA1_23<=50)) ) {
                        alt1=34;
                    }
                    else if ( (LA1_23==RULE_ID) ) {
                        int LA1_55 = input.LA(4);

                        if ( (synpred33()) ) {
                            alt1=33;
                        }
                        else if ( (synpred34()) ) {
                            alt1=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 55, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 23, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_STRING:
                case 11:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt1=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_26 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 5, input);

                    throw nvae;
                }

                }
                break;
            case 35:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_STRING:
                case 11:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 27:
                case 28:
                case 48:
                case 49:
                case 50:
                    {
                    alt1=36;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_26 = input.LA(3);

                    if ( (synpred35()) ) {
                        alt1=35;
                    }
                    else if ( (synpred36()) ) {
                        alt1=36;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 26, input);

                        throw nvae;
                    }
                    }
                    break;
                case 14:
                    {
                    int LA1_23 = input.LA(3);

                    if ( (LA1_23==EOF||LA1_23==RULE_STRING||LA1_23==11||(LA1_23>=15 && LA1_23<=21)||(LA1_23>=27 && LA1_23<=28)||(LA1_23>=48 && LA1_23<=50)) ) {
                        alt1=34;
                    }
                    else if ( (LA1_23==RULE_ID) ) {
                        int LA1_55 = input.LA(4);

                        if ( (synpred33()) ) {
                            alt1=33;
                        }
                        else if ( (synpred34()) ) {
                            alt1=34;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 55, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 23, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt1=39;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("174:2: ( ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) ) | ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' ) | ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) ) | ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) ) | ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) ) | ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' ) | ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) ) | ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) ) | ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) ) | ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' ) | ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) ) | ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) ) | ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) ) | ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' ) | ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) ) | ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) ) | ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) ) | ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' ) | ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) ) | ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) ) | ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) ) | ( (lv_isInitial_72= 'init' ) 'state' ) | ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) ) | (lv_isInitial_76= 'init' ) | ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) ) | ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' ) | ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) ) | ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) ) | ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) ) | ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) ) | ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) ) | (lv_isFinal_97= 'final' ) | ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) ) | ( (lv_type_101= ruleStateType ) 'state' ) | ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) ) | (lv_type_105= ruleStateType ) | ( 'state' (lv_id_107= ruleFullStateID ) ) | 'state' | (lv_id_109= ruleFullStateID ) )", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:3: ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:3: ( ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:4: ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) ) (lv_type_3= ruleStateType ) 'state' (lv_id_5= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:4: ( (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:5: (lv_isInitial_1= 'init' ) (lv_isFinal_2= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:5: (lv_isInitial_1= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:176:6: lv_isInitial_1= 'init'
                    {
                    lv_isInitial_1=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState315); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_0_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:195:2: (lv_isFinal_2= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:197:6: lv_isFinal_2= 'final'
                    {
                    lv_isFinal_2=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState349); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:216:3: (lv_type_3= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:219:6: lv_type_3= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState397);
                    lv_type_3=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_3, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState410); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:241:1: (lv_id_5= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:244:6: lv_id_5= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState444);
                    lv_id_5=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_5, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:6: ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:6: ( ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:7: ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) ) (lv_type_8= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:7: ( (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:8: (lv_isInitial_6= 'init' ) (lv_isFinal_7= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:8: (lv_isInitial_6= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:265:6: lv_isInitial_6= 'init'
                    {
                    lv_isInitial_6=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState478); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_1_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:284:2: (lv_isFinal_7= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:286:6: lv_isFinal_7= 'final'
                    {
                    lv_isFinal_7=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState512); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_1_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:305:3: (lv_type_8= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:308:6: lv_type_8= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState560);
                    lv_type_8=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_8, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState573); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:6: ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:6: ( ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:7: ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) ) (lv_type_12= ruleStateType ) (lv_id_13= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:7: ( (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:8: (lv_isInitial_10= 'init' ) (lv_isFinal_11= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:8: (lv_isInitial_10= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:333:6: lv_isInitial_10= 'init'
                    {
                    lv_isInitial_10=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState603); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_2_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:352:2: (lv_isFinal_11= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:354:6: lv_isFinal_11= 'final'
                    {
                    lv_isFinal_11=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState637); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_2_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:373:3: (lv_type_12= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:376:6: lv_type_12= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState685);
                    lv_type_12=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_12, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:394:2: (lv_id_13= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:6: lv_id_13= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState723);
                    lv_id_13=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_13, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:6: ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:6: ( ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:7: ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) ) 'state' (lv_id_17= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:7: ( (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:8: (lv_isInitial_14= 'init' ) (lv_isFinal_15= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:8: (lv_isInitial_14= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:418:6: lv_isInitial_14= 'init'
                    {
                    lv_isInitial_14=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState757); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_3_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:437:2: (lv_isFinal_15= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:439:6: lv_isFinal_15= 'final'
                    {
                    lv_isFinal_15=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState791); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_3_0_1_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState814); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:462:1: (lv_id_17= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:465:6: lv_id_17= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState848);
                    lv_id_17=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_17, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:6: ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:6: ( ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:7: ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) ) (lv_type_20= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:7: ( (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:8: (lv_isInitial_18= 'init' ) (lv_isFinal_19= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:8: (lv_isInitial_18= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:486:6: lv_isInitial_18= 'init'
                    {
                    lv_isInitial_18=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState882); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_4_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:505:2: (lv_isFinal_19= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:507:6: lv_isFinal_19= 'final'
                    {
                    lv_isFinal_19=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState916); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_4_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:526:3: (lv_type_20= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:6: lv_type_20= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState964);
                    lv_type_20=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_20, "StateType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:6: ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:6: ( ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:7: ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:7: ( (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:8: (lv_isInitial_21= 'init' ) (lv_isFinal_22= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:8: (lv_isInitial_21= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:550:6: lv_isInitial_21= 'init'
                    {
                    lv_isInitial_21=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState998); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_5_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:569:2: (lv_isFinal_22= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:571:6: lv_isFinal_22= 'final'
                    {
                    lv_isFinal_22=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1032); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_5_0_1_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState1055); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: ( ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:7: ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) ) (lv_id_26= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:7: ( (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:8: (lv_isInitial_24= 'init' ) (lv_isFinal_25= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:8: (lv_isInitial_24= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:597:6: lv_isInitial_24= 'init'
                    {
                    lv_isInitial_24=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1085); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_6_0_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:616:2: (lv_isFinal_25= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:618:6: lv_isFinal_25= 'final'
                    {
                    lv_isFinal_25=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1119); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_6_0_1_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:637:3: (lv_id_26= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:640:6: lv_id_26= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_6_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1167);
                    lv_id_26=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_26, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:6: ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:6: ( (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:7: (lv_isInitial_27= 'init' ) (lv_isFinal_28= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:7: (lv_isInitial_27= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:6: lv_isInitial_27= 'init'
                    {
                    lv_isInitial_27=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1200); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_7_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:680:2: (lv_isFinal_28= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:682:6: lv_isFinal_28= 'final'
                    {
                    lv_isFinal_28=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1234); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_7_1_0(), "isFinal"); 
                          
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:6: ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:6: ( ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:7: ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) ) (lv_type_31= ruleStateType ) 'state' (lv_id_33= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:7: ( (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:8: (lv_isFinal_29= 'final' ) (lv_isInitial_30= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:8: (lv_isFinal_29= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:704:6: lv_isFinal_29= 'final'
                    {
                    lv_isFinal_29=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1277); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_8_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:723:2: (lv_isInitial_30= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:725:6: lv_isInitial_30= 'init'
                    {
                    lv_isInitial_30=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1311); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_8_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:744:3: (lv_type_31= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:747:6: lv_type_31= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_8_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1359);
                    lv_type_31=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_31, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState1372); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_8_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:769:1: (lv_id_33= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:772:6: lv_id_33= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_8_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1406);
                    lv_id_33=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_33, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:6: ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:6: ( ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:7: ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) ) (lv_type_36= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:7: ( (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:8: (lv_isFinal_34= 'final' ) (lv_isInitial_35= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:8: (lv_isFinal_34= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:793:6: lv_isFinal_34= 'final'
                    {
                    lv_isFinal_34=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1440); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_9_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:812:2: (lv_isInitial_35= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:814:6: lv_isInitial_35= 'init'
                    {
                    lv_isInitial_35=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1474); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_9_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:833:3: (lv_type_36= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:836:6: lv_type_36= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_9_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1522);
                    lv_type_36=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_36, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState1535); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_9_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:6: ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:6: ( ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:7: ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) ) (lv_type_40= ruleStateType ) (lv_id_41= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:7: ( (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:8: (lv_isFinal_38= 'final' ) (lv_isInitial_39= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:8: (lv_isFinal_38= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:861:6: lv_isFinal_38= 'final'
                    {
                    lv_isFinal_38=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1565); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_10_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:880:2: (lv_isInitial_39= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:882:6: lv_isInitial_39= 'init'
                    {
                    lv_isInitial_39=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1599); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_10_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:901:3: (lv_type_40= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:904:6: lv_type_40= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_10_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1647);
                    lv_type_40=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_40, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:922:2: (lv_id_41= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:925:6: lv_id_41= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_10_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1685);
                    lv_id_41=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_41, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:6: ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:6: ( ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:7: ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) ) 'state' (lv_id_45= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:7: ( (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:8: (lv_isFinal_42= 'final' ) (lv_isInitial_43= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:8: (lv_isFinal_42= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:946:6: lv_isFinal_42= 'final'
                    {
                    lv_isFinal_42=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1719); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_11_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:965:2: (lv_isInitial_43= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:967:6: lv_isInitial_43= 'init'
                    {
                    lv_isInitial_43=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1753); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_11_0_1_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState1776); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_11_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:990:1: (lv_id_45= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:993:6: lv_id_45= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_11_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState1810);
                    lv_id_45=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_45, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:6: ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:6: ( ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:7: ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) ) (lv_type_48= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:7: ( (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:8: (lv_isFinal_46= 'final' ) (lv_isInitial_47= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:8: (lv_isFinal_46= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1014:6: lv_isFinal_46= 'final'
                    {
                    lv_isFinal_46=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1844); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_12_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1033:2: (lv_isInitial_47= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1035:6: lv_isInitial_47= 'init'
                    {
                    lv_isInitial_47=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1878); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_12_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1054:3: (lv_type_48= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1057:6: lv_type_48= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_12_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState1926);
                    lv_type_48=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_48, "StateType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:6: ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:6: ( ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:7: ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:7: ( (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:8: (lv_isFinal_49= 'final' ) (lv_isInitial_50= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:8: (lv_isFinal_49= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1078:6: lv_isFinal_49= 'final'
                    {
                    lv_isFinal_49=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState1960); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_13_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1097:2: (lv_isInitial_50= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1099:6: lv_isInitial_50= 'init'
                    {
                    lv_isInitial_50=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState1994); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_13_0_1_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState2017); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_13_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: ( ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:7: ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) ) (lv_id_54= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:7: ( (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:8: (lv_isFinal_52= 'final' ) (lv_isInitial_53= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:8: (lv_isFinal_52= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1125:6: lv_isFinal_52= 'final'
                    {
                    lv_isFinal_52=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2047); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_14_0_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1144:2: (lv_isInitial_53= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1146:6: lv_isInitial_53= 'init'
                    {
                    lv_isInitial_53=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2081); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_14_0_1_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1165:3: (lv_id_54= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1168:6: lv_id_54= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_14_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2129);
                    lv_id_54=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_54, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:6: ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:6: ( (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:7: (lv_isFinal_55= 'final' ) (lv_isInitial_56= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:7: (lv_isFinal_55= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1189:6: lv_isFinal_55= 'final'
                    {
                    lv_isFinal_55=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2162); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_15_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1208:2: (lv_isInitial_56= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1210:6: lv_isInitial_56= 'init'
                    {
                    lv_isInitial_56=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2196); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_15_1_0(), "isInitial"); 
                          
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:6: ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:6: ( (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:7: (lv_isInitial_57= 'init' ) (lv_type_58= ruleStateType ) 'state' (lv_id_60= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:7: (lv_isInitial_57= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1232:6: lv_isInitial_57= 'init'
                    {
                    lv_isInitial_57=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2238); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_16_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1251:2: (lv_type_58= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: lv_type_58= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_16_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2285);
                    lv_type_58=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_58, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState2298); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_16_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1276:1: (lv_id_60= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1279:6: lv_id_60= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_16_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2332);
                    lv_id_60=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_60, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:6: ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:6: ( (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:7: (lv_isInitial_61= 'init' ) (lv_type_62= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:7: (lv_isInitial_61= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1300:6: lv_isInitial_61= 'init'
                    {
                    lv_isInitial_61=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2365); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_17_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1319:2: (lv_type_62= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: lv_type_62= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_17_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2412);
                    lv_type_62=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_62, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState2425); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_17_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:6: ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:6: ( (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:7: (lv_isInitial_64= 'init' ) (lv_type_65= ruleStateType ) (lv_id_66= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:7: (lv_isInitial_64= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1347:6: lv_isInitial_64= 'init'
                    {
                    lv_isInitial_64=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2454); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_18_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1366:2: (lv_type_65= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: lv_type_65= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_18_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2501);
                    lv_type_65=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_65, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:2: (lv_id_66= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1390:6: lv_id_66= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_18_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2539);
                    lv_id_66=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_66, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:6: ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:6: ( (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:7: (lv_isInitial_67= 'init' ) 'state' (lv_id_69= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:7: (lv_isInitial_67= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1411:6: lv_isInitial_67= 'init'
                    {
                    lv_isInitial_67=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2572); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_19_0_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState2594); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_19_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1434:1: (lv_id_69= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1437:6: lv_id_69= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_19_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2628);
                    lv_id_69=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_69, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:6: ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:6: ( (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:7: (lv_isInitial_70= 'init' ) (lv_type_71= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:7: (lv_isInitial_70= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1458:6: lv_isInitial_70= 'init'
                    {
                    lv_isInitial_70=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2661); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_20_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1477:2: (lv_type_71= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: lv_type_71= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_20_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2708);
                    lv_type_71=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_71, "StateType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:6: ( (lv_isInitial_72= 'init' ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:6: ( (lv_isInitial_72= 'init' ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:7: (lv_isInitial_72= 'init' ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:7: (lv_isInitial_72= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1501:6: lv_isInitial_72= 'init'
                    {
                    lv_isInitial_72=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2741); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_21_0_0(), "isInitial"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState2763); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_21_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: ( (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:7: (lv_isInitial_74= 'init' ) (lv_id_75= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:7: (lv_isInitial_74= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1527:6: lv_isInitial_74= 'init'
                    {
                    lv_isInitial_74=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2792); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_22_0_0(), "isInitial"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1546:2: (lv_id_75= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: lv_id_75= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_22_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState2839);
                    lv_id_75=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_75, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:6: (lv_isInitial_76= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:6: (lv_isInitial_76= 'init' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1570:6: lv_isInitial_76= 'init'
                    {
                    lv_isInitial_76=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleState2871); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_23_0(), "isInitial"); 
                          
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:6: ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:6: ( (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:7: (lv_isFinal_77= 'final' ) (lv_type_78= ruleStateType ) 'state' (lv_id_80= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:7: (lv_isFinal_77= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: lv_isFinal_77= 'final'
                    {
                    lv_isFinal_77=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState2912); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_24_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1611:2: (lv_type_78= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: lv_type_78= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_24_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState2959);
                    lv_type_78=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_78, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState2972); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_24_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1636:1: (lv_id_80= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:6: lv_id_80= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_24_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3006);
                    lv_id_80=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_80, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:6: ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:6: ( (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:7: (lv_isFinal_81= 'final' ) (lv_type_82= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:7: (lv_isFinal_81= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1660:6: lv_isFinal_81= 'final'
                    {
                    lv_isFinal_81=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3039); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_25_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1679:2: (lv_type_82= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: lv_type_82= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_25_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3086);
                    lv_type_82=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_82, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3099); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_25_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:6: ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:6: ( (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:7: (lv_isFinal_84= 'final' ) (lv_type_85= ruleStateType ) (lv_id_86= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:7: (lv_isFinal_84= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1707:6: lv_isFinal_84= 'final'
                    {
                    lv_isFinal_84=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3128); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_26_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1726:2: (lv_type_85= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: lv_type_85= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_26_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3175);
                    lv_type_85=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_85, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1747:2: (lv_id_86= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1750:6: lv_id_86= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_26_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3213);
                    lv_id_86=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_86, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:6: ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:6: ( (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:7: (lv_isFinal_87= 'final' ) 'state' (lv_id_89= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:7: (lv_isFinal_87= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1771:6: lv_isFinal_87= 'final'
                    {
                    lv_isFinal_87=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3246); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_27_0_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState3268); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_27_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1794:1: (lv_id_89= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1797:6: lv_id_89= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_27_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3302);
                    lv_id_89=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_89, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:6: ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:6: ( (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:7: (lv_isFinal_90= 'final' ) (lv_type_91= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:7: (lv_isFinal_90= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1818:6: lv_isFinal_90= 'final'
                    {
                    lv_isFinal_90=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3335); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_28_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:2: (lv_type_91= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: lv_type_91= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_28_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3382);
                    lv_type_91=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_91, "StateType", lastConsumedNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:6: ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:6: ( (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:7: (lv_isFinal_92= 'final' ) 'state' (lv_id_94= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:7: (lv_isFinal_92= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1861:6: lv_isFinal_92= 'final'
                    {
                    lv_isFinal_92=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3415); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_29_0_0(), "isFinal"); 
                          
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

                    match(input,14,FOLLOW_14_in_ruleState3437); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_29_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1884:1: (lv_id_94= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1887:6: lv_id_94= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_29_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3471);
                    lv_id_94=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_94, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:6: ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:6: ( (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:7: (lv_isFinal_95= 'final' ) (lv_id_96= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:7: (lv_isFinal_95= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1908:6: lv_isFinal_95= 'final'
                    {
                    lv_isFinal_95=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3504); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_30_0_0(), "isFinal"); 
                          
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1927:2: (lv_id_96= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: lv_id_96= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_30_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3551);
                    lv_id_96=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_96, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1949:6: (lv_isFinal_97= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1949:6: (lv_isFinal_97= 'final' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1951:6: lv_isFinal_97= 'final'
                    {
                    lv_isFinal_97=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleState3583); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_31_0(), "isFinal"); 
                          
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:7: (lv_type_98= ruleStateType ) 'state' (lv_id_100= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:7: (lv_type_98= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1974:6: lv_type_98= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_32_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3637);
                    lv_type_98=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_98, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3650); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_32_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1996:1: (lv_id_100= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1999:6: lv_id_100= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_32_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3684);
                    lv_id_100=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_100, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:6: ( (lv_type_101= ruleStateType ) 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:6: ( (lv_type_101= ruleStateType ) 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:7: (lv_type_101= ruleStateType ) 'state'
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:7: (lv_type_101= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2021:6: lv_type_101= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_33_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3730);
                    lv_type_101=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_101, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    match(input,14,FOLLOW_14_in_ruleState3743); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_33_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:6: ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:6: ( (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:7: (lv_type_103= ruleStateType ) (lv_id_104= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:7: (lv_type_103= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2047:6: lv_type_103= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_34_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3785);
                    lv_type_103=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_103, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2065:2: (lv_id_104= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: lv_id_104= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_34_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3823);
                    lv_id_104=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_104, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2087:6: (lv_type_105= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2087:6: (lv_type_105= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2090:6: lv_type_105= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_35_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStateType_in_ruleState3868);
                    lv_type_105=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "type", lv_type_105, "StateType", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:6: ( 'state' (lv_id_107= ruleFullStateID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:6: ( 'state' (lv_id_107= ruleFullStateID ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:7: 'state' (lv_id_107= ruleFullStateID )
                    {
                    match(input,14,FOLLOW_14_in_ruleState3888); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_36_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2113:1: (lv_id_107= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2116:6: lv_id_107= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_36_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3922);
                    lv_id_107=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_107, "FullStateID", currentNode);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2135:6: 'state'
                    {
                    match(input,14,FOLLOW_14_in_ruleState3942); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getStateKeyword_1_37(), null); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2140:6: (lv_id_109= ruleFullStateID )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2140:6: (lv_id_109= ruleFullStateID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2143:6: lv_id_109= ruleFullStateID
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_38_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleState3982);
                    lv_id_109=ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "id", lv_id_109, "FullStateID", currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2161:3: (lv_label_110= RULE_STRING )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred39()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2163:6: lv_label_110= RULE_STRING
                    {
                    lv_label_110=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState4009); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_2_0(), "label"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "label", lv_label_110, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2181:3: (lv_bodyText_111= RULE_STRING )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2183:6: lv_bodyText_111= RULE_STRING
                    {
                    lv_bodyText_111=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState4040); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getBodyTextSTRINGTerminalRuleCall_3_0(), "bodyText"); 
                      	
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "bodyText", lv_bodyText_111, "STRING", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2201:3: ( '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2201:4: '{' ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+ '}'
                    {
                    match(input,15,FOLLOW_15_in_ruleState4059); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2205:1: ( ( 'onentry' (lv_entryActions_114= ruleAction ) ) | ( 'oninner' (lv_innerActions_116= ruleAction ) ) | ( 'onexit' (lv_exitActions_118= ruleAction ) ) | ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) ) | (lv_signals_121= ruleSignal ) | ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=7;
                        switch ( input.LA(1) ) {
                        case 16:
                            {
                            alt5=1;
                            }
                            break;
                        case 17:
                            {
                            alt5=2;
                            }
                            break;
                        case 18:
                            {
                            alt5=3;
                            }
                            break;
                        case 19:
                            {
                            alt5=4;
                            }
                            break;
                        case 27:
                        case 28:
                            {
                            alt5=5;
                            }
                            break;
                        case 11:
                            {
                            alt5=6;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2205:2: ( 'onentry' (lv_entryActions_114= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2205:2: ( 'onentry' (lv_entryActions_114= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2205:3: 'onentry' (lv_entryActions_114= ruleAction )
                    	    {
                    	    match(input,16,FOLLOW_16_in_ruleState4070); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_4_1_0_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2209:1: (lv_entryActions_114= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2212:6: lv_entryActions_114= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_4_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4104);
                    	    lv_entryActions_114=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "entryActions", lv_entryActions_114, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2231:6: ( 'oninner' (lv_innerActions_116= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2231:6: ( 'oninner' (lv_innerActions_116= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2231:7: 'oninner' (lv_innerActions_116= ruleAction )
                    	    {
                    	    match(input,17,FOLLOW_17_in_ruleState4125); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_4_1_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2235:1: (lv_innerActions_116= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2238:6: lv_innerActions_116= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_4_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4159);
                    	    lv_innerActions_116=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "innerActions", lv_innerActions_116, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2257:6: ( 'onexit' (lv_exitActions_118= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2257:6: ( 'onexit' (lv_exitActions_118= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2257:7: 'onexit' (lv_exitActions_118= ruleAction )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleState4180); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_4_1_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2261:1: (lv_exitActions_118= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2264:6: lv_exitActions_118= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_4_1_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4214);
                    	    lv_exitActions_118=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "exitActions", lv_exitActions_118, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2283:6: ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2283:6: ( 'suspension' (lv_suspensionTrigger_120= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2283:7: 'suspension' (lv_suspensionTrigger_120= ruleAction )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleState4235); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_4_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2287:1: (lv_suspensionTrigger_120= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2290:6: lv_suspensionTrigger_120= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_4_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAction_in_ruleState4269);
                    	    lv_suspensionTrigger_120=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		set(current, "suspensionTrigger", lv_suspensionTrigger_120, "Action", currentNode);
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
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2309:6: (lv_signals_121= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2309:6: (lv_signals_121= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2312:6: lv_signals_121= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_4_1_4_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleState4314);
                    	    lv_signals_121=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "signals", lv_signals_121, "Signal", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2331:6: ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2331:6: ( (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )* )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2331:7: (lv_regions_122= ruleRegion ) ( '||' (lv_regions_124= ruleRegion ) )*
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2331:7: (lv_regions_122= ruleRegion )
                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2334:6: lv_regions_122= ruleRegion
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4359);
                    	    lv_regions_122=ruleRegion();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        
                    	      	        try {
                    	      	       		add(current, "regions", lv_regions_122, "Region", currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2352:2: ( '||' (lv_regions_124= ruleRegion ) )*
                    	    loop4:
                    	    do {
                    	        int alt4=2;
                    	        int LA4_0 = input.LA(1);

                    	        if ( (LA4_0==20) ) {
                    	            alt4=1;
                    	        }


                    	        switch (alt4) {
                    	    	case 1 :
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2352:3: '||' (lv_regions_124= ruleRegion )
                    	    	    {
                    	    	    match(input,20,FOLLOW_20_in_ruleState4373); if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	              createLeafNode(grammarAccess.getStateAccess().getVerticalLineVerticalLineKeyword_4_1_5_1_0(), null); 
                    	    	          
                    	    	    }
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2356:1: (lv_regions_124= ruleRegion )
                    	    	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2359:6: lv_regions_124= ruleRegion
                    	    	    {
                    	    	    if ( backtracking==0 ) {
                    	    	       
                    	    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_4_1_5_1_1_0(), currentNode); 
                    	    	      	    
                    	    	    }
                    	    	    pushFollow(FOLLOW_ruleRegion_in_ruleState4407);
                    	    	    lv_regions_124=ruleRegion();
                    	    	    _fsp--;
                    	    	    if (failed) return current;
                    	    	    if ( backtracking==0 ) {

                    	    	      	        if (current==null) {
                    	    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	      	        }
                    	    	      	        
                    	    	      	        try {
                    	    	      	       		add(current, "regions", lv_regions_124, "Region", currentNode);
                    	    	      	        } catch (ValueConverterException vce) {
                    	    	      				handleValueConverterException(vce);
                    	    	      	        }
                    	    	      	        currentNode = currentNode.getParent();
                    	    	      	    
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
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    match(input,21,FOLLOW_21_in_ruleState4425); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2381:3: (lv_outgoingTransitions_126= ruleTransition )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=48 && LA7_0<=50)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2384:6: lv_outgoingTransitions_126= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState4461);
            	    lv_outgoingTransitions_126=ruleTransition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		add(current, "outgoingTransitions", lv_outgoingTransitions_126, "Transition", currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2409:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2409:48: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2410:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction4499);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction4509); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2417:1: ruleAction returns [EObject current=null] : ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_0=null;
        Token lv_delay_1=null;
        Token lv_triggersAndEffects_3=null;
        EObject this_Transition_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2422:6: ( ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2423:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2423:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_INT)||LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||(LA10_0>=48 && LA10_0<=50)) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2423:1: ( ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) ) | this_Transition_4= ruleTransition )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2423:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2423:2: ( (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2423:3: (lv_isImmediate_0= '#' )? ( (lv_delay_1= RULE_INT ) ';' )? (lv_triggersAndEffects_3= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2423:3: (lv_isImmediate_0= '#' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==22) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2425:6: lv_isImmediate_0= '#'
                            {
                            lv_isImmediate_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleAction4556); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2444:3: ( (lv_delay_1= RULE_INT ) ';' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2444:4: (lv_delay_1= RULE_INT ) ';'
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2444:4: (lv_delay_1= RULE_INT )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2446:6: lv_delay_1= RULE_INT
                            {
                            lv_delay_1=(Token)input.LT(1);
                            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAction4593); if (failed) return current;
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

                            match(input,23,FOLLOW_23_in_ruleAction4610); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getActionAccess().getSemicolonKeyword_0_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2468:3: (lv_triggersAndEffects_3= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2470:6: lv_triggersAndEffects_3= RULE_STRING
                    {
                    lv_triggersAndEffects_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction4634); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2490:5: this_Transition_4= ruleTransition
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getActionAccess().getTransitionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleAction4671);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2507:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2507:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2508:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable4705);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable4715); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2515:1: ruleVariable returns [EObject current=null] : ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_initialValue_5=null;
        Enumerator lv_type_3 = null;

        Enumerator lv_type_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2520:6: ( ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2521:1: ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2521:1: ( 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2521:2: 'var' (lv_name_1= RULE_ID ) ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) )
            {
            match(input,24,FOLLOW_24_in_ruleVariable4749); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2525:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2527:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4771); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:2: ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2545:2: ( ( ': ' (lv_type_3= ruleValueType ) ) | ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:3: ( ': ' (lv_type_3= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:3: ( ': ' (lv_type_3= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2545:4: ': ' (lv_type_3= ruleValueType )
                    {
                    match(input,25,FOLLOW_25_in_ruleVariable4790); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2549:1: (lv_type_3= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2552:6: lv_type_3= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable4824);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2571:6: ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2571:6: ( ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2571:7: ':=' (lv_initialValue_5= RULE_ID ) ': ' (lv_type_7= ruleValueType )
                    {
                    match(input,26,FOLLOW_26_in_ruleVariable4845); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2575:1: (lv_initialValue_5= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2577:6: lv_initialValue_5= RULE_ID
                    {
                    lv_initialValue_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable4867); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleVariable4884); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonSpaceKeyword_2_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2599:1: (lv_type_7= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2602:6: lv_type_7= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_2_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleVariable4918);
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2627:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2627:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2628:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal4957);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal4967); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2635:1: ruleSignal returns [EObject current=null] : ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? ) ;
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
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2640:6: ( ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2641:1: ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2641:1: ( ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2641:2: ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) ) (lv_name_2= RULE_ID ) ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2641:2: ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2641:2: ( (lv_isInput_0= 'input' ) | (lv_isOutput_1= 'output' ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2641:3: (lv_isInput_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2641:3: (lv_isInput_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2643:6: lv_isInput_0= 'input'
                    {
                    lv_isInput_0=(Token)input.LT(1);
                    match(input,27,FOLLOW_27_in_ruleSignal5014); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2663:6: (lv_isOutput_1= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2663:6: (lv_isOutput_1= 'output' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2665:6: lv_isOutput_1= 'output'
                    {
                    lv_isOutput_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleSignal5054); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2684:3: (lv_name_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2686:6: lv_name_2= RULE_ID
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5090); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2704:2: ( ( ': ' (lv_type_4= ruleValueType ) ) | ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) ) | ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) ) | ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) ) )?
            int alt15=5;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    alt15=1;
                    }
                    break;
                case 29:
                    {
                    alt15=2;
                    }
                    break;
                case 26:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==RULE_ID) ) {
                        int LA15_5 = input.LA(3);

                        if ( (LA15_5==25) ) {
                            alt15=3;
                        }
                        else if ( (LA15_5==29) ) {
                            alt15=4;
                        }
                    }
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2704:3: ( ': ' (lv_type_4= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2704:3: ( ': ' (lv_type_4= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2704:4: ': ' (lv_type_4= ruleValueType )
                    {
                    match(input,25,FOLLOW_25_in_ruleSignal5109); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2708:1: (lv_type_4= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2711:6: lv_type_4= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5143);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2730:6: ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2730:6: ( ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2730:7: ': combine' (lv_type_6= ruleValueType ) 'with' ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleSignal5164); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2734:1: (lv_type_6= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2737:6: lv_type_6= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5198);
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

                    match(input,30,FOLLOW_30_in_ruleSignal5211); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_1_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2759:1: ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=36 && LA13_0<=41)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_STRING) ) {
                        alt13=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2759:1: ( (lv_combineOperator_8= ruleCombineOperator ) | (lv_hostCombineOperator_9= RULE_STRING ) )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2759:2: (lv_combineOperator_8= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2759:2: (lv_combineOperator_8= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2762:6: lv_combineOperator_8= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_1_3_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal5246);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2781:6: (lv_hostCombineOperator_9= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2781:6: (lv_hostCombineOperator_9= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2783:6: lv_hostCombineOperator_9= RULE_STRING
                            {
                            lv_hostCombineOperator_9=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5278); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2802:6: ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2802:6: ( ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2802:7: ':=' (lv_initialValue_11= RULE_ID ) ': ' (lv_type_13= ruleValueType )
                    {
                    match(input,26,FOLLOW_26_in_ruleSignal5304); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2806:1: (lv_initialValue_11= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2808:6: lv_initialValue_11= RULE_ID
                    {
                    lv_initialValue_11=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5326); if (failed) return current;
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

                    match(input,25,FOLLOW_25_in_ruleSignal5343); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonSpaceKeyword_2_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2830:1: (lv_type_13= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2833:6: lv_type_13= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5377);
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
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2852:6: ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2852:6: ( ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) ) )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2852:7: ':=' (lv_initialValue_15= RULE_ID ) ': combine' (lv_type_17= ruleValueType ) 'with' ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleSignal5398); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_2_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2856:1: (lv_initialValue_15= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2858:6: lv_initialValue_15= RULE_ID
                    {
                    lv_initialValue_15=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal5420); if (failed) return current;
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

                    match(input,29,FOLLOW_29_in_ruleSignal5437); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_2_3_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2880:1: (lv_type_17= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2883:6: lv_type_17= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_2_3_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueType_in_ruleSignal5471);
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

                    match(input,30,FOLLOW_30_in_ruleSignal5484); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_2_3_4(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2905:1: ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=36 && LA14_0<=41)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_STRING) ) {
                        alt14=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2905:1: ( (lv_combineOperator_19= ruleCombineOperator ) | (lv_hostCombineOperator_20= RULE_STRING ) )", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2905:2: (lv_combineOperator_19= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2905:2: (lv_combineOperator_19= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2908:6: lv_combineOperator_19= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_2_3_5_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCombineOperator_in_ruleSignal5519);
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
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2927:6: (lv_hostCombineOperator_20= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2927:6: (lv_hostCombineOperator_20= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2929:6: lv_hostCombineOperator_20= RULE_STRING
                            {
                            lv_hostCombineOperator_20=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSignal5551); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2954:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2954:52: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2955:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition5596);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition5606); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2962:1: ruleTransition returns [EObject current=null] : ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_triggersAndEffects_4=null;
        Token lv_isHistory_5=null;
        Enumerator lv_type_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2967:6: ( ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2968:1: ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2968:1: ( ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';' )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2968:2: ( ruleFullStateID )? (lv_type_1= ruleTransitionType ) ( ruleFullStateID ) ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )? (lv_isHistory_5= ' history' )? ';'
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2968:2: ( ruleFullStateID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2971:3: ruleFullStateID
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
                    pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition5658);
                    ruleFullStateID();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2986:3: (lv_type_1= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2989:6: lv_type_1= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition5696);
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3007:2: ( ruleFullStateID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3010:3: ruleFullStateID
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
            pushFollow(FOLLOW_ruleFullStateID_in_ruleTransition5727);
            ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3025:2: ( 'with' (lv_triggersAndEffects_4= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3025:3: 'with' (lv_triggersAndEffects_4= RULE_STRING )
                    {
                    match(input,30,FOLLOW_30_in_ruleTransition5740); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3029:1: (lv_triggersAndEffects_4= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3031:6: lv_triggersAndEffects_4= RULE_STRING
                    {
                    lv_triggersAndEffects_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition5762); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3049:4: (lv_isHistory_5= ' history' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3051:6: lv_isHistory_5= ' history'
                    {
                    lv_isHistory_5=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleTransition5793); if (failed) return current;
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

            match(input,23,FOLLOW_23_in_ruleTransition5816); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3081:1: entryRuleFullStateID returns [String current=null] : iv_ruleFullStateID= ruleFullStateID EOF ;
    public final String entryRuleFullStateID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullStateID = null;


        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3081:52: (iv_ruleFullStateID= ruleFullStateID EOF )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3082:2: iv_ruleFullStateID= ruleFullStateID EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFullStateIDRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFullStateID_in_entryRuleFullStateID5850);
            iv_ruleFullStateID=ruleFullStateID();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFullStateID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullStateID5861); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3089:1: ruleFullStateID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFullStateID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3095:6: ( ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3096:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3096:1: ( (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3096:2: (this_ID_0= RULE_ID kw= '@' )? this_ID_2= RULE_ID
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3096:2: (this_ID_0= RULE_ID kw= '@' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==32) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3096:7: this_ID_0= RULE_ID kw= '@'
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID5902); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getFullStateIDAccess().getIDTerminalRuleCall_0_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleFullStateID5920); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getFullStateIDAccess().getCommercialAtKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullStateID5937); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3124:1: ruleStateType returns [Enumerator current=null] : ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3128:6: ( ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3129:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3129:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
                {
                alt20=3;
                }
                break;
            case 35:
                {
                alt20=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3129:1: ( ( 'state' ) | ( 'cond' ) | ( 'ref' ) | ( 'textual' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3129:2: ( 'state' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3129:2: ( 'state' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3129:4: 'state'
                    {
                    match(input,14,FOLLOW_14_in_ruleStateType5994); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3135:6: ( 'cond' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3135:6: ( 'cond' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3135:8: 'cond'
                    {
                    match(input,33,FOLLOW_33_in_ruleStateType6009); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getPSEUDOEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3141:6: ( 'ref' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3141:6: ( 'ref' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3141:8: 'ref'
                    {
                    match(input,34,FOLLOW_34_in_ruleStateType6024); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3147:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3147:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3147:8: 'textual'
                    {
                    match(input,35,FOLLOW_35_in_ruleStateType6039); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3157:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3161:6: ( ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3162:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3162:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 39:
                {
                alt21=4;
                }
                break;
            case 40:
                {
                alt21=5;
                }
                break;
            case 41:
                {
                alt21=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3162:1: ( ( 'NONE' ) | ( '+' ) | ( '*' ) | ( 'AND' ) | ( 'OR' ) | ( 'hostCombineOperator' ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3162:2: ( 'NONE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3162:2: ( 'NONE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3162:4: 'NONE'
                    {
                    match(input,36,FOLLOW_36_in_ruleCombineOperator6082); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3168:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3168:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3168:8: '+'
                    {
                    match(input,37,FOLLOW_37_in_ruleCombineOperator6097); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3174:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3174:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3174:8: '*'
                    {
                    match(input,38,FOLLOW_38_in_ruleCombineOperator6112); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3180:6: ( 'AND' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3180:6: ( 'AND' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3180:8: 'AND'
                    {
                    match(input,39,FOLLOW_39_in_ruleCombineOperator6127); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:6: ( 'OR' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:6: ( 'OR' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3186:8: 'OR'
                    {
                    match(input,40,FOLLOW_40_in_ruleCombineOperator6142); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3192:6: ( 'hostCombineOperator' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3192:6: ( 'hostCombineOperator' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3192:8: 'hostCombineOperator'
                    {
                    match(input,41,FOLLOW_41_in_ruleCombineOperator6157); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3202:1: ruleValueType returns [Enumerator current=null] : ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3206:6: ( ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3207:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3207:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            case 45:
                {
                alt22=4;
                }
                break;
            case 46:
                {
                alt22=5;
                }
                break;
            case 47:
                {
                alt22=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3207:1: ( ( 'PURE' ) | ( 'boolean' ) | ( 'unsigned' ) | ( 'integer' ) | ( 'float' ) | ( 'hostType' ) )", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3207:2: ( 'PURE' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3207:2: ( 'PURE' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3207:4: 'PURE'
                    {
                    match(input,42,FOLLOW_42_in_ruleValueType6200); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3213:6: ( 'boolean' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3213:6: ( 'boolean' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3213:8: 'boolean'
                    {
                    match(input,43,FOLLOW_43_in_ruleValueType6215); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3219:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3219:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3219:8: 'unsigned'
                    {
                    match(input,44,FOLLOW_44_in_ruleValueType6230); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3225:6: ( 'integer' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3225:6: ( 'integer' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3225:8: 'integer'
                    {
                    match(input,45,FOLLOW_45_in_ruleValueType6245); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEGEREnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3231:8: 'float'
                    {
                    match(input,46,FOLLOW_46_in_ruleValueType6260); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3237:6: ( 'hostType' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3237:6: ( 'hostType' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3237:8: 'hostType'
                    {
                    match(input,47,FOLLOW_47_in_ruleValueType6275); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3247:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3251:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3252:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3252:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt23=1;
                }
                break;
            case 49:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3252:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3252:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3252:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3252:4: '-->'
                    {
                    match(input,48,FOLLOW_48_in_ruleTransitionType6318); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3258:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3258:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3258:8: 'o->'
                    {
                    match(input,49,FOLLOW_49_in_ruleTransitionType6333); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3264:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3264:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:3264:8: '>->'
                    {
                    match(input,50,FOLLOW_50_in_ruleTransitionType6348); if (failed) return current;
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

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:3: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:3: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:4: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:4: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:5: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:174:5: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:176:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred1315); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:195:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:197:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred1349); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:216:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:219:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred1397);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred1410); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:241:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:244:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_0_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred1444);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:263:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:265:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred2478); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:284:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:286:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred2512); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:305:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:308:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred2560);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred2573); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:331:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:333:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred3603); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:352:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:354:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred3637); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:373:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:376:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred3685);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:394:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:397:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_2_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred3723);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:6: ( ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:7: ( ( 'init' ) ( 'final' ) ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:416:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:418:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred4757); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:437:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:439:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred4791); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred4814); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:462:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:465:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_3_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred4848);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:7: ( ( 'init' ) ( 'final' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:484:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:486:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred5882); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:505:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:507:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred5916); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:526:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:529:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred5964);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:6: ( ( ( ( 'init' ) ( 'final' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:6: ( ( ( 'init' ) ( 'final' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:7: ( ( 'init' ) ( 'final' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:548:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:550:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred6998); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:569:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:571:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred61032); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred61055); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: ( ( ( ( 'init' ) ( 'final' ) ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:6: ( ( ( 'init' ) ( 'final' ) ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:7: ( ( 'init' ) ( 'final' ) ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:7: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:8: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:595:8: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:597:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred71085); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:616:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:618:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred71119); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:637:3: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:640:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_6_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred71167);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:6: ( ( ( 'init' ) ( 'final' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:6: ( ( 'init' ) ( 'final' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:6: ( ( 'init' ) ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:7: ( 'init' ) ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:659:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:661:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred81200); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:680:2: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:682:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred81234); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:702:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:704:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred91277); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:723:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:725:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred91311); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:744:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:747:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_8_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred91359);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred91372); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:769:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:772:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_8_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred91406);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:791:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:793:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred101440); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:812:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:814:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred101474); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:833:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:836:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_9_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred101522);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred101535); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:859:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:861:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred111565); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:880:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:882:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred111599); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:901:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:904:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_10_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred111647);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:922:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:925:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_10_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred111685);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:6: ( ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:7: ( ( 'final' ) ( 'init' ) ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:944:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:946:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred121719); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:965:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:967:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred121753); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred121776); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:990:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:993:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_11_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred121810);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred13
    public final void synpred13_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:7: ( ( 'final' ) ( 'init' ) ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1012:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1014:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred131844); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1033:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1035:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred131878); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1054:3: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1057:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_12_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred131926);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:6: ( ( ( ( 'final' ) ( 'init' ) ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:6: ( ( ( 'final' ) ( 'init' ) ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:7: ( ( 'final' ) ( 'init' ) ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1076:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1078:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred141960); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1097:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1099:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred141994); if (failed) return ;

        }


        }

        match(input,14,FOLLOW_14_in_synpred142017); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: ( ( ( ( 'final' ) ( 'init' ) ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:6: ( ( ( 'final' ) ( 'init' ) ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:7: ( ( 'final' ) ( 'init' ) ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:7: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:8: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1123:8: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1125:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred152047); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1144:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1146:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred152081); if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1165:3: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1168:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_14_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred152129);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:6: ( ( ( 'final' ) ( 'init' ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:6: ( ( 'final' ) ( 'init' ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:6: ( ( 'final' ) ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:7: ( 'final' ) ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1187:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1189:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred162162); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1208:2: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1210:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred162196); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:6: ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:6: ( ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:7: ( 'init' ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1230:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1232:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred172238); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1251:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1254:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_16_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred172285);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred172298); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1276:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1279:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_16_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred172332);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred18
    public final void synpred18_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:6: ( ( ( 'init' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:6: ( ( 'init' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:7: ( 'init' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1298:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1300:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred182365); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1319:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1322:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_17_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred182412);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred182425); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred18

    // $ANTLR start synpred19
    public final void synpred19_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:6: ( ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:6: ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:6: ( ( 'init' ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:7: ( 'init' ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1345:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1347:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred192454); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1366:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1369:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_18_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred192501);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1387:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1390:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_18_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred192539);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19

    // $ANTLR start synpred20
    public final void synpred20_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:6: ( ( ( 'init' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:6: ( ( 'init' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:6: ( ( 'init' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:7: ( 'init' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1409:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1411:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred202572); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred202594); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1434:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1437:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_19_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred202628);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:6: ( ( ( 'init' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:6: ( ( 'init' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:6: ( ( 'init' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:7: ( 'init' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1456:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1458:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred212661); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1477:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1480:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_20_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred212708);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:6: ( ( ( 'init' ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:6: ( ( 'init' ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:6: ( ( 'init' ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:7: ( 'init' ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1499:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1501:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred222741); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred222763); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: ( ( ( 'init' ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: ( ( 'init' ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:6: ( ( 'init' ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:7: ( 'init' ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1525:7: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1527:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred232792); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1546:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1549:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_22_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred232839);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:6: ( ( 'init' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:6: ( 'init' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1568:6: ( 'init' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1570:6: 'init'
        {
        match(input,12,FOLLOW_12_in_synpred242871); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:6: ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:6: ( ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:7: ( 'final' ) ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1590:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1592:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred252912); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1611:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1614:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_24_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred252959);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred252972); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1636:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1639:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_24_3_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred253006);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:6: ( ( ( 'final' ) ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:6: ( ( 'final' ) ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:7: ( 'final' ) ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1658:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1660:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred263039); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1679:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1682:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_25_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred263086);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred263099); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:6: ( ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:6: ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:6: ( ( 'final' ) ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:7: ( 'final' ) ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1705:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1707:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred273128); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1726:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1729:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_26_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred273175);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1747:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1750:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_26_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred273213);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:6: ( ( ( 'final' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:7: ( 'final' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1769:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1771:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred283246); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred283268); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1794:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1797:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_27_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred283302);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred28

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:6: ( ( ( 'final' ) ( ruleStateType ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:6: ( ( 'final' ) ( ruleStateType ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:6: ( ( 'final' ) ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:7: ( 'final' ) ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1816:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1818:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred293335); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1837:2: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1840:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_28_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred293382);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred30
    public final void synpred30_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:6: ( ( ( 'final' ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:6: ( ( 'final' ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:7: ( 'final' ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1859:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1861:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred303415); if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred303437); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1884:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1887:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_29_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred303471);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred30

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:6: ( ( ( 'final' ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:6: ( ( 'final' ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:6: ( ( 'final' ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:7: ( 'final' ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1906:7: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1908:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred313504); if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1927:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1930:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_30_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred313551);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1949:6: ( ( 'final' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1949:6: ( 'final' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1949:6: ( 'final' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1951:6: 'final'
        {
        match(input,13,FOLLOW_13_in_synpred323583); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred32

    // $ANTLR start synpred33
    public final void synpred33_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( ( ( ruleStateType ) 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( ( ruleStateType ) 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:6: ( ( ruleStateType ) 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:7: ( ruleStateType ) 'state' ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1971:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1974:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_32_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred333637);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred333650); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1996:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:1999:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_32_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred333684);
        ruleFullStateID();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:6: ( ( ( ruleStateType ) 'state' ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:6: ( ( ruleStateType ) 'state' )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:6: ( ( ruleStateType ) 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:7: ( ruleStateType ) 'state'
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2018:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2021:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_33_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred343730);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        match(input,14,FOLLOW_14_in_synpred343743); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:6: ( ( ( ruleStateType ) ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:6: ( ( ruleStateType ) ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:6: ( ( ruleStateType ) ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:7: ( ruleStateType ) ( ruleFullStateID )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2044:7: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2047:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_34_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred353785);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }

        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2065:2: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2068:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_34_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred353823);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2087:6: ( ( ruleStateType ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2087:6: ( ruleStateType )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2087:6: ( ruleStateType )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2090:6: ruleStateType
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_1_35_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleStateType_in_synpred363868);
        ruleStateType();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred37
    public final void synpred37_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:6: ( ( 'state' ( ruleFullStateID ) ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:6: ( 'state' ( ruleFullStateID ) )
        {
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:6: ( 'state' ( ruleFullStateID ) )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2109:7: 'state' ( ruleFullStateID )
        {
        match(input,14,FOLLOW_14_in_synpred373888); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2113:1: ( ruleFullStateID )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2116:6: ruleFullStateID
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getIdFullStateIDParserRuleCall_1_36_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleFullStateID_in_synpred373922);
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
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2135:6: ( 'state' )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2135:6: 'state'
        {
        match(input,14,FOLLOW_14_in_synpred383942); if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2163:6: ( RULE_STRING )
        // ../de.cau.cs.kieler.synccharts.dsl.kits/src-gen/de/cau/cs/kieler/synccharts/dsl/parser/antlr/internal/InternalKits.g:2163:6: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred394009); if (failed) return ;

        }
    }
    // $ANTLR end synpred39

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegion146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleState_in_ruleRegion189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState283 = new BitSet(new long[]{0x0000000E00007010L});
    public static final BitSet FOLLOW_12_in_ruleState315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState349 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState397 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState444 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState478 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState512 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState560 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState573 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState637 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState723 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState757 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState848 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState882 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState916 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState964 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1032 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1055 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState1085 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1167 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState1200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState1234 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1277 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1311 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1406 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1440 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1474 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1522 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1535 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1599 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1685 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState1776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState1810 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1844 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1878 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState1926 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState1960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState1994 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2017 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2047 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState2081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2129 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState2196 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2238 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2332 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2365 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2425 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2454 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2539 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2628 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2661 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2708 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2741 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2763 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState2839 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_12_in_ruleState2871 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState2912 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2959 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState2972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3006 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3039 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3086 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3099 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3128 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3213 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3302 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3335 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3382 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3415 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3471 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3551 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_13_in_ruleState3583 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3637 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3684 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3743 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3823 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState3868 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_14_in_ruleState3888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3922 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_14_in_ruleState3942 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleState3982 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState4009 = new BitSet(new long[]{0x0007000000008032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState4040 = new BitSet(new long[]{0x0007000000008012L});
    public static final BitSet FOLLOW_15_in_ruleState4059 = new BitSet(new long[]{0x00000000180F0800L});
    public static final BitSet FOLLOW_16_in_ruleState4070 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4104 = new BitSet(new long[]{0x00000000182F0800L});
    public static final BitSet FOLLOW_17_in_ruleState4125 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4159 = new BitSet(new long[]{0x00000000182F0800L});
    public static final BitSet FOLLOW_18_in_ruleState4180 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4214 = new BitSet(new long[]{0x00000000182F0800L});
    public static final BitSet FOLLOW_19_in_ruleState4235 = new BitSet(new long[]{0x0007000000400070L});
    public static final BitSet FOLLOW_ruleAction_in_ruleState4269 = new BitSet(new long[]{0x00000000182F0800L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleState4314 = new BitSet(new long[]{0x00000000182F0800L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4359 = new BitSet(new long[]{0x00000000183F0800L});
    public static final BitSet FOLLOW_20_in_ruleState4373 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleRegion_in_ruleState4407 = new BitSet(new long[]{0x00000000183F0800L});
    public static final BitSet FOLLOW_21_in_ruleState4425 = new BitSet(new long[]{0x0007000000000012L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState4461 = new BitSet(new long[]{0x0007000000000012L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction4499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAction4556 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAction4593 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAction4610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleAction4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVariable4749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4771 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable4790 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVariable4845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable4867 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariable4884 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleVariable4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal4957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSignal5014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28_in_ruleSignal5054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5090 = new BitSet(new long[]{0x0000000026000002L});
    public static final BitSet FOLLOW_25_in_ruleSignal5109 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSignal5164 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5198 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSignal5211 = new BitSet(new long[]{0x000003F000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignal5304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5326 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSignal5343 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignal5398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal5420 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSignal5437 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleValueType_in_ruleSignal5471 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSignal5484 = new BitSet(new long[]{0x000003F000000020L});
    public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition5658 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition5696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_ruleTransition5727 = new BitSet(new long[]{0x00000000C0800000L});
    public static final BitSet FOLLOW_30_in_ruleTransition5740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition5762 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_ruleTransition5793 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTransition5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullStateID_in_entryRuleFullStateID5850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullStateID5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID5902 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFullStateID5920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullStateID5937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStateType5994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStateType6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStateType6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStateType6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCombineOperator6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCombineOperator6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCombineOperator6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCombineOperator6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCombineOperator6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCombineOperator6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleValueType6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleValueType6215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleValueType6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleValueType6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValueType6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleValueType6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTransitionType6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTransitionType6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTransitionType6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred1315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred1349 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred1397 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred1410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred2478 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred2512 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred2560 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred3603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred3637 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred3685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred4757 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred4791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred4814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred5882 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred5916 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred6998 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred61032 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred61055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred71085 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred71119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred71167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred81200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred81234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred91277 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred91311 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred91359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred91372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred91406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred101440 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred101474 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred101522 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred101535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred111565 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred111599 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred111647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred111685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred121719 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred121753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred121776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred121810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred131844 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred131878 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred131926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred141960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred141994 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred142017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred152047 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred152081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred152129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred162162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_synpred162196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred172238 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred172285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred172298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred172332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred182365 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred182412 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred182425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred192454 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred192501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred192539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred202572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred202594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred202628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred212661 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred212708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred222741 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred222763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred232792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred232839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred242871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred252912 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred252959 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred252972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred253006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred263039 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred263086 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred263099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred273128 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred273175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred273213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred283246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred283268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred283302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred293335 = new BitSet(new long[]{0x0000000E00004000L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred293382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred303415 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred303437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred303471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred313504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred313551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred323583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred333637 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred333650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred333684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred343730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_synpred343743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred353785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred353823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_synpred363868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred373888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullStateID_in_synpred373922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_synpred383942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred394009 = new BitSet(new long[]{0x0000000000000002L});

}